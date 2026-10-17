package il2;

import com.revolut.feature.backend_driven_limits.api.model.RestrictedAmount;
import com.revolut.feature.backend_driven_limits.api.model.RestrictedFundsDetailedInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f162051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RestrictedAmount f162052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RestrictedFundsDetailedInfo f162053c;

    public e(String title, RestrictedAmount restrictedAmount, RestrictedFundsDetailedInfo detailedInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(restrictedAmount, "restrictedAmount");
        Intrinsics.checkNotNullParameter(detailedInfo, "detailedInfo");
        this.f162051a = title;
        this.f162052b = restrictedAmount;
        this.f162053c = detailedInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f162051a, eVar.f162051a) && Intrinsics.f(this.f162052b, eVar.f162052b) && Intrinsics.f(this.f162053c, eVar.f162053c);
    }

    public final int hashCode() {
        return this.f162053c.hashCode() + ((this.f162052b.hashCode() + (this.f162051a.hashCode() * 31)) * 31);
    }
}
