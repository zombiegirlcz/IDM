package s64;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.apm.multibanco.impl.via_verde.data.ViaVerdeEnrollment;
import com.revolut.feature.contacts.impl.data.network.UserService;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.manage_details.ManageCoBorrowerDetailsParcel;
import com.revolut.feature.credit.loan.api.models.rev10.LoanBackupCard;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.subaccount.impl.ui.create.flow.group.c;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import dfj.z2;
import efm.d0;
import et6.a1;
import et6.t0;
import et6.w;
import ft3.h1;
import gim.i;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kp0.w0;
import ku1.v;
import lk0.h;
import nii.c0;
import nii.h0;
import nii.u1;
import nii.y0;
import p54.e;
import rnb.u;
import rtl.y;
import s6b.m;
import s85.k;
import s8d.l;
import s8f.g;
import s9b.p;
import sa6.j0;
import sbb.r;
import scc.j;
import sfj.d;
import sgd.f;
import sh2.s;
import skm.e0;
import skm.p0;
import sl3.q;
import sl5.h;
import vkm.j2;
import vkm.z1;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f260131w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f260131w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a((b1e.a) this.f260131w, continuation, 0);
            case 1:
                return new a((com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.selectday_v2.a) this.f260131w, continuation, 1);
            case 2:
                return new a((m) this.f260131w, continuation, 2);
            case 3:
                return new a((com.revolut.feature.shared.branding.impl.ui.settings.a) this.f260131w, continuation, 3);
            case 4:
                return new a((c) this.f260131w, continuation, 4);
            case 5:
                return new a((k) this.f260131w, continuation, 5);
            case 6:
                return new a((l) this.f260131w, continuation, 6);
            case 7:
                return new a((g) this.f260131w, continuation, 7);
            case 8:
                return new a((s92.k) this.f260131w, continuation, 8);
            case 9:
                return new a((s94.b) this.f260131w, continuation, 9);
            case 10:
                return new a((p) this.f260131w, continuation, 10);
            case 11:
                return new a((j0) this.f260131w, continuation, 11);
            case 12:
                a aVar = new a((sai.k) this.f260131w, continuation, 12);
                aVar.v = ((Number) obj2).intValue();
                return aVar;
            case 13:
                return new a((r) this.f260131w, continuation, 13);
            case 14:
                return new a((j) this.f260131w, continuation, 14);
            case 15:
                return new a((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.guests_reviews.a) this.f260131w, continuation, 15);
            case 16:
                return new a((sfj.b) this.f260131w, continuation, 16);
            case 17:
                return new a((d) this.f260131w, continuation, 17);
            case 18:
                return new a((f) this.f260131w, continuation, 18);
            case 19:
                return new a((sgg.j) this.f260131w, continuation, 19);
            case 20:
                return new a((com.revolut.retail.feature.pricing_plans.ui.impl.flows.cancel_student_benefits.a) this.f260131w, continuation, 20);
            case 21:
                return new a((s) this.f260131w, continuation, 21);
            case 22:
                return new a((sj1.b) this.f260131w, continuation, 22);
            case 23:
                return new a((sjk.g) this.f260131w, continuation, 23);
            case 24:
                return new a((q) this.f260131w, continuation, 24);
            case 25:
                return new a((h) this.f260131w, continuation, 25);
            case 26:
                return new a((slj.k) this.f260131w, continuation, 26);
            case 27:
                return new a((sm0.c) this.f260131w, continuation, 27);
            case 28:
                return new a((sm6.p) this.f260131w, continuation, 28);
            default:
                return new a((snk.r) this.f260131w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 12:
                break;
        }
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v128, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r0v131, types: [java.util.ArrayList] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object obj3;
        Object objX;
        Object objB0;
        Object objA;
        Object objA2;
        Object objS;
        aii.r rVar;
        Object objB;
        Object objQ;
        Object objRandomUUID;
        int i = this.u;
        int i2 = 3;
        int i3 = 21;
        int i5 = 24;
        int i6 = 5;
        int i21 = 0;
        boolean z = false;
        boolean z3 = false;
        Continuation continuation = null;
        Object obj4 = this.f260131w;
        int i22 = 1;
        switch (i) {
            case 0:
                b1e.a aVar = (b1e.a) obj4;
                e eVar = (e) aVar.f11797c;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 != 0) {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                pw3.b bVar = (pw3.b) aVar.f11796b;
                h1 h1VarF = w0.F((CreditApplicationPluginFlowContract$Configuration) eVar.n0().get());
                String str = ((ManageCoBorrowerDetailsParcel) ((od0.i) eVar.a().get()).c()).f67238a;
                this.v = 1;
                t24.f fVar = bVar.f240318a;
                fVar.getClass();
                sma.f fVar2 = new sma.f(6, fVar, h1VarF, str, (Continuation) null);
                p0 p0Var = p0.f264001a;
                Object objJ = e0.J(elm.f.f127540b, fVar2, this);
                return objJ == aVar2 ? aVar2 : objJ;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.selectday_v2.a aVar4 = (com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.selectday_v2.a) obj4;
                s65.q qVar = new s65.q(aVar4, continuation, i22);
                this.v = 1;
                Object objP2 = aVar4.p2(this, qVar);
                return objP2 == aVar3 ? aVar3 : objP2;
            case 2:
                m mVar = (m) obj4;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    o.b(obj2);
                    rik.e eVar2 = new rik.e(mVar, continuation, 15);
                    this.v = 1;
                    if (mVar.p2(this, eVar2) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                mVar.H2(mVar.f260210r, new rk.b(z ? 1 : 0, i6));
                mVar.C2(s6b.h.f260200a);
                return Unit.f186387a;
            case 3:
                com.revolut.feature.shared.branding.impl.ui.settings.a aVar6 = (com.revolut.feature.shared.branding.impl.ui.settings.a) obj4;
                t0 t0Var = aVar6.o;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    t0Var.getClass();
                    obj3 = "";
                    if ("" == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    obj3 = obj2;
                }
                String id10 = (String) obj3;
                aVar6.H2(aVar6.f86085y, new rvc.k(id10, 13));
                jhi.b bVarG = mo3.a.g(t0.b(aVar6.o), null, new s20.c(29), 1);
                vkm.d dVarA = t0Var.a();
                t0Var.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                jhi.b bVarG2 = mo3.a.g(nim.a.v(((a1) t0Var.f129330c).b(), new w(i2)), null, new s6d.r(i21), 1);
                t0Var.getClass();
                od0.i.Companion.getClass();
                return yji.l.a1(aVar6, ta6.a.g(bVarG, dVarA, bVarG2, zi0.c.i(od0.i.f224256b), new b88.m(i6, i22, continuation)), new s6d.s(aVar6, continuation, z3 ? 1 : 0), null, new s6d.s(aVar6, continuation, i22), 2);
            case 4:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    o.b(obj2);
                    c cVar = (c) obj4;
                    com.revolut.feature.subaccount.impl.ui.create.flow.group.b bVar2 = new com.revolut.feature.subaccount.impl.ui.create.flow.group.b(cVar, null);
                    this.v = 1;
                    if (cVar.p2(this, bVar2) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                k kVar = (k) obj4;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    o.b(obj2);
                    vkm.d dVarB = rd0.e.b(m70.a.g(((y45.f) kVar.f260895p).l(((s85.f) kVar.t2()).f260889a, w4l.j.f294644c), null, new s6d.r(14), 1));
                    this.v = 1;
                    objX = vkm.q.x(dVarB, this);
                    if (objX == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objX = obj2;
                }
                if (objX instanceof LoanBackupCard.None) {
                    kVar.u2();
                }
                return Unit.f186387a;
            case 6:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    o.b(obj2);
                    l lVar = (l) obj4;
                    rik.e eVar3 = new rik.e(lVar, continuation, 16);
                    this.v = 1;
                    if (lVar.p2(this, eVar3) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 != 0) {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                g gVar = (g) obj4;
                rik.e eVar4 = new rik.e(gVar, continuation, 17);
                this.v = 1;
                Object objB2 = pu7.a.B(gVar.k, "reload", eVar4, this);
                return objB2 == aVar11 ? aVar11 : objB2;
            case 8:
                s92.k kVar2 = (s92.k) obj4;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    o.b(obj2);
                    rik.e eVar5 = new rik.e(kVar2, continuation, 18);
                    this.v = 1;
                    objB0 = u0.b0(kVar2.X(), "EnrollmentRegistrationScreenContract_CTA_BUTTON_TAG", eVar5, this);
                    if (objB0 == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objB0 = obj2;
                }
                kVar2.C2(new s92.g((ViaVerdeEnrollment) objB0));
                return Unit.f186387a;
            case 9:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 != 0) {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                s94.b bVar3 = (s94.b) obj4;
                s94.a aVar14 = new s94.a(bVar3, continuation, i22);
                this.v = 1;
                Object objB3 = pu7.a.B(bVar3.k, "reset direct debit", aVar14, this);
                return objB3 == aVar13 ? aVar13 : objB3;
            case 10:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 != 0) {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                p pVar = (p) obj4;
                s9b.o oVar = new s9b.o(pVar, null);
                this.v = 1;
                Object objP22 = pVar.p2(this, oVar);
                return objP22 == aVar15 ? aVar15 : objP22;
            case 11:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 != 0) {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                this.v = 1;
                Object objC = j0.c((j0) obj4, this);
                return objC == aVar16 ? aVar16 : objC;
            case 12:
                int i103 = this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                sai.k kVar3 = (sai.k) obj4;
                kVar3.H2(kVar3.u, new l2c.l(i103, 19));
                return Unit.f186387a;
            case 13:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 != 0) {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                r rVar2 = (r) obj4;
                rik.e eVar6 = new rik.e(rVar2, continuation, i3);
                this.v = 1;
                Object objB4 = pu7.a.B(rVar2.e, "checkAndShowPendingPayment", eVar6, this);
                return objB4 == aVar18 ? aVar18 : objB4;
            case 14:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    o.b(obj2);
                    z1 z1Var = ((j) obj4).f261712s;
                    this.v = 1;
                    if (z1Var.emit(h.b.f196176a, this) == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    o.b(obj2);
                    com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.guests_reviews.a aVar21 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.guests_reviews.a) obj4;
                    sdg.a aVar22 = aVar21.f93992q;
                    String propertyId = aVar21.o.f93989a;
                    ihm.f events = aVar21.f93994s;
                    aVar22.getClass();
                    Intrinsics.checkNotNullParameter(propertyId, "propertyId");
                    Intrinsics.checkNotNullParameter(events, "events");
                    efm.b bVarB = new lk0.d(new scl.h(aVar22, 2), new y(aVar22, 25), new scl.e(aVar22, i6), new bgi.a(propertyId, 0), new rvc.k(propertyId, 28), new sa6.y(i5), yk0.d.a()).b(events);
                    this.v = 1;
                    if (nim.a.a(bVarB, this) == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 16:
                sfj.b bVar4 = (sfj.b) obj4;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    o.b(obj2);
                    z2 z2Var = bVar4.f262495t;
                    this.v = 1;
                    objA = z2Var.a(this);
                    if (objA == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objA = obj2;
                }
                PromptMarketingScreenContract$InputData promptMarketingScreenContract$InputData = (PromptMarketingScreenContract$InputData) objA;
                if (promptMarketingScreenContract$InputData == null) {
                    return Unit.f186387a;
                }
                j2 j2Var = bVar4.v;
                j2Var.getClass();
                j2Var.g(null, promptMarketingScreenContract$InputData);
                return Unit.f186387a;
            case 17:
                d dVar = (d) obj4;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    o.b(obj2);
                    z2 z2Var2 = dVar.o;
                    this.v = 1;
                    objA2 = z2Var2.a(this);
                    if (objA2 == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objA2 = obj2;
                }
                PromptMarketingScreenContract$InputData promptMarketingScreenContract$InputData2 = (PromptMarketingScreenContract$InputData) objA2;
                if (promptMarketingScreenContract$InputData2 == null) {
                    return Unit.f186387a;
                }
                j2 j2Var2 = dVar.f262497q;
                j2Var2.getClass();
                j2Var2.g(null, promptMarketingScreenContract$InputData2);
                return Unit.f186387a;
            case 18:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 != 0) {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                f fVar3 = (f) obj4;
                sb4.i iVar = new sb4.i(fVar3, continuation, i6);
                this.v = 1;
                Object objB5 = pu7.a.B(fVar3.k, "rename-watchlist", iVar, this);
                return objB5 == aVar25 ? aVar25 : objB5;
            case 19:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 != 0) {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                sgg.j jVar = (sgg.j) obj4;
                sgg.i iVar2 = new sgg.i(jVar, continuation, i22);
                this.v = 1;
                Object objB6 = pu7.a.B(jVar.k, "REGISTER_TAX_ID_ACCOUNT_TASK_ID", iVar2, this);
                return objB6 == aVar26 ? aVar26 : objB6;
            case 20:
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.cancel_student_benefits.a aVar27 = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.cancel_student_benefits.a) obj4;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    o.b(obj2);
                    c0 c0VarA = nii.i.a();
                    v vVar = new v(20);
                    o9a.v vVar2 = new o9a.v(9);
                    u uVar = new u(1, aVar27.o, cha.c.class, "withdrawStudent", "withdrawStudent(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 25);
                    this.v = 1;
                    objS = n14.k.S(aVar27.X(), c0VarA, vVar2, vVar, uVar, this);
                    if (objS == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objS = obj2;
                }
                nii.h hVar = (nii.h) objS;
                if (hVar instanceof nii.g) {
                    rVar = sgk.d.f262666a;
                } else {
                    if (!(hVar instanceof nii.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    rVar = sgk.c.f262665a;
                }
                aVar27.C2(rVar);
                return Unit.f186387a;
            case 21:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 != 0) {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                s sVar = (s) obj4;
                sh2.q qVar2 = new sh2.q(sVar, null);
                this.v = 1;
                Object objY2 = sVar.Y2(this, qVar2);
                return objY2 == aVar29 ? aVar29 : objY2;
            case 22:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    o.b(obj2);
                    qm.e eVar7 = ((sj1.b) obj4).f263671a;
                    this.v = 1;
                    vj1.b bVar5 = (vj1.b) eVar7.f247740b;
                    bVar5.getClass();
                    uxe.l lVar2 = new uxe.l(bVar5, continuation, i5);
                    p0 p0Var2 = p0.f264001a;
                    Object objJ2 = e0.J(elm.f.f127540b, lVar2, this);
                    Object obj5 = objJ2;
                    if (objJ2 != aVar30) {
                        obj5 = Unit.f186387a;
                    }
                    if (obj5 != aVar30) {
                        obj5 = Unit.f186387a;
                    }
                    if (obj5 == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 23:
                sjk.g gVar2 = (sjk.g) obj4;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 == 0) {
                    o.b(obj2);
                    rik.e eVar8 = new rik.e(gVar2, continuation, i5);
                    this.v = 1;
                    if (gVar2.p2(this, eVar8) == aVar31) {
                        return aVar31;
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                PricingPlanSubscription pricingPlanSubscription = (PricingPlanSubscription) zi0.c.I(((sjk.b) ((j2) gVar2.f263741q.f22677a).getValue()).f263736a);
                int i115 = R$string.premium_cancel_downgrade_status_title;
                gVar2.f263740p.getClass();
                return yji.l.b1(gVar2, gVar2.X1(new y0("CANCEL_DOWNGRADE_SUCCESS", new nii.j0((Clause) new TextLocalisedClause(i115, zhm.u.c(sjk.h.a(pricingPlanSubscription)), null, 12), (Clause) new TextLocalisedClause(R$string.premium_cancel_downgrade_status_subtitle, zhm.u.c(sjk.h.c(pricingPlanSubscription)), null, 12), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092), false, 4)), null, new se4.c(gVar2, continuation, 6), 3);
            case 24:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    o.b(obj2);
                    UserService userService = ((q) obj4).f264127a;
                    this.v = 1;
                    if (userService.notifyFriends(this) == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 25:
                Object arrayList = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 == 0) {
                    o.b(obj2);
                    d0 d0VarJ = osg.b.j(((sl5.h) obj4).f264153a, io3.l.CURRENT, null, io3.i.INTERNAL, io3.j.PERSONAL, null, null, 50);
                    this.v = 1;
                    objB = nim.a.b(d0VarJ, this);
                    if (objB != arrayList) {
                    }
                    return arrayList;
                }
                if (i117 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
                objB = obj2;
                Intrinsics.checkNotNullExpressionValue(objB, "await(...)");
                arrayList = new ArrayList();
                for (Object obj6 : (Iterable) objB) {
                    if (r6.b.B(xi0.b.Companion, ((io3.d) obj6).f163147c)) {
                        arrayList.add(obj6);
                    }
                }
                return arrayList;
            case 26:
                slj.k kVar4 = (slj.k) obj4;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 == 0) {
                    o.b(obj2);
                    iuf.y yVar = new iuf.y(kVar4, i3);
                    kVar4.f264219r.getClass();
                    c0 c0VarA2 = skj.a.a();
                    slj.j jVar2 = new slj.j(kVar4, continuation, i22);
                    this.v = 1;
                    objQ = n14.k.Q(kVar4, c0VarA2, null, yVar, jVar2, this, 2);
                    if (objQ == aVar33) {
                        return aVar33;
                    }
                } else {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objQ = obj2;
                }
                nii.e eVar9 = (nii.e) objQ;
                if (eVar9 instanceof nii.d) {
                    pfj.b bVar6 = (pfj.b) ((nii.d) eVar9).f216133a;
                    kVar4.C2(new slj.f(bVar6.f235603c, bVar6.f235601a.f100488a));
                }
                return Unit.f186387a;
            case 27:
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i119 = this.v;
                if (i119 == 0) {
                    o.b(obj2);
                    nm0.b bVar7 = ((sm0.c) obj4).f264303b;
                    this.v = 1;
                    bVar7.getClass();
                    objRandomUUID = UUID.randomUUID();
                    Intrinsics.checkNotNullExpressionValue(objRandomUUID, "randomUUID(...)");
                    if (objRandomUUID == aVar34) {
                        return aVar34;
                    }
                } else {
                    if (i119 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objRandomUUID = obj2;
                }
                return ((UUID) objRandomUUID).toString();
            case 28:
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i120 = this.v;
                if (i120 == 0) {
                    o.b(obj2);
                    sm6.p pVar2 = (sm6.p) obj4;
                    kg6.a aVar36 = pVar2.f264378p;
                    boolean z4 = pVar2.o.f264372c != null;
                    this.v = 1;
                    th6.h hVar2 = aVar36.f183920a;
                    hVar2.getClass();
                    Object objD = hVar2.f271278c.d(z4 ? "mcy_upi_app" : "upi_app", false, this);
                    if (objD != aVar35) {
                        objD = Unit.f186387a;
                    }
                    if (objD != aVar35) {
                        objD = Unit.f186387a;
                    }
                    if (objD == aVar35) {
                        return aVar35;
                    }
                } else {
                    if (i120 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                int i121 = this.v;
                if (i121 != 0) {
                    if (i121 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                snk.r rVar3 = (snk.r) obj4;
                rik.e eVar10 = new rik.e(rVar3, continuation, 26);
                this.v = 1;
                Object objB7 = pu7.a.B(rVar3.k, "terms_loading", eVar10, this);
                return objB7 == aVar37 ? aVar37 : objB7;
        }
    }
}
