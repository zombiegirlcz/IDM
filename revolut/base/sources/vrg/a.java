package vrg;

import a1e.h;
import com.revolut.feature.masav.impl.ui.payment_authorisation.confirmation.MasavPayToMerchantConfirmationScreenContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.portfolio_actions.ManagedPortfolioDetailsActionsScreenContract$InputData;
import cz9.i;
import cz9.k;
import e4m.e;
import e69.u;
import e69.w;
import emi.g;
import fdk.j;
import h8f.l;
import kotlin.jvm.internal.Intrinsics;
import lz1.m;
import n2c.f;
import vc.s;
import vtc.t;
import vxc.c;
import vy9.d;
import w5f.e0;
import w5f.f0;
import w5f.v;
import w5f.y;
import wtc.g0;
import xvc.n;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f291592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f291593b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f291592a = i;
        this.f291593b = obj2;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f291592a) {
            case 0:
                b bVar = (b) this.f291593b;
                return new a16.b(bVar.f291594a, bVar.f291595b, 21);
            case 1:
                n nVar = new n();
                t tVar = (t) this.f291593b;
                g0 g0VarD = tVar.f292068j.d();
                gte.a aVarB = tVar.k.b();
                s.j(aVarB);
                return new com.revolut.feature.security_hub.impl.ui.street_mode.trusted_locations_list.a(nVar, g0VarD, aVarB);
            case 2:
                vuj.a aVar = (vuj.a) this.f291593b;
                return new j(aVar.f292396a, aVar.f292397b, aVar.f292398c, aVar.d, aVar.e, aVar.f, aVar.f292399g, aVar.f292400h, aVar.i, aVar.f292401j, aVar.k, aVar.f292402l, aVar.f292403m, 3);
            case 3:
                return new com.revolut.feature.selfserve.entity.config.shared.flow.a(((c) this.f291593b).f293057a);
            case 4:
                vxl.b bVar2 = (vxl.b) this.f291593b;
                return new g(bVar2.f293103a, bVar2.f293104b, bVar2.f293105c, bVar2.d, bVar2.e, 14);
            case 5:
                return new com.revolut.feature.payments.send_from_clipboard.impl.flow.a(((d) this.f291593b).f293279a);
            case 6:
                vy9.e eVar = (vy9.e) this.f291593b;
                ez9.b vendorStateMapper = new ez9.b();
                ez9.a keyTypeStateMapper = new ez9.a();
                Intrinsics.checkNotNullParameter(vendorStateMapper, "vendorStateMapper");
                Intrinsics.checkNotNullParameter(keyTypeStateMapper, "keyTypeStateMapper");
                return new i(new k(), eVar.f293282a);
            case 7:
                return new add.b(((w09.a) this.f291593b).f293669a, 15);
            case 8:
                return new b2c.b(new b2c.c(((w1c.b) this.f291593b).f293822a, new b2c.d()));
            case 9:
                f fVar = new f();
                w1c.a aVar2 = (w1c.a) this.f291593b;
                rul.e eVarA = aVar2.d.a();
                nyb.k kVarC = aVar2.f293820g.c();
                s.j(kVarC);
                return new n2c.d(fVar, eVarA, kVarC);
            case 10:
                w1l.a aVar3 = (w1l.a) this.f291593b;
                return new h(aVar3.f293882a, aVar3.f293883b, aVar3.f293884c, aVar3.d, aVar3.e, aVar3.f, aVar3.f293885g, aVar3.f293886h, aVar3.i, aVar3.f293887j, aVar3.k, 3);
            case 11:
                w3l.a aVar4 = (w3l.a) this.f291593b;
                return new a16.b(aVar4.f294427a, aVar4.f294428b, 22);
            case 12:
                w41.c cVar = (w41.c) this.f291593b;
                return new k51.e(cVar.f294468a, cVar.f294469b, cVar.f294470c, cVar.d, cVar.e, cVar.f, cVar.f294471g, cVar.f294472h, cVar.i, cVar.f294473j, cVar.k, cVar.f294474l, cVar.f294475m, cVar.f294476n, cVar.o, cVar.f294477p, cVar.f294478q, cVar.f294479r, cVar.f294480s, cVar.f294481t, cVar.u, cVar.v, cVar.f294482w, cVar.f294483x, cVar.f294484y, cVar.z, cVar.A, cVar.B);
            case 13:
                w4c.a aVar5 = (w4c.a) this.f291593b;
                return new c1d.d(aVar5.f294531a, aVar5.f294532b, aVar5.f294533c, aVar5.d, aVar5.e, aVar5.f, 12);
            case 14:
                gte.a aVarB2 = ((w59.a) this.f291593b).f294729a.b();
                s.j(aVarB2);
                return new t59.a(aVarB2);
            case 15:
                w59.d dVar = (w59.d) this.f291593b;
                zja.a aVarA = ((ika.b) dVar.f294739b).a();
                s.j(aVarA);
                return new com.revolut.feature.masav.impl.ui.c(aVarA, dVar.f294740c.f());
            case 16:
                w59.e eVar2 = (w59.e) this.f291593b;
                MasavPayToMerchantConfirmationScreenContract$InputData masavPayToMerchantConfirmationScreenContract$InputData = eVar2.f294744a;
                w59.d dVar2 = eVar2.f294745b;
                oz1.j jVarG = ((m) dVar2.e).g();
                wsg.b bVarA = dVar2.f.a();
                x02.a aVarH = dVar2.f294741g.h();
                s.j(aVarH);
                l80.e eVarH = dVar2.d.h();
                s.j(eVarH);
                return new u(new g69.d(masavPayToMerchantConfirmationScreenContract$InputData, jVarG, bVarA, aVarH, eVarH), new w(new h69.a(), new h69.b()));
            case 17:
                return new com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.flow.a(((w5f.a) this.f291593b).f295108a);
            case 18:
                ManagedPortfolioDetailsActionsScreenContract$InputData managedPortfolioDetailsActionsScreenContract$InputData = ((w5f.d) this.f291593b).f295128a;
                boc.b actionUIResourcesMapper = new boc.b();
                Intrinsics.checkNotNullParameter(actionUIResourcesMapper, "actionUIResourcesMapper");
                return new f7f.f(managedPortfolioDetailsActionsScreenContract$InputData, new f7f.g());
            case 19:
                return new u6f.g(((w5f.g) this.f291593b).f295175a, new u6f.h());
            case 20:
                return new com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.flow.a(((w5f.j) this.f291593b).f295182a);
            case 21:
                return new com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.flow.a(((w5f.s) this.f291593b).f295233a);
            case 22:
                return new l(((v) this.f291593b).f295244a, new h8f.m());
            case 23:
                return new n6f.k(((y) this.f291593b).f295251a, new n6f.j());
            case 24:
                e0 e0Var = (e0) this.f291593b;
                return new y7f.e(e0Var.f295136b, new qee.s(new twg.c(new a8f.f(e0Var.b()), new a8f.e(e0Var.b()), new a8f.a(e0Var.b()), new a8f.d(e0Var.b()))));
            case 25:
                e0 e0Var2 = (e0) this.f291593b;
                return new y7f.e(e0Var2.f295136b, new qee.s(new twg.c(new a8f.f(e0Var2.b()), new a8f.e(e0Var2.b()), new a8f.a(e0Var2.b()), new a8f.d(e0Var2.b()))));
            case 26:
                f0 f0Var = (f0) this.f291593b;
                return new ao1.a(f0Var.f295162a, f0Var.f295163b, f0Var.f295164c, f0Var.d, f0Var.e, f0Var.f, f0Var.f295165g, f0Var.f295166h, f0Var.i, f0Var.f295167j, f0Var.k, f0Var.f295168l, f0Var.f295169m, f0Var.f295170n, f0Var.o, f0Var.f295171p, f0Var.f295172q, f0Var.f295173r, 1);
            case 27:
                w6l.a aVar6 = (w6l.a) this.f291593b;
                return new deh.c(aVar6.f295448a, aVar6.f295449b, aVar6.f295450c, aVar6.d, aVar6.e, aVar6.f, aVar6.f295451g, aVar6.f295452h, aVar6.i, 9);
            case 28:
                w7i.b bVar3 = (w7i.b) this.f291593b;
                return new afh.f(bVar3.f295550a, bVar3.f295551b, bVar3.f295552c, bVar3.d, bVar3.e, bVar3.f, bVar3.f295553g, bVar3.f295554h, 5);
            default:
                return new com.revolut.retail.feature.pending_payments.impl.ui.bottom_sheet.a(((wak.b) this.f291593b).f295951a, new xak.a());
        }
    }
}
