package i7j;

import hha.u;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f159324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f159325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f159326c;

    public b(xi0.b currency, u uVar, ArrayList requiredPlans) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(requiredPlans, "requiredPlans");
        this.f159324a = currency;
        this.f159325b = uVar;
        this.f159326c = requiredPlans;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f159324a.equals(bVar.f159324a) && Intrinsics.f(this.f159325b, bVar.f159325b) && this.f159326c.equals(bVar.f159326c);
    }

    public final int hashCode() {
        int iHashCode = this.f159324a.hashCode() * 31;
        u uVar = this.f159325b;
        return this.f159326c.hashCode() + ((iHashCode + (uVar == null ? 0 : uVar.f152366a.hashCode())) * 31);
    }
}
