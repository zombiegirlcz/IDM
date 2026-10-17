package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\n\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\f\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0004\b\u000b\u0010\t\u001a\u0013\u0010\u000f\u001a\u00020\u0003*\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"", "x", "y", "Landroidx/compose/ui/unit/IntOffset;", "IntOffset", "(II)J", "Landroidx/compose/ui/geometry/Offset;", "offset", "plus-Nv-tHpc", "(JJ)J", "plus", "minus-Nv-tHpc", "minus", "round-k-4lQ0M", "(J)J", "round", "ui-unit"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class IntOffsetKt {
    public static final long IntOffset(int i, int i2) {
        return IntOffset.m3329constructorimpl((((long) i2) & BodyPartID.bodyIdMax) | (((long) i) << 32));
    }

    /* JADX INFO: renamed from: minus-Nv-tHpc, reason: not valid java name */
    public static final long m3344minusNvtHpc(long j2, long j3) {
        return Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) - IntOffset.m3334getXimpl(j3))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)) - IntOffset.m3335getYimpl(j3))) & BodyPartID.bodyIdMax));
    }

    /* JADX INFO: renamed from: plus-Nv-tHpc, reason: not valid java name */
    public static final long m3345plusNvtHpc(long j2, long j3) {
        return Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) + IntOffset.m3334getXimpl(j3))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)) + IntOffset.m3335getYimpl(j3))) & BodyPartID.bodyIdMax));
    }

    /* JADX INFO: renamed from: round-k-4lQ0M, reason: not valid java name */
    public static final long m3346roundk4lQ0M(long j2) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j2 >> 32)));
        return IntOffset.m3329constructorimpl((((long) Math.round(Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax) | (((long) iRound) << 32));
    }
}
