package androidx.compose.ui.viewinterop;

import a3l.c;
import android.content.Context;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerScope;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.platform.NestedScrollInteropConnectionKt;
import androidx.compose.ui.platform.WindowRecomposer_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.VelocityKt;
import androidx.core.graphics.Insets;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.os.SavedStateRegistryOwner;
import androidx.os.ViewTreeSavedStateRegistryOwner;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import gim.d;
import gim.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0011\u0018\u0000 Û\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002Û\u0001B9\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ\u001f\u0010!\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\nH\u0014¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u001a¢\u0006\u0004\b#\u0010\u001cJ7\u0010*\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\n2\u0006\u0010'\u001a\u00020\n2\u0006\u0010(\u001a\u00020\n2\u0006\u0010)\u001a\u00020\nH\u0014¢\u0006\u0004\b*\u0010+J\u0011\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020$H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u001aH\u0014¢\u0006\u0004\b2\u0010\u001cJ\u000f\u00103\u001a\u00020\u001aH\u0014¢\u0006\u0004\b3\u0010\u001cJ%\u00109\u001a\u0004\u0018\u0001082\b\u00105\u001a\u0004\u0018\u0001042\b\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b9\u0010:J\u001f\u0010=\u001a\u00020\u001a2\u0006\u0010;\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020\u000eH\u0016¢\u0006\u0004\b=\u0010>J)\u0010A\u001a\u00020$2\u0006\u0010;\u001a\u00020\u000e2\b\u0010?\u001a\u0004\u0018\u0001062\u0006\u0010@\u001a\u00020$H\u0016¢\u0006\u0004\bA\u0010BJ\r\u0010C\u001a\u00020\u001a¢\u0006\u0004\bC\u0010\u001cJ\u0017\u0010E\u001a\u00020\u001a2\u0006\u0010D\u001a\u00020\nH\u0014¢\u0006\u0004\bE\u0010FJ\u0019\u0010I\u001a\u00020$2\b\u0010H\u001a\u0004\u0018\u00010GH\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020$H\u0016¢\u0006\u0004\bK\u0010LJ/\u0010O\u001a\u00020$2\u0006\u0010;\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010M\u001a\u00020\n2\u0006\u0010N\u001a\u00020\nH\u0016¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\nH\u0016¢\u0006\u0004\bQ\u0010RJ/\u0010S\u001a\u00020\u001a2\u0006\u0010;\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010M\u001a\u00020\n2\u0006\u0010N\u001a\u00020\nH\u0016¢\u0006\u0004\bS\u0010TJ\u001f\u0010U\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010N\u001a\u00020\nH\u0016¢\u0006\u0004\bU\u0010VJG\u0010\\\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010W\u001a\u00020\n2\u0006\u0010X\u001a\u00020\n2\u0006\u0010Y\u001a\u00020\n2\u0006\u0010Z\u001a\u00020\n2\u0006\u0010N\u001a\u00020\n2\u0006\u0010[\u001a\u000204H\u0016¢\u0006\u0004\b\\\u0010]J?\u0010\\\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010W\u001a\u00020\n2\u0006\u0010X\u001a\u00020\n2\u0006\u0010Y\u001a\u00020\n2\u0006\u0010Z\u001a\u00020\n2\u0006\u0010N\u001a\u00020\nH\u0016¢\u0006\u0004\b\\\u0010^J7\u0010a\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010_\u001a\u00020\n2\u0006\u0010`\u001a\u00020\n2\u0006\u0010[\u001a\u0002042\u0006\u0010N\u001a\u00020\nH\u0016¢\u0006\u0004\ba\u0010bJ/\u0010f\u001a\u00020$2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010d\u001a\u00020c2\u0006\u0010e\u001a\u00020c2\u0006\u0010[\u001a\u00020$H\u0016¢\u0006\u0004\bf\u0010gJ'\u0010h\u001a\u00020$2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010d\u001a\u00020c2\u0006\u0010e\u001a\u00020cH\u0016¢\u0006\u0004\bh\u0010iJ\u000f\u0010j\u001a\u00020$H\u0016¢\u0006\u0004\bj\u0010LJ\u001f\u0010n\u001a\u00020l2\u0006\u0010k\u001a\u00020\u000e2\u0006\u0010m\u001a\u00020lH\u0016¢\u0006\u0004\bn\u0010oJ'\u0010s\u001a\u00020\n2\u0006\u0010p\u001a\u00020\n2\u0006\u0010q\u001a\u00020\n2\u0006\u0010r\u001a\u00020\nH\u0002¢\u0006\u0004\bs\u0010tJ\u0017\u0010u\u001a\u00020l2\u0006\u0010m\u001a\u00020lH\u0002¢\u0006\u0004\bu\u0010vJ\u0017\u0010y\u001a\u00020w2\u0006\u0010x\u001a\u00020wH\u0002¢\u0006\u0004\by\u0010zJ6\u0010\u0080\u0001\u001a\u00020{*\u00020{2\u0006\u0010|\u001a\u00020\n2\u0006\u0010}\u001a\u00020\n2\u0006\u0010~\u001a\u00020\n2\u0006\u0010\u007f\u001a\u00020\nH\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010\u0082\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010\u0083\u0001R\u0019\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\u000e\n\u0005\b\u000f\u0010\u0084\u0001\u001a\u0005\b\u0085\u0001\u0010\u0016R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010\u0086\u0001R@\u0010\u0089\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0087\u00012\u000e\u0010\u0088\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0087\u00018\u0006@DX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0019\u0010\u008f\u0001\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R@\u0010\u0091\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0087\u00012\u000e\u0010\u0088\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0087\u00018\u0006@DX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0091\u0001\u0010\u008a\u0001\u001a\u0006\b\u0092\u0001\u0010\u008c\u0001\"\u0006\b\u0093\u0001\u0010\u008e\u0001R@\u0010\u0094\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0087\u00012\u000e\u0010\u0088\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0087\u00018\u0006@DX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0094\u0001\u0010\u008a\u0001\u001a\u0006\b\u0095\u0001\u0010\u008c\u0001\"\u0006\b\u0096\u0001\u0010\u008e\u0001R4\u0010\u0098\u0001\u001a\u00030\u0097\u00012\b\u0010\u0088\u0001\u001a\u00030\u0097\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R9\u0010\u009f\u0001\u001a\u0012\u0012\u0005\u0012\u00030\u0097\u0001\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u009e\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0006\b£\u0001\u0010¤\u0001R4\u0010¦\u0001\u001a\u00030¥\u00012\b\u0010\u0088\u0001\u001a\u00030¥\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b¦\u0001\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0006\bª\u0001\u0010«\u0001R9\u0010¬\u0001\u001a\u0012\u0012\u0005\u0012\u00030¥\u0001\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u009e\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¬\u0001\u0010 \u0001\u001a\u0006\b\u00ad\u0001\u0010¢\u0001\"\u0006\b®\u0001\u0010¤\u0001R8\u0010°\u0001\u001a\u0005\u0018\u00010¯\u00012\n\u0010\u0088\u0001\u001a\u0005\u0018\u00010¯\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b°\u0001\u0010±\u0001\u001a\u0006\b²\u0001\u0010³\u0001\"\u0006\b´\u0001\u0010µ\u0001R8\u0010·\u0001\u001a\u0005\u0018\u00010¶\u00012\n\u0010\u0088\u0001\u001a\u0005\u0018\u00010¶\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b·\u0001\u0010¸\u0001\u001a\u0006\b¹\u0001\u0010º\u0001\"\u0006\b»\u0001\u0010¼\u0001R\u0017\u0010½\u0001\u001a\u0002048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001R\u001a\u0010À\u0001\u001a\u00030¿\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\u0019\u0010m\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bm\u0010Â\u0001R2\u0010Å\u0001\u001a\u001b\u0012\u0007\u0012\u0005\u0018\u00010Ã\u0001\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u009e\u0001j\u0005\u0018\u0001`Ä\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÅ\u0001\u0010 \u0001R\u001e\u0010Æ\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0087\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÆ\u0001\u0010\u008a\u0001R\u001e\u0010Ç\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0087\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÇ\u0001\u0010\u008a\u0001R8\u0010È\u0001\u001a\u0011\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u009e\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÈ\u0001\u0010 \u0001\u001a\u0006\bÉ\u0001\u0010¢\u0001\"\u0006\bÊ\u0001\u0010¤\u0001R\u0015\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b5\u0010¾\u0001R\u0019\u0010Ë\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bË\u0001\u0010\u0082\u0001R\u0019\u0010Ì\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÌ\u0001\u0010\u0082\u0001R\u0018\u0010Î\u0001\u001a\u00030Í\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÎ\u0001\u0010Ï\u0001R\u0019\u0010Ð\u0001\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÐ\u0001\u0010\u0090\u0001R\u001d\u0010Ò\u0001\u001a\u00030Ñ\u00018\u0006¢\u0006\u0010\n\u0006\bÒ\u0001\u0010Ó\u0001\u001a\u0006\bÔ\u0001\u0010Õ\u0001R\u0016\u0010Ö\u0001\u001a\u00020$8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÖ\u0001\u0010LR\u0018\u0010Ú\u0001\u001a\u00030×\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bØ\u0001\u0010Ù\u0001¨\u0006Ü\u0001"}, d2 = {"Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroid/view/ViewGroup;", "Landroidx/core/view/NestedScrollingParent3;", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/core/view/OnApplyWindowInsetsListener;", "Landroid/content/Context;", "context", "Landroidx/compose/runtime/CompositionContext;", "parentContext", "", "compositeKeyHash", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "dispatcher", "Landroid/view/View;", "view", "Landroidx/compose/ui/node/Owner;", "owner", "<init>", "(Landroid/content/Context;Landroidx/compose/runtime/CompositionContext;ILandroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;Landroid/view/View;Landroidx/compose/ui/node/Owner;)V", "Landroidx/compose/ui/viewinterop/InteropView;", "getInteropView", "()Landroid/view/View;", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "", "onReuse", "()V", "onDeactivate", "onRelease", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "remeasure", "", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "Landroid/view/ViewGroup$LayoutParams;", "getLayoutParams", "()Landroid/view/ViewGroup$LayoutParams;", "disallowIntercept", "requestDisallowInterceptTouchEvent", "(Z)V", "onAttachedToWindow", "onDetachedFromWindow", "", "location", "Landroid/graphics/Rect;", "dirty", "Landroid/view/ViewParent;", "invalidateChildInParent", "([ILandroid/graphics/Rect;)Landroid/view/ViewParent;", "child", "target", "onDescendantInvalidated", "(Landroid/view/View;Landroid/view/View;)V", "rectangle", "immediate", "requestChildRectangleOnScreen", "(Landroid/view/View;Landroid/graphics/Rect;Z)Z", "invalidateOrDefer", "visibility", "onWindowVisibilityChanged", "(I)V", "Landroid/graphics/Region;", "region", "gatherTransparentRegion", "(Landroid/graphics/Region;)Z", "shouldDelayChildPressedState", "()Z", "axes", "type", "onStartNestedScroll", "(Landroid/view/View;Landroid/view/View;II)Z", "getNestedScrollAxes", "()I", "onNestedScrollAccepted", "(Landroid/view/View;Landroid/view/View;II)V", "onStopNestedScroll", "(Landroid/view/View;I)V", "dxConsumed", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "consumed", "onNestedScroll", "(Landroid/view/View;IIIII[I)V", "(Landroid/view/View;IIIII)V", "dx", "dy", "onNestedPreScroll", "(Landroid/view/View;II[II)V", "", "velocityX", "velocityY", "onNestedFling", "(Landroid/view/View;FFZ)Z", "onNestedPreFling", "(Landroid/view/View;FF)Z", "isNestedScrollingEnabled", "v", "Landroidx/core/view/WindowInsetsCompat;", "insets", "onApplyWindowInsets", "(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;", "min", "max", "preferred", "obtainMeasureSpec", "(III)I", "insetToLayoutPosition", "(Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;", "Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;", "bounds", "insetBounds", "(Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;)Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;", "Landroidx/core/graphics/Insets;", "left", "top", "right", "bottom", "inset", "(Landroidx/core/graphics/Insets;IIII)Landroidx/core/graphics/Insets;", "I", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "Landroid/view/View;", "getView", "Landroidx/compose/ui/node/Owner;", "Lkotlin/Function0;", "value", "update", "Lkotlin/jvm/functions/Function0;", "getUpdate", "()Lkotlin/jvm/functions/Function0;", "setUpdate", "(Lkotlin/jvm/functions/Function0;)V", "hasUpdateBlock", "Z", "reset", "getReset", "setReset", "release", "getRelease", "setRelease", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "(Landroidx/compose/ui/Modifier;)V", "Lkotlin/Function1;", "onModifierChanged", "Lkotlin/jvm/functions/Function1;", "getOnModifierChanged$ui", "()Lkotlin/jvm/functions/Function1;", "setOnModifierChanged$ui", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "onDensityChanged", "getOnDensityChanged$ui", "setOnDensityChanged$ui", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "setLifecycleOwner", "(Landroidx/lifecycle/LifecycleOwner;)V", "Landroidx/savedstate/SavedStateRegistryOwner;", "savedStateRegistryOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "getSavedStateRegistryOwner", "()Landroidx/savedstate/SavedStateRegistryOwner;", "setSavedStateRegistryOwner", "(Landroidx/savedstate/SavedStateRegistryOwner;)V", "position", "[I", "Landroidx/compose/ui/unit/IntSize;", "size", "J", "Landroidx/core/view/WindowInsetsCompat;", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/viewinterop/BringIntoViewRequester;", "bringIntoViewRequester", "runUpdate", "runInvalidate", "onRequestDisallowInterceptTouchEvent", "getOnRequestDisallowInterceptTouchEvent$ui", "setOnRequestDisallowInterceptTouchEvent$ui", "lastWidthMeasureSpec", "lastHeightMeasureSpec", "Landroidx/core/view/NestedScrollingParentHelper;", "nestedScrollingParentHelper", "Landroidx/core/view/NestedScrollingParentHelper;", "isDrawing", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "isValidOwnerScope", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", "Companion", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AndroidViewHolder extends ViewGroup implements NestedScrollingParent3, ComposeNodeLifecycleCallback, OwnerScope, OnApplyWindowInsetsListener {
    private Function1<? super Rect, Unit> bringIntoViewRequester;
    private final int compositeKeyHash;

    @NotNull
    private Density density;

    @NotNull
    private final NestedScrollDispatcher dispatcher;
    private boolean hasUpdateBlock;
    private WindowInsetsCompat insets;
    private boolean isDrawing;
    private int lastHeightMeasureSpec;
    private int lastWidthMeasureSpec;

    @NotNull
    private final LayoutNode layoutNode;
    private LifecycleOwner lifecycleOwner;

    @NotNull
    private final int[] location;

    @NotNull
    private Modifier modifier;

    @NotNull
    private final NestedScrollingParentHelper nestedScrollingParentHelper;
    private Function1<? super Density, Unit> onDensityChanged;
    private Function1<? super Modifier, Unit> onModifierChanged;
    private Function1<? super Boolean, Unit> onRequestDisallowInterceptTouchEvent;

    @NotNull
    private final Owner owner;

    @NotNull
    private final int[] position;

    @NotNull
    private Function0<Unit> release;

    @NotNull
    private Function0<Unit> reset;

    @NotNull
    private final Function0<Unit> runInvalidate;

    @NotNull
    private final Function0<Unit> runUpdate;
    private SavedStateRegistryOwner savedStateRegistryOwner;
    private long size;

    @NotNull
    private Function0<Unit> update;

    @NotNull
    private final View view;
    public static final int $stable = 8;

    @NotNull
    private static final Function1<AndroidViewHolder, Unit> OnCommitAffectingUpdate = AndroidViewHolder$Companion$OnCommitAffectingUpdate$1.INSTANCE;

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1, reason: invalid class name */
    @d(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", f = "AndroidViewHolder.android.kt", l = {633, 635}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $consumed;
        final /* synthetic */ long $viewVelocity;
        int label;
        final /* synthetic */ AndroidViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, AndroidViewHolder androidViewHolder, long j2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$consumed = z;
            this.this$0 = androidViewHolder;
            this.$viewVelocity = j2;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return new AnonymousClass1(this.$consumed, this.this$0, this.$viewVelocity, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
        
            if (r11 == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
        
            if (r11 == r0) goto L18;
         */
        @Override // gim.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                fim.a r0 = fim.a.COROUTINE_SUSPENDED
                int r1 = r10.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1d
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                yhm.o.b(r11)
                goto L5c
            L10:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L18:
                yhm.o.b(r11)
                r6 = r10
                goto L3d
            L1d:
                yhm.o.b(r11)
                boolean r11 = r10.$consumed
                if (r11 != 0) goto L43
                androidx.compose.ui.viewinterop.AndroidViewHolder r11 = r10.this$0
                androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r4 = androidx.compose.ui.viewinterop.AndroidViewHolder.access$getDispatcher$p(r11)
                androidx.compose.ui.unit.Velocity$Companion r11 = androidx.compose.ui.unit.Velocity.INSTANCE
                long r5 = r11.m3405getZero9UxMQ8M()
                long r7 = r10.$viewVelocity
                r10.label = r3
                r9 = r10
                java.lang.Object r11 = r4.m2405dispatchPostFlingRZ2iAVY(r5, r7, r9)
                r6 = r9
                if (r11 != r0) goto L3d
                goto L5b
            L3d:
                androidx.compose.ui.unit.Velocity r11 = (androidx.compose.ui.unit.Velocity) r11
                r11.getPackedValue()
                goto L61
            L43:
                r6 = r10
                androidx.compose.ui.viewinterop.AndroidViewHolder r11 = r6.this$0
                androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r1 = androidx.compose.ui.viewinterop.AndroidViewHolder.access$getDispatcher$p(r11)
                r11 = r2
                long r2 = r6.$viewVelocity
                androidx.compose.ui.unit.Velocity$Companion r4 = androidx.compose.ui.unit.Velocity.INSTANCE
                long r4 = r4.m3405getZero9UxMQ8M()
                r6.label = r11
                java.lang.Object r11 = r1.m2405dispatchPostFlingRZ2iAVY(r2, r4, r6)
                if (r11 != r0) goto L5c
            L5b:
                return r0
            L5c:
                androidx.compose.ui.unit.Velocity r11 = (androidx.compose.ui.unit.Velocity) r11
                r11.getPackedValue()
            L61:
                kotlin.Unit r11 = kotlin.Unit.f186387a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.AndroidViewHolder.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", f = "AndroidViewHolder.android.kt", l = {644}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class C19201 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $toBeConsumed;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19201(long j2, Continuation<? super C19201> continuation) {
            super(2, continuation);
            this.$toBeConsumed = j2;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return AndroidViewHolder.this.new C19201(this.$toBeConsumed, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                NestedScrollDispatcher nestedScrollDispatcher = AndroidViewHolder.this.dispatcher;
                long j2 = this.$toBeConsumed;
                this.label = 1;
                if (nestedScrollDispatcher.m2407dispatchPreFlingQWom1Mo(j2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19201) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidViewHolder(@NotNull Context context, CompositionContext compositionContext, int i, @NotNull NestedScrollDispatcher nestedScrollDispatcher, @NotNull View view, @NotNull Owner owner) {
        super(context);
        this.compositeKeyHash = i;
        this.dispatcher = nestedScrollDispatcher;
        this.view = view;
        this.owner = owner;
        if (compositionContext != null) {
            WindowRecomposer_androidKt.setCompositionContext(this, compositionContext);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        ViewCompat.setWindowInsetsAnimationCallback(this, new WindowInsetsAnimationCompat.Callback() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder.2
            {
                super(1);
            }

            @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
            public WindowInsetsCompat onProgress(WindowInsetsCompat insets, List<WindowInsetsAnimationCompat> runningAnimations) {
                return AndroidViewHolder.this.insetToLayoutPosition(insets);
            }

            @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
            public WindowInsetsAnimationCompat.BoundsCompat onStart(WindowInsetsAnimationCompat animation, WindowInsetsAnimationCompat.BoundsCompat bounds) {
                return AndroidViewHolder.this.insetBounds(bounds);
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(this, this);
        this.update = AndroidViewHolder$update$1.INSTANCE;
        this.reset = AndroidViewHolder$reset$1.INSTANCE;
        this.release = AndroidViewHolder$release$1.INSTANCE;
        Modifier.Companion companion = Modifier.INSTANCE;
        this.modifier = companion;
        this.density = DensityKt.Density$default(1.0f, BitmapDescriptorFactory.HUE_RED, 2, null);
        this.position = new int[2];
        this.size = IntSize.INSTANCE.m3359getZeroYbymL2g();
        this.runUpdate = new AndroidViewHolder$runUpdate$1(this);
        this.runInvalidate = new AndroidViewHolder$runInvalidate$1(this);
        this.location = new int[2];
        this.lastWidthMeasureSpec = Integer.MIN_VALUE;
        this.lastHeightMeasureSpec = Integer.MIN_VALUE;
        this.nestedScrollingParentHelper = new NestedScrollingParentHelper(this);
        Object[] objArr = 0 == true ? 1 : 0;
        final LayoutNode layoutNode = new LayoutNode(false, objArr, 3, null);
        layoutNode.setInteropViewFactoryHolder$ui(this);
        Modifier modifierThen = OnGloballyPositionedModifierKt.onGloballyPositioned(DrawModifierKt.drawBehind(PointerInteropFilter_androidKt.pointerInteropFilter(SemanticsModifierKt.semantics(NestedScrollModifierKt.nestedScroll(companion, AndroidViewHolder_androidKt.NoOpScrollConnection, nestedScrollDispatcher), true, AndroidViewHolder$layoutNode$1$coreModifier$1.INSTANCE), this), new AndroidViewHolder$layoutNode$1$coreModifier$2(this, layoutNode, this)), new AndroidViewHolder$layoutNode$1$coreModifier$3(this, layoutNode)).then(new BringIntoViewElement(new AndroidViewHolder$layoutNode$1$coreModifier$4(this)));
        layoutNode.setCompositeKeyHash(i);
        layoutNode.setModifier(this.modifier.then(modifierThen));
        this.onModifierChanged = new AndroidViewHolder$layoutNode$1$1(layoutNode, modifierThen);
        layoutNode.setDensity(this.density);
        this.onDensityChanged = new AndroidViewHolder$layoutNode$1$2(layoutNode);
        layoutNode.setOnAttach$ui(new AndroidViewHolder$layoutNode$1$3(this, layoutNode));
        layoutNode.setOnDetach$ui(new AndroidViewHolder$layoutNode$1$4(this));
        layoutNode.setMeasurePolicy(new MeasurePolicy() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5
            private final int intrinsicHeight(int width) {
                AndroidViewHolder androidViewHolder = this.$this_run;
                ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
                Intrinsics.h(layoutParams);
                androidViewHolder.measure(androidViewHolder.obtainMeasureSpec(0, width, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
                return this.$this_run.getMeasuredHeight();
            }

            private final int intrinsicWidth(int height) {
                AndroidViewHolder androidViewHolder = this.$this_run;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                AndroidViewHolder androidViewHolder2 = this.$this_run;
                ViewGroup.LayoutParams layoutParams = androidViewHolder2.getLayoutParams();
                Intrinsics.h(layoutParams);
                androidViewHolder.measure(iMakeMeasureSpec, androidViewHolder2.obtainMeasureSpec(0, height, layoutParams.height));
                return this.$this_run.getMeasuredWidth();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
                return intrinsicHeight(i2);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
                return intrinsicWidth(i2);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* JADX INFO: renamed from: measure-3p2s80s */
            public MeasureResult mo520measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
                if (this.$this_run.getChildCount() == 0) {
                    return MeasureScope.layout$default(measureScope, Constraints.m3281getMinWidthimpl(j2), Constraints.m3280getMinHeightimpl(j2), null, AndroidViewHolder$layoutNode$1$5$measure$1.INSTANCE, 4, null);
                }
                if (Constraints.m3281getMinWidthimpl(j2) != 0) {
                    this.$this_run.getChildAt(0).setMinimumWidth(Constraints.m3281getMinWidthimpl(j2));
                }
                if (Constraints.m3280getMinHeightimpl(j2) != 0) {
                    this.$this_run.getChildAt(0).setMinimumHeight(Constraints.m3280getMinHeightimpl(j2));
                }
                AndroidViewHolder androidViewHolder = this.$this_run;
                int iM3281getMinWidthimpl = Constraints.m3281getMinWidthimpl(j2);
                int iM3279getMaxWidthimpl = Constraints.m3279getMaxWidthimpl(j2);
                ViewGroup.LayoutParams layoutParams = this.$this_run.getLayoutParams();
                Intrinsics.h(layoutParams);
                int iObtainMeasureSpec = androidViewHolder.obtainMeasureSpec(iM3281getMinWidthimpl, iM3279getMaxWidthimpl, layoutParams.width);
                AndroidViewHolder androidViewHolder2 = this.$this_run;
                int iM3280getMinHeightimpl = Constraints.m3280getMinHeightimpl(j2);
                int iM3278getMaxHeightimpl = Constraints.m3278getMaxHeightimpl(j2);
                ViewGroup.LayoutParams layoutParams2 = this.$this_run.getLayoutParams();
                Intrinsics.h(layoutParams2);
                androidViewHolder.measure(iObtainMeasureSpec, androidViewHolder2.obtainMeasureSpec(iM3280getMinHeightimpl, iM3278getMaxHeightimpl, layoutParams2.height));
                return MeasureScope.layout$default(measureScope, this.$this_run.getMeasuredWidth(), this.$this_run.getMeasuredHeight(), null, new AndroidViewHolder$layoutNode$1$5$measure$2(this.$this_run, layoutNode), 4, null);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
                return intrinsicHeight(i2);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
                return intrinsicWidth(i2);
            }
        });
        this.layoutNode = layoutNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OwnerSnapshotObserver getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            InlineClassHelperKt.throwIllegalStateException("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.owner.getSnapshotObserver();
    }

    private final Insets inset(Insets insets, int i, int i2, int i3, int i5) {
        int i6 = insets.left - i;
        if (i6 < 0) {
            i6 = 0;
        }
        int i21 = insets.top - i2;
        if (i21 < 0) {
            i21 = 0;
        }
        int i22 = insets.right - i3;
        if (i22 < 0) {
            i22 = 0;
        }
        int i32 = insets.bottom - i5;
        return Insets.of(i6, i21, i22, i32 >= 0 ? i32 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WindowInsetsAnimationCompat.BoundsCompat insetBounds(WindowInsetsAnimationCompat.BoundsCompat bounds) {
        NodeCoordinator innerCoordinator$ui = this.layoutNode.getInnerCoordinator$ui();
        if (innerCoordinator$ui.isAttached()) {
            long jM3346roundk4lQ0M = IntOffsetKt.m3346roundk4lQ0M(LayoutCoordinatesKt.positionInRoot(innerCoordinator$ui));
            int iM3334getXimpl = IntOffset.m3334getXimpl(jM3346roundk4lQ0M);
            if (iM3334getXimpl < 0) {
                iM3334getXimpl = 0;
            }
            int iM3335getYimpl = IntOffset.m3335getYimpl(jM3346roundk4lQ0M);
            int i = iM3335getYimpl < 0 ? 0 : iM3335getYimpl;
            long jMo2533getSizeYbymL2g = LayoutCoordinatesKt.findRootCoordinates(innerCoordinator$ui).mo2533getSizeYbymL2g();
            int i2 = (int) (jMo2533getSizeYbymL2g >> 32);
            int i3 = (int) (jMo2533getSizeYbymL2g & BodyPartID.bodyIdMax);
            long jM3346roundk4lQ0M2 = IntOffsetKt.m3346roundk4lQ0M(innerCoordinator$ui.mo2536localToRootMKHz9U(Offset.m1827constructorimpl((BodyPartID.bodyIdMax & ((long) Float.floatToRawIntBits((int) (r11 & BodyPartID.bodyIdMax)))) | (((long) Float.floatToRawIntBits((int) (innerCoordinator$ui.mo2533getSizeYbymL2g() >> 32))) << 32))));
            int iM3334getXimpl2 = i2 - IntOffset.m3334getXimpl(jM3346roundk4lQ0M2);
            if (iM3334getXimpl2 < 0) {
                iM3334getXimpl2 = 0;
            }
            int iM3335getYimpl2 = i3 - IntOffset.m3335getYimpl(jM3346roundk4lQ0M2);
            int i5 = iM3335getYimpl2 >= 0 ? iM3335getYimpl2 : 0;
            if (iM3334getXimpl != 0 || i != 0 || iM3334getXimpl2 != 0 || i5 != 0) {
                int i6 = iM3334getXimpl;
                int i21 = iM3334getXimpl2;
                return new WindowInsetsAnimationCompat.BoundsCompat(inset(bounds.getLowerBound(), i6, i, i21, i5), inset(bounds.getUpperBound(), i6, i, i21, i5));
            }
        }
        return bounds;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WindowInsetsCompat insetToLayoutPosition(WindowInsetsCompat insets) {
        if (insets.hasInsets()) {
            NodeCoordinator innerCoordinator$ui = this.layoutNode.getInnerCoordinator$ui();
            if (innerCoordinator$ui.isAttached()) {
                long jM3346roundk4lQ0M = IntOffsetKt.m3346roundk4lQ0M(LayoutCoordinatesKt.positionInRoot(innerCoordinator$ui));
                int iM3334getXimpl = IntOffset.m3334getXimpl(jM3346roundk4lQ0M);
                if (iM3334getXimpl < 0) {
                    iM3334getXimpl = 0;
                }
                int iM3335getYimpl = IntOffset.m3335getYimpl(jM3346roundk4lQ0M);
                if (iM3335getYimpl < 0) {
                    iM3335getYimpl = 0;
                }
                long jMo2533getSizeYbymL2g = LayoutCoordinatesKt.findRootCoordinates(innerCoordinator$ui).mo2533getSizeYbymL2g();
                int i = (int) (jMo2533getSizeYbymL2g >> 32);
                int i2 = (int) (jMo2533getSizeYbymL2g & BodyPartID.bodyIdMax);
                long jM3346roundk4lQ0M2 = IntOffsetKt.m3346roundk4lQ0M(innerCoordinator$ui.mo2536localToRootMKHz9U(Offset.m1827constructorimpl((((long) Float.floatToRawIntBits((int) (r12 & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits((int) (innerCoordinator$ui.mo2533getSizeYbymL2g() >> 32))) << 32))));
                int iM3334getXimpl2 = i - IntOffset.m3334getXimpl(jM3346roundk4lQ0M2);
                if (iM3334getXimpl2 < 0) {
                    iM3334getXimpl2 = 0;
                }
                int iM3335getYimpl2 = i2 - IntOffset.m3335getYimpl(jM3346roundk4lQ0M2);
                int i3 = iM3335getYimpl2 < 0 ? 0 : iM3335getYimpl2;
                if (iM3334getXimpl != 0 || iM3335getYimpl != 0 || iM3334getXimpl2 != 0 || i3 != 0) {
                    return insets.inset(iM3334getXimpl, iM3335getYimpl, iM3334getXimpl2, i3);
                }
            }
        }
        return insets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int obtainMeasureSpec(int min, int max, int preferred) {
        return (preferred >= 0 || min == max) ? View.MeasureSpec.makeMeasureSpec(f.g(preferred, min, max), 1073741824) : (preferred != -2 || max == Integer.MAX_VALUE) ? (preferred != -1 || max == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(max, 1073741824) : View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.location);
        int[] iArr = this.location;
        int i = iArr[0];
        region.op(i, iArr[1], getWidth() + i, getHeight() + this.location[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    @NotNull
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    @NotNull
    public final Density getDensity() {
        return this.density;
    }

    /* JADX INFO: renamed from: getInteropView, reason: from getter */
    public final View getView() {
        return this.view;
    }

    @NotNull
    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    @NotNull
    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.nestedScrollingParentHelper.getNestedScrollAxes();
    }

    public final Function1<Density, Unit> getOnDensityChanged$ui() {
        return this.onDensityChanged;
    }

    public final Function1<Modifier, Unit> getOnModifierChanged$ui() {
        return this.onModifierChanged;
    }

    public final Function1<Boolean, Unit> getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.onRequestDisallowInterceptTouchEvent;
    }

    @NotNull
    public final Function0<Unit> getRelease() {
        return this.release;
    }

    @NotNull
    public final Function0<Unit> getReset() {
        return this.reset;
    }

    public final SavedStateRegistryOwner getSavedStateRegistryOwner() {
        return this.savedStateRegistryOwner;
    }

    @NotNull
    public final Function0<Unit> getUpdate() {
        return this.update;
    }

    @NotNull
    public final View getView() {
        return this.view;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] location, android.graphics.Rect dirty) {
        super.invalidateChildInParent(location, dirty);
        invalidateOrDefer();
        return null;
    }

    public final void invalidateOrDefer() {
        if (!this.isDrawing) {
            this.layoutNode.invalidateLayer$ui();
        } else {
            this.view.postOnAnimation(new c(6, this.runInvalidate));
        }
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.view.isNestedScrollingEnabled();
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return isAttachedToWindow();
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    @NotNull
    public WindowInsetsCompat onApplyWindowInsets(@NotNull View v, @NotNull WindowInsetsCompat insets) {
        this.insets = new WindowInsetsCompat(insets);
        return insetToLayoutPosition(insets);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.runUpdate.invoke();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onDeactivate() {
        this.reset.invoke();
        removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(@NotNull View child, @NotNull View target) {
        super.onDescendantInvalidated(child, target);
        invalidateOrDefer();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().clear$ui(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l2, int t2, int r2, int b4) {
        this.view.layout(0, 0, r2 - l2, b4 - t2);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(widthMeasureSpec), View.MeasureSpec.getSize(heightMeasureSpec));
            return;
        }
        if (this.view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        this.view.measure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(this.view.getMeasuredWidth(), this.view.getMeasuredHeight());
        this.lastWidthMeasureSpec = widthMeasureSpec;
        this.lastHeightMeasureSpec = heightMeasureSpec;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(@NotNull View target, float velocityX, float velocityY, boolean consumed) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        e0.C(this.dispatcher.getCoroutineScope(), null, null, new AnonymousClass1(consumed, this, VelocityKt.Velocity(AndroidViewHolder_androidKt.toComposeVelocity(velocityX), AndroidViewHolder_androidKt.toComposeVelocity(velocityY)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(@NotNull View target, float velocityX, float velocityY) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        e0.C(this.dispatcher.getCoroutineScope(), null, null, new C19201(VelocityKt.Velocity(AndroidViewHolder_androidKt.toComposeVelocity(velocityX), AndroidViewHolder_androidKt.toComposeVelocity(velocityY)), null), 3);
        return false;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(@NotNull View target, int dx9, int dy10, @NotNull int[] consumed, int type) {
        if (isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.dispatcher;
            float composeOffset = AndroidViewHolder_androidKt.toComposeOffset(dx9);
            long jM2408dispatchPreScrollOzD1aCk = nestedScrollDispatcher.m2408dispatchPreScrollOzD1aCk(Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(AndroidViewHolder_androidKt.toComposeOffset(dy10))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(composeOffset) << 32)), AndroidViewHolder_androidKt.toNestedScrollSource(type));
            consumed[0] = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (jM2408dispatchPreScrollOzD1aCk >> 32)));
            consumed[1] = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (jM2408dispatchPreScrollOzD1aCk & BodyPartID.bodyIdMax)));
        }
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(@NotNull View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, @NotNull int[] consumed) {
        if (isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.dispatcher;
            float composeOffset = AndroidViewHolder_androidKt.toComposeOffset(dxConsumed);
            long jM1827constructorimpl = Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(AndroidViewHolder_androidKt.toComposeOffset(dyConsumed))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(composeOffset) << 32));
            float composeOffset2 = AndroidViewHolder_androidKt.toComposeOffset(dxUnconsumed);
            long jM2406dispatchPostScrollDzOQY0M = nestedScrollDispatcher.m2406dispatchPostScrollDzOQY0M(jM1827constructorimpl, Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(AndroidViewHolder_androidKt.toComposeOffset(dyUnconsumed))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(composeOffset2) << 32)), AndroidViewHolder_androidKt.toNestedScrollSource(type));
            consumed[0] = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (jM2406dispatchPostScrollDzOQY0M >> 32)));
            consumed[1] = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (jM2406dispatchPostScrollDzOQY0M & BodyPartID.bodyIdMax)));
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(@NotNull View child, @NotNull View target, int axes, int type) {
        this.nestedScrollingParentHelper.onNestedScrollAccepted(child, target, axes, type);
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onRelease() {
        this.release.invoke();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onReuse() {
        if (this.view.getParent() != this) {
            addView(this.view);
        } else {
            this.reset.invoke();
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(@NotNull View child, @NotNull View target, int axes, int type) {
        return ((axes & 2) == 0 && (axes & 1) == 0) ? false : true;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(@NotNull View target, int type) {
        this.nestedScrollingParentHelper.onStopNestedScroll(target, type);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
    }

    public final void remeasure() {
        int i;
        int i2 = this.lastWidthMeasureSpec;
        if (i2 == Integer.MIN_VALUE || (i = this.lastHeightMeasureSpec) == Integer.MIN_VALUE) {
            return;
        }
        measure(i2, i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(@NotNull View child, android.graphics.Rect rectangle, boolean immediate) {
        Function1<? super Rect, Unit> function1 = this.bringIntoViewRequester;
        if (function1 == null) {
            return true;
        }
        function1.invoke(rectangle != null ? RectHelper_androidKt.toComposeRect(rectangle) : null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        Function1<? super Boolean, Unit> function1 = this.onRequestDisallowInterceptTouchEvent;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(disallowIntercept));
        }
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }

    public final void setDensity(@NotNull Density density) {
        if (density != this.density) {
            this.density = density;
            Function1<? super Density, Unit> function1 = this.onDensityChanged;
            if (function1 != null) {
                function1.invoke(density);
            }
        }
    }

    public final void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner != this.lifecycleOwner) {
            this.lifecycleOwner = lifecycleOwner;
            ViewTreeLifecycleOwner.set(this, lifecycleOwner);
        }
    }

    public final void setModifier(@NotNull Modifier modifier) {
        if (modifier != this.modifier) {
            this.modifier = modifier;
            Function1<? super Modifier, Unit> function1 = this.onModifierChanged;
            if (function1 != null) {
                function1.invoke(modifier);
            }
        }
    }

    public final void setOnDensityChanged$ui(Function1<? super Density, Unit> function1) {
        this.onDensityChanged = function1;
    }

    public final void setOnModifierChanged$ui(Function1<? super Modifier, Unit> function1) {
        this.onModifierChanged = function1;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(Function1<? super Boolean, Unit> function1) {
        this.onRequestDisallowInterceptTouchEvent = function1;
    }

    public final void setRelease(@NotNull Function0<Unit> function0) {
        this.release = function0;
    }

    public final void setReset(@NotNull Function0<Unit> function0) {
        this.reset = function0;
    }

    public final void setSavedStateRegistryOwner(SavedStateRegistryOwner savedStateRegistryOwner) {
        if (savedStateRegistryOwner != this.savedStateRegistryOwner) {
            this.savedStateRegistryOwner = savedStateRegistryOwner;
            ViewTreeSavedStateRegistryOwner.set(this, savedStateRegistryOwner);
        }
    }

    public final void setUpdate(@NotNull Function0<Unit> function0) {
        this.update = function0;
        this.hasUpdateBlock = true;
        this.runUpdate.invoke();
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(@NotNull View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
        if (isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.dispatcher;
            float composeOffset = AndroidViewHolder_androidKt.toComposeOffset(dxConsumed);
            long jM1827constructorimpl = Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(AndroidViewHolder_androidKt.toComposeOffset(dyConsumed))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(composeOffset) << 32));
            float composeOffset2 = AndroidViewHolder_androidKt.toComposeOffset(dxUnconsumed);
            nestedScrollDispatcher.m2406dispatchPostScrollDzOQY0M(jM1827constructorimpl, Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(AndroidViewHolder_androidKt.toComposeOffset(dyUnconsumed))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(composeOffset2) << 32)), AndroidViewHolder_androidKt.toNestedScrollSource(type));
        }
    }
}
