package androidx.compose.ui.node;

import kotlin.Metadata;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "distance", "", "isInLayer", "isInExpandedBounds", "Landroidx/compose/ui/node/DistanceAndFlags;", "DistanceAndFlags", "(FZZ)J", "ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class HitTestResultKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long DistanceAndFlags(float f, boolean z, boolean z3) {
        return DistanceAndFlags.m2614constructorimpl((((z ? 1L : 0L) | (z3 ? 2L : 0L)) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(f)) << 32));
    }

    public static /* synthetic */ long DistanceAndFlags$default(float f, boolean z, boolean z3, int i, Object obj2) {
        if ((i & 4) != 0) {
            z3 = false;
        }
        return DistanceAndFlags(f, z, z3);
    }
}
