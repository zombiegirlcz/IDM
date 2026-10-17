package androidx.compose.ui.semantics;

import android.os.Trace;
import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a5\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00010\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u001e\u0010\u0010\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0010\u0010\u0003¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsNode;", "", "isImportantForAccessibility", "(Landroidx/compose/ui/semantics/SemanticsNode;)Z", "Landroidx/compose/ui/semantics/SemanticsOwner;", "", "customRootNodeId", "Lkotlin/Function1;", "shouldIgnoreNode", "Landroidx/collection/IntObjectMap;", "Landroidx/compose/ui/semantics/SemanticsNodeWithAdjustedBounds;", "getAllUncoveredSemanticsNodesToIntObjectMap", "(Landroidx/compose/ui/semantics/SemanticsOwner;ILkotlin/jvm/functions/Function1;)Landroidx/collection/IntObjectMap;", "Landroidx/compose/ui/geometry/Rect;", "DefaultFakeNodeBounds", "Landroidx/compose/ui/geometry/Rect;", "isHidden", "isHidden$annotations", "(Landroidx/compose/ui/semantics/SemanticsNode;)V", "ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class SemanticsOwnerKt {

    @NotNull
    private static final Rect DefaultFakeNodeBounds = new Rect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 10.0f, 10.0f);

    @NotNull
    public static final IntObjectMap<SemanticsNodeWithAdjustedBounds> getAllUncoveredSemanticsNodesToIntObjectMap(@NotNull SemanticsOwner semanticsOwner, int i, @NotNull Function1<? super SemanticsNode, Boolean> function1) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            SemanticsNode unmergedRootSemanticsNode = semanticsOwner.getUnmergedRootSemanticsNode();
            if (unmergedRootSemanticsNode.getLayoutNode().isPlaced() && unmergedRootSemanticsNode.getLayoutNode().isAttached()) {
                MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(48);
                SemanticsRegion SemanticsRegion = SemanticsRegion_androidKt.SemanticsRegion();
                SemanticsRegion.set(IntRectKt.roundToIntRect(unmergedRootSemanticsNode.getBoundsInRoot()));
                getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$findAllSemanticNodesRecursive(SemanticsRegion, unmergedRootSemanticsNode, i, mutableIntObjectMap, function1, unmergedRootSemanticsNode, SemanticsRegion_androidKt.SemanticsRegion());
                return mutableIntObjectMap;
            }
            return IntObjectMapKt.emptyIntObjectMap();
        } finally {
            Trace.endSection();
        }
    }

    private static final void getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$findAllSemanticNodesRecursive(SemanticsRegion semanticsRegion, SemanticsNode semanticsNode, int i, MutableIntObjectMap<SemanticsNodeWithAdjustedBounds> mutableIntObjectMap, Function1<? super SemanticsNode, Boolean> function1, SemanticsNode semanticsNode2, SemanticsRegion semanticsRegion2) {
        LayoutInfo layoutInfo;
        SemanticsRegion semanticsRegion3 = semanticsRegion2;
        boolean z = (semanticsNode2.getLayoutNode().isPlaced() && semanticsNode2.getLayoutNode().isAttached()) ? false : true;
        if (!semanticsRegion.isEmpty() || semanticsNode2.getId() == semanticsNode.getId()) {
            if (!z || semanticsNode2.getIsFake()) {
                IntRect intRectRoundToIntRect = IntRectKt.roundToIntRect(semanticsNode2.getTouchBoundsInRoot());
                semanticsRegion3.set(intRectRoundToIntRect);
                int id10 = semanticsNode2.getId() == semanticsNode.getId() ? i : semanticsNode2.getId();
                if (!semanticsRegion3.intersect(semanticsRegion)) {
                    if (semanticsNode2.getIsFake()) {
                        SemanticsNode parent = semanticsNode2.getParent();
                        mutableIntObjectMap.set(id10, new SemanticsNodeWithAdjustedBounds(semanticsNode2, IntRectKt.roundToIntRect((parent == null || (layoutInfo = parent.getLayoutInfo()) == null || !layoutInfo.isPlaced()) ? DefaultFakeNodeBounds : parent.getBoundsInRoot())));
                        return;
                    } else {
                        if (id10 == i) {
                            mutableIntObjectMap.set(id10, new SemanticsNodeWithAdjustedBounds(semanticsNode2, semanticsRegion2.getBounds()));
                            return;
                        }
                        return;
                    }
                }
                mutableIntObjectMap.set(id10, new SemanticsNodeWithAdjustedBounds(semanticsNode2, semanticsRegion3.getBounds()));
                List<SemanticsNode> replacedChildren$ui = semanticsNode2.getReplacedChildren$ui();
                int size = replacedChildren$ui.size() - 1;
                while (-1 < size) {
                    if (!((Boolean) function1.invoke(replacedChildren$ui.get(size))).booleanValue()) {
                        getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$findAllSemanticNodesRecursive(semanticsRegion, semanticsNode, i, mutableIntObjectMap, function1, replacedChildren$ui.get(size), semanticsRegion3);
                    }
                    size--;
                    semanticsRegion3 = semanticsRegion2;
                }
                if (isImportantForAccessibility(semanticsNode2)) {
                    semanticsRegion.difference(intRectRoundToIntRect);
                }
            }
        }
    }

    public static final boolean isHidden(@NotNull SemanticsNode semanticsNode) {
        if (semanticsNode.isTransparent$ui()) {
            return true;
        }
        SemanticsConfiguration unmergedConfig = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return unmergedConfig.contains(semanticsProperties.getHideFromAccessibility()) || semanticsNode.getUnmergedConfig().contains(semanticsProperties.getInvisibleToUser());
    }

    public static final boolean isImportantForAccessibility(@NotNull SemanticsNode semanticsNode) {
        if (isHidden(semanticsNode)) {
            return false;
        }
        return semanticsNode.getUnmergedConfig().getIsMergingSemanticsOfDescendants() || semanticsNode.getUnmergedConfig().containsImportantForAccessibility$ui();
    }
}
