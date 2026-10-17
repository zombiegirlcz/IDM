package androidx.compose.ui.geometry;

import kotlin.Metadata;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-geometry"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class CornerRadiusKt {
    public static /* synthetic */ long CornerRadius$default(float f, float f4, int i, Object obj2) {
        if ((i & 2) != 0) {
            f4 = f;
        }
        return CornerRadius.m1820constructorimpl((((long) Float.floatToRawIntBits(f4)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f) << 32));
    }
}
