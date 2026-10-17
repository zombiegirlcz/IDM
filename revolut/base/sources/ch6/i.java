package ch6;

import com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends com.revolut.feature.external_accounts.impl.mandate.create_mandate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExternalInstitution f24129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f24130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f24131c;
    public final boolean d;
    public final bh6.e e;
    public final dj0.d f;

    public i(ExternalInstitution institution, dj0.d maxPerTransfer, dj0.d maxPerMonth, boolean z, bh6.e revolutAccountDetails, dj0.d upperLimit) {
        Intrinsics.checkNotNullParameter(institution, "institution");
        Intrinsics.checkNotNullParameter(maxPerTransfer, "maxPerTransfer");
        Intrinsics.checkNotNullParameter(maxPerMonth, "maxPerMonth");
        Intrinsics.checkNotNullParameter(revolutAccountDetails, "revolutAccountDetails");
        Intrinsics.checkNotNullParameter(upperLimit, "upperLimit");
        this.f24129a = institution;
        this.f24130b = maxPerTransfer;
        this.f24131c = maxPerMonth;
        this.d = z;
        this.e = revolutAccountDetails;
        this.f = upperLimit;
    }

    public static i a(i iVar, dj0.d dVar, dj0.d dVar2, boolean z, int i) {
        ExternalInstitution institution = iVar.f24129a;
        if ((i & 2) != 0) {
            dVar = iVar.f24130b;
        }
        dj0.d maxPerTransfer = dVar;
        if ((i & 4) != 0) {
            dVar2 = iVar.f24131c;
        }
        dj0.d maxPerMonth = dVar2;
        if ((i & 8) != 0) {
            z = iVar.d;
        }
        bh6.e revolutAccountDetails = iVar.e;
        dj0.d upperLimit = iVar.f;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(institution, "institution");
        Intrinsics.checkNotNullParameter(maxPerTransfer, "maxPerTransfer");
        Intrinsics.checkNotNullParameter(maxPerMonth, "maxPerMonth");
        Intrinsics.checkNotNullParameter(revolutAccountDetails, "revolutAccountDetails");
        Intrinsics.checkNotNullParameter(upperLimit, "upperLimit");
        return new i(institution, maxPerTransfer, maxPerMonth, z, revolutAccountDetails, upperLimit);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f24129a, iVar.f24129a) && Intrinsics.f(this.f24130b, iVar.f24130b) && Intrinsics.f(this.f24131c, iVar.f24131c) && this.d == iVar.d && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + j6.a.c(v7.c(v7.c(this.f24129a.hashCode() * 31, 31, this.f24130b), 31, this.f24131c), 31, this.d)) * 31);
    }
}
