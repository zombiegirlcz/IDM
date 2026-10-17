package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Size;
import kotlin.Metadata;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\t\u001a\u00020\u0006*\u00020\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\u000b\u001a\u00020\u0003*\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\b\u001a\u0013\u0010\r\u001a\u00020\u0003*\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\b\"\u001e\u0010\u0012\u001a\u00020\u000e*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000f\u0010\b¨\u0006\u0013"}, d2 = {"", "width", "height", "Landroidx/compose/ui/unit/IntSize;", "IntSize", "(II)J", "Landroidx/compose/ui/geometry/Size;", "toSize-ozmzZPI", "(J)J", "toSize", "toIntSize-uvyYCjk", "toIntSize", "roundToIntSize-uvyYCjk", "roundToIntSize", "Landroidx/compose/ui/unit/IntOffset;", "getCenter-ozmzZPI", "getCenter-ozmzZPI$annotations", "(J)V", "center", "ui-unit"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class IntSizeKt {
    public static final long IntSize(int i, int i2) {
        return IntSize.m3351constructorimpl((((long) i2) & BodyPartID.bodyIdMax) | (((long) i) << 32));
    }

    /* JADX INFO: renamed from: getCenter-ozmzZPI, reason: not valid java name */
    public static final long m3360getCenterozmzZPI(long j2) {
        return IntOffset.m3329constructorimpl((((j2 << 32) >> 33) & BodyPartID.bodyIdMax) | ((j2 >> 33) << 32));
    }

    /* JADX INFO: renamed from: roundToIntSize-uvyYCjk, reason: not valid java name */
    public static final long m3361roundToIntSizeuvyYCjk(long j2) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j2 >> 32)));
        return IntSize.m3351constructorimpl((((long) Math.round(Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax) | (((long) iRound) << 32));
    }

    /* JADX INFO: renamed from: toIntSize-uvyYCjk, reason: not valid java name */
    public static final long m3362toIntSizeuvyYCjk(long j2) {
        int iIntBitsToFloat = (int) Float.intBitsToFloat((int) (j2 >> 32));
        return IntSize.m3351constructorimpl((((long) ((int) Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax) | (((long) iIntBitsToFloat) << 32));
    }

    /* JADX INFO: renamed from: toSize-ozmzZPI, reason: not valid java name */
    public static final long m3363toSizeozmzZPI(long j2) {
        float f = (int) (j2 >> 32);
        return Size.m1862constructorimpl((((long) Float.floatToRawIntBits((int) (j2 & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f) << 32));
    }
}
