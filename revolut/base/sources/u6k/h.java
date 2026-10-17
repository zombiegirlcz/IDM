package u6k;

import com.revolut.core.model.account.AccountId;
import com.revolut.domain.models.moneyrequest.MoneyRequestDirection;
import com.revolut.domain.models.tracking.MoneyRequestAppSource;
import efm.d0;
import j6k.o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import pfm.r;
import rfm.f0;
import te0.w;
import u3a.q;
import u6b.k;
import wsg.n;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
public final class h implements vv9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f277624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u71.a f277625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f277626c;
    public final gte.a d;

    public h(o moneyRequestRepository, u71.a splitBillRepository, n walletInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(moneyRequestRepository, "moneyRequestRepository");
        Intrinsics.checkNotNullParameter(splitBillRepository, "splitBillRepository");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f277624a = moneyRequestRepository;
        this.f277625b = splitBillRepository;
        this.f277626c = walletInteractor;
        this.d = featureToggleInteractor;
    }

    public final f0 a(dj0.d money, String str, String str2, String str3, String str4, String str5, String str6, MoneyRequestAppSource moneyRequestAppSource) {
        Intrinsics.checkNotNullParameter(money, "money");
        Intrinsics.checkNotNullParameter(moneyRequestAppSource, "moneyRequestAppSource");
        r rVarN0 = this.f277626c.n0(money.f115083b, AccountId.Personal.f51414a);
        o oVar = this.f277624a;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(money, "money");
        Intrinsics.checkNotNullParameter(moneyRequestAppSource, "moneyRequestAppSource");
        d0<z8l.i> d0VarRequestMoney = oVar.f171818b.requestMoney(new z8l.c(money.f115082a, money.f115083b.f306286a, str2, str3, str4, str, str5, str6, m6k.a.c(moneyRequestAppSource)));
        d0 d0VarFirst = m70.a.g(oVar.d(false), null, new j0g.b(28), 1).first(zhm.f0.f322471a);
        Intrinsics.checkNotNullExpressionValue(d0VarFirst, "first(...)");
        ufm.i iVar = new ufm.i(new ufm.f(new ufm.i(w.J0(d0VarRequestMoney, d0VarFirst, oVar.e(), oVar.c()), new j4e.c(24, new j6k.d(oVar, 3)), 0), new j4e.c(25, new j6k.d(oVar, 4)), 3), new j4e.c(26, new j3f.d(25)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        f0 f0VarF = rVarN0.f(w.i0(iVar));
        Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
        return f0VarF;
    }

    public final efm.r b(String id10, String moneyRequestId, MoneyRequestDirection direction) {
        efm.r splitBillDetailsForRequestor;
        Intrinsics.checkNotNullParameter(id10, "splitBillId");
        Intrinsics.checkNotNullParameter(moneyRequestId, "moneyRequestId");
        Intrinsics.checkNotNullParameter(direction, "direction");
        int i = g.f277623a[direction.ordinal()];
        u71.a aVar = this.f277625b;
        if (i == 1) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(moneyRequestId, "moneyRequestId");
            splitBillDetailsForRequestor = aVar.getSplitBillDetailsForRequestor(id10, moneyRequestId);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Intrinsics.checkNotNullParameter(id10, "id");
            splitBillDetailsForRequestor = aVar.getSplitBillDetailsForPayer(id10);
        }
        return ue0.e.y(splitBillDetailsForRequestor, h0.f322473a, new u4e.i(20));
    }

    public final sfm.b c(String id10) {
        Intrinsics.checkNotNullParameter(id10, "requestId");
        o oVar = this.f277624a;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        sfm.b bVar = new sfm.b(w.H0(oVar.e(), oVar.c()), new j4e.c(16, new j6k.e(oVar, id10, 0)), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        return bVar;
    }

    public final efm.r d(boolean z) {
        efm.r map = this.f277624a.d(z).map(new q(new k(this, 3), 14));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}
