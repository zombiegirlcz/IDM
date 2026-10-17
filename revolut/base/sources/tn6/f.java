package tn6;

import com.revolut.domain.models.user.UserCompanyRegion;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserCompanyRegion f272313a;

    public f(UserCompanyRegion userCompanyRegion) {
        this.f272313a = userCompanyRegion;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f272313a == ((f) obj2).f272313a;
    }

    public final int hashCode() {
        UserCompanyRegion userCompanyRegion = this.f272313a;
        if (userCompanyRegion == null) {
            return 0;
        }
        return userCompanyRegion.hashCode();
    }
}
