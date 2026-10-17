package dkj;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.esim.api.model.EsimFeaturedPhoneNumber;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f115569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f115570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f115571c;
    public final EsimFeaturedPhoneNumber d;

    public g(Data featuredPhoneNumbers, Long l2, boolean z, EsimFeaturedPhoneNumber esimFeaturedPhoneNumber) {
        Intrinsics.checkNotNullParameter(featuredPhoneNumbers, "featuredPhoneNumbers");
        this.f115569a = featuredPhoneNumbers;
        this.f115570b = l2;
        this.f115571c = z;
        this.d = esimFeaturedPhoneNumber;
    }

    public static g a(g gVar, Data featuredPhoneNumbers, EsimFeaturedPhoneNumber esimFeaturedPhoneNumber, int i) {
        if ((i & 1) != 0) {
            featuredPhoneNumbers = gVar.f115569a;
        }
        Long l2 = (i & 2) != 0 ? gVar.f115570b : null;
        boolean z = (i & 4) != 0 ? gVar.f115571c : true;
        if ((i & 8) != 0) {
            esimFeaturedPhoneNumber = gVar.d;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(featuredPhoneNumbers, "featuredPhoneNumbers");
        return new g(featuredPhoneNumbers, l2, z, esimFeaturedPhoneNumber);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f115569a, gVar.f115569a) && Intrinsics.f(this.f115570b, gVar.f115570b) && this.f115571c == gVar.f115571c && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f115569a.hashCode() * 31;
        Long l2 = this.f115570b;
        int iC = j6.a.c((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.f115571c);
        EsimFeaturedPhoneNumber esimFeaturedPhoneNumber = this.d;
        return iC + (esimFeaturedPhoneNumber != null ? esimFeaturedPhoneNumber.hashCode() : 0);
    }
}
