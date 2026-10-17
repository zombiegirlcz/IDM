package androidx.compose.runtime;

import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0007\u0018\u00002\u00020\u0001Bo\b\u0000\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u001a\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f0\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000b¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR6\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f0\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\u0010\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\b&\u0010'R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010 \u001a\u0004\b(\u0010\"R\"\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Landroidx/compose/runtime/MovableContentStateReference;", "", "Landroidx/compose/runtime/MovableContent;", "content", "parameter", "Landroidx/compose/runtime/ControlledComposition;", "composition", "Landroidx/compose/runtime/SlotTable;", "slotTable", "Landroidx/compose/runtime/Anchor;", "anchor", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "invalidations", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "locals", "nestedReferences", "<init>", "(Landroidx/compose/runtime/MovableContent;Ljava/lang/Object;Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/SlotTable;Landroidx/compose/runtime/Anchor;Ljava/util/List;Landroidx/compose/runtime/PersistentCompositionLocalMap;Ljava/util/List;)V", "Ljava/lang/Object;", "getParameter$runtime", "()Ljava/lang/Object;", "Landroidx/compose/runtime/ControlledComposition;", "getComposition$runtime", "()Landroidx/compose/runtime/ControlledComposition;", "Landroidx/compose/runtime/SlotTable;", "getSlotTable$runtime", "()Landroidx/compose/runtime/SlotTable;", "Landroidx/compose/runtime/Anchor;", "getAnchor$runtime", "()Landroidx/compose/runtime/Anchor;", "Ljava/util/List;", "getInvalidations$runtime", "()Ljava/util/List;", "setInvalidations$runtime", "(Ljava/util/List;)V", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "getLocals$runtime", "()Landroidx/compose/runtime/PersistentCompositionLocalMap;", "getNestedReferences$runtime", "Landroidx/compose/runtime/MovableContent;", "getContent$runtime", "()Landroidx/compose/runtime/MovableContent;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MovableContentStateReference {

    @NotNull
    private final Anchor anchor;

    @NotNull
    private final ControlledComposition composition;

    @NotNull
    private List<? extends Pair<RecomposeScopeImpl, ? extends Object>> invalidations;

    @NotNull
    private final PersistentCompositionLocalMap locals;
    private final List<MovableContentStateReference> nestedReferences;
    private final Object parameter;

    @NotNull
    private final SlotTable slotTable;

    public MovableContentStateReference(@NotNull MovableContent<Object> movableContent, Object obj2, @NotNull ControlledComposition controlledComposition, @NotNull SlotTable slotTable, @NotNull Anchor anchor, @NotNull List<? extends Pair<RecomposeScopeImpl, ? extends Object>> list, @NotNull PersistentCompositionLocalMap persistentCompositionLocalMap, List<MovableContentStateReference> list2) {
        this.parameter = obj2;
        this.composition = controlledComposition;
        this.slotTable = slotTable;
        this.anchor = anchor;
        this.invalidations = list;
        this.locals = persistentCompositionLocalMap;
        this.nestedReferences = list2;
    }

    @NotNull
    /* JADX INFO: renamed from: getAnchor$runtime, reason: from getter */
    public final Anchor getAnchor() {
        return this.anchor;
    }

    @NotNull
    /* JADX INFO: renamed from: getComposition$runtime, reason: from getter */
    public final ControlledComposition getComposition() {
        return this.composition;
    }

    @NotNull
    public final MovableContent<Object> getContent$runtime() {
        return null;
    }

    @NotNull
    public final List<Pair<RecomposeScopeImpl, Object>> getInvalidations$runtime() {
        return this.invalidations;
    }

    @NotNull
    /* JADX INFO: renamed from: getLocals$runtime, reason: from getter */
    public final PersistentCompositionLocalMap getLocals() {
        return this.locals;
    }

    /* JADX INFO: renamed from: getParameter$runtime, reason: from getter */
    public final Object getParameter() {
        return this.parameter;
    }

    @NotNull
    /* JADX INFO: renamed from: getSlotTable$runtime, reason: from getter */
    public final SlotTable getSlotTable() {
        return this.slotTable;
    }
}
