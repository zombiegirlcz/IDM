package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u000bJ\r\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0011\u0010\u001b\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0013¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/node/DepthSortedSetsForDifferentPasses;", "", "", "extraAssertions", "<init>", "(Z)V", "Landroidx/compose/ui/node/LayoutNode;", "node", "affectsLookahead", "contains", "(Landroidx/compose/ui/node/LayoutNode;Z)Z", "(Landroidx/compose/ui/node/LayoutNode;)Z", "Landroidx/compose/ui/node/Invalidation;", "invalidation", "", "add", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/Invalidation;)V", "remove", "isEmpty", "()Z", "isNotEmpty", "Landroidx/compose/ui/node/DepthSortedSet;", "lookaheadAndAncestorMeasureSet", "Landroidx/compose/ui/node/DepthSortedSet;", "lookaheadAndAncestorPlaceSet", "approachSet", "getAffectsLookaheadMeasure", "affectsLookaheadMeasure", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DepthSortedSetsForDifferentPasses {

    @NotNull
    private final DepthSortedSet approachSet;

    @NotNull
    private final DepthSortedSet lookaheadAndAncestorMeasureSet;

    @NotNull
    private final DepthSortedSet lookaheadAndAncestorPlaceSet;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Invalidation.values().length];
            try {
                iArr[Invalidation.LookaheadMeasurement.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Invalidation.LookaheadPlacement.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Invalidation.Measurement.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Invalidation.Placement.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DepthSortedSetsForDifferentPasses(boolean z) {
        this.lookaheadAndAncestorMeasureSet = new DepthSortedSet(z);
        this.lookaheadAndAncestorPlaceSet = new DepthSortedSet(z);
        this.approachSet = new DepthSortedSet(z);
    }

    public final void add(@NotNull LayoutNode node, @NotNull Invalidation invalidation) {
        int i = WhenMappings.$EnumSwitchMapping$0[invalidation.ordinal()];
        if (i == 1) {
            this.lookaheadAndAncestorMeasureSet.add(node);
            this.approachSet.add(node);
            return;
        }
        if (i == 2) {
            this.lookaheadAndAncestorPlaceSet.add(node);
            this.approachSet.add(node);
            return;
        }
        if (i == 3) {
            if (node.getLookaheadRoot() != null) {
                this.approachSet.add(node);
                return;
            } else {
                this.lookaheadAndAncestorMeasureSet.add(node);
                return;
            }
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if (node.getLookaheadRoot() != null) {
            this.approachSet.add(node);
        } else {
            this.lookaheadAndAncestorPlaceSet.add(node);
        }
    }

    public final boolean contains(@NotNull LayoutNode node, boolean affectsLookahead) {
        boolean z = node.getLookaheadRoot() == null;
        boolean z3 = this.lookaheadAndAncestorMeasureSet.contains(node) || this.lookaheadAndAncestorPlaceSet.contains(node);
        return affectsLookahead ? !z && z3 : (z && z3) || this.approachSet.contains(node);
    }

    public final boolean getAffectsLookaheadMeasure() {
        return (this.approachSet.isEmpty() || this.lookaheadAndAncestorMeasureSet.isEmpty()) ? false : true;
    }

    public final boolean isEmpty() {
        return this.lookaheadAndAncestorMeasureSet.isEmpty() && this.approachSet.isEmpty() && this.lookaheadAndAncestorPlaceSet.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }

    public final boolean remove(@NotNull LayoutNode node) {
        return this.approachSet.remove(node) || this.lookaheadAndAncestorMeasureSet.remove(node) || this.lookaheadAndAncestorPlaceSet.remove(node);
    }

    public final boolean contains(@NotNull LayoutNode node) {
        return this.lookaheadAndAncestorMeasureSet.contains(node) || this.lookaheadAndAncestorPlaceSet.contains(node) || this.approachSet.contains(node);
    }
}
