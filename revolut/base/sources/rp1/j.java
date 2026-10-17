package rp1;

import com.revolut.feature.apm.bills.core.impl.data.network.BillsService;
import com.revolut.feature.apm.bills.core.impl.data.network.BillsServiceV2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rlh.d0;

/* JADX INFO: loaded from: classes20.dex */
public final class j {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillsService f256244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BillsServiceV2 f256245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.d f256246c;
    public final x4l.c d;

    public j(BillsService service, BillsServiceV2 serviceV2, ne0.d memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(serviceV2, "serviceV2");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f256244a = service;
        this.f256245b = serviceV2;
        this.f256246c = memoryCache;
        Continuation continuation = null;
        this.d = new x4l.c(new pti.d(this, continuation, 14), new d0(this, 18), new rl8.d(this, 7), new c(2, 0, continuation), new nfj.i(3, 15, continuation));
    }

    public static String a(xo1.d dVar) {
        xo1.g gVar = dVar.f307565a;
        String str = dVar.f307566b;
        String str2 = dVar.f307567c;
        StringBuilder sb6 = new StringBuilder("FORM_FIELDS_DATA-BillFormFieldsQuery(paymentMethod=");
        sb6.append(gVar);
        sb6.append(", paymentType=null, billerId=");
        sb6.append(str);
        sb6.append(", counterpartyId=null, version=");
        return v0.a.i(sb6, str2, ")");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(dp1.a r20, gim.c r21) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rp1.j.b(dp1.a, gim.c):java.lang.Object");
    }
}
