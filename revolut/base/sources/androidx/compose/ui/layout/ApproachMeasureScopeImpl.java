package androidx.compose.ui.layout;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0001R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/layout/ApproachMeasureScopeImpl;", "", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "approachNode", "Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "getApproachNode", "()Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "setApproachNode", "(Landroidx/compose/ui/layout/ApproachLayoutModifierNode;)V", "Landroidx/compose/ui/unit/IntSize;", "getLookaheadSize-YbymL2g", "()J", "lookaheadSize", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ApproachMeasureScopeImpl implements IntrinsicMeasureScope, MeasureScope {
    @NotNull
    public abstract ApproachLayoutModifierNode getApproachNode();

    /* JADX INFO: renamed from: getLookaheadSize-YbymL2g, reason: not valid java name */
    public abstract long m2516getLookaheadSizeYbymL2g();
}
