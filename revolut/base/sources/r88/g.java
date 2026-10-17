package r88;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f252382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f252383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f252384c;
    public final String d;

    public g(String juniorId, String firstName, String fullName, String paymentLink) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        Intrinsics.checkNotNullParameter(paymentLink, "paymentLink");
        this.f252382a = juniorId;
        this.f252383b = firstName;
        this.f252384c = fullName;
        this.d = paymentLink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f252382a, gVar.f252382a) && Intrinsics.f(this.f252383b, gVar.f252383b) && Intrinsics.f(this.f252384c, gVar.f252384c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f252382a.hashCode() * 31, 31, this.f252383b), 31, this.f252384c);
    }
}
