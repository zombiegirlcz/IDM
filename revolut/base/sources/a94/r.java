package a94;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f2328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qu3.e f2329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f2330c;

    public r(Data debts, qu3.e eVar, Integer num) {
        Intrinsics.checkNotNullParameter(debts, "debts");
        this.f2328a = debts;
        this.f2329b = eVar;
        this.f2330c = num;
    }

    public static r a(r rVar, Data debts, int i) {
        if ((i & 1) != 0) {
            debts = rVar.f2328a;
        }
        qu3.e eVar = (i & 2) != 0 ? rVar.f2329b : null;
        Integer num = (i & 4) != 0 ? rVar.f2330c : null;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(debts, "debts");
        return new r(debts, eVar, num);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f2328a, rVar.f2328a) && Intrinsics.f(this.f2329b, rVar.f2329b) && Intrinsics.f(this.f2330c, rVar.f2330c);
    }

    public final int hashCode() {
        int iHashCode = this.f2328a.hashCode() * 31;
        qu3.e eVar = this.f2329b;
        int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        Integer num = this.f2330c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }
}
