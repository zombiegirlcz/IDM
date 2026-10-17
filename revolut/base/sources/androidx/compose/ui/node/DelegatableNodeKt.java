package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.ui.layout.BeyondBoundsLayoutProviderModifierNode;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.semantics.SemanticsInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import ip0.v7;
import kii.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a!\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010\t\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u0010\u001a\u00020\u0001*\u00020\u000b2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u0015\u001a\u00020\u0012*\u00020\u000b2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\fH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0016\u001a\u00020\u0000*\u00020\u000bH\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u000bH\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u000bH\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0011\u0010\u001e\u001a\u00020\b*\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0011\u0010!\u001a\u00020 *\u00020\u000b¢\u0006\u0004\b!\u0010\"\u001a\u0011\u0010$\u001a\u00020#*\u00020\u000b¢\u0006\u0004\b$\u0010%\u001a\u0011\u0010'\u001a\u00020&*\u00020\u000b¢\u0006\u0004\b'\u0010(\u001a\u0011\u0010*\u001a\u00020)*\u00020\u000b¢\u0006\u0004\b*\u0010+\u001a\u0019\u00100\u001a\u00020\b*\u00020\u000b2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/\u001a\u0013\u00102\u001a\u0004\u0018\u000101*\u00020\u000b¢\u0006\u0004\b2\u00103\u001a\u0015\u00105\u001a\u0004\u0018\u000104*\u00020\u0006H\u0000¢\u0006\u0004\b5\u00106\u001a\u001d\u00107\u001a\u0004\u0018\u00010\u0006*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0002¢\u0006\u0004\b7\u00108\"\u0018\u00109\u001a\u00020\u0001*\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006;"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "", "zOrder", "Landroidx/compose/runtime/collection/MutableVector;", "getChildren", "(Landroidx/compose/ui/node/LayoutNode;Z)Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/Modifier$Node;", "node", "", "addLayoutNodeChildren", "(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/Modifier$Node;Z)V", "Landroidx/compose/ui/node/DelegatableNode;", "Landroidx/compose/ui/node/NodeKind;", "type", "has-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Z", "has", "kind", "Landroidx/compose/ui/node/NodeCoordinator;", "requireCoordinator-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Landroidx/compose/ui/node/NodeCoordinator;", "requireCoordinator", "requireLayoutNode", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/semantics/SemanticsInfo;", "requireSemanticsInfo", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/semantics/SemanticsInfo;", "Landroidx/compose/ui/node/Owner;", "requireOwner", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/Owner;", "requestAutofill", "(Landroidx/compose/ui/node/DelegatableNode;)V", "Landroidx/compose/ui/unit/Density;", "requireDensity", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/graphics/GraphicsContext;", "requireGraphicsContext", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/graphics/GraphicsContext;", "Landroidx/compose/ui/unit/LayoutDirection;", "requireLayoutDirection", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "requireLayoutCoordinates", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/geometry/Offset;", "delta", "dispatchOnScrollChanged-Uv8p0NA", "(Landroidx/compose/ui/node/DelegatableNode;J)V", "dispatchOnScrollChanged", "Landroidx/compose/ui/layout/BeyondBoundsLayout;", "findNearestBeyondBoundsLayoutAncestor", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/layout/BeyondBoundsLayout;", "Landroidx/compose/ui/node/LayoutModifierNode;", "asLayoutModifierNode", "(Landroidx/compose/ui/Modifier$Node;)Landroidx/compose/ui/node/LayoutModifierNode;", "pop", "(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;", "isDelegationRoot", "(Landroidx/compose/ui/node/DelegatableNode;)Z", "ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class DelegatableNodeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void addLayoutNodeChildren(MutableVector<Modifier.Node> mutableVector, Modifier.Node node, boolean z) {
        MutableVector<LayoutNode> children = getChildren(requireLayoutNode(node), z);
        int size = children.getSize() - 1;
        LayoutNode[] layoutNodeArr = children.content;
        if (size < layoutNodeArr.length) {
            while (size >= 0) {
                mutableVector.add(layoutNodeArr[size].getNodes().getHead());
                size--;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final LayoutModifierNode asLayoutModifierNode(@NotNull Modifier.Node node) {
        if ((NodeKind.m2722constructorimpl(2) & node.getKindSet()) != 0) {
            if (node instanceof LayoutModifierNode) {
                return (LayoutModifierNode) node;
            }
            if (node instanceof DelegatingNode) {
                Modifier.Node delegate$ui = ((DelegatingNode) node).getDelegate();
                while (delegate$ui != 0) {
                    if (delegate$ui instanceof LayoutModifierNode) {
                        return (LayoutModifierNode) delegate$ui;
                    }
                    delegate$ui = (!(delegate$ui instanceof DelegatingNode) || (NodeKind.m2722constructorimpl(2) & delegate$ui.getKindSet()) == 0) ? delegate$ui.getChild() : ((DelegatingNode) delegate$ui).getDelegate();
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: dispatchOnScrollChanged-Uv8p0NA, reason: not valid java name */
    public static final void m2610dispatchOnScrollChangedUv8p0NA(@NotNull DelegatableNode delegatableNode, long j2) {
        requireOwner(delegatableNode).mo2733dispatchOnScrollChangedk4lQ0M(j2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static final BeyondBoundsLayout findNearestBeyondBoundsLayoutAncestor(@NotNull DelegatableNode delegatableNode) {
        NodeChain nodes$ui;
        ?? r62;
        int iM2722constructorimpl = NodeKind.m2722constructorimpl(8388608) | NodeKind.m2722constructorimpl(32);
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui = delegatableNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            ?? parent$ui2 = parent$ui;
            if ((e.b(layoutNodeRequireLayoutNode) & iM2722constructorimpl) != 0) {
                while (parent$ui2 != 0) {
                    if ((parent$ui2.getKindSet() & iM2722constructorimpl) != 0) {
                        if ((NodeKind.m2722constructorimpl(8388608) & parent$ui2.getKindSet()) != 0) {
                            if (!(parent$ui2 instanceof BeyondBoundsLayoutProviderModifierNode)) {
                                if (parent$ui2 instanceof DelegatingNode) {
                                    Modifier.Node delegate$ui = ((DelegatingNode) parent$ui2).getDelegate();
                                    parent$ui2 = 0;
                                    while (delegate$ui != null) {
                                        if (delegate$ui instanceof BeyondBoundsLayoutProviderModifierNode) {
                                            parent$ui2 = delegate$ui;
                                        }
                                        delegate$ui = delegate$ui.getChild();
                                        parent$ui2 = parent$ui2;
                                    }
                                } else {
                                    parent$ui2 = 0;
                                }
                            }
                            BeyondBoundsLayoutProviderModifierNode beyondBoundsLayoutProviderModifierNode = (BeyondBoundsLayoutProviderModifierNode) parent$ui2;
                            if (beyondBoundsLayoutProviderModifierNode != null) {
                                return beyondBoundsLayoutProviderModifierNode.getBeyondBoundsLayout();
                            }
                            return null;
                        }
                        if ((NodeKind.m2722constructorimpl(32) & parent$ui2.getKindSet()) == 0) {
                            continue;
                        } else {
                            if (parent$ui2 instanceof ModifierLocalModifierNode) {
                                r62 = parent$ui2;
                            } else if (parent$ui2 instanceof DelegatingNode) {
                                Modifier.Node delegate$ui2 = ((DelegatingNode) parent$ui2).getDelegate();
                                r62 = 0;
                                while (delegate$ui2 != null) {
                                    if (delegate$ui2 instanceof ModifierLocalModifierNode) {
                                        r62 = delegate$ui2;
                                    }
                                    delegate$ui2 = delegate$ui2.getChild();
                                    r62 = r62;
                                }
                            } else {
                                r62 = 0;
                            }
                            ModifierLocalModifierNode modifierLocalModifierNode = (ModifierLocalModifierNode) r62;
                            if (modifierLocalModifierNode != null && modifierLocalModifierNode.getProvidedValues().contains$ui(BeyondBoundsLayoutKt.getModifierLocalBeyondBoundsLayout())) {
                                return (BeyondBoundsLayout) modifierLocalModifierNode.getProvidedValues().get$ui(BeyondBoundsLayoutKt.getModifierLocalBeyondBoundsLayout());
                            }
                        }
                    }
                    parent$ui2 = parent$ui2.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
            parent$ui = (layoutNodeRequireLayoutNode == null || (nodes$ui = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes$ui.getTail();
        }
        return null;
    }

    private static final MutableVector<LayoutNode> getChildren(LayoutNode layoutNode, boolean z) {
        return z ? layoutNode.getZSortedChildren() : layoutNode.get_children$ui();
    }

    /* JADX INFO: renamed from: has-64DMado, reason: not valid java name */
    public static final boolean m2611has64DMado(@NotNull DelegatableNode delegatableNode, int i) {
        return (delegatableNode.getNode().getAggregateChildKindSet() & i) != 0;
    }

    public static final boolean isDelegationRoot(@NotNull DelegatableNode delegatableNode) {
        return delegatableNode.getNode() == delegatableNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier.Node pop(MutableVector<Modifier.Node> mutableVector) {
        if (mutableVector == null || mutableVector.getSize() == 0) {
            return null;
        }
        return (Modifier.Node) e.m(mutableVector, 1);
    }

    public static final void requestAutofill(@NotNull DelegatableNode delegatableNode) {
        requireLayoutNode(delegatableNode).requestAutofill$ui();
    }

    @NotNull
    /* JADX INFO: renamed from: requireCoordinator-64DMado, reason: not valid java name */
    public static final NodeCoordinator m2612requireCoordinator64DMado(@NotNull DelegatableNode delegatableNode, int i) {
        NodeCoordinator coordinator$ui = delegatableNode.getNode().getCoordinator();
        Intrinsics.h(coordinator$ui);
        if (coordinator$ui.getTail() != delegatableNode || !NodeKindKt.m2723getIncludeSelfInTraversalH91voCI(i)) {
            return coordinator$ui;
        }
        NodeCoordinator wrapped$ui = coordinator$ui.getWrapped();
        Intrinsics.h(wrapped$ui);
        return wrapped$ui;
    }

    @NotNull
    public static final Density requireDensity(@NotNull DelegatableNode delegatableNode) {
        return requireLayoutNode(delegatableNode).getDensity();
    }

    @NotNull
    public static final GraphicsContext requireGraphicsContext(@NotNull DelegatableNode delegatableNode) {
        return requireOwner(delegatableNode).getGraphicsContext();
    }

    @NotNull
    public static final LayoutCoordinates requireLayoutCoordinates(@NotNull DelegatableNode delegatableNode) {
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        LayoutCoordinates coordinates = m2612requireCoordinator64DMado(delegatableNode, NodeKind.m2722constructorimpl(2)).getCoordinates();
        if (!coordinates.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("LayoutCoordinates is not attached.");
        }
        return coordinates;
    }

    @NotNull
    public static final LayoutDirection requireLayoutDirection(@NotNull DelegatableNode delegatableNode) {
        return requireLayoutNode(delegatableNode).getLayoutDirection();
    }

    @NotNull
    public static final LayoutNode requireLayoutNode(@NotNull DelegatableNode delegatableNode) {
        NodeCoordinator coordinator$ui = delegatableNode.getNode().getCoordinator();
        if (coordinator$ui != null) {
            return coordinator$ui.getLayoutNode();
        }
        throw v7.v("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    @NotNull
    public static final Owner requireOwner(@NotNull DelegatableNode delegatableNode) {
        Owner owner$ui = requireLayoutNode(delegatableNode).getOwner();
        if (owner$ui != null) {
            return owner$ui;
        }
        throw v7.v("This node does not have an owner.");
    }

    @NotNull
    public static final SemanticsInfo requireSemanticsInfo(@NotNull DelegatableNode delegatableNode) {
        return requireLayoutNode(delegatableNode);
    }
}
