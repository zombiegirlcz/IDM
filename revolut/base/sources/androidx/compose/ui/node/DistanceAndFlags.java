package androidx.compose.ui.node;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/node/DistanceAndFlags;", "", "", "packedValue", "constructor-impl", "(J)J", "other", "", "compareTo-9YPOF3E", "(JJ)I", "compareTo", "", "getDistance-impl", "(J)F", "distance", "", "isInLayer-impl", "(J)Z", "isInLayer", "isInExpandedBounds-impl", "isInExpandedBounds", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class DistanceAndFlags {
    /* JADX INFO: renamed from: compareTo-9YPOF3E, reason: not valid java name */
    public static final int m2613compareTo9YPOF3E(long j2, long j3) {
        boolean zM2617isInLayerimpl = m2617isInLayerimpl(j2);
        if (zM2617isInLayerimpl != m2617isInLayerimpl(j3)) {
            return zM2617isInLayerimpl ? -1 : 1;
        }
        return (Math.min(m2615getDistanceimpl(j2), m2615getDistanceimpl(j3)) >= BitmapDescriptorFactory.HUE_RED && m2616isInExpandedBoundsimpl(j2) != m2616isInExpandedBoundsimpl(j3)) ? m2616isInExpandedBoundsimpl(j2) ? -1 : 1 : (int) Math.signum(m2615getDistanceimpl(j2) - m2615getDistanceimpl(j3));
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m2614constructorimpl(long j2) {
        return j2;
    }

    /* JADX INFO: renamed from: getDistance-impl, reason: not valid java name */
    public static final float m2615getDistanceimpl(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    /* JADX INFO: renamed from: isInExpandedBounds-impl, reason: not valid java name */
    public static final boolean m2616isInExpandedBoundsimpl(long j2) {
        return (j2 & 2) != 0;
    }

    /* JADX INFO: renamed from: isInLayer-impl, reason: not valid java name */
    public static final boolean m2617isInLayerimpl(long j2) {
        return (j2 & 1) != 0;
    }
}
