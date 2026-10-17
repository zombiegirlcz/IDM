package pn6;

import com.revolut.feature.external_accounts.api.model.ExternalInstitutionAuthData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExternalInstitutionAuthData f237670a;

    public g(ExternalInstitutionAuthData authData) {
        Intrinsics.checkNotNullParameter(authData, "authData");
        this.f237670a = authData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f237670a, ((g) obj2).f237670a);
    }

    public final int hashCode() {
        return this.f237670a.hashCode();
    }
}
