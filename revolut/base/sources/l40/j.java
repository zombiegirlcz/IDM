package l40;

import com.meshconnect.link.LinkEventsKt;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.bills.bpay.impl.screen.input.model.BPayBill;
import com.revolut.feature.apm.core.models.transfers.ApmPaymentProfile;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.choose_instalments.CreditCardChooseInstalmentsScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement.details.page.CreditCardStatementPageScreenContract$InputData;
import com.revolut.feature.junior.isa.impl.R$string;
import com.revolut.feature.shared.savings.models.product.SavingsDocument;
import com.revolut.feature.transport.impl.ui.hub.transit_section.TransitSectionScreenContract$InputData;
import com.revolut.feature.transport.models.TransportLocation;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.kompot.common.StackDestination;
import com.revolut.retail.feature.commodity.asset_details.api.navigation.CommodityAssetDetailsDestination;
import dp4.c0;
import efm.d0;
import ft3.h1;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.a0;
import kp0.w0;
import lv4.b0;
import m1c.n0;
import mh4.x;
import mh4.y;
import mic.g0;
import nii.y0;
import nii.z;
import om4.r1;
import om4.x2;
import pfk.h0;
import skm.e0;
import skm.p0;
import te0.w;
import v20.f0;
import vkm.j2;
import vkm.z1;
import zh9.u0;

/* JADX INFO: loaded from: classes19.dex */
public final class j extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f191999w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj2, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f191999w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j((q) this.f191999w, continuation, 0);
            case 1:
                return new j((com.revolut.feature.credit.application.plugins.impl.ui.address.flow.c) this.f191999w, continuation, 1);
            case 2:
                return new j((l85.n) this.f191999w, continuation, 2);
            case 3:
                return new j((com.revolut.core.backend_flow.impl.internal_flow.b) this.f191999w, continuation, 3);
            case 4:
                return new j((com.revolut.feature.junior.isa.impl.ui.jisa_add_phone_number.a) this.f191999w, continuation, 4);
            case 5:
                return new j((ld4.n) this.f191999w, continuation, 5);
            case 6:
                return new j((com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.c) this.f191999w, continuation, 6);
            case 7:
                return new j((lic.g) this.f191999w, continuation, 7);
            case 8:
                return new j((lic.i) this.f191999w, continuation, 8);
            case 9:
                return new j((com.revolut.feature.slot_manager.impl.ui.screen.checklist.a) this.f191999w, continuation, 9);
            case 10:
                return new j((lnb.b) this.f191999w, continuation, 10);
            case 11:
                return new j((lo1.p) this.f191999w, continuation, 11);
            case 12:
                return new j((com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.choose_instalments.a) this.f191999w, continuation, 12);
            case 13:
                return new j((lsl.f) this.f191999w, continuation, 13);
            case 14:
                return new j((b0) this.f191999w, continuation, 14);
            case 15:
                return new j((lwf.g) this.f191999w, continuation, 15);
            case 16:
                return new j((ly5.j) this.f191999w, continuation, 16);
            case 17:
                return new j((lzb.c) this.f191999w, continuation, 17);
            case 18:
                return new j((com.revolut.crypto.challenge.impl.ui.screen.progress.a) this.f191999w, continuation, 18);
            case 19:
                return new j((com.revolut.feature.joint.impl.ui.withdraw.b) this.f191999w, continuation, 19);
            case 20:
                return new j((m62.p) this.f191999w, continuation, 20);
            case 21:
                return new j((m73.e) this.f191999w, continuation, 21);
            case 22:
                return new j((m8c.q) this.f191999w, continuation, 22);
            case 23:
                return new j((ma9.k) this.f191999w, continuation, 23);
            case 24:
                return new j((maa.s) this.f191999w, continuation, 24);
            case 25:
                return new j((y) this.f191999w, continuation, 25);
            case 26:
                return new j((g0) this.f191999w, continuation, 26);
            case 27:
                return new j((mm5.o) this.f191999w, continuation, 27);
            case 28:
                return new j((com.revolut.feature.profile.impl.ui.close_account.c) this.f191999w, continuation, 28);
            default:
                return new j((mmc.d) this.f191999w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((j) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objA;
        Object objA2;
        Object objA3;
        Object objX;
        Object objC;
        List list;
        Object objD;
        Object objC2;
        Object objB;
        Object objB2;
        Object objA4;
        Object objB3;
        int i = this.u;
        int i2 = 19;
        int i3 = 5;
        int i5 = 4;
        int i6 = 14;
        int i21 = 10;
        int i22 = 2;
        int i32 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object obj3 = null;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        Object[] objArr11 = 0;
        Object obj4 = this.f191999w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                d0 d0VarFirstOrError = m70.a.g(((f0) ((q) obj4).f192015n.f211647a).f285393q.f(Unit.f186387a, false), null, new uyh.s(25), 1).firstOrError();
                Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                mzj.j jVar = new mzj.j(new n1j.t(i2), 29);
                d0VarFirstOrError.getClass();
                ufm.i iVar = new ufm.i(d0VarFirstOrError, jVar, 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                this.v = 1;
                Object objB4 = nim.a.b(iVar, this);
                return objB4 == aVar ? aVar : objB4;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (c84.t.N2((com.revolut.feature.credit.application.plugins.impl.ui.address.flow.c) obj4, null, this, 3) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                l85.n nVar = (l85.n) obj4;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 != 0) {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                l85.m mVar = new l85.m(nVar, (l85.f) zi0.c.I(((l85.g) ((j2) nVar.u.f22677a).getValue()).f192789a), null);
                this.v = 1;
                Object objP2 = nVar.p2(this, mVar);
                return objP2 == aVar3 ? aVar3 : objP2;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 != 0) {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.core.backend_flow.impl.internal_flow.b bVar = (com.revolut.core.backend_flow.impl.internal_flow.b) obj4;
                ra0.h hVar = bVar.f51246q;
                BackendFlow backendFlow = bVar.o;
                this.v = 1;
                Object objB5 = ((ul2.h) hVar.f252772a).b(backendFlow, this);
                return objB5 == aVar4 ? aVar4 : objB5;
            case 4:
                com.revolut.feature.junior.isa.impl.ui.jisa_add_phone_number.a aVar5 = (com.revolut.feature.junior.isa.impl.ui.jisa_add_phone_number.a) obj4;
                cli.y yVar = aVar5.f76776w;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    String strB = z80.b.b(aVar5.f76771p, ((la8.e) ((j2) yVar.f22677a).getValue()).f193347b, ((la8.e) ((j2) yVar.f22677a).getValue()).f193346a.f297794a, null, 4);
                    t0 t0Var = t0.f186434a;
                    m70.a.t(t0Var);
                    Intrinsics.checkNotNullParameter(t0Var, "<this>");
                    String strD = a0.D(strB, " ", "", false);
                    p0 p0Var = p0.f264001a;
                    pfm.h hVarN = pd.b.n(elm.f.f127540b, new l34.a(aVar5, strD, objArr6 == true ? 1 : 0, i6));
                    eli.j jVar2 = aVar5.f76774s;
                    sri.m mVarD = ((g8b.a) ((x98.o) aVar5.f76775t.f303606a.f297585b).f303637p).d();
                    vc.s.j(mVarD);
                    la8.l lVar = new la8.l(strD, mVarD);
                    jVar2.getClass();
                    efm.b bVarH = hVarN.h(new eli.a(jVar2, lVar));
                    Intrinsics.checkNotNullExpressionValue(bVarH, "compose(...)");
                    this.v = 1;
                    if (nim.a.a(bVarH, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return yji.l.a1(aVar5, aVar5.X1(new mii.k("SUCCESS_ADD_PHONE_SHOT_DIALOG_ID", new TextLocalisedClause(R$string.junior_trading_add_phone_success_title, null, null, 14), null, null, null, 28)), null, null, new la8.h(aVar5, objArr7 == true ? 1 : 0, objArr == true ? 1 : 0), 3);
            case 5:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 != 0) {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                ld4.n nVar2 = (ld4.n) obj4;
                mx3.a aVar8 = nVar2.o;
                h1 h1VarF = w0.F(nVar2.f194031p.f67887a);
                this.v = 1;
                p34.a aVar9 = aVar8.f210164a;
                aVar9.getClass();
                osk.m mVar2 = new osk.m(aVar9, h1VarF, objArr8 == true ? 1 : 0, 17);
                p0 p0Var2 = p0.f264001a;
                Object objJ = e0.J(elm.f.f127540b, mVar2, this);
                return objJ == aVar7 ? aVar7 : objJ;
            case 6:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.c cVar = (com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.c) obj4;
                    com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.b bVar2 = new com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.b(cVar, null);
                    this.v = 1;
                    if (u0.b0(cVar.X(), "PERSONAL_DETAIL_CREATION_MAIN_ACTION_TAG", bVar2, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 != 0) {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                lic.g gVar = (lic.g) obj4;
                bgc.e eVar = gVar.f195452m;
                String perkId = gVar.f195451l.f84922a;
                ugc.g gVar2 = (ugc.g) eVar;
                gVar2.getClass();
                Intrinsics.checkNotNullParameter(perkId, "perkId");
                phc.j jVar3 = (phc.j) gVar2.f280008b;
                Intrinsics.checkNotNullParameter(perkId, "perkId");
                d0<ihc.a> externalMerchantUrl = jVar3.f236272a.getExternalMerchantUrl(perkId);
                int i100 = 29;
                pfa.c cVar2 = new pfa.c(new h0(i100), i100);
                externalMerchantUrl.getClass();
                ufm.i iVar2 = new ufm.i(externalMerchantUrl, cVar2, 1);
                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                ufm.n nVarI0 = w.i0(iVar2);
                this.v = 1;
                Object objB6 = nim.a.b(nVarI0, this);
                return objB6 == aVar11 ? aVar11 : objB6;
            case 8:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    lic.i iVar3 = (lic.i) obj4;
                    bgc.e eVar2 = iVar3.f195458m;
                    String rewardId = iVar3.f195457l.f84922a;
                    ugc.g gVar3 = (ugc.g) eVar2;
                    gVar3.getClass();
                    Intrinsics.checkNotNullParameter(rewardId, "rewardId");
                    phc.j jVar4 = (phc.j) gVar3.f280008b;
                    Intrinsics.checkNotNullParameter(rewardId, "rewardId");
                    pfm.r rVarG0 = w.g0(jVar4.f236272a.activatePartnerMembership());
                    pfm.h hVar2 = new pfm.h(new phc.d(jVar4, rewardId, objArr2 == true ? 1 : 0), i22);
                    Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
                    pfm.a aVarE = rVarG0.e(hVar2);
                    Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                    this.v = 1;
                    if (nim.a.a(aVarE, this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                com.revolut.feature.slot_manager.impl.ui.screen.checklist.a aVar13 = (com.revolut.feature.slot_manager.impl.ui.screen.checklist.a) obj4;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    sqb.d dVar = aVar13.f87370w;
                    this.v = 1;
                    objA = dVar.a(this);
                    if (objA == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objA = obj2;
                }
                aii.u uVar = (aii.u) objA;
                if (uVar == null || aVar13.C1(uVar) == null) {
                    aVar13.X1(new y0(null, new z(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.error_generic, null, null, 14), null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 5));
                }
                return Unit.f186387a;
            case 10:
                lnb.b bVar3 = (lnb.b) obj4;
                yki.i iVar4 = bVar3.f197139q;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    hnb.d dVar2 = bVar3.f197138p;
                    SavingsDocument savingsDocument = bVar3.o.f83338a;
                    this.v = 1;
                    objA2 = dVar2.a(savingsDocument, this);
                    if (objA2 == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i103 != 1) {
                        if (i103 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        oki.h.D2(iVar4);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                    objA2 = obj2;
                }
                cjb.e eVar3 = (cjb.e) objA2;
                if (eVar3 instanceof cjb.d) {
                    f9i.c cVar3 = ((cjb.d) eVar3).f24633a;
                    this.v = 2;
                    if (bVar3.G1(cVar3, this) == aVar15) {
                        return aVar15;
                    }
                    oki.h.D2(iVar4);
                    return Unit.f186387a;
                }
                if (!(eVar3 instanceof cjb.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                ParcelableDestination parcelableDestination = ((cjb.c) eVar3).f24632a;
                if (parcelableDestination instanceof StackDestination) {
                    return bVar3.C1(new aii.e0(parcelableDestination, objArr9 == true ? 1 : 0, objArr3 == true ? 1 : 0, i22));
                }
                bVar3.C1(parcelableDestination);
                oki.h.D2(iVar4);
                return Unit.f186387a;
            case 11:
                lo1.p pVar = (lo1.p) obj4;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    xn1.e eVar4 = pVar.f197383q;
                    cli.y yVar2 = pVar.f197386t;
                    no1.c cVar4 = new no1.c(zhm.v.k(new no1.b(no1.a.BILLER_CODE, (String) ((lo1.d) ((j2) yVar2.f22677a).getValue()).f197363a.f316032a), new no1.b(no1.a.REFERENCE_NUMBER, (String) ((lo1.d) ((j2) yVar2.f22677a).getValue()).f197364b.f316032a)));
                    this.v = 1;
                    objA3 = eVar4.a(cVar4, this);
                    if (objA3 == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objA3 = obj2;
                }
                pVar.C2(new lo1.e((BPayBill) objA3, (String) ((lo1.d) ((j2) pVar.f197386t.f22677a).getValue()).f197364b.f316032a, ((lo1.d) ((j2) pVar.f197386t.f22677a).getValue()).f197365c));
                return Unit.f186387a;
            case 12:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 != 0) {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.choose_instalments.a aVar18 = (com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.choose_instalments.a) obj4;
                al4.m mVar3 = aVar18.f69438p;
                CreditCardChooseInstalmentsScreenContract$InputData creditCardChooseInstalmentsScreenContract$InputData = aVar18.o;
                String str = creditCardChooseInstalmentsScreenContract$InputData.f69434a;
                String str2 = creditCardChooseInstalmentsScreenContract$InputData.f69435b;
                ql4.v vVar = creditCardChooseInstalmentsScreenContract$InputData.f69436c;
                this.v = 1;
                c0 c0Var = ((r1) mVar3).d;
                c0Var.getClass();
                dp4.p pVar2 = new dp4.p(1, c0Var, str, str2, vVar, null);
                p0 p0Var3 = p0.f264001a;
                Object objJ2 = e0.J(elm.f.f127540b, pVar2, this);
                return objJ2 == aVar17 ? aVar17 : objJ2;
            case 13:
                lsl.f fVar = (lsl.f) obj4;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    jhi.b bVarG = mo3.a.g(fVar.d3(), null, new lnk.o(i21), 1);
                    this.v = 1;
                    objX = vkm.q.x(bVarG, this);
                    if (objX == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objX = obj2;
                }
                return fVar.A2(new CommodityAssetDetailsDestination(com.revolut.retail.trading.core.domain.orders.a.a(((tsl.a) objX).f274171a), null));
            case 14:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    b0 b0Var = (b0) obj4;
                    al4.n nVar3 = b0Var.f200285p;
                    CreditCardStatementPageScreenContract$InputData creditCardStatementPageScreenContract$InputData = b0Var.o;
                    String str3 = creditCardStatementPageScreenContract$InputData.f69691a;
                    LocalDate localDate = creditCardStatementPageScreenContract$InputData.f69692b;
                    this.v = 1;
                    if (((x2) nVar3).J(str3, localDate, this) == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                lwf.g gVar4 = (lwf.g) obj4;
                TransitSectionScreenContract$InputData transitSectionScreenContract$InputData = gVar4.f200453p;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    ouf.a aVar22 = gVar4.f200454q;
                    TransportLocation transportLocation = transitSectionScreenContract$InputData.f92551a;
                    this.v = 1;
                    objC = ((ivf.r) aVar22).c(transportLocation, this);
                    if (objC == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objC = obj2;
                }
                Iterator it8 = ((Iterable) objC).iterator();
                while (true) {
                    if (it8.hasNext()) {
                        Object next = it8.next();
                        if (Intrinsics.f(((bxf.f) next).f19680a, transitSectionScreenContract$InputData.f92553c)) {
                            obj3 = next;
                        }
                    }
                }
                bxf.f fVar2 = (bxf.f) obj3;
                return (fVar2 == null || (list = fVar2.f19682c) == null) ? zhm.f0.f322471a : list;
            case 16:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    z1 z1Var = ((ly5.j) obj4).f200702p;
                    Unit unit = Unit.f186387a;
                    this.v = 1;
                    if (z1Var.emit(unit, this) == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 17:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    nyb.k kVar = ((lzb.c) obj4).f200961l;
                    n0 step = n0.POST_ONBOARDING_PERSONALISATION;
                    kVar.getClass();
                    Intrinsics.checkNotNullParameter(step, "step");
                    jxb.l lVar2 = (jxb.l) kVar.f220804a;
                    lVar2.getClass();
                    Intrinsics.checkNotNullParameter(step, "step");
                    pfm.r rVarG02 = w.g0(lVar2.f179124a.markChecklistStepCompleted(new hxb.a(step)));
                    this.v = 1;
                    if (nim.a.a(rVarG02, this) == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 18:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    i4b.f fVar3 = ((com.revolut.crypto.challenge.impl.ui.screen.progress.a) obj4).f60123p;
                    this.v = 1;
                    if (fVar3.b(this) == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 19:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.joint.impl.ui.withdraw.b bVar4 = (com.revolut.feature.joint.impl.ui.withdraw.b) obj4;
                    lai.d dVar3 = new lai.d((oki.h) bVar4, (Continuation) (objArr10 == true ? 1 : 0), 21);
                    this.v = 1;
                    if (bVar4.p2(this, dVar3) == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                m62.p pVar3 = (m62.p) obj4;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    c62.e eVar5 = pVar3.f202979p;
                    ApmPaymentProfile apmPaymentProfile = pVar3.o.f62523b;
                    this.v = 1;
                    objD = ((iz1.h) ((c62.i) eVar5).f21592a).d(c62.i.b(apmPaymentProfile).f21586a, null, this);
                    if (objD == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objD = obj2;
                }
                i02.h hVar3 = (i02.h) objD;
                if (Intrinsics.f(hVar3, i02.f.f157280a)) {
                    pVar3.C2(m62.e.f202973a);
                } else {
                    if (!Intrinsics.f(hVar3, i02.g.f157281a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pVar3.C2(m62.d.f202972a);
                }
                return Unit.f186387a;
            case 21:
                m73.e eVar6 = (m73.e) obj4;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 == 0) {
                    yhm.o.b(obj2);
                    z6l.s sVar = eVar6.f203304p;
                    String str4 = eVar6.f203305q;
                    String str5 = eVar6.o.f65385a;
                    this.v = 1;
                    objC2 = sVar.C(str4, str5, this);
                    if (objC2 == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objC2 = obj2;
                }
                eVar6.C2(new m73.a((h93.f0) objC2));
                return Unit.f186387a;
            case 22:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 != 0) {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                m8c.q qVar = (m8c.q) obj4;
                m8c.o oVar = new m8c.o(qVar, null);
                this.v = 1;
                Object objP22 = qVar.p2(this, oVar);
                return objP22 == aVar29 ? aVar29 : objP22;
            case 23:
                ma9.k kVar2 = (ma9.k) obj4;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                try {
                    if (i116 == 0) {
                        yhm.o.b(obj2);
                        ufm.i iVarE = ((wl3.h) kVar2.f203968q).e();
                        this.v = 1;
                        objB = nim.a.b(iVarE, this);
                        if (objB == aVar30) {
                            return aVar30;
                        }
                    } else {
                        if (i116 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        objB = obj2;
                    }
                    Set set = (Set) objB;
                    Intrinsics.h(set);
                    kVar2.C2(new ma9.d(set));
                    break;
                } catch (Exception e) {
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                }
                return Unit.f186387a;
            case 24:
                maa.s sVar2 = (maa.s) obj4;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 == 0) {
                    yhm.o.b(obj2);
                    Set set2 = ((maa.j) ((j2) sVar2.f203994t.f22677a).getValue()).e;
                    ArrayList arrayList = new ArrayList(zhm.w.t(set2, 10));
                    Iterator it9 = set2.iterator();
                    while (it9.hasNext()) {
                        arrayList.add(((f5j.a) it9.next()).f132329a);
                    }
                    s8a.n nVar4 = sVar2.f203992r;
                    this.v = 1;
                    if (nVar4.a(arrayList, this) == aVar31) {
                        return aVar31;
                    }
                } else {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                j60.a.v(sVar2.f203990p, false, new maa.r(sVar2, objArr4 == true ? 1 : 0), 1);
                return Unit.f186387a;
            case 25:
                y yVar3 = (y) obj4;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 == 0) {
                    yhm.o.b(obj2);
                    mh4.r rVar = yVar3.f205412q;
                    h1 h1VarF2 = w0.F(yVar3.o.d);
                    this.v = 1;
                    if (rVar.c(h1VarF2, this) == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                yVar3.H2(yVar3.f205414s, new x(objArr5 == true ? 1 : 0));
                return Unit.f186387a;
            case 26:
                g0 g0Var = (g0) obj4;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i119 = this.v;
                if (i119 == 0) {
                    yhm.o.b(obj2);
                    d0 d0VarFirstOrError2 = g0Var.J2().filter(new mhd.c(new x(i21), i3)).firstOrError();
                    Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError2, "firstOrError(...)");
                    this.v = 1;
                    objB2 = nim.a.b(d0VarFirstOrError2, this);
                    if (objB2 == aVar33) {
                        return aVar33;
                    }
                } else {
                    if (i119 != 1) {
                        if (i119 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        g0Var.v = true;
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                    objB2 = obj2;
                }
                ggc.l lVar3 = (ggc.l) ((Data) objB2).getContent();
                if (lVar3 == null) {
                    return Unit.f186387a;
                }
                if (!ggc.v.b(lVar3)) {
                    bgc.e eVar7 = g0Var.f205659p;
                    Set rewardIdsToActivate = zhm.y0.b(lVar3.f143640a);
                    boolean z = g0Var.o.e;
                    ugc.g gVar5 = (ugc.g) eVar7;
                    gVar5.getClass();
                    Intrinsics.checkNotNullParameter(rewardIdsToActivate, "rewardIdsToActivate");
                    phc.j jVar5 = (phc.j) gVar5.f280008b;
                    Intrinsics.checkNotNullParameter(rewardIdsToActivate, "rewardIdsToActivate");
                    fgc.c.Companion.getClass();
                    d0 d0VarFirstOrError3 = m70.a.g(phc.a.E2(jVar5, 2), null, null, 3).firstOrError();
                    phc.b bVar5 = new phc.b(7, new l3d.f(rewardIdsToActivate, z, 20));
                    d0VarFirstOrError3.getClass();
                    ufm.i iVar5 = new ufm.i(d0VarFirstOrError3, bVar5, 1);
                    Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                    ufm.i iVar6 = new ufm.i(iVar5, new ubj.c(i2, new ugc.b(gVar5, i32)), 0);
                    Intrinsics.checkNotNullExpressionValue(iVar6, "flatMap(...)");
                    this.v = 2;
                    if (nim.a.b(iVar6, this) == aVar33) {
                        return aVar33;
                    }
                }
                g0Var.v = true;
                return Unit.f186387a;
            case 27:
                mm5.o oVar2 = (mm5.o) obj4;
                zm5.e eVar8 = oVar2.o;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i120 = this.v;
                if (i120 == 0) {
                    yhm.o.b(obj2);
                    nm5.d dVar4 = oVar2.f207155q;
                    String str6 = oVar2.f207154p.f71031a;
                    this.v = 1;
                    objA4 = dVar4.a(str6, this);
                    if (objA4 == aVar34) {
                        return aVar34;
                    }
                } else {
                    if (i120 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objA4 = obj2;
                }
                Data data = (Data) objA4;
                String str7 = (String) data.getContent();
                if (str7 != null) {
                    im5.a aVar35 = im5.b.Companion;
                    oVar2.C1(eVar8.a(str7, null));
                    eVar8.getClass();
                    oVar2.f207158t = yji.l.a1(oVar2, new ymk.u(LinkEventsKt.getLinkEvents(), eVar8, 11), null, null, new mkk.q(oVar2, objArr11 == true ? 1 : 0, i5), 3);
                }
                Throwable error = data.getError();
                if (error == null) {
                    return null;
                }
                throw error;
            case 28:
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i121 = this.v;
                if (i121 == 0) {
                    yhm.o.b(obj2);
                    d0 d0VarE = ((com.revolut.feature.profile.impl.ui.close_account.c) obj4).f81358p.e();
                    this.v = 1;
                    objB3 = nim.a.b(d0VarE, this);
                    if (objB3 == aVar36) {
                        return aVar36;
                    }
                } else {
                    if (i121 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB3 = obj2;
                }
                Intrinsics.checkNotNullExpressionValue(objB3, "await(...)");
                return Boolean.valueOf(hha.s.l((hha.d) objB3));
            default:
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                int i122 = this.v;
                if (i122 == 0) {
                    yhm.o.b(obj2);
                    mmc.d dVar5 = (mmc.d) obj4;
                    xvh.c cVar5 = dVar5.f207192p;
                    String str8 = dVar5.o.f207188a;
                    this.v = 1;
                    if (((b6d.r) cVar5).h(str8, this) == aVar37) {
                        return aVar37;
                    }
                } else {
                    if (i122 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
