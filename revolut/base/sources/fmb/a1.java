package fmb;

import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.feature.checkout.models.PreorderResult;
import com.revolut.feature.robo.impl.ui.flow.onboarding.OnboardingFlowContract$State;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import java.util.Set;
import java.util.UUID;
import k50.j4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class a1 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f136259w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f136260x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f136261y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(SavingsProductData savingsProductData, com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b bVar, Continuation continuation) {
        super(1, continuation);
        this.u = 0;
        this.f136261y = savingsProductData;
        this.z = bVar;
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [gim.i, kotlin.jvm.functions.Function2] */
    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a1((SavingsProductData) this.f136261y, (com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b) this.z, continuation);
            case 1:
                return new a1((com.revolut.feature.security_hub.impl.ui.flow.m) this.f136260x, (CoroutineScope) this.f136261y, (String) this.z, this.f136259w, continuation, 1);
            case 2:
                return new a1((j4) this.f136260x, (UUID) this.f136261y, (Integer) this.z, this.f136259w, continuation, 2);
            case 3:
                return new a1((kmc.s) this.f136260x, (Function1) this.f136261y, (OnboardingFlowContract$State) this.z, this.f136259w, continuation, 3);
            case 4:
                return new a1((ldh.m) this.f136260x, (nel.v0) this.f136261y, (bfl.g) this.z, this.f136259w, continuation, 4);
            case 5:
                return new a1((com.revolut.sso.impl.ui.auth.n) this.f136260x, (Set) this.f136261y, this.f136259w, (Function2) this.z, continuation);
            case 6:
                return new a1((cxe.l) this.f136260x, (com.revolut.feature.topup_screen.impl.flows.checkout.flow.e) this.f136261y, (String) this.z, continuation);
            case 7:
                return new a1((wh3.i) this.f136260x, (PreorderResult) this.f136261y, (CheckoutParams) this.z, this.f136259w, continuation, 7);
            default:
                return new a1((String) this.f136260x, (com.revolut.feature.sign_in_methods.impl.ui.sign_in_methods.a) this.f136261y, this.f136259w, this.z, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((a1) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:269:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:282:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v5, types: [gim.i, kotlin.jvm.functions.Function2] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fmb.a1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a1(com.revolut.sso.impl.ui.auth.n nVar, Set set, boolean z, Function2 function2, Continuation continuation) {
        super(1, continuation);
        this.u = 5;
        this.f136260x = nVar;
        this.f136261y = set;
        this.f136259w = z;
        this.z = (gim.i) function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(cxe.l lVar, com.revolut.feature.topup_screen.impl.flows.checkout.flow.e eVar, String str, Continuation continuation) {
        super(1, continuation);
        this.u = 6;
        this.f136260x = lVar;
        this.f136261y = eVar;
        this.z = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(Object obj2, Object obj3, Object obj4, boolean z, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f136260x = obj2;
        this.f136261y = obj3;
        this.z = obj4;
        this.f136259w = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(String str, com.revolut.feature.sign_in_methods.impl.ui.sign_in_methods.a aVar, boolean z, Object obj2, Continuation continuation) {
        super(1, continuation);
        this.u = 8;
        this.f136260x = str;
        this.f136261y = aVar;
        this.f136259w = z;
        this.z = obj2;
    }
}
