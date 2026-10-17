package a7j;

import a08.o;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.MoneyDetails;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import rea.m;
import wsg.n;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k61.a f1917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f1918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f1919c;

    public d(k61.a transferInteractor, m pocketDetailsInteractor, n walletInteractor) {
        Intrinsics.checkNotNullParameter(transferInteractor, "transferInteractor");
        Intrinsics.checkNotNullParameter(pocketDetailsInteractor, "pocketDetailsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f1917a = transferInteractor;
        this.f1918b = pocketDetailsInteractor;
        this.f1919c = walletInteractor;
    }

    public static dj0.d b(MoneyDetails moneyDetails) {
        Long l2 = moneyDetails.f99904b;
        return new dj0.d(l2 != null ? l2.longValue() : 0L, moneyDetails.f99903a);
    }

    @Override // a7j.e
    public final d0 a(ExchangeOrderDraft draft) {
        a aVar;
        Intrinsics.checkNotNullParameter(draft, "draft");
        Long l2 = draft.i;
        i7j.j jVar = draft.f;
        MoneyDetails moneyDetails = draft.f99885a;
        MoneyDetails moneyDetails2 = draft.f99886b;
        if (l2 == null) {
            throw new IllegalArgumentException("timestamp should be specified");
        }
        long jLongValue = l2.longValue();
        if (draft.f99887c == wd6.e.BUY) {
            aVar = new a(b(moneyDetails2), moneyDetails2.f, b(moneyDetails), jVar == i7j.j.TOP ? b.TO : b.FROM, jLongValue, draft.f99887c);
        } else {
            aVar = new a(b(moneyDetails), moneyDetails.f, b(moneyDetails2), jVar == i7j.j.TOP ? b.FROM : b.TO, jLongValue, draft.f99887c);
        }
        d0 d0VarK = foh.i.k(this.f1919c, aVar.f1914b, aVar.f1913a.f115083b, io3.l.CURRENT);
        a6b.a aVar2 = new a6b.a(new a5g.h(20), 6);
        d0VarK.getClass();
        ufm.i iVar = new ufm.i(d0VarK, aVar2, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        ufm.i iVar2 = new ufm.i(ue0.e.I(iVar, h0.f322473a, new a5g.h(21)), new a6b.a(new o(this, aVar, 13), 7), 0);
        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
        return iVar2;
    }
}
