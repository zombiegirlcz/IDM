package r8h;

import a35.m;
import a6e.w;
import anb.c0;
import android.content.Context;
import com.google.common.collect.ImmutableMap;
import com.revolut.feature.credit.models.CreditAccountType;
import com.revolut.feature.passcode_reminder.impl.network.PasscodeReminderService;
import com.revolut.feature.retail.savings.impl.creation.presentation.info.tiered_limits.TieredLimitsInfoScreenContract$InputData;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import com.revolut.feature.tab.accounts.models.ProductId;
import d78.x;
import djb.q;
import ffk.t;
import hn0.n;
import i25.h;
import i72.i;
import kotlin.jvm.internal.Intrinsics;
import om4.n4;
import r10.r;
import r6e.a0;
import rmb.l;
import rw4.k;
import sc5.f;
import sri.o;
import vc.s;
import vmb.g;
import xf6.q1;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f252428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f252429b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f252428a = i;
        this.f252429b = obj2;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f252428a) {
            case 0:
                b bVar = (b) this.f252429b;
                return new c0(bVar.f252430a, bVar.f252431b, bVar.f252432c, bVar.d, 25);
            case 1:
                return new f(((rc5.a) this.f252429b).f253195a, new sc5.e());
            case 2:
                return new wc5.e(((rc5.d) this.f252429b).f253205a, new wc5.d());
            case 3:
                rc5.e eVar = (rc5.e) this.f252429b;
                yc5.b bVar2 = eVar.f253207a;
                rc5.b bVar3 = eVar.f253208b;
                aud.a aVar = (aud.a) bVar3.f253197a.B.get();
                s.j(aVar);
                gte.a aVarB = bVar3.f253198b.b();
                s.j(aVarB);
                return new yc5.f(bVar2, new yc5.e(aVar, aVarB));
            case 4:
                re9.a aVar2 = (re9.a) this.f252429b;
                an0.c cVar = aVar2.f253549b;
                cn0.c cVar2 = (cn0.c) cVar.A.get();
                s.j(cVar2);
                n nVarH = cVar.h();
                s.j(nVarH);
                oe9.a aVar3 = (oe9.a) aVar2.e.i.get();
                s.j(aVar3);
                ue0.c cVar3 = (ue0.c) aVar2.i.get();
                l80.e eVarH = aVar2.f253550c.h();
                s.j(eVarH);
                nj0.d dVar = (nj0.d) aVar2.f;
                ik0.b retrofitFactory = dVar.m();
                s.j(retrofitFactory);
                ek.a converterFactory = dVar.d();
                re9.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(PasscodeReminderService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                PasscodeReminderService passcodeReminderService = (PasscodeReminderService) objCreate;
                s.k(passcodeReminderService);
                return new com.revolut.feature.passcode_reminder.impl.ui.flow.b(cVar2, nVarH, aVar3, new ue9.c(cVar3, eVarH, passcodeReminderService), (se9.d) aVar2.f253553j.get());
            case 5:
                rh7.a aVar4 = (rh7.a) this.f252429b;
                return new m41.e(aVar4.f254310a, aVar4.f254311b, aVar4.f254312c, aVar4.d, aVar4.e, aVar4.f, aVar4.f254313g, aVar4.f254314h, aVar4.i, aVar4.f254315j, aVar4.k, 4);
            case 6:
                rhe.n nVar = (rhe.n) this.f252429b;
                ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(10);
                ProductId productId = ProductId.CURRENCY;
                pfe.f fVar = (pfe.f) ((yy5.b) nVar.f254435a).F.get();
                s.j(fVar);
                builderBuilderWithExpectedSize.put(productId, fVar);
                ProductId productId2 = ProductId.JOINT;
                q38.b bVar4 = (q38.b) nVar.f254436b;
                pfe.f fVar2 = (pfe.f) bVar4.K.get();
                s.j(fVar2);
                builderBuilderWithExpectedSize.put(productId2, fVar2);
                ProductId productId3 = ProductId.PRO;
                pfe.f fVar3 = (pfe.f) ((yha.a) nVar.f254437c).B.get();
                s.j(fVar3);
                builderBuilderWithExpectedSize.put(productId3, fVar3);
                ProductId productId4 = ProductId.SUBACCOUNT;
                c6e.a aVar5 = (c6e.a) nVar.d;
                ImmutableMap.Builder builderBuilderWithExpectedSize2 = ImmutableMap.builderWithExpectedSize(8);
                a0 a0Var = aVar5.i;
                g6e.f subaccountTransactionInteractor = a0Var.d();
                s.j(subaccountTransactionInteractor);
                c6e.c cVar4 = c6e.d.Companion;
                cVar4.getClass();
                Intrinsics.checkNotNullParameter(subaccountTransactionInteractor, "subaccountTransactionInteractor");
                builderBuilderWithExpectedSize2.put("PersonalSubaccountType", new x(subaccountTransactionInteractor, SubaccountType.Personal.f88963a));
                g6e.f subaccountTransactionInteractor2 = a0Var.d();
                s.j(subaccountTransactionInteractor2);
                cVar4.getClass();
                Intrinsics.checkNotNullParameter(subaccountTransactionInteractor2, "subaccountTransactionInteractor");
                builderBuilderWithExpectedSize2.put("GroupSubaccountType", new x(subaccountTransactionInteractor2, SubaccountType.Group.f88960a));
                g6e.f subaccountTransactionInteractor3 = a0Var.d();
                s.j(subaccountTransactionInteractor3);
                cVar4.getClass();
                Intrinsics.checkNotNullParameter(subaccountTransactionInteractor3, "subaccountTransactionInteractor");
                builderBuilderWithExpectedSize2.put("JuniorSubaccountType", new x(subaccountTransactionInteractor3, SubaccountType.Junior.f88962a));
                g6e.f subaccountTransactionInteractor4 = a0Var.d();
                s.j(subaccountTransactionInteractor4);
                cVar4.getClass();
                Intrinsics.checkNotNullParameter(subaccountTransactionInteractor4, "subaccountTransactionInteractor");
                builderBuilderWithExpectedSize2.put("TeenSubaccountType", new x(subaccountTransactionInteractor4, SubaccountType.Teen.f88966a));
                g6e.f subaccountTransactionInteractor5 = a0Var.d();
                s.j(subaccountTransactionInteractor5);
                cVar4.getClass();
                Intrinsics.checkNotNullParameter(subaccountTransactionInteractor5, "subaccountTransactionInteractor");
                builderBuilderWithExpectedSize2.put("ProSubaccountType", new x(subaccountTransactionInteractor5, SubaccountType.Pro.f88964a));
                g6e.f subaccountTransactionInteractor6 = a0Var.d();
                s.j(subaccountTransactionInteractor6);
                cVar4.getClass();
                Intrinsics.checkNotNullParameter(subaccountTransactionInteractor6, "subaccountTransactionInteractor");
                builderBuilderWithExpectedSize2.put("ProTaxSubaccountType", new x(subaccountTransactionInteractor6, SubaccountType.ProTax.f88965a));
                builderBuilderWithExpectedSize2.put("CollateralSubaccountType", new h());
                pfe.f fVar4 = (pfe.f) aVar5.f21777a.P.get();
                s.j(fVar4);
                builderBuilderWithExpectedSize2.put("JointSubaccountType", fVar4);
                builderBuilderWithExpectedSize.put(productId4, new w(builderBuilderWithExpectedSize2.build()));
                ProductId productId5 = ProductId.LINKED;
                pfe.f fVar5 = (pfe.f) ((q1) nVar.e).f305007n.get();
                s.j(fVar5);
                builderBuilderWithExpectedSize.put(productId5, fVar5);
                ProductId productId6 = ProductId.YOUTH;
                pfe.f fVar6 = (pfe.f) ((k78.b) nVar.f).f181854b0.get();
                s.j(fVar6);
                builderBuilderWithExpectedSize.put(productId6, fVar6);
                ProductId productId7 = ProductId.CREDIT;
                al4.n nVarS = ((t15.d) nVar.f254438g).f267158b.s();
                s.j(nVarS);
                builderBuilderWithExpectedSize.put(productId7, new m(ImmutableMap.of(CreditAccountType.CreditCard.class, new k25.w(nVarS))));
                ProductId productId8 = ProductId.SAVINGS;
                fob.a aVar6 = (fob.a) nVar.f254439h;
                anb.s sVar = aVar6.f136884a;
                q qVarC = sVar.c();
                s.j(qVarC);
                djb.n nVarA = sVar.a();
                s.j(nVarA);
                builderBuilderWithExpectedSize.put(productId8, new dob.h(qVarC, nVarA, aVar6.d.c()));
                ProductId productId9 = ProductId.ON_HOLD;
                x79.a aVarA = ((c89.a) nVar.i).f22141a.a();
                s.j(aVarA);
                builderBuilderWithExpectedSize.put(productId9, new eia.a(aVarA));
                ProductId productId10 = ProductId.BEREAVEMENT;
                pfe.f fVar7 = (pfe.f) bVar4.L.get();
                s.j(fVar7);
                builderBuilderWithExpectedSize.put(productId10, fVar7);
                ImmutableMap immutableMapBuild = builderBuilderWithExpectedSize.build();
                mhf.b bVarB = ((bjf.a) nVar.f254440j).b();
                s.j(bVarB);
                return new rhe.m(immutableMapBuild, bVarB, nVar.k.i());
            case 7:
                rja.a aVar7 = (rja.a) this.f252429b;
                return new deh.c(aVar7.f254643a, aVar7.f254644b, aVar7.f254645c, aVar7.d, aVar7.e, aVar7.f, aVar7.f254646g, aVar7.f254647h, aVar7.i, 6);
            case 8:
                rk0.d dVar2 = (rk0.d) this.f252429b;
                return new bo9.d(dVar2.f254717a, dVar2.f254718b, dVar2.f254719c, dVar2.d, dVar2.e, dVar2.f, 12);
            case 9:
                rkc.a aVar8 = (rkc.a) this.f252429b;
                return new c3d.a(aVar8.f254790a, aVar8.f254791b, aVar8.f254792c, 19);
            case 10:
                rl9.a aVar9 = (rl9.a) this.f252429b;
                return new qga.c(aVar9.f254934a, aVar9.f254935b, aVar9.f254936c, aVar9.d, aVar9.e, aVar9.f, aVar9.f254937g, aVar9.f254938h, aVar9.i, aVar9.f254939j, 1);
            case 11:
                rlb.e eVar2 = (rlb.e) this.f252429b;
                tib.b bVar5 = eVar2.f254970a;
                ijb.a aVarG = ((blb.e) bVar5).g();
                s.j(aVarG);
                wsg.n nVarB = eVar2.f254976l.b();
                efk.a aVar10 = eVar2.f254971b;
                t tVarF = aVar10.f();
                s.j(tVarF);
                fkg.a aVar11 = new fkg.a((eqb.b) ((blb.e) bVar5).f16515t.get());
                r rVarH = ((blb.e) bVar5).h();
                wli.x xVarD = ((s41.a) eVar2.i).d();
                sfk.a aVarE = aVar10.e();
                s.j(aVarE);
                return new rmb.q(aVarG, nVarB, tVarF, aVar11, rVarH, xVarD, aVarE, new l(new dcd.b(), new hqb.a()));
            case 12:
                TieredLimitsInfoScreenContract$InputData tieredLimitsInfoScreenContract$InputData = ((rlb.l) this.f252429b).f255007a;
                dcd.b formatter = new dcd.b();
                wmb.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(formatter, "formatter");
                return new vmb.e(tieredLimitsInfoScreenContract$InputData, new g(new plb.h(formatter)));
            case 13:
                j5c.a aVarA2 = ((rs5.c) this.f252429b).f256975n.a();
                s.j(aVarA2);
                return new js5.e(aVarA2);
            case 14:
                rs5.f fVar8 = (rs5.f) this.f252429b;
                return new i(fVar8.f257000a, fVar8.f257001b, fVar8.f257002c, fVar8.d, fVar8.e, fVar8.f, fVar8.f257003g, fVar8.f257004h, fVar8.i, fVar8.f257005j, fVar8.k, fVar8.f257006l, fVar8.f257007m, fVar8.f257008n, fVar8.o, fVar8.f257009p, fVar8.f257010q, fVar8.f257011r, fVar8.f257012s, fVar8.f257013t, fVar8.u, fVar8.v, fVar8.f257014w, fVar8.f257015x, fVar8.f257016y, fVar8.z, fVar8.A, fVar8.B, fVar8.C, fVar8.D);
            case 15:
                Context context = ((rsb.c) this.f252429b).f257045a;
                ssb.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                return new qsb.a(o.c(context, null, null, 14));
            case 16:
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) ((rtj.i) this.f252429b).f257293b.get();
                juj.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return new c90.c(controller.m2());
            case 17:
                rw.a aVar12 = (rw.a) this.f252429b;
                return new a16.b(aVar12.f257790a, aVar12.f257791b, 18);
            case 18:
                rw4.l lVar = (rw4.l) this.f252429b;
                jm4.r rVar = lVar.f257835a;
                al4.n nVarS2 = rVar.s();
                s.j(nVarS2);
                n4 n4Var = (n4) rVar.D.get();
                s.j(n4Var);
                return new k(nVarS2, n4Var, new rw4.o(), new rw4.n(), lVar.f257836b.a());
            case 19:
                return new j4a.d(new ac4.g(((s3a.a) this.f252429b).f259482a, new com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.a()));
            case 20:
                return new com.revolut.feature.payments.who_to_transfer.impl.onboarding_contact_sync.flow.a(((s3a.d) this.f252429b).f259501a);
            case 21:
                s41.b bVar6 = (s41.b) this.f252429b;
                return new a16.b(bVar6.f259713a, bVar6.f259714b, 17);
            case 22:
                s9l.a aVar13 = (s9l.a) this.f252429b;
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) aVar13.f261198a).c();
                s.j(aVarC);
                nhf.a aVarA3 = aVar13.f261199b.a();
                s.j(aVarA3);
                t70.g gVarO = aVar13.f261200c.o();
                s.j(gVarO);
                return new t9l.g(aVarC, aVarA3, gVarO);
            case 23:
                se7.a aVar14 = (se7.a) this.f252429b;
                return new ajf.d(aVar14.f262141a, aVar14.f262142b, aVar14.f262143c, aVar14.d, aVar14.e, 19);
            case 24:
                sg5.c cVar5 = (sg5.c) this.f252429b;
                return new m41.e(cVar5.f262588a, cVar5.f262589b, cVar5.f262590c, cVar5.d, cVar5.e, cVar5.f, cVar5.f262591g, cVar5.f262592h, cVar5.i, cVar5.f262593j, cVar5.k, 3);
            case 25:
                return new com.revolut.feature.apm.bills.boleto.impl.finder.flow.a(((sm1.g) this.f252429b).f264324a);
            case 26:
                return new com.revolut.feature.apm.bills.boleto.impl.flow.a(((sm1.i) this.f252429b).f264329a);
            case 27:
                return new n8j.a(((ssc.b) this.f252429b).f265365a, 18);
            case 28:
                t06.a aVar15 = (t06.a) this.f252429b;
                return new ap3.b(aVar15.f266942a, aVar15.f266943b, aVar15.f266944c, aVar15.d, aVar15.e, aVar15.f, aVar15.f266945g, 11);
            default:
                return new m0b.d(new m0b.g(((t0b.n) this.f252429b).f266987a));
        }
    }

    public a(rlb.e eVar, rlb.k kVar) {
        this.f252428a = 11;
        this.f252429b = eVar;
    }
}
