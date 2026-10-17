package a7j;

import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.MoneyDetails;
import efm.d0;
import et6.h1;
import kotlin.jvm.internal.Intrinsics;
import rea.m;
import wsg.n;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f1928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h1 f1929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f1930c;

    public j(m pocketDetailsInteractor, h1 freelancerInteractor, n walletInteractor) {
        Intrinsics.checkNotNullParameter(pocketDetailsInteractor, "pocketDetailsInteractor");
        Intrinsics.checkNotNullParameter(freelancerInteractor, "freelancerInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f1928a = pocketDetailsInteractor;
        this.f1929b = freelancerInteractor;
        this.f1930c = walletInteractor;
    }

    public static dj0.d b(MoneyDetails moneyDetails) {
        Long l2 = moneyDetails.f99904b;
        return new dj0.d(l2 != null ? l2.longValue() : 0L, moneyDetails.f99903a);
    }

    @Override // a7j.e
    public final d0 a(ExchangeOrderDraft draft) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        wd6.e eVar = draft.f99887c;
        MoneyDetails moneyDetails = draft.f99885a;
        MoneyDetails moneyDetails2 = draft.f99886b;
        i iVar = eVar == wd6.e.BUY ? new i(b(moneyDetails2), b(moneyDetails), eVar, moneyDetails2.f) : new i(b(moneyDetails), b(moneyDetails2), eVar, moneyDetails.f);
        d0 d0VarK = foh.i.k(this.f1930c, iVar.d, iVar.f1925a.f115083b, io3.l.MERCHANT);
        a6b.a aVar = new a6b.a(new a5g.h(23), 10);
        d0VarK.getClass();
        ufm.i iVar2 = new ufm.i(d0VarK, aVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        ufm.i iVar3 = new ufm.i(ue0.e.I(iVar2, h0.f322473a, new a5g.h(24)), new a6b.a(new h(this, iVar, 0), 11), 0);
        Intrinsics.checkNotNullExpressionValue(iVar3, "flatMap(...)");
        return iVar3;
    }
}
