package androidx.compose.runtime;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectIntMap;
import androidx.collection.ScatterSet;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.changelist.ChangeList;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.internal.RememberEventDispatcher;
import androidx.compose.runtime.internal.Trace;
import androidx.compose.runtime.snapshots.ReaderKind;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.tooling.CompositionObserver;
import androidx.compose.runtime.tooling.ObservableComposition;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.h0;
import zhm.p;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0090\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B'\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u00152\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\u00152\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u001f\u0010\u001e\u001a\u00020\u00102\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u001f\u0010\u0013J\u000f\u0010\"\u001a\u00020\u0010H\u0000¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\u0010H\u0016¢\u0006\u0004\b#\u0010!J\u001d\u0010&\u001a\u00020\u00102\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040$H\u0016¢\u0006\u0004\b&\u0010'J\u001d\u0010)\u001a\u00020(2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040$H\u0016¢\u0006\u0004\b)\u0010*J\u001d\u0010,\u001a\u00020\u00102\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u0004H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u0004H\u0016¢\u0006\u0004\b1\u00100J\u000f\u00102\u001a\u00020(H\u0016¢\u0006\u0004\b2\u00103J+\u00108\u001a\u00020\u00102\u001a\u00107\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u000206\u0012\u0006\u0012\u0004\u0018\u0001060504H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\u00102\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0010H\u0016¢\u0006\u0004\b>\u0010!J\u000f\u0010?\u001a\u00020\u0010H\u0016¢\u0006\u0004\b?\u0010!J\u000f\u0010@\u001a\u00020\u0010H\u0016¢\u0006\u0004\b@\u0010!J\u000f\u0010A\u001a\u00020\u0010H\u0016¢\u0006\u0004\bA\u0010!J\u000f\u0010B\u001a\u00020\u0010H\u0016¢\u0006\u0004\bB\u0010!J5\u0010G\u001a\u00028\u0000\"\u0004\b\u0000\u0010C2\b\u0010D\u001a\u0004\u0018\u00010\u00012\u0006\u0010F\u001a\u00020E2\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\bG\u0010HJ\u001b\u0010K\u001a\u0004\u0018\u00010I2\b\u0010J\u001a\u0004\u0018\u00010IH\u0016¢\u0006\u0004\bK\u0010LJ!\u0010Q\u001a\u00020P2\u0006\u0010N\u001a\u00020M2\b\u0010O\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001a\u00020\u00102\u0006\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bS\u0010TJ\u001f\u0010W\u001a\u00020\u00102\u0006\u0010O\u001a\u00020\u00042\u0006\u0010N\u001a\u00020MH\u0000¢\u0006\u0004\bU\u0010VJ\u001b\u0010[\u001a\u00020\u00102\n\u0010;\u001a\u0006\u0012\u0002\b\u00030XH\u0000¢\u0006\u0004\bY\u0010ZJ\u000f\u0010\\\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\\\u0010!J\u001d\u0010]\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b]\u0010\u0013J%\u0010_\u001a\u00020\u00152\u0006\u0010^\u001a\u00020(2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b_\u0010`J\u001d\u0010a\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\ba\u0010\u0013J\u000f\u0010b\u001a\u00020\u0010H\u0002¢\u0006\u0004\bb\u0010!J\u000f\u0010c\u001a\u00020(H\u0002¢\u0006\u0004\bc\u00103J\u000f\u0010d\u001a\u00020\u0010H\u0002¢\u0006\u0004\bd\u0010!J\u000f\u0010e\u001a\u00020\u0010H\u0002¢\u0006\u0004\be\u0010!J\u000f\u0010f\u001a\u00020\u0010H\u0002¢\u0006\u0004\bf\u0010!J\u001f\u0010h\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u00042\u0006\u0010g\u001a\u00020(H\u0002¢\u0006\u0004\bh\u0010iJ%\u0010h\u001a\u00020\u00102\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040$2\u0006\u0010g\u001a\u00020(H\u0002¢\u0006\u0004\bh\u0010jJ\u000f\u0010k\u001a\u00020\u0010H\u0002¢\u0006\u0004\bk\u0010!J\u0017\u0010l\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u0004H\u0002¢\u0006\u0004\bl\u00100J\u0017\u0010o\u001a\u00020\u00102\u0006\u0010n\u001a\u00020mH\u0002¢\u0006\u0004\bo\u0010pJ!\u0010q\u001a\u00020(2\u0006\u0010N\u001a\u00020M2\b\u0010O\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\bq\u0010rJ)\u0010u\u001a\u00020P2\u0006\u0010N\u001a\u00020M2\u0006\u0010t\u001a\u00020s2\b\u0010O\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\bu\u0010vJ\u001b\u0010z\u001a\u000e\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020\u00040wH\u0002¢\u0006\u0004\bx\u0010yJ\u0011\u0010|\u001a\u0004\u0018\u00010{H\u0002¢\u0006\u0004\b|\u0010}R\u0018\u0010\b\u001a\u00020\u00078\u0007¢\u0006\r\n\u0004\b\b\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0019\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\n\u0010\u0081\u0001R-\u0010\u0084\u0001\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0082\u0001j\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\u0083\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001c\u0010\u0087\u0001\u001a\u00070\u0004j\u0003`\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R&\u0010\u008b\u0001\u001a\n\u0012\u0005\u0012\u00030\u008a\u00010\u0089\u00018\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u0012\u0005\b\u008d\u0001\u0010!R'\u0010\u008f\u0001\u001a\u00030\u008e\u00018\u0000X\u0080\u0004¢\u0006\u0017\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u0012\u0005\b\u0093\u0001\u0010!\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R#\u0010\u0094\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020M0w8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001e\u0010\u0097\u0001\u001a\t\u0012\u0004\u0012\u00020M0\u0096\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u001e\u0010\u0099\u0001\u001a\t\u0012\u0004\u0012\u00020M0\u0096\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u0098\u0001R'\u0010\u009a\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030X0w8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u0095\u0001R\u0015\u0010n\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bn\u0010\u009b\u0001R\u0017\u0010\u009c\u0001\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009b\u0001R#\u0010\u009d\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020M0w8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u0095\u0001R%\u0010\u009e\u0001\u001a\u000e\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020\u00040w8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u0095\u0001R/\u0010\u009f\u0001\u001a\u00020(8\u0000@\u0000X\u0080\u000e¢\u0006\u001e\n\u0006\b\u009f\u0001\u0010 \u0001\u0012\u0005\b¤\u0001\u0010!\u001a\u0005\b¡\u0001\u00103\"\u0006\b¢\u0001\u0010£\u0001R\u0019\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bJ\u0010¥\u0001R\u001c\u0010§\u0001\u001a\u0005\u0018\u00010¦\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u001b\u0010©\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u0019\u0010«\u0001\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R \u0010®\u0001\u001a\u00030\u00ad\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001R\u0018\u0010³\u0001\u001a\u00030²\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R \u0010¶\u0001\u001a\u00030µ\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b¶\u0001\u0010·\u0001\u001a\u0006\b¸\u0001\u0010¹\u0001R\u0019\u0010º\u0001\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R\u001b\u0010¼\u0001\u001a\u00020(8\u0006¢\u0006\u000f\n\u0006\b¼\u0001\u0010 \u0001\u001a\u0005\b¼\u0001\u00103R\u0017\u0010;\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b;\u0010¬\u0001R.\u0010½\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b½\u0001\u0010¾\u0001\u001a\u0006\b¿\u0001\u0010À\u0001\"\u0005\bÁ\u0001\u0010\u0013R\u0016\u0010Â\u0001\u001a\u00020(8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÂ\u0001\u00103R\u0016\u0010Ã\u0001\u001a\u00020(8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÃ\u0001\u00103R\u0016\u0010Å\u0001\u001a\u00020(8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÄ\u0001\u00103R\u0016\u0010Ç\u0001\u001a\u00020(8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÆ\u0001\u00103¨\u0006È\u0001"}, d2 = {"Landroidx/compose/runtime/CompositionImpl;", "Landroidx/compose/runtime/ControlledComposition;", "Landroidx/compose/runtime/ReusableComposition;", "Landroidx/compose/runtime/RecomposeScopeOwner;", "", "Landroidx/compose/runtime/PausableComposition;", "Landroidx/compose/runtime/tooling/ObservableComposition;", "Landroidx/compose/runtime/CompositionContext;", "parent", "Landroidx/compose/runtime/Applier;", "applier", "Lkotlin/coroutines/CoroutineContext;", "recomposeContext", "<init>", "(Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/Applier;Lkotlin/coroutines/CoroutineContext;)V", "Lkotlin/Function0;", "", "content", "setContent", "(Lkotlin/jvm/functions/Function2;)V", "setContentWithReuse", "Landroidx/compose/runtime/PausedComposition;", "setPausableContent", "(Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/PausedComposition;", "setPausableContentWithReuse", "Landroidx/collection/ScatterSet;", "Landroidx/compose/runtime/RememberObserverHolder;", "ignoreSet", "pausedCompositionFinished$runtime", "(Landroidx/collection/ScatterSet;)V", "pausedCompositionFinished", "composeContent", "updateMovingInvalidations$runtime", "()V", "updateMovingInvalidations", "dispose", "", "values", "recordModificationsOf", "(Ljava/util/Set;)V", "", "observesAnyOf", "(Ljava/util/Set;)Z", "block", "prepareCompose", "(Lkotlin/jvm/functions/Function0;)V", "value", "recordReadOf", "(Ljava/lang/Object;)V", "recordWriteOf", "recompose", "()Z", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/MovableContentStateReference;", "references", "insertMovableContent", "(Ljava/util/List;)V", "Landroidx/compose/runtime/MovableContentState;", "state", "disposeUnusedMovableContent", "(Landroidx/compose/runtime/MovableContentState;)V", "applyChanges", "applyLateChanges", "changesApplied", "abandonChanges", "invalidateAll", "R", "to", "", "groupIndex", "delegateInvalidations", "(Landroidx/compose/runtime/ControlledComposition;ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Landroidx/compose/runtime/ShouldPauseCallback;", "shouldPause", "getAndSetShouldPauseCallback", "(Landroidx/compose/runtime/ShouldPauseCallback;)Landroidx/compose/runtime/ShouldPauseCallback;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "instance", "Landroidx/compose/runtime/InvalidationResult;", "invalidate", "(Landroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;", "recomposeScopeReleased", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "removeObservation$runtime", "(Ljava/lang/Object;Landroidx/compose/runtime/RecomposeScopeImpl;)V", "removeObservation", "Landroidx/compose/runtime/DerivedState;", "removeDerivedStateObservation$runtime", "(Landroidx/compose/runtime/DerivedState;)V", "removeDerivedStateObservation", "deactivate", "composeInitial", "reusable", "composeInitialPaused", "(ZLkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/PausedComposition;", "composeInitialWithReuse", "ensureRunning", "clearDeactivated", "drainPendingModificationsForCompositionLocked", "drainPendingModificationsLocked", "drainPendingModificationsOutOfBandLocked", "forgetConditionalScopes", "addPendingInvalidationsLocked", "(Ljava/lang/Object;Z)V", "(Ljava/util/Set;Z)V", "cleanUpDerivedStateObservations", "invalidateScopeOfLocked", "Landroidx/compose/runtime/changelist/ChangeList;", "changes", "applyChangesInLocked", "(Landroidx/compose/runtime/changelist/ChangeList;)V", "tryImminentInvalidation", "(Landroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)Z", "Landroidx/compose/runtime/Anchor;", "anchor", "invalidateChecked", "(Landroidx/compose/runtime/RecomposeScopeImpl;Landroidx/compose/runtime/Anchor;Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;", "Landroidx/compose/runtime/collection/ScopeMap;", "takeInvalidations-afanTW4", "()Landroidx/collection/MutableScatterMap;", "takeInvalidations", "Landroidx/compose/runtime/tooling/CompositionObserver;", "observer", "()Landroidx/compose/runtime/tooling/CompositionObserver;", "Landroidx/compose/runtime/CompositionContext;", "getParent", "()Landroidx/compose/runtime/CompositionContext;", "Landroidx/compose/runtime/Applier;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/internal/AtomicReference;", "pendingModifications", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/platform/SynchronizedObject;", "lock", "Ljava/lang/Object;", "", "Landroidx/compose/runtime/RememberObserver;", "abandonSet", "Ljava/util/Set;", "getAbandonSet$annotations", "Landroidx/compose/runtime/SlotTable;", "slotTable", "Landroidx/compose/runtime/SlotTable;", "getSlotTable$runtime", "()Landroidx/compose/runtime/SlotTable;", "getSlotTable$runtime$annotations", "observations", "Landroidx/collection/MutableScatterMap;", "Landroidx/collection/MutableScatterSet;", "invalidatedScopes", "Landroidx/collection/MutableScatterSet;", "conditionallyInvalidatedScopes", "derivedStates", "Landroidx/compose/runtime/changelist/ChangeList;", "lateChanges", "observationsProcessed", "invalidations", "pendingInvalidScopes", "Z", "getPendingInvalidScopes$runtime", "setPendingInvalidScopes$runtime", "(Z)V", "getPendingInvalidScopes$runtime$annotations", "Landroidx/compose/runtime/ShouldPauseCallback;", "Landroidx/compose/runtime/PausedCompositionImpl;", "pendingPausedComposition", "Landroidx/compose/runtime/PausedCompositionImpl;", "invalidationDelegate", "Landroidx/compose/runtime/CompositionImpl;", "invalidationDelegateGroup", "I", "Landroidx/compose/runtime/CompositionObserverHolder;", "observerHolder", "Landroidx/compose/runtime/CompositionObserverHolder;", "getObserverHolder$runtime", "()Landroidx/compose/runtime/CompositionObserverHolder;", "Landroidx/compose/runtime/internal/RememberEventDispatcher;", "rememberManager", "Landroidx/compose/runtime/internal/RememberEventDispatcher;", "Landroidx/compose/runtime/ComposerImpl;", "composer", "Landroidx/compose/runtime/ComposerImpl;", "getComposer$runtime", "()Landroidx/compose/runtime/ComposerImpl;", "_recomposeContext", "Lkotlin/coroutines/CoroutineContext;", "isRoot", "composable", "Lkotlin/jvm/functions/Function2;", "getComposable", "()Lkotlin/jvm/functions/Function2;", "setComposable", "isComposing", "isDisposed", "getHasInvalidations", "hasInvalidations", "getAreChildrenComposing", "areChildrenComposing", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CompositionImpl implements ControlledComposition, ReusableComposition, RecomposeScopeOwner, PausableComposition, ObservableComposition {
    private final CoroutineContext _recomposeContext;

    @NotNull
    private final Set<RememberObserver> abandonSet;

    @NotNull
    private final Applier<?> applier;

    @NotNull
    private final ChangeList changes;

    @NotNull
    private Function2<? super Composer, ? super Integer, Unit> composable;

    @NotNull
    private final ComposerImpl composer;

    @NotNull
    private final MutableScatterSet<RecomposeScopeImpl> conditionallyInvalidatedScopes;

    @NotNull
    private final MutableScatterMap<Object, Object> derivedStates;

    @NotNull
    private final MutableScatterSet<RecomposeScopeImpl> invalidatedScopes;
    private CompositionImpl invalidationDelegate;
    private int invalidationDelegateGroup;

    @NotNull
    private MutableScatterMap<Object, Object> invalidations;
    private final boolean isRoot;

    @NotNull
    private final ChangeList lateChanges;

    @NotNull
    private final Object lock;

    @NotNull
    private final MutableScatterMap<Object, Object> observations;

    @NotNull
    private final MutableScatterMap<Object, Object> observationsProcessed;

    @NotNull
    private final CompositionObserverHolder observerHolder;

    @NotNull
    private final CompositionContext parent;
    private boolean pendingInvalidScopes;

    @NotNull
    private final AtomicReference<Object> pendingModifications;
    private PausedCompositionImpl pendingPausedComposition;

    @NotNull
    private final RememberEventDispatcher rememberManager;
    private ShouldPauseCallback shouldPause;

    @NotNull
    private final SlotTable slotTable;
    private int state;

    public CompositionImpl(@NotNull CompositionContext compositionContext, @NotNull Applier<?> applier, CoroutineContext coroutineContext) {
        this.parent = compositionContext;
        this.applier = applier;
        this.pendingModifications = new AtomicReference<>(null);
        this.lock = new Object();
        Set<RememberObserver> setAsMutableSet = new MutableScatterSet(0, 1, null).asMutableSet();
        this.abandonSet = setAsMutableSet;
        SlotTable slotTable = new SlotTable();
        if (compositionContext.getCollectingCallByInformation$runtime()) {
            slotTable.collectCalledByInformation();
        }
        if (compositionContext.getCollectingSourceInformation()) {
            slotTable.collectSourceInformation();
        }
        this.slotTable = slotTable;
        this.observations = ScopeMap.m1691constructorimpl$default(null, 1, null);
        this.invalidatedScopes = new MutableScatterSet<>(0, 1, null);
        this.conditionallyInvalidatedScopes = new MutableScatterSet<>(0, 1, null);
        this.derivedStates = ScopeMap.m1691constructorimpl$default(null, 1, null);
        ChangeList changeList = new ChangeList();
        this.changes = changeList;
        ChangeList changeList2 = new ChangeList();
        this.lateChanges = changeList2;
        this.observationsProcessed = ScopeMap.m1691constructorimpl$default(null, 1, null);
        this.invalidations = ScopeMap.m1691constructorimpl$default(null, 1, null);
        CompositionObserverHolder compositionObserverHolder = new CompositionObserverHolder(null, false, compositionContext, 3, null);
        this.observerHolder = compositionObserverHolder;
        this.rememberManager = new RememberEventDispatcher();
        ComposerImpl composerImpl = new ComposerImpl(applier, compositionContext, slotTable, setAsMutableSet, changeList, changeList2, compositionObserverHolder, this);
        compositionContext.registerComposer$runtime(composerImpl);
        this.composer = composerImpl;
        this._recomposeContext = coroutineContext;
        this.isRoot = compositionContext instanceof Recomposer;
        this.composable = ComposableSingletons$CompositionKt.INSTANCE.getLambda$954879418$runtime();
    }

    private final void addPendingInvalidationsLocked(Object value, boolean forgetConditionalScopes) {
        Object obj2 = this.observations.get(value);
        if (obj2 == null) {
            return;
        }
        if (!(obj2 instanceof MutableScatterSet)) {
            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj2;
            if (ScopeMap.m1694removeimpl(this.observationsProcessed, value, recomposeScopeImpl) || recomposeScopeImpl.invalidateForResult(value) == InvalidationResult.IGNORED) {
                return;
            }
            if (!recomposeScopeImpl.isConditional() || forgetConditionalScopes) {
                this.invalidatedScopes.add(recomposeScopeImpl);
                return;
            } else {
                this.conditionallyInvalidatedScopes.add(recomposeScopeImpl);
                return;
            }
        }
        MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
        Object[] objArr = mutableScatterSet.elements;
        long[] jArr = mutableScatterSet.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j2 = jArr[i];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j2) < 128) {
                        RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) objArr[(i << 3) + i3];
                        if (!ScopeMap.m1694removeimpl(this.observationsProcessed, value, recomposeScopeImpl2) && recomposeScopeImpl2.invalidateForResult(value) != InvalidationResult.IGNORED) {
                            if (!recomposeScopeImpl2.isConditional() || forgetConditionalScopes) {
                                this.invalidatedScopes.add(recomposeScopeImpl2);
                            } else {
                                this.conditionallyInvalidatedScopes.add(recomposeScopeImpl2);
                            }
                        }
                    }
                    j2 >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    private final void applyChangesInLocked(ChangeList changes) {
        Applier<?> pausableApplier$runtime;
        RememberEventDispatcher rememberManager$runtime;
        long[] jArr;
        long[] jArr2;
        long j2;
        char c2;
        long j3;
        int i;
        boolean zIsEmpty;
        long[] jArr3;
        this.rememberManager.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
        try {
            if (changes.isEmpty()) {
                try {
                    if (this.lateChanges.isEmpty() && this.pendingPausedComposition == null) {
                        this.rememberManager.dispatchAbandons();
                    }
                } finally {
                }
            } else {
                PausedCompositionImpl pausedCompositionImpl = this.pendingPausedComposition;
                if (pausedCompositionImpl == null || (pausableApplier$runtime = pausedCompositionImpl.getPausableApplier$runtime()) == null) {
                    pausableApplier$runtime = this.applier;
                }
                PausedCompositionImpl pausedCompositionImpl2 = this.pendingPausedComposition;
                String str = Intrinsics.f(pausableApplier$runtime, pausedCompositionImpl2 != null ? pausedCompositionImpl2.getPausableApplier$runtime() : null) ? "Compose:recordChanges" : "Compose:applyChanges";
                Trace trace = Trace.INSTANCE;
                Object objBeginSection = trace.beginSection(str);
                try {
                    PausedCompositionImpl pausedCompositionImpl3 = this.pendingPausedComposition;
                    if (pausedCompositionImpl3 == null || (rememberManager$runtime = pausedCompositionImpl3.getRememberManager()) == null) {
                        rememberManager$runtime = this.rememberManager;
                    }
                    pausableApplier$runtime.onBeginChanges();
                    SlotWriter slotWriterOpenWriter = this.slotTable.openWriter();
                    int i2 = 0;
                    try {
                        changes.executeAndFlushAllPendingChanges(pausableApplier$runtime, slotWriterOpenWriter, rememberManager$runtime, this.composer.getErrorContext$runtime());
                        Unit unit = Unit.f186387a;
                        slotWriterOpenWriter.close(true);
                        pausableApplier$runtime.onEndChanges();
                        trace.endSection(objBeginSection);
                        this.rememberManager.dispatchRememberObservers();
                        this.rememberManager.dispatchSideEffects();
                        if (this.pendingInvalidScopes) {
                            objBeginSection = trace.beginSection("Compose:unobserve");
                            try {
                                this.pendingInvalidScopes = false;
                                MutableScatterMap<Object, Object> mutableScatterMap = this.observations;
                                long[] jArr4 = mutableScatterMap.metadata;
                                int length = jArr4.length - 2;
                                if (length >= 0) {
                                    int i3 = 0;
                                    while (true) {
                                        long j5 = jArr4[i3];
                                        char c3 = 7;
                                        long j16 = -9187201950435737472L;
                                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i5 = 8;
                                            int i6 = 8 - ((~(i3 - length)) >>> 31);
                                            int i21 = i2;
                                            while (i21 < i6) {
                                                if ((j5 & 255) < 128) {
                                                    int i22 = (i3 << 3) + i21;
                                                    c2 = c3;
                                                    Object obj2 = mutableScatterMap.keys[i22];
                                                    Object obj3 = mutableScatterMap.values[i22];
                                                    j3 = j16;
                                                    if (obj3 instanceof MutableScatterSet) {
                                                        MutableScatterSet mutableScatterSet = (MutableScatterSet) obj3;
                                                        Object[] objArr = mutableScatterSet.elements;
                                                        long[] jArr5 = mutableScatterSet.metadata;
                                                        int length2 = jArr5.length - 2;
                                                        if (length2 >= 0) {
                                                            j2 = j5;
                                                            int i32 = i5;
                                                            int i33 = 0;
                                                            while (true) {
                                                                long j22 = jArr5[i33];
                                                                Object[] objArr2 = objArr;
                                                                long[] jArr6 = jArr5;
                                                                if ((((~j22) << c2) & j22 & j3) != j3) {
                                                                    int i43 = 8 - ((~(i33 - length2)) >>> 31);
                                                                    int i59 = 0;
                                                                    while (i59 < i43) {
                                                                        if ((j22 & 255) < 128) {
                                                                            jArr3 = jArr4;
                                                                            int i66 = (i33 << 3) + i59;
                                                                            if (!((RecomposeScopeImpl) objArr2[i66]).getValid()) {
                                                                                mutableScatterSet.removeElementAt(i66);
                                                                            }
                                                                        } else {
                                                                            jArr3 = jArr4;
                                                                        }
                                                                        j22 >>= i32;
                                                                        i59++;
                                                                        jArr4 = jArr3;
                                                                    }
                                                                    jArr2 = jArr4;
                                                                    if (i43 != i32) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    jArr2 = jArr4;
                                                                }
                                                                if (i33 == length2) {
                                                                    break;
                                                                }
                                                                i33++;
                                                                objArr = objArr2;
                                                                jArr5 = jArr6;
                                                                jArr4 = jArr2;
                                                                i32 = 8;
                                                            }
                                                        } else {
                                                            jArr2 = jArr4;
                                                            j2 = j5;
                                                        }
                                                        zIsEmpty = mutableScatterSet.isEmpty();
                                                    } else {
                                                        jArr2 = jArr4;
                                                        j2 = j5;
                                                        Intrinsics.i(obj3, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                                        zIsEmpty = !((RecomposeScopeImpl) obj3).getValid();
                                                    }
                                                    if (zIsEmpty) {
                                                        mutableScatterMap.removeValueAt(i22);
                                                    }
                                                    i = 8;
                                                } else {
                                                    jArr2 = jArr4;
                                                    j2 = j5;
                                                    c2 = c3;
                                                    j3 = j16;
                                                    i = i5;
                                                }
                                                j5 = j2 >> i;
                                                i21++;
                                                i5 = i;
                                                c3 = c2;
                                                j16 = j3;
                                                jArr4 = jArr2;
                                            }
                                            jArr = jArr4;
                                            if (i6 != i5) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr4;
                                        }
                                        if (i3 == length) {
                                            break;
                                        }
                                        i3++;
                                        jArr4 = jArr;
                                        i2 = 0;
                                    }
                                }
                                cleanUpDerivedStateObservations();
                                Unit unit2 = Unit.f186387a;
                                Trace.INSTANCE.endSection(objBeginSection);
                            } finally {
                                Trace.INSTANCE.endSection(objBeginSection);
                            }
                        }
                        try {
                            if (this.lateChanges.isEmpty() && this.pendingPausedComposition == null) {
                                this.rememberManager.dispatchAbandons();
                            }
                        } finally {
                        }
                    } catch (Throwable th10) {
                        slotWriterOpenWriter.close(false);
                        throw th10;
                    }
                } catch (Throwable th11) {
                    throw th11;
                }
            }
        } catch (Throwable th12) {
            try {
                if (this.lateChanges.isEmpty() && this.pendingPausedComposition == null) {
                    this.rememberManager.dispatchAbandons();
                }
                throw th12;
            } finally {
            }
        }
    }

    private final void cleanUpDerivedStateObservations() {
        char c2;
        long j2;
        long j3;
        long j5;
        long[] jArr;
        long[] jArr2;
        long j16;
        int i;
        char c3;
        long j22;
        long j42;
        int i2;
        boolean zIsEmpty;
        long[] jArr3;
        int i3;
        int i5;
        MutableScatterMap<Object, Object> mutableScatterMap = this.derivedStates;
        long[] jArr4 = mutableScatterMap.metadata;
        int length = jArr4.length - 2;
        char c5 = 7;
        long j46 = -9187201950435737472L;
        int i6 = 8;
        if (length >= 0) {
            int i21 = 0;
            long j47 = 128;
            while (true) {
                long j57 = jArr4[i21];
                j3 = 255;
                if ((((~j57) << c5) & j57 & j46) != j46) {
                    int i22 = 8 - ((~(i21 - length)) >>> 31);
                    int i32 = 0;
                    while (i32 < i22) {
                        if ((j57 & 255) < j47) {
                            c3 = c5;
                            int i33 = (i21 << 3) + i32;
                            j22 = j46;
                            Object obj2 = mutableScatterMap.keys[i33];
                            Object obj3 = mutableScatterMap.values[i33];
                            if (obj3 instanceof MutableScatterSet) {
                                MutableScatterSet mutableScatterSet = (MutableScatterSet) obj3;
                                Object[] objArr = mutableScatterSet.elements;
                                long[] jArr5 = mutableScatterSet.metadata;
                                int length2 = jArr5.length - 2;
                                if (length2 >= 0) {
                                    j42 = j47;
                                    int i43 = 0;
                                    int i59 = i6;
                                    while (true) {
                                        int i66 = length2;
                                        long j58 = jArr5[i43];
                                        j16 = j57;
                                        if ((((~j58) << c3) & j58 & j22) != j22) {
                                            int i74 = 8 - ((~(i43 - i66)) >>> 31);
                                            int i92 = 0;
                                            while (i92 < i74) {
                                                if ((j58 & 255) < j42) {
                                                    jArr3 = jArr4;
                                                    int i96 = (i43 << 3) + i92;
                                                    i3 = i92;
                                                    i5 = i32;
                                                    if (!ScopeMap.m1692containsimpl(this.observations, (DerivedState) objArr[i96])) {
                                                        mutableScatterSet.removeElementAt(i96);
                                                    }
                                                } else {
                                                    jArr3 = jArr4;
                                                    i3 = i92;
                                                    i5 = i32;
                                                }
                                                j58 >>= i59;
                                                i92 = i3 + 1;
                                                i32 = i5;
                                                jArr4 = jArr3;
                                            }
                                            jArr2 = jArr4;
                                            i = i32;
                                            if (i74 != i59) {
                                                break;
                                            }
                                        } else {
                                            jArr2 = jArr4;
                                            i = i32;
                                        }
                                        length2 = i66;
                                        if (i43 == length2) {
                                            break;
                                        }
                                        i43++;
                                        j57 = j16;
                                        i32 = i;
                                        jArr4 = jArr2;
                                        i59 = 8;
                                    }
                                } else {
                                    jArr2 = jArr4;
                                    j16 = j57;
                                    i = i32;
                                    j42 = j47;
                                }
                                zIsEmpty = mutableScatterSet.isEmpty();
                            } else {
                                jArr2 = jArr4;
                                j16 = j57;
                                i = i32;
                                j42 = j47;
                                Intrinsics.i(obj3, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                zIsEmpty = !ScopeMap.m1692containsimpl(this.observations, (DerivedState) obj3);
                            }
                            if (zIsEmpty) {
                                mutableScatterMap.removeValueAt(i33);
                            }
                            i2 = 8;
                        } else {
                            jArr2 = jArr4;
                            j16 = j57;
                            i = i32;
                            c3 = c5;
                            j22 = j46;
                            j42 = j47;
                            i2 = i6;
                        }
                        j57 = j16 >> i2;
                        i32 = i + 1;
                        i6 = i2;
                        c5 = c3;
                        j46 = j22;
                        j47 = j42;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    c2 = c5;
                    j2 = j46;
                    j5 = j47;
                    if (i22 != i6) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                    c2 = c5;
                    j2 = j46;
                    j5 = j47;
                }
                if (i21 == length) {
                    break;
                }
                i21++;
                c5 = c2;
                j46 = j2;
                j47 = j5;
                jArr4 = jArr;
                i6 = 8;
            }
        } else {
            c2 = 7;
            j2 = -9187201950435737472L;
            j3 = 255;
            j5 = 128;
        }
        if (!this.conditionallyInvalidatedScopes.isNotEmpty()) {
            return;
        }
        MutableScatterSet<RecomposeScopeImpl> mutableScatterSet2 = this.conditionallyInvalidatedScopes;
        Object[] objArr2 = mutableScatterSet2.elements;
        long[] jArr6 = mutableScatterSet2.metadata;
        int length3 = jArr6.length - 2;
        if (length3 < 0) {
            return;
        }
        int i99 = 0;
        while (true) {
            long j65 = jArr6[i99];
            if ((((~j65) << c2) & j65 & j2) != j2) {
                int i100 = 8 - ((~(i99 - length3)) >>> 31);
                for (int i101 = 0; i101 < i100; i101++) {
                    if ((j65 & j3) < j5) {
                        int i102 = (i99 << 3) + i101;
                        if (!((RecomposeScopeImpl) objArr2[i102]).isConditional()) {
                            mutableScatterSet2.removeElementAt(i102);
                        }
                    }
                    j65 >>= 8;
                }
                if (i100 != 8) {
                    return;
                }
            }
            if (i99 == length3) {
                return;
            } else {
                i99++;
            }
        }
    }

    private final boolean clearDeactivated() {
        boolean z;
        synchronized (this.lock) {
            z = true;
            if (this.state != 1) {
                z = false;
            }
            if (z) {
                this.state = 0;
            }
        }
        return z;
    }

    private final void composeInitial(Function2<? super Composer, ? super Integer, Unit> content) {
        this.composable = content;
        this.parent.composeInitial$runtime(this, content);
    }

    private final PausedComposition composeInitialPaused(boolean reusable, Function2<? super Composer, ? super Integer, Unit> content) {
        if (this.pendingPausedComposition != null) {
            PreconditionsKt.throwIllegalStateException("A pausable composition is in progress");
        }
        PausedCompositionImpl pausedCompositionImpl = new PausedCompositionImpl(this, this.parent, this.composer, this.abandonSet, content, reusable, this.applier, this.lock);
        this.pendingPausedComposition = pausedCompositionImpl;
        return pausedCompositionImpl;
    }

    private final void composeInitialWithReuse(Function2<? super Composer, ? super Integer, Unit> content) {
        this.composer.startReuseFromRoot();
        composeInitial(content);
        this.composer.endReuseFromRoot();
    }

    private final void drainPendingModificationsForCompositionLocked() {
        Object andSet = this.pendingModifications.getAndSet(CompositionKt.PendingApplyNoModifications);
        if (andSet != null) {
            if (andSet.equals(CompositionKt.PendingApplyNoModifications)) {
                ComposerKt.composeRuntimeError("pending composition has not been applied");
                throw new KotlinNothingValueException();
            }
            if (andSet instanceof Set) {
                addPendingInvalidationsLocked((Set<? extends Object>) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
                throw new KotlinNothingValueException();
            }
            for (Set<? extends Object> set : (Set[]) andSet) {
                addPendingInvalidationsLocked(set, true);
            }
        }
    }

    private final void drainPendingModificationsLocked() {
        Object andSet = this.pendingModifications.getAndSet(null);
        if (Intrinsics.f(andSet, CompositionKt.PendingApplyNoModifications)) {
            return;
        }
        if (andSet instanceof Set) {
            addPendingInvalidationsLocked((Set<? extends Object>) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set<? extends Object> set : (Set[]) andSet) {
                addPendingInvalidationsLocked(set, false);
            }
            return;
        }
        if (andSet != null) {
            ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
            throw new KotlinNothingValueException();
        }
        if (this.pendingPausedComposition == null) {
            ComposerKt.composeImmediateRuntimeError("calling recordModificationsOf and applyChanges concurrently is not supported");
        }
    }

    private final void drainPendingModificationsOutOfBandLocked() {
        Object andSet = this.pendingModifications.getAndSet(h0.f322473a);
        if (Intrinsics.f(andSet, CompositionKt.PendingApplyNoModifications) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            addPendingInvalidationsLocked((Set<? extends Object>) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
            throw new KotlinNothingValueException();
        }
        for (Set<? extends Object> set : (Set[]) andSet) {
            addPendingInvalidationsLocked(set, false);
        }
    }

    private final void ensureRunning() {
        int i = this.state;
        if (!(i == 0)) {
            PreconditionsKt.throwIllegalStateException(i != 1 ? i != 2 ? i != 3 ? "" : "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.");
        }
        if (this.pendingPausedComposition == null) {
            return;
        }
        PreconditionsKt.throwIllegalStateException("A pausable composition is in progress");
    }

    private final boolean getAreChildrenComposing() {
        return this.composer.getAreChildrenComposing$runtime();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a6 A[Catch: all -> 0x001e, EDGE_INSN: B:64:0x00a6->B:49:0x00a6 BREAK  A[LOOP:0: B:31:0x005d->B:45:0x009e], EDGE_INSN: B:65:0x00a6->B:49:0x00a6 BREAK  A[LOOP:0: B:31:0x005d->B:45:0x009e], TRY_LEAVE, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x000b, B:6:0x0010, B:14:0x0023, B:16:0x0029, B:20:0x002f, B:21:0x0038, B:23:0x003c, B:24:0x0045, B:26:0x004d, B:28:0x0051, B:31:0x005d, B:33:0x006d, B:35:0x0079, B:37:0x0083, B:41:0x0092, B:45:0x009e, B:46:0x00a1, B:49:0x00a6), top: B:62:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final androidx.compose.runtime.InvalidationResult invalidateChecked(androidx.compose.runtime.RecomposeScopeImpl r21, androidx.compose.runtime.Anchor r22, java.lang.Object r23) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            r2 = r22
            r3 = r23
            java.lang.Object r4 = r1.lock
            monitor-enter(r4)
            androidx.compose.runtime.CompositionImpl r5 = r1.invalidationDelegate     // Catch: java.lang.Throwable -> L1e
            r6 = 0
            if (r5 == 0) goto L21
            androidx.compose.runtime.SlotTable r7 = r1.slotTable     // Catch: java.lang.Throwable -> L1e
            int r8 = r1.invalidationDelegateGroup     // Catch: java.lang.Throwable -> L1e
            boolean r7 = r7.groupContainsAnchor(r8, r2)     // Catch: java.lang.Throwable -> L1e
            if (r7 == 0) goto L1b
            goto L1c
        L1b:
            r5 = r6
        L1c:
            r6 = r5
            goto L21
        L1e:
            r0 = move-exception
            goto Lc4
        L21:
            if (r6 != 0) goto Lab
            boolean r5 = r1.tryImminentInvalidation(r0, r3)     // Catch: java.lang.Throwable -> L1e
            if (r5 == 0) goto L2d
            androidx.compose.runtime.InvalidationResult r0 = androidx.compose.runtime.InvalidationResult.IMMINENT     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r4)
            return r0
        L2d:
            if (r3 != 0) goto L38
            androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r5 = r1.invalidations     // Catch: java.lang.Throwable -> L1e
            androidx.compose.runtime.ScopeInvalidated r7 = androidx.compose.runtime.ScopeInvalidated.INSTANCE     // Catch: java.lang.Throwable -> L1e
            androidx.compose.runtime.collection.ScopeMap.m1696setimpl(r5, r0, r7)     // Catch: java.lang.Throwable -> L1e
            goto Lab
        L38:
            boolean r5 = r3 instanceof androidx.compose.runtime.DerivedState     // Catch: java.lang.Throwable -> L1e
            if (r5 != 0) goto L45
            androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r5 = r1.invalidations     // Catch: java.lang.Throwable -> L1e
            androidx.compose.runtime.ScopeInvalidated r7 = androidx.compose.runtime.ScopeInvalidated.INSTANCE     // Catch: java.lang.Throwable -> L1e
            androidx.compose.runtime.collection.ScopeMap.m1696setimpl(r5, r0, r7)     // Catch: java.lang.Throwable -> L1e
            goto Lab
        L45:
            androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r5 = r1.invalidations     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r5 = r5.get(r0)     // Catch: java.lang.Throwable -> L1e
            if (r5 == 0) goto La6
            boolean r7 = r5 instanceof androidx.collection.MutableScatterSet     // Catch: java.lang.Throwable -> L1e
            if (r7 == 0) goto La1
            androidx.collection.MutableScatterSet r5 = (androidx.collection.MutableScatterSet) r5     // Catch: java.lang.Throwable -> L1e
            java.lang.Object[] r7 = r5.elements     // Catch: java.lang.Throwable -> L1e
            long[] r5 = r5.metadata     // Catch: java.lang.Throwable -> L1e
            int r8 = r5.length     // Catch: java.lang.Throwable -> L1e
            int r8 = r8 + (-2)
            if (r8 < 0) goto La6
            r10 = 0
        L5d:
            r11 = r5[r10]     // Catch: java.lang.Throwable -> L1e
            long r13 = ~r11     // Catch: java.lang.Throwable -> L1e
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L9c
            int r13 = r10 - r8
            int r13 = ~r13     // Catch: java.lang.Throwable -> L1e
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L77:
            if (r15 >= r13) goto L99
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L90
            int r16 = r10 << 3
            int r16 = r16 + r15
            r9 = r7[r16]     // Catch: java.lang.Throwable -> L1e
            r16 = r14
            androidx.compose.runtime.ScopeInvalidated r14 = androidx.compose.runtime.ScopeInvalidated.INSTANCE     // Catch: java.lang.Throwable -> L1e
            if (r9 != r14) goto L92
            goto Lab
        L90:
            r16 = r14
        L92:
            long r11 = r11 >> r16
            int r15 = r15 + 1
            r14 = r16
            goto L77
        L99:
            r9 = r14
            if (r13 != r9) goto La6
        L9c:
            if (r10 == r8) goto La6
            int r10 = r10 + 1
            goto L5d
        La1:
            androidx.compose.runtime.ScopeInvalidated r7 = androidx.compose.runtime.ScopeInvalidated.INSTANCE     // Catch: java.lang.Throwable -> L1e
            if (r5 != r7) goto La6
            goto Lab
        La6:
            androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r5 = r1.invalidations     // Catch: java.lang.Throwable -> L1e
            androidx.compose.runtime.collection.ScopeMap.m1688addimpl(r5, r0, r3)     // Catch: java.lang.Throwable -> L1e
        Lab:
            monitor-exit(r4)
            if (r6 == 0) goto Lb3
            androidx.compose.runtime.InvalidationResult r0 = r6.invalidateChecked(r0, r2, r3)
            return r0
        Lb3:
            androidx.compose.runtime.CompositionContext r0 = r1.parent
            r0.invalidate$runtime(r1)
            boolean r0 = r1.isComposing()
            if (r0 == 0) goto Lc1
            androidx.compose.runtime.InvalidationResult r0 = androidx.compose.runtime.InvalidationResult.DEFERRED
            return r0
        Lc1:
            androidx.compose.runtime.InvalidationResult r0 = androidx.compose.runtime.InvalidationResult.SCHEDULED
            return r0
        Lc4:
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.invalidateChecked(androidx.compose.runtime.RecomposeScopeImpl, androidx.compose.runtime.Anchor, java.lang.Object):androidx.compose.runtime.InvalidationResult");
    }

    private final void invalidateScopeOfLocked(Object value) {
        Object obj2 = this.observations.get(value);
        if (obj2 == null) {
            return;
        }
        if (!(obj2 instanceof MutableScatterSet)) {
            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj2;
            if (recomposeScopeImpl.invalidateForResult(value) == InvalidationResult.IMMINENT) {
                ScopeMap.m1688addimpl(this.observationsProcessed, value, recomposeScopeImpl);
                return;
            }
            return;
        }
        MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
        Object[] objArr = mutableScatterSet.elements;
        long[] jArr = mutableScatterSet.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j2 = jArr[i];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j2) < 128) {
                        RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) objArr[(i << 3) + i3];
                        if (recomposeScopeImpl2.invalidateForResult(value) == InvalidationResult.IMMINENT) {
                            ScopeMap.m1688addimpl(this.observationsProcessed, value, recomposeScopeImpl2);
                        }
                    }
                    j2 >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    private final CompositionObserver observer() {
        this.observerHolder.current();
        return null;
    }

    /* JADX INFO: renamed from: takeInvalidations-afanTW4, reason: not valid java name */
    private final MutableScatterMap<Object, Object> m1637takeInvalidationsafanTW4() {
        MutableScatterMap<Object, Object> mutableScatterMap = this.invalidations;
        this.invalidations = ScopeMap.m1691constructorimpl$default(null, 1, null);
        return mutableScatterMap;
    }

    private final boolean tryImminentInvalidation(RecomposeScopeImpl scope, Object instance) {
        return isComposing() && this.composer.tryImminentInvalidation$runtime(scope, instance);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void abandonChanges() {
        this.pendingModifications.set(null);
        this.changes.clear();
        this.lateChanges.clear();
        if (this.abandonSet.isEmpty()) {
            return;
        }
        RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
        try {
            rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
            rememberEventDispatcher.dispatchAbandons();
        } finally {
            rememberEventDispatcher.clear();
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void applyChanges() {
        synchronized (this.lock) {
            try {
                applyChangesInLocked(this.changes);
                drainPendingModificationsLocked();
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                        try {
                            rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                            rememberEventDispatcher.dispatchAbandons();
                            rememberEventDispatcher.clear();
                        } catch (Throwable th11) {
                            rememberEventDispatcher.clear();
                            throw th11;
                        }
                    }
                    throw th10;
                } catch (Throwable th12) {
                    abandonChanges();
                    throw th12;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void applyLateChanges() {
        synchronized (this.lock) {
            try {
                if (this.lateChanges.isNotEmpty()) {
                    applyChangesInLocked(this.lateChanges);
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                        try {
                            rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                            rememberEventDispatcher.dispatchAbandons();
                            rememberEventDispatcher.clear();
                        } catch (Throwable th11) {
                            rememberEventDispatcher.clear();
                            throw th11;
                        }
                    }
                    throw th10;
                } catch (Throwable th12) {
                    abandonChanges();
                    throw th12;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void changesApplied() {
        RememberEventDispatcher rememberEventDispatcher;
        synchronized (this.lock) {
            try {
                this.composer.changesApplied$runtime();
                if (!this.abandonSet.isEmpty()) {
                    rememberEventDispatcher = this.rememberManager;
                    try {
                        rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                        rememberEventDispatcher.dispatchAbandons();
                        rememberEventDispatcher.clear();
                    } finally {
                    }
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        rememberEventDispatcher = this.rememberManager;
                        try {
                            rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                            rememberEventDispatcher.dispatchAbandons();
                            rememberEventDispatcher.clear();
                        } finally {
                        }
                    }
                    throw th10;
                } catch (Throwable th11) {
                    abandonChanges();
                    throw th11;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void composeContent(@NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        try {
            synchronized (this.lock) {
                drainPendingModificationsForCompositionLocked();
                try {
                    this.composer.m1634composeContentZbOJvo$runtime(m1637takeInvalidationsafanTW4(), content, this.shouldPause);
                    Unit unit = Unit.f186387a;
                } finally {
                }
            }
        } catch (Throwable th10) {
            try {
                if (!this.abandonSet.isEmpty()) {
                    RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                    try {
                        rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                        rememberEventDispatcher.dispatchAbandons();
                        rememberEventDispatcher.clear();
                    } catch (Throwable th11) {
                        rememberEventDispatcher.clear();
                        throw th11;
                    }
                }
                throw th10;
            } catch (Throwable th12) {
                abandonChanges();
                throw th12;
            }
        }
    }

    @Override // androidx.compose.runtime.ReusableComposition
    public void deactivate() {
        synchronized (this.lock) {
            try {
                if (!(this.pendingPausedComposition == null)) {
                    PreconditionsKt.throwIllegalStateException("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z = this.slotTable.getGroupsSize() > 0;
                if (z || !this.abandonSet.isEmpty()) {
                    Trace trace = Trace.INSTANCE;
                    Object objBeginSection = trace.beginSection("Compose:deactivate");
                    try {
                        RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                        try {
                            rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                            if (z) {
                                this.applier.onBeginChanges();
                                SlotWriter slotWriterOpenWriter = this.slotTable.openWriter();
                                try {
                                    ComposerImplKt.deactivateCurrentGroup(slotWriterOpenWriter, this.rememberManager);
                                    Unit unit = Unit.f186387a;
                                    slotWriterOpenWriter.close(true);
                                    this.applier.onEndChanges();
                                    rememberEventDispatcher.dispatchRememberObservers();
                                } catch (Throwable th10) {
                                    slotWriterOpenWriter.close(false);
                                    throw th10;
                                }
                            }
                            rememberEventDispatcher.dispatchAbandons();
                            rememberEventDispatcher.clear();
                            Unit unit2 = Unit.f186387a;
                            trace.endSection(objBeginSection);
                        } catch (Throwable th11) {
                            rememberEventDispatcher.clear();
                            throw th11;
                        }
                    } catch (Throwable th12) {
                        Trace.INSTANCE.endSection(objBeginSection);
                        throw th12;
                    }
                }
                ScopeMap.m1689clearimpl(this.observations);
                ScopeMap.m1689clearimpl(this.derivedStates);
                ScopeMap.m1689clearimpl(this.invalidations);
                this.changes.clear();
                this.lateChanges.clear();
                this.composer.deactivate$runtime();
                this.state = 1;
                Unit unit3 = Unit.f186387a;
            } catch (Throwable th13) {
                throw th13;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public <R> R delegateInvalidations(ControlledComposition to6, int groupIndex, @NotNull Function0<? extends R> block) {
        if (to6 == null || to6.equals(this) || groupIndex < 0) {
            return (R) block.invoke();
        }
        this.invalidationDelegate = (CompositionImpl) to6;
        this.invalidationDelegateGroup = groupIndex;
        try {
            return (R) block.invoke();
        } finally {
            this.invalidationDelegate = null;
            this.invalidationDelegateGroup = 0;
        }
    }

    @Override // androidx.compose.runtime.Composition
    public void dispose() {
        synchronized (this.lock) {
            try {
                if (this.composer.getIsComposing()) {
                    PreconditionsKt.throwIllegalStateException("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.state != 3) {
                    this.state = 3;
                    this.composable = ComposableSingletons$CompositionKt.INSTANCE.getLambda$1918065384$runtime();
                    ChangeList deferredChanges = this.composer.getDeferredChanges();
                    if (deferredChanges != null) {
                        applyChangesInLocked(deferredChanges);
                    }
                    boolean z = this.slotTable.getGroupsSize() > 0;
                    if (z || !this.abandonSet.isEmpty()) {
                        RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                        try {
                            rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                            if (z) {
                                this.applier.onBeginChanges();
                                SlotWriter slotWriterOpenWriter = this.slotTable.openWriter();
                                try {
                                    ComposerKt.removeCurrentGroup(slotWriterOpenWriter, this.rememberManager);
                                    Unit unit = Unit.f186387a;
                                    slotWriterOpenWriter.close(true);
                                    this.applier.clear();
                                    this.applier.onEndChanges();
                                    rememberEventDispatcher.dispatchRememberObservers();
                                } catch (Throwable th10) {
                                    slotWriterOpenWriter.close(false);
                                    throw th10;
                                }
                            }
                            rememberEventDispatcher.dispatchAbandons();
                            rememberEventDispatcher.clear();
                        } catch (Throwable th11) {
                            rememberEventDispatcher.clear();
                            throw th11;
                        }
                    }
                    this.composer.dispose$runtime();
                }
                Unit unit2 = Unit.f186387a;
            } catch (Throwable th12) {
                throw th12;
            }
        }
        this.parent.unregisterComposition$runtime(this);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void disposeUnusedMovableContent(@NotNull MovableContentState state) {
        RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
        try {
            rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
            SlotWriter slotWriterOpenWriter = state.getSlotTable$runtime().openWriter();
            try {
                ComposerKt.removeCurrentGroup(slotWriterOpenWriter, this.rememberManager);
                Unit unit = Unit.f186387a;
                slotWriterOpenWriter.close(true);
                rememberEventDispatcher.dispatchRememberObservers();
            } catch (Throwable th10) {
                slotWriterOpenWriter.close(false);
                throw th10;
            }
        } finally {
            rememberEventDispatcher.clear();
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public ShouldPauseCallback getAndSetShouldPauseCallback(ShouldPauseCallback shouldPause) {
        ShouldPauseCallback shouldPauseCallback = this.shouldPause;
        this.shouldPause = shouldPause;
        return shouldPauseCallback;
    }

    @NotNull
    /* JADX INFO: renamed from: getComposer$runtime, reason: from getter */
    public final ComposerImpl getComposer() {
        return this.composer;
    }

    @Override // androidx.compose.runtime.Composition
    public boolean getHasInvalidations() {
        boolean z;
        synchronized (this.lock) {
            z = ScopeMap.m1693getSizeimpl(this.invalidations) > 0;
        }
        return z;
    }

    @NotNull
    /* JADX INFO: renamed from: getObserverHolder$runtime, reason: from getter */
    public final CompositionObserverHolder getObserverHolder() {
        return this.observerHolder;
    }

    @NotNull
    /* JADX INFO: renamed from: getSlotTable$runtime, reason: from getter */
    public final SlotTable getSlotTable() {
        return this.slotTable;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void insertMovableContent(@NotNull List<Pair<MovableContentStateReference, MovableContentStateReference>> references) {
        int size = references.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            } else if (!Intrinsics.f(((MovableContentStateReference) references.get(i).f186385a).getComposition(), this)) {
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        try {
            this.composer.insertMovableContentReferences(references);
            Unit unit = Unit.f186387a;
        } catch (Throwable th10) {
            try {
                if (!this.abandonSet.isEmpty()) {
                    RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                    try {
                        rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                        rememberEventDispatcher.dispatchAbandons();
                        rememberEventDispatcher.clear();
                    } catch (Throwable th11) {
                        rememberEventDispatcher.clear();
                        throw th11;
                    }
                }
                throw th10;
            } catch (Throwable th12) {
                abandonChanges();
                throw th12;
            }
        }
    }

    @Override // androidx.compose.runtime.RecomposeScopeOwner
    @NotNull
    public InvalidationResult invalidate(@NotNull RecomposeScopeImpl scope, Object instance) {
        CompositionImpl compositionImpl;
        if (scope.getDefaultsInScope()) {
            scope.setDefaultsInvalid(true);
        }
        Anchor anchor = scope.getAnchor();
        if (anchor == null || !anchor.getValid()) {
            return InvalidationResult.IGNORED;
        }
        if (!this.slotTable.ownsAnchor(anchor)) {
            synchronized (this.lock) {
                compositionImpl = this.invalidationDelegate;
            }
            return (compositionImpl == null || !compositionImpl.tryImminentInvalidation(scope, instance)) ? InvalidationResult.IGNORED : InvalidationResult.IMMINENT;
        }
        if (!scope.getCanRecompose()) {
            return InvalidationResult.IGNORED;
        }
        InvalidationResult invalidationResultInvalidateChecked = invalidateChecked(scope, anchor, instance);
        if (invalidationResultInvalidateChecked != InvalidationResult.IGNORED) {
            observer();
        }
        return invalidationResultInvalidateChecked;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void invalidateAll() {
        synchronized (this.lock) {
            try {
                for (Object obj2 : this.slotTable.getSlots()) {
                    RecomposeScopeImpl recomposeScopeImpl = obj2 instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj2 : null;
                    if (recomposeScopeImpl != null) {
                        recomposeScopeImpl.invalidate();
                    }
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean isComposing() {
        return this.composer.getIsComposing();
    }

    @Override // androidx.compose.runtime.Composition
    public boolean isDisposed() {
        return this.state == 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    @Override // androidx.compose.runtime.ControlledComposition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean observesAnyOf(@org.jetbrains.annotations.NotNull java.util.Set<? extends java.lang.Object> r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof androidx.compose.runtime.collection.ScatterSetWrapper
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L5c
            androidx.compose.runtime.collection.ScatterSetWrapper r15 = (androidx.compose.runtime.collection.ScatterSetWrapper) r15
            androidx.collection.ScatterSet r15 = r15.getSet$runtime()
            java.lang.Object[] r0 = r15.elements
            long[] r15 = r15.metadata
            int r3 = r15.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L7d
            r4 = r1
        L16:
            r5 = r15[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L57
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r1
        L30:
            if (r9 >= r7) goto L55
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L51
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r11 = r14.observations
            boolean r11 = androidx.compose.runtime.collection.ScopeMap.m1692containsimpl(r11, r10)
            if (r11 != 0) goto L50
            androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r11 = r14.derivedStates
            boolean r10 = androidx.compose.runtime.collection.ScopeMap.m1692containsimpl(r11, r10)
            if (r10 == 0) goto L51
        L50:
            return r2
        L51:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L30
        L55:
            if (r7 != r8) goto L7d
        L57:
            if (r4 == r3) goto L7d
            int r4 = r4 + 1
            goto L16
        L5c:
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.Iterator r15 = r15.iterator()
        L62:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L7d
            java.lang.Object r0 = r15.next()
            androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r3 = r14.observations
            boolean r3 = androidx.compose.runtime.collection.ScopeMap.m1692containsimpl(r3, r0)
            if (r3 != 0) goto L7c
            androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r3 = r14.derivedStates
            boolean r0 = androidx.compose.runtime.collection.ScopeMap.m1692containsimpl(r3, r0)
            if (r0 == 0) goto L62
        L7c:
            return r2
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.observesAnyOf(java.util.Set):boolean");
    }

    public final void pausedCompositionFinished$runtime(ScatterSet<RememberObserverHolder> ignoreSet) {
        this.pendingPausedComposition = null;
        if (ignoreSet != null) {
            this.rememberManager.ignoreForgotten(ignoreSet);
            this.state = 2;
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void prepareCompose(@NotNull Function0<Unit> block) {
        this.composer.prepareCompose$runtime(block);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean recompose() {
        synchronized (this.lock) {
            PausedCompositionImpl pausedCompositionImpl = this.pendingPausedComposition;
            if (pausedCompositionImpl != null && !pausedCompositionImpl.isRecomposing$runtime()) {
                pausedCompositionImpl.markIncomplete$runtime();
                pausedCompositionImpl.getPausableApplier$runtime().markRecomposePending();
                return false;
            }
            drainPendingModificationsForCompositionLocked();
            try {
                try {
                    boolean zM1635recomposeaFTiNEg$runtime = this.composer.m1635recomposeaFTiNEg$runtime(m1637takeInvalidationsafanTW4(), this.shouldPause);
                    if (!zM1635recomposeaFTiNEg$runtime) {
                        drainPendingModificationsLocked();
                    }
                    return zM1635recomposeaFTiNEg$runtime;
                } finally {
                }
            } catch (Throwable th10) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                        try {
                            rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                            rememberEventDispatcher.dispatchAbandons();
                            rememberEventDispatcher.clear();
                        } catch (Throwable th11) {
                            rememberEventDispatcher.clear();
                            throw th11;
                        }
                    }
                    throw th10;
                } catch (Throwable th12) {
                    abandonChanges();
                    throw th12;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.RecomposeScopeOwner
    public void recomposeScopeReleased(@NotNull RecomposeScopeImpl scope) {
        this.pendingInvalidScopes = true;
        observer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.ControlledComposition
    public void recordModificationsOf(@NotNull Set<? extends Object> values) {
        Object objY;
        while (true) {
            Object obj2 = this.pendingModifications.get();
            if (obj2 == null || obj2.equals(CompositionKt.PendingApplyNoModifications)) {
                objY = values;
            } else if (obj2 instanceof Set) {
                objY = new Set[]{obj2, values};
            } else {
                if (!(obj2 instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.pendingModifications).toString());
                }
                objY = p.y(values, (Set[]) obj2);
            }
            AtomicReference<Object> atomicReference = this.pendingModifications;
            while (!atomicReference.compareAndSet(obj2, objY)) {
                if (atomicReference.get() != obj2) {
                    break;
                }
            }
            if (obj2 == null) {
                synchronized (this.lock) {
                    drainPendingModificationsLocked();
                    Unit unit = Unit.f186387a;
                }
                return;
            }
            return;
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition, androidx.compose.runtime.RecomposeScopeOwner
    public void recordReadOf(@NotNull Object value) {
        RecomposeScopeImpl currentRecomposeScope$runtime;
        int i;
        int i2;
        int i3;
        if (getAreChildrenComposing() || (currentRecomposeScope$runtime = this.composer.getCurrentRecomposeScope$runtime()) == null) {
            return;
        }
        int i5 = 1;
        currentRecomposeScope$runtime.setUsed(true);
        boolean zRecordRead = currentRecomposeScope$runtime.recordRead(value);
        observer();
        if (zRecordRead) {
            return;
        }
        if (value instanceof StateObjectImpl) {
            ((StateObjectImpl) value).m1716recordReadInh_f27i8$runtime(ReaderKind.m1714constructorimpl(1));
        }
        ScopeMap.m1688addimpl(this.observations, value, currentRecomposeScope$runtime);
        if (value instanceof DerivedState) {
            DerivedState<?> derivedState = (DerivedState) value;
            DerivedState.Record<?> currentRecord = derivedState.getCurrentRecord();
            ScopeMap.m1695removeScopeimpl(this.derivedStates, value);
            ObjectIntMap<StateObject> dependencies = currentRecord.getDependencies();
            Object[] objArr = dependencies.keys;
            long[] jArr = dependencies.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i6 = 0;
                while (true) {
                    long j2 = jArr[i6];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i21 = 8;
                        int i22 = 8 - ((~(i6 - length)) >>> 31);
                        int i32 = 0;
                        while (i32 < i22) {
                            if ((j2 & 255) < 128) {
                                i2 = i5;
                                StateObject stateObject = (StateObject) objArr[(i6 << 3) + i32];
                                if (stateObject instanceof StateObjectImpl) {
                                    i3 = i21;
                                    ((StateObjectImpl) stateObject).m1716recordReadInh_f27i8$runtime(ReaderKind.m1714constructorimpl(i2));
                                } else {
                                    i3 = i21;
                                }
                                ScopeMap.m1688addimpl(this.derivedStates, stateObject, value);
                            } else {
                                i2 = i5;
                                i3 = i21;
                            }
                            j2 >>= i3;
                            i32++;
                            i5 = i2;
                            i21 = i3;
                        }
                        i = i5;
                        if (i22 != i21) {
                            break;
                        }
                    } else {
                        i = i5;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    i5 = i;
                }
            }
            currentRecomposeScope$runtime.recordDerivedStateValue(derivedState, currentRecord.getCurrentValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    @Override // androidx.compose.runtime.ControlledComposition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void recordWriteOf(@org.jetbrains.annotations.NotNull java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.lock
            monitor-enter(r0)
            r14.invalidateScopeOfLocked(r15)     // Catch: java.lang.Throwable -> L4f
            androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r1 = r14.derivedStates     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r15 = r1.get(r15)     // Catch: java.lang.Throwable -> L4f
            if (r15 == 0) goto L61
            boolean r1 = r15 instanceof androidx.collection.MutableScatterSet     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L5c
            androidx.collection.MutableScatterSet r15 = (androidx.collection.MutableScatterSet) r15     // Catch: java.lang.Throwable -> L4f
            java.lang.Object[] r1 = r15.elements     // Catch: java.lang.Throwable -> L4f
            long[] r15 = r15.metadata     // Catch: java.lang.Throwable -> L4f
            int r2 = r15.length     // Catch: java.lang.Throwable -> L4f
            int r2 = r2 + (-2)
            if (r2 < 0) goto L61
            r3 = 0
            r4 = r3
        L1f:
            r5 = r15[r4]     // Catch: java.lang.Throwable -> L4f
            long r7 = ~r5     // Catch: java.lang.Throwable -> L4f
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L57
            int r7 = r4 - r2
            int r7 = ~r7     // Catch: java.lang.Throwable -> L4f
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L39:
            if (r9 >= r7) goto L55
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L51
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]     // Catch: java.lang.Throwable -> L4f
            androidx.compose.runtime.DerivedState r10 = (androidx.compose.runtime.DerivedState) r10     // Catch: java.lang.Throwable -> L4f
            r14.invalidateScopeOfLocked(r10)     // Catch: java.lang.Throwable -> L4f
            goto L51
        L4f:
            r15 = move-exception
            goto L65
        L51:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L39
        L55:
            if (r7 != r8) goto L61
        L57:
            if (r4 == r2) goto L61
            int r4 = r4 + 1
            goto L1f
        L5c:
            androidx.compose.runtime.DerivedState r15 = (androidx.compose.runtime.DerivedState) r15     // Catch: java.lang.Throwable -> L4f
            r14.invalidateScopeOfLocked(r15)     // Catch: java.lang.Throwable -> L4f
        L61:
            kotlin.Unit r15 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r0)
            return
        L65:
            monitor-exit(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.recordWriteOf(java.lang.Object):void");
    }

    public final void removeDerivedStateObservation$runtime(@NotNull DerivedState<?> state) {
        if (ScopeMap.m1692containsimpl(this.observations, state)) {
            return;
        }
        ScopeMap.m1695removeScopeimpl(this.derivedStates, state);
    }

    public final void removeObservation$runtime(@NotNull Object instance, @NotNull RecomposeScopeImpl scope) {
        ScopeMap.m1694removeimpl(this.observations, instance, scope);
    }

    @Override // androidx.compose.runtime.Composition
    public void setContent(@NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        boolean zClearDeactivated = clearDeactivated();
        ensureRunning();
        if (zClearDeactivated) {
            composeInitialWithReuse(content);
        } else {
            composeInitial(content);
        }
    }

    @Override // androidx.compose.runtime.ReusableComposition
    public void setContentWithReuse(@NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        clearDeactivated();
        ensureRunning();
        composeInitialWithReuse(content);
    }

    @Override // androidx.compose.runtime.PausableComposition
    @NotNull
    public PausedComposition setPausableContent(@NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        return composeInitialPaused(clearDeactivated(), content);
    }

    @Override // androidx.compose.runtime.PausableComposition
    @NotNull
    public PausedComposition setPausableContentWithReuse(@NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        clearDeactivated();
        ensureRunning();
        return composeInitialPaused(true, content);
    }

    public final void updateMovingInvalidations$runtime() {
        synchronized (this.lock) {
            drainPendingModificationsOutOfBandLocked();
            MutableScatterMap<Object, Object> mutableScatterMapM1637takeInvalidationsafanTW4 = m1637takeInvalidationsafanTW4();
            try {
                this.composer.m1636updateComposerInvalidationsRY85e9Y(mutableScatterMapM1637takeInvalidationsafanTW4);
                Unit unit = Unit.f186387a;
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void addPendingInvalidationsLocked(java.util.Set<? extends java.lang.Object> r35, boolean r36) {
        /*
            Method dump skipped, instruction units count: 919
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.addPendingInvalidationsLocked(java.util.Set, boolean):void");
    }

    public /* synthetic */ CompositionImpl(CompositionContext compositionContext, Applier applier, CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(compositionContext, applier, (i & 4) != 0 ? null : coroutineContext);
    }
}
