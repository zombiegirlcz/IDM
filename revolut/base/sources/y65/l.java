package y65;

import a41.v0;
import android.net.Uri;
import bjl.d0;
import bjl.n0;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings;
import com.revolut.feature.freelancer.impl.network.services.InvoiceTemplateService;
import com.revolut.feature.insurance_credit.impl.data.network.InsuranceCreditService;
import com.revolut.feature.payment.counterparty.impl.data.network.PaymentCounterpartyService;
import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo;
import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplate;
import com.revolut.feature.staking.impl.service.general.StakingService;
import com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$MoveMoneyProcessState;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ExternalDestination;
import ft3.h1;
import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import nii.c0;
import nii.j0;
import nii.n1;
import o9a.v;
import org.jmrtd.lds.LDSFile;
import r9d.d;
import skm.e0;
import skm.g0;
import te0.w;
import y20.a1;
import ybh.m0;
import zh9.u0;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f311169w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f311170x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f311171y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = 28;
        this.f311171y = aVar;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [gim.i, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r1v6, types: [gim.i, kotlin.jvm.functions.Function2] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l((com.revolut.feature.credit.loan.impl.ui.rev10.instalmentdetails.a) this.f311169w, (LoanDetails) this.f311170x, (dj0.d) this.f311171y, continuation, 0);
            case 1:
                return new l((y74.d) this.f311169w, (String) this.f311170x, (String) this.f311171y, continuation, 1);
            case 2:
                return new l((com.revolut.feature_move_money.impl.flow.e) this.f311169w, (String) this.f311170x, (MoveMoneyFlowContract$MoveMoneyProcessState) this.f311171y, continuation, 2);
            case 3:
                return new l((y8j.f) this.f311170x, (xi0.b) this.f311171y, continuation, 3);
            case 4:
                return new l((y9d.e) this.f311169w, (String) this.f311170x, (com.revolut.feature.shared.invoices.api.domain.model.a) this.f311171y, continuation, 4);
            case 5:
                l lVar = new l((yb5.e) this.f311170x, (String) this.f311171y, continuation, 5);
                lVar.f311169w = obj2;
                return lVar;
            case 6:
                return new l((com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b) this.f311169w, (dii.g) this.f311170x, (dj0.d) this.f311171y, continuation, 6);
            case 7:
                return new l((com.revolut.feature.retail.private_banking.impl.ui.deposit_assets.flow.b) this.f311169w, (adb.j) this.f311170x, (yki.b) this.f311171y, continuation, 7);
            case 8:
                return new l((com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.b) this.f311169w, (String) this.f311170x, (BigDecimal) this.f311171y, continuation, 8);
            case 9:
                l lVar2 = new l((yji.l) this.f311170x, (Function2) this.f311171y, continuation);
                lVar2.f311169w = obj2;
                return lVar2;
            case 10:
                l lVar3 = new l((yji.n) this.f311170x, (Function2) this.f311171y, continuation);
                lVar3.f311169w = obj2;
                return lVar3;
            case 11:
                return new l((yn9.c) this.f311170x, (String) this.f311171y, continuation, 11);
            case 12:
                return new l((ynb.r) this.f311169w, (String) this.f311170x, (String) this.f311171y, continuation, 12);
            case 13:
                return new l((ys7.a) this.f311169w, (String) this.f311170x, (String) this.f311171y, continuation, 13);
            case 14:
                return new l((com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_details.a) this.f311169w, (String) this.f311170x, (String) this.f311171y, continuation, 14);
            case 15:
                return new l((yvd.c) this.f311169w, (String) this.f311170x, (zvd.a) this.f311171y, continuation, 15);
            case 16:
                return new l((com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c) this.f311169w, (Ref$ObjectRef) this.f311170x, (bjl.q) this.f311171y, continuation, 16);
            case 17:
                return new l((com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c) this.f311169w, (Ref$ObjectRef) this.f311170x, (d0) this.f311171y, continuation, 17);
            case 18:
                return new l((com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c) this.f311169w, (n0) this.f311170x, (Ref$ObjectRef) this.f311171y, continuation, 18);
            case 19:
                return new l((yx6.b) this.f311169w, (FreelancerInvoiceSettings) this.f311170x, (wx6.h) this.f311171y, continuation, 19);
            case 20:
                return new l((yx6.g) this.f311169w, (FreelancerInvoice) this.f311170x, (wx6.h) this.f311171y, continuation, 20);
            case 21:
                return new l((yx6.g) this.f311169w, (FreelancerInvoiceSettings) this.f311170x, (wx6.h) this.f311171y, continuation, 21);
            case 22:
                return new l((com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.documents.c) this.f311169w, (v44.j) this.f311170x, (yki.b) this.f311171y, continuation, 22);
            case 23:
                return new l((z1l.d) this.f311169w, (String) this.f311170x, (Map) this.f311171y, continuation, 23);
            case 24:
                return new l((z24.a) this.f311169w, (h1) this.f311170x, (jy3.a) this.f311171y, continuation, 24);
            case 25:
                return new l((z24.a) this.f311169w, (String) this.f311170x, (jy3.a) this.f311171y, continuation, 25);
            case 26:
                return new l((com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.assessment.f) this.f311169w, (String) this.f311170x, (String) this.f311171y, continuation, 26);
            case 27:
                return new l((z31.c) this.f311170x, (v0) this.f311171y, continuation, 27);
            case 28:
                l lVar4 = new l((com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.a) this.f311171y, continuation);
                lVar4.f311170x = obj2;
                return lVar4;
            default:
                l lVar5 = new l((List) this.f311170x, (z6l.s) this.f311171y, continuation, 29);
                lVar5.f311169w = obj2;
                return lVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((l) create((LoanDetails) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r10v10, types: [gim.i, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r10v9, types: [gim.i, kotlin.jvm.functions.Function2] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objP;
        Object objX;
        Object objC;
        xi0.b bVar;
        ArrayList arrayList;
        Object objUpdateTemplate;
        Object counterpartyById;
        Object objCancelInsurance;
        Object objConfirmAddon;
        Object addonCalculatorConfig;
        Object objA;
        z31.c cVar;
        od0.h hVar;
        Object objB;
        int i = this.u;
        int i2 = 0;
        int i3 = 19;
        int i5 = 10;
        Object obj3 = this.f311171y;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.loan.impl.ui.rev10.instalmentdetails.a aVar2 = (com.revolut.feature.credit.loan.impl.ui.rev10.instalmentdetails.a) this.f311169w;
                wc2.b bVar2 = new wc2.b(aVar2, (LoanDetails) this.f311170x, (dj0.d) obj3, (Continuation) null, 13);
                this.v = 1;
                Object objB2 = pu7.a.B(aVar2.k, "navigate to repayment", bVar2, this);
                return objB2 == aVar ? aVar : objB2;
            case 1:
                y74.d dVar = (y74.d) this.f311169w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    String str = (String) this.f311170x;
                    this.v = 1;
                    dVar.getClass();
                    objP = n14.k.P(dVar.q2(), new c0(new TextLocalisedClause(R$string.credit_application_offer_document_loading_progress_title, null, null, 14), null, null, false, null, false, false, null, 2046), new v(i3), new up4.h(13), new y74.c(dVar, str, null), this);
                    if (objP == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objP = obj2;
                }
                nii.e eVar = (nii.e) objP;
                if (eVar instanceof nii.d) {
                    nii.d dVar2 = (nii.d) eVar;
                    n1 n1Var = dVar2.f216134b;
                    if (n1Var == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    if (n1Var.a() instanceof j0) {
                        Object obj4 = dVar2.f216133a;
                        Intrinsics.checkNotNullExpressionValue(obj4, "<get-data>(...)");
                        File file = (File) obj4;
                        String str2 = (String) obj3;
                        Uri uriI = ((a80.h) dVar.f311345m).i(file);
                        Intrinsics.checkNotNullParameter(file, "file");
                        String strD = o80.c.d(file);
                        List listK = zhm.v.k(1, 1073741824);
                        if (dVar.f311346n.a(strD, uriI, listK)) {
                            Iterator it8 = listK.iterator();
                            if (!it8.hasNext()) {
                                throw new UnsupportedOperationException("Empty collection can't be reduced.");
                            }
                            Object next = it8.next();
                            while (it8.hasNext()) {
                                next = Integer.valueOf(((Number) next).intValue() | ((Number) it8.next()).intValue());
                            }
                            dVar.A2(new ExternalDestination.ImplicitActivity("android.intent.action.VIEW", null, uriI, ((Number) next).intValue(), strD, 398));
                        } else {
                            String strR = a0.d.r(str2, ".pdf");
                            Intrinsics.checkNotNullParameter(file, "file");
                            dVar.A2(new BridgeDestination(dVar.o.h(new tqi.c(strR, null, new tqi.b(strR, lim.m.d(file)), null, LDSFile.EF_DG2_TAG))));
                        }
                    }
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature_move_money.impl.flow.e eVar2 = (com.revolut.feature_move_money.impl.flow.e) this.f311169w;
                    String str3 = (String) this.f311170x;
                    com.revolut.feature_move_money.impl.flow.d dVar3 = new com.revolut.feature_move_money.impl.flow.d(eVar2, (MoveMoneyFlowContract$MoveMoneyProcessState) obj3, str3, null);
                    this.v = 1;
                    if (u0.b0(eVar2.X(), str3, dVar3, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                y8j.f fVar = (y8j.f) this.f311170x;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    vkm.d dVarB = rd0.e.b(m70.a.g(fVar.f311667n.a(), null, new n(i5), 1));
                    this.v = 1;
                    objX = vkm.q.x(dVarB, this);
                    if (objX == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i32 != 1) {
                        if (i32 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = (xi0.b) this.f311169w;
                        yhm.o.b(obj2);
                        objC = obj2;
                        qta.f fVar2 = (qta.f) objC;
                        w8b.c cVar2 = fVar.f311668p;
                        Intrinsics.h(bVar);
                        Intrinsics.h(fVar2);
                        return fVar.A2(cVar2.a(fVar2, (xi0.b) obj3, bVar));
                    }
                    yhm.o.b(obj2);
                    objX = obj2;
                }
                xi0.b bVar3 = (xi0.b) objX;
                efm.r rVarA0 = w.a0(rd0.e.c(((a9j.g) fVar.o).f2680g.f2266b, kotlin.coroutines.g.f186406a), new y66.p(22));
                this.f311169w = bVar3;
                this.v = 2;
                objC = nim.a.c(rVarA0, this);
                if (objC == aVar5) {
                    return aVar5;
                }
                bVar = bVar3;
                qta.f fVar22 = (qta.f) objC;
                w8b.c cVar22 = fVar.f311668p;
                Intrinsics.h(bVar);
                Intrinsics.h(fVar22);
                return fVar.A2(cVar22.a(fVar22, (xi0.b) obj3, bVar));
            case 4:
                y9d.e eVar3 = (y9d.e) this.f311169w;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    ybh.c0 c0Var = eVar3.f311837a;
                    String str4 = (String) this.f311170x;
                    com.revolut.feature.shared.invoices.api.domain.model.a aVar7 = (com.revolut.feature.shared.invoices.api.domain.model.a) obj3;
                    Intrinsics.checkNotNullParameter(aVar7, "<this>");
                    String str5 = aVar7.f86415a;
                    String str6 = aVar7.f86416b;
                    Boolean bool = aVar7.f86417c;
                    Boolean bool2 = aVar7.d;
                    Boolean bool3 = aVar7.e;
                    List list = aVar7.f;
                    if (list != null) {
                        List list2 = list;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(s9d.a.a((InvoiceTemplate.CustomField) it9.next()));
                        }
                        arrayList = arrayList2;
                    } else {
                        arrayList = null;
                    }
                    u9d.b bVar4 = aVar7.f86418g;
                    String code = bVar4 != null ? bVar4.getCode() : null;
                    String str7 = aVar7.f86419h;
                    d.b bVar5 = new d.b(str7 != null ? "SET" : "UNSET", str7);
                    String str8 = aVar7.i;
                    r9d.d dVar4 = new r9d.d(str5, str6, bool, bool2, bool3, arrayList, code, bVar5, new d.b(str8 != null ? "SET" : "UNSET", str8));
                    this.v = 1;
                    objUpdateTemplate = ((InvoiceTemplateService) c0Var.f312297a).updateTemplate(str4, dVar4, this);
                    if (objUpdateTemplate == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objUpdateTemplate = obj2;
                }
                InvoiceTemplate invoiceTemplateA = x9d.a.a((r9d.b) objUpdateTemplate);
                y9d.e.a(eVar3, invoiceTemplateA);
                return invoiceTemplateA;
            case 5:
                yb5.e eVar4 = (yb5.e) this.f311170x;
                CoroutineScope coroutineScope = (CoroutineScope) this.f311169w;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 != 0) {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                g0[] g0VarArr = {e0.g(coroutineScope, null, null, new y7i.h(eVar4, false ? 1 : 0, 4), 3), e0.g(coroutineScope, null, null, new a1(eVar4, (String) obj3, false ? 1 : 0, 18), 3)};
                this.f311169w = null;
                this.v = 1;
                Object objI = e0.i(g0VarArr, this);
                return objI == aVar8 ? aVar8 : objI;
            case 6:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 != 0) {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b bVar6 = (com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b) this.f311169w;
                m0 m0Var = new m0(bVar6, (dii.g) this.f311170x, (dj0.d) obj3, (Continuation) null);
                this.v = 1;
                Object objB3 = pu7.a.B(bVar6.k, "post bottom sheet result", m0Var, this);
                return objB3 == aVar9 ? aVar9 : objB3;
            case 7:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.retail.private_banking.impl.ui.deposit_assets.flow.b bVar7 = (com.revolut.feature.retail.private_banking.impl.ui.deposit_assets.flow.b) this.f311169w;
                    wc2.b bVar8 = new wc2.b((adb.j) this.f311170x, bVar7, (yki.b) obj3, (Continuation) null, 16);
                    this.v = 1;
                    if (bVar7.p2(this, bVar8) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.b bVar9 = (com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.b) this.f311169w;
                    com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.a aVar12 = new com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.a(bVar9, (String) this.f311170x, (BigDecimal) obj3, null);
                    this.v = 1;
                    if (bVar9.p2(this, aVar12) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.f311169w;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 != 0) {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                yji.l lVar = (yji.l) this.f311170x;
                ejd.j jVar = new ejd.j((gim.i) obj3, coroutineScope2, null, 2);
                this.f311169w = null;
                this.v = 1;
                Object objP2 = lVar.p2(this, jVar);
                return objP2 == aVar13 ? aVar13 : objP2;
            case 10:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.f311169w;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 != 0) {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                yji.n nVar = (yji.n) this.f311170x;
                ejd.j jVar2 = new ejd.j((gim.i) obj3, coroutineScope3, null, 3);
                this.f311169w = null;
                this.v = 1;
                Object objY2 = nVar.Y2(this, jVar2);
                return objY2 == aVar14 ? aVar14 : objY2;
            case 11:
                String str9 = (String) obj3;
                yn9.c cVar3 = (yn9.c) this.f311170x;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    PaymentCounterpartyService paymentCounterpartyService = cVar3.f315271a;
                    this.v = 1;
                    counterpartyById = paymentCounterpartyService.getCounterpartyById(str9, this);
                    if (counterpartyById == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i99 != 1) {
                        if (i99 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        PaymentCounterpartyInfo paymentCounterpartyInfo = (PaymentCounterpartyInfo) this.f311169w;
                        yhm.o.b(obj2);
                        return paymentCounterpartyInfo;
                    }
                    yhm.o.b(obj2);
                    counterpartyById = obj2;
                }
                PaymentCounterpartyInfo paymentCounterpartyInfoA = xn9.a.a((wn9.a) counterpartyById);
                if (paymentCounterpartyInfoA != null) {
                    this.f311169w = paymentCounterpartyInfoA;
                    this.v = 2;
                    Collection collection = (List) cVar3.f315273c.get("KEY_COUNTERPARTY");
                    if (collection == null) {
                        collection = f0.f322471a;
                    }
                    ArrayList arrayListF1 = zhm.d0.f1(collection);
                    Iterator it10 = arrayListF1.iterator();
                    while (true) {
                        if (!it10.hasNext()) {
                            i2 = -1;
                        } else if (!Intrinsics.f(((PaymentCounterpartyInfo) it10.next()).f79060a, str9)) {
                            i2++;
                        }
                    }
                    if (i2 != -1) {
                        arrayListF1.set(i2, paymentCounterpartyInfoA);
                    } else {
                        arrayListF1.add(paymentCounterpartyInfoA);
                    }
                    x4l.c cVar4 = cVar3.d;
                    Object obj5 = Unit.f186387a;
                    Object objF = cVar4.f(obj5, arrayListF1, this);
                    if (objF == fim.a.COROUTINE_SUSPENDED) {
                        obj5 = objF;
                    }
                    if (obj5 == aVar15) {
                        return aVar15;
                    }
                }
                return paymentCounterpartyInfoA;
            case 12:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 != 0) {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                ynb.r rVar = (ynb.r) this.f311169w;
                ack.n nVar2 = new ack.n(i3);
                wc2.b bVar10 = new wc2.b(rVar, (String) this.f311170x, (String) obj3, (Continuation) null, 17);
                this.v = 1;
                Object objR = n14.k.R(rVar, null, nVar2, bVar10, this, 3);
                return objR == aVar16 ? aVar16 : objR;
            case 13:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    InsuranceCreditService insuranceCreditService = ((ys7.a) this.f311169w).f316417a;
                    String str10 = (String) this.f311170x;
                    bs7.c cVar5 = new bs7.c((String) obj3);
                    this.v = 1;
                    objCancelInsurance = insuranceCreditService.cancelInsurance(str10, cVar5, this);
                    if (objCancelInsurance == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objCancelInsurance = obj2;
                }
                bs7.f fVar3 = (bs7.f) objCancelInsurance;
                Intrinsics.checkNotNullParameter(fVar3, "<this>");
                return new qs7.a(fVar3.f18074a, fVar3.f18075b);
            case 14:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_details.a aVar19 = (com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_details.a) this.f311169w;
                    wc2.b bVar11 = new wc2.b(aVar19, (String) this.f311170x, (String) obj3, (Continuation) null, 18);
                    this.v = 1;
                    if (u0.b0(aVar19.X(), "START_CHALLENGE_BUTTON_TAG", bVar11, this) == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                yvd.c cVar6 = (yvd.c) this.f311169w;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    StakingService stakingService = cVar6.f317166g;
                    String str11 = (String) this.f311170x;
                    zvd.a stakeRequest = (zvd.a) obj3;
                    Intrinsics.checkNotNullParameter(stakeRequest, "stakeRequest");
                    Intrinsics.checkNotNullParameter(stakeRequest, "stakeRequest");
                    lwd.a aVar21 = new lwd.a(stakeRequest.f325656a, stakeRequest.f325657b.f306286a, stakeRequest.f325658c);
                    this.v = 1;
                    if (stakingService.stake(str11, aVar21, this) == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i103 != 1) {
                        if (i103 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                x4l.c cVar7 = cVar6.f317167h;
                Unit unit = Unit.f186387a;
                this.v = 2;
                if (cVar7.d(unit, true, this) == aVar20) {
                    return aVar20;
                }
                return Unit.f186387a;
            case 16:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c cVar8 = (com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c) this.f311169w;
                    Object obj6 = ((Ref$ObjectRef) this.f311170x).f186409a;
                    if (obj6 == null) {
                        Intrinsics.r("codeVerifier");
                        throw null;
                    }
                    this.v = 1;
                    if (com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c.J2(cVar8, (String) obj6, (bjl.q) obj3, null, true, this) == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 17:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c cVar9 = (com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c) this.f311169w;
                    Object obj7 = ((Ref$ObjectRef) this.f311170x).f186409a;
                    if (obj7 == null) {
                        Intrinsics.r("codeVerifier");
                        throw null;
                    }
                    this.v = 1;
                    if (com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c.J2(cVar9, (String) obj7, (d0) obj3, null, true, this) == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 18:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c cVar10 = (com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c) this.f311169w;
                    n0 n0Var = (n0) this.f311170x;
                    Object obj8 = ((Ref$ObjectRef) obj3).f186409a;
                    if (obj8 == null) {
                        Intrinsics.r("codeVerifier");
                        throw null;
                    }
                    this.v = 1;
                    if (com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c.K2(cVar10, n0Var, (String) obj8, this) == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 19:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 != 0) {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                yx6.b bVar12 = (yx6.b) this.f311169w;
                wc2.b bVar13 = new wc2.b(bVar12, (FreelancerInvoiceSettings) this.f311170x, (wx6.h) obj3, (Continuation) null, 19);
                this.v = 1;
                Object objB4 = pu7.a.B(bVar12.e, "update_invoice_settings_email_message", bVar13, this);
                return objB4 == aVar25 ? aVar25 : objB4;
            case 20:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    yx6.g gVar = (yx6.g) this.f311169w;
                    FreelancerInvoice freelancerInvoice = (FreelancerInvoice) this.f311170x;
                    this.v = 1;
                    Object objB5 = nim.a.b(gVar.f317581l.i(freelancerInvoice.f73374a, mif.e0.L(FreelancerInvoice.a(freelancerInvoice, null, null, null, null, null, ((wx6.h) obj3).f300762c, null, null, 65011711))), this);
                    Object obj9 = objB5;
                    if (objB5 != aVar26) {
                        obj9 = Unit.f186387a;
                    }
                    if (obj9 == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 21:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    yx6.g gVar2 = (yx6.g) this.f311169w;
                    FreelancerInvoiceSettings freelancerInvoiceSettings = (FreelancerInvoiceSettings) this.f311170x;
                    this.v = 1;
                    Object objB6 = nim.a.b(gVar2.f317581l.k(FreelancerInvoiceSettings.a(freelancerInvoiceSettings, null, null, null, null, null, null, null, null, null, null, ((wx6.h) obj3).f300762c, null, 12287)), this);
                    Object obj10 = objB6;
                    if (objB6 != aVar27) {
                        obj10 = Unit.f186387a;
                    }
                    if (obj10 == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 22:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 != 0) {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.documents.c cVar11 = (com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.documents.c) this.f311169w;
                wc2.b bVar14 = new wc2.b(cVar11, (v44.j) this.f311170x, (yki.b) obj3, (Continuation) null, 20);
                this.v = 1;
                Object objP22 = cVar11.p2(this, bVar14);
                return objP22 == aVar28 ? aVar28 : objP22;
            case 23:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    u1l.e eVar5 = (u1l.e) ((z1l.d) this.f311169w).f318897a;
                    this.v = 1;
                    Object objLinkAccount = eVar5.f276437a.linkAccount((String) this.f311170x, (Map) obj3, this);
                    if (objLinkAccount != aVar29) {
                        objLinkAccount = Unit.f186387a;
                    }
                    if (objLinkAccount == aVar29) {
                        return aVar29;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 24:
                z24.a aVar30 = (z24.a) this.f311169w;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    CreditPluginsService creditPluginsService = aVar30.f318957b;
                    String str12 = ((h1) this.f311170x).f137835a;
                    Map<String, Object> map = ((jy3.a) obj3).f179326a;
                    this.v = 1;
                    objConfirmAddon = creditPluginsService.confirmAddon(str12, map, this);
                    if (objConfirmAddon == aVar31) {
                        return aVar31;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objConfirmAddon = obj2;
                }
                return aVar30.f318956a.p((tt3.a) objConfirmAddon);
            case 25:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    CreditPluginsService creditPluginsService2 = ((z24.a) this.f311169w).f318957b;
                    String str13 = (String) this.f311170x;
                    Map<String, Object> map2 = ((jy3.a) obj3).f179326a;
                    this.v = 1;
                    addonCalculatorConfig = creditPluginsService2.getAddonCalculatorConfig(str13, map2, this);
                    if (addonCalculatorConfig == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    addonCalculatorConfig = obj2;
                }
                return oi0.d.N((t14.a) addonCalculatorConfig);
            case 26:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 != 0) {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.assessment.f fVar4 = (com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.assessment.f) this.f311169w;
                z27.t tVar = new z27.t(fVar4, (String) this.f311170x, (String) obj3, null, 1);
                this.v = 1;
                Object objB7 = pu7.a.B(fVar4.k, "complete_file_return_step", tVar, this);
                return objB7 == aVar33 ? aVar33 : objB7;
            case 27:
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    z31.c cVar12 = (z31.c) this.f311170x;
                    this.f311169w = cVar12;
                    this.v = 1;
                    objA = ((v0) obj3).a(this);
                    if (objA == aVar34) {
                        return aVar34;
                    }
                    cVar = cVar12;
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = (z31.c) this.f311169w;
                    yhm.o.b(obj2);
                    objA = obj2;
                }
                z31.a aVar35 = z31.c.Companion;
                cVar.getClass();
                return z31.c.b((Map) objA);
            case 28:
                LoanDetails loanDetails = (LoanDetails) this.f311170x;
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    yhm.o.b(obj2);
                    hVar = od0.i.Companion;
                    m35.c cVar13 = ((com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.a) obj3).f70358y;
                    this.f311170x = null;
                    this.f311169w = hVar;
                    this.v = 1;
                    objB = ((c55.g) cVar13).b(loanDetails, this);
                    if (objB == aVar36) {
                        return aVar36;
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od0.h hVar2 = (od0.h) this.f311169w;
                    yhm.o.b(obj2);
                    hVar = hVar2;
                    objB = obj2;
                }
                hVar.getClass();
                return od0.h.a(objB);
            default:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.f311169w;
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 != 0) {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                List list3 = (List) this.f311170x;
                z6l.s sVar = (z6l.s) obj3;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                Iterator it11 = list3.iterator();
                while (it11.hasNext()) {
                    arrayList3.add(e0.g(coroutineScope4, null, null, new jyl.f(sVar, (h93.f0) it11.next(), (Continuation) null), 3));
                }
                this.f311169w = null;
                this.v = 1;
                Object objH = e0.h(arrayList3, this);
                return objH == aVar37 ? aVar37 : objH;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f311169w = obj2;
        this.f311170x = obj3;
        this.f311171y = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f311170x = obj2;
        this.f311171y = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l(yji.l lVar, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.u = 9;
        this.f311170x = lVar;
        this.f311171y = (gim.i) function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l(yji.n nVar, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.u = 10;
        this.f311170x = nVar;
        this.f311171y = (gim.i) function2;
    }
}
