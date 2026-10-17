package fu7;

import bu7.y0;
import com.revolut.feature.insurance_embedded.api.models.RemoteDocument;
import du7.n7;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import zhm.r0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f138113a = r0.k(new Pair("PDF", y0.PDF), new Pair("WEBPAGE", y0.WEBPAGE));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f138114b = r0.k(new Pair("PURCHASE_PROTECTION_VARIANT_1", dl7.a.PURCHASE_PROTECTION_PLUS), new Pair("PURCHASE_PROTECTION_VARIANT_2", dl7.a.PURCHASE_PROTECTION_PREMIUM), new Pair("PURCHASE_PROTECTION_VARIANT_3", dl7.a.PURCHASE_PROTECTION_METAL), new Pair("REFUND_PROTECTION", dl7.a.REFUND_PROTECTION), new Pair("TICKET_CANCELLATION", dl7.a.TICKET_CANCELLATION), new Pair("CAR_HIRE_EXCESS", dl7.a.CAR_HIRE_EXCESS), new Pair("PERSONAL_LIABILITY", dl7.a.PERSONAL_LIABILITY), new Pair("FREE_INSURANCE", dl7.a.FREE_INSURANCE), new Pair("WINTER_SPORTS_COVER", dl7.a.WINTER_SPORTS_COVER), new Pair("EVENT_CANCELLATION", dl7.a.EVENT_CANCELLATION), new Pair("TRIP_CANCELLATION", dl7.a.TRIP_CANCELLATION), new Pair("UNKNOWN", dl7.a.UNKNOWN));

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    public static final RemoteDocument a(n7 n7Var) {
        Intrinsics.checkNotNullParameter(n7Var, "<this>");
        return new RemoteDocument(n7Var.f117788a, (y0) u1.u(n7Var.f117789b, f138113a));
    }
}
