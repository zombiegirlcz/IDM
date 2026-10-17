package v61;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f286285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f286286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f286287c;
    public final ArrayList d;

    public g(String name, long j2, String currency, ArrayList payers) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(payers, "payers");
        this.f286285a = name;
        this.f286286b = j2;
        this.f286287c = currency;
        this.d = payers;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f286285a, gVar.f286285a) && this.f286286b == gVar.f286286b && Intrinsics.f(this.f286287c, gVar.f286287c) && this.d.equals(gVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(a0.d.c(this.f286285a.hashCode() * 31, 31, this.f286286b), 31, this.f286287c);
    }
}
