package xsd;

import do3.n;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f308452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f308453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l35.e f308454c;
    public final cs3.b d;
    public final n e;

    public g(xi0.b baseCurrency, List loans, l35.e applicationAvailability, cs3.b creditConfig, n user) {
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(loans, "loans");
        Intrinsics.checkNotNullParameter(applicationAvailability, "applicationAvailability");
        Intrinsics.checkNotNullParameter(creditConfig, "creditConfig");
        Intrinsics.checkNotNullParameter(user, "user");
        this.f308452a = baseCurrency;
        this.f308453b = loans;
        this.f308454c = applicationAvailability;
        this.d = creditConfig;
        this.e = user;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f308452a, gVar.f308452a) && Intrinsics.f(this.f308453b, gVar.f308453b) && Intrinsics.f(this.f308454c, gVar.f308454c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.f308454c.hashCode() + p.a.d(this.f308452a.hashCode() * 31, 31, this.f308453b)) * 31)) * 31);
    }
}
