package r88;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f252386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f252387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f252388c;

    public i(String juniorId, String firstName, String termsAndConditionsLink) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(termsAndConditionsLink, "termsAndConditionsLink");
        this.f252386a = juniorId;
        this.f252387b = firstName;
        this.f252388c = termsAndConditionsLink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f252386a, iVar.f252386a) && Intrinsics.f(this.f252387b, iVar.f252387b) && Intrinsics.f(this.f252388c, iVar.f252388c);
    }

    public final int hashCode() {
        return this.f252388c.hashCode() + p.a.c(this.f252386a.hashCode() * 31, 31, this.f252387b);
    }
}
