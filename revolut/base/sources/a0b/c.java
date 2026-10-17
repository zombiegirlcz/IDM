package a0b;

import a2d.m;
import afj.a0;
import afj.k;
import afj.k0;
import afj.s0;
import c2d.o;
import c2d.t;
import com.revolut.feature.crypto.remittance.impl.ui.commonfields.CommonRemittanceFieldDialogContract$InputData;
import com.revolut.feature.crypto.remittance.impl.ui.commonfields.flow.CommonRemittanceFieldDialogFlowContract$InputData;
import dfj.c0;
import f96.j;
import kotlin.jvm.internal.Intrinsics;
import p5k.w;
import tyc.l;
import vc.s;
import vpk.p;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f306b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f305a = i;
        this.f306b = obj2;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f305a) {
            case 0:
                d dVar = (d) this.f306b;
                ee0.a aVar = dVar.f308b;
                je0.d objectMapper = aVar.b();
                s.j(objectMapper);
                xe0.f storageFactory = aVar.f();
                s.j(storageFactory);
                yk0.a databaseSessionProvider = dVar.f309c.b();
                s.j(databaseSessionProvider);
                i.Companion.getClass();
                Intrinsics.checkNotNullParameter(objectMapper, "objectMapper");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                return xe0.f.f(storageFactory, databaseSessionProvider, "restricted_access", objectMapper, 0, null, 56);
            case 1:
                return new e0b.i(new e0b.g(), ((e) this.f306b).f311a);
            case 2:
                return new com.revolut.feature.restricted_access.impl.ui.flow.b(((f) this.f306b).f313a, new zza.a());
            case 3:
                a1d.a aVar2 = (a1d.a) this.f306b;
                return new c1d.d(aVar2.f582a, aVar2.f583b, aVar2.f584c, aVar2.d, aVar2.e, aVar2.f, 0);
            case 4:
                return new com.revolut.feature.stock_lending.impl.ui.v2.flow.a(((a1e.e) this.f306b).f614a);
            case 5:
                a2d.f fVar = (a2d.f) this.f306b;
                xoj.a aVarA = fVar.f739a.a();
                s.j(aVarA);
                npk.a aVar3 = fVar.f740b;
                ppk.f fVarA = aVar3.a();
                p pVar = (p) aVar3.v.get();
                s.j(pVar);
                t70.b bVarG = fVar.f741c.g();
                s.j(bVarG);
                return new o(aVarA, fVarA, pVar, bVarG);
            case 6:
                a2d.g gVar = (a2d.g) this.f306b;
                return new m(gVar.f742a, gVar.f743b, gVar.f744c, 0);
            case 7:
                a2d.h hVar = (a2d.h) this.f306b;
                o76.d dVarA = hVar.f745a.a();
                npk.a aVar4 = hVar.f746b;
                ppk.f fVarA2 = aVar4.a();
                p pVar2 = (p) aVar4.v.get();
                s.j(pVar2);
                return new t(dVarA, fVarA2, pVar2, hVar.f747c.g());
            case 8:
                a2d.i iVar = (a2d.i) this.f306b;
                return new m(iVar.f748a, iVar.f749b, iVar.f750c, 1);
            case 9:
                a3d.b bVar = (a3d.b) this.f306b;
                return new c3d.d(bVar.f1094a, bVar.f1095b, 0);
            case 10:
                a3d.d dVar2 = (a3d.d) this.f306b;
                return new c3d.a(dVar2.f1097a, dVar2.f1098b, dVar2.f1099c, 0);
            case 11:
                return new a7d.a(((a4f.b) this.f306b).f1252a, 3);
            case 12:
                return new com.revolut.feature.shared.consent.prompt.builder.impl.ui.flow.a(((a7d.c) this.f306b).f1841a);
            case 13:
                j jVar = new j();
                a96.c cVar = (a96.c) this.f306b;
                b96.e eVarA = cVar.a();
                tqi.e eVarD = cVar.f.d();
                l70.e eVar = cVar.e;
                t70.g gVarO = eVar.o();
                s.j(gVarO);
                c70.a aVarZ = eVar.z();
                s.j(aVarZ);
                return new f96.i(jVar, eVarA, eVarD, gVarO, aVarZ);
            case 14:
                return new l96.f(new l96.g(), ((a96.g) this.f306b).f2352a);
            case 15:
                aab.a aVar5 = (aab.a) this.f306b;
                return new ax4.c(aVar5.f2793a, aVar5.f2794b, aVar5.f2795c, aVar5.d, 1);
            case 16:
                af2.a aVar6 = (af2.a) this.f306b;
                return new cwi.g(aVar6.f3828a, aVar6.f3829b, aVar6.f3830c, aVar6.d, aVar6.e, aVar6.f, aVar6.f3831g, aVar6.f3832h, aVar6.i, aVar6.f3833j, aVar6.k, aVar6.f3834l, aVar6.f3835m, aVar6.f3836n, aVar6.o, aVar6.f3837p, aVar6.f3838q, aVar6.f3839r, aVar6.f3840s, aVar6.f3841t, aVar6.u, aVar6.v, aVar6.f3842w, aVar6.f3843x);
            case 17:
                return new com.revolut.feature.crypto.earn.assets.shared.impl.ui.root.b(((af5.d) this.f306b).a());
            case 18:
                return new com.revolut.retail.feature.esim.impl.ui.screens.gift_recipient_selection.a(new l(new whj.b()), (c0) ((afj.b) this.f306b).f4124b1.get(), new whj.a(), new ugc.a(afj.b.b()));
            case 19:
                return new com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_selection.a(((a0) this.f306b).f4108a);
            case 20:
                return new com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_phone_number_purchase.a(((k0) this.f306b).f4309a);
            case 21:
                return new com.revolut.retail.feature.esim.impl.ui.flows.post_checkout.a(((s0) this.f306b).f4431a);
            case 22:
                aga.a aVar7 = (aga.a) this.f306b;
                return new ap3.b(aVar7.f4811a, aVar7.f4812b, aVar7.f4813c, aVar7.d, aVar7.e, aVar7.f, aVar7.f4814g, 1);
            case 23:
                return new com.revolut.feature.chooser.kompot.bridge.a(((aj3.h) this.f306b).f5387a);
            case 24:
                ak5.c cVar2 = (ak5.c) this.f306b;
                ak5.i iVar2 = cVar2.f5673b;
                jk5.m mVar = new jk5.m((sj5.b) iVar2.f5693h.get());
                CommonRemittanceFieldDialogContract$InputData commonRemittanceFieldDialogContract$InputData = cVar2.f5672a;
                c70.a aVarZ2 = iVar2.f.z();
                s.j(aVarZ2);
                sd5.b bVar2 = (sd5.b) iVar2.f5690b.k.get();
                s.j(bVar2);
                return new jk5.i(mVar, commonRemittanceFieldDialogContract$InputData, new jk5.l(aVarZ2, bVar2));
            case 25:
                ak5.d dVar3 = (ak5.d) this.f306b;
                CommonRemittanceFieldDialogFlowContract$InputData commonRemittanceFieldDialogFlowContract$InputData = dVar3.f5675a;
                sd5.b bVar3 = (sd5.b) dVar3.f5676b.f5690b.k.get();
                s.j(bVar3);
                return new com.revolut.feature.crypto.remittance.impl.ui.commonfields.flow.a(commonRemittanceFieldDialogFlowContract$InputData, new lk5.j(bVar3));
            case 26:
                an0.a aVar8 = (an0.a) this.f306b;
                return new an0.d(aVar8.f6515a, aVar8.f6516b, aVar8.f6517c, aVar8.d, aVar8.e, aVar8.f, aVar8.f6518g, aVar8.f6519h);
            case 27:
                ao1.g gVar2 = (ao1.g) this.f306b;
                return new io1.g(gVar2.f7888a, new cs1.i((w) gVar2.f7889b.f.get(), 1));
            case 28:
                ao9.a aVar9 = (ao9.a) this.f306b;
                return new bo9.d(aVar9.f7925a, aVar9.f7926b, aVar9.f7927c, aVar9.d, aVar9.e, aVar9.f, 0);
            default:
                ao9.b bVar4 = (ao9.b) this.f306b;
                return new bo9.g(bVar4.f7929a, bVar4.f7930b, bVar4.f7931c, bVar4.d, bVar4.e, bVar4.f, bVar4.f7932g, bVar4.f7933h, 0);
        }
    }

    public c(d dVar, f fVar) {
        this.f305a = 2;
        this.f306b = fVar;
    }

    public c(afj.b bVar, k kVar) {
        this.f305a = 18;
        this.f306b = bVar;
    }
}
