package u45;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class v implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f277232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f277233b;

    public /* synthetic */ v(Object obj2, int i) {
        this.f277232a = i;
        this.f277233b = obj2;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f277232a) {
            case 0:
                return new com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.flow.a(((w) this.f277233b).f277240a);
            case 1:
                return new com.revolut.feature.credit.loan.impl.ui.rev10.payment_settings.flow.a(((x) this.f277233b).f277246a);
            case 2:
                return new com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccounts.a(((t0) this.f277233b).f277221a);
            case 3:
                return new g85.g(((y0) this.f277233b).f277257a, new g85.h());
            case 4:
                return new n6a.g(new n6a.i(((u5a.d) this.f277233b).f277410a));
            case 5:
                u5a.i iVar = (u5a.i) this.f277233b;
                return new ea2.s(iVar.f277434a, iVar.f277435b, iVar.f277436c, iVar.d, iVar.e, iVar.f, iVar.f277437g, iVar.f277438h, iVar.i, iVar.f277439j, iVar.k, iVar.f277440l, iVar.f277441m, iVar.f277442n, iVar.o, 2);
            case 6:
                u76.a aVar = (u76.a) this.f277233b;
                return new s5d.b(aVar.f277714a, aVar.f277715b, 7);
            case 7:
                u7a.c cVar = (u7a.c) this.f277233b;
                return new s5d.b(cVar.f277724a, cVar.f277725b, 2);
            case 8:
                u7i.d dVar = (u7i.d) this.f277233b;
                return new emi.g(dVar.f277764a, dVar.f277765b, dVar.f277766c, dVar.d, dVar.e, 12);
            case 9:
                return new j8i.i(new j8i.j(), ((u7i.k) this.f277233b).f277818a);
            case 10:
                return new t6i.k(new qee.s(new t6i.g(((u7i.p) this.f277233b).f277887a)));
            case 11:
                return new u6i.e(((u7i.q) this.f277233b).f277889a, new u6i.g());
            case 12:
                u8b.c cVar2 = (u8b.c) this.f277233b;
                return new ajf.d(cVar2.f278154a, cVar2.f278155b, cVar2.f278156c, cVar2.d, cVar2.e, 20);
            case 13:
                return new com.revolut.feature.revolutpay.order_tracking.impl.ui.flow.tracking.a(((uac.i) this.f277233b).f278583a);
            case 14:
                return new com.revolut.feature.onboarding.impl.revolut_card_ready.flow.a(((uc9.a) this.f277233b).f279002a);
            case 15:
                ucb.a aVar2 = (ucb.a) this.f277233b;
                return new ax4.c(aVar2.f279017a, aVar2.f279018b, aVar2.f279019c, aVar2.d, 19);
            case 16:
                ud0.a aVar3 = (ud0.a) this.f277233b;
                return new bo9.d(aVar3.f279063a, aVar3.f279064b, aVar3.f279065c, aVar3.d, aVar3.e, aVar3.f, 14);
            case 17:
                ud0.c cVar3 = (ud0.c) this.f277233b;
                return new a2d.m(cVar3.f279068a, cVar3.f279069b, cVar3.f279070c, 28);
            case 18:
                ue3.d dVar2 = ((ue3.e) this.f277233b).f279296a;
                mk0.a aVarA = dVar2.f279292b.a();
                vc.s.j(aVarA);
                return new com.revolut.feature.category_boost.impl.ui.flow.b(new ve3.b(aVarA), new ugc.a((se3.c) dVar2.f279295h.get()));
            case 19:
                return new cf3.c((se3.c) ((ue3.d) this.f277233b).f279295h.get());
            case 20:
                return new n8j.a(((uf1.a) this.f277233b).f279501a, 14);
            case 21:
                uf1.c cVar4 = (uf1.c) this.f277233b;
                return new sf1.m(cVar4.f279520a, cVar4.f279521b, cVar4.f279522c, cVar4.d, cVar4.e, cVar4.f, cVar4.f279523g, cVar4.f279524h, cVar4.i, cVar4.f279525j, cVar4.k, cVar4.f279526l, cVar4.f279527m, cVar4.f279528n, cVar4.o, cVar4.f279529p, cVar4.f279530q, cVar4.f279531r, cVar4.f279532s, 0);
            case 22:
                uf6.f fVar = (uf6.f) this.f277233b;
                return new ee6.f(fVar.f279580a, fVar.f279581b, fVar.f279582c, fVar.d, fVar.e, fVar.f, fVar.f279583g, fVar.f279584h, fVar.i, 12);
            case 23:
                uf6.g gVar = (uf6.g) this.f277233b;
                return new bo9.d(gVar.f279586a, gVar.f279587b, gVar.f279588c, gVar.d, gVar.e, gVar.f, 15);
            case 24:
                return new com.revolut.feature.travel.miles.impl.ui.flow.flight_search_results.a(((ufg.n) this.f277233b).f279769a);
            case 25:
                return new whg.e(new whg.g(((ufg.p) this.f277233b).f279781a));
            case 26:
                ufg.q qVar = (ufg.q) this.f277233b;
                Context context = qVar.f279784b.f279710b;
                zhg.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                return new yhg.b(new yhg.c(new f01.c(context)), qVar.f279783a);
            case 27:
                jgg.i iVar2 = new jgg.i();
                ufg.g gVar2 = (ufg.g) this.f277233b;
                nyb.k kVarC = gVar2.f279712g.c();
                vc.s.j(kVarC);
                return new com.revolut.feature.travel.miles.impl.ui.flow.main.a(iVar2, kVarC, gVar2.a());
            case 28:
                ufg.a0 a0Var = (ufg.a0) this.f277233b;
                return new ygg.d(new ygg.e(a0Var.f279665b, a0Var.f279666c.f279717n.g()));
            default:
                ufg.a0 a0Var2 = (ufg.a0) this.f277233b;
                return new ygg.d(new ygg.e(a0Var2.f279665b, a0Var2.f279666c.f279717n.g()));
        }
    }
}
