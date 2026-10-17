package inh;

import c84.p;
import c84.t;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueCategory;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.apm.core.models.alias.beneficiary.ResolveAlias;
import com.revolut.feature.apm.iris.impl.data.models.IrisQrScanDetails;
import com.revolut.feature.apm.upi.api.UpiFeatureConfig;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.shared_separate_favourites.domain.converter.SharedConverterItem;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.feature.voluntary.offboarding.impl.ui.flow.VoluntaryOffboardingFlowContract$State;
import com.revolut.feature.wealth.models.robo.PortfolioGoal;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.WorkflowName;
import dce.s0;
import do3.n;
import efm.d0;
import h54.o;
import hha.s;
import iuf.y;
import iuj.a0;
import java.io.File;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import jgd.x;
import jt1.z;
import jta.v;
import k25.u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m1c.l0;
import om4.r1;
import om4.x2;
import pfm.r;
import skm.e0;
import skm.p0;
import te0.w;
import u09.q;
import ux4.m;
import yji.l;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f162945w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f162946x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i, Continuation continuation, l lVar) {
        super(1, continuation);
        this.u = i;
        this.f162946x = lVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g((h) this.f162945w, (e) this.f162946x, continuation, 0);
            case 1:
                return new g((ipb.k) this.f162945w, (String) this.f162946x, continuation, 1);
            case 2:
                return new g((a0) this.f162945w, (String) this.f162946x, continuation, 2);
            case 3:
                return new g((a0) this.f162945w, this.f162946x, continuation, 3);
            case 4:
                return new g((com.revolut.feature.credit.card.impl.ui.statement_financing.setup.b) this.f162945w, (dj0.d) this.f162946x, continuation, 4);
            case 5:
                return new g((j15.d) this.f162945w, (m) this.f162946x, continuation, 5);
            case 6:
                return new g(6, continuation, (com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_list_spare_change.a) this.f162946x);
            case 7:
                return new g((o) this.f162945w, (p) this.f162946x, continuation, 7);
            case 8:
                return new g((String) this.f162945w, (com.revolut.feature.apm.iris.impl.ui.pay.b) this.f162946x, continuation, 8);
            case 9:
                return new g((com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.details.a) this.f162945w, (String) this.f162946x, continuation, 9);
            case 10:
                return new g((jd3.h) this.f162945w, (uc3.a) this.f162946x, continuation, 10);
            case 11:
                return new g((com.revolut.feature.acquiring.lite_pos.impl.ui.screen.category.a) this.f162945w, (CatalogueCategory) this.f162946x, continuation, 11);
            case 12:
                return new g((com.revolut.feature.apm.swish.impl.ui.a) this.f162945w, (String) this.f162946x, continuation, 12);
            case 13:
                return new g((jf2.i) this.f162945w, (ResolveAlias) this.f162946x, continuation, 13);
            case 14:
                return new g((com.revolut.feature.credit.application.plugins.impl.ui.photo_upload.flow.c) this.f162945w, (nii.h) this.f162946x, continuation, 14);
            case 15:
                return new g((x) this.f162945w, (jgd.k) this.f162946x, continuation, 15);
            case 16:
                return new g((jh9.p) this.f162945w, (h1j.d) this.f162946x, continuation, 16);
            case 17:
                return new g((jik.i) this.f162945w, (jik.m) this.f162946x, continuation, 17);
            case 18:
                return new g((jl8.e) this.f162945w, (String) this.f162946x, continuation, 18);
            case 19:
                return new g((com.revolut.feature.robo.impl.ui.flow.edit_goal.f) this.f162945w, (PortfolioGoal) this.f162946x, continuation, 19);
            case 20:
                return new g((joa.i) this.f162945w, (TermsScope) this.f162946x, continuation, 20);
            case 21:
                return new g(21, continuation, (com.revolut.feature.voluntary.offboarding.impl.ui.flow.e) this.f162946x);
            case 22:
                return new g(22, continuation, (com.revolut.feature.voluntary.offboarding.impl.ui.flow.e) this.f162946x);
            case 23:
                return new g((z) this.f162945w, (h1j.d) this.f162946x, continuation, 23);
            case 24:
                return new g((v) this.f162945w, (String) this.f162946x, continuation, 24);
            case 25:
                return new g((com.revolut.feature.freelancer.impl.ui.cashback.flow.c) this.f162945w, (jp3.b) this.f162946x, continuation, 25);
            case 26:
                return new g((k09.g) this.f162945w, (q) this.f162946x, continuation, 26);
            case 27:
                return new g((String) this.f162945w, (com.revolut.feature.statements.impl.ui.savings.a) this.f162946x, continuation, 27);
            case 28:
                return new g((k1c.d) this.f162945w, (l0) this.f162946x, continuation, 28);
            default:
                return new g((u) this.f162945w, (w4l.k) this.f162946x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((g) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.revolut.feature.apm.iris.impl.data.models.IrisQrScanDetails] */
    /* JADX WARN: Type inference failed for: r9v10 */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objX;
        Object objP2;
        com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_list_spare_change.a aVar;
        Object objJ;
        Object objA;
        Object objA2;
        UpiFeatureConfig.Destination.Transfer.InputData toMerchant;
        Object objA3;
        Object objD3;
        Object objB;
        Address address;
        Object objB2;
        com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar;
        Object objC;
        VoluntaryOffboardingFlowContract$State voluntaryOffboardingFlowContract$State;
        Object objB3;
        VoluntaryOffboardingFlowContract$State voluntaryOffboardingFlowContract$State2;
        Object objA4;
        Object objI2;
        Object objB4;
        int i = this.u;
        w4l.j jVar = w4l.j.f294644c;
        int i2 = 6;
        int i3 = 7;
        boolean zL = false;
        boolean z = false;
        int i5 = 3;
        int i6 = 2;
        ?? r92 = 0;
        bVarG = null;
        wi0.b bVarG = null;
        Object obj3 = this.f162946x;
        int i21 = 1;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    pfm.h hVarB3 = ((h) this.f162945w).f162947l.b3(((c) ((e) obj3)).f162942a, true);
                    this.v = 1;
                    if (nim.a.a(hVarB3, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                ipb.k kVar = (ipb.k) this.f162945w;
                String str = (String) obj3;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 != 0) {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                if (!((f80.b) kVar.f167720r).e(str)) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(p.a.p("Can't handle deeplink with url ", str, " on Protection and Safety screen"));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                    return Unit.f186387a;
                }
                wli.x xVar = kVar.f167721s;
                lg0.a aVar4 = lg0.a.OPEN_BROWSER;
                Boolean bool = Boolean.FALSE;
                this.v = 1;
                Object objL1 = xVar.L1(str, aVar4, bool, this);
                return objL1 == aVar3 ? aVar3 : objL1;
            case 2:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                this.v = 1;
                Object objX1 = lg0.b.x1(((a0) this.f162945w).f168626r, (String) obj3, null, null, this, 6);
                return objX1 == aVar5 ? aVar5 : objX1;
            case 3:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 != 0) {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                wli.x xVar2 = ((a0) this.f162945w).f168626r;
                String str2 = ((iuj.d) obj3).f168630a;
                this.v = 1;
                Object objX12 = lg0.b.x1(xVar2, str2, null, null, this, 6);
                return objX12 == aVar6 ? aVar6 : objX12;
            case 4:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 != 0) {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.card.impl.ui.statement_financing.setup.b bVar = (com.revolut.feature.credit.card.impl.ui.statement_financing.setup.b) this.f162945w;
                al4.m mVar = bVar.f69775p;
                String str3 = bVar.o.f69768a;
                this.v = 1;
                Object objI = ((r1) mVar).i((dj0.d) obj3, this, str3);
                return objI == aVar7 ? aVar7 : objI;
            case 5:
                m mVar2 = (m) obj3;
                String str4 = mVar2.f283875c;
                j15.d dVar = (j15.d) this.f162945w;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    jhi.b bVarG2 = mo3.a.g(dVar.f170121n.j(jVar), null, new j0g.b(i5), 1);
                    this.v = 1;
                    objX = vkm.q.x(bVarG2, this);
                    if (objX == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objX = obj2;
                }
                wi0.b bVarY = do3.q.y((n) objX);
                int i74 = j15.b.f170117a[mVar2.f283874b.ordinal()];
                if (i74 == 1) {
                    dVar.y(str4);
                } else {
                    if (i74 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar.N2(dVar.f170119l.a(mVar2.f283873a, str4, bVarY), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new iyi.i(dVar, i2));
                }
                return Unit.f186387a;
            case 6:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_list_spare_change.a aVar10 = (com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_list_spare_change.a) obj3;
                    j2c.v vVar = new j2c.v(aVar10, null);
                    this.f162945w = aVar10;
                    this.v = 1;
                    objP2 = aVar10.p2(this, vVar);
                    if (objP2 == aVar9) {
                        return aVar9;
                    }
                    aVar = aVar10;
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_list_spare_change.a) this.f162945w;
                    yhm.o.b(obj2);
                    objP2 = obj2;
                }
                Intrinsics.checkNotNullExpressionValue(objP2, "withLoading(...)");
                return aVar.C1(u0.b((NaviCommand) objP2));
            case 7:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (((o) this.f162945w).invoke((p) obj3, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                com.revolut.feature.apm.iris.impl.ui.pay.b bVar2 = (com.revolut.feature.apm.iris.impl.ui.pay.b) obj3;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    String str5 = (String) this.f162945w;
                    if (str5 != null) {
                        k62.b bVar3 = bVar2.f62518q;
                        this.v = 1;
                        u2i.g gVar = new u2i.g(bVar3.f181616a, str5, r92, i21);
                        p0 p0Var = p0.f264001a;
                        objJ = e0.J(elm.f.f127540b, gVar, this);
                        if (objJ == aVar12) {
                            return aVar12;
                        }
                    }
                    com.revolut.feature.apm.iris.impl.ui.pay.b.I2(bVar2, r92);
                    return Unit.f186387a;
                }
                if (i99 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                objJ = obj2;
                r92 = (IrisQrScanDetails) objJ;
                com.revolut.feature.apm.iris.impl.ui.pay.b.I2(bVar2, r92);
                return Unit.f186387a;
            case 9:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 != 0) {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.details.a aVar14 = (com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.details.a) this.f162945w;
                yw3.a aVar15 = aVar14.f67506q;
                this.v = 1;
                e34.c cVar = aVar15.f317314a;
                cVar.getClass();
                s0 s0Var = new s0(cVar, aVar14.o.f67501a, (String) obj3, null, 29);
                p0 p0Var2 = p0.f264001a;
                Object objJ2 = e0.J(elm.f.f127540b, s0Var, this);
                return objJ2 == aVar13 ? aVar13 : objJ2;
            case 10:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 != 0) {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                jd3.h hVar = (jd3.h) this.f162945w;
                y yVar = new y(hVar, (uc3.a) obj3, i5);
                iyi.j jVar2 = new iyi.j(hVar, r92, i3);
                this.v = 1;
                Object objW = n14.k.W(hVar, null, null, yVar, jVar2, this, 3);
                return objW == aVar16 ? aVar16 : objW;
            case 11:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    nd1.c cVar2 = ((com.revolut.feature.acquiring.lite_pos.impl.ui.screen.category.a) this.f162945w).f60788p;
                    String categoryId = ((CatalogueCategory) obj3).f60669a;
                    cVar2.getClass();
                    Intrinsics.checkNotNullParameter(categoryId, "categoryId");
                    id1.n nVar = cVar2.f214281a;
                    nVar.getClass();
                    Intrinsics.checkNotNullParameter(categoryId, "categoryId");
                    pfm.h hVarN = pd.b.n(p0.f264003c, new id1.j(nVar, categoryId, r92, z ? 1 : 0));
                    pfm.h hVar2 = new pfm.h(new id1.d(nVar, new ho6.n(categoryId, 23), i21), i6);
                    Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
                    pfm.a aVarE = hVarN.e(hVar2);
                    Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                    r rVarG0 = w.g0(aVarE);
                    this.v = 1;
                    if (nim.a.a(rVarG0, this) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                com.revolut.feature.apm.swish.impl.ui.a aVar18 = (com.revolut.feature.apm.swish.impl.ui.a) this.f162945w;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    jvh.a aVar20 = aVar18.f62917p;
                    WorkflowName workflowName = new WorkflowName((String) obj3);
                    this.v = 1;
                    objA = aVar20.a(workflowName, this);
                    if (objA == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objA = obj2;
                }
                aVar18.J2((String) objA);
                return Unit.f186387a;
            case 13:
                ResolveAlias resolveAlias = (ResolveAlias) obj3;
                jf2.i iVar = (jf2.i) this.f162945w;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    hg2.e eVar2 = iVar.f173647l;
                    this.v = 1;
                    objA2 = eVar2.a(resolveAlias, this);
                    if (objA2 == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objA2 = obj2;
                }
                hg2.c cVar3 = (hg2.c) objA2;
                String str6 = resolveAlias.f61904b;
                iVar.getClass();
                if (cVar3 instanceof hg2.b) {
                    toMerchant = new UpiFeatureConfig.Destination.Transfer.InputData.ToAlias(((hg2.b) cVar3).f152065a, str6, (dj0.d) null, (String) null, (String) null, (String) null, (Map) null, 188);
                } else {
                    if (!(cVar3 instanceof hg2.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    toMerchant = new UpiFeatureConfig.Destination.Transfer.InputData.ToMerchant(((hg2.a) cVar3).f152064a, (dj0.d) null, (String) null, (String) null, (String) null, (Map) null, 94);
                }
                iVar.A2(u0.b(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), u0.f(new UpiFeatureConfig.Destination.Transfer(toMerchant, null, null, null, 14)))));
                return Unit.f186387a;
            case 14:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.photo_upload.flow.c cVar4 = (com.revolut.feature.credit.application.plugins.impl.ui.photo_upload.flow.c) this.f162945w;
                    it3.d dVar2 = (it3.d) ((nii.g) ((nii.h) obj3)).f216152a;
                    this.v = 1;
                    if (t.N2(cVar4, dVar2, this, 2) == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                x xVar3 = (x) this.f162945w;
                jgd.k kVar2 = (jgd.k) obj3;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    d3d.g gVar2 = xVar3.f173987p;
                    SharedConverterItem sharedConverterItem = kVar2.f173973a;
                    SharedConverterItem sharedConverterItem2 = kVar2.f173973a;
                    SharedConverterItem sharedConverterItemA = SharedConverterItem.a(sharedConverterItem, new dj0.d(xVar3.f173989r.b(kVar2.f173974b, sharedConverterItem2.f86893b.f306286a), sharedConverterItem2.f86893b));
                    this.v = 1;
                    if (gVar2.c(sharedConverterItemA, this) == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 16:
                h1j.d dVar3 = (h1j.d) obj3;
                jh9.p pVar = (jh9.p) this.f162945w;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    x02.a aVar25 = pVar.f174175p;
                    k1j.a aVar26 = dVar3.d;
                    AccountId accountId = dVar3.f148582c;
                    String str7 = dVar3.f148580a;
                    xi0.b bVar4 = dVar3.f148581b;
                    this.v = 1;
                    objA3 = ((q12.d) aVar25).a(aVar26, accountId, str7, bVar4, this);
                    if (objA3 == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objA3 = obj2;
                }
                pVar.H2(pVar.v, new eh9.y((FundingSource) objA3, dVar3, i21));
                return Unit.f186387a;
            case 17:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 != 0) {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                jik.i iVar2 = (jik.i) this.f162945w;
                jik.m mVar3 = (jik.m) obj3;
                this.v = 1;
                if (mVar3 instanceof jik.k) {
                    objD3 = iVar2.c3(this);
                } else {
                    if (!(mVar3 instanceof jik.l)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    objD3 = iVar2.d3(((jik.l) mVar3).f174607a, this);
                }
                return objD3 == aVar27 ? aVar27 : objD3;
            case 18:
                String str8 = (String) obj3;
                zq.a aVar28 = ((jl8.e) this.f162945w).f175645c;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (aVar28.x(str8, this) != aVar29) {
                    }
                    return aVar29;
                }
                if (i109 != 1) {
                    if (i109 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                vkm.d dVarU = aVar28.u(str8, jVar);
                this.v = 2;
                Object objZ = vkm.q.z(dVarU, this);
                if (objZ != aVar29) {
                    return objZ;
                }
                return aVar29;
            case 19:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.robo.impl.ui.flow.edit_goal.f fVar = (com.revolut.feature.robo.impl.ui.flow.edit_goal.f) this.f162945w;
                    zjh.f fVar2 = fVar.f85114p;
                    String str9 = fVar.o.f176523a;
                    this.v = 1;
                    k18.c cVar5 = (k18.c) fVar2.f322835b;
                    p0 p0Var3 = p0.f264001a;
                    Object objJ3 = e0.J(elm.f.f127540b, new lr.l(27, cVar5, (PortfolioGoal) obj3, str9, (Continuation) null), this);
                    Object obj4 = objJ3;
                    if (objJ3 != aVar30) {
                        obj4 = Unit.f186387a;
                    }
                    if (obj4 != aVar30) {
                        obj4 = Unit.f186387a;
                    }
                    if (obj4 == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                joa.i iVar3 = (joa.i) this.f162945w;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    mre.c cVar6 = iVar3.f176910t;
                    TermsScope termsScope = (TermsScope) obj3;
                    n nVar2 = (n) ((joa.c) iVar3.t2()).f176896a.getContent();
                    if (nVar2 != null && (address = nVar2.k) != null) {
                        bVarG = nz8.d.g(address);
                    }
                    ufm.i iVarC = ((rre.d) cVar6).c(termsScope, bVarG);
                    this.v = 1;
                    objB = nim.a.b(iVarC, this);
                    if (objB == aVar31) {
                        return aVar31;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB = obj2;
                }
                NaviCommand naviCommand = (NaviCommand) objB;
                Intrinsics.h(naviCommand);
                return iVar3.C1(new BridgeDestination(naviCommand));
            case 21:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar3 = (com.revolut.feature.voluntary.offboarding.impl.ui.flow.e) obj3;
                    ufm.i iVarA = com.revolut.retail.feature.api.userauth.navigation.a.a(eVar3.f94840x, false, null, 7);
                    jsg.h hVar3 = jsg.h.f;
                    ufm.i iVar4 = new ufm.i(iVarA, new joe.e(i2), 1);
                    Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                    this.f162945w = eVar3;
                    this.v = 1;
                    objB2 = nim.a.b(iVar4, this);
                    if (objB2 == aVar32) {
                        return aVar32;
                    }
                    eVar = eVar3;
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    eVar = (com.revolut.feature.voluntary.offboarding.impl.ui.flow.e) this.f162945w;
                    yhm.o.b(obj2);
                    objB2 = obj2;
                }
                Intrinsics.checkNotNullExpressionValue(objB2, "await(...)");
                return eVar.C1((aii.u) objB2);
            case 22:
                com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar4 = (com.revolut.feature.voluntary.offboarding.impl.ui.flow.e) obj3;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    efm.r rVarD = eVar4.A.d(wog.a.PRICING_PLANS);
                    this.v = 1;
                    objC = nim.a.c(rVarD, this);
                    if (objC == aVar33) {
                        return aVar33;
                    }
                } else {
                    if (i113 != 1) {
                        if (i113 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        voluntaryOffboardingFlowContract$State2 = (VoluntaryOffboardingFlowContract$State) this.f162945w;
                        yhm.o.b(obj2);
                        objB3 = obj2;
                        Intrinsics.checkNotNullExpressionValue(objB3, "await(...)");
                        zL = s.l((hha.d) objB3);
                        voluntaryOffboardingFlowContract$State = voluntaryOffboardingFlowContract$State2;
                        voluntaryOffboardingFlowContract$State.getClass();
                        return new VoluntaryOffboardingFlowContract$State(zL);
                    }
                    yhm.o.b(obj2);
                    objC = obj2;
                }
                voluntaryOffboardingFlowContract$State = (VoluntaryOffboardingFlowContract$State) eVar4.A2().f98429a;
                if (((Boolean) objC).booleanValue()) {
                    d0 d0VarE = eVar4.f94841y.e();
                    this.f162945w = voluntaryOffboardingFlowContract$State;
                    this.v = 2;
                    objB3 = nim.a.b(d0VarE, this);
                    if (objB3 == aVar33) {
                        return aVar33;
                    }
                    voluntaryOffboardingFlowContract$State2 = voluntaryOffboardingFlowContract$State;
                    Intrinsics.checkNotNullExpressionValue(objB3, "await(...)");
                    zL = s.l((hha.d) objB3);
                    voluntaryOffboardingFlowContract$State = voluntaryOffboardingFlowContract$State2;
                }
                voluntaryOffboardingFlowContract$State.getClass();
                return new VoluntaryOffboardingFlowContract$State(zL);
            case 23:
                h1j.d dVar4 = (h1j.d) obj3;
                z zVar = (z) this.f162945w;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.apm.bizum.impl.ui.transfer.amount.b bVar5 = zVar.f178305p;
                    k1j.a aVar35 = dVar4.d;
                    AccountId accountId2 = dVar4.f148582c;
                    String str10 = dVar4.f148580a;
                    xi0.b bVar6 = dVar4.f148581b;
                    this.v = 1;
                    objA4 = ((q12.d) bVar5.e).a(aVar35, accountId2, str10, bVar6, this);
                    if (objA4 == aVar34) {
                        return aVar34;
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objA4 = obj2;
                }
                zVar.x2(new jp3.b(new eh9.y((FundingSource) objA4, dVar4, i6), zVar, 11));
                return Unit.f186387a;
            case 24:
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (v.I2((v) this.f162945w, (String) obj3, this) == aVar36) {
                        return aVar36;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 25:
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.freelancer.impl.ui.cashback.flow.c cVar7 = (com.revolut.feature.freelancer.impl.ui.cashback.flow.c) this.f162945w;
                    this.v = 1;
                    objI2 = com.revolut.feature.freelancer.impl.ui.cashback.flow.c.I2(cVar7, this);
                    if (objI2 == aVar37) {
                        return aVar37;
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objI2 = obj2;
                }
                ProductArticleParams productArticleParams = (ProductArticleParams) objI2;
                if (productArticleParams == null) {
                    return null;
                }
                ((jp3.b) obj3).invoke(productArticleParams);
                return Unit.f186387a;
            case 26:
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 != 0) {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                dz8.e eVar5 = ((k09.g) this.f162945w).f179996p;
                this.v = 1;
                Object objA5 = ((qyj.c) eVar5).a((q) obj3, this);
                return objA5 == aVar38 ? aVar38 : objA5;
            case 27:
                String str11 = (String) this.f162945w;
                com.revolut.feature.statements.impl.ui.savings.a aVar39 = (com.revolut.feature.statements.impl.ui.savings.a) obj3;
                fim.a aVar40 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 == 0) {
                    yhm.o.b(obj2);
                    ufm.n nVarA = aVar39.f88376q.a(str11, Intrinsics.f(new URL(str11).getHost(), new URL(aVar39.f88377r.getBaseUrl()).getHost()));
                    this.v = 1;
                    objB4 = nim.a.b(nVarA, this);
                    if (objB4 == aVar40) {
                        return aVar40;
                    }
                } else {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB4 = obj2;
                }
                File file = (File) objB4;
                n0e.b bVar7 = aVar39.f88379t;
                Intrinsics.h(file);
                return bVar7.a(file);
            case 28:
                fim.a aVar41 = fim.a.COROUTINE_SUSPENDED;
                int i119 = this.v;
                if (i119 == 0) {
                    yhm.o.b(obj2);
                    pfm.a aVarA = ((k1c.d) this.f162945w).f180210c.a(((l0) obj3).f201384a);
                    this.v = 1;
                    if (nim.a.a(aVarA, this) == aVar41) {
                        return aVar41;
                    }
                } else {
                    if (i119 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                u uVar = (u) this.f162945w;
                fim.a aVar42 = fim.a.COROUTINE_SUSPENDED;
                int i120 = this.v;
                if (i120 != 0) {
                    if (i120 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                jhi.b bVarG3 = mo3.a.g(u0.m(((x2) uVar.f180348a).l((w4l.k) obj3), uVar.o()), null, new k1f.n(i5), 1);
                this.v = 1;
                Object objX2 = vkm.q.x(bVarG3, this);
                return objX2 == aVar42 ? aVar42 : objX2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj2, Object obj3, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f162945w = obj2;
        this.f162946x = obj3;
    }
}
