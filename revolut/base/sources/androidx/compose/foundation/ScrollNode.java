package androidx.compose.foundation;

import a94.e;
import androidx.compose.foundation.ScrollNode;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import e1.k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0013\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0018\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\r\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001b\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\r\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J#\u0010\u001c\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\r\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u0019J#\u0010\u001d\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\r\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u0019J\u0013\u0010 \u001a\u00020\u001f*\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010'\u001a\u0004\b\b\u0010)\"\u0004\b,\u0010+¨\u0006-"}, d2 = {"Landroidx/compose/foundation/ScrollNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/foundation/ScrollState;", "state", "", "reverseScrolling", "isVertical", "<init>", "(Landroidx/compose/foundation/ScrollState;ZZ)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "applySemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "Landroidx/compose/foundation/ScrollState;", "getState", "()Landroidx/compose/foundation/ScrollState;", "setState", "(Landroidx/compose/foundation/ScrollState;)V", "Z", "getReverseScrolling", "()Z", "setReverseScrolling", "(Z)V", "setVertical", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScrollNode extends Modifier.Node implements LayoutModifierNode, SemanticsModifierNode {
    private boolean isVertical;
    private boolean reverseScrolling;

    @NotNull
    private ScrollState state;

    public ScrollNode(@NotNull ScrollState scrollState, boolean z, boolean z3) {
        this.state = scrollState;
        this.reverseScrolling = z;
        this.isVertical = z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float applySemantics$lambda$0(ScrollNode scrollNode) {
        return scrollNode.state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float applySemantics$lambda$1(ScrollNode scrollNode) {
        return scrollNode.state.getMaxValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$0(ScrollNode scrollNode, int i, Placeable placeable, Placeable.PlacementScope placementScope) {
        int value = scrollNode.state.getValue();
        if (value < 0) {
            value = 0;
        }
        if (value > i) {
            value = i;
        }
        int i2 = scrollNode.reverseScrolling ? value - i : -value;
        boolean z = scrollNode.isVertical;
        placementScope.withMotionFrameOfReferencePlacement(new k(placeable, z ? 0 : i2, z ? i2 : 0, 0));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$0$0(Placeable placeable, int i, int i2, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, placeable, i, i2, BitmapDescriptorFactory.HUE_RED, null, 12, null);
        return Unit.f186387a;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
        final int i = 0;
        final int i2 = 1;
        ScrollAxisRange scrollAxisRange = new ScrollAxisRange(new Function0(this) { // from class: e1.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScrollNode f121785b;

            {
                this.f121785b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                float fApplySemantics$lambda$0;
                switch (i) {
                    case 0:
                        fApplySemantics$lambda$0 = ScrollNode.applySemantics$lambda$0(this.f121785b);
                        break;
                    default:
                        fApplySemantics$lambda$0 = ScrollNode.applySemantics$lambda$1(this.f121785b);
                        break;
                }
                return Float.valueOf(fApplySemantics$lambda$0);
            }
        }, new Function0(this) { // from class: e1.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScrollNode f121785b;

            {
                this.f121785b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                float fApplySemantics$lambda$0;
                switch (i2) {
                    case 0:
                        fApplySemantics$lambda$0 = ScrollNode.applySemantics$lambda$0(this.f121785b);
                        break;
                    default:
                        fApplySemantics$lambda$0 = ScrollNode.applySemantics$lambda$1(this.f121785b);
                        break;
                }
                return Float.valueOf(fApplySemantics$lambda$0);
            }
        }, this.reverseScrolling);
        if (this.isVertical) {
            SemanticsPropertiesKt.setVerticalScrollAxisRange(semanticsPropertyReceiver, scrollAxisRange);
        } else {
            SemanticsPropertiesKt.setHorizontalScrollAxisRange(semanticsPropertyReceiver, scrollAxisRange);
        }
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (!this.isVertical) {
            i = Integer.MAX_VALUE;
        }
        return intrinsicMeasurable.maxIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.isVertical) {
            i = Integer.MAX_VALUE;
        }
        return intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo543measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j2) {
        CheckScrollableContainerConstraintsKt.m625checkScrollableContainerConstraintsK40F9xA(j2, this.isVertical ? Orientation.Vertical : Orientation.Horizontal);
        Placeable placeableMo2530measureBRTryo0 = measurable.mo2530measureBRTryo0(Constraints.m3271copyZbe2FdA$default(j2, 0, this.isVertical ? Constraints.m3279getMaxWidthimpl(j2) : Integer.MAX_VALUE, 0, this.isVertical ? Integer.MAX_VALUE : Constraints.m3278getMaxHeightimpl(j2), 5, null));
        int width = placeableMo2530measureBRTryo0.getWidth();
        int iM3279getMaxWidthimpl = Constraints.m3279getMaxWidthimpl(j2);
        int i = width > iM3279getMaxWidthimpl ? iM3279getMaxWidthimpl : width;
        int height = placeableMo2530measureBRTryo0.getHeight();
        int iM3278getMaxHeightimpl = Constraints.m3278getMaxHeightimpl(j2);
        int i2 = height > iM3278getMaxHeightimpl ? iM3278getMaxHeightimpl : height;
        int height2 = placeableMo2530measureBRTryo0.getHeight() - i2;
        int width2 = placeableMo2530measureBRTryo0.getWidth() - i;
        if (!this.isVertical) {
            height2 = width2;
        }
        this.state.setMaxValue$foundation(height2);
        this.state.setViewportSize$foundation(this.isVertical ? i2 : i);
        this.state.setContentSize$foundation(this.isVertical ? placeableMo2530measureBRTryo0.getHeight() : placeableMo2530measureBRTryo0.getWidth());
        return MeasureScope.layout$default(measureScope, i, i2, null, new e(this, height2, placeableMo2530measureBRTryo0, 2), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (!this.isVertical) {
            i = Integer.MAX_VALUE;
        }
        return intrinsicMeasurable.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.isVertical) {
            i = Integer.MAX_VALUE;
        }
        return intrinsicMeasurable.minIntrinsicWidth(i);
    }

    public final void setReverseScrolling(boolean z) {
        this.reverseScrolling = z;
    }

    public final void setState(@NotNull ScrollState scrollState) {
        this.state = scrollState;
    }

    public final void setVertical(boolean z) {
        this.isVertical = z;
    }
}
