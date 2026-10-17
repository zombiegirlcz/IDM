package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.r;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;
import zhm.r0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0014\u0010\u0001\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"4\u0010\u0006\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\"\u0015\u0010\u0010\u001a\u00020\r*\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"\u0015\u0010\u0010\u001a\u00020\u0012*\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0013\"\u0015\u0010\u0010\u001a\u00020\u0015*\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0016\"\u0015\u0010\u0010\u001a\u00020\u0018*\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0019\"\u0015\u0010\u0010\u001a\u00020\u001b*\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u001c\"\u0015\u0010\u0010\u001a\u00020\u001e*\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u001f\"\u0015\u0010\u0010\u001a\u00020\u0000*\u00020 8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010!¨\u0006\""}, d2 = {"Landroidx/compose/ui/geometry/Rect;", "RectVisibilityThreshold", "Landroidx/compose/ui/geometry/Rect;", "", "Landroidx/compose/animation/core/TwoWayConverter;", "", "VisibilityThresholdMap", "Ljava/util/Map;", "getVisibilityThresholdMap", "()Ljava/util/Map;", "getVisibilityThresholdMap$annotations", "()V", "Landroidx/compose/ui/unit/IntOffset$Companion;", "Landroidx/compose/ui/unit/IntOffset;", "getVisibilityThreshold", "(Landroidx/compose/ui/unit/IntOffset$Companion;)J", "VisibilityThreshold", "Landroidx/compose/ui/geometry/Offset$Companion;", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/geometry/Offset$Companion;)J", "Lkotlin/Int$Companion;", "", "(Lkotlin/jvm/internal/r;)I", "Landroidx/compose/ui/unit/Dp$Companion;", "Landroidx/compose/ui/unit/Dp;", "(Landroidx/compose/ui/unit/Dp$Companion;)F", "Landroidx/compose/ui/geometry/Size$Companion;", "Landroidx/compose/ui/geometry/Size;", "(Landroidx/compose/ui/geometry/Size$Companion;)J", "Landroidx/compose/ui/unit/IntSize$Companion;", "Landroidx/compose/ui/unit/IntSize;", "(Landroidx/compose/ui/unit/IntSize$Companion;)J", "Landroidx/compose/ui/geometry/Rect$Companion;", "(Landroidx/compose/ui/geometry/Rect$Companion;)Landroidx/compose/ui/geometry/Rect;", "animation-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class VisibilityThresholdsKt {

    @NotNull
    private static final Rect RectVisibilityThreshold;

    @NotNull
    private static final Map<TwoWayConverter<?, ?>, Float> VisibilityThresholdMap;

    static {
        Float fValueOf = Float.valueOf(1.0f);
        RectVisibilityThreshold = new Rect(1.0f, 1.0f, 1.0f, 1.0f);
        Pair pair = new Pair(VectorConvertersKt.getVectorConverter(r.f186431a), fValueOf);
        Pair pair2 = new Pair(VectorConvertersKt.getVectorConverter(IntSize.INSTANCE), fValueOf);
        Pair pair3 = new Pair(VectorConvertersKt.getVectorConverter(IntOffset.INSTANCE), fValueOf);
        Pair pair4 = new Pair(VectorConvertersKt.getVectorConverter(m.f186426a), Float.valueOf(0.01f));
        Pair pair5 = new Pair(VectorConvertersKt.getVectorConverter(Rect.INSTANCE), fValueOf);
        Pair pair6 = new Pair(VectorConvertersKt.getVectorConverter(Size.INSTANCE), fValueOf);
        Pair pair7 = new Pair(VectorConvertersKt.getVectorConverter(Offset.INSTANCE), fValueOf);
        TwoWayConverter<Dp, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(Dp.INSTANCE);
        Float fValueOf2 = Float.valueOf(0.4f);
        VisibilityThresholdMap = r0.k(pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair(vectorConverter, fValueOf2), new Pair(VectorConvertersKt.getVectorConverter(DpOffset.INSTANCE), fValueOf2));
    }

    public static final int getVisibilityThreshold(@NotNull r rVar) {
        return 1;
    }

    @NotNull
    public static final Map<TwoWayConverter<?, ?>, Float> getVisibilityThresholdMap() {
        return VisibilityThresholdMap;
    }

    @NotNull
    public static final Rect getVisibilityThreshold(@NotNull Rect.Companion companion) {
        return RectVisibilityThreshold;
    }

    public static final long getVisibilityThreshold(@NotNull IntOffset.Companion companion) {
        long j2 = 1;
        return IntOffset.m3329constructorimpl((j2 & BodyPartID.bodyIdMax) | (j2 << 32));
    }

    public static final long getVisibilityThreshold(@NotNull Offset.Companion companion) {
        return Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & BodyPartID.bodyIdMax));
    }

    public static final float getVisibilityThreshold(@NotNull Dp.Companion companion) {
        return Dp.m3297constructorimpl(0.4f);
    }

    public static final long getVisibilityThreshold(@NotNull Size.Companion companion) {
        return Size.m1862constructorimpl((((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & BodyPartID.bodyIdMax));
    }

    public static final long getVisibilityThreshold(@NotNull IntSize.Companion companion) {
        long j2 = 1;
        return IntSize.m3351constructorimpl((j2 & BodyPartID.bodyIdMax) | (j2 << 32));
    }
}
