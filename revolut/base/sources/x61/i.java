package x61;

import com.revolut.domain.models.openbanking.OpenBankingFundsConfirmation$Scheme;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes20.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OpenBankingFundsConfirmation$Scheme f303026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f303027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f303028c;

    public i(OpenBankingFundsConfirmation$Scheme scheme, String identification, Instant instant) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(identification, "identification");
        this.f303026a = scheme;
        this.f303027b = identification;
        this.f303028c = instant;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f303026a == iVar.f303026a && Intrinsics.f(this.f303027b, iVar.f303027b) && Intrinsics.f(this.f303028c, iVar.f303028c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f303026a.hashCode() * 31, 31, this.f303027b);
        Instant instant = this.f303028c;
        return iC + (instant == null ? 0 : instant.hashCode());
    }
}
