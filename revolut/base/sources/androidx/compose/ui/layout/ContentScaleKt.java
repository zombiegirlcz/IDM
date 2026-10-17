package androidx.compose.ui.layout;

import kotlin.Metadata;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\u001a\u001f\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\u0005¨\u0006\t"}, d2 = {"Landroidx/compose/ui/geometry/Size;", "srcSize", "dstSize", "", "computeFillMaxDimension-iLBOSCw", "(JJ)F", "computeFillMaxDimension", "computeFillMinDimension-iLBOSCw", "computeFillMinDimension", "ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class ContentScaleKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: computeFillMaxDimension-iLBOSCw, reason: not valid java name */
    public static final float m2528computeFillMaxDimensioniLBOSCw(long j2, long j3) {
        return Math.max(Float.intBitsToFloat((int) (j3 >> 32)) / Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j3 & BodyPartID.bodyIdMax)) / Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: computeFillMinDimension-iLBOSCw, reason: not valid java name */
    public static final float m2529computeFillMinDimensioniLBOSCw(long j2, long j3) {
        return Math.min(Float.intBitsToFloat((int) (j3 >> 32)) / Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j3 & BodyPartID.bodyIdMax)) / Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)));
    }
}
