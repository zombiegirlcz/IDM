package androidx.compose.ui.node;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "coordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class NodeCoordinator$Companion$onCommitAffectingLayerParams$1 extends u implements Function1<NodeCoordinator, Unit> {
    public static final NodeCoordinator$Companion$onCommitAffectingLayerParams$1 INSTANCE = new NodeCoordinator$Companion$onCommitAffectingLayerParams$1();

    public NodeCoordinator$Companion$onCommitAffectingLayerParams$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) throws Throwable {
        invoke((NodeCoordinator) obj2);
        return Unit.f186387a;
    }

    public final void invoke(NodeCoordinator nodeCoordinator) throws Throwable {
        LayoutNode layoutNode = nodeCoordinator.getLayoutNode();
        try {
            if (nodeCoordinator.isValidOwnerScope()) {
                NodeCoordinator.updateLayerParameters$default(nodeCoordinator, false, 1, null);
            }
            Unit unit = Unit.f186387a;
        } catch (Throwable th10) {
            layoutNode.rethrowWithComposeStackTrace(th10);
            throw new KotlinNothingValueException();
        }
    }
}
