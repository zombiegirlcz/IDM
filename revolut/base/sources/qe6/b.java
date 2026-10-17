package qe6;

import com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution;
import com.revolut.feature.external_accounts.api.model.Mandate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Mandate f245086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExternalInstitution f245087b;

    public b(Mandate mandate, ExternalInstitution institution) {
        Intrinsics.checkNotNullParameter(mandate, "mandate");
        Intrinsics.checkNotNullParameter(institution, "institution");
        this.f245086a = mandate;
        this.f245087b = institution;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f245086a, bVar.f245086a) && Intrinsics.f(this.f245087b, bVar.f245087b);
    }

    public final int hashCode() {
        return this.f245087b.hashCode() + (this.f245086a.hashCode() * 31);
    }
}
