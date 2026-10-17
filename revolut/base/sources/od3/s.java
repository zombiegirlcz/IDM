package od3;

import com.revolut.domain.models.user.UserCompanyRegion;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class s implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserCompanyRegion f224295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f224296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f224297c;

    public s(UserCompanyRegion userCompanyRegion, wi0.b countryCode, boolean z) {
        Intrinsics.checkNotNullParameter(userCompanyRegion, "userCompanyRegion");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f224295a = userCompanyRegion;
        this.f224296b = countryCode;
        this.f224297c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return this.f224295a == sVar.f224295a && Intrinsics.f(this.f224296b, sVar.f224296b) && this.f224297c == sVar.f224297c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f224297c) + p.a.c(this.f224295a.hashCode() * 31, 31, this.f224296b.f297794a);
    }
}
