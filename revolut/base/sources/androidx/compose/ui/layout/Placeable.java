package androidx.compose.ui.layout;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.node.MotionReferencePlacementDelegate;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.f;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b'\u0018\u00002\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J5\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nH$¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\r\u0010\u0012R$\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R*\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u001b8\u0004@DX\u0084\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R*\u0010#\u001a\u00020\"2\u0006\u0010\u0014\u001a\u00020\"8\u0004@DX\u0084\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R$\u0010&\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00068\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\u001fR\u0014\u0010)\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0018R\u0014\u0010+\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0018¨\u0006-"}, d2 = {"Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/layout/Measured;", "<init>", "()V", "", "onMeasuredSizeChanged", "Landroidx/compose/ui/unit/IntOffset;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "layerBlock", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeAt", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "", "value", "width", "I", "getWidth", "()I", "height", "getHeight", "Landroidx/compose/ui/unit/IntSize;", "measuredSize", "J", "getMeasuredSize-YbymL2g", "()J", "setMeasuredSize-ozmzZPI", "(J)V", "Landroidx/compose/ui/unit/Constraints;", "measurementConstraints", "getMeasurementConstraints-msEJaDk", "setMeasurementConstraints-BRTryo0", "apparentToRealOffset", "getApparentToRealOffset-nOcc-ac", "getMeasuredWidth", "measuredWidth", "getMeasuredHeight", "measuredHeight", "PlacementScope", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class Placeable implements Measured {
    private int height;
    private long measuredSize;
    private int width;
    private long measurementConstraints = PlaceableKt.DefaultConstraints;
    private long apparentToRealOffset = IntOffset.INSTANCE.m3343getZeronOccac();

    public Placeable() {
        long j2 = 0;
        this.measuredSize = IntSize.m3351constructorimpl((j2 & BodyPartID.bodyIdMax) | (j2 << 32));
    }

    private final void onMeasuredSizeChanged() {
        this.width = f.g((int) (this.measuredSize >> 32), Constraints.m3281getMinWidthimpl(this.measurementConstraints), Constraints.m3279getMaxWidthimpl(this.measurementConstraints));
        int iG = f.g((int) (this.measuredSize & BodyPartID.bodyIdMax), Constraints.m3280getMinHeightimpl(this.measurementConstraints), Constraints.m3278getMaxHeightimpl(this.measurementConstraints));
        this.height = iG;
        int i = this.width;
        long j2 = this.measuredSize;
        this.apparentToRealOffset = IntOffset.m3329constructorimpl((((long) ((i - ((int) (j2 >> 32))) / 2)) << 32) | (BodyPartID.bodyIdMax & ((long) ((iG - ((int) (j2 & BodyPartID.bodyIdMax))) / 2))));
    }

    /* JADX INFO: renamed from: getApparentToRealOffset-nOcc-ac, reason: not valid java name and from getter */
    public final long getApparentToRealOffset() {
        return this.apparentToRealOffset;
    }

    public final int getHeight() {
        return this.height;
    }

    public int getMeasuredHeight() {
        return (int) (this.measuredSize & BodyPartID.bodyIdMax);
    }

    /* JADX INFO: renamed from: getMeasuredSize-YbymL2g, reason: not valid java name and from getter */
    public final long getMeasuredSize() {
        return this.measuredSize;
    }

    public int getMeasuredWidth() {
        return (int) (this.measuredSize >> 32);
    }

    /* JADX INFO: renamed from: getMeasurementConstraints-msEJaDk, reason: not valid java name and from getter */
    public final long getMeasurementConstraints() {
        return this.measurementConstraints;
    }

    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: placeAt-f8xVGno, reason: not valid java name */
    public void mo2553placeAtf8xVGno(long position, float zIndex, @NotNull GraphicsLayer layer) {
        mo2531placeAtf8xVGno(position, zIndex, (Function1<? super GraphicsLayerScope, Unit>) null);
    }

    /* JADX INFO: renamed from: placeAt-f8xVGno */
    public abstract void mo2531placeAtf8xVGno(long position, float zIndex, Function1<? super GraphicsLayerScope, Unit> layerBlock);

    /* JADX INFO: renamed from: setMeasuredSize-ozmzZPI, reason: not valid java name */
    public final void m2554setMeasuredSizeozmzZPI(long j2) {
        if (IntSize.m3353equalsimpl0(this.measuredSize, j2)) {
            return;
        }
        this.measuredSize = j2;
        onMeasuredSizeChanged();
    }

    /* JADX INFO: renamed from: setMeasurementConstraints-BRTryo0, reason: not valid java name */
    public final void m2555setMeasurementConstraintsBRTryo0(long j2) {
        if (Constraints.m3273equalsimpl0(this.measurementConstraints, j2)) {
            return;
        }
        this.measurementConstraints = j2;
        onMeasuredSizeChanged();
    }

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u0010\u001a\u00020\r*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0010\u001a\u00020\r*\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0014J+\u0010\u0015\u001a\u00020\r*\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0014J#\u0010\u0015\u001a\u00020\r*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u000fJ9\u0010\u001c\u001a\u00020\r*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00052\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u0017¢\u0006\u0004\b\u001a\u0010\u001bJA\u0010\u001c\u001a\u00020\r*\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\u00052\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u0017¢\u0006\u0004\b\u001c\u0010\u001dJA\u0010\u001e\u001a\u00020\r*\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\u00052\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u0017¢\u0006\u0004\b\u001e\u0010\u001dJ9\u0010\u001e\u001a\u00020\r*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00052\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u0017¢\u0006\u0004\b\u001f\u0010\u001bJ+\u0010\u001e\u001a\u00020\r*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010!\u001a\u00020 2\b\b\u0002\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010\"J+\u0010\u001c\u001a\u00020\r*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010!\u001a\u00020 2\b\b\u0002\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\"J!\u0010$\u001a\u00020\r2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\r0\u0017¢\u0006\u0004\b$\u0010%J\u0013\u0010&\u001a\u00020\r*\u00020\tH\u0002¢\u0006\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010,R\u0014\u00102\u001a\u00020\u00118$X¤\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00106\u001a\u0002038$X¤\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Landroidx/compose/ui/unit/Density;", "<init>", "()V", "Landroidx/compose/ui/layout/Ruler;", "", "defaultValue", "current", "(Landroidx/compose/ui/layout/Ruler;F)F", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/unit/IntOffset;", "position", "zIndex", "", "placeRelative-70tqf50", "(Landroidx/compose/ui/layout/Placeable;JF)V", "placeRelative", "", "x", "y", "(Landroidx/compose/ui/layout/Placeable;IIF)V", "place", "place-70tqf50", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "layerBlock", "placeRelativeWithLayer-aW-9-wM", "(Landroidx/compose/ui/layout/Placeable;JFLkotlin/jvm/functions/Function1;)V", "placeRelativeWithLayer", "(Landroidx/compose/ui/layout/Placeable;IIFLkotlin/jvm/functions/Function1;)V", "placeWithLayer", "placeWithLayer-aW-9-wM", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "(Landroidx/compose/ui/layout/Placeable;JLandroidx/compose/ui/graphics/layer/GraphicsLayer;F)V", "block", "withMotionFrameOfReferencePlacement", "(Lkotlin/jvm/functions/Function1;)V", "handleMotionFrameOfReferencePlacement", "(Landroidx/compose/ui/layout/Placeable;)V", "", "motionFrameOfReferencePlacement", "Z", "getDensity", "()F", "density", "getFontScale", "fontScale", "getParentWidth", "()I", "parentWidth", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "parentLayoutDirection", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class PlacementScope implements Density {
        private boolean motionFrameOfReferencePlacement;

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final void handleMotionFrameOfReferencePlacement(Placeable placeable) {
            if (placeable instanceof MotionReferencePlacementDelegate) {
                ((MotionReferencePlacementDelegate) placeable).updatePlacedUnderMotionFrameOfReference(this.motionFrameOfReferencePlacement);
            }
        }

        public static /* synthetic */ void place$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, int i3, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if ((i3 & 4) != 0) {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            placementScope.place(placeable, i, i2, f);
        }

        /* JADX INFO: renamed from: place-70tqf50$default, reason: not valid java name */
        public static /* synthetic */ void m2556place70tqf50$default(PlacementScope placementScope, Placeable placeable, long j2, float f, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if ((i & 2) != 0) {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            placementScope.m2562place70tqf50(placeable, j2, f);
        }

        public static /* synthetic */ void placeRelative$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, int i3, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if ((i3 & 4) != 0) {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            placementScope.placeRelative(placeable, i, i2, f);
        }

        /* JADX INFO: renamed from: placeRelative-70tqf50$default, reason: not valid java name */
        public static /* synthetic */ void m2557placeRelative70tqf50$default(PlacementScope placementScope, Placeable placeable, long j2, float f, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
            }
            if ((i & 2) != 0) {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            placementScope.m2563placeRelative70tqf50(placeable, j2, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void placeRelativeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, Function1 function1, int i3, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i3 & 4) != 0) {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            float f4 = f;
            if ((i3 & 8) != 0) {
                function1 = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.placeRelativeWithLayer(placeable, i, i2, f4, function1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: placeRelativeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m2558placeRelativeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j2, float f, Function1 function1, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i & 2) != 0) {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            float f4 = f;
            if ((i & 4) != 0) {
                function1 = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.m2564placeRelativeWithLayeraW9wM(placeable, j2, f4, (Function1<? super GraphicsLayerScope, Unit>) function1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void placeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, Function1 function1, int i3, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i3 & 4) != 0) {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            float f4 = f;
            if ((i3 & 8) != 0) {
                function1 = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.placeWithLayer(placeable, i, i2, f4, function1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: placeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m2560placeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j2, float f, Function1 function1, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i & 2) != 0) {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            float f4 = f;
            if ((i & 4) != 0) {
                function1 = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.m2566placeWithLayeraW9wM(placeable, j2, f4, (Function1<? super GraphicsLayerScope, Unit>) function1);
        }

        public float current(@NotNull Ruler ruler, float f) {
            return f;
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return 1.0f;
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            return 1.0f;
        }

        @NotNull
        public abstract LayoutDirection getParentLayoutDirection();

        public abstract int getParentWidth();

        public final void place(@NotNull Placeable placeable, int i, int i2, float f) {
            long jM3329constructorimpl = IntOffset.m3329constructorimpl((((long) i2) & BodyPartID.bodyIdMax) | (((long) i) << 32));
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo2531placeAtf8xVGno(IntOffset.m3338plusqkQi6aY(jM3329constructorimpl, placeable.apparentToRealOffset), f, (Function1<? super GraphicsLayerScope, Unit>) null);
        }

        /* JADX INFO: renamed from: place-70tqf50, reason: not valid java name */
        public final void m2562place70tqf50(@NotNull Placeable placeable, long j2, float f) {
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo2531placeAtf8xVGno(IntOffset.m3338plusqkQi6aY(j2, placeable.apparentToRealOffset), f, (Function1<? super GraphicsLayerScope, Unit>) null);
        }

        public final void placeRelative(@NotNull Placeable placeable, int i, int i2, float f) {
            long jM3329constructorimpl = IntOffset.m3329constructorimpl((((long) i) << 32) | (((long) i2) & BodyPartID.bodyIdMax));
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo2531placeAtf8xVGno(IntOffset.m3338plusqkQi6aY(jM3329constructorimpl, placeable.apparentToRealOffset), f, (Function1<? super GraphicsLayerScope, Unit>) null);
            } else {
                long jM3329constructorimpl2 = IntOffset.m3329constructorimpl((((long) ((getParentWidth() - placeable.getWidth()) - IntOffset.m3334getXimpl(jM3329constructorimpl))) << 32) | (((long) IntOffset.m3335getYimpl(jM3329constructorimpl)) & BodyPartID.bodyIdMax));
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo2531placeAtf8xVGno(IntOffset.m3338plusqkQi6aY(jM3329constructorimpl2, placeable.apparentToRealOffset), f, (Function1<? super GraphicsLayerScope, Unit>) null);
            }
        }

        /* JADX INFO: renamed from: placeRelative-70tqf50, reason: not valid java name */
        public final void m2563placeRelative70tqf50(@NotNull Placeable placeable, long j2, float f) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo2531placeAtf8xVGno(IntOffset.m3338plusqkQi6aY(j2, placeable.apparentToRealOffset), f, (Function1<? super GraphicsLayerScope, Unit>) null);
                return;
            }
            int parentWidth = (getParentWidth() - placeable.getWidth()) - IntOffset.m3334getXimpl(j2);
            long jM3329constructorimpl = IntOffset.m3329constructorimpl((((long) IntOffset.m3335getYimpl(j2)) & BodyPartID.bodyIdMax) | (((long) parentWidth) << 32));
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo2531placeAtf8xVGno(IntOffset.m3338plusqkQi6aY(jM3329constructorimpl, placeable.apparentToRealOffset), f, (Function1<? super GraphicsLayerScope, Unit>) null);
        }

        public final void placeRelativeWithLayer(@NotNull Placeable placeable, int i, int i2, float f, @NotNull Function1<? super GraphicsLayerScope, Unit> function1) {
            long jM3329constructorimpl = IntOffset.m3329constructorimpl((((long) i) << 32) | (((long) i2) & BodyPartID.bodyIdMax));
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo2531placeAtf8xVGno(IntOffset.m3338plusqkQi6aY(jM3329constructorimpl, placeable.apparentToRealOffset), f, function1);
            } else {
                long jM3329constructorimpl2 = IntOffset.m3329constructorimpl((((long) ((getParentWidth() - placeable.getWidth()) - IntOffset.m3334getXimpl(jM3329constructorimpl))) << 32) | (((long) IntOffset.m3335getYimpl(jM3329constructorimpl)) & BodyPartID.bodyIdMax));
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo2531placeAtf8xVGno(IntOffset.m3338plusqkQi6aY(jM3329constructorimpl2, placeable.apparentToRealOffset), f, function1);
            }
        }

        /* JADX INFO: renamed from: placeRelativeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m2564placeRelativeWithLayeraW9wM(@NotNull Placeable placeable, long j2, float f, @NotNull Function1<? super GraphicsLayerScope, Unit> function1) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo2531placeAtf8xVGno(IntOffset.m3338plusqkQi6aY(j2, placeable.apparentToRealOffset), f, function1);
                return;
            }
            int parentWidth = (getParentWidth() - placeable.getWidth()) - IntOffset.m3334getXimpl(j2);
            long jM3329constructorimpl = IntOffset.m3329constructorimpl((((long) IntOffset.m3335getYimpl(j2)) & BodyPartID.bodyIdMax) | (((long) parentWidth) << 32));
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo2531placeAtf8xVGno(IntOffset.m3338plusqkQi6aY(jM3329constructorimpl, placeable.apparentToRealOffset), f, function1);
        }

        public final void placeWithLayer(@NotNull Placeable placeable, int i, int i2, float f, @NotNull Function1<? super GraphicsLayerScope, Unit> function1) {
            long jM3329constructorimpl = IntOffset.m3329constructorimpl((((long) i2) & BodyPartID.bodyIdMax) | (((long) i) << 32));
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo2531placeAtf8xVGno(IntOffset.m3338plusqkQi6aY(jM3329constructorimpl, placeable.apparentToRealOffset), f, function1);
        }

        /* JADX INFO: renamed from: placeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m2566placeWithLayeraW9wM(@NotNull Placeable placeable, long j2, float f, @NotNull Function1<? super GraphicsLayerScope, Unit> function1) {
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo2531placeAtf8xVGno(IntOffset.m3338plusqkQi6aY(j2, placeable.apparentToRealOffset), f, function1);
        }

        public final void withMotionFrameOfReferencePlacement(@NotNull Function1<? super PlacementScope, Unit> block) {
            this.motionFrameOfReferencePlacement = true;
            block.invoke(this);
            this.motionFrameOfReferencePlacement = false;
        }

        /* JADX INFO: renamed from: placeRelativeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m2559placeRelativeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j2, GraphicsLayer graphicsLayer, float f, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i & 4) != 0) {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            placementScope.m2565placeRelativeWithLayeraW9wM(placeable, j2, graphicsLayer, f);
        }

        /* JADX INFO: renamed from: placeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m2561placeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j2, GraphicsLayer graphicsLayer, float f, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i & 4) != 0) {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            placementScope.m2567placeWithLayeraW9wM(placeable, j2, graphicsLayer, f);
        }

        /* JADX INFO: renamed from: placeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m2567placeWithLayeraW9wM(@NotNull Placeable placeable, long j2, @NotNull GraphicsLayer graphicsLayer, float f) {
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo2553placeAtf8xVGno(IntOffset.m3338plusqkQi6aY(j2, placeable.apparentToRealOffset), f, graphicsLayer);
        }

        /* JADX INFO: renamed from: placeRelativeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m2565placeRelativeWithLayeraW9wM(@NotNull Placeable placeable, long j2, @NotNull GraphicsLayer graphicsLayer, float f) {
            if (getParentLayoutDirection() != LayoutDirection.Ltr && getParentWidth() != 0) {
                int parentWidth = (getParentWidth() - placeable.getWidth()) - IntOffset.m3334getXimpl(j2);
                long jM3329constructorimpl = IntOffset.m3329constructorimpl((((long) IntOffset.m3335getYimpl(j2)) & BodyPartID.bodyIdMax) | (((long) parentWidth) << 32));
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo2553placeAtf8xVGno(IntOffset.m3338plusqkQi6aY(jM3329constructorimpl, placeable.apparentToRealOffset), f, graphicsLayer);
                return;
            }
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo2553placeAtf8xVGno(IntOffset.m3338plusqkQi6aY(j2, placeable.apparentToRealOffset), f, graphicsLayer);
        }
    }
}
