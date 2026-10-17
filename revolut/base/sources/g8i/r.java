package g8i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.feature_move_money.api.model.OrderMode;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.shared.feature.move_money.api.navigation.Action;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class r implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OrderQuote f141385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountWrapper f141386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccountWrapper f141387c;
    public final long d;
    public final j8l.d e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final OrderMode f141388g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x5i.h f141389h;
    public final qv0.i i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final wi0.b f141390j;
    public final Action k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f141391l;

    public r(OrderQuote orderQuote, AccountWrapper sourceAccount, AccountWrapper targetAccount, long j2, j8l.d buyMode, boolean z, OrderMode orderMode, x5i.h hVar, qv0.i iVar, wi0.b bVar, Action action, List transferSectionData) {
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
        Intrinsics.checkNotNullParameter(targetAccount, "targetAccount");
        Intrinsics.checkNotNullParameter(buyMode, "buyMode");
        Intrinsics.checkNotNullParameter(orderMode, "orderMode");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(transferSectionData, "transferSectionData");
        this.f141385a = orderQuote;
        this.f141386b = sourceAccount;
        this.f141387c = targetAccount;
        this.d = j2;
        this.e = buyMode;
        this.f = z;
        this.f141388g = orderMode;
        this.f141389h = hVar;
        this.i = iVar;
        this.f141390j = bVar;
        this.k = action;
        this.f141391l = transferSectionData;
    }

    public static r a(r rVar, OrderQuote orderQuote, boolean z, OrderMode orderMode, x5i.h hVar, qv0.i iVar, wi0.b bVar, List list, int i) {
        OrderQuote orderQuote2 = (i & 1) != 0 ? rVar.f141385a : orderQuote;
        AccountWrapper sourceAccount = rVar.f141386b;
        AccountWrapper targetAccount = rVar.f141387c;
        long j2 = rVar.d;
        j8l.d buyMode = rVar.e;
        boolean z3 = (i & 32) != 0 ? rVar.f : z;
        OrderMode orderMode2 = (i & 64) != 0 ? rVar.f141388g : orderMode;
        x5i.h hVar2 = (i & 128) != 0 ? rVar.f141389h : hVar;
        qv0.i iVar2 = (i & 256) != 0 ? rVar.i : iVar;
        wi0.b bVar2 = (i & 512) != 0 ? rVar.f141390j : bVar;
        Action action = rVar.k;
        List transferSectionData = (i & 2048) != 0 ? rVar.f141391l : list;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(orderQuote2, "orderQuote");
        Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
        Intrinsics.checkNotNullParameter(targetAccount, "targetAccount");
        Intrinsics.checkNotNullParameter(buyMode, "buyMode");
        Intrinsics.checkNotNullParameter(orderMode2, "orderMode");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(transferSectionData, "transferSectionData");
        return new r(orderQuote2, sourceAccount, targetAccount, j2, buyMode, z3, orderMode2, hVar2, iVar2, bVar2, action, transferSectionData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f141385a, rVar.f141385a) && Intrinsics.f(this.f141386b, rVar.f141386b) && Intrinsics.f(this.f141387c, rVar.f141387c) && this.d == rVar.d && this.e == rVar.e && this.f == rVar.f && Intrinsics.f(this.f141388g, rVar.f141388g) && Intrinsics.f(this.f141389h, rVar.f141389h) && Intrinsics.f(this.i, rVar.i) && Intrinsics.f(this.f141390j, rVar.f141390j) && Intrinsics.f(this.k, rVar.k) && Intrinsics.f(this.f141391l, rVar.f141391l);
    }

    public final int hashCode() {
        int iHashCode = (this.f141388g.hashCode() + j6.a.c((this.e.hashCode() + a0.d.c((this.f141387c.hashCode() + ((this.f141386b.hashCode() + (this.f141385a.hashCode() * 31)) * 31)) * 31, 31, this.d)) * 31, 31, this.f)) * 31;
        x5i.h hVar = this.f141389h;
        int iHashCode2 = (iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        qv0.i iVar = this.i;
        int iHashCode3 = (iHashCode2 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        wi0.b bVar = this.f141390j;
        return this.f141391l.hashCode() + ((this.k.hashCode() + ((iHashCode3 + (bVar != null ? bVar.f297794a.hashCode() : 0)) * 31)) * 31);
    }
}
