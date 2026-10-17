package beb;

import com.revolut.data.model.Data;
import com.revolut.feature.retail.restaurants.impl.domain.model.Customer;
import com.revolut.feature.retail.restaurants.impl.domain.model.Reservation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f14735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f14736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Customer f14737c;
    public final String d;
    public final boolean e;

    public h(Data details, Data pocket, Customer customer, String str, boolean z) {
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        this.f14735a = details;
        this.f14736b = pocket;
        this.f14737c = customer;
        this.d = str;
        this.e = z;
    }

    public static h a(h hVar, Data data, Data data2, Customer customer, String str, boolean z, int i) {
        if ((i & 1) != 0) {
            data = hVar.f14735a;
        }
        Data details = data;
        if ((i & 2) != 0) {
            data2 = hVar.f14736b;
        }
        Data pocket = data2;
        if ((i & 4) != 0) {
            customer = hVar.f14737c;
        }
        Customer customer2 = customer;
        if ((i & 8) != 0) {
            str = hVar.d;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            z = hVar.e;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        return new h(details, pocket, customer2, str2, z);
    }

    public final Reservation.Guarantee c() {
        xdb.r rVar;
        Reservation reservation;
        xdb.m mVar = (xdb.m) this.f14735a.getContent();
        if (mVar == null || (rVar = mVar.f304398a) == null || (reservation = rVar.f304405a) == null) {
            return null;
        }
        return reservation.i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f14735a, hVar.f14735a) && Intrinsics.f(this.f14736b, hVar.f14736b) && Intrinsics.f(this.f14737c, hVar.f14737c) && Intrinsics.f(this.d, hVar.d) && this.e == hVar.e;
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f14736b, this.f14735a.hashCode() * 31, 31);
        Customer customer = this.f14737c;
        int iHashCode = (iC + (customer == null ? 0 : customer.hashCode())) * 31;
        String str = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
