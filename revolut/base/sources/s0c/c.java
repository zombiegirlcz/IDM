package s0c;

import cli.j;
import com.revolut.data.model.Data;
import k71.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f258927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f258928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f258929c;

    public c() {
        this(0);
    }

    public static c a(c cVar, Data relatedLoyaltyTransactions, q qVar, xi0.b bVar, int i) {
        if ((i & 1) != 0) {
            relatedLoyaltyTransactions = cVar.f258927a;
        }
        if ((i & 2) != 0) {
            qVar = cVar.f258928b;
        }
        if ((i & 4) != 0) {
            bVar = cVar.f258929c;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(relatedLoyaltyTransactions, "relatedLoyaltyTransactions");
        return new c(relatedLoyaltyTransactions, qVar, bVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f258927a, cVar.f258927a) && Intrinsics.f(this.f258928b, cVar.f258928b) && Intrinsics.f(this.f258929c, cVar.f258929c);
    }

    public final int hashCode() {
        int iHashCode = this.f258927a.hashCode() * 31;
        q qVar = this.f258928b;
        int iHashCode2 = (iHashCode + (qVar == null ? 0 : qVar.hashCode())) * 31;
        xi0.b bVar = this.f258929c;
        return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    public c(Data relatedLoyaltyTransactions, q qVar, xi0.b bVar) {
        Intrinsics.checkNotNullParameter(relatedLoyaltyTransactions, "relatedLoyaltyTransactions");
        this.f258927a = relatedLoyaltyTransactions;
        this.f258928b = qVar;
        this.f258929c = bVar;
    }

    public /* synthetic */ c(int i) {
        this(new Data(null, null, true, 3, null), null, null);
    }
}
