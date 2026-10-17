package hdh;

import kotlin.jvm.internal.Intrinsics;
import nel.v0;
import nel.w0;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f151434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f151435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f151436c;

    public c(v0 onboardingDetails, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(onboardingDetails, "onboardingDetails");
        this.f151434a = onboardingDetails;
        this.f151435b = z;
        this.f151436c = z3;
    }

    public static c b(c cVar, int i) {
        v0 onboardingDetails = cVar.f151434a;
        boolean z = (i & 2) != 0 ? cVar.f151435b : false;
        boolean z3 = (i & 4) != 0 ? cVar.f151436c : false;
        Intrinsics.checkNotNullParameter(onboardingDetails, "onboardingDetails");
        return new c(onboardingDetails, z, z3);
    }

    @Override // hdh.d
    public final w0 a() {
        return this.f151434a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f151434a, cVar.f151434a) && this.f151435b == cVar.f151435b && this.f151436c == cVar.f151436c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f151436c) + j6.a.c(this.f151434a.hashCode() * 31, 31, this.f151435b);
    }
}
