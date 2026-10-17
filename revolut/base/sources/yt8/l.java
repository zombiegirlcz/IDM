package yt8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f316673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f316674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f316675c;

    public l(boolean z, wi0.b profileCountryCode, f identityElement) {
        Intrinsics.checkNotNullParameter(profileCountryCode, "profileCountryCode");
        Intrinsics.checkNotNullParameter(identityElement, "identityElement");
        this.f316673a = z;
        this.f316674b = profileCountryCode;
        this.f316675c = identityElement;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f316673a == lVar.f316673a && Intrinsics.f(this.f316674b, lVar.f316674b) && Intrinsics.f(this.f316675c, lVar.f316675c);
    }

    public final int hashCode() {
        return this.f316675c.hashCode() + p.a.c(Boolean.hashCode(this.f316673a) * 31, 31, this.f316674b.f297794a);
    }
}
