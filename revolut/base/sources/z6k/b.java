package z6k;

import com.revolut.domain.models.moneyrequest.MoneyRequest;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyRequest f319781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f319782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final do3.n f319783c;
    public final xv9.c d;
    public final w0a.e e;

    public b(MoneyRequest moneyRequest, List splittedItems, do3.n user, xv9.c cVar, w0a.e eVar) {
        Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
        Intrinsics.checkNotNullParameter(splittedItems, "splittedItems");
        Intrinsics.checkNotNullParameter(user, "user");
        this.f319781a = moneyRequest;
        this.f319782b = splittedItems;
        this.f319783c = user;
        this.d = cVar;
        this.e = eVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f319781a, bVar.f319781a) && Intrinsics.f(this.f319782b, bVar.f319782b) && Intrinsics.f(this.f319783c, bVar.f319783c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f319783c.hashCode() + p.a.d(this.f319781a.hashCode() * 31, 31, this.f319782b)) * 31;
        xv9.c cVar = this.d;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        w0a.e eVar = this.e;
        return iHashCode2 + (eVar != null ? eVar.hashCode() : 0);
    }
}
