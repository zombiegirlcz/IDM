package androidx.compose.ui.platform;

import a41.g0;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.StrictMode;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.retain.ForgetfulRetainedValuesStore;
import androidx.compose.runtime.retain.RetainedValuesStore;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.R$id;
import androidx.compose.ui.SessionMutex;
import androidx.compose.ui.autofill.AndroidAutofill;
import androidx.compose.ui.autofill.AndroidAutofillManager;
import androidx.compose.ui.autofill.AndroidAutofill_androidKt;
import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillCallback;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.autofill.PlatformAutofillManagerImpl;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.draganddrop.AndroidDragAndDropManager;
import androidx.compose.ui.draganddrop.ComposeDragShadowBuilder;
import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusInteropUtils_androidKt;
import androidx.compose.ui.focus.FocusListener;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusOwnerImplKt;
import androidx.compose.ui.focus.FocusTargetModifierNode;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.focus.PlatformFocusOwner;
import androidx.compose.ui.focus.TwoDimensionalFocusSearchKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidGraphicsContext_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.ui.input.InputMode;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.InputModeManagerImpl;
import androidx.compose.ui.input.indirect.AndroidIndirectPointerEvent;
import androidx.compose.ui.input.indirect.IndirectPointerEvent;
import androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis;
import androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.pointer.MatrixPositionCalculator;
import androidx.compose.ui.input.pointer.MotionEventAdapter;
import androidx.compose.ui.input.pointer.PointerIcon;
import androidx.compose.ui.input.pointer.PointerIconService;
import androidx.compose.ui.input.pointer.PointerInputEvent;
import androidx.compose.ui.input.pointer.PointerInputEventData;
import androidx.compose.ui.input.pointer.PointerInputEventProcessor;
import androidx.compose.ui.input.pointer.PointerInputEventProcessorKt;
import androidx.compose.ui.input.pointer.PointerKeyboardModifiers;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.InsetsListener;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.layout.RectRulers;
import androidx.compose.ui.layout.RootMeasurePolicy;
import androidx.compose.ui.layout.RulerScope;
import androidx.compose.ui.layout.WindowInsetsRulerProvider;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.MeasureAndLayoutDelegate;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.OutOfFrameExecutor;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.RootForTest;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidComposeView.RootModifierNode;
import androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner;
import androidx.compose.ui.relocation.BringIntoViewModifierNode;
import androidx.compose.ui.scrollcapture.ScrollCapture;
import androidx.compose.ui.semantics.EmptySemanticsModifier;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.spatial.RectManager;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyResolver_androidKt;
import androidx.compose.ui.text.input.PlatformTextInputService;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputServiceAndroid;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.os.SavedStateRegistryOwner;
import androidx.os.ViewTreeSavedStateRegistryOwner;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ip0.v7;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import yhm.w;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000¨\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f*\u0002\u0091\u0005\b\u0001\u0018\u0000 Ñ\u00052\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b:\u0006Ñ\u0005Ò\u0005Ó\u0005B\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J4\u0010&\u001a\u00020$2\"\u0010%\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#\u0012\u0006\u0012\u0004\u0018\u00010\"0!H\u0096@¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J?\u00102\u001a\u00020\u001e2\u001e\u0010/\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010-\u0018\u00010,j\f\u0012\u0006\u0012\u0004\u0018\u00010-\u0018\u0001`.2\u0006\u00100\u001a\u00020\u00122\u0006\u00101\u001a\u00020\u0012H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\u001e2\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J-\u0010>\u001a\u00020\u001e2\u0006\u00108\u001a\u00020(2\u0006\u0010:\u001a\u0002092\f\u0010=\u001a\b\u0012\u0004\u0012\u00020<0;H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010B\u001a\u00020\u001e2\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u00020\u001e2\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bD\u0010CJ#\u0010F\u001a\u0004\u0018\u00010-2\b\u0010E\u001a\u0004\u0018\u00010-2\u0006\u00100\u001a\u00020\u0012H\u0016¢\u0006\u0004\bF\u0010GJ\u001f\u0010I\u001a\u00020\u00172\u0006\u00100\u001a\u00020\u00122\b\u0010H\u001a\u0004\u0018\u00010(¢\u0006\u0004\bI\u0010JJ\u001f\u0010K\u001a\u00020\u00172\u0006\u00100\u001a\u00020\u00122\b\u0010H\u001a\u0004\u0018\u00010(¢\u0006\u0004\bK\u0010JJ\u001f\u0010L\u001a\u00020\u00172\u0006\u00100\u001a\u00020\u00122\b\u0010H\u001a\u0004\u0018\u00010(¢\u0006\u0004\bL\u0010JJ!\u0010M\u001a\u00020\u00172\u0006\u00100\u001a\u00020\u00122\b\u0010H\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\bM\u0010JJ#\u0010P\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010H\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\bN\u0010OJ\u000f\u0010Q\u001a\u00020\u001eH\u0016¢\u0006\u0004\bQ\u0010 J)\u0010S\u001a\u00020\u001e2\u0006\u0010R\u001a\u00020\u00172\u0006\u00100\u001a\u00020\u00122\b\u0010H\u001a\u0004\u0018\u00010(H\u0014¢\u0006\u0004\bS\u0010TJ#\u0010S\u001a\u00020\u001e2\b\u0010V\u001a\u0004\u0018\u00010U2\b\u0010W\u001a\u0004\u0018\u00010UH\u0016¢\u0006\u0004\bS\u0010XJ\u0017\u0010Z\u001a\u00020\u001e2\u0006\u0010Y\u001a\u00020\u0017H\u0016¢\u0006\u0004\bZ\u0010[J\u0017\u0010^\u001a\u00020\u00172\u0006\u0010]\u001a\u00020\\H\u0016¢\u0006\u0004\b^\u0010_J\u0017\u0010`\u001a\u00020\u00172\u0006\u0010]\u001a\u00020\\H\u0016¢\u0006\u0004\b`\u0010_J\u0017\u0010c\u001a\u00020\u001e2\u0006\u0010b\u001a\u00020aH\u0016¢\u0006\u0004\bc\u0010dJ\u0017\u0010g\u001a\u00020\u001e2\u0006\u0010f\u001a\u00020eH\u0016¢\u0006\u0004\bg\u0010hJ\u0017\u0010i\u001a\u00020\u001e2\u0006\u0010f\u001a\u00020eH\u0016¢\u0006\u0004\bi\u0010hJ\u0017\u0010j\u001a\u00020\u001e2\u0006\u0010f\u001a\u00020eH\u0016¢\u0006\u0004\bj\u0010hJ\u0017\u0010k\u001a\u00020\u001e2\u0006\u0010f\u001a\u00020eH\u0016¢\u0006\u0004\bk\u0010hJ\r\u0010l\u001a\u00020\u001e¢\u0006\u0004\bl\u0010 J\u000f\u0010m\u001a\u00020\u001eH\u0016¢\u0006\u0004\bm\u0010 J\u001d\u0010p\u001a\u00020\u001e2\f\u0010o\u001a\b\u0012\u0004\u0012\u00020\u001e0nH\u0016¢\u0006\u0004\bp\u0010qJ\u0019\u0010s\u001a\u00020\u001e2\b\u0010r\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\bs\u0010tJ!\u0010s\u001a\u00020\u001e2\b\u0010r\u001a\u0004\u0018\u00010-2\u0006\u0010u\u001a\u00020\u0012H\u0016¢\u0006\u0004\bs\u0010vJ)\u0010s\u001a\u00020\u001e2\b\u0010r\u001a\u0004\u0018\u00010-2\u0006\u0010w\u001a\u00020\u00122\u0006\u0010x\u001a\u00020\u0012H\u0016¢\u0006\u0004\bs\u0010yJ#\u0010s\u001a\u00020\u001e2\b\u0010r\u001a\u0004\u0018\u00010-2\b\u0010{\u001a\u0004\u0018\u00010zH\u0016¢\u0006\u0004\bs\u0010|J+\u0010s\u001a\u00020\u001e2\b\u0010r\u001a\u0004\u0018\u00010-2\u0006\u0010u\u001a\u00020\u00122\b\u0010{\u001a\u0004\u0018\u00010zH\u0016¢\u0006\u0004\bs\u0010}J!\u0010\u0081\u0001\u001a\u00020\u001e2\u0006\u0010\u007f\u001a\u00020~2\u0007\u0010\u0080\u0001\u001a\u00020e¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u0018\u0010\u0083\u0001\u001a\u00020\u001e2\u0006\u0010\u007f\u001a\u00020~¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\"\u0010\u0087\u0001\u001a\u00020\u001e2\u0006\u0010\u007f\u001a\u00020~2\b\u0010\u0086\u0001\u001a\u00030\u0085\u0001¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u001a\u0010\u008a\u0001\u001a\u00020\u001e2\u0007\u0010\u0089\u0001\u001a\u00020\u0017H\u0016¢\u0006\u0005\b\u008a\u0001\u0010[J%\u0010\u008a\u0001\u001a\u00020\u001e2\u0007\u0010\u0080\u0001\u001a\u00020e2\b\u0010\u008c\u0001\u001a\u00030\u008b\u0001H\u0016¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J$\u0010\u0090\u0001\u001a\u00020\u001e2\u0007\u0010\u0080\u0001\u001a\u00020e2\u0007\u0010\u008f\u0001\u001a\u00020\u0017H\u0016¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J6\u0010\u0094\u0001\u001a\u00020\u001e2\u0007\u0010\u0080\u0001\u001a\u00020e2\u0007\u0010\u008f\u0001\u001a\u00020\u00172\u0007\u0010\u0092\u0001\u001a\u00020\u00172\u0007\u0010\u0093\u0001\u001a\u00020\u0017H\u0016¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J-\u0010\u0096\u0001\u001a\u00020\u001e2\u0007\u0010\u0080\u0001\u001a\u00020e2\u0007\u0010\u008f\u0001\u001a\u00020\u00172\u0007\u0010\u0092\u0001\u001a\u00020\u0017H\u0016¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u001a\u0010\u0098\u0001\u001a\u00020\u001e2\u0007\u0010\u0080\u0001\u001a\u00020eH\u0016¢\u0006\u0005\b\u0098\u0001\u0010hJ\u001e\u0010\u009b\u0001\u001a\u00020\u001e2\n\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u0099\u0001H\u0016¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J$\u0010\u009f\u0001\u001a\u00020\u001e2\u0007\u0010\u009d\u0001\u001a\u00020\u00122\u0007\u0010\u009e\u0001\u001a\u00020\u0012H\u0014¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J?\u0010¦\u0001\u001a\u00020\u001e2\u0007\u0010¡\u0001\u001a\u00020\u00172\u0007\u0010¢\u0001\u001a\u00020\u00122\u0007\u0010£\u0001\u001a\u00020\u00122\u0007\u0010¤\u0001\u001a\u00020\u00122\u0007\u0010¥\u0001\u001a\u00020\u0012H\u0014¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u001c\u0010¨\u0001\u001a\u00020\u001e2\b\u0010\u0086\u0001\u001a\u00030\u0085\u0001H\u0014¢\u0006\u0006\b¨\u0001\u0010©\u0001JM\u0010°\u0001\u001a\u00030¯\u00012\u001d\u0010¬\u0001\u001a\u0018\u0012\u0005\u0012\u00030ª\u0001\u0012\u0007\u0012\u0005\u0018\u00010«\u0001\u0012\u0004\u0012\u00020\u001e0!2\r\u0010\u00ad\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0n2\n\u0010®\u0001\u001a\u0005\u0018\u00010«\u0001H\u0016¢\u0006\u0006\b°\u0001\u0010±\u0001J\u001c\u0010µ\u0001\u001a\u00020\u00172\b\u0010²\u0001\u001a\u00030¯\u0001H\u0000¢\u0006\u0006\b³\u0001\u0010´\u0001J\u0011\u0010¶\u0001\u001a\u00020\u001eH\u0016¢\u0006\u0005\b¶\u0001\u0010 J\u001a\u0010·\u0001\u001a\u00020\u001e2\u0007\u0010\u0080\u0001\u001a\u00020eH\u0016¢\u0006\u0005\b·\u0001\u0010hJ\u001a\u0010¸\u0001\u001a\u00020\u001e2\u0007\u0010\u0080\u0001\u001a\u00020eH\u0016¢\u0006\u0005\b¸\u0001\u0010hJ$\u0010º\u0001\u001a\u00020\u001e2\u0007\u0010\u0080\u0001\u001a\u00020e2\u0007\u0010¹\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0006\bº\u0001\u0010»\u0001J$\u0010¼\u0001\u001a\u00020\u001e2\u0007\u0010\u0080\u0001\u001a\u00020e2\u0007\u0010¹\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0006\b¼\u0001\u0010»\u0001J\u001e\u0010¾\u0001\u001a\u00020\u001e2\u000b\u0010\u007f\u001a\u00070-j\u0003`½\u0001H\u0016¢\u0006\u0005\b¾\u0001\u0010tJ\u001c\u0010¿\u0001\u001a\u00020\u001e2\b\u0010\u0086\u0001\u001a\u00030\u0085\u0001H\u0014¢\u0006\u0006\b¿\u0001\u0010©\u0001J%\u0010Ã\u0001\u001a\u00020\u001e2\b\u0010²\u0001\u001a\u00030¯\u00012\u0007\u0010À\u0001\u001a\u00020\u0017H\u0000¢\u0006\u0006\bÁ\u0001\u0010Â\u0001J'\u0010Ç\u0001\u001a\u00020\u001e2\u0015\u0010Æ\u0001\u001a\u0010\u0012\u0005\u0012\u00030Å\u0001\u0012\u0004\u0012\u00020\u001e0Ä\u0001¢\u0006\u0006\bÇ\u0001\u0010È\u0001J\u0013\u0010É\u0001\u001a\u00020\u001eH\u0086@¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001J\u0013\u0010Ë\u0001\u001a\u00020\u001eH\u0086@¢\u0006\u0006\bË\u0001\u0010Ê\u0001J\u0011\u0010Ì\u0001\u001a\u00020\u001eH\u0016¢\u0006\u0005\bÌ\u0001\u0010 J\u0011\u0010Í\u0001\u001a\u00020\u001eH\u0014¢\u0006\u0005\bÍ\u0001\u0010 J\u0011\u0010Î\u0001\u001a\u00020\u001eH\u0014¢\u0006\u0005\bÎ\u0001\u0010 J%\u0010Ð\u0001\u001a\u00020\u001e2\b\u00105\u001a\u0004\u0018\u0001042\u0007\u0010Ï\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0006\bÐ\u0001\u0010Ñ\u0001J#\u0010Õ\u0001\u001a\u00020\u001e2\u000f\u0010Ô\u0001\u001a\n\u0012\u0005\u0012\u00030Ó\u00010Ò\u0001H\u0016¢\u0006\u0006\bÕ\u0001\u0010Ö\u0001J8\u0010Ý\u0001\u001a\u00020\u001e2\b\u0010Ø\u0001\u001a\u00030×\u00012\b\u0010Ú\u0001\u001a\u00030Ù\u00012\u0010\u0010Ü\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010Û\u00010;H\u0017¢\u0006\u0006\bÝ\u0001\u0010Þ\u0001J%\u0010â\u0001\u001a\u00020\u001e2\u0011\u0010á\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010à\u00010ß\u0001H\u0017¢\u0006\u0006\bâ\u0001\u0010ã\u0001J\u001c\u0010æ\u0001\u001a\u00020\u00172\b\u0010å\u0001\u001a\u00030ä\u0001H\u0016¢\u0006\u0006\bæ\u0001\u0010ç\u0001J\u001c\u0010è\u0001\u001a\u00020\u00172\b\u0010å\u0001\u001a\u00030ä\u0001H\u0016¢\u0006\u0006\bè\u0001\u0010ç\u0001J\u0019\u0010é\u0001\u001a\u00020\u00172\u0006\u00100\u001a\u00020\u0012H\u0016¢\u0006\u0005\bé\u0001\u0010\u0019J\u0019\u0010ê\u0001\u001a\u00020\u00172\u0006\u00100\u001a\u00020\u0012H\u0016¢\u0006\u0005\bê\u0001\u0010\u0019J\u001d\u0010ï\u0001\u001a\u00030ë\u00012\b\u0010ì\u0001\u001a\u00030ë\u0001H\u0016¢\u0006\u0006\bí\u0001\u0010î\u0001J\u001c\u0010ï\u0001\u001a\u00020\u001e2\b\u0010ñ\u0001\u001a\u00030ð\u0001H\u0016¢\u0006\u0006\bò\u0001\u0010ó\u0001J\u001d\u0010ö\u0001\u001a\u00030ë\u00012\b\u0010ô\u0001\u001a\u00030ë\u0001H\u0016¢\u0006\u0006\bõ\u0001\u0010î\u0001J\u0012\u0010÷\u0001\u001a\u00020\u0017H\u0016¢\u0006\u0006\b÷\u0001\u0010ø\u0001J\u001f\u0010ü\u0001\u001a\u0005\u0018\u00010û\u00012\b\u0010ú\u0001\u001a\u00030ù\u0001H\u0016¢\u0006\u0006\bü\u0001\u0010ý\u0001J\u001d\u0010\u0080\u0002\u001a\u00030ë\u00012\b\u0010þ\u0001\u001a\u00030ë\u0001H\u0016¢\u0006\u0006\bÿ\u0001\u0010î\u0001J\u001d\u0010\u0082\u0002\u001a\u00030ë\u00012\b\u0010ì\u0001\u001a\u00030ë\u0001H\u0016¢\u0006\u0006\b\u0081\u0002\u0010î\u0001J\u001c\u0010\u0085\u0002\u001a\u00020\u001e2\b\u0010\u0084\u0002\u001a\u00030\u0083\u0002H\u0014¢\u0006\u0006\b\u0085\u0002\u0010\u0086\u0002J\u001b\u0010\u0088\u0002\u001a\u00020\u001e2\u0007\u0010\u0087\u0002\u001a\u00020\u0012H\u0016¢\u0006\u0006\b\u0088\u0002\u0010\u0089\u0002J\u001b\u0010\u008a\u0002\u001a\u00020\u00172\u0007\u0010]\u001a\u00030ä\u0001H\u0016¢\u0006\u0006\b\u008a\u0002\u0010ç\u0001J%\u0010\u008d\u0002\u001a\u00030\u008c\u00022\u0007\u0010]\u001a\u00030ä\u00012\u0007\u0010\u008b\u0002\u001a\u00020\u0012H\u0017¢\u0006\u0006\b\u008d\u0002\u0010\u008e\u0002J\u001b\u0010\u0090\u0002\u001a\u0004\u0018\u00010-2\u0007\u0010\u008f\u0002\u001a\u00020\u0012¢\u0006\u0006\b\u0090\u0002\u0010\u0091\u0002J\u0012\u0010\u0092\u0002\u001a\u00020\u0017H\u0016¢\u0006\u0006\b\u0092\u0002\u0010ø\u0001J \u0010\u0094\u0002\u001a\u00020\u001e2\r\u0010\u0093\u0002\u001a\b\u0012\u0004\u0012\u00020\u001e0nH\u0016¢\u0006\u0005\b\u0094\u0002\u0010qJ\u001c\u0010\u0097\u0002\u001a\u00020\u001e2\b\u0010\u0096\u0002\u001a\u00030\u0095\u0002H\u0017¢\u0006\u0006\b\u0097\u0002\u0010\u0098\u0002J\u001b\u0010\u009b\u0002\u001a\u00020\u001e2\b\u0010\u0099\u0002\u001a\u00030ë\u0001H\u0016¢\u0006\u0005\b\u009a\u0002\u0010dJ\u0011\u0010\u009c\u0002\u001a\u00020\u001eH\u0016¢\u0006\u0005\b\u009c\u0002\u0010 J\u0011\u0010\u009d\u0002\u001a\u00020\u001eH\u0016¢\u0006\u0005\b\u009d\u0002\u0010 J\u001a\u0010\u009f\u0002\u001a\u00020\u001e2\u0007\u0010\u009e\u0002\u001a\u00020\u0017H\u0016¢\u0006\u0005\b\u009f\u0002\u0010[J\u0019\u0010¡\u0002\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0005\b \u0002\u0010\u0019J\u0019\u0010£\u0002\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0005\b¢\u0002\u0010\u0019J\u0019\u0010¥\u0002\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0005\b¤\u0002\u0010\u0019J\u001c\u0010§\u0002\u001a\u0004\u0018\u00010-2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0006\b¦\u0002\u0010\u0091\u0002J\u001c\u0010¨\u0002\u001a\u0004\u0018\u00010-2\u0006\u00100\u001a\u00020\u0012H\u0002¢\u0006\u0006\b¨\u0002\u0010\u0091\u0002J=\u0010±\u0002\u001a\u00020\u00172\b\u0010ª\u0002\u001a\u00030©\u00022\b\u0010¬\u0002\u001a\u00030«\u00022\u0015\u0010®\u0002\u001a\u0010\u0012\u0005\u0012\u00030\u00ad\u0002\u0012\u0004\u0012\u00020\u001e0Ä\u0001H\u0002¢\u0006\u0006\b¯\u0002\u0010°\u0002J\u001b\u0010³\u0002\u001a\u00020\u001e2\u0007\u0010²\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0006\b³\u0002\u0010´\u0002J/\u0010º\u0002\u001a\u00020\u001e2\u0007\u0010µ\u0002\u001a\u00020\u00122\b\u0010·\u0002\u001a\u00030¶\u00022\b\u0010¹\u0002\u001a\u00030¸\u0002H\u0002¢\u0006\u0006\bº\u0002\u0010»\u0002J\u001e\u0010\u0093\u0001\u001a\u00020\u001e2\u000b\b\u0002\u0010¼\u0002\u001a\u0004\u0018\u00010eH\u0002¢\u0006\u0005\b\u0093\u0001\u0010hJ\u0016\u0010½\u0002\u001a\u00020\u0017*\u00020eH\u0002¢\u0006\u0006\b½\u0002\u0010¾\u0002J\u0011\u0010¿\u0002\u001a\u00020\u001eH\u0002¢\u0006\u0005\b¿\u0002\u0010 J%\u0010Ä\u0002\u001a\u00030Á\u00022\u0007\u0010À\u0002\u001a\u00020\u00122\u0007\u0010¥\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0006\bÂ\u0002\u0010Ã\u0002J\u001c\u0010È\u0002\u001a\u00030Á\u00022\u0007\u0010Å\u0002\u001a\u00020\u0012H\u0002¢\u0006\u0006\bÆ\u0002\u0010Ç\u0002J\u0011\u0010É\u0002\u001a\u00020\u001eH\u0002¢\u0006\u0005\bÉ\u0002\u0010 J\u0019\u0010Ê\u0002\u001a\u00020\u001e2\u0006\u0010f\u001a\u00020eH\u0002¢\u0006\u0005\bÊ\u0002\u0010hJ\u0019\u0010Ë\u0002\u001a\u00020\u001e2\u0006\u0010f\u001a\u00020eH\u0002¢\u0006\u0005\bË\u0002\u0010hJ,\u0010Ð\u0002\u001a\u0005\u0018\u00010Ï\u00022\t\u0010Ì\u0002\u001a\u0004\u0018\u00010@2\n\u0010Î\u0002\u001a\u0005\u0018\u00010Í\u0002H\u0002¢\u0006\u0006\bÐ\u0002\u0010Ñ\u0002J\u001c\u0010Ô\u0002\u001a\u00020\u00172\b\u0010Ó\u0002\u001a\u00030Ò\u0002H\u0002¢\u0006\u0006\bÔ\u0002\u0010Õ\u0002J\u001b\u0010Ö\u0002\u001a\u00020\u00172\u0007\u0010]\u001a\u00030ä\u0001H\u0002¢\u0006\u0006\bÖ\u0002\u0010ç\u0001J\u001d\u0010Ú\u0002\u001a\u00030×\u00022\b\u0010å\u0001\u001a\u00030ä\u0001H\u0002¢\u0006\u0006\bØ\u0002\u0010Ù\u0002J%\u0010Ü\u0002\u001a\u00020\u00172\u0007\u0010]\u001a\u00030ä\u00012\b\u0010Û\u0002\u001a\u00030ä\u0001H\u0002¢\u0006\u0006\bÜ\u0002\u0010Ý\u0002J\u001b\u0010Þ\u0002\u001a\u00020\u00172\u0007\u0010]\u001a\u00030ä\u0001H\u0002¢\u0006\u0006\bÞ\u0002\u0010ç\u0001J\u001d\u0010à\u0002\u001a\u00030×\u00022\b\u0010å\u0001\u001a\u00030ä\u0001H\u0002¢\u0006\u0006\bß\u0002\u0010Ù\u0002J9\u0010ä\u0002\u001a\u00020\u001e2\b\u0010å\u0001\u001a\u00030ä\u00012\u0007\u0010á\u0002\u001a\u00020\u00122\u0007\u0010â\u0002\u001a\u00020a2\t\b\u0002\u0010ã\u0002\u001a\u00020\u0017H\u0002¢\u0006\u0006\bä\u0002\u0010å\u0002J\u001c\u0010æ\u0002\u001a\u00020\u00172\b\u0010å\u0001\u001a\u00030ä\u0001H\u0002¢\u0006\u0006\bæ\u0002\u0010ç\u0001J\u0011\u0010ç\u0002\u001a\u00020\u001eH\u0002¢\u0006\u0005\bç\u0002\u0010 J\u001c\u0010ç\u0002\u001a\u00020\u001e2\b\u0010å\u0001\u001a\u00030ä\u0001H\u0002¢\u0006\u0006\bç\u0002\u0010è\u0002J\u0011\u0010é\u0002\u001a\u00020\u001eH\u0002¢\u0006\u0005\bé\u0002\u0010 J\u0011\u0010ê\u0002\u001a\u00020\u001eH\u0002¢\u0006\u0005\bê\u0002\u0010 J\u0011\u0010ë\u0002\u001a\u00020\u001eH\u0002¢\u0006\u0005\bë\u0002\u0010 J\u001c\u0010ì\u0002\u001a\u00020\u001e2\b\u0010\u0084\u0002\u001a\u00030\u0083\u0002H\u0002¢\u0006\u0006\bì\u0002\u0010\u0086\u0002J\u0012\u0010í\u0002\u001a\u00020\u0017H\u0002¢\u0006\u0006\bí\u0002\u0010ø\u0001J\u001b\u0010î\u0002\u001a\u00020\u00172\u0007\u0010]\u001a\u00030ä\u0001H\u0002¢\u0006\u0006\bî\u0002\u0010ç\u0001J\u001b\u0010ï\u0002\u001a\u00020\u00172\u0007\u0010]\u001a\u00030ä\u0001H\u0002¢\u0006\u0006\bï\u0002\u0010ç\u0001J&\u0010ñ\u0002\u001a\u0004\u0018\u00010-2\u0007\u0010\u008f\u0002\u001a\u00020\u00122\u0007\u0010ð\u0002\u001a\u00020-H\u0002¢\u0006\u0006\bñ\u0002\u0010ò\u0002R\u001a\u0010ó\u0002\u001a\u00030ë\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bó\u0002\u0010ô\u0002R\u0019\u0010õ\u0002\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bõ\u0002\u0010ö\u0002R3\u0010ø\u0002\u001a\u0005\u0018\u00010÷\u00028\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\bø\u0002\u0010ù\u0002\u0012\u0005\bþ\u0002\u0010 \u001a\u0006\bú\u0002\u0010û\u0002\"\u0006\bü\u0002\u0010ý\u0002R \u0010\u0080\u0003\u001a\u00030ÿ\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0080\u0003\u0010\u0081\u0003\u001a\u0006\b\u0082\u0003\u0010\u0083\u0003R,\u0010\u0085\u0003\u001a\u0005\u0018\u00010\u0084\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0085\u0003\u0010\u0086\u0003\u001a\u0006\b\u0087\u0003\u0010\u0088\u0003\"\u0006\b\u0089\u0003\u0010\u008a\u0003R\u001c\u0010\u008c\u0003\u001a\u0005\u0018\u00010\u008b\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0003\u0010\u008d\u0003R,\u0010\u008f\u0003\u001a\u00030Ï\u00022\b\u0010\u008e\u0003\u001a\u00030Ï\u00028\u0016@RX\u0096\u000e¢\u0006\u0010\n\u0006\b\u008f\u0003\u0010\u0090\u0003\u001a\u0006\b\u0091\u0003\u0010\u0092\u0003R$\u0010\u0094\u0003\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0n0\u0093\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0003\u0010\u0095\u0003R\u0018\u0010\u0097\u0003\u001a\u00030\u0096\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0003\u0010\u0098\u0003R5\u0010¡\u0003\u001a\u00030\u0099\u00032\b\u0010\u009a\u0003\u001a\u00030\u0099\u00038V@RX\u0096\u008e\u0002¢\u0006\u0018\n\u0006\b\u009b\u0003\u0010\u009c\u0003\u001a\u0006\b\u009d\u0003\u0010\u009e\u0003\"\u0006\b\u009f\u0003\u0010 \u0003R\u0019\u0010¢\u0003\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¢\u0003\u0010£\u0003R\u001f\u0010¤\u0003\u001a\u00020\u00178\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b¤\u0003\u0010ö\u0002\u001a\u0006\b¥\u0003\u0010ø\u0001R\u0018\u0010§\u0003\u001a\u00030¦\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0003\u0010¨\u0003R \u0010ª\u0003\u001a\u00030©\u00038\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bª\u0003\u0010«\u0003\u001a\u0006\b¬\u0003\u0010\u00ad\u0003R0\u0010\u000f\u001a\u00020\u000e2\u0007\u0010\u008e\u0003\u001a\u00020\u000e8\u0016@VX\u0096\u000e¢\u0006\u0017\n\u0005\b\u000f\u0010®\u0003\u001a\u0006\b¯\u0003\u0010°\u0003\"\u0006\b±\u0003\u0010²\u0003R \u0010´\u0003\u001a\u00030³\u00038\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b´\u0003\u0010µ\u0003\u001a\u0006\b¶\u0003\u0010·\u0003R\u0018\u0010¹\u0003\u001a\u00030¸\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0003\u0010º\u0003R\u0019\u0010»\u0003\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0003\u0010ö\u0002R\u0018\u0010½\u0003\u001a\u00030¼\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0003\u0010¾\u0003R \u0010À\u0003\u001a\u00030¿\u00038\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÀ\u0003\u0010Á\u0003\u001a\u0006\bÂ\u0003\u0010Ã\u0003R\u001d\u0010Å\u0003\u001a\u00030Ä\u00038\u0006¢\u0006\u0010\n\u0006\bÅ\u0003\u0010Æ\u0003\u001a\u0006\bÇ\u0003\u0010È\u0003R&\u0010É\u0003\u001a\u00020e8\u0016X\u0096\u0004¢\u0006\u0017\n\u0006\bÉ\u0003\u0010Ê\u0003\u0012\u0005\bÍ\u0003\u0010 \u001a\u0006\bË\u0003\u0010Ì\u0003R&\u0010Ï\u0003\u001a\t\u0012\u0004\u0012\u00020e0Î\u00038\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÏ\u0003\u0010Ð\u0003\u001a\u0006\bÑ\u0003\u0010Ò\u0003R \u0010Ô\u0003\u001a\u00030Ó\u00038\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÔ\u0003\u0010Õ\u0003\u001a\u0006\bÖ\u0003\u0010×\u0003R \u0010Ù\u0003\u001a\u00030Ø\u00038\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÙ\u0003\u0010Ú\u0003\u001a\u0006\bÛ\u0003\u0010Ü\u0003R \u0010Þ\u0003\u001a\u00030Ý\u00038\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÞ\u0003\u0010ß\u0003\u001a\u0006\bà\u0003\u0010á\u0003R\u0018\u0010ã\u0003\u001a\u00030â\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bã\u0003\u0010ä\u0003R*\u0010æ\u0003\u001a\u00030å\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bæ\u0003\u0010ç\u0003\u001a\u0006\bè\u0003\u0010é\u0003\"\u0006\bê\u0003\u0010ë\u0003R \u0010í\u0003\u001a\u00030ì\u00038\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bí\u0003\u0010î\u0003\u001a\u0006\bï\u0003\u0010ð\u0003R \u0010ò\u0003\u001a\u00030ñ\u00038\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bò\u0003\u0010ó\u0003\u001a\u0006\bô\u0003\u0010õ\u0003R \u0010÷\u0003\u001a\u00030ö\u00038\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b÷\u0003\u0010ø\u0003\u001a\u0006\bù\u0003\u0010ú\u0003R\u001f\u0010ü\u0003\u001a\n\u0012\u0005\u0012\u00030¯\u00010û\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bü\u0003\u0010ý\u0003R#\u0010þ\u0003\u001a\f\u0012\u0005\u0012\u00030¯\u0001\u0018\u00010û\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bþ\u0003\u0010ý\u0003R\u0019\u0010ÿ\u0003\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÿ\u0003\u0010ö\u0002R\u0019\u0010\u0080\u0004\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0004\u0010ö\u0002R\u0018\u0010\u0082\u0004\u001a\u00030\u0081\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0004\u0010\u0083\u0004R\u0018\u0010\u0085\u0004\u001a\u00030\u0084\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0004\u0010\u0086\u0004R5\u0010\u008b\u0004\u001a\u00030\u0083\u00022\b\u0010\u009a\u0003\u001a\u00030\u0083\u00028F@FX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\b\u0087\u0004\u0010\u009c\u0003\u001a\u0006\b\u0088\u0004\u0010\u0089\u0004\"\u0006\b\u008a\u0004\u0010\u0086\u0002R\u001a\u0010\u008d\u0004\u001a\u0005\u0018\u00010\u008c\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0004\u0010\u008e\u0004R\"\u0010\u0090\u0004\u001a\u0005\u0018\u00010\u008f\u00048\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0090\u0004\u0010\u0091\u0004\u001a\u0006\b\u0092\u0004\u0010\u0093\u0004R\u0019\u0010\u0094\u0004\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0004\u0010ö\u0002R \u0010\u0096\u0004\u001a\u00030\u0095\u00048\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0096\u0004\u0010\u0097\u0004\u001a\u0006\b\u0098\u0004\u0010\u0099\u0004R \u0010\u009b\u0004\u001a\u00030\u009a\u00048\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u009b\u0004\u0010\u009c\u0004\u001a\u0006\b\u009d\u0004\u0010\u009e\u0004R \u0010 \u0004\u001a\u00030\u009f\u00048\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b \u0004\u0010¡\u0004\u001a\u0006\b¢\u0004\u0010£\u0004R/\u0010¤\u0004\u001a\u00020\u00178V@\u0016X\u0096\u000e¢\u0006\u001e\n\u0006\b¤\u0004\u0010ö\u0002\u0012\u0005\b§\u0004\u0010 \u001a\u0006\b¥\u0004\u0010ø\u0001\"\u0005\b¦\u0004\u0010[R\u001c\u0010©\u0004\u001a\u0005\u0018\u00010¨\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0004\u0010ª\u0004R\u001c\u0010¬\u0004\u001a\u0005\u0018\u00010«\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0004\u0010\u00ad\u0004R\u001c\u0010®\u0004\u001a\u0005\u0018\u00010\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0004\u0010¯\u0004R\u0019\u0010°\u0004\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0004\u0010ö\u0002R\u0018\u0010²\u0004\u001a\u00030±\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b²\u0004\u0010³\u0004R\u001a\u0010µ\u0004\u001a\u00030´\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0004\u0010ô\u0002R\u0018\u0010¶\u0004\u001a\u00030Ù\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0004\u0010·\u0004R\u0018\u0010¸\u0004\u001a\u00030ð\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¸\u0004\u0010¹\u0004R\u0018\u0010º\u0004\u001a\u00030ð\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0004\u0010¹\u0004R\u0018\u0010»\u0004\u001a\u00030ð\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b»\u0004\u0010¹\u0004R/\u0010¼\u0004\u001a\u00020a8\u0000@\u0000X\u0081\u000e¢\u0006\u001e\n\u0006\b¼\u0004\u0010ô\u0002\u0012\u0005\bÀ\u0004\u0010 \u001a\u0006\b½\u0004\u0010¾\u0004\"\u0005\b¿\u0004\u0010dR\u0019\u0010Á\u0004\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0004\u0010ö\u0002R\u001a\u0010Â\u0004\u001a\u00030ë\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0004\u0010ô\u0002R\u0019\u0010Ã\u0004\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÃ\u0004\u0010ö\u0002R9\u0010É\u0004\u001a\u0005\u0018\u00010Å\u00012\n\u0010\u009a\u0003\u001a\u0005\u0018\u00010Å\u00018B@BX\u0082\u008e\u0002¢\u0006\u0018\n\u0006\bÄ\u0004\u0010\u009c\u0003\u001a\u0006\bÅ\u0004\u0010Æ\u0004\"\u0006\bÇ\u0004\u0010È\u0004R#\u0010Í\u0004\u001a\u0005\u0018\u00010Å\u00018FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\bÊ\u0004\u0010Ë\u0004\u001a\u0006\bÌ\u0004\u0010Æ\u0004R)\u0010Î\u0004\u001a\u0012\u0012\u0005\u0012\u00030Å\u0001\u0012\u0004\u0012\u00020\u001e\u0018\u00010Ä\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÎ\u0004\u0010Ï\u0004R\u0018\u0010Ñ\u0004\u001a\u00030Ð\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÑ\u0004\u0010Ò\u0004R'\u0010Ô\u0004\u001a\u00030Ó\u00048\u0016X\u0097\u0004¢\u0006\u0017\n\u0006\bÔ\u0004\u0010Õ\u0004\u0012\u0005\bØ\u0004\u0010 \u001a\u0006\bÖ\u0004\u0010×\u0004R\u001f\u0010Û\u0004\u001a\n\u0012\u0005\u0012\u00030Ú\u00040Ù\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÛ\u0004\u0010Ü\u0004R \u0010Þ\u0004\u001a\u00030Ý\u00048\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÞ\u0004\u0010ß\u0004\u001a\u0006\bà\u0004\u0010á\u0004R'\u0010ã\u0004\u001a\u00030â\u00048\u0016X\u0097\u0004¢\u0006\u0017\n\u0006\bã\u0004\u0010ä\u0004\u0012\u0005\bç\u0004\u0010 \u001a\u0006\bå\u0004\u0010æ\u0004R5\u0010î\u0004\u001a\u00030è\u00042\b\u0010\u009a\u0003\u001a\u00030è\u00048V@RX\u0096\u008e\u0002¢\u0006\u0018\n\u0006\bé\u0004\u0010\u009c\u0003\u001a\u0006\bê\u0004\u0010ë\u0004\"\u0006\bì\u0004\u0010í\u0004R5\u0010\u0087\u0002\u001a\u00030ï\u00042\b\u0010\u009a\u0003\u001a\u00030ï\u00048V@RX\u0096\u008e\u0002¢\u0006\u0018\n\u0006\bð\u0004\u0010\u009c\u0003\u001a\u0006\bñ\u0004\u0010ò\u0004\"\u0006\bó\u0004\u0010ô\u0004R \u0010ö\u0004\u001a\u00030õ\u00048\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bö\u0004\u0010÷\u0004\u001a\u0006\bø\u0004\u0010ù\u0004R\u0018\u0010û\u0004\u001a\u00030ú\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\bû\u0004\u0010ü\u0004R \u0010þ\u0004\u001a\u00030ý\u00048\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bþ\u0004\u0010ÿ\u0004\u001a\u0006\b\u0080\u0005\u0010\u0081\u0005R \u0010\u0083\u0005\u001a\u00030\u0082\u00058\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0083\u0005\u0010\u0084\u0005\u001a\u0006\b\u0085\u0005\u0010\u0086\u0005R\u001c\u0010\u0087\u0005\u001a\u0005\u0018\u00010ä\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0005\u0010\u0088\u0005R\u0019\u0010\u0089\u0005\u001a\u00020a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0005\u0010ô\u0002R\u001f\u0010\u008b\u0005\u001a\n\u0012\u0005\u0012\u00030¯\u00010\u008a\u00058\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0005\u0010\u008c\u0005R&\u0010\u008d\u0005\u001a\u0011\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010n0û\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0005\u0010ý\u0003R\u001a\u0010\u008e\u0005\u001a\u00030\u0095\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0005\u0010\u008f\u0005R\u001a\u0010\u0090\u0005\u001a\u00030\u0095\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0005\u0010\u008f\u0005R\u0018\u0010\u0092\u0005\u001a\u00030\u0091\u00058\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0005\u0010\u0093\u0005R\u0018\u0010\u0094\u0005\u001a\u00030\u0096\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0005\u0010\u0098\u0003R\u0019\u0010\u0095\u0005\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0005\u0010ö\u0002R\u0018\u0010\u0097\u0005\u001a\u00030\u0096\u00058\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0005\u0010\u0098\u0005R\u001d\u0010\u0099\u0005\u001a\b\u0012\u0004\u0012\u00020\u001e0n8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0005\u0010\u009a\u0005R\u0018\u0010\u009c\u0005\u001a\u00030\u009b\u00058\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0005\u0010\u009d\u0005R\u0019\u0010\u009e\u0005\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0005\u0010ö\u0002R\u001a\u0010 \u0005\u001a\u0005\u0018\u00010\u009f\u00058\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0005\u0010¡\u0005R\u001b\u0010¢\u0005\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0005\u0010£\u0003R \u0010¤\u0005\u001a\u00030£\u00058\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¤\u0005\u0010¥\u0005\u001a\u0006\b¦\u0005\u0010§\u0005R\u0016\u0010\u007f\u001a\u00020-8VX\u0096\u0004¢\u0006\b\u001a\u0006\b¨\u0005\u0010©\u0005R\u0018\u0010\u00ad\u0005\u001a\u00030ª\u00058VX\u0096\u0004¢\u0006\b\u001a\u0006\b«\u0005\u0010¬\u0005R,\u0010®\u0005\u001a\u0005\u0018\u00010\u0099\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b®\u0005\u0010¯\u0005\u001a\u0006\b°\u0005\u0010±\u0005\"\u0006\b²\u0005\u0010\u009c\u0001R\u001a\u0010Õ\u0001\u001a\u0005\u0018\u00010³\u00058VX\u0096\u0004¢\u0006\b\u001a\u0006\b´\u0005\u0010µ\u0005R\u001a\u0010¹\u0005\u001a\u0005\u0018\u00010¶\u00058VX\u0096\u0004¢\u0006\b\u001a\u0006\b·\u0005\u0010¸\u0005R\u0018\u0010¼\u0005\u001a\u00030¨\u00048@X\u0080\u0004¢\u0006\b\u001a\u0006\bº\u0005\u0010»\u0005R\u0017\u0010¾\u0005\u001a\u00020a8VX\u0096\u0004¢\u0006\b\u001a\u0006\b½\u0005\u0010¾\u0004R\u0017\u0010À\u0005\u001a\u00020\u00178VX\u0096\u0004¢\u0006\b\u001a\u0006\b¿\u0005\u0010ø\u0001R\u0018\u0010Ä\u0005\u001a\u00030Á\u00058VX\u0096\u0004¢\u0006\b\u001a\u0006\bÂ\u0005\u0010Ã\u0005R\u0018\u0010È\u0005\u001a\u00030Å\u00058VX\u0096\u0004¢\u0006\b\u001a\u0006\bÆ\u0005\u0010Ç\u0005R\u0017\u0010Ê\u0005\u001a\u00020\u00178@X\u0080\u0004¢\u0006\b\u001a\u0006\bÉ\u0005\u0010ø\u0001R\u0019\u0010Í\u0005\u001a\u0004\u0018\u00010\u00008VX\u0096\u0004¢\u0006\b\u001a\u0006\bË\u0005\u0010Ì\u0005R\u001c\u0010Ð\u0005\u001a\u00020\u0012*\u00030\u0083\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\bÎ\u0005\u0010Ï\u0005¨\u0006Ô\u0005"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/view/ViewGroup;", "Landroidx/compose/ui/node/Owner;", "Landroidx/compose/ui/focus/PlatformFocusOwner;", "Landroidx/compose/ui/platform/ViewRootForTest;", "Landroidx/compose/ui/input/pointer/MatrixPositionCalculator;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/compose/ui/node/OutOfFrameExecutor;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;", "Landroidx/compose/ui/focus/FocusListener;", "Landroid/content/Context;", "context", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)V", "", "getImportantForAutofill", "()I", "Landroidx/compose/ui/focus/FocusDirection;", "focusDirection", "", "moveFocusInChildren-3ESFkO8", "(I)Z", "moveFocusInChildren", "Landroidx/compose/ui/geometry/Rect;", "getEmbeddedViewFocusRect", "()Landroidx/compose/ui/geometry/Rect;", "", "focusTargetAvailable", "()V", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "", ib.b.Session, "textInputSession", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/graphics/Rect;", "rect", "getFocusedRect", "(Landroid/graphics/Rect;)V", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "views", "direction", "focusableMode", "addFocusables", "(Ljava/util/ArrayList;II)V", "Landroid/view/ViewStructure;", "structure", "dispatchProvideStructure", "(Landroid/view/ViewStructure;)V", "localVisibleRect", "Landroid/graphics/Point;", "windowOffset", "Ljava/util/function/Consumer;", "Landroid/view/ScrollCaptureTarget;", "targets", "onScrollCaptureSearch", "(Landroid/graphics/Rect;Landroid/graphics/Point;Ljava/util/function/Consumer;)V", "Landroidx/lifecycle/LifecycleOwner;", "owner", "onResume", "(Landroidx/lifecycle/LifecycleOwner;)V", "onStop", "focused", "focusSearch", "(Landroid/view/View;I)Landroid/view/View;", "previouslyFocusedRect", "requestFocusCurrent", "(ILandroid/graphics/Rect;)Z", "requestFocusViewFocusFix", "requestFocusBypassUnfocusableComposeView", "requestFocus", "requestOwnerFocus-7o62pno", "(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", "requestOwnerFocus", "clearOwnerFocus", "gainFocus", "onFocusChanged", "(ZILandroid/graphics/Rect;)V", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "previous", "current", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;Landroidx/compose/ui/focus/FocusTargetModifierNode;)V", "hasWindowFocus", "onWindowFocusChanged", "(Z)V", "Landroid/view/KeyEvent;", "event", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "dispatchKeyEventPreIme", "", "intervalMillis", "setAccessibilityEventBatchIntervalMillis", "(J)V", "Landroidx/compose/ui/node/LayoutNode;", "node", "onPreAttach", "(Landroidx/compose/ui/node/LayoutNode;)V", "onPostAttach", "onDetach", "requestAutofill", "requestClearInvalidObservations", "onEndApplyChanges", "Lkotlin/Function0;", "listener", "registerOnEndApplyChangesListener", "(Lkotlin/jvm/functions/Function0;)V", "child", "addView", "(Landroid/view/View;)V", "index", "(Landroid/view/View;I)V", "width", "height", "(Landroid/view/View;II)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "view", "layoutNode", "addAndroidView", "(Landroidx/compose/ui/viewinterop/AndroidViewHolder;Landroidx/compose/ui/node/LayoutNode;)V", "removeAndroidView", "(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V", "Landroid/graphics/Canvas;", "canvas", "drawAndroidView", "(Landroidx/compose/ui/viewinterop/AndroidViewHolder;Landroid/graphics/Canvas;)V", "sendPointerUpdate", "measureAndLayout", "Landroidx/compose/ui/unit/Constraints;", "constraints", "measureAndLayout-0kLqBqw", "(Landroidx/compose/ui/node/LayoutNode;J)V", "affectsLookahead", "forceMeasureTheSubtree", "(Landroidx/compose/ui/node/LayoutNode;Z)V", "forceRequest", "scheduleMeasureAndLayout", "onRequestMeasure", "(Landroidx/compose/ui/node/LayoutNode;ZZZ)V", "onRequestRelayout", "(Landroidx/compose/ui/node/LayoutNode;ZZ)V", "requestOnPositionedCallback", "Landroidx/compose/ui/node/RootForTest$UncaughtExceptionHandler;", "handler", "setUncaughtExceptionHandler", "(Landroidx/compose/ui/node/RootForTest$UncaughtExceptionHandler;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroidx/compose/ui/graphics/Canvas;", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "drawBlock", "invalidateParentLayer", "explicitLayer", "Landroidx/compose/ui/node/OwnedLayer;", "createLayer", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)Landroidx/compose/ui/node/OwnedLayer;", "layer", "recycle$ui", "(Landroidx/compose/ui/node/OwnedLayer;)Z", "recycle", "onSemanticsChange", "onLayoutChange", "onLayoutNodeDeactivated", "oldSemanticsId", "onPreLayoutNodeReused", "(Landroidx/compose/ui/node/LayoutNode;I)V", "onPostLayoutNodeReused", "Landroidx/compose/ui/viewinterop/InteropView;", "onInteropViewLayoutChange", "dispatchDraw", "isDirty", "notifyLayerIsDirty$ui", "(Landroidx/compose/ui/node/OwnedLayer;Z)V", "notifyLayerIsDirty", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;", "callback", "setOnViewTreeOwnersAvailable", "(Lkotlin/jvm/functions/Function1;)V", "boundsUpdatesContentCaptureEventLoop", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "boundsUpdatesAccessibilityEventLoop", "invalidateDescendants", "onAttachedToWindow", "onDetachedFromWindow", "flags", "onProvideAutofillVirtualStructure", "(Landroid/view/ViewStructure;I)V", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "values", "autofill", "(Landroid/util/SparseArray;)V", "", "virtualIds", "", "supportedFormats", "Landroid/view/translation/ViewTranslationRequest;", "requestsCollector", "onCreateVirtualViewTranslationRequests", "([J[ILjava/util/function/Consumer;)V", "Landroid/util/LongSparseArray;", "Landroid/view/translation/ViewTranslationResponse;", "response", "onVirtualViewTranslationResponses", "(Landroid/util/LongSparseArray;)V", "Landroid/view/MotionEvent;", "motionEvent", "dispatchGenericMotionEvent", "(Landroid/view/MotionEvent;)Z", "dispatchTouchEvent", "canScrollHorizontally", "canScrollVertically", "Landroidx/compose/ui/geometry/Offset;", "localPosition", "localToScreen-MK-Hz9U", "(J)J", "localToScreen", "Landroidx/compose/ui/graphics/Matrix;", "localTransform", "localToScreen-58bKbWc", "([F)V", "positionOnScreen", "screenToLocal-MK-Hz9U", "screenToLocal", "onCheckIsTextEditor", "()Z", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "onCreateInputConnection", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", "positionInWindow", "calculateLocalPosition-MK-Hz9U", "calculateLocalPosition", "calculatePositionInWindow-MK-Hz9U", "calculatePositionInWindow", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "layoutDirection", "onRtlPropertiesChanged", "(I)V", "dispatchHoverEvent", "pointerIndex", "Landroid/view/PointerIcon;", "onResolvePointerIcon", "(Landroid/view/MotionEvent;I)Landroid/view/PointerIcon;", "accessibilityId", "findViewByAccessibilityIdTraversal", "(I)Landroid/view/View;", "shouldDelayChildPressedState", "block", "schedule", "", "frameRate", "voteFrameRate", "(F)V", "delta", "dispatchOnScrollChanged-k-4lQ0M", "dispatchOnScrollChanged", "onGlobalLayout", "onScrollChanged", "isInTouchMode", "onTouchModeChanged", "moveFocusInChildrenCurrent-3ESFkO8", "moveFocusInChildrenCurrent", "moveFocusInChildrenViewFocusFix-3ESFkO8", "moveFocusInChildrenViewFocusFix", "moveFocusInChildrenBypassUnfocusableComposeView-3ESFkO8", "moveFocusInChildrenBypassUnfocusableComposeView", "findNextViewInEmbeddedView-3ESFkO8", "findNextViewInEmbeddedView", "findNextNonChildView", "Landroidx/compose/ui/draganddrop/DragAndDropTransferData;", "transferData", "Landroidx/compose/ui/geometry/Size;", "decorationSize", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawDragDecoration", "startDrag-12SF9DM", "(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", "startDrag", "viewGroup", "clearChildInvalidObservations", "(Landroid/view/ViewGroup;)V", "virtualViewId", "Landroid/view/accessibility/AccessibilityNodeInfo;", "info", "", "extraDataKey", "addExtraDataToAccessibilityNodeInfoHelper", "(ILandroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)V", "nodeToRemeasure", "childSizeCanAffectParentSize", "(Landroidx/compose/ui/node/LayoutNode;)Z", "dispatchPendingInteropLayoutCallbacks", "a", "Lyhm/w;", "pack-ZIaKswc", "(II)J", "pack", "measureSpec", "convertMeasureSpec-I7RO_PI", "(I)J", "convertMeasureSpec", "updatePositionCacheAndDispatch", "invalidateLayoutNodeMeasurement", "invalidateLayers", "lifecycleOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "viewModelStoreOwner", "Landroidx/compose/runtime/retain/RetainedValuesStore;", "installLocalRetainedValuesStore", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/ViewModelStoreOwner;)Landroidx/compose/runtime/retain/RetainedValuesStore;", "Landroidx/compose/ui/input/indirect/IndirectPointerEvent;", "indirectPointerEvent", "handleIndirectPointerEvent", "(Landroidx/compose/ui/input/indirect/IndirectPointerEvent;)Z", "handleRotaryEvent", "Landroidx/compose/ui/input/pointer/ProcessResult;", "handleMotionEvent-8iAsVTc", "(Landroid/view/MotionEvent;)I", "handleMotionEvent", "lastEvent", "hasChangedDevices", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)Z", "isDevicePressEvent", "sendMotionEvent-8iAsVTc", "sendMotionEvent", "action", "eventTime", "forceHover", "sendSimulatedEvent", "(Landroid/view/MotionEvent;IJZ)V", "isInBounds", "recalculateWindowPosition", "(Landroid/view/MotionEvent;)V", "recalculateWindowViewTransforms", "updateWindowMetrics", "dispatchConfigurationChangeIfNeeded", "updateConfiguration", "autofillSupported", "isBadMotionEvent", "isPositionChanged", "currentView", "findViewByAccessibilityIdRootedAtCurrentView", "(ILandroid/view/View;)Landroid/view/View;", "lastDownPointerPosition", "J", "superclassInitComplete", "Z", "Landroidx/compose/ui/input/indirect/IndirectPointerEventPrimaryDirectionalMotionAxis;", "primaryDirectionalMotionAxisOverride", "Landroidx/compose/ui/input/indirect/IndirectPointerEventPrimaryDirectionalMotionAxis;", "getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui", "()Landroidx/compose/ui/input/indirect/IndirectPointerEventPrimaryDirectionalMotionAxis;", "setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui", "(Landroidx/compose/ui/input/indirect/IndirectPointerEventPrimaryDirectionalMotionAxis;)V", "getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "sharedDrawScope", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "getSharedDrawScope", "()Landroidx/compose/ui/node/LayoutNodeDrawScope;", "Landroidx/compose/ui/platform/LifecycleRetainedValuesStoreOwner$FrameEndScheduler;", "frameEndScheduler", "Landroidx/compose/ui/platform/LifecycleRetainedValuesStoreOwner$FrameEndScheduler;", "getFrameEndScheduler$ui", "()Landroidx/compose/ui/platform/LifecycleRetainedValuesStoreOwner$FrameEndScheduler;", "setFrameEndScheduler$ui", "(Landroidx/compose/ui/platform/LifecycleRetainedValuesStoreOwner$FrameEndScheduler;)V", "Landroidx/compose/ui/platform/LifecycleRetainedValuesStoreOwner$RetainedValuesStoreEntry;", "lifecycleRetainedValuesStoreOwnerEntry", "Landroidx/compose/ui/platform/LifecycleRetainedValuesStoreOwner$RetainedValuesStoreEntry;", "value", "retainedValuesStore", "Landroidx/compose/runtime/retain/RetainedValuesStore;", "getRetainedValuesStore", "()Landroidx/compose/runtime/retain/RetainedValuesStore;", "Lkotlin/collections/ArrayDeque;", "outOfFrameQueue", "Lkotlin/collections/ArrayDeque;", "Ljava/lang/Runnable;", "outOfFrameRunnable", "Ljava/lang/Runnable;", "Landroidx/compose/ui/unit/Density;", "<set-?>", "density$delegate", "Landroidx/compose/runtime/MutableState;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "density", "frameRateCategoryView", "Landroid/view/View;", "isArrEnabled", "isArrEnabled$ui", "Landroidx/compose/ui/semantics/EmptySemanticsModifier;", "rootSemanticsNode", "Landroidx/compose/ui/semantics/EmptySemanticsModifier;", "Landroidx/compose/ui/focus/FocusOwner;", "focusOwner", "Landroidx/compose/ui/focus/FocusOwner;", "getFocusOwner", "()Landroidx/compose/ui/focus/FocusOwner;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "setCoroutineContext", "(Lkotlin/coroutines/CoroutineContext;)V", "Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager;", "dragAndDropManager", "Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager;", "getDragAndDropManager", "()Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager;", "Landroidx/compose/ui/platform/LazyWindowInfo;", "_windowInfo", "Landroidx/compose/ui/platform/LazyWindowInfo;", "processingRequestFocusForNextNonChildView", "Landroidx/compose/ui/graphics/CanvasHolder;", "canvasHolder", "Landroidx/compose/ui/graphics/CanvasHolder;", "Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "Landroidx/compose/ui/layout/InsetsListener;", "insetsListener", "Landroidx/compose/ui/layout/InsetsListener;", "getInsetsListener", "()Landroidx/compose/ui/layout/InsetsListener;", "root", "Landroidx/compose/ui/node/LayoutNode;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "getRoot$annotations", "Landroidx/collection/MutableIntObjectMap;", "layoutNodes", "Landroidx/collection/MutableIntObjectMap;", "getLayoutNodes", "()Landroidx/collection/MutableIntObjectMap;", "Landroidx/compose/ui/spatial/RectManager;", "rectManager", "Landroidx/compose/ui/spatial/RectManager;", "getRectManager", "()Landroidx/compose/ui/spatial/RectManager;", "Landroidx/compose/ui/node/RootForTest;", "rootForTest", "Landroidx/compose/ui/node/RootForTest;", "getRootForTest", "()Landroidx/compose/ui/node/RootForTest;", "Landroidx/compose/ui/semantics/SemanticsOwner;", "semanticsOwner", "Landroidx/compose/ui/semantics/SemanticsOwner;", "getSemanticsOwner", "()Landroidx/compose/ui/semantics/SemanticsOwner;", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "composeAccessibilityDelegate", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;", "contentCaptureManager", "Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;", "getContentCaptureManager$ui", "()Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;", "setContentCaptureManager$ui", "(Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;)V", "Landroidx/compose/ui/platform/AndroidAccessibilityManager;", "accessibilityManager", "Landroidx/compose/ui/platform/AndroidAccessibilityManager;", "getAccessibilityManager", "()Landroidx/compose/ui/platform/AndroidAccessibilityManager;", "Landroidx/compose/ui/graphics/GraphicsContext;", "graphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "getGraphicsContext", "()Landroidx/compose/ui/graphics/GraphicsContext;", "Landroidx/compose/ui/autofill/AutofillTree;", "autofillTree", "Landroidx/compose/ui/autofill/AutofillTree;", "getAutofillTree", "()Landroidx/compose/ui/autofill/AutofillTree;", "Landroidx/collection/MutableObjectList;", "dirtyLayers", "Landroidx/collection/MutableObjectList;", "postponedDirtyLayers", "isDrawingContent", "isPendingInteropViewLayoutChangeDispatch", "Landroidx/compose/ui/input/pointer/MotionEventAdapter;", "motionEventAdapter", "Landroidx/compose/ui/input/pointer/MotionEventAdapter;", "Landroidx/compose/ui/input/pointer/PointerInputEventProcessor;", "pointerInputEventProcessor", "Landroidx/compose/ui/input/pointer/PointerInputEventProcessor;", "configuration$delegate", "getConfiguration", "()Landroid/content/res/Configuration;", "setConfiguration", "configuration", "Landroidx/compose/ui/autofill/AndroidAutofill;", "_autofill", "Landroidx/compose/ui/autofill/AndroidAutofill;", "Landroidx/compose/ui/autofill/AndroidAutofillManager;", "_autofillManager", "Landroidx/compose/ui/autofill/AndroidAutofillManager;", "get_autofillManager$ui", "()Landroidx/compose/ui/autofill/AndroidAutofillManager;", "observationClearRequested", "Landroidx/compose/ui/platform/AndroidClipboardManager;", "clipboardManager", "Landroidx/compose/ui/platform/AndroidClipboardManager;", "getClipboardManager", "()Landroidx/compose/ui/platform/AndroidClipboardManager;", "Landroidx/compose/ui/platform/AndroidClipboard;", "clipboard", "Landroidx/compose/ui/platform/AndroidClipboard;", "getClipboard", "()Landroidx/compose/ui/platform/AndroidClipboard;", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "showLayoutBounds", "getShowLayoutBounds", "setShowLayoutBounds", "getShowLayoutBounds$annotations", "Landroidx/compose/ui/platform/AndroidViewsHandler;", "_androidViewsHandler", "Landroidx/compose/ui/platform/AndroidViewsHandler;", "Landroidx/compose/ui/platform/DrawChildContainer;", "viewLayersContainer", "Landroidx/compose/ui/platform/DrawChildContainer;", "onMeasureConstraints", "Landroidx/compose/ui/unit/Constraints;", "wasMeasuredWithMultipleConstraints", "Landroidx/compose/ui/node/MeasureAndLayoutDelegate;", "measureAndLayoutDelegate", "Landroidx/compose/ui/node/MeasureAndLayoutDelegate;", "Landroidx/compose/ui/unit/IntOffset;", "globalPosition", "tmpPositionArray", "[I", "tmpMatrix", "[F", "viewToWindowMatrix", "windowToViewMatrix", "lastMatrixRecalculationAnimationTime", "getLastMatrixRecalculationAnimationTime$ui", "()J", "setLastMatrixRecalculationAnimationTime$ui", "getLastMatrixRecalculationAnimationTime$ui$annotations", "forceUseMatrixCache", "windowPosition", "isRenderNodeCompatible", "_viewTreeOwners$delegate", "get_viewTreeOwners", "()Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;", "set_viewTreeOwners", "(Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;)V", "_viewTreeOwners", "viewTreeOwners$delegate", "Landroidx/compose/runtime/State;", "getViewTreeOwners", "viewTreeOwners", "onViewTreeOwnersAvailable", "Lkotlin/jvm/functions/Function1;", "Landroidx/compose/ui/text/input/TextInputServiceAndroid;", "legacyTextInputServiceAndroid", "Landroidx/compose/ui/text/input/TextInputServiceAndroid;", "Landroidx/compose/ui/text/input/TextInputService;", "textInputService", "Landroidx/compose/ui/text/input/TextInputService;", "getTextInputService", "()Landroidx/compose/ui/text/input/TextInputService;", "getTextInputService$annotations", "Landroidx/compose/ui/SessionMutex;", "Landroidx/compose/ui/platform/AndroidPlatformTextInputSession;", "textInputSessionMutex", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "softwareKeyboardController", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "getSoftwareKeyboardController", "()Landroidx/compose/ui/platform/SoftwareKeyboardController;", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "fontLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getFontLoader", "()Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getFontLoader$annotations", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver$delegate", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "setFontFamilyResolver", "(Landroidx/compose/ui/text/font/FontFamily$Resolver;)V", "fontFamilyResolver", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection$delegate", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "hapticFeedBack", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "Landroidx/compose/ui/input/InputModeManagerImpl;", "_inputModeManager", "Landroidx/compose/ui/input/InputModeManagerImpl;", "Landroidx/compose/ui/modifier/ModifierLocalManager;", "modifierLocalManager", "Landroidx/compose/ui/modifier/ModifierLocalManager;", "getModifierLocalManager", "()Landroidx/compose/ui/modifier/ModifierLocalManager;", "Landroidx/compose/ui/platform/TextToolbar;", "textToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "previousMotionEvent", "Landroid/view/MotionEvent;", "relayoutTime", "Landroidx/compose/ui/platform/WeakCache;", "layerCache", "Landroidx/compose/ui/platform/WeakCache;", "endApplyChangesListeners", "currentFrameRate", "F", "currentFrameRateCategory", "androidx/compose/ui/platform/AndroidComposeView$resendMotionEventRunnable$1", "resendMotionEventRunnable", "Landroidx/compose/ui/platform/AndroidComposeView$resendMotionEventRunnable$1;", "sendHoverExitEvent", "hoverExitReceived", "Landroidx/compose/ui/platform/IndirectPointerNavigationGestureDetector;", "indirectPointerNavigationGestureDetector", "Landroidx/compose/ui/platform/IndirectPointerNavigationGestureDetector;", "resendMotionEventOnLayout", "Lkotlin/jvm/functions/Function0;", "Landroidx/compose/ui/platform/CalculateMatrixToWindow;", "matrixToWindow", "Landroidx/compose/ui/platform/CalculateMatrixToWindow;", "keyboardModifiersRequireUpdate", "Landroidx/compose/ui/scrollcapture/ScrollCapture;", "scrollCapture", "Landroidx/compose/ui/scrollcapture/ScrollCapture;", "_rootView", "Landroidx/compose/ui/input/pointer/PointerIconService;", "pointerIconService", "Landroidx/compose/ui/input/pointer/PointerIconService;", "getPointerIconService", "()Landroidx/compose/ui/input/pointer/PointerIconService;", "getView", "()Landroid/view/View;", "Landroidx/compose/ui/platform/WindowInfo;", "getWindowInfo", "()Landroidx/compose/ui/platform/WindowInfo;", "windowInfo", "uncaughtExceptionHandler", "Landroidx/compose/ui/node/RootForTest$UncaughtExceptionHandler;", "getUncaughtExceptionHandler$ui", "()Landroidx/compose/ui/node/RootForTest$UncaughtExceptionHandler;", "setUncaughtExceptionHandler$ui", "Landroidx/compose/ui/autofill/Autofill;", "getAutofill", "()Landroidx/compose/ui/autofill/Autofill;", "Landroidx/compose/ui/autofill/AutofillManager;", "getAutofillManager", "()Landroidx/compose/ui/autofill/AutofillManager;", "autofillManager", "getAndroidViewsHandler$ui", "()Landroidx/compose/ui/platform/AndroidViewsHandler;", "androidViewsHandler", "getMeasureIteration", "measureIteration", "getHasPendingMeasureOrLayout", "hasPendingMeasureOrLayout", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "getPlacementScope", "()Landroidx/compose/ui/layout/Placeable$PlacementScope;", "placementScope", "Landroidx/compose/ui/input/InputModeManager;", "getInputModeManager", "()Landroidx/compose/ui/input/InputModeManager;", "inputModeManager", "getScrollCaptureInProgress$ui", "scrollCaptureInProgress", "getOutOfFrameExecutor", "()Landroidx/compose/ui/platform/AndroidComposeView;", "outOfFrameExecutor", "getFontWeightAdjustmentCompat", "(Landroid/content/res/Configuration;)I", "fontWeightAdjustmentCompat", "Companion", "ViewTreeOwners", "RootModifierNode", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AndroidComposeView extends ViewGroup implements Owner, PlatformFocusOwner, ViewRootForTest, MatrixPositionCalculator, DefaultLifecycleObserver, OutOfFrameExecutor, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, FocusListener {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private static Method addChangeCallbackMethod;

    @NotNull
    private static final MutableObjectList<AndroidComposeView> composeViews;
    private static Method dispatchOnScrollChangedMethod;
    private static Method getBooleanMethod;
    private static Runnable systemPropertiesChangedRunnable;
    private static Class<?> systemPropertiesClass;
    private AndroidViewsHandler _androidViewsHandler;
    private final AndroidAutofill _autofill;
    private final AndroidAutofillManager _autofillManager;

    @NotNull
    private final InputModeManagerImpl _inputModeManager;
    private View _rootView;

    /* JADX INFO: renamed from: _viewTreeOwners$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState _viewTreeOwners;

    @NotNull
    private final LazyWindowInfo _windowInfo;

    @NotNull
    private final AndroidAccessibilityManager accessibilityManager;

    @NotNull
    private final AutofillTree autofillTree;

    @NotNull
    private final CanvasHolder canvasHolder;

    @NotNull
    private final AndroidClipboard clipboard;

    @NotNull
    private final AndroidClipboardManager clipboardManager;

    @NotNull
    private final AndroidComposeViewAccessibilityDelegateCompat composeAccessibilityDelegate;

    /* JADX INFO: renamed from: configuration$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState configuration;

    @NotNull
    private AndroidContentCaptureManager contentCaptureManager;

    @NotNull
    private CoroutineContext coroutineContext;
    private float currentFrameRate;
    private float currentFrameRateCategory;

    /* JADX INFO: renamed from: density$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState density;

    @NotNull
    private final MutableObjectList<OwnedLayer> dirtyLayers;

    @NotNull
    private final AndroidDragAndDropManager dragAndDropManager;

    @NotNull
    private final MutableObjectList<Function0<Unit>> endApplyChangesListeners;

    @NotNull
    private final FocusOwner focusOwner;

    /* JADX INFO: renamed from: fontFamilyResolver$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState fontFamilyResolver;

    @NotNull
    private final Font.ResourceLoader fontLoader;
    private boolean forceUseMatrixCache;
    private LifecycleRetainedValuesStoreOwner.FrameEndScheduler frameEndScheduler;
    private View frameRateCategoryView;
    private long globalPosition;

    @NotNull
    private final GraphicsContext graphicsContext;

    @NotNull
    private final HapticFeedback hapticFeedBack;
    private boolean hoverExitReceived;

    @NotNull
    private final IndirectPointerNavigationGestureDetector indirectPointerNavigationGestureDetector;

    @NotNull
    private final InsetsListener insetsListener;
    private final boolean isArrEnabled;
    private boolean isDrawingContent;
    private boolean isPendingInteropViewLayoutChangeDispatch;
    private boolean isRenderNodeCompatible;
    private boolean keyboardModifiersRequireUpdate;
    private long lastDownPointerPosition;
    private long lastMatrixRecalculationAnimationTime;

    @NotNull
    private final WeakCache<OwnedLayer> layerCache;

    /* JADX INFO: renamed from: layoutDirection$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState layoutDirection;

    @NotNull
    private final MutableIntObjectMap<LayoutNode> layoutNodes;

    @NotNull
    private final TextInputServiceAndroid legacyTextInputServiceAndroid;
    private LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry lifecycleRetainedValuesStoreOwnerEntry;

    @NotNull
    private final CalculateMatrixToWindow matrixToWindow;

    @NotNull
    private final MeasureAndLayoutDelegate measureAndLayoutDelegate;

    @NotNull
    private final ModifierLocalManager modifierLocalManager;

    @NotNull
    private final MotionEventAdapter motionEventAdapter;
    private boolean observationClearRequested;
    private Constraints onMeasureConstraints;
    private Function1<? super ViewTreeOwners, Unit> onViewTreeOwnersAvailable;

    @NotNull
    private final ArrayDeque<Function0<Unit>> outOfFrameQueue;

    @NotNull
    private final Runnable outOfFrameRunnable;

    @NotNull
    private final PointerIconService pointerIconService;

    @NotNull
    private final PointerInputEventProcessor pointerInputEventProcessor;
    private MutableObjectList<OwnedLayer> postponedDirtyLayers;
    private MotionEvent previousMotionEvent;
    private IndirectPointerEventPrimaryDirectionalMotionAxis primaryDirectionalMotionAxisOverride;
    private boolean processingRequestFocusForNextNonChildView;

    @NotNull
    private final RectManager rectManager;
    private long relayoutTime;

    @NotNull
    private final Function0<Unit> resendMotionEventOnLayout;

    @NotNull
    private final AndroidComposeView$resendMotionEventRunnable$1 resendMotionEventRunnable;

    @NotNull
    private RetainedValuesStore retainedValuesStore;

    @NotNull
    private final LayoutNode root;

    @NotNull
    private final RootForTest rootForTest;

    @NotNull
    private final EmptySemanticsModifier rootSemanticsNode;
    private final ScrollCapture scrollCapture;

    @NotNull
    private final SemanticsOwner semanticsOwner;

    @NotNull
    private final Runnable sendHoverExitEvent;

    @NotNull
    private final LayoutNodeDrawScope sharedDrawScope;
    private boolean showLayoutBounds;

    @NotNull
    private final OwnerSnapshotObserver snapshotObserver;

    @NotNull
    private final SoftwareKeyboardController softwareKeyboardController;
    private boolean superclassInitComplete;

    @NotNull
    private final TextInputService textInputService;

    @NotNull
    private final AtomicReference<SessionMutex.Session<AndroidPlatformTextInputSession>> textInputSessionMutex;

    @NotNull
    private final TextToolbar textToolbar;

    @NotNull
    private final float[] tmpMatrix;

    @NotNull
    private final int[] tmpPositionArray;

    @NotNull
    private final ViewConfiguration viewConfiguration;
    private DrawChildContainer viewLayersContainer;

    @NotNull
    private final float[] viewToWindowMatrix;

    /* JADX INFO: renamed from: viewTreeOwners$delegate, reason: from kotlin metadata */
    @NotNull
    private final State viewTreeOwners;
    private boolean wasMeasuredWithMultipleConstraints;
    private long windowPosition;

    @NotNull
    private final float[] windowToViewMatrix;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0002J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0002J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0007R\u0014\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$Companion;", "", "<init>", "()V", "systemPropertiesClass", "Ljava/lang/Class;", "getBooleanMethod", "Ljava/lang/reflect/Method;", "addChangeCallbackMethod", "composeViews", "Landroidx/collection/MutableObjectList;", "Landroidx/compose/ui/platform/AndroidComposeView;", "systemPropertiesChangedRunnable", "Ljava/lang/Runnable;", "dispatchOnScrollChangedMethod", "getIsShowingLayoutBounds", "", "addNotificationForSysPropsChange", "", "composeView", "removeNotificationForSysPropsChange", "dispatchOnScrollChanged", "viewTreeObserver", "Landroid/view/ViewTreeObserver;", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void addNotificationForSysPropsChange(AndroidComposeView composeView) {
            if (Build.VERSION.SDK_INT > 28) {
                if (AndroidComposeView.systemPropertiesChangedRunnable == null) {
                    b bVar = new b(0);
                    AndroidComposeView.systemPropertiesChangedRunnable = bVar;
                    StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                    try {
                        if (AndroidComposeView.systemPropertiesClass == null) {
                            AndroidComposeView.systemPropertiesClass = Class.forName("android.os.SystemProperties");
                        }
                        if (AndroidComposeView.addChangeCallbackMethod == null) {
                            StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                            Class cls = AndroidComposeView.systemPropertiesClass;
                            AndroidComposeView.addChangeCallbackMethod = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                        }
                        Method method = AndroidComposeView.addChangeCallbackMethod;
                        if (method != null) {
                            method.invoke(null, bVar);
                        }
                    } catch (Throwable unused) {
                    }
                    StrictMode.setVmPolicy(vmPolicy);
                }
                synchronized (AndroidComposeView.composeViews) {
                    AndroidComposeView.composeViews.add(composeView);
                    Unit unit = Unit.f186387a;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void addNotificationForSysPropsChange$lambda$0() {
            synchronized (AndroidComposeView.composeViews) {
                try {
                    int i = 0;
                    if (Build.VERSION.SDK_INT < 30) {
                        MutableObjectList mutableObjectList = AndroidComposeView.composeViews;
                        Object[] objArr = mutableObjectList.content;
                        int i2 = mutableObjectList._size;
                        while (i < i2) {
                            AndroidComposeView androidComposeView = (AndroidComposeView) objArr[i];
                            boolean showLayoutBounds = androidComposeView.getShowLayoutBounds();
                            androidComposeView.setShowLayoutBounds(AndroidComposeView.INSTANCE.getIsShowingLayoutBounds());
                            if (showLayoutBounds != androidComposeView.getShowLayoutBounds()) {
                                androidComposeView.invalidateDescendants();
                            }
                            i++;
                        }
                    } else {
                        MutableObjectList mutableObjectList2 = AndroidComposeView.composeViews;
                        Object[] objArr2 = mutableObjectList2.content;
                        int i3 = mutableObjectList2._size;
                        while (i < i3) {
                            ((AndroidComposeView) objArr2[i]).invalidateDescendants();
                            i++;
                        }
                    }
                    Unit unit = Unit.f186387a;
                } catch (Throwable th10) {
                    throw th10;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean getIsShowingLayoutBounds() {
            try {
                if (AndroidComposeView.systemPropertiesClass == null) {
                    AndroidComposeView.systemPropertiesClass = Class.forName("android.os.SystemProperties");
                }
                if (AndroidComposeView.getBooleanMethod == null) {
                    Class cls = AndroidComposeView.systemPropertiesClass;
                    AndroidComposeView.getBooleanMethod = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
                }
                Method method = AndroidComposeView.getBooleanMethod;
                Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
                return Intrinsics.f(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, Boolean.TRUE);
            } catch (Exception unused) {
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void removeNotificationForSysPropsChange(AndroidComposeView composeView) {
            if (Build.VERSION.SDK_INT > 28) {
                synchronized (AndroidComposeView.composeViews) {
                    AndroidComposeView.composeViews.remove(composeView);
                    Unit unit = Unit.f186387a;
                }
            }
        }

        public final void dispatchOnScrollChanged(@NotNull ViewTreeObserver viewTreeObserver) {
            try {
                if (AndroidComposeView.dispatchOnScrollChangedMethod == null) {
                    Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    AndroidComposeView.dispatchOnScrollChangedMethod = declaredMethod;
                }
                Method method = AndroidComposeView.dispatchOnScrollChangedMethod;
                if (method != null) {
                    method.invoke(viewTreeObserver, null);
                }
            } catch (Exception unused) {
            }
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\bB\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0013\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u000e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001aH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b$\u0010#J\u0017\u0010(\u001a\u00020!2\u0006\u0010 \u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020!2\u0006\u0010 \u001a\u00020%H\u0016¢\u0006\u0004\b)\u0010'R\"\u0010,\u001a\u00020+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R)\u00104\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u0015028\u0006¢\u0006\u0012\n\u0004\b4\u00105\u0012\u0004\b8\u00109\u001a\u0004\b6\u00107R\u0011\u0010=\u001a\u00020:8F¢\u0006\u0006\u001a\u0004\b;\u0010<R \u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0?0>8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020E0D8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010L\u001a\u00020I8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010P\u001a\u00020M8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006Q"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$RootModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/relocation/BringIntoViewModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;", "Landroidx/compose/ui/input/key/KeyInputModifierNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/ui/layout/WindowInsetsRulerProvider;", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "applySemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "childCoordinates", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "boundsProvider", "bringIntoView", "(Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/input/rotary/RotaryScrollEvent;", "event", "", "onRotaryScrollEvent", "(Landroidx/compose/ui/input/rotary/RotaryScrollEvent;)Z", "onPreRotaryScrollEvent", "Landroidx/compose/ui/input/key/KeyEvent;", "onPreKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "onPreKeyEvent", "onKeyEvent-ZmokQxo", "onKeyEvent", "", "previousGeneration", "I", "getPreviousGeneration", "()I", "setPreviousGeneration", "(I)V", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/RulerScope;", "rulerLambda", "Lkotlin/jvm/functions/Function1;", "getRulerLambda", "()Lkotlin/jvm/functions/Function1;", "getRulerLambda$annotations", "()V", "Landroidx/compose/runtime/MutableIntState;", "getGeneration", "()Landroidx/compose/runtime/MutableIntState;", "generation", "Landroidx/collection/MutableObjectList;", "Landroidx/compose/runtime/MutableState;", "Landroid/graphics/Rect;", "getCutoutRects", "()Landroidx/collection/MutableObjectList;", "cutoutRects", "", "Landroidx/compose/ui/layout/RectRulers;", "getCutoutRulers", "()Ljava/util/List;", "cutoutRulers", "Landroidx/compose/ui/layout/InsetsListener;", "getInsetsListener", "()Landroidx/compose/ui/layout/InsetsListener;", "insetsListener", "", "getTraverseKey", "()Ljava/lang/Object;", "traverseKey", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class RootModifierNode extends Modifier.Node implements BringIntoViewModifierNode, SemanticsModifierNode, RotaryInputModifierNode, KeyInputModifierNode, LayoutModifierNode, TraversableNode, WindowInsetsRulerProvider {
        private int previousGeneration = -1;

        @NotNull
        private final Function1<RulerScope, Unit> rulerLambda = new AndroidComposeView$RootModifierNode$rulerLambda$1(this);

        public RootModifierNode() {
        }

        @Override // androidx.compose.ui.node.SemanticsModifierNode
        public void applySemantics(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        }

        @Override // androidx.compose.ui.relocation.BringIntoViewModifierNode
        public Object bringIntoView(@NotNull LayoutCoordinates layoutCoordinates, @NotNull Function0<Rect> function0, @NotNull Continuation<? super Unit> continuation) {
            long jPositionInRoot = LayoutCoordinatesKt.positionInRoot(layoutCoordinates);
            Rect rect = (Rect) function0.invoke();
            Rect rectM1852translatek4lQ0M = rect != null ? rect.m1852translatek4lQ0M(jPositionInRoot) : null;
            if (rectM1852translatek4lQ0M != null) {
                AndroidComposeView.this.requestRectangleOnScreen(RectHelper_androidKt.toAndroidRect(rectM1852translatek4lQ0M), false);
            }
            return Unit.f186387a;
        }

        @Override // androidx.compose.ui.layout.WindowInsetsRulerProvider
        @NotNull
        public MutableObjectList<MutableState<android.graphics.Rect>> getCutoutRects() {
            return getInsetsListener().getDisplayCutouts();
        }

        @Override // androidx.compose.ui.layout.WindowInsetsRulerProvider
        @NotNull
        public List<RectRulers> getCutoutRulers() {
            return getInsetsListener().getDisplayCutoutRulers();
        }

        @NotNull
        public final MutableIntState getGeneration() {
            return getInsetsListener().getGeneration();
        }

        @Override // androidx.compose.ui.layout.WindowInsetsRulerProvider
        @NotNull
        public InsetsListener getInsetsListener() {
            return AndroidComposeView.this.getInsetsListener();
        }

        public final int getPreviousGeneration() {
            return this.previousGeneration;
        }

        @Override // androidx.compose.ui.node.TraversableNode
        @NotNull
        public Object getTraverseKey() {
            return "androidx.compose.ui.layout.WindowInsetsRulers";
        }

        @Override // androidx.compose.ui.node.LayoutModifierNode
        @NotNull
        /* JADX INFO: renamed from: measure-3p2s80s */
        public MeasureResult mo543measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j2) {
            Placeable placeableMo2530measureBRTryo0 = measurable.mo2530measureBRTryo0(j2);
            return MeasureScope.layout$default(measureScope, placeableMo2530measureBRTryo0.getWidth(), placeableMo2530measureBRTryo0.getHeight(), null, this.rulerLambda, new AndroidComposeView$RootModifierNode$measure$1(placeableMo2530measureBRTryo0), 4, null);
        }

        @Override // androidx.compose.ui.input.key.KeyInputModifierNode
        /* JADX INFO: renamed from: onKeyEvent-ZmokQxo */
        public boolean mo597onKeyEventZmokQxo(@NotNull KeyEvent event) {
            Boolean boolMo1774focusSearchULY8qGw;
            FocusDirection focusDirectionM1767toFocusDirectionZmokQxo = FocusInteropUtils_androidKt.m1767toFocusDirectionZmokQxo(event);
            if (focusDirectionM1767toFocusDirectionZmokQxo == null || !KeyEventType.m2391equalsimpl0(KeyEvent_androidKt.m2396getTypeZmokQxo(event), KeyEventType.INSTANCE.m2392getKeyDownCS__XNY())) {
                return false;
            }
            if (ComposeUiFlags.isBypassUnfocusableComposeViewEnabled) {
                FocusTargetNode activeFocusTargetNode = AndroidComposeView.this.getFocusOwner().getActiveFocusTargetNode();
                if (activeFocusTargetNode != null && activeFocusTargetNode.getIsInteropViewHost() && AndroidComposeView.this.mo1810moveFocusInChildren3ESFkO8(focusDirectionM1767toFocusDirectionZmokQxo.getValue())) {
                    return true;
                }
                Boolean boolMo1774focusSearchULY8qGw2 = AndroidComposeView.this.getFocusOwner().mo1774focusSearchULY8qGw(focusDirectionM1767toFocusDirectionZmokQxo.getValue(), AndroidComposeView.this.getEmbeddedViewFocusRect(), new AndroidComposeView$RootModifierNode$onKeyEvent$focusWasMovedOrCancelled$1(focusDirectionM1767toFocusDirectionZmokQxo));
                if (boolMo1774focusSearchULY8qGw2 != null ? boolMo1774focusSearchULY8qGw2.booleanValue() : true) {
                    return true;
                }
                if (FocusOwnerImplKt.m1780is1dFocusSearch3ESFkO8(focusDirectionM1767toFocusDirectionZmokQxo.getValue())) {
                    Integer numM1766toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m1766toAndroidFocusDirection3ESFkO8(focusDirectionM1767toFocusDirectionZmokQxo.getValue());
                    int iIntValue = numM1766toAndroidFocusDirection3ESFkO8 != null ? numM1766toAndroidFocusDirection3ESFkO8.intValue() : 2;
                    FocusFinder focusFinder = FocusFinder.getInstance();
                    View rootView = AndroidComposeView.this.getRootView();
                    Intrinsics.i(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                    View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, AndroidComposeView.this.getView(), iIntValue);
                    if (viewFindNextFocus == null || viewFindNextFocus.equals(AndroidComposeView.this)) {
                        return AndroidComposeView.this.getFocusOwner().mo1777resetFocus3ESFkO8(focusDirectionM1767toFocusDirectionZmokQxo.getValue());
                    }
                }
                return false;
            }
            Integer numM1766toAndroidFocusDirection3ESFkO82 = FocusInteropUtils_androidKt.m1766toAndroidFocusDirection3ESFkO8(focusDirectionM1767toFocusDirectionZmokQxo.getValue());
            if (ComposeUiFlags.isViewFocusFixEnabled && AndroidComposeView.this.hasFocus() && numM1766toAndroidFocusDirection3ESFkO82 != null && AndroidComposeView.this.mo1810moveFocusInChildren3ESFkO8(focusDirectionM1767toFocusDirectionZmokQxo.getValue())) {
                return true;
            }
            Rect embeddedViewFocusRect = AndroidComposeView.this.getEmbeddedViewFocusRect();
            Boolean boolMo1774focusSearchULY8qGw3 = AndroidComposeView.this.getFocusOwner().mo1774focusSearchULY8qGw(focusDirectionM1767toFocusDirectionZmokQxo.getValue(), embeddedViewFocusRect, new AndroidComposeView$RootModifierNode$onKeyEvent$focusWasMovedOrCancelled$2(focusDirectionM1767toFocusDirectionZmokQxo));
            if (boolMo1774focusSearchULY8qGw3 != null ? boolMo1774focusSearchULY8qGw3.booleanValue() : true) {
                return true;
            }
            if (!FocusOwnerImplKt.m1780is1dFocusSearch3ESFkO8(focusDirectionM1767toFocusDirectionZmokQxo.getValue())) {
                return false;
            }
            if (numM1766toAndroidFocusDirection3ESFkO82 != null) {
                View viewFindNextNonChildView = AndroidComposeView.this.findNextNonChildView(numM1766toAndroidFocusDirection3ESFkO82.intValue());
                if (Intrinsics.f(viewFindNextNonChildView, AndroidComposeView.this)) {
                    viewFindNextNonChildView = null;
                }
                if (viewFindNextNonChildView != null) {
                    android.graphics.Rect androidRect = embeddedViewFocusRect != null ? RectHelper_androidKt.toAndroidRect(embeddedViewFocusRect) : null;
                    if (androidRect == null) {
                        throw v7.v("Invalid rect");
                    }
                    View rootView2 = AndroidComposeView.this.getRootView();
                    Intrinsics.i(rootView2, "null cannot be cast to non-null type android.view.ViewGroup");
                    ViewGroup viewGroup = (ViewGroup) rootView2;
                    viewGroup.offsetDescendantRectToMyCoords(AndroidComposeView.this.getView(), androidRect);
                    viewGroup.offsetRectIntoDescendantCoords(viewFindNextNonChildView, androidRect);
                    if (FocusInteropUtils_androidKt.requestInteropFocus(viewFindNextNonChildView, numM1766toAndroidFocusDirection3ESFkO82, androidRect)) {
                        return true;
                    }
                }
            }
            if (AndroidComposeView.this.getFocusOwner().mo1771clearFocusI7lrPNg(false, true, false, focusDirectionM1767toFocusDirectionZmokQxo.getValue()) && (boolMo1774focusSearchULY8qGw = AndroidComposeView.this.getFocusOwner().mo1774focusSearchULY8qGw(focusDirectionM1767toFocusDirectionZmokQxo.getValue(), null, new AndroidComposeView$RootModifierNode$onKeyEvent$1(focusDirectionM1767toFocusDirectionZmokQxo))) != null) {
                return boolMo1774focusSearchULY8qGw.booleanValue();
            }
            return true;
        }

        @Override // androidx.compose.ui.input.key.KeyInputModifierNode
        /* JADX INFO: renamed from: onPreKeyEvent-ZmokQxo */
        public boolean mo599onPreKeyEventZmokQxo(@NotNull KeyEvent event) {
            return false;
        }

        @Override // androidx.compose.ui.input.rotary.RotaryInputModifierNode
        public boolean onPreRotaryScrollEvent(@NotNull RotaryScrollEvent event) {
            return false;
        }

        @Override // androidx.compose.ui.input.rotary.RotaryInputModifierNode
        public boolean onRotaryScrollEvent(@NotNull RotaryScrollEvent event) {
            return false;
        }

        public final void setPreviousGeneration(int i) {
            this.previousGeneration = i;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "savedStateRegistryOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "<init>", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/savedstate/SavedStateRegistryOwner;Landroidx/lifecycle/ViewModelStoreOwner;)V", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "getSavedStateRegistryOwner", "()Landroidx/savedstate/SavedStateRegistryOwner;", "getViewModelStoreOwner", "()Landroidx/lifecycle/ViewModelStoreOwner;", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ViewTreeOwners {

        @NotNull
        private final LifecycleOwner lifecycleOwner;

        @NotNull
        private final SavedStateRegistryOwner savedStateRegistryOwner;
        private final ViewModelStoreOwner viewModelStoreOwner;

        public ViewTreeOwners(@NotNull LifecycleOwner lifecycleOwner, @NotNull SavedStateRegistryOwner savedStateRegistryOwner, ViewModelStoreOwner viewModelStoreOwner) {
            this.lifecycleOwner = lifecycleOwner;
            this.savedStateRegistryOwner = savedStateRegistryOwner;
            this.viewModelStoreOwner = viewModelStoreOwner;
        }

        @NotNull
        public final LifecycleOwner getLifecycleOwner() {
            return this.lifecycleOwner;
        }

        @NotNull
        public final SavedStateRegistryOwner getSavedStateRegistryOwner() {
            return this.savedStateRegistryOwner;
        }

        public final ViewModelStoreOwner getViewModelStoreOwner() {
            return this.viewModelStoreOwner;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeView$dispatchKeyEvent$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class C19091 extends u implements Function0<Boolean> {
        final /* synthetic */ KeyEvent $event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19091(KeyEvent keyEvent) {
            super(0);
            this.$event = keyEvent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(AndroidComposeView.super.dispatchKeyEvent(this.$event));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeView$getFocusedRect$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/focus/FocusTargetNode;", "invoke", "(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class C19101 extends u implements Function1<FocusTargetNode, Boolean> {
        public static final C19101 INSTANCE = new C19101();

        public C19101() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeView$handleRotaryEvent$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class C19111 extends u implements Function0<Boolean> {
        final /* synthetic */ MotionEvent $event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19111(MotionEvent motionEvent) {
            super(0);
            this.$event = motionEvent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(AndroidComposeView.super.dispatchGenericMotionEvent(this.$event));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeView$onAttachedToWindow$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/platform/DerivedSize;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class C19121 extends u implements Function0<DerivedSize> {
        public C19121() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final DerivedSize invoke() {
            return AndroidWindowInfo_androidKt.calculateWindowSize(AndroidComposeView.this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeView$requestFocusCurrent$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/focus/FocusTargetNode;", "invoke", "(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class C19131 extends u implements Function1<FocusTargetNode, Boolean> {
        final /* synthetic */ int $focusDirection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19131(int i) {
            super(1);
            this.$focusDirection = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            return Boolean.valueOf(focusTargetNode.mo1784requestFocus3ESFkO8(this.$focusDirection));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeView$textInputSession$1, reason: invalid class name and case insensitive filesystem */
    @gim.d(c = "androidx.compose.ui.platform.AndroidComposeView", f = "AndroidComposeView.android.kt", l = {776}, m = "textInputSession", v = 1)
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class C19141 extends gim.c {
        int label;
        /* synthetic */ Object result;

        public C19141(Continuation<? super C19141> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return AndroidComposeView.this.textInputSession(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeView$textInputSession$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/platform/AndroidPlatformTextInputSession;", "it", "Lkotlinx/coroutines/CoroutineScope;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass2 extends u implements Function1<CoroutineScope, AndroidPlatformTextInputSession> {
        public AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final AndroidPlatformTextInputSession invoke(CoroutineScope coroutineScope) {
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            return new AndroidPlatformTextInputSession(androidComposeView, androidComposeView.getTextInputService(), coroutineScope);
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        composeViews = new MutableObjectList<>(0, 1, defaultConstructorMarker);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v49, types: [androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1] */
    public AndroidComposeView(@NotNull Context context, @NotNull CoroutineContext coroutineContext) {
        AndroidAutofillManager androidAutofillManager;
        super(context);
        Offset.Companion companion = Offset.INSTANCE;
        this.lastDownPointerPosition = companion.m1844getUnspecifiedF1C5BW0();
        int i = 1;
        this.superclassInitComplete = true;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        this.sharedDrawScope = new LayoutNodeDrawScope(0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        this.retainedValuesStore = ForgetfulRetainedValuesStore.INSTANCE;
        this.outOfFrameQueue = new ArrayDeque<>();
        final int i2 = 0;
        this.outOfFrameRunnable = new Runnable(this) { // from class: androidx.compose.ui.platform.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AndroidComposeView f7314b;

            {
                this.f7314b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        AndroidComposeView.outOfFrameRunnable$lambda$0(this.f7314b);
                        break;
                    default:
                        AndroidComposeView.sendHoverExitEvent$lambda$0(this.f7314b);
                        break;
                }
            }
        };
        this.density = SnapshotStateKt.mutableStateOf(AndroidDensity_androidKt.Density(context), SnapshotStateKt.referentialEqualityPolicy());
        boolean z = false;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        boolean z3 = ComposeUiFlags.isAdaptiveRefreshRateEnabled && Build.VERSION.SDK_INT >= 35;
        this.isArrEnabled = z3;
        EmptySemanticsModifier emptySemanticsModifier = new EmptySemanticsModifier();
        this.rootSemanticsNode = emptySemanticsModifier;
        this.focusOwner = new FocusOwnerImpl(this, this);
        this.coroutineContext = coroutineContext;
        this.dragAndDropManager = new AndroidDragAndDropManager(new AndroidComposeView$dragAndDropManager$1(this));
        this._windowInfo = new LazyWindowInfo();
        this.canvasHolder = new CanvasHolder();
        this.viewConfiguration = new AndroidViewConfiguration(android.view.ViewConfiguration.get(context));
        this.insetsListener = new InsetsListener(this);
        LayoutNode layoutNode = new LayoutNode(z, objArr8 == true ? 1 : 0, 3, objArr5 == true ? 1 : 0);
        layoutNode.setMeasurePolicy(RootMeasurePolicy.INSTANCE);
        layoutNode.setDensity(getDensity());
        layoutNode.setViewConfiguration(getViewConfiguration());
        layoutNode.setModifier(new ModifierNodeElement<RootModifierNode>() { // from class: androidx.compose.ui.platform.AndroidComposeView$root$1$1
            public boolean equals(Object other) {
                return other == this;
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public int hashCode() {
                return this.this$0.hashCode();
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public void inspectableProperties(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("rootModifier");
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public void update(AndroidComposeView.RootModifierNode node) {
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public AndroidComposeView.RootModifierNode create() {
                return this.this$0.new RootModifierNode();
            }
        }.then(getFocusOwner().getModifier()).then(getDragAndDropManager().getModifier()));
        this.root = layoutNode;
        this.layoutNodes = IntObjectMapKt.mutableIntObjectMapOf();
        this.rectManager = new RectManager(getLayoutNodes());
        this.rootForTest = this;
        this.semanticsOwner = new SemanticsOwner(getRoot(), emptySemanticsModifier, getLayoutNodes());
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = new AndroidComposeViewAccessibilityDelegateCompat(this);
        this.composeAccessibilityDelegate = androidComposeViewAccessibilityDelegateCompat;
        this.contentCaptureManager = new AndroidContentCaptureManager(this, new AndroidComposeView$contentCaptureManager$1(this));
        this.accessibilityManager = new AndroidAccessibilityManager(context);
        this.graphicsContext = AndroidGraphicsContext_androidKt.GraphicsContext(this);
        this.autofillTree = new AutofillTree();
        this.dirtyLayers = new MutableObjectList<>(objArr7 == true ? 1 : 0, i, objArr4 == true ? 1 : 0);
        this.motionEventAdapter = new MotionEventAdapter();
        this.pointerInputEventProcessor = new PointerInputEventProcessor(getRoot());
        this.configuration = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Configuration(context.getResources().getConfiguration()), null, 2, null);
        this._autofill = autofillSupported() ? new AndroidAutofill(this, getAutofillTree()) : null;
        if (autofillSupported()) {
            AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
            if (autofillManager == null) {
                throw v7.v("Autofill service could not be located.");
            }
            androidAutofillManager = new AndroidAutofillManager(new PlatformAutofillManagerImpl(autofillManager), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        } else {
            androidAutofillManager = null;
        }
        this._autofillManager = androidAutofillManager;
        this.clipboardManager = new AndroidClipboardManager(context);
        this.clipboard = new AndroidClipboard(getClipboardManager());
        this.snapshotObserver = new OwnerSnapshotObserver(new AndroidComposeView$snapshotObserver$1(this));
        this.measureAndLayoutDelegate = new MeasureAndLayoutDelegate(getRoot());
        long j2 = Integer.MAX_VALUE;
        this.globalPosition = IntOffset.m3329constructorimpl((j2 & BodyPartID.bodyIdMax) | (j2 << 32));
        this.tmpPositionArray = new int[]{0, 0};
        float[] fArrM2050constructorimpl$default = Matrix.m2050constructorimpl$default(null, 1, null);
        this.tmpMatrix = fArrM2050constructorimpl$default;
        this.viewToWindowMatrix = Matrix.m2050constructorimpl$default(null, 1, null);
        this.windowToViewMatrix = Matrix.m2050constructorimpl$default(null, 1, null);
        this.lastMatrixRecalculationAnimationTime = -1L;
        this.windowPosition = companion.m1843getInfiniteF1C5BW0();
        this.isRenderNodeCompatible = true;
        this._viewTreeOwners = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.viewTreeOwners = SnapshotStateKt.derivedStateOf(new AndroidComposeView$viewTreeOwners$2(this));
        TextInputServiceAndroid textInputServiceAndroid = new TextInputServiceAndroid(getView(), this);
        this.legacyTextInputServiceAndroid = textInputServiceAndroid;
        this.textInputService = new TextInputService((PlatformTextInputService) AndroidComposeView_androidKt.getPlatformTextInputServiceInterceptor().invoke(textInputServiceAndroid));
        this.textInputSessionMutex = SessionMutex.m1724constructorimpl();
        this.softwareKeyboardController = new DelegatingSoftwareKeyboardController(getTextInputService());
        this.fontLoader = new AndroidFontResourceLoader(context);
        this.fontFamilyResolver = SnapshotStateKt.mutableStateOf(FontFamilyResolver_androidKt.createFontFamilyResolver(context), SnapshotStateKt.referentialEqualityPolicy());
        LayoutDirection layoutDirection = FocusInteropUtils_androidKt.toLayoutDirection(context.getResources().getConfiguration().getLayoutDirection());
        this.layoutDirection = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(layoutDirection == null ? LayoutDirection.Ltr : layoutDirection, null, 2, null);
        this.hapticFeedBack = new PlatformHapticFeedback(this);
        this._inputModeManager = new InputModeManagerImpl(isInTouchMode() ? InputMode.INSTANCE.m2329getTouchaOaMEAU() : InputMode.INSTANCE.m2328getKeyboardaOaMEAU(), new AndroidComposeView$_inputModeManager$1(this), objArr3 == true ? 1 : 0);
        this.modifierLocalManager = new ModifierLocalManager(this);
        this.textToolbar = new AndroidTextToolbar(this);
        this.layerCache = new WeakCache<>();
        this.endApplyChangesListeners = new MutableObjectList<>(objArr6 == true ? 1 : 0, i, objArr2 == true ? 1 : 0);
        this.resendMotionEventRunnable = new Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1
            @Override // java.lang.Runnable
            public void run() {
                this.this$0.removeCallbacks(this);
                MotionEvent motionEvent = this.this$0.previousMotionEvent;
                if (motionEvent != null) {
                    boolean z4 = motionEvent.getToolType(0) == 3;
                    int actionMasked = motionEvent.getActionMasked();
                    if (z4) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    int i3 = 7;
                    if (actionMasked != 7 && actionMasked != 9) {
                        i3 = 2;
                    }
                    AndroidComposeView androidComposeView = this.this$0;
                    androidComposeView.sendSimulatedEvent(motionEvent, i3, androidComposeView.relayoutTime, false);
                }
            }
        };
        final int i3 = 1;
        this.sendHoverExitEvent = new Runnable(this) { // from class: androidx.compose.ui.platform.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AndroidComposeView f7314b;

            {
                this.f7314b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        AndroidComposeView.outOfFrameRunnable$lambda$0(this.f7314b);
                        break;
                    default:
                        AndroidComposeView.sendHoverExitEvent$lambda$0(this.f7314b);
                        break;
                }
            }
        };
        this.indirectPointerNavigationGestureDetector = new IndirectPointerNavigationGestureDetector(context, new AndroidComposeView$indirectPointerNavigationGestureDetector$1(this));
        this.resendMotionEventOnLayout = new AndroidComposeView$resendMotionEventOnLayout$1(this);
        int i5 = Build.VERSION.SDK_INT;
        this.matrixToWindow = i5 < 29 ? new CalculateMatrixToWindowApi21(fArrM2050constructorimpl$default, objArr == true ? 1 : 0) : new CalculateMatrixToWindowApi29();
        addOnAttachStateChangeListener(this.contentCaptureManager);
        setWillNotDraw(false);
        setFocusable(true);
        AndroidComposeViewVerificationHelperMethodsO.INSTANCE.focusable(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        ViewCompat.setAccessibilityDelegate(this, androidComposeViewAccessibilityDelegateCompat);
        Function1<ViewRootForTest, Unit> onViewCreatedCallback = ViewRootForTest.INSTANCE.getOnViewCreatedCallback();
        if (onViewCreatedCallback != null) {
            onViewCreatedCallback.invoke(this);
        }
        setOnDragListener(getDragAndDropManager());
        getRoot().attach$ui(this);
        if (i5 >= 29) {
            AndroidComposeViewForceDarkModeQ.INSTANCE.disallowForceDark(this);
        }
        if (z3) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R$id.hide_in_inspector_tag, Boolean.TRUE);
            this.frameRateCategoryView = view;
            addView(view);
        }
        this.scrollCapture = i5 >= 31 ? new ScrollCapture() : null;
        this.pointerIconService = new PointerIconService() { // from class: androidx.compose.ui.platform.AndroidComposeView$pointerIconService$1
            private PointerIcon currentMouseCursorIcon = PointerIcon.INSTANCE.getDefault();
            private PointerIcon currentStylusHoverIcon;

            @Override // androidx.compose.ui.input.pointer.PointerIconService
            /* JADX INFO: renamed from: getStylusHoverIcon, reason: from getter */
            public PointerIcon getCurrentStylusHoverIcon() {
                return this.currentStylusHoverIcon;
            }

            @Override // androidx.compose.ui.input.pointer.PointerIconService
            public void setIcon(PointerIcon value) {
                if (value == null) {
                    value = PointerIcon.INSTANCE.getDefault();
                }
                this.currentMouseCursorIcon = value;
                AndroidComposeViewVerificationHelperMethodsN.INSTANCE.setPointerIcon(this.this$0, value);
            }

            @Override // androidx.compose.ui.input.pointer.PointerIconService
            public void setStylusHoverIcon(PointerIcon value) {
                this.currentStylusHoverIcon = value;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addExtraDataToAccessibilityNodeInfoHelper(int virtualViewId, AccessibilityNodeInfo info, String extraDataKey) {
        int orDefault;
        if (Intrinsics.f(extraDataKey, this.composeAccessibilityDelegate.getExtraDataTestTraversalBeforeVal())) {
            int orDefault2 = this.composeAccessibilityDelegate.getIdToBeforeMap().getOrDefault(virtualViewId, -1);
            if (orDefault2 != -1) {
                info.getExtras().putInt(extraDataKey, orDefault2);
                return;
            }
            return;
        }
        if (!Intrinsics.f(extraDataKey, this.composeAccessibilityDelegate.getExtraDataTestTraversalAfterVal()) || (orDefault = this.composeAccessibilityDelegate.getIdToAfterMap().getOrDefault(virtualViewId, -1)) == -1) {
            return;
        }
        info.getExtras().putInt(extraDataKey, orDefault);
    }

    private final boolean autofillSupported() {
        return true;
    }

    private final boolean childSizeCanAffectParentSize(LayoutNode layoutNode) {
        if (this.wasMeasuredWithMultipleConstraints) {
            return true;
        }
        LayoutNode parent$ui = layoutNode.getParent$ui();
        return (parent$ui == null || parent$ui.getHasFixedInnerContentConstraints$ui()) ? false : true;
    }

    private final void clearChildInvalidObservations(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).onEndApplyChanges();
            } else if (childAt instanceof ViewGroup) {
                clearChildInvalidObservations((ViewGroup) childAt);
            }
        }
    }

    /* JADX INFO: renamed from: convertMeasureSpec-I7RO_PI, reason: not valid java name */
    private final long m2752convertMeasureSpecI7RO_PI(int measureSpec) {
        int mode = View.MeasureSpec.getMode(measureSpec);
        int size = View.MeasureSpec.getSize(measureSpec);
        if (mode == Integer.MIN_VALUE) {
            return m2759packZIaKswc(0, size);
        }
        if (mode == 0) {
            return m2759packZIaKswc(0, Integer.MAX_VALUE);
        }
        if (mode == 1073741824) {
            return m2759packZIaKswc(size, size);
        }
        throw new IllegalStateException();
    }

    private final void dispatchConfigurationChangeIfNeeded() {
        int i = Build.VERSION.SDK_INT;
        if (32 > i || i >= 34) {
            return;
        }
        updateConfiguration(getResources().getConfiguration());
    }

    private final void dispatchPendingInteropLayoutCallbacks() {
        if (this.isPendingInteropViewLayoutChangeDispatch) {
            getViewTreeObserver().dispatchOnGlobalLayout();
            this.isPendingInteropViewLayoutChangeDispatch = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View findNextNonChildView(int direction) {
        FocusFinderCompat companion = FocusFinderCompat.INSTANCE.getInstance();
        View viewFindNextFocus = this;
        while (viewFindNextFocus != null) {
            View rootView = getRootView();
            Intrinsics.i(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
            viewFindNextFocus = companion.findNextFocus((ViewGroup) rootView, viewFindNextFocus, direction);
            if (viewFindNextFocus != null && !AndroidComposeView_androidKt.containsDescendant(this, viewFindNextFocus)) {
                return viewFindNextFocus;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: findNextViewInEmbeddedView-3ESFkO8, reason: not valid java name */
    private final View m2753findNextViewInEmbeddedView3ESFkO8(int focusDirection) {
        FocusTargetNode activeFocusTargetNode = getFocusOwner().getActiveFocusTargetNode();
        if (activeFocusTargetNode == null) {
            throw new IllegalStateException("findNextViewInEmbeddedView called when owner does not have anything focused.");
        }
        Integer numM1766toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m1766toAndroidFocusDirection3ESFkO8(focusDirection);
        if (numM1766toAndroidFocusDirection3ESFkO8 == null) {
            throw v7.v("Invalid focus direction");
        }
        int iIntValue = numM1766toAndroidFocusDirection3ESFkO8.intValue();
        View interopView = DelegatableNodeKt.requireLayoutNode(activeFocusTargetNode).getInteropView();
        View viewFindFocus = findFocus();
        FocusFinder focusFinder = FocusFinder.getInstance();
        View rootView = getRootView();
        Intrinsics.i(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewFindFocus, iIntValue);
        if (viewFindNextFocus == null || interopView == null || !AndroidComposeView_androidKt.containsDescendant(interopView, viewFindNextFocus)) {
            return null;
        }
        return viewFindNextFocus;
    }

    private final View findViewByAccessibilityIdRootedAtCurrentView(int accessibilityId, View currentView) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (Intrinsics.f(declaredMethod.invoke(currentView, null), Integer.valueOf(accessibilityId))) {
                return currentView;
            }
            if (currentView instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) currentView;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View viewFindViewByAccessibilityIdRootedAtCurrentView = findViewByAccessibilityIdRootedAtCurrentView(accessibilityId, viewGroup.getChildAt(i));
                    if (viewFindViewByAccessibilityIdRootedAtCurrentView != null) {
                        return viewFindViewByAccessibilityIdRootedAtCurrentView;
                    }
                }
            }
        }
        return null;
    }

    @yhm.d
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    private final int getFontWeightAdjustmentCompat(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            return g0.a(configuration);
        }
        return 0;
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m2754getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @yhm.d
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final ViewTreeOwners get_viewTreeOwners() {
        return (ViewTreeOwners) this._viewTreeOwners.getValue();
    }

    private final boolean handleIndirectPointerEvent(IndirectPointerEvent indirectPointerEvent) {
        boolean zDispatchIndirectPointerEvent = getFocusOwner().dispatchIndirectPointerEvent(indirectPointerEvent);
        if (!ComposeUiFlags.isIndirectPointerNavigationGestureDetectorEnabled) {
            return zDispatchIndirectPointerEvent;
        }
        this.indirectPointerNavigationGestureDetector.onIndirectPointerEvent(indirectPointerEvent, zDispatchIndirectPointerEvent);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX INFO: renamed from: handleMotionEvent-8iAsVTc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int m2755handleMotionEvent8iAsVTc(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.m2755handleMotionEvent8iAsVTc(android.view.MotionEvent):int");
    }

    private final boolean handleRotaryEvent(MotionEvent event) {
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(getContext());
        float f = -event.getAxisValue(26);
        return getFocusOwner().dispatchRotaryEvent(new RotaryScrollEvent(ViewConfigurationCompat.getScaledVerticalScrollFactor(viewConfiguration, getContext()) * f, ViewConfigurationCompat.getScaledHorizontalScrollFactor(viewConfiguration, getContext()) * f, event.getEventTime(), event.getDeviceId()), new C19111(event));
    }

    private final boolean hasChangedDevices(MotionEvent event, MotionEvent lastEvent) {
        return (lastEvent.getSource() == event.getSource() && lastEvent.getToolType(0) == event.getToolType(0)) ? false : true;
    }

    private final RetainedValuesStore installLocalRetainedValuesStore(LifecycleOwner lifecycleOwner, ViewModelStoreOwner viewModelStoreOwner) {
        LifecycleRetainedValuesStoreOwner.FrameEndScheduler frameEndScheduler = this.frameEndScheduler;
        if (lifecycleOwner == null || viewModelStoreOwner == null || frameEndScheduler == null) {
            return null;
        }
        LifecycleRetainedValuesStoreOwner lifecycleRetainedValuesStoreOwner = (LifecycleRetainedValuesStoreOwner) ViewModelProvider.Companion.create$default(ViewModelProvider.INSTANCE, viewModelStoreOwner.getViewModelStore(), new ViewModelProvider.NewInstanceFactory(), (CreationExtras) null, 4, (Object) null).get(o0.f186429a.b(LifecycleRetainedValuesStoreOwner.class));
        Object parent = getParent();
        Intrinsics.i(parent, "null cannot be cast to non-null type android.view.View");
        LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry orCreateRetainedValuesStoreEntry = lifecycleRetainedValuesStoreOwner.getOrCreateRetainedValuesStoreEntry(((View) parent).getId());
        this.lifecycleRetainedValuesStoreOwnerEntry = orCreateRetainedValuesStoreEntry;
        return orCreateRetainedValuesStoreEntry.getRetainedValuesStore();
    }

    private final void invalidateLayers(LayoutNode node) {
        node.invalidateLayers$ui();
        MutableVector<LayoutNode> mutableVector = node.get_children$ui();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            invalidateLayers(layoutNodeArr[i]);
        }
    }

    private final void invalidateLayoutNodeMeasurement(LayoutNode node) {
        MeasureAndLayoutDelegate.requestRemeasure$default(this.measureAndLayoutDelegate, node, false, 2, null);
        MutableVector<LayoutNode> mutableVector = node.get_children$ui();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            invalidateLayoutNodeMeasurement(layoutNodeArr[i]);
        }
    }

    private final boolean isBadMotionEvent(MotionEvent event) {
        boolean z = (Float.floatToRawIntBits(event.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(event.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(event.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(event.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = event.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(event.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(event.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !MotionEventVerifierApi29.INSTANCE.isValidMotionEvent(event, i));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    private final boolean isDevicePressEvent(MotionEvent event) {
        int actionMasked;
        return event.getButtonState() != 0 || (actionMasked = event.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6;
    }

    private final boolean isInBounds(MotionEvent motionEvent) {
        float x3 = motionEvent.getX();
        float y2 = motionEvent.getY();
        return BitmapDescriptorFactory.HUE_RED <= x3 && x3 <= ((float) getWidth()) && BitmapDescriptorFactory.HUE_RED <= y2 && y2 <= ((float) getHeight());
    }

    private final boolean isPositionChanged(MotionEvent event) {
        MotionEvent motionEvent;
        return (event.getPointerCount() == 1 && (motionEvent = this.previousMotionEvent) != null && motionEvent.getPointerCount() == event.getPointerCount() && event.getRawX() == motionEvent.getRawX() && event.getRawY() == motionEvent.getRawY()) ? false : true;
    }

    /* JADX INFO: renamed from: moveFocusInChildrenBypassUnfocusableComposeView-3ESFkO8, reason: not valid java name */
    private final boolean m2756moveFocusInChildrenBypassUnfocusableComposeView3ESFkO8(int focusDirection) {
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m1754equalsimpl0(focusDirection, companion.m1759getEnterdhqQ8s()) || FocusDirection.m1754equalsimpl0(focusDirection, companion.m1760getExitdhqQ8s())) {
            return false;
        }
        Integer numM1766toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m1766toAndroidFocusDirection3ESFkO8(focusDirection);
        if (numM1766toAndroidFocusDirection3ESFkO8 == null) {
            throw v7.v("Invalid focus direction");
        }
        int iIntValue = numM1766toAndroidFocusDirection3ESFkO8.intValue();
        View viewM2753findNextViewInEmbeddedView3ESFkO8 = m2753findNextViewInEmbeddedView3ESFkO8(focusDirection);
        if (viewM2753findNextViewInEmbeddedView3ESFkO8 != null) {
            return FocusInteropUtils_androidKt.requestInteropFocus(viewM2753findNextViewInEmbeddedView3ESFkO8, Integer.valueOf(iIntValue), null);
        }
        return false;
    }

    /* JADX INFO: renamed from: moveFocusInChildrenCurrent-3ESFkO8, reason: not valid java name */
    private final boolean m2757moveFocusInChildrenCurrent3ESFkO8(int focusDirection) {
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m1754equalsimpl0(focusDirection, companion.m1759getEnterdhqQ8s()) || FocusDirection.m1754equalsimpl0(focusDirection, companion.m1760getExitdhqQ8s())) {
            return false;
        }
        Integer numM1766toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m1766toAndroidFocusDirection3ESFkO8(focusDirection);
        if (numM1766toAndroidFocusDirection3ESFkO8 == null) {
            throw v7.v("Invalid focus direction");
        }
        int iIntValue = numM1766toAndroidFocusDirection3ESFkO8.intValue();
        Rect embeddedViewFocusRect = getEmbeddedViewFocusRect();
        android.graphics.Rect androidRect = embeddedViewFocusRect != null ? RectHelper_androidKt.toAndroidRect(embeddedViewFocusRect) : null;
        FocusFinderCompat companion2 = FocusFinderCompat.INSTANCE.getInstance();
        View viewFindNextFocus = androidRect == null ? companion2.findNextFocus(this, findFocus(), iIntValue) : companion2.findNextFocusFromRect(this, androidRect, iIntValue);
        if (viewFindNextFocus != null) {
            return FocusInteropUtils_androidKt.requestInteropFocus(viewFindNextFocus, Integer.valueOf(iIntValue), androidRect);
        }
        return false;
    }

    /* JADX INFO: renamed from: moveFocusInChildrenViewFocusFix-3ESFkO8, reason: not valid java name */
    private final boolean m2758moveFocusInChildrenViewFocusFix3ESFkO8(int focusDirection) {
        AndroidViewsHandler androidViewsHandler;
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m1754equalsimpl0(focusDirection, companion.m1759getEnterdhqQ8s()) || FocusDirection.m1754equalsimpl0(focusDirection, companion.m1760getExitdhqQ8s()) || !hasFocus() || (androidViewsHandler = this._androidViewsHandler) == null) {
            return false;
        }
        Integer numM1766toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m1766toAndroidFocusDirection3ESFkO8(focusDirection);
        if (numM1766toAndroidFocusDirection3ESFkO8 == null) {
            throw v7.v("Invalid focus direction");
        }
        int iIntValue = numM1766toAndroidFocusDirection3ESFkO8.intValue();
        View rootView = getRootView();
        Intrinsics.i(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) rootView;
        View viewFindFocus = viewGroup.findFocus();
        if (viewFindFocus == null) {
            throw new IllegalStateException("view hasFocus but root can't find it");
        }
        View viewFindNextFocus = FocusFinderCompat.INSTANCE.getInstance().findNextFocus(viewGroup, viewFindFocus, iIntValue);
        if (!FocusOwnerImplKt.m1780is1dFocusSearch3ESFkO8(focusDirection) || !androidViewsHandler.hasFocus()) {
            Rect embeddedViewFocusRect = getEmbeddedViewFocusRect();
            androidRect = embeddedViewFocusRect != null ? RectHelper_androidKt.toAndroidRect(embeddedViewFocusRect) : null;
            if (viewFindNextFocus != null && androidRect != null) {
                viewGroup.offsetDescendantRectToMyCoords(this, androidRect);
                viewGroup.offsetRectIntoDescendantCoords(viewFindNextFocus, androidRect);
            }
        }
        if (viewFindNextFocus == null || viewFindNextFocus == viewFindFocus) {
            return false;
        }
        View focusedChild = androidViewsHandler.getFocusedChild();
        ViewParent parent = viewFindNextFocus.getParent();
        while (parent != null && parent != focusedChild) {
            parent = parent.getParent();
        }
        if (parent == null) {
            return false;
        }
        return FocusInteropUtils_androidKt.requestInteropFocus(viewFindNextFocus, Integer.valueOf(iIntValue), androidRect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void outOfFrameRunnable$lambda$0(AndroidComposeView androidComposeView) {
        Trace.beginSection("AndroidOwner:outOfFrameExecutor");
        while (!androidComposeView.outOfFrameQueue.isEmpty()) {
            try {
                ((Function0) androidComposeView.outOfFrameQueue.removeLast()).invoke();
            } finally {
                Trace.endSection();
            }
        }
        Unit unit = Unit.f186387a;
    }

    /* JADX INFO: renamed from: pack-ZIaKswc, reason: not valid java name */
    private final long m2759packZIaKswc(int a7, int b4) {
        long j2 = a7;
        w.Companion companion = w.INSTANCE;
        return ((long) b4) | (j2 << 32);
    }

    private final void recalculateWindowPosition() {
        if (this.forceUseMatrixCache) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.lastMatrixRecalculationAnimationTime) {
            this.lastMatrixRecalculationAnimationTime = jCurrentAnimationTimeMillis;
            recalculateWindowViewTransforms();
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            view.getLocationOnScreen(this.tmpPositionArray);
            int[] iArr = this.tmpPositionArray;
            float f = iArr[0];
            float f4 = iArr[1];
            view.getLocationInWindow(iArr);
            this.windowPosition = Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(f - this.tmpPositionArray[0])) << 32) | (((long) Float.floatToRawIntBits(f4 - r0[1])) & BodyPartID.bodyIdMax));
        }
    }

    private final void recalculateWindowViewTransforms() {
        this.matrixToWindow.mo2788calculateMatrixToWindowEL8BTi8(this, this.viewToWindowMatrix);
        InvertMatrixKt.m2800invertToJiSxe2E(this.viewToWindowMatrix, this.windowToViewMatrix);
    }

    private final void scheduleMeasureAndLayout(LayoutNode nodeToRemeasure) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (nodeToRemeasure != null) {
            while (nodeToRemeasure != null && nodeToRemeasure.getMeasuredByParent$ui() == LayoutNode.UsageByParent.InMeasureBlock && childSizeCanAffectParentSize(nodeToRemeasure)) {
                nodeToRemeasure = nodeToRemeasure.getParent$ui();
            }
            if (nodeToRemeasure == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public static /* synthetic */ void scheduleMeasureAndLayout$default(AndroidComposeView androidComposeView, LayoutNode layoutNode, int i, Object obj2) {
        if ((i & 1) != 0) {
            layoutNode = null;
        }
        androidComposeView.scheduleMeasureAndLayout(layoutNode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendHoverExitEvent$lambda$0(AndroidComposeView androidComposeView) {
        androidComposeView.hoverExitReceived = false;
        MotionEvent motionEvent = androidComposeView.previousMotionEvent;
        Intrinsics.h(motionEvent);
        if (motionEvent.getActionMasked() != 10) {
            throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
        }
        androidComposeView.m2760sendMotionEvent8iAsVTc(motionEvent);
    }

    /* JADX INFO: renamed from: sendMotionEvent-8iAsVTc, reason: not valid java name */
    private final int m2760sendMotionEvent8iAsVTc(MotionEvent motionEvent) {
        PointerInputEventData pointerInputEventData;
        if (this.keyboardModifiersRequireUpdate) {
            this.keyboardModifiersRequireUpdate = false;
            this._windowInfo.m2801setKeyboardModifiers5xRPYO0(PointerKeyboardModifiers.m2485constructorimpl(motionEvent.getMetaState()));
        }
        PointerInputEvent pointerInputEventConvertToPointerInputEvent$ui = this.motionEventAdapter.convertToPointerInputEvent$ui(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        if (pointerInputEventConvertToPointerInputEvent$ui == null) {
            this.pointerInputEventProcessor.processCancel();
            return PointerInputEventProcessorKt.ProcessResult(false, false, false);
        }
        List<PointerInputEventData> pointers = pointerInputEventConvertToPointerInputEvent$ui.getPointers();
        int size = pointers.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                pointerInputEventData = pointers.get(size);
                if (pointerInputEventData.getDown() && (actionMasked == 0 || actionMasked == 5 || !ComposeUiFlags.isCanScrollUsingLastDownEventFixEnabled)) {
                    break;
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
        } else {
            pointerInputEventData = null;
        }
        PointerInputEventData pointerInputEventData2 = pointerInputEventData;
        if (pointerInputEventData2 != null) {
            this.lastDownPointerPosition = pointerInputEventData2.getPosition();
        }
        int iM2479processBIzXfog = this.pointerInputEventProcessor.m2479processBIzXfog(pointerInputEventConvertToPointerInputEvent$ui, this, isInBounds(motionEvent));
        pointerInputEventConvertToPointerInputEvent$ui.setMotionEvent(null);
        if ((actionMasked != 0 && actionMasked != 5) || (iM2479processBIzXfog & 1) != 0) {
            return iM2479processBIzXfog;
        }
        this.motionEventAdapter.endStream(motionEvent.getPointerId(motionEvent.getActionIndex()));
        return iM2479processBIzXfog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendSimulatedEvent(MotionEvent motionEvent, int action, long eventTime, boolean forceHover) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (action != 9 && action != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i = 0; i < pointerCount; i++) {
            pointerPropertiesArr[i] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i2 = 0; i2 < pointerCount; i2++) {
            pointerCoordsArr[i2] = new MotionEvent.PointerCoords();
        }
        int i3 = 0;
        while (i3 < pointerCount) {
            int i5 = ((actionIndex < 0 || i3 < actionIndex) ? 0 : 1) + i3;
            motionEvent.getPointerProperties(i5, pointerPropertiesArr[i3]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i3];
            motionEvent.getPointerCoords(i5, pointerCoords);
            float f = pointerCoords.x;
            long jMo2502localToScreenMKHz9U = mo2502localToScreenMKHz9U(Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(pointerCoords.y)) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(f)) << 32)));
            pointerCoords.x = Float.intBitsToFloat((int) (jMo2502localToScreenMKHz9U >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jMo2502localToScreenMKHz9U & BodyPartID.bodyIdMax));
            i3++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? eventTime : motionEvent.getDownTime(), eventTime, action, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), forceHover ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        PointerInputEvent pointerInputEventConvertToPointerInputEvent$ui = this.motionEventAdapter.convertToPointerInputEvent$ui(motionEventObtain, this);
        Intrinsics.h(pointerInputEventConvertToPointerInputEvent$ui);
        this.pointerInputEventProcessor.m2479processBIzXfog(pointerInputEventConvertToPointerInputEvent$ui, this, true);
        motionEventObtain.recycle();
    }

    public static /* synthetic */ void sendSimulatedEvent$default(AndroidComposeView androidComposeView, MotionEvent motionEvent, int i, long j2, boolean z, int i2, Object obj2) {
        if ((i2 & 8) != 0) {
            z = true;
        }
        androidComposeView.sendSimulatedEvent(motionEvent, i, j2, z);
    }

    private void setDensity(Density density) {
        this.density.setValue(density);
    }

    private void setFontFamilyResolver(FontFamily.Resolver resolver) {
        this.fontFamilyResolver.setValue(resolver);
    }

    private void setLayoutDirection(LayoutDirection layoutDirection) {
        this.layoutDirection.setValue(layoutDirection);
    }

    private final void set_viewTreeOwners(ViewTreeOwners viewTreeOwners) {
        this._viewTreeOwners.setValue(viewTreeOwners);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startDrag-12SF9DM, reason: not valid java name */
    public final boolean m2761startDrag12SF9DM(DragAndDropTransferData transferData, long decorationSize, Function1<? super DrawScope, Unit> drawDragDecoration) {
        Resources resources = getContext().getResources();
        return AndroidComposeViewStartDragAndDropN.INSTANCE.startDragAndDrop(this, transferData, new ComposeDragShadowBuilder(DensityKt.Density(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), decorationSize, drawDragDecoration, null));
    }

    private final void updateConfiguration(Configuration newConfig) {
        Configuration configuration = getConfiguration();
        if (Intrinsics.f(configuration, newConfig)) {
            return;
        }
        setConfiguration(new Configuration(newConfig));
        if (configuration.fontScale != newConfig.fontScale || configuration.densityDpi != newConfig.densityDpi) {
            setDensity(AndroidDensity_androidKt.Density(getContext()));
        }
        if (AndroidComposeView_androidKt.diffForWindowMetricsChanged(configuration, newConfig)) {
            updateWindowMetrics();
        }
        if (getFontWeightAdjustmentCompat(configuration) != getFontWeightAdjustmentCompat(newConfig)) {
            setFontFamilyResolver(FontFamilyResolver_androidKt.createFontFamilyResolver(getContext()));
        }
    }

    private final void updatePositionCacheAndDispatch() {
        getLocationOnScreen(this.tmpPositionArray);
        long j2 = this.globalPosition;
        int iM3334getXimpl = IntOffset.m3334getXimpl(j2);
        int iM3335getYimpl = IntOffset.m3335getYimpl(j2);
        int[] iArr = this.tmpPositionArray;
        boolean z = false;
        int i = iArr[0];
        if (iM3334getXimpl != i || iM3335getYimpl != iArr[1] || this.lastMatrixRecalculationAnimationTime < 0) {
            this.globalPosition = IntOffset.m3329constructorimpl((((long) i) << 32) | (((long) iArr[1]) & BodyPartID.bodyIdMax));
            if (iM3334getXimpl != Integer.MAX_VALUE && iM3335getYimpl != Integer.MAX_VALUE) {
                getRoot().getLayoutDelegate().getMeasurePassDelegate().notifyChildrenUsingCoordinatesWhilePlacing();
                z = true;
            }
        }
        recalculateWindowPosition();
        View rootView = this._rootView;
        if (rootView == null) {
            rootView = getRootView();
            this._rootView = rootView;
        }
        getRectManager().m2842updateOffsetsgTq6Wqs(this.globalPosition, IntOffsetKt.m3346roundk4lQ0M(this.windowPosition), this.viewToWindowMatrix, rootView.getWidth(), rootView.getHeight());
        this.measureAndLayoutDelegate.dispatchOnPositionedCallbacks(z);
        getRectManager().dispatchCallbacks();
    }

    private final void updateWindowMetrics() {
        MutableState mutableState = this._windowInfo._containerSize;
        if (mutableState != null) {
            mutableState.setValue(AndroidWindowInfo_androidKt.calculateWindowSize(this));
        }
    }

    public final void addAndroidView(@NotNull AndroidViewHolder view, @NotNull final LayoutNode layoutNode) {
        getAndroidViewsHandler$ui().getHolderToLayoutNode().put(view, layoutNode);
        getAndroidViewsHandler$ui().addView(view);
        getAndroidViewsHandler$ui().getLayoutNodeToHolder().put(layoutNode, view);
        view.setImportantForAccessibility(1);
        ViewCompat.setAccessibilityDelegate(view, new AccessibilityDelegateCompat() { // from class: androidx.compose.ui.platform.AndroidComposeView.addAndroidView.1
            /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
            @Override // androidx.core.view.AccessibilityDelegateCompat
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onInitializeAccessibilityNodeInfo(android.view.View r5, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r6) {
                /*
                    Method dump skipped, instruction units count: 216
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.AnonymousClass1.onInitializeAccessibilityNodeInfo(android.view.View, androidx.core.view.accessibility.AccessibilityNodeInfoCompat):void");
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> views, int direction, int focusableMode) {
        if (!ComposeUiFlags.isBypassUnfocusableComposeViewEnabled) {
            super.addFocusables(views, direction, focusableMode);
            return;
        }
        if (getFocusOwner().hasFocusableContent()) {
            super.addFocusables(views, direction, focusableMode);
            if (getFocusOwner().hasNonInteropFocusableContent() || views == null) {
                return;
            }
            views.remove(this);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View child) {
        addView(child, -1);
    }

    @Override // android.view.View
    public void autofill(@NotNull SparseArray<AutofillValue> values) {
        AndroidAutofillManager androidAutofillManager;
        if (autofillSupported()) {
            if (ComposeUiFlags.isSemanticAutofillEnabled && (androidAutofillManager = this._autofillManager) != null) {
                androidAutofillManager.performAutofill(values);
            }
            AndroidAutofill androidAutofill = this._autofill;
            if (androidAutofill != null) {
                AndroidAutofill_androidKt.performAutofill(androidAutofill, values);
            }
        }
    }

    public final Object boundsUpdatesAccessibilityEventLoop(@NotNull Continuation<? super Unit> continuation) {
        Object objBoundsUpdatesEventLoop$ui = this.composeAccessibilityDelegate.boundsUpdatesEventLoop$ui(continuation);
        return objBoundsUpdatesEventLoop$ui == fim.a.COROUTINE_SUSPENDED ? objBoundsUpdatesEventLoop$ui : Unit.f186387a;
    }

    public final Object boundsUpdatesContentCaptureEventLoop(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objBoundsUpdatesEventLoop$ui = this.contentCaptureManager.boundsUpdatesEventLoop$ui(continuation);
        return objBoundsUpdatesEventLoop$ui == fim.a.COROUTINE_SUSPENDED ? objBoundsUpdatesEventLoop$ui : Unit.f186387a;
    }

    @Override // androidx.compose.ui.node.Owner
    /* JADX INFO: renamed from: calculateLocalPosition-MK-Hz9U */
    public long mo2731calculateLocalPositionMKHz9U(long positionInWindow) {
        recalculateWindowPosition();
        return Matrix.m2055mapMKHz9U(this.windowToViewMatrix, positionInWindow);
    }

    @Override // androidx.compose.ui.node.Owner
    /* JADX INFO: renamed from: calculatePositionInWindow-MK-Hz9U */
    public long mo2732calculatePositionInWindowMKHz9U(long localPosition) {
        recalculateWindowPosition();
        return Matrix.m2055mapMKHz9U(this.viewToWindowMatrix, localPosition);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int direction) {
        return this.composeAccessibilityDelegate.m2771canScroll0AR0LA0$ui(false, direction, this.lastDownPointerPosition);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int direction) {
        return this.composeAccessibilityDelegate.m2771canScroll0AR0LA0$ui(true, direction, this.lastDownPointerPosition);
    }

    @Override // androidx.compose.ui.focus.PlatformFocusOwner
    public void clearOwnerFocus() {
        if (isFocused() || (!ComposeUiFlags.isViewFocusFixEnabled && hasFocus())) {
            clearFocus();
        } else if (hasFocus()) {
            View viewFindFocus = findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            clearFocus();
        }
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public OwnedLayer createLayer(@NotNull Function2<? super Canvas, ? super GraphicsLayer, Unit> drawBlock, @NotNull Function0<Unit> invalidateParentLayer, GraphicsLayer explicitLayer) {
        if (explicitLayer != null) {
            return new GraphicsLayerOwnerLayer(explicitLayer, null, this, drawBlock, invalidateParentLayer);
        }
        OwnedLayer ownedLayerPop = this.layerCache.pop();
        if (ownedLayerPop == null) {
            return new GraphicsLayerOwnerLayer(getGraphicsContext().createGraphicsLayer(), getGraphicsContext(), this, drawBlock, invalidateParentLayer);
        }
        ownedLayerPop.reuseLayer(drawBlock, invalidateParentLayer);
        return ownedLayerPop;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NotNull android.graphics.Canvas canvas) throws Throwable {
        if (!isAttachedToWindow()) {
            invalidateLayers(getRoot());
        }
        Owner.measureAndLayout$default(this, false, 1, null);
        Snapshot.INSTANCE.notifyObjectsInitialized();
        this.isDrawingContent = true;
        CanvasHolder canvasHolder = this.canvasHolder;
        android.graphics.Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
        getRoot().draw$ui(canvasHolder.getAndroidCanvas(), null);
        canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
        if (this.dirtyLayers.isNotEmpty()) {
            int size = this.dirtyLayers.get_size();
            for (int i = 0; i < size; i++) {
                this.dirtyLayers.get(i).updateDisplayList();
            }
        }
        if (ViewLayer.INSTANCE.getShouldUseDispatchDraw()) {
            int iSave = canvas.save();
            canvas.clipRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(iSave);
        }
        this.dirtyLayers.clear();
        this.isDrawingContent = false;
        MutableObjectList<OwnedLayer> mutableObjectList = this.postponedDirtyLayers;
        if (mutableObjectList != null) {
            Intrinsics.h(mutableObjectList);
            this.dirtyLayers.addAll(mutableObjectList);
            mutableObjectList.clear();
        }
        if (this.isArrEnabled) {
            Api35Impl.setRequestedFrameRate(this, this.currentFrameRate);
            View view = this.frameRateCategoryView;
            if (view == null) {
                Intrinsics.r("frameRateCategoryView");
                throw null;
            }
            Api35Impl.setRequestedFrameRate(view, this.currentFrameRateCategory);
            if (!Float.isNaN(this.currentFrameRateCategory)) {
                View view2 = this.frameRateCategoryView;
                if (view2 == null) {
                    Intrinsics.r("frameRateCategoryView");
                    throw null;
                }
                view2.invalidate();
                View view3 = this.frameRateCategoryView;
                if (view3 == null) {
                    Intrinsics.r("frameRateCategoryView");
                    throw null;
                }
                drawChild(canvas, view3, getDrawingTime());
            }
            this.currentFrameRate = Float.NaN;
            this.currentFrameRateCategory = Float.NaN;
        }
        getRectManager().dispatchCallbacks();
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(@NotNull MotionEvent motionEvent) {
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            if (motionEvent.getActionMasked() == 8) {
                this.hoverExitReceived = false;
            } else {
                this.sendHoverExitEvent.run();
            }
        }
        if (isBadMotionEvent(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 8) {
            return motionEvent.isFromSource(4194304) ? handleRotaryEvent(motionEvent) : (m2755handleMotionEvent8iAsVTc(motionEvent) & 1) != 0;
        }
        if (motionEvent.isFromSource(PKIFailureInfo.badSenderNonce)) {
            AndroidIndirectPointerEvent androidIndirectPointerEventM2424convertToIndirectPointerEventk92h6UU$ui = this.motionEventAdapter.m2424convertToIndirectPointerEventk92h6UU$ui(motionEvent, this.primaryDirectionalMotionAxisOverride);
            if (androidIndirectPointerEventM2424convertToIndirectPointerEventk92h6UU$ui == null) {
                getFocusOwner().dispatchIndirectPointerCancel();
                this.indirectPointerNavigationGestureDetector.cancelCurrentEventStream();
                return true;
            }
            if (handleIndirectPointerEvent(androidIndirectPointerEventM2424convertToIndirectPointerEventk92h6UU$ui)) {
                return true;
            }
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(@NotNull MotionEvent event) {
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            this.sendHoverExitEvent.run();
        }
        if (!isBadMotionEvent(event) && isAttachedToWindow()) {
            this.composeAccessibilityDelegate.dispatchHoverEvent$ui(event);
            int actionMasked = event.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && isInBounds(event)) {
                    if (event.getToolType(0) == 3 && event.getButtonState() != 0) {
                        return false;
                    }
                    MotionEvent motionEvent = this.previousMotionEvent;
                    if (motionEvent != null) {
                        motionEvent.recycle();
                    }
                    this.previousMotionEvent = MotionEvent.obtainNoHistory(event);
                    this.hoverExitReceived = true;
                    postDelayed(this.sendHoverExitEvent, 8L);
                    return false;
                }
            } else if (!isPositionChanged(event)) {
                return false;
            }
            if ((m2755handleMotionEvent8iAsVTc(event) & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(@NotNull KeyEvent event) {
        if (!isFocused()) {
            return getFocusOwner().mo1773dispatchKeyEventYhN2O0w(androidx.compose.ui.input.key.KeyEvent.m2385constructorimpl(event), new C19091(event));
        }
        this._windowInfo.m2801setKeyboardModifiers5xRPYO0(PointerKeyboardModifiers.m2485constructorimpl(event.getMetaState()));
        return FocusOwner.m1770dispatchKeyEventYhN2O0w$default(getFocusOwner(), androidx.compose.ui.input.key.KeyEvent.m2385constructorimpl(event), null, 2, null) || super.dispatchKeyEvent(event);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(@NotNull KeyEvent event) {
        return (isFocused() && getFocusOwner().mo1772dispatchInterceptedSoftKeyboardEventZmokQxo(androidx.compose.ui.input.key.KeyEvent.m2385constructorimpl(event))) || super.dispatchKeyEventPreIme(event);
    }

    @Override // androidx.compose.ui.node.Owner
    /* JADX INFO: renamed from: dispatchOnScrollChanged-k-4lQ0M */
    public void mo2733dispatchOnScrollChangedk4lQ0M(long delta) {
        INSTANCE.dispatchOnScrollChanged(getViewTreeObserver());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideStructure(@NotNull ViewStructure structure) {
        super.dispatchProvideStructure(structure);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@NotNull MotionEvent motionEvent) {
        Object objM2780boximpl;
        FocusTargetNode activeFocusTargetNode;
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            MotionEvent motionEvent2 = this.previousMotionEvent;
            Intrinsics.h(motionEvent2);
            if (motionEvent.getActionMasked() != 0 || hasChangedDevices(motionEvent, motionEvent2)) {
                this.sendHoverExitEvent.run();
            } else {
                this.hoverExitReceived = false;
            }
        }
        if (isBadMotionEvent(motionEvent) || !isAttachedToWindow() || (motionEvent.getActionMasked() == 2 && !isPositionChanged(motionEvent))) {
            return false;
        }
        int iM2755handleMotionEvent8iAsVTc = m2755handleMotionEvent8iAsVTc(motionEvent);
        if ((iM2755handleMotionEvent8iAsVTc & 2) != 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        boolean z = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
        boolean z3 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
        if (z && z3) {
            Object parent = getParent();
            View view = parent instanceof View ? (View) parent : null;
            if (view == null || (objM2780boximpl = view.getTag(R$id.auto_clear_focus_behavior_tag)) == null) {
                objM2780boximpl = AutoClearFocusBehavior.m2780boximpl(AutoClearFocusBehavior.INSTANCE.m2787getDefault4UtRPd4());
            }
            if (Intrinsics.f(objM2780boximpl, AutoClearFocusBehavior.m2780boximpl(AutoClearFocusBehavior.INSTANCE.m2786getCursorBased4UtRPd4())) && (activeFocusTargetNode = getFocusOwner().getActiveFocusTargetNode()) != null) {
                if (!LayoutCoordinatesKt.boundsInRoot(DelegatableNodeKt.requireLayoutCoordinates(activeFocusTargetNode)).m1847containsk4lQ0M(Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(motionEvent.getX())) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getY())) & BodyPartID.bodyIdMax)))) {
                    FocusManager.clearFocus$default(getFocusOwner(), false, 1, null);
                }
            }
        }
        return (iM2755handleMotionEvent8iAsVTc & 1) != 0;
    }

    public final void drawAndroidView(@NotNull AndroidViewHolder view, @NotNull android.graphics.Canvas canvas) {
        getAndroidViewsHandler$ui().drawView(view, canvas);
    }

    public final View findViewByAccessibilityIdTraversal(int accessibilityId) throws IllegalAccessException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return findViewByAccessibilityIdRootedAtCurrentView(accessibilityId, this);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(accessibilityId));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View focused, int direction) {
        Rect rectCalculateFocusRectRelativeTo;
        if (focused == null || this.measureAndLayoutDelegate.getDuringMeasureLayout()) {
            return super.focusSearch(focused, direction);
        }
        View rootView = getRootView();
        Intrinsics.i(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, focused, direction);
        if (viewFindNextFocus == null || !AndroidComposeView_androidKt.containsDescendant(this, viewFindNextFocus)) {
            viewFindNextFocus = null;
        }
        if (focused != this || (rectCalculateFocusRectRelativeTo = getFocusOwner().getFocusRect()) == null) {
            rectCalculateFocusRectRelativeTo = FocusInteropUtils_androidKt.calculateFocusRectRelativeTo(focused, this);
        }
        FocusDirection focusDirection = FocusInteropUtils_androidKt.toFocusDirection(direction);
        int value = focusDirection != null ? focusDirection.getValue() : FocusDirection.INSTANCE.m1758getDowndhqQ8s();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        if (getFocusOwner().mo1774focusSearchULY8qGw(value, rectCalculateFocusRectRelativeTo, new AndroidComposeView$focusSearch$searchResult$1(ref$ObjectRef)) == null) {
            return focused;
        }
        if (ref$ObjectRef.f186409a != null) {
            if (viewFindNextFocus != null) {
                if (FocusOwnerImplKt.m1780is1dFocusSearch3ESFkO8(value)) {
                    if (!ComposeUiFlags.isBypassUnfocusableComposeViewEnabled) {
                        return super.focusSearch(focused, direction);
                    }
                } else if (TwoDimensionalFocusSearchKt.m1817isBetterCandidateI7lrPNg(FocusTraversalKt.focusRect((FocusTargetNode) ref$ObjectRef.f186409a), FocusInteropUtils_androidKt.calculateFocusRectRelativeTo(viewFindNextFocus, this), rectCalculateFocusRectRelativeTo, value)) {
                }
            }
            return this;
        }
        if (viewFindNextFocus == null) {
            return super.focusSearch(focused, direction);
        }
        return viewFindNextFocus;
    }

    @Override // androidx.compose.ui.focus.PlatformFocusOwner
    public void focusTargetAvailable() {
        if (getFocusOwner().getRootState().getHasFocus()) {
            return;
        }
        focusableViewAvailable(this);
    }

    @Override // androidx.compose.ui.node.Owner
    public void forceMeasureTheSubtree(@NotNull LayoutNode layoutNode, boolean affectsLookahead) {
        this.measureAndLayoutDelegate.forceMeasureTheSubtree(layoutNode, affectsLookahead);
    }

    @NotNull
    public final AndroidViewsHandler getAndroidViewsHandler$ui() {
        if (this._androidViewsHandler == null) {
            AndroidViewsHandler androidViewsHandler = new AndroidViewsHandler(getContext());
            this._androidViewsHandler = androidViewsHandler;
            addView(androidViewsHandler);
            requestLayout();
        }
        AndroidViewsHandler androidViewsHandler2 = this._androidViewsHandler;
        Intrinsics.h(androidViewsHandler2);
        return androidViewsHandler2;
    }

    @Override // androidx.compose.ui.node.Owner
    public Autofill getAutofill() {
        return this._autofill;
    }

    @Override // androidx.compose.ui.node.Owner
    public androidx.compose.ui.autofill.AutofillManager getAutofillManager() {
        return this._autofillManager;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public AutofillTree getAutofillTree() {
        return this.autofillTree;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Configuration getConfiguration() {
        return (Configuration) this.configuration.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: getContentCaptureManager$ui, reason: from getter */
    public final AndroidContentCaptureManager getContentCaptureManager() {
        return this.contentCaptureManager;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public Density getDensity() {
        return (Density) this.density.getValue();
    }

    @Override // androidx.compose.ui.focus.PlatformFocusOwner
    public Rect getEmbeddedViewFocusRect() {
        if (isFocused()) {
            return getFocusOwner().getFocusRect();
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return FocusInteropUtils_androidKt.calculateFocusRectRelativeTo(viewFindFocus, this);
        }
        return null;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public FocusOwner getFocusOwner() {
        return this.focusOwner;
    }

    @Override // android.view.View
    public void getFocusedRect(@NotNull android.graphics.Rect rect) {
        Rect embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.getLeft());
            rect.top = Math.round(embeddedViewFocusRect.getTop());
            rect.right = Math.round(embeddedViewFocusRect.getRight());
            rect.bottom = Math.round(embeddedViewFocusRect.getBottom());
            return;
        }
        if (Intrinsics.f(getFocusOwner().mo1774focusSearchULY8qGw(FocusDirection.INSTANCE.m1758getDowndhqQ8s(), null, C19101.INSTANCE), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public FontFamily.Resolver getFontFamilyResolver() {
        return (FontFamily.Resolver) this.fontFamilyResolver.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public Font.ResourceLoader getFontLoader() {
        return this.fontLoader;
    }

    /* JADX INFO: renamed from: getFrameEndScheduler$ui, reason: from getter */
    public final LifecycleRetainedValuesStoreOwner.FrameEndScheduler getFrameEndScheduler() {
        return this.frameEndScheduler;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public GraphicsContext getGraphicsContext() {
        return this.graphicsContext;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.measureAndLayoutDelegate.getHasPendingMeasureOrLayout() || !this.outOfFrameQueue.isEmpty();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public InputModeManager getInputModeManager() {
        return this._inputModeManager;
    }

    @NotNull
    public final InsetsListener getInsetsListener() {
        return this.insetsListener;
    }

    /* JADX INFO: renamed from: getLastMatrixRecalculationAnimationTime$ui, reason: from getter */
    public final long getLastMatrixRecalculationAnimationTime() {
        return this.lastMatrixRecalculationAnimationTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View, android.view.ViewParent, androidx.compose.ui.node.Owner
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return (LayoutDirection) this.layoutDirection.getValue();
    }

    public long getMeasureIteration() {
        return this.measureAndLayoutDelegate.getMeasureIteration();
    }

    @NotNull
    public ModifierLocalManager getModifierLocalManager() {
        return this.modifierLocalManager;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public Placeable.PlacementScope getPlacementScope() {
        return PlaceableKt.PlacementScope(this);
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public PointerIconService getPointerIconService() {
        return this.pointerIconService;
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name and from getter */
    public final IndirectPointerEventPrimaryDirectionalMotionAxis getPrimaryDirectionalMotionAxisOverride() {
        return this.primaryDirectionalMotionAxisOverride;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public RectManager getRectManager() {
        return this.rectManager;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public RetainedValuesStore getRetainedValuesStore() {
        return this.retainedValuesStore;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public LayoutNode getRoot() {
        return this.root;
    }

    @NotNull
    public RootForTest getRootForTest() {
        return this.rootForTest;
    }

    public final boolean getScrollCaptureInProgress$ui() {
        ScrollCapture scrollCapture;
        if (Build.VERSION.SDK_INT < 31 || (scrollCapture = this.scrollCapture) == null) {
            return false;
        }
        return scrollCapture.getScrollCaptureInProgress();
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public SemanticsOwner getSemanticsOwner() {
        return this.semanticsOwner;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public LayoutNodeDrawScope getSharedDrawScope() {
        return this.sharedDrawScope;
    }

    @Override // androidx.compose.ui.node.Owner
    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? Api30Impl.INSTANCE.isShowingLayoutBounds(this) : this.showLayoutBounds;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public OwnerSnapshotObserver getSnapshotObserver() {
        return this.snapshotObserver;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public SoftwareKeyboardController getSoftwareKeyboardController() {
        return this.softwareKeyboardController;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public TextInputService getTextInputService() {
        return this.textInputService;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    public final RootForTest.UncaughtExceptionHandler getUncaughtExceptionHandler$ui() {
        return null;
    }

    @NotNull
    public View getView() {
        return this;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    public final ViewTreeOwners getViewTreeOwners() {
        return (ViewTreeOwners) this.viewTreeOwners.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public WindowInfo getWindowInfo() {
        return this._windowInfo;
    }

    /* JADX INFO: renamed from: get_autofillManager$ui, reason: from getter */
    public final AndroidAutofillManager get_autofillManager() {
        return this._autofillManager;
    }

    public void invalidateDescendants() {
        invalidateLayers(getRoot());
    }

    /* JADX INFO: renamed from: isArrEnabled$ui, reason: from getter */
    public final boolean getIsArrEnabled() {
        return this.isArrEnabled;
    }

    @Override // androidx.compose.ui.input.pointer.MatrixPositionCalculator
    /* JADX INFO: renamed from: localToScreen-58bKbWc */
    public void mo2422localToScreen58bKbWc(@NotNull float[] localTransform) {
        recalculateWindowPosition();
        Matrix.m2064timesAssign58bKbWc(localTransform, this.viewToWindowMatrix);
        AndroidComposeView_androidKt.m2777preTranslatecG2Xzmc(localTransform, Float.intBitsToFloat((int) (this.windowPosition >> 32)), Float.intBitsToFloat((int) (this.windowPosition & BodyPartID.bodyIdMax)), this.tmpMatrix);
    }

    @Override // androidx.compose.ui.input.pointer.PositionCalculator
    /* JADX INFO: renamed from: localToScreen-MK-Hz9U */
    public long mo2502localToScreenMKHz9U(long localPosition) {
        recalculateWindowPosition();
        long jM2055mapMKHz9U = Matrix.m2055mapMKHz9U(this.viewToWindowMatrix, localPosition);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.windowPosition >> 32)) + Float.intBitsToFloat((int) (jM2055mapMKHz9U >> 32));
        return Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.windowPosition & BodyPartID.bodyIdMax)) + Float.intBitsToFloat((int) (jM2055mapMKHz9U & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    @Override // androidx.compose.ui.node.Owner
    public void measureAndLayout(boolean sendPointerUpdate) {
        Function0<Unit> function0;
        if (this.measureAndLayoutDelegate.getHasPendingMeasureOrLayout() || this.measureAndLayoutDelegate.getHasPendingOnPositionedCallbacks()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (sendPointerUpdate) {
                try {
                    function0 = this.resendMotionEventOnLayout;
                } catch (Throwable th10) {
                    Trace.endSection();
                    throw th10;
                }
            } else {
                function0 = null;
            }
            if (this.measureAndLayoutDelegate.measureAndLayout(function0)) {
                requestLayout();
            }
            MeasureAndLayoutDelegate.dispatchOnPositionedCallbacks$default(this.measureAndLayoutDelegate, false, 1, null);
            dispatchPendingInteropLayoutCallbacks();
            Unit unit = Unit.f186387a;
            Trace.endSection();
        }
    }

    @Override // androidx.compose.ui.node.Owner
    /* JADX INFO: renamed from: measureAndLayout-0kLqBqw */
    public void mo2734measureAndLayout0kLqBqw(@NotNull LayoutNode layoutNode, long constraints) {
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            this.measureAndLayoutDelegate.m2673measureAndLayout0kLqBqw(layoutNode, constraints);
            if (!this.measureAndLayoutDelegate.getHasPendingMeasureOrLayout()) {
                MeasureAndLayoutDelegate.dispatchOnPositionedCallbacks$default(this.measureAndLayoutDelegate, false, 1, null);
                dispatchPendingInteropLayoutCallbacks();
            }
            getRectManager().dispatchCallbacks();
            Unit unit = Unit.f186387a;
            Trace.endSection();
        } catch (Throwable th10) {
            Trace.endSection();
            throw th10;
        }
    }

    @Override // androidx.compose.ui.focus.PlatformFocusOwner
    /* JADX INFO: renamed from: moveFocusInChildren-3ESFkO8 */
    public boolean mo1810moveFocusInChildren3ESFkO8(int focusDirection) {
        return ComposeUiFlags.isViewFocusFixEnabled ? m2758moveFocusInChildrenViewFocusFix3ESFkO8(focusDirection) : ComposeUiFlags.isBypassUnfocusableComposeViewEnabled ? m2756moveFocusInChildrenBypassUnfocusableComposeView3ESFkO8(focusDirection) : m2757moveFocusInChildrenCurrent3ESFkO8(focusDirection);
    }

    public final void notifyLayerIsDirty$ui(@NotNull OwnedLayer layer, boolean isDirty) {
        if (!isDirty) {
            if (this.isDrawingContent) {
                return;
            }
            this.dirtyLayers.remove(layer);
            MutableObjectList<OwnedLayer> mutableObjectList = this.postponedDirtyLayers;
            if (mutableObjectList != null) {
                mutableObjectList.remove(layer);
                return;
            }
            return;
        }
        if (!this.isDrawingContent) {
            this.dirtyLayers.add(layer);
            return;
        }
        MutableObjectList<OwnedLayer> mutableObjectList2 = this.postponedDirtyLayers;
        if (mutableObjectList2 == null) {
            mutableObjectList2 = new MutableObjectList<>(0, 1, null);
            this.postponedDirtyLayers = mutableObjectList2;
        }
        mutableObjectList2.add(layer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        LifecycleOwner lifecycleOwner2;
        AndroidAutofill androidAutofill;
        super.onAttachedToWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            setShowLayoutBounds(INSTANCE.getIsShowingLayoutBounds());
        }
        if (ComposeUiFlags.areWindowInsetsRulersEnabled) {
            this.insetsListener.onViewAttachedToWindow(this);
        }
        INSTANCE.addNotificationForSysPropsChange(this);
        this._windowInfo.setWindowFocused(hasWindowFocus());
        this._windowInfo.setOnInitializeContainerSize(new C19121());
        updateWindowMetrics();
        invalidateLayoutNodeMeasurement(getRoot());
        invalidateLayers(getRoot());
        getSnapshotObserver().startObserving$ui();
        if (autofillSupported() && (androidAutofill = this._autofill) != null) {
            AutofillCallback.INSTANCE.register(androidAutofill);
        }
        LifecycleOwner lifecycleOwner3 = ViewTreeLifecycleOwner.get(this);
        SavedStateRegistryOwner savedStateRegistryOwner = ViewTreeSavedStateRegistryOwner.get(this);
        ViewModelStoreOwner viewModelStoreOwner = ViewTreeViewModelStoreOwner.get(this);
        RetainedValuesStore retainedValuesStoreInstallLocalRetainedValuesStore = installLocalRetainedValuesStore(lifecycleOwner3, viewModelStoreOwner);
        if (retainedValuesStoreInstallLocalRetainedValuesStore == null) {
            retainedValuesStoreInstallLocalRetainedValuesStore = ForgetfulRetainedValuesStore.INSTANCE;
        }
        this.retainedValuesStore = retainedValuesStoreInstallLocalRetainedValuesStore;
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        Lifecycle lifecycle2 = null;
        if (viewTreeOwners == null || (lifecycleOwner3 != null && savedStateRegistryOwner != null && (lifecycleOwner3 != viewTreeOwners.getLifecycleOwner() || savedStateRegistryOwner != viewTreeOwners.getSavedStateRegistryOwner() || viewModelStoreOwner != viewTreeOwners.getViewModelStoreOwner()))) {
            if (lifecycleOwner3 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (savedStateRegistryOwner == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.removeObserver(this);
            }
            lifecycleOwner3.getLifecycle().addObserver(this);
            ViewTreeOwners viewTreeOwners2 = new ViewTreeOwners(lifecycleOwner3, savedStateRegistryOwner, viewModelStoreOwner);
            set_viewTreeOwners(viewTreeOwners2);
            Function1<? super ViewTreeOwners, Unit> function1 = this.onViewTreeOwnersAvailable;
            if (function1 != null) {
                function1.invoke(viewTreeOwners2);
            }
            this.onViewTreeOwnersAvailable = null;
        }
        this._inputModeManager.m2331setInputModeiuPiT84(isInTouchMode() ? InputMode.INSTANCE.m2329getTouchaOaMEAU() : InputMode.INSTANCE.m2328getKeyboardaOaMEAU());
        ViewTreeOwners viewTreeOwners3 = getViewTreeOwners();
        if (viewTreeOwners3 != null && (lifecycleOwner2 = viewTreeOwners3.getLifecycleOwner()) != null) {
            lifecycle2 = lifecycleOwner2.getLifecycle();
        }
        if (lifecycle2 == null) {
            throw v7.v("No lifecycle owner exists");
        }
        lifecycle2.addObserver(this);
        lifecycle2.addObserver(this.contentCaptureManager);
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (i >= 31) {
            AndroidComposeViewTranslationCallbackS.INSTANCE.setViewTranslationCallback(this);
        }
        AndroidAutofillManager androidAutofillManager = this._autofillManager;
        if (androidAutofillManager != null) {
            getFocusOwner().getListeners().add(androidAutofillManager);
            getSemanticsOwner().getListeners$ui().add(androidAutofillManager);
        }
        getFocusOwner().getListeners().add(this);
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        AndroidPlatformTextInputSession androidPlatformTextInputSession = (AndroidPlatformTextInputSession) SessionMutex.m1726getCurrentSessionimpl(this.textInputSessionMutex);
        return androidPlatformTextInputSession == null ? this.legacyTextInputServiceAndroid.getEditorHasFocus() : androidPlatformTextInputSession.isReadyForConnection();
    }

    @Override // android.view.View
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        updateConfiguration(newConfig);
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(@NotNull EditorInfo outAttrs) {
        AndroidPlatformTextInputSession androidPlatformTextInputSession = (AndroidPlatformTextInputSession) SessionMutex.m1726getCurrentSessionimpl(this.textInputSessionMutex);
        return androidPlatformTextInputSession == null ? this.legacyTextInputServiceAndroid.createInputConnection(outAttrs) : androidPlatformTextInputSession.createInputConnection(outAttrs);
    }

    @Override // android.view.View
    public void onCreateVirtualViewTranslationRequests(@NotNull long[] virtualIds, @NotNull int[] supportedFormats, @NotNull Consumer<ViewTranslationRequest> requestsCollector) {
        this.contentCaptureManager.onCreateVirtualViewTranslationRequests$ui(virtualIds, supportedFormats, requestsCollector);
    }

    @Override // androidx.compose.ui.node.Owner
    public void onDetach(@NotNull LayoutNode node) {
        AndroidAutofillManager androidAutofillManager;
        getLayoutNodes().remove(node.getSemanticsId());
        this.measureAndLayoutDelegate.onNodeDetached(node);
        requestClearInvalidObservations();
        if (autofillSupported() && ComposeUiFlags.isSemanticAutofillEnabled && (androidAutofillManager = this._autofillManager) != null) {
            androidAutofillManager.onDetach$ui(node);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        AndroidAutofill androidAutofill;
        LifecycleOwner lifecycleOwner;
        super.onDetachedFromWindow();
        if (ComposeUiFlags.areWindowInsetsRulersEnabled) {
            this.insetsListener.onViewDetachedFromWindow(this);
        }
        if (this.isArrEnabled) {
            View view = this.frameRateCategoryView;
            if (view == null) {
                Intrinsics.r("frameRateCategoryView");
                throw null;
            }
            removeView(view);
        }
        INSTANCE.removeNotificationForSysPropsChange(this);
        getSnapshotObserver().stopObserving$ui();
        this._windowInfo.setOnInitializeContainerSize(null);
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        Lifecycle lifecycle = (viewTreeOwners == null || (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) == null) ? null : lifecycleOwner.getLifecycle();
        if (lifecycle == null) {
            throw v7.v("No lifecycle owner exists");
        }
        lifecycle.removeObserver(this.contentCaptureManager);
        lifecycle.removeObserver(this);
        if (autofillSupported() && (androidAutofill = this._autofill) != null) {
            AutofillCallback.INSTANCE.unregister(androidAutofill);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry retainedValuesStoreEntry = this.lifecycleRetainedValuesStoreOwnerEntry;
        if (retainedValuesStoreEntry != null) {
            retainedValuesStoreEntry.release();
        }
        this.lifecycleRetainedValuesStoreOwnerEntry = null;
        if (Build.VERSION.SDK_INT >= 31) {
            AndroidComposeViewTranslationCallbackS.INSTANCE.clearViewTranslationCallback(this);
        }
        AndroidAutofillManager androidAutofillManager = this._autofillManager;
        if (androidAutofillManager != null) {
            getSemanticsOwner().getListeners$ui().remove(androidAutofillManager);
            getFocusOwner().getListeners().remove(androidAutofillManager);
        }
        getRectManager().removeScheduledCallback();
        getFocusOwner().getListeners().remove(this);
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
    }

    @Override // androidx.compose.ui.node.Owner
    public void onEndApplyChanges() {
        AndroidAutofillManager androidAutofillManager;
        if (this.observationClearRequested) {
            getSnapshotObserver().clearInvalidObservations$ui();
            this.observationClearRequested = false;
        }
        AndroidViewsHandler androidViewsHandler = this._androidViewsHandler;
        if (androidViewsHandler != null) {
            clearChildInvalidObservations(androidViewsHandler);
        }
        if (autofillSupported() && ComposeUiFlags.isSemanticAutofillEnabled && (androidAutofillManager = this._autofillManager) != null) {
            androidAutofillManager.onEndApplyChanges$ui();
        }
        while (this.endApplyChangesListeners.isNotEmpty() && this.endApplyChangesListeners.get(0) != null) {
            int size = this.endApplyChangesListeners.get_size();
            for (int i = 0; i < size; i++) {
                Function0<Unit> function0 = this.endApplyChangesListeners.get(i);
                this.endApplyChangesListeners.set(i, null);
                if (function0 != null) {
                    function0.invoke();
                }
            }
            this.endApplyChangesListeners.removeRange(0, size);
        }
    }

    @Override // android.view.View
    public void onFocusChanged(boolean gainFocus, int direction, android.graphics.Rect previouslyFocusedRect) {
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
        if (gainFocus || hasFocus()) {
            return;
        }
        getFocusOwner().releaseFocus();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.lastMatrixRecalculationAnimationTime = 0L;
        updatePositionCacheAndDispatch();
        dispatchConfigurationChangeIfNeeded();
    }

    @Override // androidx.compose.ui.node.Owner
    public void onInteropViewLayoutChange(@NotNull View view) {
        this.isPendingInteropViewLayoutChangeDispatch = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l2, int t2, int r2, int b4) {
        this.lastMatrixRecalculationAnimationTime = 0L;
        this.measureAndLayoutDelegate.measureAndLayout(this.resendMotionEventOnLayout);
        this.onMeasureConstraints = null;
        updatePositionCacheAndDispatch();
        if (this._androidViewsHandler != null) {
            getAndroidViewsHandler$ui().layout(0, 0, r2 - l2, b4 - t2);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void onLayoutChange(@NotNull LayoutNode layoutNode) {
        this.composeAccessibilityDelegate.onLayoutChange$ui(layoutNode);
        this.contentCaptureManager.onLayoutChange$ui();
    }

    @Override // androidx.compose.ui.node.Owner
    public void onLayoutNodeDeactivated(@NotNull LayoutNode layoutNode) {
        AndroidAutofillManager androidAutofillManager;
        if (autofillSupported() && ComposeUiFlags.isSemanticAutofillEnabled && (androidAutofillManager = this._autofillManager) != null) {
            androidAutofillManager.onLayoutNodeDeactivated$ui(layoutNode);
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                invalidateLayoutNodeMeasurement(getRoot());
            }
            long jM2752convertMeasureSpecI7RO_PI = m2752convertMeasureSpecI7RO_PI(widthMeasureSpec);
            w.Companion companion = w.INSTANCE;
            int i = (int) (jM2752convertMeasureSpecI7RO_PI >>> 32);
            int i2 = (int) (jM2752convertMeasureSpecI7RO_PI & BodyPartID.bodyIdMax);
            long jM2752convertMeasureSpecI7RO_PI2 = m2752convertMeasureSpecI7RO_PI(heightMeasureSpec);
            int i3 = (int) (BodyPartID.bodyIdMax & jM2752convertMeasureSpecI7RO_PI2);
            long jM3285fitPrioritizingHeightZbe2FdA = Constraints.INSTANCE.m3285fitPrioritizingHeightZbe2FdA(i, i2, (int) (jM2752convertMeasureSpecI7RO_PI2 >>> 32), i3);
            Constraints constraints = this.onMeasureConstraints;
            boolean zM3273equalsimpl0 = false;
            if (constraints == null) {
                this.onMeasureConstraints = Constraints.m3268boximpl(jM3285fitPrioritizingHeightZbe2FdA);
                this.wasMeasuredWithMultipleConstraints = false;
            } else {
                if (constraints != null) {
                    zM3273equalsimpl0 = Constraints.m3273equalsimpl0(constraints.getValue(), jM3285fitPrioritizingHeightZbe2FdA);
                }
                if (!zM3273equalsimpl0) {
                    this.wasMeasuredWithMultipleConstraints = true;
                }
            }
            this.measureAndLayoutDelegate.m2674updateRootConstraintsBRTryo0(jM3285fitPrioritizingHeightZbe2FdA);
            this.measureAndLayoutDelegate.measureOnly();
            setMeasuredDimension(getRoot().getWidth(), getRoot().getHeight());
            if (this._androidViewsHandler != null) {
                getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().getHeight(), 1073741824));
            }
            Unit unit = Unit.f186387a;
            Trace.endSection();
        } catch (Throwable th10) {
            Trace.endSection();
            throw th10;
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void onPostAttach(@NotNull LayoutNode node) {
        AndroidAutofillManager androidAutofillManager;
        if (autofillSupported() && ComposeUiFlags.isSemanticAutofillEnabled && (androidAutofillManager = this._autofillManager) != null) {
            androidAutofillManager.onPostAttach$ui(node);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void onPostLayoutNodeReused(@NotNull LayoutNode layoutNode, int oldSemanticsId) {
        AndroidAutofillManager androidAutofillManager;
        if (autofillSupported() && ComposeUiFlags.isSemanticAutofillEnabled && (androidAutofillManager = this._autofillManager) != null) {
            androidAutofillManager.onPostLayoutNodeReused$ui(layoutNode, oldSemanticsId);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void onPreAttach(@NotNull LayoutNode node) {
        getLayoutNodes().set(node.getSemanticsId(), node);
    }

    @Override // androidx.compose.ui.node.Owner
    public void onPreLayoutNodeReused(@NotNull LayoutNode layoutNode, int oldSemanticsId) {
        getLayoutNodes().remove(oldSemanticsId);
        getLayoutNodes().set(layoutNode.getSemanticsId(), layoutNode);
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure structure, int flags) {
        AndroidAutofillManager androidAutofillManager;
        if (!autofillSupported() || structure == null) {
            return;
        }
        if (ComposeUiFlags.isSemanticAutofillEnabled && (androidAutofillManager = this._autofillManager) != null) {
            androidAutofillManager.populateViewStructure(structure);
        }
        AndroidAutofill androidAutofill = this._autofill;
        if (androidAutofill != null) {
            AndroidAutofill_androidKt.populateViewStructure(androidAutofill, structure);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void onRequestMeasure(@NotNull LayoutNode layoutNode, boolean affectsLookahead, boolean forceRequest, boolean scheduleMeasureAndLayout) {
        if (affectsLookahead) {
            if (this.measureAndLayoutDelegate.requestLookaheadRemeasure(layoutNode, forceRequest) && scheduleMeasureAndLayout) {
                scheduleMeasureAndLayout(layoutNode);
                return;
            }
            return;
        }
        if (this.measureAndLayoutDelegate.requestRemeasure(layoutNode, forceRequest) && scheduleMeasureAndLayout) {
            scheduleMeasureAndLayout(layoutNode);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void onRequestRelayout(@NotNull LayoutNode layoutNode, boolean affectsLookahead, boolean forceRequest) {
        if (affectsLookahead) {
            if (this.measureAndLayoutDelegate.requestLookaheadRelayout(layoutNode, forceRequest)) {
                scheduleMeasureAndLayout$default(this, null, 1, null);
            }
        } else if (this.measureAndLayoutDelegate.requestRelayout(layoutNode, forceRequest)) {
            scheduleMeasureAndLayout$default(this, null, 1, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @NotNull
    public android.view.PointerIcon onResolvePointerIcon(@NotNull MotionEvent event, int pointerIndex) {
        PointerIcon stylusHoverIcon;
        int toolType = event.getToolType(pointerIndex);
        return (event.isFromSource(8194) || !event.isFromSource(16386) || !(toolType == 2 || toolType == 4) || (stylusHoverIcon = getPointerIconService().getCurrentStylusHoverIcon()) == null) ? super.onResolvePointerIcon(event, pointerIndex) : AndroidComposeViewVerificationHelperMethodsN.INSTANCE.toAndroidPointerIcon(getContext(), stylusHoverIcon);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NotNull LifecycleOwner owner) {
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(INSTANCE.getIsShowingLayoutBounds());
        }
        LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry retainedValuesStoreEntry = this.lifecycleRetainedValuesStoreOwnerEntry;
        if (retainedValuesStoreEntry != null) {
            LifecycleRetainedValuesStoreOwner.FrameEndScheduler frameEndScheduler = this.frameEndScheduler;
            Intrinsics.h(frameEndScheduler);
            retainedValuesStoreEntry.stopRetainingExitedValues(frameEndScheduler);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int layoutDirection) {
        if (this.superclassInitComplete) {
            LayoutDirection layoutDirection2 = FocusInteropUtils_androidKt.toLayoutDirection(layoutDirection);
            if (layoutDirection2 == null) {
                layoutDirection2 = LayoutDirection.Ltr;
            }
            setLayoutDirection(layoutDirection2);
        }
    }

    @Override // android.view.View
    public void onScrollCaptureSearch(@NotNull android.graphics.Rect localVisibleRect, @NotNull Point windowOffset, @NotNull Consumer<ScrollCaptureTarget> targets) {
        ScrollCapture scrollCapture;
        if (Build.VERSION.SDK_INT < 31 || (scrollCapture = this.scrollCapture) == null) {
            return;
        }
        scrollCapture.onScrollCaptureSearch(this, getSemanticsOwner(), getCoroutineContext(), targets);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public void onScrollChanged() {
        updatePositionCacheAndDispatch();
    }

    @Override // androidx.compose.ui.node.Owner
    public void onSemanticsChange() {
        this.composeAccessibilityDelegate.onSemanticsChange$ui();
        this.contentCaptureManager.onSemanticsChange$ui();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull LifecycleOwner owner) {
        LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry retainedValuesStoreEntry = this.lifecycleRetainedValuesStoreOwnerEntry;
        if (retainedValuesStoreEntry != null) {
            retainedValuesStoreEntry.startRetainingExitedValues();
        }
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public void onTouchModeChanged(boolean isInTouchMode) {
        this._inputModeManager.m2331setInputModeiuPiT84(isInTouchMode ? InputMode.INSTANCE.m2329getTouchaOaMEAU() : InputMode.INSTANCE.m2328getKeyboardaOaMEAU());
    }

    @Override // android.view.View
    public void onVirtualViewTranslationResponses(@NotNull LongSparseArray<ViewTranslationResponse> response) {
        AndroidContentCaptureManager androidContentCaptureManager = this.contentCaptureManager;
        androidContentCaptureManager.onVirtualViewTranslationResponses$ui(androidContentCaptureManager, response);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        boolean isShowingLayoutBounds;
        this._windowInfo.setWindowFocused(hasWindowFocus);
        this.keyboardModifiersRequireUpdate = true;
        super.onWindowFocusChanged(hasWindowFocus);
        if (!hasWindowFocus || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (isShowingLayoutBounds = INSTANCE.getIsShowingLayoutBounds())) {
            return;
        }
        setShowLayoutBounds(isShowingLayoutBounds);
        invalidateDescendants();
    }

    public final boolean recycle$ui(@NotNull OwnedLayer layer) {
        if (this.viewLayersContainer != null) {
            ViewLayer.INSTANCE.getShouldUseDispatchDraw();
        }
        this.layerCache.push(layer);
        this.dirtyLayers.remove(layer);
        return true;
    }

    @Override // androidx.compose.ui.node.Owner
    public void registerOnEndApplyChangesListener(@NotNull Function0<Unit> listener) {
        if (this.endApplyChangesListeners.contains(listener)) {
            return;
        }
        this.endApplyChangesListeners.add(listener);
    }

    public final void removeAndroidView(@NotNull AndroidViewHolder view) {
        getAndroidViewsHandler$ui().removeViewInLayout(view);
        HashMap<LayoutNode, AndroidViewHolder> layoutNodeToHolder = getAndroidViewsHandler$ui().getLayoutNodeToHolder();
        u0.d(layoutNodeToHolder).remove(getAndroidViewsHandler$ui().getHolderToLayoutNode().remove(view));
        view.setImportantForAccessibility(0);
    }

    @Override // androidx.compose.ui.node.Owner
    public void requestAutofill(@NotNull LayoutNode node) {
        AndroidAutofillManager androidAutofillManager;
        if (autofillSupported() && ComposeUiFlags.isSemanticAutofillEnabled && (androidAutofillManager = this._autofillManager) != null) {
            androidAutofillManager.requestAutofill$ui(node);
        }
    }

    public final void requestClearInvalidObservations() {
        this.observationClearRequested = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int direction, android.graphics.Rect previouslyFocusedRect) {
        return ComposeUiFlags.isViewFocusFixEnabled ? requestFocusViewFocusFix(direction, previouslyFocusedRect) : ComposeUiFlags.isBypassUnfocusableComposeViewEnabled ? requestFocusBypassUnfocusableComposeView(direction, previouslyFocusedRect) : requestFocusCurrent(direction, previouslyFocusedRect);
    }

    public final boolean requestFocusBypassUnfocusableComposeView(int direction, android.graphics.Rect previouslyFocusedRect) {
        if (isFocused()) {
            return true;
        }
        FocusDirection focusDirection = FocusInteropUtils_androidKt.toFocusDirection(direction);
        int value = focusDirection != null ? focusDirection.getValue() : FocusDirection.INSTANCE.m1759getEnterdhqQ8s();
        Boolean boolMo1774focusSearchULY8qGw = getFocusOwner().mo1774focusSearchULY8qGw(value, previouslyFocusedRect != null ? RectHelper_androidKt.toComposeRect(previouslyFocusedRect) : null, new AndroidComposeView$requestFocusBypassUnfocusableComposeView$requestFocusWithPrevRect$1(value));
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.f(boolMo1774focusSearchULY8qGw, bool)) {
            return true;
        }
        if (ComposeUiFlags.isIgnoreInvalidPrevFocusRectEnabled && Intrinsics.f(getFocusOwner().mo1774focusSearchULY8qGw(value, null, new AndroidComposeView$requestFocusBypassUnfocusableComposeView$requestFocusWithoutPrevRect$1(value)), bool)) {
            return true;
        }
        if (hasFocus() && FocusOwnerImplKt.m1780is1dFocusSearch3ESFkO8(value)) {
            return getFocusOwner().mo1777resetFocus3ESFkO8(value);
        }
        return false;
    }

    public final boolean requestFocusCurrent(int direction, android.graphics.Rect previouslyFocusedRect) {
        if (isFocused()) {
            return true;
        }
        if (getFocusOwner().getRootState().getHasFocus()) {
            return super.requestFocus(direction, previouslyFocusedRect);
        }
        FocusDirection focusDirection = FocusInteropUtils_androidKt.toFocusDirection(direction);
        int value = focusDirection != null ? focusDirection.getValue() : FocusDirection.INSTANCE.m1759getEnterdhqQ8s();
        return Intrinsics.f(getFocusOwner().mo1774focusSearchULY8qGw(value, previouslyFocusedRect != null ? RectHelper_androidKt.toComposeRect(previouslyFocusedRect) : null, new C19131(value)), Boolean.TRUE);
    }

    public final boolean requestFocusViewFocusFix(int direction, android.graphics.Rect previouslyFocusedRect) {
        View viewFindNextNonChildView;
        if (isFocused()) {
            return true;
        }
        if (this.processingRequestFocusForNextNonChildView) {
            return false;
        }
        FocusDirection focusDirection = FocusInteropUtils_androidKt.toFocusDirection(direction);
        int value = focusDirection != null ? focusDirection.getValue() : FocusDirection.INSTANCE.m1759getEnterdhqQ8s();
        if (hasFocus() && mo1810moveFocusInChildren3ESFkO8(value)) {
            return true;
        }
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        Boolean boolMo1774focusSearchULY8qGw = getFocusOwner().mo1774focusSearchULY8qGw(value, previouslyFocusedRect != null ? RectHelper_androidKt.toComposeRect(previouslyFocusedRect) : null, new AndroidComposeView$requestFocusViewFocusFix$focusSearchResult$1(ref$BooleanRef, value));
        if (boolMo1774focusSearchULY8qGw == null) {
            return false;
        }
        if (boolMo1774focusSearchULY8qGw.booleanValue()) {
            return true;
        }
        if (ref$BooleanRef.f186407a) {
            return false;
        }
        if ((previouslyFocusedRect != null && !hasFocus() && Intrinsics.f(getFocusOwner().mo1774focusSearchULY8qGw(value, null, new AndroidComposeView$requestFocusViewFocusFix$altFocus$1(value)), Boolean.TRUE)) || (viewFindNextNonChildView = findNextNonChildView(direction)) == null || viewFindNextNonChildView == this) {
            return true;
        }
        this.processingRequestFocusForNextNonChildView = true;
        boolean zRequestFocus = viewFindNextNonChildView.requestFocus(direction);
        this.processingRequestFocusForNextNonChildView = false;
        return zRequestFocus;
    }

    @Override // androidx.compose.ui.node.Owner
    public void requestOnPositionedCallback(@NotNull LayoutNode layoutNode) {
        this.measureAndLayoutDelegate.requestOnPositionedCallback(layoutNode);
        scheduleMeasureAndLayout$default(this, null, 1, null);
    }

    @Override // androidx.compose.ui.focus.PlatformFocusOwner
    /* JADX INFO: renamed from: requestOwnerFocus-7o62pno */
    public boolean mo1811requestOwnerFocus7o62pno(FocusDirection focusDirection, Rect previouslyFocusedRect) {
        Integer numM1766toAndroidFocusDirection3ESFkO8;
        if (ComposeUiFlags.isBypassUnfocusableComposeViewEnabled) {
            if (isFocused()) {
                return true;
            }
        } else if (isFocused() || hasFocus()) {
            return true;
        }
        return super.requestFocus((focusDirection == null || (numM1766toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m1766toAndroidFocusDirection3ESFkO8(focusDirection.getValue())) == null) ? 130 : numM1766toAndroidFocusDirection3ESFkO8.intValue(), previouslyFocusedRect != null ? RectHelper_androidKt.toAndroidRect(previouslyFocusedRect) : null);
    }

    @Override // androidx.compose.ui.node.OutOfFrameExecutor
    public void schedule(@NotNull Function0<Unit> block) {
        boolean zIsEmpty = this.outOfFrameQueue.isEmpty();
        this.outOfFrameQueue.addLast(block);
        if (zIsEmpty) {
            Handler handler = getHandler();
            if (handler == null) {
                throw new IllegalArgumentException("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
            handler.postAtFrontOfQueue(this.outOfFrameRunnable);
        }
    }

    @Override // androidx.compose.ui.input.pointer.PositionCalculator
    /* JADX INFO: renamed from: screenToLocal-MK-Hz9U */
    public long mo2503screenToLocalMKHz9U(long positionOnScreen) {
        recalculateWindowPosition();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (positionOnScreen >> 32)) - Float.intBitsToFloat((int) (this.windowPosition >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (positionOnScreen & BodyPartID.bodyIdMax)) - Float.intBitsToFloat((int) (this.windowPosition & BodyPartID.bodyIdMax));
        return Matrix.m2055mapMKHz9U(this.windowToViewMatrix, Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (BodyPartID.bodyIdMax & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)))));
    }

    public void setAccessibilityEventBatchIntervalMillis(long intervalMillis) {
        this.composeAccessibilityDelegate.setSendRecurringAccessibilityEventsIntervalMillis$ui(intervalMillis);
    }

    public final void setConfiguration(@NotNull Configuration configuration) {
        this.configuration.setValue(configuration);
    }

    public final void setContentCaptureManager$ui(@NotNull AndroidContentCaptureManager androidContentCaptureManager) {
        this.contentCaptureManager = androidContentCaptureManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v7 */
    public void setCoroutineContext(@NotNull CoroutineContext coroutineContext) {
        this.coroutineContext = coroutineContext;
        DelegatableNode head = getRoot().getNodes().getHead();
        if (head instanceof SuspendingPointerInputModifierNode) {
            ((SuspendingPointerInputModifierNode) head).resetPointerInputHandler();
        }
        int iM2722constructorimpl = NodeKind.m2722constructorimpl(16);
        if (!head.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = head.getNode().getChild();
        if (child == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, head.getNode(), false);
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) kii.e.m(mutableVector, 1);
            if ((node.getAggregateChildKindSet() & iM2722constructorimpl) != 0) {
                for (Modifier.Node child2 = node; child2 != null && child2.getIsAttached(); child2 = child2.getChild()) {
                    if ((child2.getKindSet() & iM2722constructorimpl) != 0) {
                        Modifier.Node nodePop = child2;
                        MutableVector mutableVector2 = null;
                        while (nodePop != 0) {
                            if (nodePop instanceof PointerInputModifierNode) {
                                PointerInputModifierNode pointerInputModifierNode = (PointerInputModifierNode) nodePop;
                                if (pointerInputModifierNode instanceof SuspendingPointerInputModifierNode) {
                                    ((SuspendingPointerInputModifierNode) pointerInputModifierNode).resetPointerInputHandler();
                                }
                            } else if ((nodePop.getKindSet() & iM2722constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui = ((DelegatingNode) nodePop).getDelegate();
                                int i = 0;
                                nodePop = nodePop;
                                while (delegate$ui != null) {
                                    if ((delegate$ui.getKindSet() & iM2722constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            nodePop = delegate$ui;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodePop != 0) {
                                                mutableVector2.add(nodePop);
                                                nodePop = 0;
                                            }
                                            mutableVector2.add(delegate$ui);
                                        }
                                    }
                                    delegate$ui = delegate$ui.getChild();
                                    nodePop = nodePop;
                                }
                                if (i == 1) {
                                }
                            }
                            nodePop = DelegatableNodeKt.pop(mutableVector2);
                        }
                    }
                }
            }
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node, false);
        }
    }

    public final void setFrameEndScheduler$ui(LifecycleRetainedValuesStoreOwner.FrameEndScheduler frameEndScheduler) {
        this.frameEndScheduler = frameEndScheduler;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j2) {
        this.lastMatrixRecalculationAnimationTime = j2;
    }

    public final void setOnViewTreeOwnersAvailable(@NotNull Function1<? super ViewTreeOwners, Unit> callback) {
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            callback.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.onViewTreeOwnersAvailable = callback;
    }

    /* JADX INFO: renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m2763setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis) {
        this.primaryDirectionalMotionAxisOverride = indirectPointerEventPrimaryDirectionalMotionAxis;
    }

    @Override // androidx.compose.ui.node.Owner
    public void setShowLayoutBounds(boolean z) {
        this.showLayoutBounds = z;
    }

    public void setUncaughtExceptionHandler(RootForTest.UncaughtExceptionHandler handler) {
        this.measureAndLayoutDelegate.setUncaughtExceptionHandler$ui(handler);
    }

    public final void setUncaughtExceptionHandler$ui(RootForTest.UncaughtExceptionHandler uncaughtExceptionHandler) {
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.node.Owner
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object textInputSession(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<java.lang.Object, ? super kotlin.coroutines.Continuation<?>, ? extends java.lang.Object> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.ui.platform.AndroidComposeView.C19141
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.ui.platform.AndroidComposeView$textInputSession$1 r0 = (androidx.compose.ui.platform.AndroidComposeView.C19141) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.platform.AndroidComposeView$textInputSession$1 r0 = new androidx.compose.ui.platform.AndroidComposeView$textInputSession$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            yhm.o.b(r6)
            goto L42
        L2f:
            yhm.o.b(r6)
            java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex$Session<androidx.compose.ui.platform.AndroidPlatformTextInputSession>> r6 = r4.textInputSessionMutex
            androidx.compose.ui.platform.AndroidComposeView$textInputSession$2 r2 = new androidx.compose.ui.platform.AndroidComposeView$textInputSession$2
            r2.<init>()
            r0.label = r3
            java.lang.Object r5 = androidx.compose.ui.SessionMutex.m1727withSessionCancellingPreviousimpl(r6, r2, r5, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.textInputSession(kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.ui.node.Owner
    public void voteFrameRate(float frameRate) {
        if (this.isArrEnabled) {
            if (frameRate > BitmapDescriptorFactory.HUE_RED) {
                if (Float.isNaN(this.currentFrameRate) || frameRate > this.currentFrameRate) {
                    this.currentFrameRate = frameRate;
                    return;
                }
                return;
            }
            if (frameRate < BitmapDescriptorFactory.HUE_RED) {
                if (Float.isNaN(this.currentFrameRateCategory) || frameRate < this.currentFrameRateCategory) {
                    this.currentFrameRateCategory = frameRate;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index) {
        Intrinsics.h(child);
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addView(child, index, layoutParams);
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public AndroidAccessibilityManager getAccessibilityManager() {
        return this.accessibilityManager;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public AndroidClipboard getClipboard() {
        return this.clipboard;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public AndroidClipboardManager getClipboardManager() {
        return this.clipboardManager;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public AndroidDragAndDropManager getDragAndDropManager() {
        return this.dragAndDropManager;
    }

    @NotNull
    public MutableIntObjectMap<LayoutNode> getLayoutNodes() {
        return this.layoutNodes;
    }

    @Override // androidx.compose.ui.node.Owner
    public AndroidComposeView getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int width, int height) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = width;
        layoutParamsGenerateDefaultLayoutParams.height = height;
        Unit unit = Unit.f186387a;
        addView(child, -1, layoutParamsGenerateDefaultLayoutParams);
    }

    @Override // androidx.compose.ui.focus.FocusListener
    public void onFocusChanged(FocusTargetModifierNode previous, FocusTargetModifierNode current) {
        NodeChain nodes;
        NodeChain nodes2;
        if (!ComposeUiFlags.isOptimizedFocusEventDispatchEnabled || previous == null) {
            return;
        }
        int iM2722constructorimpl = NodeKind.m2722constructorimpl(PKIFailureInfo.badSenderNonce);
        if (!previous.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node = previous.getNode();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(previous);
        LinkedHashSet linkedHashSet = null;
        ArrayList arrayList = null;
        while (layoutNodeRequireLayoutNode != null) {
            if ((kii.e.b(layoutNodeRequireLayoutNode) & iM2722constructorimpl) != 0) {
                while (node != null) {
                    if ((node.getKindSet() & iM2722constructorimpl) != 0) {
                        Modifier.Node nodePop = node;
                        MutableVector mutableVector = null;
                        while (nodePop != null) {
                            if (nodePop instanceof IndirectPointerInputModifierNode) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(nodePop);
                            } else if ((nodePop.getKindSet() & iM2722constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i = 0;
                                for (Modifier.Node delegate$ui = ((DelegatingNode) nodePop).getDelegate(); delegate$ui != null; delegate$ui = delegate$ui.getChild()) {
                                    if ((delegate$ui.getKindSet() & iM2722constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            nodePop = delegate$ui;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodePop != null) {
                                                mutableVector.add(nodePop);
                                                nodePop = null;
                                            }
                                            mutableVector.add(delegate$ui);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            nodePop = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    node = node.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
            node = (layoutNodeRequireLayoutNode == null || (nodes2 = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes2.getTail();
        }
        if (arrayList == null) {
            return;
        }
        if (current != null) {
            int iM2722constructorimpl2 = NodeKind.m2722constructorimpl(PKIFailureInfo.badSenderNonce);
            if (!current.getNode().getIsAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node node2 = current.getNode();
            LayoutNode layoutNodeRequireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(current);
            LinkedHashSet linkedHashSet2 = null;
            while (layoutNodeRequireLayoutNode2 != null) {
                if ((kii.e.b(layoutNodeRequireLayoutNode2) & iM2722constructorimpl2) != 0) {
                    while (node2 != null) {
                        if ((node2.getKindSet() & iM2722constructorimpl2) != 0) {
                            Modifier.Node nodePop2 = node2;
                            MutableVector mutableVector2 = null;
                            while (nodePop2 != null) {
                                if (nodePop2 instanceof IndirectPointerInputModifierNode) {
                                    if (linkedHashSet2 == null) {
                                        linkedHashSet2 = new LinkedHashSet();
                                    }
                                    linkedHashSet2.add(nodePop2);
                                } else if ((nodePop2.getKindSet() & iM2722constructorimpl2) != 0 && (nodePop2 instanceof DelegatingNode)) {
                                    int i2 = 0;
                                    for (Modifier.Node delegate$ui2 = ((DelegatingNode) nodePop2).getDelegate(); delegate$ui2 != null; delegate$ui2 = delegate$ui2.getChild()) {
                                        if ((delegate$ui2.getKindSet() & iM2722constructorimpl2) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                nodePop2 = delegate$ui2;
                                            } else {
                                                if (mutableVector2 == null) {
                                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (nodePop2 != null) {
                                                    mutableVector2.add(nodePop2);
                                                    nodePop2 = null;
                                                }
                                                mutableVector2.add(delegate$ui2);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                nodePop2 = DelegatableNodeKt.pop(mutableVector2);
                            }
                        }
                        node2 = node2.getParent();
                    }
                }
                layoutNodeRequireLayoutNode2 = layoutNodeRequireLayoutNode2.getParent$ui();
                node2 = (layoutNodeRequireLayoutNode2 == null || (nodes = layoutNodeRequireLayoutNode2.getNodes()) == null) ? null : nodes.getTail();
            }
            linkedHashSet = linkedHashSet2;
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            IndirectPointerInputModifierNode indirectPointerInputModifierNode = (IndirectPointerInputModifierNode) arrayList.get(i3);
            if (!(linkedHashSet != null ? linkedHashSet.contains(indirectPointerInputModifierNode) : false)) {
                indirectPointerInputModifierNode.onCancelIndirectPointerInput();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View child, ViewGroup.LayoutParams params) {
        addView(child, -1, params);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        addViewInLayout(child, index, params, true);
    }

    private final void recalculateWindowPosition(MotionEvent motionEvent) {
        this.lastMatrixRecalculationAnimationTime = AnimationUtils.currentAnimationTimeMillis();
        recalculateWindowViewTransforms();
        float[] fArr = this.viewToWindowMatrix;
        float x3 = motionEvent.getX();
        long jM2055mapMKHz9U = Matrix.m2055mapMKHz9U(fArr, Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(motionEvent.getY())) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(x3) << 32)));
        this.windowPosition = Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(motionEvent.getRawX() - Float.intBitsToFloat((int) (jM2055mapMKHz9U >> 32)))) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getRawY() - Float.intBitsToFloat((int) (jM2055mapMKHz9U & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax));
    }
}
