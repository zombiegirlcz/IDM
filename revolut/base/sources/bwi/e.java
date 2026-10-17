package bwi;

import dwi.x;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements xii.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f19361a;

    public e(x airportLoungesAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(airportLoungesAvailabilityInteractor, "airportLoungesAvailabilityInteractor");
        this.f19361a = airportLoungesAvailabilityInteractor;
    }

    @Override // xii.b
    public final Set a() {
        String[] elements = {"lounges", "lounges-upgrade", "lounges-order-pass", "lounges-select", "lounges/search", "lounges/refund-pass"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.y0(elements);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        if (r7.equals("lounges") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        if (r7.equals("lounges-select") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
    
        r7 = r2.c(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0083, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.f(r7, "search") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008e, code lost:
    
        return ytb.b.f(r2, new com.revolut.retail.feature.airportlounges.api.navigation.AirportLoungesFeatureConfig.FindLoungesDestination(true));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0095, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.f(r7, "refund-pass") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009d, code lost:
    
        return ytb.b.f(r2, com.revolut.retail.feature.airportlounges.api.navigation.AirportLoungesFeatureConfig.PassRefundDestination.f98951b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009e, code lost:
    
        r7 = java.lang.Boolean.parseBoolean(r2.e("inline"));
        r0 = new com.revolut.retail.feature.airportlounges.api.navigation.AirportLoungesFeatureConfig.HomeDestination(r2.a(), 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00af, code lost:
    
        if (r7 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b1, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b6, code lost:
    
        return ytb.b.f(r2, r0);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // xii.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.kompot.common.ParcelableDestination e(lg0.e r7) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bwi.e.e(lg0.e):com.revolut.kompot.common.ParcelableDestination");
    }
}
