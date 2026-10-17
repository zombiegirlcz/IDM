package uxe;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.acquiring.lite_pos.impl.R$string;
import com.revolut.feature.apm.core.impl.data.network.alias.AliasService;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.common.viewer.CreditApplicationDocumentViewerScreen;
import com.revolut.feature.topup_screen.impl.flows.stored_method.screen.brazil.BrazilStoredMethodDetailsScreen;
import com.revolut.feature.wealth.assetdetails.ui.impl.ratings.credit_quality.CreditQualityScreen;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import retrofit2.HttpException;
import retrofit2.Response;
import skm.e0;
import skm.k0;
import skm.p0;
import v73.r;
import vb2.s;
import vch.w0;
import vch.x0;
import vdl.y;
import vge.t3;
import vkm.j2;
import vkm.z1;
import wli.x;
import zh9.u0;
import zhm.c0;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f283994w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f283994w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l lVar = new l((BrazilStoredMethodDetailsScreen) this.f283994w, continuation, 0);
                lVar.v = ((Number) obj2).intValue();
                return lVar;
            case 1:
                return new l((uxh.e) this.f283994w, continuation, 1);
            case 2:
                return new l((uxh.l) this.f283994w, continuation, 2);
            case 3:
                return new l((uy1.j) this.f283994w, continuation, 3);
            case 4:
                return new l((v23.n) this.f283994w, continuation, 4);
            case 5:
                return new l((CreditApplicationDocumentViewerScreen) this.f283994w, continuation, 5);
            case 6:
                return new l((v44.n) this.f283994w, continuation, 6);
            case 7:
                return new l((com.revolut.feature.joint.impl.ui.creation_flow.b) this.f283994w, continuation, 7);
            case 8:
                return new l((CreditQualityScreen) this.f283994w, continuation, 8);
            case 9:
                return new l((com.revolut.feature.credit.application.plugins.impl.ui.confirmation.b) this.f283994w, continuation, 9);
            case 10:
                return new l((v6e.j) this.f283994w, continuation, 10);
            case 11:
                return new l((r) this.f283994w, continuation, 11);
            case 12:
                return new l((v8d.m) this.f283994w, continuation, 12);
            case 13:
                return new l((s) this.f283994w, continuation, 13);
            case 14:
                return new l((vb4.s) this.f283994w, continuation, 14);
            case 15:
                return new l((x0) this.f283994w, continuation, 15);
            case 16:
                return new l((ve1.g) this.f283994w, continuation, 16);
            case 17:
                return new l((vea.l) this.f283994w, continuation, 17);
            case 18:
                return new l((veh.k) this.f283994w, continuation, 18);
            case 19:
                return new l((t3) this.f283994w, continuation, 19);
            case 20:
                return new l((com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d) this.f283994w, continuation, 20);
            case 21:
                return new l((vh2.n) this.f283994w, continuation, 21);
            case 22:
                return new l((com.revolut.feature.credit.application.plugins.impl.ui.sso.flow.a) this.f283994w, continuation, 22);
            case 23:
                return new l((vic.c) this.f283994w, continuation, 23);
            case 24:
                return new l((vj1.b) this.f283994w, continuation, 24);
            case 25:
                return new l((com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.c) this.f283994w, continuation, 25);
            case 26:
                return new l((mk0.p) this.f283994w, continuation, 26);
            case 27:
                return new l((com.revolut.feature.retail.savings.impl.common.sole_tax_residency.b) this.f283994w, continuation, 27);
            case 28:
                return new l((com.revolut.feature.rfi_tool.impl.navigation.b) this.f283994w, continuation, 28);
            default:
                return new l((vlg.s) this.f283994w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                break;
        }
        return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objVerifyOwnershipDebug;
        Object objJ;
        int i = this.u;
        int i2 = 5;
        int i3 = 14;
        int i5 = 2;
        Continuation continuation = null;
        Object obj3 = this.f283994w;
        int i6 = 1;
        switch (i) {
            case 0:
                int i21 = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.topup_screen.impl.flows.stored_method.screen.brazil.b bVar = (com.revolut.feature.topup_screen.impl.flows.stored_method.screen.brazil.b) ((BrazilStoredMethodDetailsScreen) obj3).e3();
                bVar.H2(bVar.f90817q, new l2c.l(i21, 27));
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    uxh.h hVar = ((uxh.e) obj3).d;
                    this.v = 1;
                    if (hVar.Z2(this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
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
                uxh.l lVar = (uxh.l) obj3;
                uxh.k kVar = new uxh.k(lVar, null);
                this.v = 1;
                Object objB = pu7.a.B(lVar.e, "navigateToTerms", kVar, this);
                return objB == aVar3 ? aVar3 : objB;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    uy1.j jVar = (uy1.j) obj3;
                    AliasService aliasService = jVar.f284043a;
                    String str = jVar.d;
                    this.v = 1;
                    objVerifyOwnershipDebug = aliasService.verifyOwnershipDebug(str, this);
                    if (objVerifyOwnershipDebug == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objVerifyOwnershipDebug = obj2;
                }
                Response response = (Response) objVerifyOwnershipDebug;
                if (response.code() == 204) {
                    return null;
                }
                if (!response.isSuccessful()) {
                    throw new HttpException(response);
                }
                wy1.n nVar = (wy1.n) response.body();
                if (nVar != null) {
                    return nVar.getCode();
                }
                return null;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 != 0) {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                x xVar = ((v23.n) obj3).o;
                Boolean bool = Boolean.FALSE;
                this.v = 1;
                Object objX1 = lg0.b.x1(xVar, "revolut://app/form/customised-name-suggestion", null, bool, this, 2);
                return objX1 == aVar5 ? aVar5 : objX1;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (k0.b(1000L, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                KProperty[] kPropertyArr = CreditApplicationDocumentViewerScreen.W;
                v44.n nVarE3 = ((CreditApplicationDocumentViewerScreen) obj3).e3();
                nVarE3.H2(nVarE3.f285961s, new v2g.i(9));
                return Unit.f186387a;
            case 6:
                v44.n nVar2 = (v44.n) obj3;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    p0 p0Var = p0.f264001a;
                    elm.f fVar = elm.f.f127540b;
                    uwe.f fVar2 = new uwe.f(nVar2, continuation, 7);
                    this.v = 1;
                    objJ = e0.J(fVar, fVar2, this);
                    if (objJ == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objJ = obj2;
                }
                nVar2.H2(nVar2.f285961s, new v25.k((v44.l) objJ, i2));
                return Unit.f186387a;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 != 0) {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.joint.impl.ui.creation_flow.b bVar2 = (com.revolut.feature.joint.impl.ui.creation_flow.b) obj3;
                com.revolut.feature.joint.impl.ui.creation_flow.a aVar9 = new com.revolut.feature.joint.impl.ui.creation_flow.a(bVar2, null);
                this.v = 1;
                Object objP2 = bVar2.p2(this, aVar9);
                return objP2 == aVar8 ? aVar8 : objP2;
            case 8:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    v4h.f fVar3 = (v4h.f) ((CreditQualityScreen) obj3).Q.getValue();
                    this.v = 1;
                    ((com.revolut.feature.wealth.assetdetails.ui.impl.ratings.credit_quality.b) fVar3).B2();
                    if (Unit.f186387a == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 != 0) {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.confirmation.b bVar3 = (com.revolut.feature.credit.application.plugins.impl.ui.confirmation.b) obj3;
                com.revolut.feature.credit.application.plugins.impl.ui.confirmation.a aVar12 = new com.revolut.feature.credit.application.plugins.impl.ui.confirmation.a(bVar3, continuation, i5);
                this.v = 1;
                Object objP22 = bVar3.p2(this, aVar12);
                return objP22 == aVar11 ? aVar11 : objP22;
            case 10:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 != 0) {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                g6e.g gVar = ((v6e.j) obj3).f286356b;
                this.v = 1;
                Object objG = ((v6e.r) gVar).g(this);
                return objG == aVar13 ? aVar13 : objG;
            case 11:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 != 0) {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                r rVar = (r) obj3;
                v73.q qVar = new v73.q(rVar, null);
                this.v = 1;
                Object objB2 = pu7.a.B(rVar.e, "revolut_pay_info_article", qVar, this);
                return objB2 == aVar14 ? aVar14 : objB2;
            case 12:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    z1 z1Var = ((v8d.m) obj3).f286747t;
                    Boolean bool2 = Boolean.TRUE;
                    this.v = 1;
                    if (z1Var.emit(bool2, this) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    s sVar = (s) obj3;
                    uk9.h hVar2 = new uk9.h(sVar, continuation, 8);
                    this.v = 1;
                    if (sVar.p2(this, hVar2) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 != 0) {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                vb4.s sVar2 = (vb4.s) obj3;
                vb4.p pVar = new vb4.p(sVar2, continuation, i6);
                this.v = 1;
                Object objB3 = pu7.a.B(sVar2.k, "selectTransactions", pVar, this);
                return objB3 == aVar17 ? aVar17 : objB3;
            case 15:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 != 0) {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                x0 x0Var = (x0) obj3;
                w0 w0Var = new w0(x0Var, null);
                this.v = 1;
                Object objB4 = pu7.a.B(x0Var.k, "onWithdrawTargetClicked", w0Var, this);
                return objB4 == aVar18 ? aVar18 : objB4;
            case 16:
                ve1.g gVar2 = (ve1.g) obj3;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    uk9.h hVar3 = new uk9.h(gVar2, continuation, 10);
                    this.v = 1;
                    if (gVar2.p2(this, hVar3) == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                yji.l.a1(gVar2, gVar2.X1(new y0(null, new j0((Clause) new TextLocalisedClause(R$string.product_catalogue_flow_tax_rates_new_tax_rate_result_success_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) StatusViewContract$Duration.Short.f59734a, (h0) null, (ResourceImage) null, 3582), false, 5)), null, null, new uwe.f(gVar2, continuation, 25), 3);
                return Unit.f186387a;
            case 17:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 != 0) {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                s99.i iVar = ((vea.l) obj3).f288208h;
                this.v = 1;
                Object objA = iVar.a(this);
                return objA == aVar20 ? aVar20 : objA;
            case 18:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    veh.k kVar2 = (veh.k) obj3;
                    ybl.b bVar4 = kVar2.f288336q;
                    String str2 = kVar2.o.f95719a;
                    this.v = 1;
                    Object objD = ((y) ((ael.k) bVar4).f3633a).f288067h.d(c0.O(u.c(str2)), false, this);
                    if (objD != aVar21) {
                        objD = Unit.f186387a;
                    }
                    if (objD != aVar21) {
                        objD = Unit.f186387a;
                    }
                    if (objD == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 19:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 != 0) {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                j2 j2Var = ((t3) obj3).f289024n;
                tk9.i iVar2 = new tk9.i(i5, i3, continuation);
                this.v = 1;
                Object objY = vkm.q.y(j2Var, iVar2, this);
                return objY == aVar22 ? aVar22 : objY;
            case 20:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d dVar = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d) obj3;
                    com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.b bVar5 = new com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.b(dVar, null);
                    this.v = 1;
                    if (dVar.p2(this, bVar5) == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 21:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    pfm.r rVarB = ((vh2.n) obj3).f289288t.b(n02.b.WERO);
                    this.v = 1;
                    if (nim.a.a(rVarB, this) == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 22:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    sp3.a aVar26 = ((com.revolut.feature.credit.application.plugins.impl.ui.sso.flow.a) obj3).f68483q;
                    bs3.i iVar3 = new bs3.i("selfie-check", bs3.g.INCOGNIA);
                    this.v = 1;
                    if (((qq3.g) aVar26).a(iVar3, this) == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 23:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 != 0) {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                vic.c cVar = (vic.c) obj3;
                vic.b bVar6 = new vic.b(cVar, continuation, i6);
                this.v = 1;
                Object objB5 = pu7.a.B(cVar.k, "completeRewardRegistration", bVar6, this);
                return objB5 == aVar27 ? aVar27 : objB5;
            case 24:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    x4l.c cVar2 = ((vj1.b) obj3).e;
                    Unit unit = Unit.f186387a;
                    this.v = 1;
                    if (cVar2.d(unit, false, this) == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 25:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 == 0) {
                    yhm.o.b(obj2);
                    dfj.k0 k0Var = ((com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.c) obj3).f101211t;
                    this.v = 1;
                    if (k0Var.e(this) == aVar29) {
                        return aVar29;
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 26:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (((mk0.p) obj3).i(this) == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 27:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 != 0) {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.retail.savings.impl.common.sole_tax_residency.b bVar7 = (com.revolut.feature.retail.savings.impl.common.sole_tax_residency.b) obj3;
                uk9.h hVar4 = new uk9.h(bVar7, continuation, 16);
                this.v = 1;
                Object objB6 = pu7.a.B(bVar7.e, "goToPrivacyPolicyPage", hVar4, this);
                return objB6 == aVar31 ? aVar31 : objB6;
            case 28:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.rfi_tool.impl.navigation.b bVar8 = (com.revolut.feature.rfi_tool.impl.navigation.b) obj3;
                    String str3 = bVar8.o.f84997b;
                    if (str3 != null) {
                        this.v = 1;
                        if (com.revolut.feature.rfi_tool.impl.navigation.b.J2(bVar8, str3, this) == aVar32) {
                            return aVar32;
                        }
                    } else {
                        this.v = 2;
                        if (com.revolut.feature.rfi_tool.impl.navigation.b.I2(bVar8, this) == aVar32) {
                            return aVar32;
                        }
                    }
                } else {
                    if (i117 != 1 && i117 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 == 0) {
                    yhm.o.b(obj2);
                    vlg.s sVar3 = (vlg.s) obj3;
                    uk9.h hVar5 = new uk9.h(sVar3, continuation, 18);
                    this.v = 1;
                    if (u0.b0(sVar3.X(), "ADD_RECIPIENT_BUTTON_TAG", hVar5, this) == aVar33) {
                        return aVar33;
                    }
                } else {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
