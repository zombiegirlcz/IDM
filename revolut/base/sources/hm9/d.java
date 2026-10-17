package hm9;

import an9.b0;
import an9.y;
import an9.z;
import android.content.Context;
import android.os.Build;
import b3j.p;
import c1g.v;
import com.revolut.feature.payees.impl.ui.payees_list.PayeesListScreenContract$InputData;
import com.revolut.feature.payees.impl.ui.payees_select.PayeesSelectScreenContract$InputData;
import com.revolut.feature.subscriptions.impl.payment_balance_picker.PaymentBalancePickerInputData;
import com.revolut.feature.transport.impl.ui.extend.ExtendTicketScreenContract$InputData;
import i9e.o;
import kl.t1;
import kotlin.jvm.internal.Intrinsics;
import m3j.n;
import vc.s;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f153554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f153555b;

    public /* synthetic */ d(Object obj2, int i) {
        this.f153554a = i;
        this.f153555b = obj2;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f153554a) {
            case 0:
                return new com.revolut.feature.payees.impl.ui.flow.a(new lm9.a(), new t1(((e) this.f153555b).f153556a));
            case 1:
                f fVar = (f) this.f153555b;
                b bVar = fVar.f153560b;
                n nVarI = ((p) bVar.f153545a).i();
                aqa.c cVarC = ((jqa.p) bVar.f153546b).c();
                s.j(cVarC);
                dl3.f fVarC = bVar.f153547c.c();
                s.j(fVarC);
                i3g.k kVar = new i3g.k(new km9.g(nVarI, cVarC, fVarC));
                PayeesListScreenContract$InputData payeesListScreenContract$InputData = fVar.f153559a;
                d3a.b bVarA = ((s3a.k) bVar.d).a();
                s.j(bVarA);
                xx9.p pVarB = bVar.e.b();
                s.j(pVarB);
                ay9.a aVarA = bVar.f.a();
                s.j(aVarA);
                f4h.a aVar = new f4h.a(((oq8.a) bVar.f153548g).b());
                n8b.a aVarA2 = bVar.f153549h.a();
                s.j(aVarA2);
                return new pm9.f(kVar, payeesListScreenContract$InputData, new im9.i(bVarA, pVarB, aVarA, aVar, aVarA2));
            case 2:
                h hVar = (h) this.f153555b;
                y yVar = new y(new an9.a(), new an9.b(hVar.b()), new b0(hVar.b()), new z(hVar.b()));
                PayeesSelectScreenContract$InputData payeesSelectScreenContract$InputData = hVar.f153565a;
                b bVar2 = hVar.f153566b;
                d3a.b bVarA2 = ((s3a.k) bVar2.d).a();
                s.j(bVarA2);
                xx9.p pVarB2 = bVar2.e.b();
                s.j(pVarB2);
                ay9.a aVarA3 = bVar2.f.a();
                s.j(aVarA3);
                f4h.a aVar2 = new f4h.a(((oq8.a) bVar2.f153548g).b());
                n8b.a aVarA4 = bVar2.f153549h.a();
                s.j(aVarA4);
                return new com.revolut.feature.payees.impl.ui.payees_select.b(yVar, payeesSelectScreenContract$InputData, new im9.i(bVarA2, pVarB2, aVarA3, aVar2, aVarA4), new f4h.a(((oq8.a) bVar2.f153548g).b()), new fmc.z(((oq8.a) bVar2.f153548g).b()));
            case 3:
                return new ym9.f(new ym9.h(), ((j) this.f153555b).f153572b);
            case 4:
                return new ym9.f(new ym9.h(), ((j) this.f153555b).f153572b);
            case 5:
                b bVar3 = ((l) this.f153555b).f153578b;
                n nVarI2 = ((p) bVar3.f153545a).i();
                aqa.c cVarC2 = ((jqa.p) bVar3.f153546b).c();
                s.j(cVarC2);
                dl3.f fVarC2 = bVar3.f153547c.c();
                s.j(fVarC2);
                wm9.m mVar = new wm9.m(new km9.g(nVarI2, cVarC2, fVarC2));
                d3a.b bVarA3 = ((s3a.k) bVar3.d).a();
                s.j(bVarA3);
                xx9.p pVarB3 = bVar3.e.b();
                s.j(pVarB3);
                ay9.a aVarA5 = bVar3.f.a();
                s.j(aVarA5);
                f4h.a aVar3 = new f4h.a(((oq8.a) bVar3.f153548g).b());
                n8b.a aVarA6 = bVar3.f153549h.a();
                s.j(aVarA6);
                return new com.revolut.feature.payees.impl.ui.payees_overview.personal.a(mVar, new im9.i(bVarA3, pVarB3, aVarA5, aVar3, aVarA6), new lm9.a());
            case 6:
                b bVar4 = ((l) this.f153555b).f153578b;
                n nVarI3 = ((p) bVar4.f153545a).i();
                aqa.c cVarC3 = ((jqa.p) bVar4.f153546b).c();
                s.j(cVarC3);
                dl3.f fVarC3 = bVar4.f153547c.c();
                s.j(fVarC3);
                wm9.m mVar2 = new wm9.m(new km9.g(nVarI3, cVarC3, fVarC3));
                d3a.b bVarA4 = ((s3a.k) bVar4.d).a();
                s.j(bVarA4);
                xx9.p pVarB4 = bVar4.e.b();
                s.j(pVarB4);
                ay9.a aVarA7 = bVar4.f.a();
                s.j(aVarA7);
                f4h.a aVar4 = new f4h.a(((oq8.a) bVar4.f153548g).b());
                n8b.a aVarA8 = bVar4.f153549h.a();
                s.j(aVarA8);
                return new com.revolut.feature.payees.impl.ui.payees_overview.personal.a(mVar2, new im9.i(bVarA4, pVarB4, aVarA7, aVar4, aVarA8), new lm9.a());
            case 7:
                m mVar3 = (m) this.f153555b;
                return new deh.c(mVar3.f153580a, mVar3.f153581b, mVar3.f153582c, mVar3.d, mVar3.e, mVar3.f, mVar3.f153583g, mVar3.f153584h, mVar3.i, 4);
            case 8:
                hok.a aVar5 = (hok.a) this.f153555b;
                return new bo9.d(aVar5.f154347a, aVar5.f154348b, aVar5.f154349c, aVar5.d, aVar5.e, aVar5.f, 8);
            case 9:
                return new a7d.a(((hp.d) this.f153555b).f154358a, 13);
            case 10:
                htc.d dVar = (htc.d) this.f153555b;
                return new com.revolut.feature.second_device_login.impl.ui.flow.a(dVar.f155352a, dVar.b());
            case 11:
                hvf.g gVar = (hvf.g) this.f153555b;
                ouf.a aVarA9 = ((hvf.b) gVar.f155904b.f155941a).a();
                s.j(aVarA9);
                ivf.e eVar = new ivf.e(aVarA9);
                ExtendTicketScreenContract$InputData extendTicketScreenContract$InputData = gVar.f155903a;
                nvf.a componentsMapper = new nvf.a();
                Intrinsics.checkNotNullParameter(componentsMapper, "componentsMapper");
                return new vvf.k(eVar, extendTicketScreenContract$InputData, new vvf.l());
            case 12:
                return new com.revolut.feature.transport.impl.ui.a(((hvf.m) this.f153555b).f155930a);
            case 13:
                quf.b bVar5 = (quf.b) ((hvf.b) ((hvf.z) this.f153555b).f155987a).k.get();
                s.j(bVar5);
                return new v(bVar5);
            case 14:
                return new com.revolut.feature.referrals.code.impl.referral_code.flow.a(((hwa.c) this.f153555b).f156116a);
            case 15:
                hwh.b bVar6 = (hwh.b) this.f153555b;
                return new ajf.d(bVar6.f156182a, bVar6.f156183b, bVar6.f156184c, bVar6.d, bVar6.e, 8);
            case 16:
                hwh.c cVar = (hwh.c) this.f153555b;
                return new ajf.d(cVar.f156185a, cVar.f156186b, cVar.f156187c, cVar.d, cVar.e, 9);
            case 17:
                hwj.a aVar6 = (hwj.a) this.f153555b;
                s70.a aVarM = aVar6.f156278g.m();
                s.j(aVarM);
                iwj.a aVar7 = (iwj.a) aVar6.f156280j.get();
                w39.b bVarA5 = aVar6.f156277c.a();
                s.j(bVarA5);
                return new com.revolut.retail.feature.impl.userauth.location_enforce.ui.flow.b(aVarM, aVar7, bVarA5);
            case 18:
                hx.a aVar8 = (hx.a) this.f153555b;
                return new gx.a(aVar8.f156293a, aVar8.f156294b, aVar8.f156295c, aVar8.d, 0);
            case 19:
                i39.c cVar2 = (i39.c) this.f153555b;
                return new i39.d(cVar2.f158133a, cVar2.f158134b, cVar2.f158135c, cVar2.d, cVar2.e, cVar2.f, cVar2.f158136g, cVar2.f158137h, cVar2.i, cVar2.f158138j, cVar2.k, cVar2.f158139l, cVar2.f158140m, cVar2.f158141n, cVar2.o, cVar2.f158142p, cVar2.f158143q, cVar2.f158144r, cVar2.f158145s, cVar2.f158146t, cVar2.u, cVar2.v);
            case 20:
                return new a7d.a(((i3d.a) this.f153555b).f158165a, 21);
            case 21:
                Context context = ((i5l.a) this.f153555b).f158849a;
                i5l.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                int i = Build.VERSION.SDK_INT;
                Intrinsics.checkNotNullParameter(context, "context");
                return i >= 35 ? new f5l.h(context) : f5l.i.f132370a;
            case 22:
                return new g82.g(((i72.m) this.f153555b).f159128j.e());
            case 23:
                i73.b bVar7 = (i73.b) this.f153555b;
                return new a16.b(bVar7.f159184a, bVar7.f159185b, 6);
            case 24:
                i78.a aVar9 = (i78.a) this.f153555b;
                return new ax4.c(aVar9.f159193a, aVar9.f159194b, aVar9.f159195c, aVar9.d, 10);
            case 25:
                return new com.revolut.feature.subscriptions.impl.block_card_subscription.a(((i9e.h) this.f153555b).f159678a);
            case 26:
                o oVar = (o) this.f153555b;
                Context context2 = oVar.f159713r;
                mae.p factory = oVar.f159704c.e();
                s.j(factory);
                t70.b currenciesLocalization = oVar.e.g();
                s.j(currenciesLocalization);
                zae.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(context2, "context");
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
                return factory.b(new f01.c(context2));
            case 27:
                i9e.p pVar = (i9e.p) this.f153555b;
                vae.c cVar3 = new vae.c();
                o oVar2 = pVar.f159720b;
                sae.n nVar = new sae.n(cVar3, new vae.d(oVar2.f159712q.f(), new vae.a(), new vae.g()), new vae.e());
                m2j.j jVarC = oVar2.f159712q.c();
                uae.g gVar2 = new uae.g(pVar.f159719a);
                wsg.n nVarB = oVar2.f159711p.b();
                uae.b bVar8 = new uae.b();
                PaymentBalancePickerInputData paymentBalancePickerInputData = pVar.f159719a;
                xua.a aVarA10 = oVar2.f159703b.a();
                s.j(aVarA10);
                return new com.revolut.feature.subscriptions.impl.payment_balance_picker.b(nVar, new uae.e(jVarC, gVar2, nVarB, bVar8, paymentBalancePickerInputData, aVarA10, new uae.h()), new com.revolut.feature.subscriptions.impl.payment_balance_picker.a(), new uae.h());
            case 28:
                return new a7d.a(((id6.a) this.f153555b).f160430a, 16);
            default:
                id9.a aVar10 = (id9.a) this.f153555b;
                return new bo9.d(aVar10.f160448a, aVar10.f160449b, aVar10.f160450c, aVar10.d, aVar10.e, aVar10.f, 5);
        }
    }
}
