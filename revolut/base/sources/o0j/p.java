package o0j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f221246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f221247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f221248c;

    public p(String phoneCountryCode, String phoneCode, String phoneNumber) {
        Intrinsics.checkNotNullParameter(phoneCountryCode, "phoneCountryCode");
        Intrinsics.checkNotNullParameter(phoneCode, "phoneCode");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        this.f221246a = phoneCountryCode;
        this.f221247b = phoneCode;
        this.f221248c = phoneNumber;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f221246a, pVar.f221246a) && Intrinsics.f(this.f221247b, pVar.f221247b) && Intrinsics.f(this.f221248c, pVar.f221248c);
    }

    public final int hashCode() {
        return this.f221248c.hashCode() + p.a.c(this.f221246a.hashCode() * 31, 31, this.f221247b);
    }
}
