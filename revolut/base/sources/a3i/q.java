package a3i;

import ahf.z;
import bke.x;
import bq5.a0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.bills.billers.api.model.Biller;
import com.revolut.feature.apm.bills.core.api.model.search.tapi.BillSearchTapiResult;
import com.revolut.feature.credit.card.impl.ui.instalment.details.pre_purchase.CreditCardPrePurchaseDetailsScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddressHostingInfo;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.bottom_sheet.delete_tracking.DeleteTrackingScreenContract$InputData;
import com.revolut.feature.support.api.SupportApi$Toggles$ShowAllTroubleshooters;
import com.revolut.feature.support.api.navigation.HelpCentreFeatureConfig;
import com.revolut.feature.transaction.troubleshooter.api.deps.TransactionTroubleshooterApi$Toggles$TransactionTroubleshooterImprovementDefinition;
import com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.crypto.card.linked_transaction.LinkedTransactionScreenContract$InputData;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import ft3.h1;
import ip0.tm0;
import ip0.um0;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;
import nii.y0;
import om4.r1;
import om4.x2;
import org.jmrtd.cbeff.ISO781611;
import rp0.y;
import skm.e0;
import skm.k0;
import skm.p0;
import vkm.j2;
import y20.a1;
import yh5.d;
import zh9.u0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class q extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f1157w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Object obj2, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f1157w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new q((com.revolut.feature_exchange.impl.ui.order_details_kompot.b) this.f1157w, continuation, 0);
            case 1:
                return new q((com.revolut.feature_retail_user_declarations.email.verification_screen.a) this.f1157w, continuation, 1);
            case 2:
                return new q((z) this.f1157w, continuation, 2);
            case 3:
                return new q((ak8.k) this.f1157w, continuation, 3);
            case 4:
                return new q((com.revolut.feature.retail.savings.impl.challenge.presentation.manage_challenge.a) this.f1157w, continuation, 4);
            case 5:
                return new q((com.revolut.feature.apm.bills.boleto.impl.finder.onboarding.a) this.f1157w, continuation, 5);
            case 6:
                return new q((aok.c) this.f1157w, continuation, 6);
            case 7:
                return new q((com.revolut.feature_move_money.impl.amount.c) this.f1157w, continuation, 7);
            case 8:
                return new q((bbc.i) this.f1157w, continuation, 8);
            case 9:
                return new q((be3.m) this.f1157w, continuation, 9);
            case 10:
                return new q((com.revolut.feature.credit.application.plugins.impl.ui.payment.checkout.a) this.f1157w, continuation, 10);
            case 11:
                return new q((com.revolut.feature.retail.salary_account.impl.flow.ui.d) this.f1157w, continuation, 11);
            case 12:
                return new q((bh9.t) this.f1157w, continuation, 12);
            case 13:
                return new q((com.revolut.feature.junior_onboarding.impl.ui.creation.a) this.f1157w, continuation, 13);
            case 14:
                return new q((bk9.j) this.f1157w, continuation, 14);
            case 15:
                return new q((x) this.f1157w, continuation, 15);
            case 16:
                return new q((bof.q) this.f1157w, continuation, 16);
            case 17:
                return new q((com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a) this.f1157w, continuation, 17);
            case 18:
                return new q((bs4.t) this.f1157w, continuation, 18);
            case 19:
                return new q((com.revolut.feature.payments.groups.impl.ui_chat.chat.a) this.f1157w, continuation, 19);
            case 20:
                return new q((bt9.w) this.f1157w, continuation, 20);
            case 21:
                return new q((q) this.f1157w, continuation, 21);
            case 22:
                return new q((bu4.m) this.f1157w, continuation, 22);
            case 23:
                return new q((bv4.i) this.f1157w, continuation, 23);
            case 24:
                return new q((bz9.e) this.f1157w, continuation, 24);
            case 25:
                return new q((c07.e) this.f1157w, continuation, 25);
            case 26:
                return new q((com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.flow.b) this.f1157w, continuation, 26);
            case 27:
                return new q((c84.t) this.f1157w, continuation, 27);
            case 28:
                return new q((cc7.h) this.f1157w, continuation, 28);
            default:
                return new q((com.revolut.feature.credit.application.plugins.impl.ui.family_credit_card_settings.screen.e) this.f1157w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((q) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Exception {
        Object objZ2;
        Object objB;
        Object objF;
        Object objJ;
        Object objY;
        Object objJ2;
        int i = this.u;
        int i2 = 5;
        int i3 = 15;
        int i5 = 6;
        int i6 = 4;
        int i21 = 3;
        boolean z = false;
        z = false;
        int i22 = 2;
        Continuation continuation = null;
        Object obj3 = this.f1157w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature_exchange.impl.ui.order_details_kompot.b bVar = (com.revolut.feature_exchange.impl.ui.order_details_kompot.b) obj3;
                    pfm.r rVarA = ((x0i.g) bVar.f96973q).a(bVar.o.f96968a.getF72134a().f72137a);
                    this.v = 1;
                    if (nim.a.a(rVarA, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature_retail_user_declarations.email.verification_screen.a aVar3 = (com.revolut.feature_retail_user_declarations.email.verification_screen.a) obj3;
                pai.a aVar4 = aVar3.f97602r;
                String str = aVar3.o.f97596a;
                this.v = 1;
                Object objA = ((pai.e) aVar4).a(str, this);
                return objA == aVar2 ? aVar2 : objA;
            case 2:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    z zVar = (z) obj3;
                    a41.s sVar = new a41.s(zVar, (Continuation) null, 6);
                    this.v = 1;
                    if (zVar.p2(this, sVar) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                ak8.k kVar = (ak8.k) obj3;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    hj8.a aVar7 = kVar.f5744p;
                    String str2 = kVar.o.f5738a;
                    ij8.d dVar = new ij8.d(null, ((ak8.e) ((j2) kVar.f5745q.f22677a).getValue()).f5736a, null, null, null, null, ISO781611.SMT_TAG);
                    this.v = 1;
                    if (((nj8.n) aVar7).o(str2, dVar, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                kVar.B2();
                return Unit.f186387a;
            case 4:
                com.revolut.feature.retail.savings.impl.challenge.presentation.manage_challenge.a aVar8 = (com.revolut.feature.retail.savings.impl.challenge.presentation.manage_challenge.a) obj3;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    qib.i iVar = ((akb.h) zi0.c.I(((akb.i) ((j2) aVar8.f83195t.f22677a).getValue()).f5773a)).f5770a;
                    ugc.a aVar10 = aVar8.f83191p;
                    String str3 = iVar.f246691a;
                    qib.a aVar11 = qib.a.ACTIVE;
                    this.v = 1;
                    if (aVar10.r(str3, aVar11, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 != 0) {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.apm.bills.boleto.impl.finder.onboarding.a aVar13 = (com.revolut.feature.apm.bills.boleto.impl.finder.onboarding.a) obj3;
                en1.a aVar14 = aVar13.f61174p;
                String str4 = aVar13.o.f61172a;
                this.v = 1;
                aVar14.getClass();
                eif.j jVar = new eif.j(aVar14, str4, continuation, i3);
                p0 p0Var = p0.f264001a;
                Object objJ3 = e0.J(elm.f.f127540b, jVar, this);
                return objJ3 == aVar12 ? aVar12 : objJ3;
            case 6:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 != 0) {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                pfk.x xVar = ((aok.c) obj3).f8004m;
                this.v = 1;
                xVar.getClass();
                pe2.l lVar = new pe2.l(xVar, continuation, i6);
                p0 p0Var2 = p0.f264001a;
                Object objJ4 = e0.J(elm.f.f127540b, lVar, this);
                return objJ4 == aVar15 ? aVar15 : objJ4;
            case 7:
                com.revolut.feature_move_money.impl.amount.c cVar = (com.revolut.feature_move_money.impl.amount.c) obj3;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    f6i.a aVar17 = cVar.D;
                    s6i.e eVar = cVar.Q2().f12783a;
                    if (eVar == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    b6i.l lVar2 = cVar.Q2().f12785c;
                    this.v = 1;
                    objZ2 = ((f6i.d) aVar17).Z2(eVar, lVar2, this);
                    if (objZ2 == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i96 != 1) {
                        if (i96 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                    objZ2 = obj2;
                }
                if (((Boolean) objZ2).booleanValue()) {
                    s6i.e eVar2 = cVar.Q2().f12783a;
                    if (eVar2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    if ((cp5.d.z(eVar2.f260363b.f302979a.f115083b) && cVar.Q2().f12785c == b6i.l.TOP_TO_BOTTOM) || (cp5.d.z(eVar2.f260362a.f302979a.f115083b) && cVar.Q2().f12785c == b6i.l.BOTTOM_TO_TOP)) {
                        th5.a aVar18 = cVar.J;
                        ah1.m mVar = new ah1.m(cVar, eVar2, continuation, i22);
                        this.v = 2;
                        if (aVar18.Z2(mVar, this) == aVar16) {
                            return aVar16;
                        }
                    } else {
                        com.revolut.feature_move_money.impl.amount.c.I2(cVar, eVar2);
                    }
                }
                return Unit.f186387a;
            case 8:
                bbc.i iVar2 = (bbc.i) obj3;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    tul.b bVar2 = iVar2.f14251p;
                    DeleteTrackingScreenContract$InputData deleteTrackingScreenContract$InputData = iVar2.o;
                    String str5 = deleteTrackingScreenContract$InputData.f84611a;
                    String str6 = deleteTrackingScreenContract$InputData.f84612b;
                    this.v = 1;
                    prl.k kVar2 = new prl.k((qac.i) bVar2.f274637b, str6, str5, (Continuation) null, 28);
                    p0 p0Var3 = p0.f264001a;
                    Object objJ5 = e0.J(elm.f.f127540b, kVar2, this);
                    Object obj4 = objJ5;
                    if (objJ5 != aVar19) {
                        obj4 = Unit.f186387a;
                    }
                    if (obj4 != aVar19) {
                        obj4 = Unit.f186387a;
                    }
                    if (obj4 == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                iVar2.C2(bbc.e.f14249a);
                return Unit.f186387a;
            case 9:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    be3.m mVar2 = (be3.m) obj3;
                    b94.s sVar2 = new b94.s(i2, continuation, mVar2);
                    this.v = 1;
                    if (ue8.c.f0(mVar2, sVar2, this) == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 != 0) {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.payment.checkout.a aVar22 = (com.revolut.feature.credit.application.plugins.impl.ui.payment.checkout.a) obj3;
                t1j.b bVar3 = aVar22.o;
                h1 h1VarF = w0.F(aVar22.f68174r.f68169a);
                this.v = 1;
                a1 a1Var = new a1((smd.s) bVar3.f267380b, h1VarF, continuation, i21);
                p0 p0Var4 = p0.f264001a;
                Object objJ6 = e0.J(elm.f.f127540b, a1Var, this);
                return objJ6 == aVar21 ? aVar21 : objJ6;
            case 11:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    ufm.i iVarA = ((com.revolut.feature.retail.salary_account.impl.flow.ui.d) obj3).f82983t.a();
                    this.v = 1;
                    objB = nim.a.b(iVarA, this);
                    if (objB == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB = obj2;
                }
                return ((kn2.a) objB).f;
            case 12:
                bh9.t tVar = (bh9.t) obj3;
                bh9.b bVar4 = tVar.o;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    wo1.b bVar5 = tVar.f15285q;
                    LinkedHashMap linkedHashMapC = ((bh9.a) ((j2) tVar.f15289w.f22677a).getValue()).c();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : linkedHashMapC.entrySet()) {
                        if (((CharSequence) entry.getValue()).length() > 0) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    Biller biller = bVar4.f15270b;
                    cp1.a aVar25 = new cp1.a(bVar4.f15269a, biller.f61145a, biller.f61146b, linkedHashMap);
                    this.v = 1;
                    objF = ((vp1.c) bVar5).f(aVar25, this);
                    if (objF == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objF = obj2;
                }
                tVar.C2(new bh9.d(bVar4.f15270b, (BillSearchTapiResult) objF));
                return Unit.f186387a;
            case 13:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (com.revolut.feature.junior_onboarding.impl.ui.creation.a.I2((com.revolut.feature.junior_onboarding.impl.ui.creation.a) obj3, this) == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                bk9.j jVar2 = (bk9.j) obj3;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    zh9.w0 w0Var = new zh9.w0(jVar2.o.f78891a.f78816a, ((bk9.f) ((j2) jVar2.f16292q.f22677a).getValue()).f16286c);
                    xh9.a aVar28 = jVar2.f16291p;
                    this.v = 1;
                    ej9.e0 e0Var = (ej9.e0) ((ti9.g) aVar28).f271456a;
                    e0Var.getClass();
                    e38.c cVar2 = new e38.c(e0Var, w0Var, continuation, i3);
                    p0 p0Var5 = p0.f264001a;
                    objJ = e0.J(elm.f.f127540b, cVar2, this);
                    if (objJ == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objJ = obj2;
                }
                if (((zh9.w0) objJ) != null) {
                    jVar2.X1(new mii.k("SUCCESS_SHOT_ID", new TextLocalisedClause(R$string.credit_pay_later_payment_schedule_toast_updated, null, null, 14), null, null, null, 28));
                    jVar2.B2();
                    return Unit.f186387a;
                }
                IllegalStateException illegalStateException = new IllegalStateException("Failed to update preferred pay later method: updatePreferredMethod returned null");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                return jVar2.X1(new y0(null, new nii.z(new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_description, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5));
            case 15:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    x xVar2 = (x) obj3;
                    vh5.a aVar30 = xVar2.J;
                    a54.g gVar = new a54.g(xVar2, continuation, i5);
                    this.v = 1;
                    if (aVar30.Z2((3 & 1) != 0, d.a.f313774a, gVar, this) == aVar29) {
                        return aVar29;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 16:
                bof.q qVar = (bof.q) obj3;
                LinkedTransactionScreenContract$InputData linkedTransactionScreenContract$InputData = qVar.o;
                pff.a aVar31 = qVar.f17424t;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    String str7 = linkedTransactionScreenContract$InputData.f92086a.f272581b;
                    f0 f0Var = f0.f322471a;
                    od0.a aVar33 = od0.a.f224253a;
                    if (od0.a.e()) {
                        if (((jte.d) qVar.u).c(SupportApi$Toggles$ShowAllTroubleshooters.f89343a)) {
                            z = true;
                        }
                    }
                    vkm.d dVarA = aVar31.a(str7, f0Var, z, w4l.i.f294643c);
                    a2c.c cVar3 = new a2c.c(i22, 13, continuation);
                    this.v = 1;
                    objY = vkm.q.y(dVarA, cVar3, this);
                    if (objY == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objY = obj2;
                }
                Collection issues = (List) ((Data) objY).getContent();
                if (issues == null) {
                    issues = f0.f322471a;
                }
                kgm.i iVar3 = qVar.f17422r;
                iVar3.getClass();
                Intrinsics.checkNotNullParameter(issues, "issues");
                int i108 = bof.j.f17412a[(issues.isEmpty() ? ((jte.d) ((uig.a) iVar3.f184023b).f280439a).c(TransactionTroubleshooterApi$Toggles$TransactionTroubleshooterImprovementDefinition.f91839c) ? rnf.d.ShowThisTransactionPopUp : rnf.d.OpenHelpCentreMain : rnf.d.OpenTroubleshooting).ordinal()];
                if (i108 == 1) {
                    qVar.K2();
                } else if (i108 == 2) {
                    qVar.C1(u0.b(new FeatureCommand(new HelpCentreFeatureConfig.TransactionTroubleshooting(29, linkedTransactionScreenContract$InputData.f92086a.f272581b, null, null, null))));
                } else {
                    if (i108 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j60.a aVar34 = qVar.f17423s;
                    aVar31.getClass();
                    String str8 = null;
                    aVar34.x(new y(zhm.u.c(new um0("ID_ISSUE_ABOUT_THIS_TRANSACTION", new tm0(LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_no, null, null, 14), false, str8, null, 56), new tm0(LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_yes, null, null, 14), false, null, str8, 56), (Object) null, (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1016)), new rp0.t(new TextLocalisedClause(com.revolut.feature.transaction.troubleshooter.impl.R$string.troubleshooter_list_help_dialog_title, null, null, 14), null, null, 30), rp0.l.WINDOW, null, null, null, 1016));
                }
                return Unit.f186387a;
            case 17:
                com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a aVar35 = (com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a) obj3;
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    int i110 = bq5.h1.f17718a[aVar35.o.f71222a.ordinal()];
                    if (i110 == 1) {
                        this.v = 1;
                        if (com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a.J2(aVar35, this) == aVar36) {
                            return aVar36;
                        }
                    } else if (i110 == 2 || i110 == 3) {
                        CryptoAddressHostingInfo cryptoAddressHostingInfoL2 = aVar35.L2();
                        cli.y yVar = aVar35.C;
                        j2 j2Var = (j2) yVar.f22677a;
                        j2 j2Var2 = (j2) yVar.f22677a;
                        String str9 = ((a0) j2Var.getValue()).C;
                        if (str9 != null && cryptoAddressHostingInfoL2 != null) {
                            aVar35.C2(new bq5.e0(str9, cryptoAddressHostingInfoL2, ((a0) j2Var2.getValue()).D, ehe.n.u(((a0) j2Var2.getValue()).f17682p)));
                        }
                    } else {
                        if (i110 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.v = 2;
                        if (com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a.I2(aVar35, this) == aVar36) {
                            return aVar36;
                        }
                    }
                } else {
                    if (i109 != 1 && i109 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 18:
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    bs4.t tVar2 = (bs4.t) obj3;
                    al4.m mVar3 = tVar2.f18060p;
                    CreditCardPrePurchaseDetailsScreenContract$InputData creditCardPrePurchaseDetailsScreenContract$InputData = tVar2.o;
                    String str10 = creditCardPrePurchaseDetailsScreenContract$InputData.f69383a;
                    String str11 = creditCardPrePurchaseDetailsScreenContract$InputData.f69384b;
                    this.v = 1;
                    if (((r1) mVar3).p(str10, str11, this) == aVar37) {
                        return aVar37;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 19:
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (k0.b(300L, this) == aVar38) {
                        return aVar38;
                    }
                } else {
                    if (i112 != 1) {
                        if (i112 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                this.v = 2;
                if (com.revolut.feature.payments.groups.impl.ui_chat.chat.a.I2((com.revolut.feature.payments.groups.impl.ui_chat.chat.a) obj3, this) == aVar38) {
                    return aVar38;
                }
                return Unit.f186387a;
            case 20:
                bt9.w wVar = (bt9.w) obj3;
                fim.a aVar39 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                try {
                    if (i113 == 0) {
                        yhm.o.b(obj2);
                        wVar.x2(new bs9.e(29));
                        dt9.a aVar40 = wVar.f18480w;
                        oq9.i bill = wVar.B2().f18466b;
                        dt9.b bVar6 = (dt9.b) aVar40;
                        bVar6.getClass();
                        Intrinsics.checkNotNullParameter(bill, "bill");
                        mq9.f fVar = bVar6.f117399a;
                        pfm.r rVarJ = ((mr9.a) fVar).j(bill.e(), bill);
                        d0 d0VarFirstOrError = ((mr9.a) fVar).i(true).firstOrError();
                        d0VarFirstOrError.getClass();
                        pfm.h hVar = new pfm.h(d0VarFirstOrError, i6);
                        Intrinsics.checkNotNullExpressionValue(hVar, "ignoreElement(...)");
                        pfm.a aVarE = rVarJ.e(hVar);
                        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                        this.v = 1;
                        if (nim.a.a(aVarE, this) == aVar39) {
                            return aVar39;
                        }
                    } else {
                        if (i113 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                    }
                    wVar.v2(aii.q.f5292a);
                    return Unit.f186387a;
                } catch (Exception e) {
                    wVar.x2(new bt9.t(z ? 1 : 0));
                    throw e;
                }
            case 21:
                fim.a aVar41 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 != 0) {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                this.v = 1;
                Object objInvoke = ((q) obj3).invoke(this);
                return objInvoke == aVar41 ? aVar41 : objInvoke;
            case 22:
                fim.a aVar42 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    bu4.m mVar4 = (bu4.m) obj3;
                    om4.w wVar2 = mVar4.o;
                    String str12 = mVar4.f18686s;
                    this.v = 1;
                    if (wVar2.d(str12, this) == aVar42) {
                        return aVar42;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 23:
                fim.a aVar43 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    yhm.o.b(obj2);
                    bv4.i iVar4 = (bv4.i) obj3;
                    al4.n nVar = iVar4.f18965p;
                    String str13 = iVar4.o.f69637a;
                    this.v = 1;
                    if (((x2) nVar).N(str13, this) == aVar43) {
                        return aVar43;
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 24:
                fim.a aVar44 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (bz9.e.b3((bz9.e) obj3, this) == aVar44) {
                        return aVar44;
                    }
                } else {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 25:
                fim.a aVar45 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 == 0) {
                    yhm.o.b(obj2);
                    kda.b bVar7 = ((c07.e) obj3).o;
                    this.v = 1;
                    if (bVar7.closeAccount(this) == aVar45) {
                        return aVar45;
                    }
                } else {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 26:
                fim.a aVar46 = fim.a.COROUTINE_SUSPENDED;
                int i119 = this.v;
                if (i119 != 0) {
                    if (i119 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                d0 d0VarF = ((com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.flow.b) obj3).f74263q.f(false);
                this.v = 1;
                Object objB2 = nim.a.b(d0VarF, this);
                return objB2 == aVar46 ? aVar46 : objB2;
            case 27:
                fim.a aVar47 = fim.a.COROUTINE_SUSPENDED;
                int i120 = this.v;
                if (i120 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (c84.t.I2((c84.t) obj3, this) == aVar47) {
                        return aVar47;
                    }
                } else {
                    if (i120 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 28:
                cc7.h hVar2 = (cc7.h) obj3;
                fim.a aVar48 = fim.a.COROUTINE_SUSPENDED;
                int i121 = this.v;
                if (i121 == 0) {
                    yhm.o.b(obj2);
                    j60.a aVar49 = hVar2.f22949l;
                    cc7.m mVar5 = hVar2.f22950m;
                    j60.a.v(aVar49, false, null, 3);
                    cc7.d dVar2 = (cc7.d) ((od0.i) mVar5.f22964c.get()).c();
                    zb7.c cVar4 = dVar2.f22944a.f320840c;
                    if (cVar4 == null) {
                        throw new IllegalStateException("Rating should be always selected in the detailed survey");
                    }
                    te0.r rVar = mVar5.f22964c;
                    od0.i.Companion.getClass();
                    rVar.set(od0.h.a(null));
                    Set set = dVar2.f22945b;
                    String str14 = dVar2.f22946c;
                    this.v = 1;
                    if (((cc7.h) obj3).e3(cVar4, set, str14, true, this) == aVar48) {
                        return aVar48;
                    }
                } else {
                    if (i121 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                com.revolut.feature.credit.application.plugins.impl.ui.family_credit_card_settings.screen.e eVar3 = (com.revolut.feature.credit.application.plugins.impl.ui.family_credit_card_settings.screen.e) obj3;
                fim.a aVar50 = fim.a.COROUTINE_SUSPENDED;
                int i122 = this.v;
                if (i122 == 0) {
                    yhm.o.b(obj2);
                    qy3.c cVar5 = (qy3.c) ((hb4.e) ((j2) eVar3.f67685r.f22677a).getValue()).f150599b.getContent();
                    Continuation continuation2 = null;
                    qy3.g gVar2 = cVar5 != null ? cVar5.f250142b : null;
                    if (gVar2 == null) {
                        IllegalStateException illegalStateException2 = new IllegalStateException("FamilyCreditCardSettingsScreenModel: parameters can't be null");
                        h0 h0Var2 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                        return Unit.f186387a;
                    }
                    gx3.a aVar51 = eVar3.f67683p;
                    h1 h1VarA9 = eVar3.o.a9();
                    qy3.f fVar2 = new qy3.f(gVar2.f250152a, gVar2.f250153b, gVar2.f250154c);
                    this.v = 1;
                    i34.b bVar8 = aVar51.f147637a;
                    bVar8.getClass();
                    i34.a aVar52 = new i34.a(bVar8, h1VarA9, fVar2, continuation2, 1);
                    p0 p0Var6 = p0.f264001a;
                    objJ2 = e0.J(elm.f.f127540b, aVar52, this);
                    if (objJ2 == aVar50) {
                        return aVar50;
                    }
                } else {
                    if (i122 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objJ2 = obj2;
                }
                eVar3.C2(new hb4.g((it3.d) objJ2));
                return Unit.f186387a;
        }
    }
}
