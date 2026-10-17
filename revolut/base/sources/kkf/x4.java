package kkf;

import com.revolut.feature.credit.application.api.navigation.CreditApplicationFeatureConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class x4 extends yji.n implements elf.s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f185012l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final klf.m1 f185013m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final m35.e f185014n;
    public final toa.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y45.h f185015p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ar3.c f185016q;

    public x4(klf.h0 commonDataSource, klf.m1 juniorDataSource, m35.e loanBannerMapper, toa.a notificationSettingsInteractor, y45.h loanProductFeatureTogglesInteractor, ar3.c multiCurrencyMoneyInteractor) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(loanBannerMapper, "loanBannerMapper");
        Intrinsics.checkNotNullParameter(notificationSettingsInteractor, "notificationSettingsInteractor");
        Intrinsics.checkNotNullParameter(loanProductFeatureTogglesInteractor, "loanProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(multiCurrencyMoneyInteractor, "multiCurrencyMoneyInteractor");
        this.f185012l = commonDataSource;
        this.f185013m = juniorDataSource;
        this.f185014n = loanBannerMapper;
        this.o = notificationSettingsInteractor;
        this.f185015p = loanProductFeatureTogglesInteractor;
        this.f185016q = multiCurrencyMoneyInteractor;
    }

    public final cmf.p Z2() {
        toa.a aVar = this.o;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        efm.r rVarDistinctUntilChanged = nim.a.w(aVar.b(), new tlf.n(19)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return new cmf.p(ta6.a.h(vkm.q.q(new kge.b(rd0.e.b(rVarDistinctUntilChanged), 7)), vkm.q.Q(this.f185012l.h(new kjk.x(18)), new jy6.l((Continuation) null, this, 28)), this.f185013m.a(), new b9k.a(4, this, x4.class, "buildBlock", "buildBlock(ZLcom/revolut/feature/transactions/impl/ui/kompot/details/block_provider/PersonalLoansBlockProvider$LoanAvailabilityModel;Lcom/revolut/feature/transactions/impl/ui/kompot/details/data_source/JuniorDataSource$YouthWalletOwner;)Ljava/util/List;", 4, 7)), new i0(24), zhm.u.c(this), "PersonalLoans");
    }

    public final jhi.b b3(dj0.d dVar, xi0.b bVar) {
        efm.r rVarW;
        List moneyList = zhm.u.c(dVar);
        ar3.c cVar = this.f185016q;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(moneyList, "moneyList");
        List list = moneyList;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((dj0.d) it8.next()).f115083b);
        }
        List listU = zhm.d0.U(arrayList);
        boolean z = bVar == null || (!listU.isEmpty() && Intrinsics.f(zhm.d0.b0(listU), bVar));
        if (listU.size() == 1 && z) {
            rVarW = efm.r.fromCallable(new a09.r(cVar, moneyList, 4));
            Intrinsics.h(rVarW);
        } else {
            rVarW = moneyList.isEmpty() ? nim.a.w(cVar.c(bVar), new aqb.s(17)) : nim.a.w(nim.a.w(pd.b.r(nim.a.w(cVar.c(bVar), new a26.j(listU, 14)), new ar3.b(cVar, 0)), new amh.j(cVar, moneyList, 26)), new ar3.b(cVar, 1));
        }
        return mo3.a.g(rd0.e.b(rVarW), null, new b4(2), 1);
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        boolean z;
        if (Intrinsics.f(str, "LOAN_BANNER_ITEM_ID")) {
            A2(zh9.u0.c(new CreditApplicationFeatureConfig.StartApplication(grl.r2.TRANSACTION_DETAILS, ft3.w.INSTANCE, null, null, null, null, 16378)));
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
