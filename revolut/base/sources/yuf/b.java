package yuf;

import com.revolut.feature.transport.models.transit.TransitTicketPurchaseConfig;
import cvf.v;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class b {
    public static final TransitTicketPurchaseConfig a(v vVar) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        String status = vVar.getStatus();
        boolean zF = Intrinsics.f(status, "ACTIVE");
        TransitTicketPurchaseConfig.None none = TransitTicketPurchaseConfig.None.f92727a;
        TransitTicketPurchaseConfig locked = null;
        if (zF) {
            Integer expiresInSeconds = vVar.getExpiresInSeconds();
            if (expiresInSeconds != null) {
                locked = new TransitTicketPurchaseConfig.Active(((long) expiresInSeconds.intValue()) * 1000);
            }
        } else if (Intrinsics.f(status, "LOCKED")) {
            Integer retryAfterSeconds = vVar.getRetryAfterSeconds();
            if (retryAfterSeconds != null) {
                locked = new TransitTicketPurchaseConfig.Locked(((long) retryAfterSeconds.intValue()) * 1000);
            }
        } else {
            locked = none;
        }
        return locked == null ? none : locked;
    }
}
