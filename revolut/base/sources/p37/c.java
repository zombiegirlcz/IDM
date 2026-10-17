package p37;

import cli.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f232695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f232696b;

    public c(List taxBeneficiaries, wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(taxBeneficiaries, "taxBeneficiaries");
        this.f232695a = countryCode;
        this.f232696b = taxBeneficiaries;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f232695a, cVar.f232695a) && Intrinsics.f(this.f232696b, cVar.f232696b);
    }

    public final int hashCode() {
        return this.f232696b.hashCode() + (this.f232695a.f297794a.hashCode() * 31);
    }
}
