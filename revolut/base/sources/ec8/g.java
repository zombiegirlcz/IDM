package ec8;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f124462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f124463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f124464c;
    public final Data d;

    public g(Data user, Data coparents, Data juniorProfile, Data allowances) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(coparents, "coparents");
        Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
        Intrinsics.checkNotNullParameter(allowances, "allowances");
        this.f124462a = user;
        this.f124463b = coparents;
        this.f124464c = juniorProfile;
        this.d = allowances;
    }

    public static g a(g gVar, Data user, Data coparents, Data juniorProfile, Data allowances, int i) {
        if ((i & 1) != 0) {
            user = gVar.f124462a;
        }
        if ((i & 2) != 0) {
            coparents = gVar.f124463b;
        }
        if ((i & 4) != 0) {
            juniorProfile = gVar.f124464c;
        }
        if ((i & 8) != 0) {
            allowances = gVar.d;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(coparents, "coparents");
        Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
        Intrinsics.checkNotNullParameter(allowances, "allowances");
        return new g(user, coparents, juniorProfile, allowances);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f124462a, gVar.f124462a) && Intrinsics.f(this.f124463b, gVar.f124463b) && Intrinsics.f(this.f124464c, gVar.f124464c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kii.e.c(this.f124464c, kii.e.c(this.f124463b, this.f124462a.hashCode() * 31, 31), 31);
    }
}
