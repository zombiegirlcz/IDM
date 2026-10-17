package be7;

import bh8.u;
import bmk.q;
import com.revolut.business.feature.referrals.model.RewardTargetAccount;
import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.alias.RegisterAlias$Alias;
import com.revolut.feature.payments.messaging.data.api.model.MessageType;
import com.revolut.feature.tab.invest.impl.ui.home.TabInvestController;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanOfferPromptPresentAction;
import java.time.Instant;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import v60.d;

/* JADX INFO: loaded from: classes21.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f14710w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f14711x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(brf.f fVar, Object obj2, Continuation continuation) {
        super(2, continuation);
        this.u = 24;
        this.f14711x = fVar;
        this.f14710w = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v33, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                s sVar = new s((t) this.f14711x, continuation, 0);
                sVar.f14710w = obj2;
                return sVar;
            case 1:
                return new s((bek.g) this.f14710w, (String) this.f14711x, continuation, 1);
            case 2:
                return new s((LinkedHashMap) this.f14710w, (bek.g) this.f14711x, continuation, 2);
            case 3:
                return new s((bf2.c) this.f14710w, (String) this.f14711x, continuation, 3);
            case 4:
                s sVar2 = new s((bg2.x) this.f14711x, continuation, 4);
                sVar2.f14710w = obj2;
                return sVar2;
            case 5:
                return new s((bgg.b) this.f14710w, (String) this.f14711x, continuation, 5);
            case 6:
                return new s((u) this.f14710w, (bh8.l) this.f14711x, continuation, 6);
            case 7:
                return new s((bi2.o) this.f14710w, (Alias) this.f14711x, continuation, 7);
            case 8:
                return new s((bi2.o) this.f14710w, (RegisterAlias$Alias) this.f14711x, continuation, 8);
            case 9:
                return new s((com.revolut.feature.junior_onboarding.impl.ui.creation.a) this.f14710w, (ei8.c) this.f14711x, continuation, 9);
            case 10:
                return new s((bld.m) this.f14710w, (String) this.f14711x, continuation, 10);
            case 11:
                s sVar3 = new s((TabInvestController) this.f14711x, continuation, 11);
                sVar3.f14710w = obj2;
                return sVar3;
            case 12:
                s sVar4 = new s((com.revolut.feature.tab.invest.impl.ui.home.f) this.f14711x, continuation, 12);
                sVar4.f14710w = obj2;
                return sVar4;
            case 13:
                return new s((com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation.e) this.f14710w, (Instant) this.f14711x, continuation, 13);
            case 14:
                return new s((com.revolut.feature.pay_with_smile.impl.ui.flow.enrollment.c) this.f14710w, (xl9.i) this.f14711x, continuation, 14);
            case 15:
                return new s((q) this.f14710w, (PlanOfferPromptPresentAction) this.f14711x, continuation, 15);
            case 16:
                return new s((com.revolut.feature.tax_residency.impl.flows.missing.b) this.f14710w, (Function1) this.f14711x, continuation);
            case 17:
                return new s((bof.q) this.f14711x, continuation, 17);
            case 18:
                return new s((bq7.l) this.f14710w, (kl7.a) this.f14711x, continuation, 18);
            case 19:
                return new s((bq8.e) this.f14710w, (d) this.f14711x, continuation, 19);
            case 20:
                return new s((com.revolut.sso.impl.ui.signin_sessions_flow.a) this.f14710w, (oki.g) this.f14711x, continuation, 20);
            case 21:
                return new s((br7.m) this.f14710w, (sl7.e) this.f14711x, continuation, 21);
            case 22:
                s sVar5 = new s((com.revolut.feature.salary_switch.impl.ui.brazil.screen.status.a) this.f14711x, continuation, 22);
                sVar5.f14710w = obj2;
                return sVar5;
            case 23:
                return new s((com.revolut.feature.salary_switch.impl.ui.brazil.screen.status.a) this.f14710w, (cqc.c) this.f14711x, continuation, 23);
            case 24:
                return new s((brf.f) this.f14711x, this.f14710w, continuation);
            case 25:
                return new s((com.revolut.feature.payments.groups.impl.ui_chat.chat.a) this.f14710w, (g6) this.f14711x, continuation, 25);
            case 26:
                return new s((com.revolut.feature.payments.groups.impl.ui_chat.chat.a) this.f14710w, (MessageType) this.f14711x, continuation, 26);
            case 27:
                return new s((bsc.c) this.f14710w, (vrc.a) this.f14711x, continuation, 27);
            case 28:
                return new s((bt2.k) this.f14710w, (RewardTargetAccount) this.f14711x, continuation, 28);
            default:
                return new s((com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.smart_estimation.bottom_sheet.b) this.f14710w, (String) this.f14711x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((s) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:289:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:509:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r3v58, types: [gim.i, kotlin.jvm.functions.Function1] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: be7.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s(com.revolut.feature.tax_residency.impl.flows.missing.b bVar, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.u = 16;
        this.f14710w = bVar;
        this.f14711x = (gim.i) function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f14710w = obj2;
        this.f14711x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f14711x = obj2;
    }
}
