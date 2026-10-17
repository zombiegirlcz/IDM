package androidx.compose.ui.semantics;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.unit.IntSize;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\u00102\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J3\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00000\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0017H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001d\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J%\u0010%\u001a\u00020$2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f2\u0006\u0010#\u001a\u00020\bH\u0002¢\u0006\u0004\b%\u0010&J)\u0010(\u001a\u00020$*\u00020\u00062\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00000\f2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b(\u0010)J3\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00000\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f2\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00000\fH\u0002¢\u0006\u0004\b*\u0010+J\u0011\u0010-\u001a\u0004\u0018\u00010,H\u0002¢\u0006\u0004\b-\u0010.J\u001d\u0010/\u001a\u00020$2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\fH\u0002¢\u0006\u0004\b/\u00100J-\u00108\u001a\u00020\u00002\b\u00102\u001a\u0004\u0018\u0001012\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020$03H\u0002¢\u0006\u0004\b6\u00107R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010B\u001a\u0004\bC\u0010DR\"\u0010E\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bE\u0010<\u001a\u0004\bF\u0010>\"\u0004\bG\u0010HR\u0018\u0010I\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0017\u0010L\u001a\u00020K8\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bP\u0010>R\u0011\u0010U\u001a\u00020R8F¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0011\u0010X\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0011\u0010\\\u001a\u00020Y8F¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0011\u0010^\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b]\u0010WR\u0011\u0010a\u001a\u00020_8F¢\u0006\u0006\u001a\u0004\b`\u0010[R\u0011\u0010c\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\bb\u0010WR\u0014\u0010e\u001a\u00020 8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bd\u0010WR\u0014\u0010g\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bf\u0010>R\u0011\u0010i\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bh\u0010DR\u0017\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00000\u00108F¢\u0006\u0006\u001a\u0004\b\u0016\u0010jR\u001a\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00000\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bl\u0010jR\u0013\u0010o\u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\bn\u0010\u001cR\u0014\u0010p\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bp\u0010>¨\u0006q"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsNode;", "", "Landroidx/compose/ui/Modifier$Node;", "outerSemanticsNode", "", "mergingEnabled", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "unmergedConfig", "<init>", "(Landroidx/compose/ui/Modifier$Node;ZLandroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/semantics/SemanticsConfiguration;)V", "", "unmergedChildren", "includeFakeNodes", "includeDeactivatedNodes", "", "unmergedChildren$ui", "(Ljava/util/List;ZZ)Ljava/util/List;", "includeReplacedSemantics", "getChildren$ui", "(ZZZ)Ljava/util/List;", "getChildren", "Landroidx/compose/ui/node/NodeCoordinator;", "findCoordinatorToGetBounds$ui", "()Landroidx/compose/ui/node/NodeCoordinator;", "findCoordinatorToGetBounds", "copyWithMergingEnabled$ui", "()Landroidx/compose/ui/semantics/SemanticsNode;", "copyWithMergingEnabled", "Landroidx/compose/ui/layout/LayoutCoordinates;", "nodeCoordinates", "Landroidx/compose/ui/geometry/Rect;", "boundsInImportantForBoundsAncestor", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/geometry/Rect;", "mergedConfig", "", "mergeConfig", "(Ljava/util/List;Landroidx/compose/ui/semantics/SemanticsConfiguration;)V", "list", "fillOneLayerOfSemanticsWrappers", "(Landroidx/compose/ui/node/LayoutNode;Ljava/util/List;Z)V", "findOneLayerOfMergingSemanticsNodes", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "findSemanticsModifierNodeToGetBounds", "()Landroidx/compose/ui/node/SemanticsModifierNode;", "emitFakeNodes", "(Ljava/util/List;)V", "Landroidx/compose/ui/semantics/Role;", "role", "Lkotlin/Function1;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "properties", "fakeSemanticsNode-ypyhhiA", "(Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/semantics/SemanticsNode;", "fakeSemanticsNode", "Landroidx/compose/ui/Modifier$Node;", "getOuterSemanticsNode$ui", "()Landroidx/compose/ui/Modifier$Node;", "Z", "getMergingEnabled", "()Z", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode$ui", "()Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getUnmergedConfig$ui", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "isFake", "isFake$ui", "setFake$ui", "(Z)V", "fakeNodeParent", "Landroidx/compose/ui/semantics/SemanticsNode;", "", "id", "I", "getId", "()I", "isUnmergedLeafNode$ui", "isUnmergedLeafNode", "Landroidx/compose/ui/layout/LayoutInfo;", "getLayoutInfo", "()Landroidx/compose/ui/layout/LayoutInfo;", "layoutInfo", "getTouchBoundsInRoot", "()Landroidx/compose/ui/geometry/Rect;", "touchBoundsInRoot", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "size", "getBoundsInRoot", "boundsInRoot", "Landroidx/compose/ui/geometry/Offset;", "getPositionInRoot-F1C5BW0", "positionInRoot", "getBoundsInWindow", "boundsInWindow", "getBoundsInParent$ui", "boundsInParent", "isTransparent$ui", "isTransparent", "getConfig", "config", "()Ljava/util/List;", "children", "getReplacedChildren$ui", "replacedChildren", "getParent", "parent", "isMergingSemanticsOfDescendants", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SemanticsNode {
    private SemanticsNode fakeNodeParent;
    private final int id;
    private boolean isFake;

    @NotNull
    private final LayoutNode layoutNode;
    private final boolean mergingEnabled;

    @NotNull
    private final Modifier.Node outerSemanticsNode;

    @NotNull
    private final SemanticsConfiguration unmergedConfig;

    public SemanticsNode(@NotNull Modifier.Node node, boolean z, @NotNull LayoutNode layoutNode, @NotNull SemanticsConfiguration semanticsConfiguration) {
        this.outerSemanticsNode = node;
        this.mergingEnabled = z;
        this.layoutNode = layoutNode;
        this.unmergedConfig = semanticsConfiguration;
        this.id = layoutNode.getSemanticsId();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v7 */
    private final Rect boundsInImportantForBoundsAncestor(LayoutCoordinates nodeCoordinates) {
        ?? Pop;
        SemanticsNode parent = getParent();
        if (parent == null) {
            return Rect.INSTANCE.getZero();
        }
        NodeChain nodes = parent.layoutNode.getNodes();
        int iM2722constructorimpl = NodeKind.m2722constructorimpl(8);
        if ((nodes.getAggregateChildKindSet() & iM2722constructorimpl) != 0) {
            loop0: for (Modifier.Node head = nodes.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & iM2722constructorimpl) != 0) {
                    Pop = head;
                    MutableVector mutableVector = null;
                    while (Pop != 0) {
                        if (Pop instanceof SemanticsModifierNode) {
                            if (((SemanticsModifierNode) Pop).getIsImportantForBounds()) {
                                break loop0;
                            }
                        } else if ((Pop.getKindSet() & iM2722constructorimpl) != 0 && (Pop instanceof DelegatingNode)) {
                            Modifier.Node delegate = ((DelegatingNode) Pop).getDelegate();
                            int i = 0;
                            Pop = Pop;
                            while (delegate != null) {
                                if ((delegate.getKindSet() & iM2722constructorimpl) != 0) {
                                    i++;
                                    if (i == 1) {
                                        Pop = delegate;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (Pop != 0) {
                                            mutableVector.add(Pop);
                                            Pop = 0;
                                        }
                                        mutableVector.add(delegate);
                                    }
                                }
                                delegate = delegate.getChild();
                                Pop = Pop;
                            }
                            if (i == 1) {
                            }
                        }
                        Pop = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if ((head.getAggregateChildKindSet() & iM2722constructorimpl) == 0) {
                    break;
                }
            }
            Pop = 0;
        } else {
            Pop = 0;
        }
        SemanticsModifierNode semanticsModifierNode = (SemanticsModifierNode) Pop;
        NodeCoordinator nodeCoordinatorM2612requireCoordinator64DMado = semanticsModifierNode != null ? DelegatableNodeKt.m2612requireCoordinator64DMado(semanticsModifierNode, NodeKind.m2722constructorimpl(8)) : null;
        return nodeCoordinatorM2612requireCoordinator64DMado == null ? parent.boundsInImportantForBoundsAncestor(nodeCoordinates) : LayoutCoordinates.localBoundingBoxOf$default(nodeCoordinatorM2612requireCoordinator64DMado, nodeCoordinates, false, 2, null);
    }

    private final void emitFakeNodes(List<SemanticsNode> unmergedChildren) {
        Role role = SemanticsNodeKt.getRole(this);
        if (role != null && this.unmergedConfig.getIsMergingSemanticsOfDescendants() && !unmergedChildren.isEmpty()) {
            unmergedChildren.add(m2831fakeSemanticsNodeypyhhiA(role, new SemanticsNode$emitFakeNodes$fakeNode$1(role)));
        }
        SemanticsConfiguration semanticsConfiguration = this.unmergedConfig;
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (semanticsConfiguration.contains(semanticsProperties.getContentDescription()) && !unmergedChildren.isEmpty() && this.unmergedConfig.getIsMergingSemanticsOfDescendants()) {
            List list = (List) SemanticsConfigurationKt.getOrNull(this.unmergedConfig, semanticsProperties.getContentDescription());
            String str = list != null ? (String) d0.d0(list) : null;
            if (str != null) {
                unmergedChildren.add(0, m2831fakeSemanticsNodeypyhhiA(null, new SemanticsNode$emitFakeNodes$fakeNode$2(str)));
            }
        }
    }

    /* JADX INFO: renamed from: fakeSemanticsNode-ypyhhiA, reason: not valid java name */
    private final SemanticsNode m2831fakeSemanticsNodeypyhhiA(Role role, Function1<? super SemanticsPropertyReceiver, Unit> properties) {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.setMergingSemanticsOfDescendants(false);
        semanticsConfiguration.setClearingSemantics(false);
        properties.invoke(semanticsConfiguration);
        SemanticsNode semanticsNode = new SemanticsNode(new SemanticsNode$fakeSemanticsNode$fakeNode$1(properties), false, new LayoutNode(true, role != null ? SemanticsNodeKt.roleFakeNodeId(this) : SemanticsNodeKt.contentDescriptionFakeNodeId(this)), semanticsConfiguration);
        semanticsNode.isFake = true;
        semanticsNode.fakeNodeParent = this;
        return semanticsNode;
    }

    private final void fillOneLayerOfSemanticsWrappers(LayoutNode layoutNode, List<SemanticsNode> list, boolean z) {
        MutableVector<LayoutNode> zSortedChildren = layoutNode.getZSortedChildren();
        LayoutNode[] layoutNodeArr = zSortedChildren.content;
        int size = zSortedChildren.getSize();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode2 = layoutNodeArr[i];
            if (layoutNode2.isAttached() && (z || !layoutNode2.getIsDeactivated())) {
                if (layoutNode2.getNodes().m2685hasH91voCI$ui(NodeKind.m2722constructorimpl(8))) {
                    list.add(SemanticsNodeKt.SemanticsNode(layoutNode2, this.mergingEnabled));
                } else {
                    fillOneLayerOfSemanticsWrappers(layoutNode2, list, z);
                }
            }
        }
    }

    private final List<SemanticsNode> findOneLayerOfMergingSemanticsNodes(List<SemanticsNode> unmergedChildren, List<SemanticsNode> list) {
        unmergedChildren$ui$default(this, unmergedChildren, false, false, 6, null);
        int size = unmergedChildren.size();
        for (int size2 = unmergedChildren.size(); size2 < size; size2++) {
            SemanticsNode semanticsNode = unmergedChildren.get(size2);
            if (semanticsNode.isMergingSemanticsOfDescendants()) {
                list.add(semanticsNode);
            } else if (!semanticsNode.unmergedConfig.getIsClearingSemantics()) {
                semanticsNode.findOneLayerOfMergingSemanticsNodes(unmergedChildren, list);
            }
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List findOneLayerOfMergingSemanticsNodes$default(SemanticsNode semanticsNode, List list, List list2, int i, Object obj2) {
        if ((i & 2) != 0) {
            list2 = new ArrayList();
        }
        return semanticsNode.findOneLayerOfMergingSemanticsNodes(list, list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r9v10 */
    private final SemanticsModifierNode findSemanticsModifierNodeToGetBounds() {
        ?? Pop;
        ?? r56 = 0;
        r56 = 0;
        r56 = 0;
        r56 = 0;
        if (this.unmergedConfig.getIsMergingSemanticsOfDescendants()) {
            NodeChain nodes = this.layoutNode.getNodes();
            int iM2722constructorimpl = NodeKind.m2722constructorimpl(8);
            if ((nodes.getAggregateChildKindSet() & iM2722constructorimpl) != 0) {
                Modifier.Node head = nodes.getHead();
                Pop = 0;
                while (head != null) {
                    if ((head.getKindSet() & iM2722constructorimpl) != 0) {
                        ?? Pop2 = head;
                        MutableVector mutableVector = null;
                        while (Pop2 != 0) {
                            if (Pop2 instanceof SemanticsModifierNode) {
                                SemanticsModifierNode semanticsModifierNode = (SemanticsModifierNode) Pop2;
                                if (semanticsModifierNode.getIsImportantForBounds()) {
                                    if (semanticsModifierNode.getMergeDescendants()) {
                                        return semanticsModifierNode;
                                    }
                                    if (Pop == 0) {
                                        Pop = semanticsModifierNode;
                                    }
                                }
                            } else if ((Pop2.getKindSet() & iM2722constructorimpl) != 0 && (Pop2 instanceof DelegatingNode)) {
                                Modifier.Node delegate = ((DelegatingNode) Pop2).getDelegate();
                                int i = 0;
                                Pop2 = Pop2;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & iM2722constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            Pop2 = delegate;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (Pop2 != 0) {
                                                mutableVector.add(Pop2);
                                                Pop2 = 0;
                                            }
                                            mutableVector.add(delegate);
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    Pop2 = Pop2;
                                }
                                if (i == 1) {
                                }
                            }
                            Pop2 = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    if ((head.getAggregateChildKindSet() & iM2722constructorimpl) == 0) {
                        break;
                    }
                    head = head.getChild();
                    Pop = Pop;
                }
                r56 = Pop;
            }
        } else {
            NodeChain nodes2 = this.layoutNode.getNodes();
            int iM2722constructorimpl2 = NodeKind.m2722constructorimpl(8);
            if ((nodes2.getAggregateChildKindSet() & iM2722constructorimpl2) != 0) {
                loop3: for (Modifier.Node head2 = nodes2.getHead(); head2 != null; head2 = head2.getChild()) {
                    if ((head2.getKindSet() & iM2722constructorimpl2) != 0) {
                        Pop = head2;
                        MutableVector mutableVector2 = null;
                        while (Pop != 0) {
                            if (Pop instanceof SemanticsModifierNode) {
                                if (((SemanticsModifierNode) Pop).getIsImportantForBounds()) {
                                    r56 = Pop;
                                }
                            } else if ((Pop.getKindSet() & iM2722constructorimpl2) != 0 && (Pop instanceof DelegatingNode)) {
                                Modifier.Node delegate2 = ((DelegatingNode) Pop).getDelegate();
                                int i2 = 0;
                                Pop = Pop;
                                while (delegate2 != null) {
                                    if ((delegate2.getKindSet() & iM2722constructorimpl2) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            Pop = delegate2;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (Pop != 0) {
                                                mutableVector2.add(Pop);
                                                Pop = 0;
                                            }
                                            mutableVector2.add(delegate2);
                                        }
                                    }
                                    delegate2 = delegate2.getChild();
                                    Pop = Pop;
                                }
                                if (i2 == 1) {
                                }
                            }
                            Pop = DelegatableNodeKt.pop(mutableVector2);
                        }
                    }
                    if ((head2.getAggregateChildKindSet() & iM2722constructorimpl2) == 0) {
                        break;
                    }
                }
            }
        }
        return (SemanticsModifierNode) r56;
    }

    public static /* synthetic */ List getChildren$ui$default(SemanticsNode semanticsNode, boolean z, boolean z3, boolean z4, int i, Object obj2) {
        if ((i & 1) != 0) {
            z = !semanticsNode.mergingEnabled;
        }
        if ((i & 2) != 0) {
            z3 = false;
        }
        if ((i & 4) != 0) {
            z4 = false;
        }
        return semanticsNode.getChildren$ui(z, z3, z4);
    }

    private final boolean isMergingSemanticsOfDescendants() {
        return this.mergingEnabled && this.unmergedConfig.getIsMergingSemanticsOfDescendants();
    }

    private final void mergeConfig(List<SemanticsNode> unmergedChildren, SemanticsConfiguration mergedConfig) {
        if (this.unmergedConfig.getIsClearingSemantics()) {
            return;
        }
        unmergedChildren$ui$default(this, unmergedChildren, false, false, 6, null);
        int size = unmergedChildren.size();
        for (int size2 = unmergedChildren.size(); size2 < size; size2++) {
            SemanticsNode semanticsNode = unmergedChildren.get(size2);
            if (!semanticsNode.isMergingSemanticsOfDescendants()) {
                mergedConfig.mergeChild$ui(semanticsNode.unmergedConfig);
                semanticsNode.mergeConfig(unmergedChildren, mergedConfig);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List unmergedChildren$ui$default(SemanticsNode semanticsNode, List list, boolean z, boolean z3, int i, Object obj2) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        return semanticsNode.unmergedChildren$ui(list, z, z3);
    }

    @NotNull
    public final SemanticsNode copyWithMergingEnabled$ui() {
        return new SemanticsNode(this.outerSemanticsNode, true, this.layoutNode, this.unmergedConfig);
    }

    public final NodeCoordinator findCoordinatorToGetBounds$ui() {
        NodeCoordinator nodeCoordinatorM2612requireCoordinator64DMado;
        if (!this.isFake) {
            SemanticsModifierNode semanticsModifierNodeFindSemanticsModifierNodeToGetBounds = findSemanticsModifierNodeToGetBounds();
            return (semanticsModifierNodeFindSemanticsModifierNodeToGetBounds == null || (nodeCoordinatorM2612requireCoordinator64DMado = DelegatableNodeKt.m2612requireCoordinator64DMado(semanticsModifierNodeFindSemanticsModifierNodeToGetBounds, NodeKind.m2722constructorimpl(8))) == null) ? this.layoutNode.getInnerCoordinator$ui() : nodeCoordinatorM2612requireCoordinator64DMado;
        }
        SemanticsNode parent = getParent();
        if (parent != null) {
            return parent.findCoordinatorToGetBounds$ui();
        }
        return null;
    }

    @NotNull
    public final Rect getBoundsInParent$ui() {
        LayoutCoordinates coordinates;
        NodeCoordinator nodeCoordinatorFindCoordinatorToGetBounds$ui = findCoordinatorToGetBounds$ui();
        if (nodeCoordinatorFindCoordinatorToGetBounds$ui != null) {
            if (!nodeCoordinatorFindCoordinatorToGetBounds$ui.isAttached()) {
                nodeCoordinatorFindCoordinatorToGetBounds$ui = null;
            }
            if (nodeCoordinatorFindCoordinatorToGetBounds$ui != null && (coordinates = nodeCoordinatorFindCoordinatorToGetBounds$ui.getCoordinates()) != null) {
                return boundsInImportantForBoundsAncestor(coordinates);
            }
        }
        return Rect.INSTANCE.getZero();
    }

    @NotNull
    public final Rect getBoundsInRoot() {
        Rect rectBoundsInRoot;
        NodeCoordinator nodeCoordinatorFindCoordinatorToGetBounds$ui = findCoordinatorToGetBounds$ui();
        if (nodeCoordinatorFindCoordinatorToGetBounds$ui != null) {
            if (!nodeCoordinatorFindCoordinatorToGetBounds$ui.isAttached()) {
                nodeCoordinatorFindCoordinatorToGetBounds$ui = null;
            }
            if (nodeCoordinatorFindCoordinatorToGetBounds$ui != null && (rectBoundsInRoot = LayoutCoordinatesKt.boundsInRoot(nodeCoordinatorFindCoordinatorToGetBounds$ui)) != null) {
                return rectBoundsInRoot;
            }
        }
        return Rect.INSTANCE.getZero();
    }

    @NotNull
    public final Rect getBoundsInWindow() {
        Rect rectBoundsInWindow$default;
        NodeCoordinator nodeCoordinatorFindCoordinatorToGetBounds$ui = findCoordinatorToGetBounds$ui();
        if (nodeCoordinatorFindCoordinatorToGetBounds$ui != null) {
            if (!nodeCoordinatorFindCoordinatorToGetBounds$ui.isAttached()) {
                nodeCoordinatorFindCoordinatorToGetBounds$ui = null;
            }
            if (nodeCoordinatorFindCoordinatorToGetBounds$ui != null && (rectBoundsInWindow$default = LayoutCoordinatesKt.boundsInWindow$default(nodeCoordinatorFindCoordinatorToGetBounds$ui, false, 1, null)) != null) {
                return rectBoundsInWindow$default;
            }
        }
        return Rect.INSTANCE.getZero();
    }

    @NotNull
    public final List<SemanticsNode> getChildren() {
        return getChildren$ui$default(this, false, false, false, 7, null);
    }

    @NotNull
    public final List<SemanticsNode> getChildren$ui(boolean includeReplacedSemantics, boolean includeFakeNodes, boolean includeDeactivatedNodes) {
        if (!includeReplacedSemantics && this.unmergedConfig.getIsClearingSemantics()) {
            return f0.f322471a;
        }
        ArrayList arrayList = new ArrayList();
        return isMergingSemanticsOfDescendants() ? findOneLayerOfMergingSemanticsNodes$default(this, arrayList, null, 2, null) : unmergedChildren$ui(arrayList, includeFakeNodes, includeDeactivatedNodes);
    }

    @NotNull
    public final SemanticsConfiguration getConfig() {
        if (!isMergingSemanticsOfDescendants()) {
            return this.unmergedConfig;
        }
        SemanticsConfiguration semanticsConfigurationCopy = this.unmergedConfig.copy();
        mergeConfig(new ArrayList(), semanticsConfigurationCopy);
        return semanticsConfigurationCopy;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final LayoutInfo getLayoutInfo() {
        return this.layoutNode;
    }

    @NotNull
    /* JADX INFO: renamed from: getLayoutNode$ui, reason: from getter */
    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public final SemanticsNode getParent() {
        LayoutNode parent$ui;
        SemanticsNode semanticsNode = this.fakeNodeParent;
        if (semanticsNode != null) {
            return semanticsNode;
        }
        if (this.mergingEnabled) {
            parent$ui = this.layoutNode.getParent$ui();
            while (parent$ui != null) {
                SemanticsConfiguration semanticsConfiguration = parent$ui.getSemanticsConfiguration();
                if (semanticsConfiguration != null && semanticsConfiguration.getIsMergingSemanticsOfDescendants()) {
                    break;
                }
                parent$ui = parent$ui.getParent$ui();
            }
            parent$ui = null;
        } else {
            parent$ui = null;
        }
        if (parent$ui == null) {
            parent$ui = this.layoutNode.getParent$ui();
            while (true) {
                if (parent$ui == null) {
                    parent$ui = null;
                    break;
                }
                if (parent$ui.getNodes().m2685hasH91voCI$ui(NodeKind.m2722constructorimpl(8))) {
                    break;
                }
                parent$ui = parent$ui.getParent$ui();
            }
        }
        if (parent$ui == null) {
            return null;
        }
        return SemanticsNodeKt.SemanticsNode(parent$ui, this.mergingEnabled);
    }

    /* JADX INFO: renamed from: getPositionInRoot-F1C5BW0, reason: not valid java name */
    public final long m2832getPositionInRootF1C5BW0() {
        NodeCoordinator nodeCoordinatorFindCoordinatorToGetBounds$ui = findCoordinatorToGetBounds$ui();
        if (nodeCoordinatorFindCoordinatorToGetBounds$ui != null) {
            if (!nodeCoordinatorFindCoordinatorToGetBounds$ui.isAttached()) {
                nodeCoordinatorFindCoordinatorToGetBounds$ui = null;
            }
            if (nodeCoordinatorFindCoordinatorToGetBounds$ui != null) {
                return LayoutCoordinatesKt.positionInRoot(nodeCoordinatorFindCoordinatorToGetBounds$ui);
            }
        }
        return Offset.INSTANCE.m1845getZeroF1C5BW0();
    }

    @NotNull
    public final List<SemanticsNode> getReplacedChildren$ui() {
        return getChildren$ui$default(this, false, true, false, 4, null);
    }

    /* JADX INFO: renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m2833getSizeYbymL2g() {
        NodeCoordinator nodeCoordinatorFindCoordinatorToGetBounds$ui = findCoordinatorToGetBounds$ui();
        return nodeCoordinatorFindCoordinatorToGetBounds$ui != null ? nodeCoordinatorFindCoordinatorToGetBounds$ui.mo2533getSizeYbymL2g() : IntSize.INSTANCE.m3359getZeroYbymL2g();
    }

    @NotNull
    public final Rect getTouchBoundsInRoot() {
        SemanticsModifierNode semanticsModifierNodeFindSemanticsModifierNodeToGetBounds = findSemanticsModifierNodeToGetBounds();
        return semanticsModifierNodeFindSemanticsModifierNodeToGetBounds == null ? this.layoutNode.getInnerCoordinator$ui().touchBoundsInRoot() : SemanticsModifierNodeKt.touchBoundsInRoot(semanticsModifierNodeFindSemanticsModifierNodeToGetBounds.getNode(), SemanticsModifierNodeKt.getUseMinimumTouchTarget(this.unmergedConfig));
    }

    @NotNull
    /* JADX INFO: renamed from: getUnmergedConfig$ui, reason: from getter */
    public final SemanticsConfiguration getUnmergedConfig() {
        return this.unmergedConfig;
    }

    /* JADX INFO: renamed from: isFake$ui, reason: from getter */
    public final boolean getIsFake() {
        return this.isFake;
    }

    public final boolean isTransparent$ui() {
        NodeCoordinator nodeCoordinatorFindCoordinatorToGetBounds$ui = findCoordinatorToGetBounds$ui();
        if (nodeCoordinatorFindCoordinatorToGetBounds$ui != null) {
            return nodeCoordinatorFindCoordinatorToGetBounds$ui.isTransparent();
        }
        return false;
    }

    public final boolean isUnmergedLeafNode$ui() {
        if (this.isFake || !getReplacedChildren$ui().isEmpty()) {
            return false;
        }
        LayoutNode parent$ui = this.layoutNode.getParent$ui();
        while (true) {
            if (parent$ui == null) {
                parent$ui = null;
                break;
            }
            SemanticsConfiguration semanticsConfiguration = parent$ui.getSemanticsConfiguration();
            if (semanticsConfiguration != null && semanticsConfiguration.getIsMergingSemanticsOfDescendants()) {
                break;
            }
            parent$ui = parent$ui.getParent$ui();
        }
        return parent$ui == null;
    }

    @NotNull
    public final List<SemanticsNode> unmergedChildren$ui(@NotNull List<SemanticsNode> unmergedChildren, boolean includeFakeNodes, boolean includeDeactivatedNodes) {
        if (this.isFake) {
            return f0.f322471a;
        }
        fillOneLayerOfSemanticsWrappers(this.layoutNode, unmergedChildren, includeDeactivatedNodes);
        if (includeFakeNodes) {
            emitFakeNodes(unmergedChildren);
        }
        return unmergedChildren;
    }
}
