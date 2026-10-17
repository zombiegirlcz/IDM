package km6;

import com.revolut.feature.external_accounts.api.model.ExternalInstitutionAuthData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExternalInstitutionAuthData f185727a;

    public e(ExternalInstitutionAuthData authData) {
        Intrinsics.checkNotNullParameter(authData, "authData");
        this.f185727a = authData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f185727a, ((e) obj2).f185727a);
    }

    public final int hashCode() {
        return this.f185727a.hashCode();
    }
}
