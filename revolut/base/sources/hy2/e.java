package hy2;

import cli.y;
import com.revolut.feature.apm.wero.impl.data.WeroPayService;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.due_day.CreditCardOfferSelectDueDayScreen;
import com.revolut.feature.learn.shared.impl.ui.course.overview.CourseOverviewScreenContract$InputData;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.data.SalarySwitchAssistantService;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.selected_assets.SelectedAssetsListScreen;
import dfj.w;
import efm.d0;
import hd.r;
import hib.n;
import i65.s;
import iaf.m;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineScope;
import m1c.o0;
import nyb.g0;
import nyb.h0;
import nyb.i0;
import q7c.p;
import rfm.x;
import skm.e0;
import skm.p0;
import u09.v;
import vkm.j2;
import vkm.q;
import vkm.z1;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f156703w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f156703w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e((f) this.f156703w, continuation, 0);
            case 1:
                return new e((hy3.j) this.f156703w, continuation, 1);
            case 2:
                return new e((hz6.k) this.f156703w, continuation, 2);
            case 3:
                return new e((com.revolut.feature.rev_points.impl.ui.earn.b) this.f156703w, continuation, 3);
            case 4:
                return new e((n) this.f156703w, continuation, 4);
            case 5:
                return new e((com.revolut.feature.learn.shared.impl.ui.course.overview.e) this.f156703w, continuation, 5);
            case 6:
                return new e((com.revolut.feature.rev_points.impl.ui.terms_review.flow.a) this.f156703w, continuation, 6);
            case 7:
                return new e((i3g.j) this.f156703w, continuation, 7);
            case 8:
                return new e((i4g.h) this.f156703w, continuation, 8);
            case 9:
                return new e((com.revolut.feature.apm.core.ui.impl.ui.transfer.review.a) this.f156703w, continuation, 9);
            case 10:
                return new e((i5b.j) this.f156703w, continuation, 10);
            case 11:
                return new e((s) this.f156703w, continuation, 11);
            case 12:
                return new e((com.revolut.feature.masav.impl.ui.review.a) this.f156703w, continuation, 12);
            case 13:
                return new e((com.revolut.feature.trading.managed_portfolios.impl.ui.details.c) this.f156703w, continuation, 13);
            case 14:
                return new e((com.revolut.feature.card_screen.impl.kompot.reactivate.b) this.f156703w, continuation, 14);
            case 15:
                e eVar = new e((CreditCardOfferSelectDueDayScreen) this.f156703w, continuation, 15);
                eVar.v = ((Number) obj2).intValue();
                return eVar;
            case 16:
                return new e((i84.j) this.f156703w, continuation, 16);
            case 17:
                return new e((i8e.k) this.f156703w, continuation, 17);
            case 18:
                return new e((i9d.k) this.f156703w, continuation, 18);
            case 19:
                return new e((SelectedAssetsListScreen) this.f156703w, continuation, 19);
            case 20:
                return new e((icc.b) this.f156703w, continuation, 20);
            case 21:
                return new e((r) this.f156703w, continuation, 21);
            case 22:
                return new e((com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.a) this.f156703w, continuation, 22);
            case 23:
                return new e((iga.j) this.f156703w, continuation, 23);
            case 24:
                return new e((ih2.c) this.f156703w, continuation, 24);
            case 25:
                return new e((ih8.i) this.f156703w, continuation, 25);
            case 26:
                return new e((fnc.s) this.f156703w, continuation, 26);
            case 27:
                return new e((ij4.j) this.f156703w, continuation, 27);
            case 28:
                return new e((ijc.k) this.f156703w, continuation, 28);
            default:
                return new e((com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.b) this.f156703w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 15:
                break;
        }
        return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v67, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objE;
        k09.n nVar;
        Object objB;
        Object objB2;
        Object objCreateQr;
        Object objEmailPayrollManager;
        ghb.d dVar;
        Object objJ;
        int i = this.u;
        int i2 = 2;
        int i3 = 25;
        int i5 = 22;
        int i6 = 0;
        ghb.b bVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        Object obj3 = this.f156703w;
        int i21 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                jhi.b bVarG = mo3.a.g(nim.a.v(((f) obj3).d.a(), new hy1.i(28)), null, new b(i2), 1);
                this.v = 1;
                Object objX = q.x(bVarG, this);
                return objX == aVar ? aVar : objX;
            case 1:
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
                this.v = 1;
                Object objA = hy3.j.a((hy3.j) obj3, this);
                return objA == aVar2 ? aVar2 : objA;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    o.b(obj2);
                    z1 z1Var = ((hz6.k) obj3).f157050q;
                    Unit unit = Unit.f186387a;
                    this.v = 1;
                    if (z1Var.emit(unit, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                com.revolut.feature.rev_points.impl.ui.earn.b bVar2 = (com.revolut.feature.rev_points.impl.ui.earn.b) obj3;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    o.b(obj2);
                    efm.b bVarG2 = ((jxb.l) bVar2.B.f220800a).f179127g.g(Unit.f186387a, false);
                    i0 i0Var = bVar2.f83803t;
                    o0 o0Var = o0.ACTIVATION;
                    d0 d0VarE = i0Var.f220798a.e();
                    h0 h0Var = new h0(i6, new g0(i0Var, o0Var, i21));
                    d0VarE.getClass();
                    pfm.a aVar5 = new pfm.a(d0VarE, h0Var, 4);
                    Intrinsics.checkNotNullExpressionValue(aVar5, "flatMapCompletable(...)");
                    efm.b bVarP = efm.b.p(bVarG2, aVar5);
                    Intrinsics.checkNotNullExpressionValue(bVarP, "mergeArray(...)");
                    this.v = 1;
                    if (nim.a.a(bVarP, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    if (((n) obj3).invoke(this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                com.revolut.feature.learn.shared.impl.ui.course.overview.e eVar = (com.revolut.feature.learn.shared.impl.ui.course.overview.e) obj3;
                CourseOverviewScreenContract$InputData courseOverviewScreenContract$InputData = eVar.f78000p;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    o.b(obj2);
                    String str = courseOverviewScreenContract$InputData.f77982c;
                    this.v = 1;
                    objE = nim.a.e(m70.a.g(eVar.f78002r.a(str), null, null, 3), this);
                    if (objE == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objE = obj2;
                }
                u09.q qVar = (u09.q) objE;
                if (qVar == null) {
                    return null;
                }
                v vVar = courseOverviewScreenContract$InputData.f77981b;
                switch (i09.n.f157333a[vVar.ordinal()]) {
                    case 1:
                        nVar = eVar.f78005w;
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        nVar = eVar.f78006x;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                nVar.K1(vVar, qVar);
                return qVar;
            case 6:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    o.b(obj2);
                    com.revolut.feature.rev_points.impl.ui.terms_review.flow.a aVar9 = (com.revolut.feature.rev_points.impl.ui.terms_review.flow.a) obj3;
                    i0c.e eVar2 = new i0c.e(aVar9, null);
                    this.v = 1;
                    if (aVar9.p2(this, eVar2) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    o.b(obj2);
                    i3g.j jVar = (i3g.j) obj3;
                    i3g.c cVar = jVar.f158217q;
                    String experienceId = jVar.o.f93129a;
                    ihm.f events = jVar.f158218r;
                    cVar.getClass();
                    Intrinsics.checkNotNullParameter(experienceId, "experienceId");
                    Intrinsics.checkNotNullParameter(events, "events");
                    efm.b bVarB = new lk0.d(new hw9.b(cVar, i3), new hq1.f(cVar, 17), new i30.a(cVar, i21), new x3g.g(experienceId, null), new ho6.n(experienceId, 11), new i2i.o(24), yk0.d.a()).b(events);
                    this.v = 1;
                    if (nim.a.a(bVarB, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
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
                h4g.k kVar = ((i4g.h) obj3).f158432b;
                this.v = 1;
                Object objA2 = kVar.a(this);
                return objA2 == aVar11 ? aVar11 : objA2;
            case 9:
                com.revolut.feature.apm.core.ui.impl.ui.transfer.review.a aVar12 = (com.revolut.feature.apm.core.ui.impl.ui.transfer.review.a) obj3;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    objB = pu7.a.B(aVar12.k, "MB_CONFIRM_TRANSFER_TASK_ID", new gca.l(aVar12, objArr == true ? 1 : 0, 21), this);
                    if (objB == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objB = obj2;
                }
                g52.c cVar2 = (g52.c) objB;
                if (cVar2 == null) {
                    return null;
                }
                aVar12.C2(new i52.f(cVar2, ((i52.b) ((j2) aVar12.A.f22677a).getValue()).d.getF62463a()));
                return Unit.f186387a;
            case 10:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 != 0) {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                i5b.j jVar2 = (i5b.j) obj3;
                i5b.i iVar = new i5b.i(jVar2, null);
                this.v = 1;
                Object objY2 = jVar2.Y2(this, iVar);
                return objY2 == aVar14 ? aVar14 : objY2;
            case 11:
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
                s sVar = (s) obj3;
                i65.r rVar = new i65.r(sVar, objArr2 == true ? 1 : 0, i21);
                this.v = 1;
                Object objB3 = pu7.a.B(sVar.k, "withdrawLoan", rVar, this);
                return objB3 == aVar15 ? aVar15 : objB3;
            case 12:
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
                com.revolut.feature.masav.impl.ui.review.a aVar17 = (com.revolut.feature.masav.impl.ui.review.a) obj3;
                gca.l lVar = new gca.l(aVar17, objArr3 == true ? 1 : 0, i5);
                this.v = 1;
                Object objP2 = aVar17.p2(this, lVar);
                return objP2 == aVar16 ? aVar16 : objP2;
            case 13:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 != 0) {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.trading.managed_portfolios.impl.ui.details.c cVar3 = (com.revolut.feature.trading.managed_portfolios.impl.ui.details.c) obj3;
                com.revolut.feature.trading.managed_portfolios.impl.ui.details.b bVar3 = new com.revolut.feature.trading.managed_portfolios.impl.ui.details.b(cVar3, null);
                this.v = 1;
                Object objB4 = pu7.a.B(cVar3.k, "open_benchmark_selection", bVar3, this);
                return objB4 == aVar18 ? aVar18 : objB4;
            case 14:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 != 0) {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.card_screen.impl.kompot.reactivate.b bVar4 = (com.revolut.feature.card_screen.impl.kompot.reactivate.b) obj3;
                a54.g gVar = new a54.g(bVar4, objArr4 == true ? 1 : 0, 26);
                this.v = 1;
                Object objP22 = bVar4.p2(this, gVar);
                return objP22 == aVar19 ? aVar19 : objP22;
            case 15:
                int i105 = this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i84.j jVar3 = (i84.j) ((CreditCardOfferSelectDueDayScreen) obj3).e3();
                int i106 = i105 + 1;
                y yVar = jVar3.f159443q;
                nu3.g gVar2 = ((i84.e) ((j2) yVar.f22677a).getValue()).f159435a;
                String title = gVar2.f219205a;
                String subtitle = gVar2.f219206b;
                int i107 = gVar2.d;
                List disabledDays = gVar2.e;
                List items = gVar2.f;
                String buttonTitle = gVar2.f219208g;
                String parameterKey = gVar2.f219209h;
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(disabledDays, "disabledDays");
                Intrinsics.checkNotNullParameter(items, "items");
                Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
                Intrinsics.checkNotNullParameter(parameterKey, "parameterKey");
                jVar3.H2(yVar, new i84.h(new nu3.g(title, subtitle, i106, i107, disabledDays, items, buttonTitle, parameterKey), 0));
                jVar3.n2(new cam.q(i106, 5, jVar3, objArr5 == true ? 1 : 0), new whi.b(6));
                return Unit.f186387a;
            case 16:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 != 0) {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                i84.j jVar4 = (i84.j) obj3;
                i84.i iVar2 = new i84.i(jVar4, objArr6 == true ? 1 : 0, i21);
                this.v = 1;
                Object objB5 = pu7.a.B(jVar4.k, "confirm due date", iVar2, this);
                return objB5 == aVar21 ? aVar21 : objB5;
            case 17:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 != 0) {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                i8e.k kVar2 = (i8e.k) obj3;
                i8e.j jVar5 = new i8e.j(kVar2, objArr7 == true ? 1 : 0, i21);
                this.v = 1;
                Object objB6 = pu7.a.B(kVar2.k, "UPDATE_SUB_ACCOUNT_NAME", jVar5, this);
                return objB6 == aVar22 ? aVar22 : objB6;
            case 18:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    o.b(obj2);
                    lde.f fVar = ((i9d.k) obj3).f159643s;
                    this.v = 1;
                    Object objEmit = fVar.e.emit(new Integer(Integer.MAX_VALUE), this);
                    if (objEmit != aVar23) {
                        objEmit = Unit.f186387a;
                    }
                    if (objEmit == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 19:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    o.b(obj2);
                    m mVar = (m) ((SelectedAssetsListScreen) obj3).Q.getValue();
                    this.v = 1;
                    iaf.r rVar2 = (iaf.r) mVar;
                    rVar2.getClass();
                    if (pu7.a.B(rVar2.k, "SelectedAssetsListScreenModel_onContinueButtonClicked", new a54.g(rVar2, objArr8 == true ? 1 : 0, 27), this) == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 != 0) {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                b6c.c cVar4 = ((icc.b) obj3).f160238b;
                this.v = 1;
                Object objA3 = ((p) cVar4).a(this);
                return objA3 == aVar25 ? aVar25 : objA3;
            case 21:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    o.b(obj2);
                    ee7.g gVar3 = (ee7.g) ((r) obj3).f151366c;
                    this.v = 1;
                    if (gVar3.b(this) == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 22:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 != 0) {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.a aVar28 = (com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.a) obj3;
                gca.l lVar2 = new gca.l(aVar28, objArr9 == true ? 1 : 0, i3);
                this.v = 1;
                Object objB7 = pu7.a.B(aVar28.k, "create_reservation", lVar2, this);
                return objB7 == aVar27 ? aVar27 : objB7;
            case 23:
                iga.j jVar6 = (iga.j) obj3;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    o.b(obj2);
                    ega.d dVar2 = jVar6.f161111r;
                    this.v = 1;
                    objB2 = dVar2.b(this);
                    if (objB2 == aVar29) {
                        return aVar29;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objB2 = obj2;
                }
                dga.d dVar3 = (dga.d) objB2;
                if (Intrinsics.f(dVar3, dga.a.f114610a)) {
                    return jVar6.I2();
                }
                if (dVar3 instanceof dga.b) {
                    jVar6.H2(jVar6.f161113t, new i9e.a((dga.b) dVar3, i5));
                    return Unit.f186387a;
                }
                if (!(dVar3 instanceof dga.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                jVar6.C2(new iga.g(((dga.c) dVar3).f114612a));
                return Unit.f186387a;
            case 24:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    o.b(obj2);
                    WeroPayService weroPayService = ((ih2.c) obj3).f161288a;
                    jh2.d dVar4 = new jh2.d(new jh2.e());
                    this.v = 1;
                    objCreateQr = weroPayService.createQr(dVar4, this);
                    if (objCreateQr == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objCreateQr = obj2;
                }
                jh2.b bVar5 = (jh2.b) objCreateQr;
                Intrinsics.checkNotNullParameter(bVar5, "<this>");
                return new jh2.q(bVar5.getWero().getShareUrl());
            case 25:
                ih8.i iVar3 = (ih8.i) obj3;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 == 0) {
                    o.b(obj2);
                    om4.d0 d0Var = iVar3.o;
                    this.v = 1;
                    if (d0Var.b(this) == aVar31) {
                        return aVar31;
                    }
                } else {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                iVar3.C2(lg8.b.f195084a);
                return Unit.f186387a;
            case 26:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 == 0) {
                    o.b(obj2);
                    jhb.c cVar5 = new jhb.c();
                    SalarySwitchAssistantService salarySwitchAssistantService = (SalarySwitchAssistantService) ((fnc.s) obj3).f136657b;
                    this.v = 1;
                    objEmailPayrollManager = salarySwitchAssistantService.emailPayrollManager(cVar5, this);
                    if (objEmailPayrollManager == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objEmailPayrollManager = obj2;
                }
                jhb.i iVar4 = (jhb.i) objEmailPayrollManager;
                Intrinsics.checkNotNullParameter(iVar4, "<this>");
                String str2 = iVar4.f174197a;
                String str3 = iVar4.f174198b;
                ghb.d[] dVarArrValues = ghb.d.values();
                int length = dVarArrValues.length;
                int i119 = 0;
                while (true) {
                    if (i119 < length) {
                        dVar = dVarArrValues[i119];
                        if (!a0.z(dVar.name(), str3, true)) {
                            i119++;
                        }
                    } else {
                        dVar = null;
                    }
                }
                if (dVar == null) {
                    dVar = ghb.d.UNKNOWN;
                }
                String str4 = iVar4.f174199c;
                ghb.b[] bVarArrValues = ghb.b.values();
                int length2 = bVarArrValues.length;
                while (true) {
                    if (i6 < length2) {
                        ghb.b bVar6 = bVarArrValues[i6];
                        if (a0.z(bVar6.name(), str4, true)) {
                            bVar = bVar6;
                        } else {
                            i6++;
                        }
                    }
                }
                if (bVar == null) {
                    bVar = ghb.b.UNKNOWN;
                }
                jhb.g gVar4 = iVar4.d;
                return new lhb.b(str2, dVar, bVar, new lhb.a(gVar4.f174195a, gVar4.f174196b));
            case 27:
                ij4.j jVar7 = (ij4.j) obj3;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i120 = this.v;
                if (i120 == 0) {
                    o.b(obj2);
                    hw3.h0 h0Var2 = jVar7.o;
                    this.v = 1;
                    m24.a aVar34 = h0Var2.f156071a;
                    aVar34.getClass();
                    lo.c cVar6 = new lo.c((Object) aVar34, (Continuation) (objArr10 == true ? 1 : 0), 16);
                    p0 p0Var = p0.f264001a;
                    objJ = e0.J(elm.f.f127540b, cVar6, this);
                    if (objJ == aVar33) {
                        return aVar33;
                    }
                } else {
                    if (i120 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objJ = obj2;
                }
                jVar7.H2(jVar7.f161707p, new i2l.e0((List) objJ, 7));
                return Unit.f186387a;
            case 28:
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i121 = this.v;
                if (i121 != 0) {
                    if (i121 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                ijc.k kVar3 = (ijc.k) obj3;
                this.v = 1;
                x xVar = new x(ue0.e.s(kVar3.f161764p.b(kVar3.o.f84982a, kub.a.NETWORK_IMMEDIATE), zhm.h0.f322473a));
                Intrinsics.checkNotNullExpressionValue(xVar, "onErrorComplete(...)");
                Object objI = nim.a.i(xVar, this);
                return objI == aVar35 ? aVar35 : objI;
            default:
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i122 = this.v;
                if (i122 == 0) {
                    o.b(obj2);
                    w wVar = ((com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.b) obj3).f101123r;
                    this.v = 1;
                    if (w.e(wVar, this) == aVar36) {
                        return aVar36;
                    }
                } else {
                    if (i122 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
