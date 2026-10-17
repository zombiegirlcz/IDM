package z27;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ds6.m f318976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final do3.n f318977b;

    public e(ds6.m taxAssessment, do3.n user) {
        Intrinsics.checkNotNullParameter(taxAssessment, "taxAssessment");
        Intrinsics.checkNotNullParameter(user, "user");
        this.f318976a = taxAssessment;
        this.f318977b = user;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f318976a, eVar.f318976a) && Intrinsics.f(this.f318977b, eVar.f318977b);
    }

    public final int hashCode() {
        return this.f318977b.hashCode() + (this.f318976a.hashCode() * 31);
    }
}
