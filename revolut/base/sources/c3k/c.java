package c3k;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f20955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20956b;

    public c(Data paymentVendorsData, String searchQuery) {
        Intrinsics.checkNotNullParameter(paymentVendorsData, "paymentVendorsData");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f20955a = paymentVendorsData;
        this.f20956b = searchQuery;
    }

    public static c a(c cVar, Data paymentVendorsData, String searchQuery, int i) {
        if ((i & 1) != 0) {
            paymentVendorsData = cVar.f20955a;
        }
        if ((i & 2) != 0) {
            searchQuery = cVar.f20956b;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(paymentVendorsData, "paymentVendorsData");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        return new c(paymentVendorsData, searchQuery);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f20955a, cVar.f20955a) && Intrinsics.f(this.f20956b, cVar.f20956b);
    }

    public final int hashCode() {
        return this.f20956b.hashCode() + (this.f20955a.hashCode() * 31);
    }
}
