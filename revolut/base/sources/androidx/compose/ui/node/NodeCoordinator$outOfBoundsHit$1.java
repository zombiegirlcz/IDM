package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.NodeCoordinator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class NodeCoordinator$outOfBoundsHit$1 extends u implements Function0<Unit> {

    /* JADX INFO: renamed from: $$v$c$androidx-compose-ui-geometry-Offset$-pointerPosition$0, reason: not valid java name */
    final /* synthetic */ long f63$$v$c$androidxcomposeuigeometryOffset$pointerPosition$0;

    /* JADX INFO: renamed from: $$v$c$androidx-compose-ui-input-pointer-PointerType$-pointerType$0, reason: not valid java name */
    final /* synthetic */ int f64xe1e19d1f;
    final /* synthetic */ float $distanceFromEdge;
    final /* synthetic */ HitTestResult $hitTestResult;
    final /* synthetic */ NodeCoordinator.HitTestSource $hitTestSource;
    final /* synthetic */ boolean $isHitInMinimumTouchTargetBetter;
    final /* synthetic */ boolean $isInLayer;
    final /* synthetic */ Modifier.Node $this_outOfBoundsHit;
    final /* synthetic */ NodeCoordinator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodeCoordinator$outOfBoundsHit$1(NodeCoordinator nodeCoordinator, Modifier.Node node, NodeCoordinator.HitTestSource hitTestSource, long j2, HitTestResult hitTestResult, int i, boolean z, float f, boolean z3) {
        super(0);
        this.this$0 = nodeCoordinator;
        this.$this_outOfBoundsHit = node;
        this.$hitTestSource = hitTestSource;
        this.f63$$v$c$androidxcomposeuigeometryOffset$pointerPosition$0 = j2;
        this.$hitTestResult = hitTestResult;
        this.f64xe1e19d1f = i;
        this.$isInLayer = z;
        this.$distanceFromEdge = f;
        this.$isHitInMinimumTouchTargetBetter = z3;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m2717invoke();
        return Unit.f186387a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m2717invoke() {
        this.this$0.m2695outOfBoundsHit8NAm7pk(NodeCoordinatorKt.m2721nextUntilhw7D004(this.$this_outOfBoundsHit, this.$hitTestSource.mo2714entityTypeOLwlOKw(), NodeKind.m2722constructorimpl(2)), this.$hitTestSource, this.f63$$v$c$androidxcomposeuigeometryOffset$pointerPosition$0, this.$hitTestResult, this.f64xe1e19d1f, this.$isInLayer, this.$distanceFromEdge, this.$isHitInMinimumTouchTargetBetter);
    }
}
