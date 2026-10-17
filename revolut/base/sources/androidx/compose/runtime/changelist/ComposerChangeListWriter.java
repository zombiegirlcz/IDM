package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.IntStack;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.SlotReader;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.Stack;
import androidx.compose.runtime.internal.IntRef;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u0097\u00012\u00020\u0001:\u0002\u0097\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001f\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\b¢\u0006\u0004\b$\u0010\fJ\r\u0010%\u001a\u00020\n¢\u0006\u0004\b%\u0010\u000fJ\u0017\u0010'\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\n¢\u0006\u0004\b)\u0010\u000fJ\r\u0010*\u001a\u00020\n¢\u0006\u0004\b*\u0010\u000fJ\r\u0010+\u001a\u00020\n¢\u0006\u0004\b+\u0010\u000fJ\r\u0010,\u001a\u00020\n¢\u0006\u0004\b,\u0010\u000fJ\u001d\u0010/\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J%\u0010/\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020-2\u0006\u00102\u001a\u000201¢\u0006\u0004\b/\u00103J\u0015\u00105\u001a\u00020\n2\u0006\u00104\u001a\u00020\b¢\u0006\u0004\b5\u0010\fJ)\u0010:\u001a\u00020\n2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\n062\u0006\u00109\u001a\u000207¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\n2\b\u0010<\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b=\u0010(J;\u0010B\u001a\u00020\n\"\u0004\b\u0000\u0010>\"\u0004\b\u0001\u0010?2\u0006\u0010\u0011\u001a\u00028\u00012\u0018\u0010A\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0@¢\u0006\u0004\bB\u0010CJ\u001d\u0010E\u001a\u00020\n2\u0006\u0010D\u001a\u00020\b2\u0006\u0010#\u001a\u00020\b¢\u0006\u0004\bE\u0010FJ%\u0010H\u001a\u00020\n2\u0006\u0010.\u001a\u00020\b2\u0006\u0010G\u001a\u00020\b2\u0006\u0010#\u001a\u00020\b¢\u0006\u0004\bH\u0010IJ\r\u0010J\u001a\u00020\n¢\u0006\u0004\bJ\u0010\u000fJ\r\u0010K\u001a\u00020\n¢\u0006\u0004\bK\u0010\u000fJ\r\u0010L\u001a\u00020\n¢\u0006\u0004\bL\u0010\u000fJ\u0017\u0010M\u001a\u00020\n2\b\u0010<\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bM\u0010(J\u001b\u0010P\u001a\u00020\n2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\n0N¢\u0006\u0004\bP\u0010QJ\u001d\u0010T\u001a\u00020\n2\u0006\u0010S\u001a\u00020R2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\bT\u0010UJ%\u0010Y\u001a\u00020\n2\u000e\u0010W\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010V2\u0006\u0010X\u001a\u00020R¢\u0006\u0004\bY\u0010ZJ/\u0010`\u001a\u00020\n2\b\u0010\\\u001a\u0004\u0018\u00010[2\u0006\u0010^\u001a\u00020]2\u0006\u0010.\u001a\u00020_2\u0006\u0010G\u001a\u00020_¢\u0006\u0004\b`\u0010aJ\r\u0010b\u001a\u00020\n¢\u0006\u0004\bb\u0010\u000fJ!\u0010d\u001a\u00020\n2\u0006\u0010c\u001a\u00020\u00042\n\b\u0002\u0010X\u001a\u0004\u0018\u00010R¢\u0006\u0004\bd\u0010eJ\r\u0010f\u001a\u00020\n¢\u0006\u0004\bf\u0010\u000fJ\r\u0010g\u001a\u00020\n¢\u0006\u0004\bg\u0010\u000fJ\r\u0010h\u001a\u00020\n¢\u0006\u0004\bh\u0010\u000fJ\u000f\u0010i\u001a\u00020\nH\u0002¢\u0006\u0004\bi\u0010\u000fJ\u000f\u0010j\u001a\u00020\nH\u0002¢\u0006\u0004\bj\u0010\u000fJ\u0019\u0010m\u001a\u00020\n2\b\b\u0002\u0010l\u001a\u00020kH\u0002¢\u0006\u0004\bm\u0010nJ\u000f\u0010o\u001a\u00020\nH\u0002¢\u0006\u0004\bo\u0010\u000fJ\u0017\u0010p\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\bp\u0010qJ\u0019\u0010s\u001a\u00020\n2\b\b\u0002\u0010r\u001a\u00020kH\u0002¢\u0006\u0004\bs\u0010nJ\u000f\u0010t\u001a\u00020\nH\u0002¢\u0006\u0004\bt\u0010\u000fJ\u001f\u0010w\u001a\u00020\n2\u0006\u0010u\u001a\u00020\b2\u0006\u0010v\u001a\u00020\bH\u0002¢\u0006\u0004\bw\u0010FJ'\u0010x\u001a\u00020\n2\u0006\u0010G\u001a\u00020\b2\u0006\u0010.\u001a\u00020\b2\u0006\u0010#\u001a\u00020\bH\u0002¢\u0006\u0004\bx\u0010IJ\u000f\u0010y\u001a\u00020\nH\u0002¢\u0006\u0004\by\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010zR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR\u0019\u0010\u0080\u0001\u001a\u00020k8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0018\u0010\u0083\u0001\u001a\u00030\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R(\u0010\u0085\u0001\u001a\u00020k8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0085\u0001\u0010\u0081\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0005\b\u0088\u0001\u0010nR\u0019\u0010\u0089\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0019\u0010\u008b\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008a\u0001R \u0010\u008d\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u008c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0017\u0010u\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bu\u0010\u008a\u0001R\u0019\u0010\u008f\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u008a\u0001R\u0019\u0010\u0090\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u008a\u0001R\u0017\u0010v\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bv\u0010\u008a\u0001R\u0014\u0010\u0092\u0001\u001a\u00020k8F¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0087\u0001R\u0018\u0010\u0096\u0001\u001a\u00030\u0093\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001¨\u0006\u0098\u0001"}, d2 = {"Landroidx/compose/runtime/changelist/ComposerChangeListWriter;", "", "Landroidx/compose/runtime/ComposerImpl;", "composer", "Landroidx/compose/runtime/changelist/ChangeList;", "changeList", "<init>", "(Landroidx/compose/runtime/ComposerImpl;Landroidx/compose/runtime/changelist/ChangeList;)V", "", "location", "", "moveReaderRelativeTo", "(I)V", "moveReaderToAbsolute", "recordSlotEditing", "()V", "Landroidx/compose/runtime/RememberObserverHolder;", "value", "remember", "(Landroidx/compose/runtime/RememberObserverHolder;)V", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "rememberPausingScope", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "startResumingScope", "endResumingScope", "groupSlotIndex", "updateValue", "(Ljava/lang/Object;I)V", "Landroidx/compose/runtime/Anchor;", "anchor", "updateAnchoredValue", "(Ljava/lang/Object;Landroidx/compose/runtime/Anchor;I)V", "appendValue", "(Landroidx/compose/runtime/Anchor;Ljava/lang/Object;)V", "count", "trimValues", "resetSlots", "data", "updateAuxData", "(Ljava/lang/Object;)V", "endRoot", "endCurrentGroup", "skipToEndOfCurrentGroup", "removeCurrentGroup", "Landroidx/compose/runtime/SlotTable;", "from", "insertSlots", "(Landroidx/compose/runtime/Anchor;Landroidx/compose/runtime/SlotTable;)V", "Landroidx/compose/runtime/changelist/FixupList;", "fixups", "(Landroidx/compose/runtime/Anchor;Landroidx/compose/runtime/SlotTable;Landroidx/compose/runtime/changelist/FixupList;)V", "offset", "moveCurrentGroup", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", "action", "composition", "endCompositionScope", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composition;)V", "node", "useNode", "T", "V", "Lkotlin/Function2;", "block", "updateNode", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "nodeIndex", "removeNode", "(II)V", "to", "moveNode", "(III)V", "releaseMovableContent", "endNodeMovement", "moveUp", "moveDown", "Lkotlin/Function0;", "effect", "sideEffect", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/runtime/internal/IntRef;", "effectiveNodeIndexOut", "determineMovableContentNodeIndex", "(Landroidx/compose/runtime/internal/IntRef;Landroidx/compose/runtime/Anchor;)V", "", "nodes", "effectiveNodeIndex", "copyNodesToNewAnchorLocation", "(Ljava/util/List;Landroidx/compose/runtime/internal/IntRef;)V", "Landroidx/compose/runtime/MovableContentState;", "resolvedState", "Landroidx/compose/runtime/CompositionContext;", "parentContext", "Landroidx/compose/runtime/MovableContentStateReference;", "copySlotTableToAnchorLocation", "(Landroidx/compose/runtime/MovableContentState;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/MovableContentStateReference;)V", "endMovableContentPlacement", "other", "includeOperationsIn", "(Landroidx/compose/runtime/changelist/ChangeList;Landroidx/compose/runtime/internal/IntRef;)V", "finalizeComposition", "resetTransientState", "deactivateCurrentGroup", "pushApplierOperationPreamble", "pushSlotEditingOperationPreamble", "", "useParentSlot", "pushSlotTableOperationPreamble", "(Z)V", "ensureRootStarted", "ensureGroupStarted", "(Landroidx/compose/runtime/Anchor;)V", "forParent", "realizeOperationLocation", "realizeNodeMovementOperations", "removeFrom", "moveCount", "realizeRemoveNode", "realizeMoveNode", "pushPendingUpsAndDowns", "Landroidx/compose/runtime/ComposerImpl;", "Landroidx/compose/runtime/changelist/ChangeList;", "getChangeList", "()Landroidx/compose/runtime/changelist/ChangeList;", "setChangeList", "(Landroidx/compose/runtime/changelist/ChangeList;)V", "startedGroup", "Z", "Landroidx/compose/runtime/IntStack;", "startedGroups", "Landroidx/compose/runtime/IntStack;", "implicitRootStart", "getImplicitRootStart", "()Z", "setImplicitRootStart", "writersReaderDelta", "I", "pendingUps", "Landroidx/compose/runtime/Stack;", "pendingDownNodes", "Ljava/util/ArrayList;", "moveFrom", "moveTo", "getPastParent", "pastParent", "Landroidx/compose/runtime/SlotReader;", "getReader", "()Landroidx/compose/runtime/SlotReader;", "reader", "Companion", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ComposerChangeListWriter {

    @NotNull
    private ChangeList changeList;

    @NotNull
    private final ComposerImpl composer;
    private int moveCount;
    private int pendingUps;
    private boolean startedGroup;
    private int writersReaderDelta;
    public static final int $stable = 8;

    @NotNull
    private final IntStack startedGroups = new IntStack();
    private boolean implicitRootStart = true;

    @NotNull
    private final ArrayList<Object> pendingDownNodes = Stack.m1653constructorimpl$default(null, 1, null);
    private int removeFrom = -1;
    private int moveFrom = -1;
    private int moveTo = -1;

    public ComposerChangeListWriter(@NotNull ComposerImpl composerImpl, @NotNull ChangeList changeList) {
        this.composer = composerImpl;
        this.changeList = changeList;
    }

    private final void ensureGroupStarted(Anchor anchor) {
        pushSlotTableOperationPreamble$default(this, false, 1, null);
        this.changeList.pushEnsureGroupStarted(anchor);
        this.startedGroup = true;
    }

    private final void ensureRootStarted() {
        if (this.startedGroup || !this.implicitRootStart) {
            return;
        }
        pushSlotTableOperationPreamble$default(this, false, 1, null);
        this.changeList.pushEnsureRootStarted();
        this.startedGroup = true;
    }

    private final SlotReader getReader() {
        return this.composer.getReader();
    }

    private final void pushApplierOperationPreamble() {
        pushPendingUpsAndDowns();
    }

    private final void pushPendingUpsAndDowns() {
        int i = this.pendingUps;
        if (i > 0) {
            this.changeList.pushUps(i);
            this.pendingUps = 0;
        }
        if (Stack.m1656isNotEmptyimpl(this.pendingDownNodes)) {
            this.changeList.pushDowns(Stack.m1661toArrayimpl(this.pendingDownNodes));
            Stack.m1651clearimpl(this.pendingDownNodes);
        }
    }

    private final void pushSlotEditingOperationPreamble() {
        realizeOperationLocation$default(this, false, 1, null);
        recordSlotEditing();
    }

    private final void pushSlotTableOperationPreamble(boolean useParentSlot) {
        realizeOperationLocation(useParentSlot);
    }

    public static /* synthetic */ void pushSlotTableOperationPreamble$default(ComposerChangeListWriter composerChangeListWriter, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            z = false;
        }
        composerChangeListWriter.pushSlotTableOperationPreamble(z);
    }

    private final void realizeMoveNode(int to6, int from, int count) {
        pushApplierOperationPreamble();
        this.changeList.pushMoveNode(to6, from, count);
    }

    private final void realizeNodeMovementOperations() {
        int i = this.moveCount;
        if (i > 0) {
            int i2 = this.removeFrom;
            if (i2 >= 0) {
                realizeRemoveNode(i2, i);
                this.removeFrom = -1;
            } else {
                realizeMoveNode(this.moveTo, this.moveFrom, i);
                this.moveFrom = -1;
                this.moveTo = -1;
            }
            this.moveCount = 0;
        }
    }

    private final void realizeOperationLocation(boolean forParent) {
        int parent = forParent ? getReader().getParent() : getReader().getCurrentGroup();
        int i = parent - this.writersReaderDelta;
        if (!(i >= 0)) {
            ComposerKt.composeImmediateRuntimeError("Tried to seek backward");
        }
        if (i > 0) {
            this.changeList.pushAdvanceSlotsBy(i);
            this.writersReaderDelta = parent;
        }
    }

    public static /* synthetic */ void realizeOperationLocation$default(ComposerChangeListWriter composerChangeListWriter, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            z = false;
        }
        composerChangeListWriter.realizeOperationLocation(z);
    }

    private final void realizeRemoveNode(int removeFrom, int moveCount) {
        pushApplierOperationPreamble();
        this.changeList.pushRemoveNode(removeFrom, moveCount);
    }

    public final void appendValue(@NotNull Anchor anchor, Object value) {
        this.changeList.pushAppendValue(anchor, value);
    }

    public final void copyNodesToNewAnchorLocation(@NotNull List<? extends Object> nodes, @NotNull IntRef effectiveNodeIndex) {
        this.changeList.pushCopyNodesToNewAnchorLocation(nodes, effectiveNodeIndex);
    }

    public final void copySlotTableToAnchorLocation(MovableContentState resolvedState, @NotNull CompositionContext parentContext, @NotNull MovableContentStateReference from, @NotNull MovableContentStateReference to6) {
        this.changeList.pushCopySlotTableToAnchorLocation(resolvedState, parentContext, from, to6);
    }

    public final void deactivateCurrentGroup() {
        pushSlotTableOperationPreamble$default(this, false, 1, null);
        this.changeList.pushDeactivateCurrentGroup();
    }

    public final void determineMovableContentNodeIndex(@NotNull IntRef effectiveNodeIndexOut, @NotNull Anchor anchor) {
        pushPendingUpsAndDowns();
        this.changeList.pushDetermineMovableContentNodeIndex(effectiveNodeIndexOut, anchor);
    }

    public final void endCompositionScope(@NotNull Function1<? super Composition, Unit> action, @NotNull Composition composition) {
        this.changeList.pushEndCompositionScope(action, composition);
    }

    public final void endCurrentGroup() {
        int parent = getReader().getParent();
        if (!(this.startedGroups.peekOr(-1) <= parent)) {
            ComposerKt.composeImmediateRuntimeError("Missed recording an endGroup");
        }
        if (this.startedGroups.peekOr(-1) == parent) {
            pushSlotTableOperationPreamble$default(this, false, 1, null);
            this.startedGroups.pop();
            this.changeList.pushEndCurrentGroup();
        }
    }

    public final void endMovableContentPlacement() {
        pushPendingUpsAndDowns();
        this.changeList.pushEndMovableContentPlacement();
        this.writersReaderDelta = 0;
    }

    public final void endNodeMovement() {
        realizeNodeMovementOperations();
    }

    public final void endResumingScope(@NotNull RecomposeScopeImpl scope) {
        this.changeList.pushEndResumingScope(scope);
    }

    public final void endRoot() {
        if (this.startedGroup) {
            pushSlotTableOperationPreamble$default(this, false, 1, null);
            pushSlotTableOperationPreamble$default(this, false, 1, null);
            this.changeList.pushEndCurrentGroup();
            this.startedGroup = false;
        }
    }

    public final void finalizeComposition() {
        pushPendingUpsAndDowns();
        if (this.startedGroups.tos == 0) {
            return;
        }
        ComposerKt.composeImmediateRuntimeError("Missed recording an endGroup()");
    }

    @NotNull
    public final ChangeList getChangeList() {
        return this.changeList;
    }

    public final boolean getImplicitRootStart() {
        return this.implicitRootStart;
    }

    public final boolean getPastParent() {
        return getReader().getParent() - this.writersReaderDelta < 0;
    }

    public final void includeOperationsIn(@NotNull ChangeList other, IntRef effectiveNodeIndex) {
        this.changeList.pushExecuteOperationsIn(other, effectiveNodeIndex);
    }

    public final void insertSlots(@NotNull Anchor anchor, @NotNull SlotTable from) {
        pushPendingUpsAndDowns();
        pushSlotEditingOperationPreamble();
        realizeNodeMovementOperations();
        this.changeList.pushInsertSlots(anchor, from);
    }

    public final void moveCurrentGroup(int offset) {
        pushSlotEditingOperationPreamble();
        this.changeList.pushMoveCurrentGroup(offset);
    }

    public final void moveDown(Object node) {
        realizeNodeMovementOperations();
        Stack.m1660pushimpl(this.pendingDownNodes, node);
    }

    public final void moveNode(int from, int to6, int count) {
        if (count > 0) {
            int i = this.moveCount;
            if (i > 0 && this.moveFrom == from - i && this.moveTo == to6 - i) {
                this.moveCount = i + count;
                return;
            }
            realizeNodeMovementOperations();
            this.moveFrom = from;
            this.moveTo = to6;
            this.moveCount = count;
        }
    }

    public final void moveReaderRelativeTo(int location) {
        this.writersReaderDelta = (location - getReader().getCurrentGroup()) + this.writersReaderDelta;
    }

    public final void moveReaderToAbsolute(int location) {
        this.writersReaderDelta = location;
    }

    public final void moveUp() {
        realizeNodeMovementOperations();
        if (Stack.m1656isNotEmptyimpl(this.pendingDownNodes)) {
            Stack.m1659popimpl(this.pendingDownNodes);
        } else {
            this.pendingUps++;
        }
    }

    public final void recordSlotEditing() {
        SlotReader reader;
        int parent;
        if (getReader().getGroupsSize() <= 0 || this.startedGroups.peekOr(-2) == (parent = (reader = getReader()).getParent())) {
            return;
        }
        ensureRootStarted();
        if (parent > 0) {
            Anchor anchor = reader.anchor(parent);
            this.startedGroups.push(parent);
            ensureGroupStarted(anchor);
        }
    }

    public final void releaseMovableContent() {
        pushPendingUpsAndDowns();
        if (this.startedGroup) {
            skipToEndOfCurrentGroup();
            endRoot();
        }
    }

    public final void remember(@NotNull RememberObserverHolder value) {
        this.changeList.pushRemember(value);
    }

    public final void rememberPausingScope(@NotNull RecomposeScopeImpl scope) {
        this.changeList.pushRememberPausingScope(scope);
    }

    public final void removeCurrentGroup() {
        pushSlotEditingOperationPreamble();
        this.changeList.pushRemoveCurrentGroup();
        this.writersReaderDelta = getReader().getGroupSize() + this.writersReaderDelta;
    }

    public final void removeNode(int nodeIndex, int count) {
        if (count > 0) {
            if (!(nodeIndex >= 0)) {
                ComposerKt.composeImmediateRuntimeError("Invalid remove index " + nodeIndex);
            }
            if (this.removeFrom == nodeIndex) {
                this.moveCount += count;
                return;
            }
            realizeNodeMovementOperations();
            this.removeFrom = nodeIndex;
            this.moveCount = count;
        }
    }

    public final void resetSlots() {
        this.changeList.pushResetSlots();
    }

    public final void resetTransientState() {
        this.startedGroup = false;
        this.startedGroups.clear();
        this.writersReaderDelta = 0;
        this.implicitRootStart = true;
        this.pendingUps = 0;
        Stack.m1651clearimpl(this.pendingDownNodes);
        this.removeFrom = -1;
        this.moveFrom = -1;
        this.moveTo = -1;
        this.moveCount = 0;
    }

    public final void setChangeList(@NotNull ChangeList changeList) {
        this.changeList = changeList;
    }

    public final void setImplicitRootStart(boolean z) {
        this.implicitRootStart = z;
    }

    public final void sideEffect(@NotNull Function0<Unit> effect) {
        this.changeList.pushSideEffect(effect);
    }

    public final void skipToEndOfCurrentGroup() {
        this.changeList.pushSkipToEndOfCurrentGroup();
    }

    public final void startResumingScope(@NotNull RecomposeScopeImpl scope) {
        this.changeList.pushStartResumingScope(scope);
    }

    public final void trimValues(int count) {
        if (count > 0) {
            pushSlotEditingOperationPreamble();
            this.changeList.pushTrimValues(count);
        }
    }

    public final void updateAnchoredValue(Object value, @NotNull Anchor anchor, int groupSlotIndex) {
        this.changeList.pushUpdateAnchoredValue(value, anchor, groupSlotIndex);
    }

    public final void updateAuxData(Object data) {
        pushSlotTableOperationPreamble$default(this, false, 1, null);
        this.changeList.pushUpdateAuxData(data);
    }

    public final <T, V> void updateNode(V value, @NotNull Function2<? super T, ? super V, Unit> block) {
        pushApplierOperationPreamble();
        this.changeList.pushUpdateNode(value, block);
    }

    public final void updateValue(Object value, int groupSlotIndex) {
        pushSlotTableOperationPreamble(true);
        this.changeList.pushUpdateValue(value, groupSlotIndex);
    }

    public final void useNode(Object node) {
        pushApplierOperationPreamble();
        this.changeList.pushUseNode(node);
    }

    public final void insertSlots(@NotNull Anchor anchor, @NotNull SlotTable from, @NotNull FixupList fixups) {
        pushPendingUpsAndDowns();
        pushSlotEditingOperationPreamble();
        realizeNodeMovementOperations();
        this.changeList.pushInsertSlots(anchor, from, fixups);
    }
}
