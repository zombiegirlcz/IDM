package qc0;

import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import com.revolut.feature.incentive_reward.impl.model.IncentiveRewardDetailsParams;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonsValues;
import com.revolut.feature_credit_data_monitoring_sdk_proxy.incognia.IncogniaCustomEvent;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes19.dex */
public final class e1 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f244412w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f244413x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f244412w = obj2;
        this.f244413x = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e1((f1) this.f244412w, (String) this.f244413x, continuation, 0);
            case 1:
                return new e1((qca.q) this.f244412w, (ApmDescriptor) this.f244413x, continuation, 1);
            case 2:
                e1 e1Var = new e1((qcc.m) this.f244413x, continuation, 2);
                e1Var.f244412w = obj2;
                return e1Var;
            case 3:
                return new e1((qd8.f) this.f244412w, (qd8.c) this.f244413x, continuation, 3);
            case 4:
                return new e1((qe5.l) this.f244413x, continuation, 4);
            case 5:
                return new e1((com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.a) this.f244413x, continuation, 5);
            case 6:
                return new e1((qf7.i) this.f244412w, (IncentiveRewardDetailsParams) this.f244413x, continuation, 6);
            case 7:
                return new e1((com.revolut.feature.credit.application.plugins.impl.ui.post_retail_onboarding.a) this.f244412w, (dt3.b) this.f244413x, continuation, 7);
            case 8:
                return new e1((qg5.c) this.f244412w, (ArrayList) this.f244413x, continuation, 8);
            case 9:
                return new e1((qge.b) this.f244412w, (lie.a) this.f244413x, continuation, 9);
            case 10:
                return new e1((qh4.b0) this.f244412w, (String) this.f244413x, continuation, 10);
            case 11:
                return new e1((qhc.b) this.f244412w, (String) this.f244413x, continuation, 11);
            case 12:
                return new e1((com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.flow.a) this.f244412w, (ri4.h) this.f244413x, continuation, 12);
            case 13:
                e1 e1Var2 = new e1((qie.f) this.f244413x, continuation, 13);
                e1Var2.f244412w = obj2;
                return e1Var2;
            case 14:
                return new e1((k7i.i) this.f244412w, (FeatureCommand) this.f244413x, continuation, 14);
            case 15:
                return new e1((qkc.a) this.f244412w, (String) this.f244413x, continuation, 15);
            case 16:
                e1 e1Var3 = new e1((yld.c) this.f244413x, continuation, 16);
                e1Var3.f244412w = obj2;
                return e1Var3;
            case 17:
                return new e1((qna.s) this.f244412w, (String) this.f244413x, continuation, 17);
            case 18:
                return new e1((com.revolut.feature.payments.air.widget.impl.ui.flow.a) this.f244412w, (String) this.f244413x, continuation, 18);
            case 19:
                return new e1((qoc.r) this.f244412w, (String) this.f244413x, continuation, 19);
            case 20:
                return new e1((qp5.c0) this.f244412w, (ty0.a) this.f244413x, continuation, 20);
            case 21:
                return new e1((qq3.g) this.f244412w, (IncogniaCustomEvent) this.f244413x, continuation, 21);
            case 22:
                return new e1((qq3.g) this.f244412w, (Set) this.f244413x, continuation, 22);
            case 23:
                return new e1((com.revolut.feature.transfer_reasons.impl.flow.a) this.f244412w, (TransferReasonsValues) this.f244413x, continuation, 23);
            case 24:
                return new e1((com.revolut.feature.insurance_credit.impl.ui.screen.coverage_details.a) this.f244412w, (String) this.f244413x, continuation, 24);
            case 25:
                return new e1((yt8.a) this.f244412w, (qt8.l) this.f244413x, continuation, 25);
            case 26:
                return new e1((qt8.l) this.f244412w, (String) this.f244413x, continuation, 26);
            case 27:
                return new e1((my8.a0) this.f244412w, (qt8.o) this.f244413x, continuation, 27);
            case 28:
                return new e1((ftb.b) this.f244412w, (ptb.f) this.f244413x, continuation, 28);
            default:
                return new e1((qu1.p) this.f244412w, (Alias) this.f244413x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((e1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:225|(1:(1:228)(2:229|230))(3:231|(0)|295)|234|489|235|239|(1:241)|242|495|243|247|(1:249)|250|(8:252|(12:255|493|256|260|(1:262)|263|487|264|268|(2:270|511)(1:512)|271|253)|510|272|(1:274)(1:275)|276|(8:278|491|279|283|(1:285)|286|(1:288)(1:289)|290)(1:291)|292)(1:293)|294|295) */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x04d0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x04d1, code lost:
    
        r8 = yhm.m.INSTANCE;
        r0 = yhm.o.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x04e8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x04e9, code lost:
    
        r9 = yhm.m.INSTANCE;
        r0 = yhm.o.a(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v51, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v28, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object, java.util.Map] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qc0.e1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f244413x = obj2;
    }
}
