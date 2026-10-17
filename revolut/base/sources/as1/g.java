package as1;

import com.revolut.feature.apm.bills.core.api.model.search.tapi.BillSearchTapiResult;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f8760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BillSearchTapiResult f8761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8762c;
    public final ur1.a d;
    public final ApmQuote e;
    public final dj0.d f;

    public g(dj0.d amount, BillSearchTapiResult bill, String str, ur1.a aVar, ApmQuote apmQuote, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(bill, "bill");
        this.f8760a = amount;
        this.f8761b = bill;
        this.f8762c = str;
        this.d = aVar;
        this.e = apmQuote;
        this.f = dVar;
    }

    public static g a(g gVar, String str, ur1.a aVar, ApmQuote apmQuote, dj0.d dVar, int i) {
        dj0.d amount = gVar.f8760a;
        BillSearchTapiResult bill = gVar.f8761b;
        if ((i & 4) != 0) {
            str = gVar.f8762c;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            aVar = gVar.d;
        }
        ur1.a aVar2 = aVar;
        if ((i & 16) != 0) {
            apmQuote = gVar.e;
        }
        ApmQuote apmQuote2 = apmQuote;
        if ((i & 32) != 0) {
            dVar = gVar.f;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(bill, "bill");
        return new g(amount, bill, str2, aVar2, apmQuote2, dVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f8760a, gVar.f8760a) && Intrinsics.f(this.f8761b, gVar.f8761b) && Intrinsics.f(this.f8762c, gVar.f8762c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.f8761b.hashCode() + (this.f8760a.hashCode() * 31)) * 31;
        String str = this.f8762c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ur1.a aVar = this.d;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        ApmQuote apmQuote = this.e;
        int iHashCode4 = (iHashCode3 + (apmQuote == null ? 0 : apmQuote.hashCode())) * 31;
        dj0.d dVar = this.f;
        return iHashCode4 + (dVar != null ? dVar.hashCode() : 0);
    }
}
