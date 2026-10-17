package v61;

import com.revolut.domain.models.moneyrequest.SplitBillItemType;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f286268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SplitBillItemType f286269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f286270c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f286271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f286272h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f286273j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f286274l;

    public c(String id10, SplitBillItemType type, String str, String str2, String str3, String title, long j2, String requestedCurrency, long j3, String sourceCurrency, ArrayList arrayList, String str4) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(requestedCurrency, "requestedCurrency");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        this.f286268a = id10;
        this.f286269b = type;
        this.f286270c = str;
        this.d = str2;
        this.e = str3;
        this.f = title;
        this.f286271g = j2;
        this.f286272h = requestedCurrency;
        this.i = j3;
        this.f286273j = sourceCurrency;
        this.k = arrayList;
        this.f286274l = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f286268a, cVar.f286268a) && this.f286269b == cVar.f286269b && Intrinsics.f(this.f286270c, cVar.f286270c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && this.f286271g == cVar.f286271g && Intrinsics.f(this.f286272h, cVar.f286272h) && this.i == cVar.i && Intrinsics.f(this.f286273j, cVar.f286273j) && Intrinsics.f(this.k, cVar.k) && Intrinsics.f(this.f286274l, cVar.f286274l);
    }

    public final int hashCode() {
        int iHashCode = (this.f286269b.hashCode() + (this.f286268a.hashCode() * 31)) * 31;
        String str = this.f286270c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iC = p.a.c(a0.d.c(p.a.c(a0.d.c(p.a.c((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f), 31, this.f286271g), 31, this.f286272h), 31, this.i), 31, this.f286273j);
        List list = this.k;
        int iHashCode4 = (iC + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.f286274l;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }
}
