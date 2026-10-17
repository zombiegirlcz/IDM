package r1i;

import hha.u;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f251008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f251009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f251010c;

    public a(xi0.b currency, u uVar, ArrayList requiredPlans) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(requiredPlans, "requiredPlans");
        this.f251008a = currency;
        this.f251009b = uVar;
        this.f251010c = requiredPlans;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f251008a, aVar.f251008a) && Intrinsics.f(this.f251009b, aVar.f251009b) && this.f251010c.equals(aVar.f251010c);
    }

    public final int hashCode() {
        int iHashCode = this.f251008a.hashCode() * 31;
        u uVar = this.f251009b;
        return this.f251010c.hashCode() + ((iHashCode + (uVar == null ? 0 : uVar.f152366a.hashCode())) * 31);
    }
}
