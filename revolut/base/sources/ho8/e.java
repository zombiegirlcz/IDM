package ho8;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f154241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f154242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f154243c;
    public final Data d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f154244g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f154245h;

    public e(Data coparents, Data user, Data juniorProducts, Data juniorProfile, Data juniorPlanConfiguration, Data juniorKyc, Data coparentProductEnabled, Data coparentInviterProductEnabled) {
        Intrinsics.checkNotNullParameter(coparents, "coparents");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(juniorProducts, "juniorProducts");
        Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
        Intrinsics.checkNotNullParameter(juniorPlanConfiguration, "juniorPlanConfiguration");
        Intrinsics.checkNotNullParameter(juniorKyc, "juniorKyc");
        Intrinsics.checkNotNullParameter(coparentProductEnabled, "coparentProductEnabled");
        Intrinsics.checkNotNullParameter(coparentInviterProductEnabled, "coparentInviterProductEnabled");
        this.f154241a = coparents;
        this.f154242b = user;
        this.f154243c = juniorProducts;
        this.d = juniorProfile;
        this.e = juniorPlanConfiguration;
        this.f = juniorKyc;
        this.f154244g = coparentProductEnabled;
        this.f154245h = coparentInviterProductEnabled;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f154241a, eVar.f154241a) && Intrinsics.f(this.f154242b, eVar.f154242b) && Intrinsics.f(this.f154243c, eVar.f154243c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f) && Intrinsics.f(this.f154244g, eVar.f154244g) && Intrinsics.f(this.f154245h, eVar.f154245h);
    }

    public final int hashCode() {
        return this.f154245h.hashCode() + kii.e.c(this.f154244g, kii.e.c(this.f, kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f154243c, kii.e.c(this.f154242b, this.f154241a.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }
}
