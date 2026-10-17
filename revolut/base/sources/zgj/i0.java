package zgj;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.statements.api.navigation.DocumentsHubProduct;
import com.revolut.feature.statements.impl.documents_hub.domain.DocumentsHubMappingException;
import com.revolut.feature.statements.impl.ui.documents_hub.DocumentsHubScreenContract$InputData;
import com.revolut.feature.topup_screen.api.model.TopUpMethodsContext;
import com.revolut.retail.feature.esim.api.model.EsimUserPocket;
import com.revolut.retail.feature.pricing_plans.ui.impl.analytics.PricingPlanAnalyticsSource;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.PlanBillingPickerContract$Mode;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_billing_picker.PlanBillingPickerScreenContract$InputData;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import nii.l1;
import nii.n1;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class i0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f322163w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f322164x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(oki.h hVar, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f322163w = hVar;
        this.f322164x = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i0 i0Var = new i0((com.revolut.retail.feature.esim.impl.ui.screens.checkout.a) this.f322163w, (w6c.h) this.f322164x, continuation, 0);
                i0Var.v = obj2;
                return i0Var;
            case 1:
                return new i0((zh6.c) this.v, (TopUpMethodsContext) this.f322163w, (String) this.f322164x, continuation);
            case 2:
                i0 i0Var2 = new i0((zkk.t) this.f322163w, (w4l.k) this.f322164x, continuation, 2);
                i0Var2.v = obj2;
                return i0Var2;
            case 3:
                i0 i0Var3 = new i0((com.revolut.feature.security_hub.impl.ui.street_mode.trusted_wifis_list.a) this.f322163w, (String) this.f322164x, continuation, 3);
                i0Var3.v = obj2;
                return i0Var3;
            default:
                i0 i0Var4 = new i0((com.revolut.feature.statements.impl.ui.documents_hub.a) this.f322163w, (w4l.k) this.f322164x, continuation, 4);
                i0Var4.v = obj2;
                return i0Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i0) create((dj0.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((i0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((i0) create((zkk.q) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((i0) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i0) create((wxd.s) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
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
    public final Object invokeSuspend(Object obj2) {
        akg.n nVarV;
        ggk.g0 g0VarA;
        int i = this.u;
        int i2 = 17;
        String str = null;
        Object obj3 = null;
        Object obj4 = this.f322164x;
        Object obj5 = this.f322163w;
        switch (i) {
            case 0:
                dj0.d balance = (dj0.d) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.esim.impl.ui.screens.checkout.a aVar2 = (com.revolut.retail.feature.esim.impl.ui.screens.checkout.a) obj5;
                String str2 = ((w6c.h) obj4).f295416b;
                cli.y yVar = aVar2.H;
                EsimUserPocket esimUserPocket = (EsimUserPocket) ((r) ((j2) yVar.f22677a).getValue()).f322175b.getContent();
                if (esimUserPocket == null) {
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "EsimCheckoutScreenModel", "Can not update topped-up balance: current pocket is null. New balance amount=" + balance.f115082a + ", currency=" + balance.f115083b.f306286a, null, h0Var);
                } else {
                    String str3 = esimUserPocket.f100531a;
                    if (Intrinsics.f(str3, str2)) {
                        PaymentMethod.Pocket pocket = esimUserPocket.f100532b;
                        PaymentMethod.Pocket pocketA = pocket != null ? PaymentMethod.Pocket.a(pocket, balance) : null;
                        Intrinsics.checkNotNullParameter(balance, "balance");
                        aVar2.H2(yVar, new c0(new EsimUserPocket(str3, pocketA, balance), 1));
                    } else {
                        zhm.h0 h0Var2 = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "EsimCheckoutScreenModel", a0.d.s("Can not update topped-up balance: current pocket is changed. Topped-up pocket id: ", str2, ", current pocket id: ", str3), null, h0Var2);
                    }
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                z9h.n.l(String.class, ((zh6.c) this.v).f322240b, zh6.c.a((TopUpMethodsContext) obj5), (String) obj4);
                return Unit.f186387a;
            case 2:
                zkk.q qVar = (zkk.q) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                zkk.t tVar = (zkk.t) obj5;
                zkk.a aVar5 = tVar.f323083p;
                String planId = qVar.f323077a;
                PlanBillingPickerScreenContract$InputData planBillingPickerScreenContract$InputData = tVar.o;
                PlanBillingPickerContract$Mode mode = planBillingPickerScreenContract$InputData.f103478b;
                PricingPlanAnalyticsSource source = planBillingPickerScreenContract$InputData.f103479c;
                w4l.k loadingStrategy = (w4l.k) obj4;
                egk.e eVar = aVar5.f323059a;
                Intrinsics.checkNotNullParameter(planId, "planId");
                Intrinsics.checkNotNullParameter(mode, "mode");
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                if (mode instanceof PlanBillingPickerContract$Mode.Legacy) {
                    yik.d dVar = aVar5.f323060b;
                    dVar.getClass();
                    Intrinsics.checkNotNullParameter(source, "source");
                    if (source instanceof PricingPlanAnalyticsSource.Predefined) {
                        g0VarA = dVar.a(((PricingPlanAnalyticsSource.Predefined) source).f102960a);
                    } else {
                        if (!(source instanceof PricingPlanAnalyticsSource.Custom)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        g0VarA = ggk.g0.DEFAULT;
                    }
                    nVarV = nim.a.v(nim.a.v(((wik.t) eVar).f(planId, g0VarA, loadingStrategy), new zke.f(20)), new yui.v(planId, i2));
                } else {
                    if (!(mode instanceof PlanBillingPickerContract$Mode.Standalone)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    PlanBillingPickerContract$Mode.Standalone standalone = (PlanBillingPickerContract$Mode.Standalone) mode;
                    String str4 = standalone.f103112b;
                    String str5 = standalone.f103113c;
                    Intrinsics.checkNotNullParameter(planId, "planId");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    kjk.f0 f0Var = (kjk.f0) ((wik.t) eVar).f297935a;
                    f0Var.getClass();
                    Intrinsics.checkNotNullParameter(planId, "planId");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    nVarV = nim.a.v(nim.a.v(((x4l.c) f0Var.f184439l.getValue()).b(new kjk.b0(str4, str5, planId), loadingStrategy), new zke.f(21)), new yui.v(planId, 18));
                }
                return nim.a.v(nVarV, new yrb.n(qVar, 6));
            case 3:
                n1 n1Var = (n1) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var instanceof l1) {
                    ((com.revolut.feature.security_hub.impl.ui.street_mode.trusted_wifis_list.a) obj5).C2(new zvc.e((String) obj4));
                }
                return Unit.f186387a;
            default:
                wxd.s sVar = (wxd.s) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.statements.impl.ui.documents_hub.a aVar8 = (com.revolut.feature.statements.impl.ui.documents_hub.a) obj5;
                DocumentsHubScreenContract$InputData documentsHubScreenContract$InputData = aVar8.o;
                String str6 = ((zzd.q) ((j2) aVar8.A.f22677a).getValue()).f326690c;
                if (str6 == null) {
                    str6 = documentsHubScreenContract$InputData.f88357b;
                }
                if (str6 == null) {
                    wxd.r rVar = (wxd.r) zhm.d0.d0(sVar.f300884b);
                    if (rVar != null) {
                        str = rVar.f300880a;
                    }
                } else {
                    Iterator it8 = sVar.f300884b.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            Object next = it8.next();
                            String str7 = ((wxd.r) next).f300880a;
                            DocumentsHubProduct.Companion companion = DocumentsHubProduct.INSTANCE;
                            if (str7.equals(str6)) {
                                obj3 = next;
                            }
                        }
                    }
                    wxd.r rVar2 = (wxd.r) obj3;
                    if (rVar2 == null) {
                        throw new DocumentsHubMappingException("Documents Hub product not found: ".concat(str6));
                    }
                    str = rVar2.f300880a;
                }
                return new wc7.e(aVar8.f88361p.c(documentsHubScreenContract$InputData.f88356a, str, (w4l.k) obj4), i2, sVar, str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(zh6.c cVar, TopUpMethodsContext topUpMethodsContext, String str, Continuation continuation) {
        super(2, continuation);
        this.u = 1;
        this.v = cVar;
        this.f322163w = topUpMethodsContext;
        this.f322164x = str;
    }
}
