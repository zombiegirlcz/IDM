package bw6;

import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.model.PersonalDetailsForm;
import com.revolut.sso.impl.domain.models.Challenge;
import com.revolut.sso.impl.ui.auth.n;
import h93.f0;
import ip0.um0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import mn1.b0;
import ocb.x;
import yna.c1;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f19252w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f19253x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f19254y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a aVar, boolean z, Continuation continuation) {
        super(1, continuation);
        this.u = 4;
        this.f19254y = aVar;
        this.f19252w = z;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k((l) this.f19253x, this.f19252w, (FreelancerInvoice) this.f19254y, continuation, 0);
            case 1:
                return new k((com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.e) this.f19253x, (String) this.f19254y, this.f19252w, continuation, 1);
            case 2:
                return new k((com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.e) this.f19253x, (PersonalDetailsForm) this.f19254y, this.f19252w, continuation, 2);
            case 3:
                return new k((CoroutineScope) this.f19253x, this.f19252w, (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.a) this.f19254y, continuation, 3);
            case 4:
                return new k((com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a) this.f19254y, this.f19252w, continuation);
            case 5:
                return new k(this.f19252w, (com.revolut.sso.impl.ui.consent.qr.b) this.f19253x, (String) this.f19254y, continuation, 5);
            case 6:
                return new k(this.f19252w, (com.revolut.feature.security_hub.impl.ui.flow.m) this.f19253x, (f0) this.f19254y, continuation, 6);
            case 7:
                return new k((jh6.g) this.f19253x, (String) this.f19254y, this.f19252w, continuation, 7);
            case 8:
                return new k((com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.c) this.f19253x, (String) this.f19254y, this.f19252w, continuation, 8);
            case 9:
                return new k(this.f19252w, (b0) this.f19253x, (String) this.f19254y, continuation, 9);
            case 10:
                return new k((String) this.f19253x, (x) this.f19254y, this.f19252w, continuation, 10);
            case 11:
                return new k((n) this.f19253x, (Challenge) this.f19254y, this.f19252w, continuation, 11);
            case 12:
                return new k((String) this.f19253x, (szb.j) this.f19254y, this.f19252w, continuation, 12);
            case 13:
                return new k((tob.i) this.f19253x, (String) this.f19254y, this.f19252w, continuation, 13);
            case 14:
                return new k((com.revolut.feature.statements.impl.ui.account.a) this.f19253x, (String) this.f19254y, this.f19252w, continuation, 14);
            default:
                return new k((um0) this.f19253x, (c1) this.f19254y, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((k) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:291|402|(1:(1:(2:295|296)(2:297|439))(2:298|299))(10:304|406|305|(2:307|308)(1:309)|404|310|311|(0)|323|333)|407|314|(1:316)|322|323|333) */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x057e, code lost:
    
        if (r2 == r1) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x062a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x062d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:438:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r1v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v24, types: [yhm.m$a] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2106
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bw6.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(um0 um0Var, c1 c1Var, Continuation continuation) {
        super(1, continuation);
        this.u = 15;
        this.f19253x = um0Var;
        this.f19254y = c1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj2, Object obj3, boolean z, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f19253x = obj2;
        this.f19254y = obj3;
        this.f19252w = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj2, boolean z, Object obj3, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f19253x = obj2;
        this.f19252w = z;
        this.f19254y = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(boolean z, oki.h hVar, Object obj2, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f19252w = z;
        this.f19253x = hVar;
        this.f19254y = obj2;
    }
}
