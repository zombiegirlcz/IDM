package bo8;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f17296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f17297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final od0.i f17298c;
    public final a d;

    public b(Data juniorInfo, Data paymentLinkConsentState, od0.i graduationAge, a apmAvailabilityForParent) {
        Intrinsics.checkNotNullParameter(juniorInfo, "juniorInfo");
        Intrinsics.checkNotNullParameter(paymentLinkConsentState, "paymentLinkConsentState");
        Intrinsics.checkNotNullParameter(graduationAge, "graduationAge");
        Intrinsics.checkNotNullParameter(apmAvailabilityForParent, "apmAvailabilityForParent");
        this.f17296a = juniorInfo;
        this.f17297b = paymentLinkConsentState;
        this.f17298c = graduationAge;
        this.d = apmAvailabilityForParent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f17296a, bVar.f17296a) && Intrinsics.f(this.f17297b, bVar.f17297b) && Intrinsics.f(this.f17298c, bVar.f17298c) && this.d == bVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + r6.b.f(this.f17298c, kii.e.c(this.f17297b, this.f17296a.hashCode() * 31, 31), 31);
    }
}
