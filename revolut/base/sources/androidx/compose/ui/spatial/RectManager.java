package androidx.compose.ui.spatial;

import androidx.collection.IntObjectMap;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Actual_androidKt;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.MatrixKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.MeasurePassDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ5\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\tJ\u0015\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\tJA\u0010%\u001a\u00020$2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001f2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00070!¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u0003¢\u0006\u0004\b(\u0010)J%\u0010,\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\u0016¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u0003¢\u0006\u0004\b.\u0010)J\u001f\u00100\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00032\b\b\u0002\u0010/\u001a\u00020\u0016¢\u0006\u0004\b0\u00101J\u0015\u00104\u001a\u00020\n2\u0006\u0010'\u001a\u00020\u0003¢\u0006\u0004\b2\u00103J\u0015\u00105\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u0003¢\u0006\u0004\b5\u0010)J\u0015\u00106\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u0003¢\u0006\u0004\b6\u0010)J\u0013\u00107\u001a\u00020\u0007*\u00020\u0003H\u0002¢\u0006\u0004\b7\u0010)J\u0017\u00108\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u0003H\u0002¢\u0006\u0004\b8\u0010)J\u0017\u00109\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u0003H\u0002¢\u0006\u0004\b9\u0010)J\u001b\u0010=\u001a\u00020\u0007*\u00020:2\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b=\u0010>J\u0013\u0010?\u001a\u00020\u0016*\u00020:H\u0002¢\u0006\u0004\b?\u0010@J\u0013\u0010B\u001a\u00020\n*\u00020\u0003H\u0002¢\u0006\u0004\bA\u00103R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010CR\u0017\u0010E\u001a\u00020D8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR \u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070M0L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010P\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010R\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010QR\u0016\u0010S\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010QR\u0018\u0010T\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010V\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00070M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010Z\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[¨\u0006\\"}, d2 = {"Landroidx/compose/ui/spatial/RectManager;", "", "Landroidx/collection/IntObjectMap;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNodes", "<init>", "(Landroidx/collection/IntObjectMap;)V", "", "invalidate", "()V", "Landroidx/compose/ui/unit/IntOffset;", "screenOffset", "windowOffset", "Landroidx/compose/ui/graphics/Matrix;", "viewToWindowMatrix", "", "windowWidth", "windowHeight", "updateOffsets-gTq6Wqs", "(JJ[FII)V", "updateOffsets", "dispatchCallbacks", "", "ensureSomethingScheduled", "scheduleDebounceCallback", "(Z)V", "removeScheduledCallback", "id", "", "throttleMillis", "debounceMillis", "Landroidx/compose/ui/node/DelegatableNode;", "node", "Lkotlin/Function1;", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "callback", "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "registerOnRectChangedCallback", "(IJJLandroidx/compose/ui/node/DelegatableNode;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "layoutNode", "invalidateCallbacksFor", "(Landroidx/compose/ui/node/LayoutNode;)V", "focusable", "gesturable", "updateFlagsFor", "(Landroidx/compose/ui/node/LayoutNode;ZZ)V", "onLayoutLayerPositionalPropertiesChanged", "forceUpdate", "onLayoutPositionChanged", "(Landroidx/compose/ui/node/LayoutNode;Z)V", "getOffsetFromRectListFor-Bjo55l4", "(Landroidx/compose/ui/node/LayoutNode;)J", "getOffsetFromRectListFor", "remove", "unsetHasCallbacksFor", "resetHasPositionalLayerTransformationsForSubtreeIfNeeded", "insertOrUpdateTransformedNodeSubhierarchy", "insertOrUpdateTransformedNode", "Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/geometry/MutableRect;", "rect", "boundingRectInRoot", "(Landroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/geometry/MutableRect;)V", "hasPositionalLayerTransformations", "(Landroidx/compose/ui/node/NodeCoordinator;)Z", "outerToInnerOffset-Bjo55l4", "outerToInnerOffset", "Landroidx/collection/IntObjectMap;", "Landroidx/compose/ui/spatial/RectList;", "rects", "Landroidx/compose/ui/spatial/RectList;", "getRects", "()Landroidx/compose/ui/spatial/RectList;", "Landroidx/compose/ui/spatial/ThrottledCallbacks;", "throttledCallbacks", "Landroidx/compose/ui/spatial/ThrottledCallbacks;", "Landroidx/collection/MutableObjectList;", "Lkotlin/Function0;", "callbacks", "Landroidx/collection/MutableObjectList;", "isDirty", "Z", "isScreenOrWindowDirty", "isFragmented", "dispatchToken", "Ljava/lang/Object;", "scheduledDispatchDeadline", "J", "dispatchLambda", "Lkotlin/jvm/functions/Function0;", "cachedRect", "Landroidx/compose/ui/geometry/MutableRect;", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RectManager {
    private Object dispatchToken;
    private boolean isDirty;
    private boolean isFragmented;
    private boolean isScreenOrWindowDirty;

    @NotNull
    private final IntObjectMap<LayoutNode> layoutNodes;

    @NotNull
    private final RectList rects = new RectList();

    @NotNull
    private final ThrottledCallbacks throttledCallbacks = new ThrottledCallbacks();

    @NotNull
    private final MutableObjectList<Function0<Unit>> callbacks = new MutableObjectList<>(0, 1, null);
    private long scheduledDispatchDeadline = -1;

    @NotNull
    private final Function0<Unit> dispatchLambda = new RectManager$dispatchLambda$1(this);

    @NotNull
    private final MutableRect cachedRect = new MutableRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);

    public RectManager(@NotNull IntObjectMap<LayoutNode> intObjectMap) {
        this.layoutNodes = intObjectMap;
    }

    private final void boundingRectInRoot(NodeCoordinator nodeCoordinator, MutableRect mutableRect) {
        while (nodeCoordinator != null) {
            LayoutNode layoutNode = nodeCoordinator.getLayoutNode();
            if (nodeCoordinator == layoutNode.getOuterCoordinator$ui() && !layoutNode.getHasPositionalLayerTransformationsInOffsetFromRoot()) {
                long jM2841getOffsetFromRectListForBjo55l4 = m2841getOffsetFromRectListForBjo55l4(layoutNode);
                if (!IntOffset.m3333equalsimpl0(jM2841getOffsetFromRectListForBjo55l4, IntOffset.INSTANCE.m3342getMaxnOccac())) {
                    float fM3334getXimpl = IntOffset.m3334getXimpl(jM2841getOffsetFromRectListForBjo55l4);
                    mutableRect.m1825translatek4lQ0M(Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(IntOffset.m3335getYimpl(jM2841getOffsetFromRectListForBjo55l4))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fM3334getXimpl) << 32)));
                    return;
                }
            }
            OwnedLayer layer = nodeCoordinator.getLayer();
            if (layer != null) {
                float[] fArrMo2724getUnderlyingMatrixsQKQjiQ = layer.mo2724getUnderlyingMatrixsQKQjiQ();
                if (!MatrixKt.m2069isIdentity58bKbWc(fArrMo2724getUnderlyingMatrixsQKQjiQ)) {
                    Matrix.m2057mapimpl(fArrMo2724getUnderlyingMatrixsQKQjiQ, mutableRect);
                }
            }
            long jMo2652getPositionnOccac = nodeCoordinator.getPosition();
            float fM3334getXimpl2 = IntOffset.m3334getXimpl(jMo2652getPositionnOccac);
            mutableRect.m1825translatek4lQ0M(Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(IntOffset.m3335getYimpl(jMo2652getPositionnOccac))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fM3334getXimpl2) << 32)));
            nodeCoordinator = nodeCoordinator.getWrappedBy();
        }
    }

    private final boolean hasPositionalLayerTransformations(NodeCoordinator nodeCoordinator) {
        OwnedLayer layer = nodeCoordinator.getLayer();
        return (layer == null || MatrixKt.m2069isIdentity58bKbWc(layer.mo2724getUnderlyingMatrixsQKQjiQ())) ? false : true;
    }

    private final void insertOrUpdateTransformedNode(LayoutNode layoutNode) {
        layoutNode.setHasPositionalLayerTransformationsInOffsetFromRoot$ui(true);
        layoutNode.m2634setLastOffsetFromParentgyyYBs$ui(IntOffset.INSTANCE.m3342getMaxnOccac());
        NodeCoordinator outerCoordinator$ui = layoutNode.getOuterCoordinator$ui();
        MeasurePassDelegate measurePassDelegate$ui = layoutNode.getMeasurePassDelegate$ui();
        int measuredWidth = measurePassDelegate$ui.getMeasuredWidth();
        int measuredHeight = measurePassDelegate$ui.getMeasuredHeight();
        MutableRect mutableRect = this.cachedRect;
        mutableRect.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, measuredWidth, measuredHeight);
        boundingRectInRoot(outerCoordinator$ui, mutableRect);
        int left = (int) mutableRect.getLeft();
        int top = (int) mutableRect.getTop();
        int right = (int) mutableRect.getRight();
        int bottom = (int) mutableRect.getBottom();
        int semanticsId = layoutNode.getSemanticsId();
        boolean addedToRectList = layoutNode.getAddedToRectList();
        layoutNode.setAddedToRectList$ui(true);
        if (!addedToRectList || !this.rects.update(semanticsId, left, top, right, bottom)) {
            LayoutNode parent$ui = layoutNode.getParent$ui();
            RectList.insert$default(this.rects, semanticsId, left, top, right, bottom, parent$ui != null ? parent$ui.getSemanticsId() : -1, layoutNode.getNodes().m2685hasH91voCI$ui(NodeKind.m2722constructorimpl(1024)), layoutNode.getNodes().m2685hasH91voCI$ui(NodeKind.m2722constructorimpl(16)), this.throttledCallbacks.getRectChangedMap().containsKey(semanticsId), 0, 512, null);
        }
        invalidate();
    }

    private final void insertOrUpdateTransformedNodeSubhierarchy(LayoutNode layoutNode) {
        insertOrUpdateTransformedNode(layoutNode);
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode2 = layoutNodeArr[i];
            if (layoutNode2.isPlaced()) {
                insertOrUpdateTransformedNodeSubhierarchy(layoutNode2);
            }
        }
    }

    public static /* synthetic */ void onLayoutPositionChanged$default(RectManager rectManager, LayoutNode layoutNode, boolean z, int i, Object obj2) {
        if ((i & 2) != 0) {
            z = false;
        }
        rectManager.onLayoutPositionChanged(layoutNode, z);
    }

    /* JADX INFO: renamed from: outerToInnerOffset-Bjo55l4, reason: not valid java name */
    private final long m2840outerToInnerOffsetBjo55l4(LayoutNode layoutNode) {
        NodeCoordinator outerCoordinator$ui = layoutNode.getOuterCoordinator$ui();
        long jM3343getZeronOccac = IntOffset.INSTANCE.m3343getZeronOccac();
        for (NodeCoordinator innerCoordinator$ui = layoutNode.getInnerCoordinator$ui(); innerCoordinator$ui != null && innerCoordinator$ui != outerCoordinator$ui; innerCoordinator$ui = innerCoordinator$ui.getWrappedBy()) {
            if (hasPositionalLayerTransformations(innerCoordinator$ui)) {
                return IntOffset.INSTANCE.m3342getMaxnOccac();
            }
            jM3343getZeronOccac = IntOffset.m3338plusqkQi6aY(jM3343getZeronOccac, innerCoordinator$ui.getPosition());
        }
        return jM3343getZeronOccac;
    }

    private final void resetHasPositionalLayerTransformationsForSubtreeIfNeeded(LayoutNode layoutNode) {
        if (!layoutNode.getHasPositionalLayerTransformationsInOffsetFromRoot() || hasPositionalLayerTransformations(layoutNode.getOuterCoordinator$ui())) {
            return;
        }
        layoutNode.setHasPositionalLayerTransformationsInOffsetFromRoot$ui(false);
        if (layoutNode.getOuterToInnerOffsetDirty()) {
            layoutNode.m2636setOuterToInnerOffsetgyyYBs$ui(m2840outerToInnerOffsetBjo55l4(layoutNode));
            layoutNode.setOuterToInnerOffsetDirty$ui(false);
        }
        if (IntOffset.m3333equalsimpl0(layoutNode.getOuterToInnerOffset(), IntOffset.INSTANCE.m3342getMaxnOccac())) {
            return;
        }
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            resetHasPositionalLayerTransformationsForSubtreeIfNeeded(layoutNodeArr[i]);
        }
    }

    public final void dispatchCallbacks() {
        removeScheduledCallback();
        long jCurrentTimeMillis = Actual_androidKt.currentTimeMillis();
        boolean z = this.isDirty;
        boolean z3 = z || this.isScreenOrWindowDirty;
        if (z) {
            this.isDirty = false;
            MutableObjectList<Function0<Unit>> mutableObjectList = this.callbacks;
            Object[] objArr = mutableObjectList.content;
            int i = mutableObjectList._size;
            for (int i2 = 0; i2 < i; i2++) {
                ((Function0) objArr[i2]).invoke();
            }
            RectList rectList = this.rects;
            long[] jArr = rectList.items;
            int i3 = rectList.itemsSize;
            for (int i5 = 0; i5 < jArr.length - 2 && i5 < i3; i5 += 3) {
                long j2 = jArr[i5 + 2];
                if ((((int) (j2 >> 60)) & 1) != 0) {
                    this.throttledCallbacks.fireOnUpdatedRect(33554431 & ((int) j2), jArr[i5], jArr[i5 + 1], jCurrentTimeMillis);
                }
            }
            this.rects.clearUpdated();
        }
        if (this.isScreenOrWindowDirty) {
            this.isScreenOrWindowDirty = false;
            this.throttledCallbacks.fireOnRectChangedEntries(jCurrentTimeMillis);
        }
        if (z3) {
            this.throttledCallbacks.fireGlobalChangeEntries(jCurrentTimeMillis);
        }
        if (this.isFragmented) {
            this.isFragmented = false;
            this.rects.defragment();
        }
        this.throttledCallbacks.triggerDebounced(jCurrentTimeMillis);
        if (this.throttledCallbacks.getMinDebounceDeadline() > 0) {
            scheduleDebounceCallback(true);
        }
    }

    /* JADX INFO: renamed from: getOffsetFromRectListFor-Bjo55l4, reason: not valid java name */
    public final long m2841getOffsetFromRectListForBjo55l4(@NotNull LayoutNode layoutNode) {
        long topLeft = this.rects.getTopLeft(layoutNode.getSemanticsId());
        if (topLeft == Long.MAX_VALUE) {
            return IntOffset.INSTANCE.m3342getMaxnOccac();
        }
        return IntOffset.m3329constructorimpl((((long) ((int) (topLeft >> 32))) << 32) | (((long) ((int) topLeft)) & BodyPartID.bodyIdMax));
    }

    @NotNull
    public final RectList getRects() {
        return this.rects;
    }

    public final void invalidate() {
        this.isDirty = true;
    }

    public final void invalidateCallbacksFor(@NotNull LayoutNode layoutNode) {
        if (layoutNode.getAddedToRectList()) {
            this.isDirty = true;
            this.rects.markUpdated(layoutNode.getSemanticsId());
        }
        scheduleDebounceCallback(true);
    }

    public final void onLayoutLayerPositionalPropertiesChanged(@NotNull LayoutNode layoutNode) {
        if (layoutNode.isPlaced()) {
            long jM2840outerToInnerOffsetBjo55l4 = m2840outerToInnerOffsetBjo55l4(layoutNode);
            if (!RectManagerKt.m2847isSetgyyYBs(jM2840outerToInnerOffsetBjo55l4)) {
                insertOrUpdateTransformedNodeSubhierarchy(layoutNode);
                return;
            }
            layoutNode.m2636setOuterToInnerOffsetgyyYBs$ui(jM2840outerToInnerOffsetBjo55l4);
            layoutNode.setOuterToInnerOffsetDirty$ui(false);
            MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui();
            LayoutNode[] layoutNodeArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i = 0; i < size; i++) {
                onLayoutPositionChanged$default(this, layoutNodeArr[i], false, 2, null);
            }
            invalidateCallbacksFor(layoutNode);
        }
    }

    public final void onLayoutPositionChanged(@NotNull LayoutNode layoutNode, boolean forceUpdate) {
        long jM3343getZeronOccac;
        long j2;
        long j3;
        if (layoutNode.isPlaced()) {
            LayoutNode parent$ui = layoutNode.getParent$ui();
            if (parent$ui == null || parent$ui.getHasPositionalLayerTransformationsInOffsetFromRoot()) {
                jM3343getZeronOccac = parent$ui == null ? IntOffset.INSTANCE.m3343getZeronOccac() : IntOffset.INSTANCE.m3342getMaxnOccac();
            } else {
                if (parent$ui.getOuterToInnerOffsetDirty()) {
                    parent$ui.setOuterToInnerOffsetDirty$ui(false);
                    parent$ui.m2636setOuterToInnerOffsetgyyYBs$ui(m2840outerToInnerOffsetBjo55l4(parent$ui));
                }
                jM3343getZeronOccac = parent$ui.getOuterToInnerOffset();
            }
            NodeCoordinator outerCoordinator$ui = layoutNode.getOuterCoordinator$ui();
            if (!RectManagerKt.m2847isSetgyyYBs(jM3343getZeronOccac) || hasPositionalLayerTransformations(outerCoordinator$ui)) {
                insertOrUpdateTransformedNodeSubhierarchy(layoutNode);
                return;
            }
            if (layoutNode.getHasPositionalLayerTransformationsInOffsetFromRoot()) {
                insertOrUpdateTransformedNodeSubhierarchy(layoutNode);
                resetHasPositionalLayerTransformationsForSubtreeIfNeeded(layoutNode);
                return;
            }
            long jM3338plusqkQi6aY = IntOffset.m3338plusqkQi6aY(jM3343getZeronOccac, outerCoordinator$ui.getPosition());
            MeasurePassDelegate measurePassDelegate$ui = layoutNode.getMeasurePassDelegate$ui();
            int measuredWidth = measurePassDelegate$ui.getMeasuredWidth();
            int measuredHeight = measurePassDelegate$ui.getMeasuredHeight();
            long jM3351constructorimpl = IntSize.m3351constructorimpl((((long) measuredWidth) << 32) | (((long) measuredHeight) & BodyPartID.bodyIdMax));
            int semanticsId = layoutNode.getSemanticsId();
            if (layoutNode.getAddedToRectList()) {
                if (forceUpdate || !IntOffset.m3333equalsimpl0(jM3338plusqkQi6aY, layoutNode.getLastOffsetFromParent()) || !IntSize.m3353equalsimpl0(jM3351constructorimpl, layoutNode.getLastSize())) {
                    if (parent$ui != null) {
                        this.rects.moveBasedOnParentOffset(semanticsId, parent$ui.getSemanticsId(), IntOffset.m3334getXimpl(jM3338plusqkQi6aY), IntOffset.m3335getYimpl(jM3338plusqkQi6aY), measuredWidth, measuredHeight);
                    } else {
                        this.rects.move(semanticsId, IntOffset.m3334getXimpl(jM3338plusqkQi6aY), IntOffset.m3335getYimpl(jM3338plusqkQi6aY), IntOffset.m3334getXimpl(jM3338plusqkQi6aY) + measuredWidth, IntOffset.m3335getYimpl(jM3338plusqkQi6aY) + measuredHeight);
                    }
                    invalidate();
                }
                j2 = jM3338plusqkQi6aY;
                j3 = jM3351constructorimpl;
            } else {
                layoutNode.setAddedToRectList$ui(true);
                boolean zM2685hasH91voCI$ui = layoutNode.getNodes().m2685hasH91voCI$ui(NodeKind.m2722constructorimpl(1024));
                boolean zM2685hasH91voCI$ui2 = layoutNode.getNodes().m2685hasH91voCI$ui(NodeKind.m2722constructorimpl(16));
                boolean zContainsKey = this.throttledCallbacks.getRectChangedMap().containsKey(semanticsId);
                if (parent$ui != null) {
                    j2 = jM3338plusqkQi6aY;
                    j3 = jM3351constructorimpl;
                    this.rects.insertBasedOnParentOffset(semanticsId, parent$ui.getSemanticsId(), IntOffset.m3334getXimpl(jM3338plusqkQi6aY), IntOffset.m3335getYimpl(jM3338plusqkQi6aY), measuredWidth, measuredHeight, zM2685hasH91voCI$ui, zM2685hasH91voCI$ui2, zContainsKey);
                } else {
                    j2 = jM3338plusqkQi6aY;
                    j3 = jM3351constructorimpl;
                    RectList.insert$default(this.rects, semanticsId, IntOffset.m3334getXimpl(j2), IntOffset.m3335getYimpl(j2), IntOffset.m3334getXimpl(j2) + measuredWidth, IntOffset.m3335getYimpl(j2) + measuredHeight, 0, zM2685hasH91voCI$ui, zM2685hasH91voCI$ui2, zContainsKey, 0, 544, null);
                }
                invalidate();
            }
            layoutNode.m2635setLastSizeozmzZPI$ui(j3);
            layoutNode.m2634setLastOffsetFromParentgyyYBs$ui(j2);
        }
    }

    @NotNull
    public final DelegatableNode.RegistrationHandle registerOnRectChangedCallback(int id10, long throttleMillis, long debounceMillis, @NotNull DelegatableNode node, @NotNull Function1<? super RelativeLayoutBounds, Unit> callback) {
        DelegatableNode.RegistrationHandle registrationHandleRegisterOnRectChanged = this.throttledCallbacks.registerOnRectChanged(id10, throttleMillis, debounceMillis, node, callback);
        if (DelegatableNodeKt.requireLayoutNode(node.getNode()).getAddedToRectList()) {
            this.rects.updateHasCallbacks(id10, true);
        }
        invalidate();
        scheduleDebounceCallback(true);
        return registrationHandleRegisterOnRectChanged;
    }

    public final void remove(@NotNull LayoutNode layoutNode) {
        if (layoutNode.getAddedToRectList()) {
            this.rects.remove(layoutNode.getSemanticsId());
            layoutNode.setAddedToRectList$ui(false);
            invalidate();
            this.isFragmented = true;
        }
    }

    public final void removeScheduledCallback() {
        Object obj2 = this.dispatchToken;
        if (obj2 != null) {
            Actual_androidKt.removePost(obj2);
            this.dispatchToken = null;
        }
    }

    public final void scheduleDebounceCallback(boolean ensureSomethingScheduled) {
        boolean z = (ensureSomethingScheduled && this.dispatchToken == null) ? false : true;
        long minDebounceDeadline = this.throttledCallbacks.getMinDebounceDeadline();
        if (minDebounceDeadline >= 0 || !z) {
            if (this.scheduledDispatchDeadline == minDebounceDeadline && z) {
                return;
            }
            Object obj2 = this.dispatchToken;
            if (obj2 != null) {
                Actual_androidKt.removePost(obj2);
            }
            long jCurrentTimeMillis = Actual_androidKt.currentTimeMillis();
            long jMax = Math.max(minDebounceDeadline, ((long) 16) + jCurrentTimeMillis);
            this.scheduledDispatchDeadline = jMax;
            this.dispatchToken = Actual_androidKt.postDelayed(jMax - jCurrentTimeMillis, this.dispatchLambda);
        }
    }

    public final void unsetHasCallbacksFor(@NotNull LayoutNode layoutNode) {
        this.rects.updateHasCallbacks(layoutNode.getSemanticsId(), false);
    }

    public final void updateFlagsFor(@NotNull LayoutNode layoutNode, boolean focusable, boolean gesturable) {
        if (layoutNode.isAttached()) {
            this.rects.updateFlagsFor(layoutNode.getSemanticsId(), focusable, gesturable);
        }
    }

    /* JADX INFO: renamed from: updateOffsets-gTq6Wqs, reason: not valid java name */
    public final void m2842updateOffsetsgTq6Wqs(long screenOffset, long windowOffset, @NotNull float[] viewToWindowMatrix, int windowWidth, int windowHeight) {
        int iM2846analyzeComponents58bKbWc = RectManagerKt.m2846analyzeComponents58bKbWc(viewToWindowMatrix);
        ThrottledCallbacks throttledCallbacks = this.throttledCallbacks;
        if ((iM2846analyzeComponents58bKbWc & 2) != 0) {
            viewToWindowMatrix = null;
        }
        this.isScreenOrWindowDirty = throttledCallbacks.m2850updateOffsetsLDcG7Xg(screenOffset, windowOffset, viewToWindowMatrix, windowWidth, windowHeight) || this.isScreenOrWindowDirty;
    }
}
