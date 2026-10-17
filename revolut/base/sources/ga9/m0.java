package ga9;

import com.revolut.feature.onboarding.impl.onboarding.OnboardingFlowContract$InputData;
import com.revolut.feature.onboarding.impl.onboarding.OnboardingFlowContract$State;
import com.revolut.retail.feature.api.userauth.models.UserAuthElement;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes5.dex */
public final class m0 extends gim.i implements Function3 {
    public final /* synthetic */ com.revolut.feature.onboarding.impl.onboarding.v A;
    public final /* synthetic */ boolean B;
    public UserAuthElement u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ OnboardingFlowContract$InputData f142094w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ OnboardingFlowContract$State f142095x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ List f142096y;
    public final /* synthetic */ Function2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(List list, Function2 function2, com.revolut.feature.onboarding.impl.onboarding.v vVar, boolean z, Continuation continuation) {
        super(3, continuation);
        this.f142096y = list;
        this.z = function2;
        this.A = vVar;
        this.B = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        com.revolut.feature.onboarding.impl.onboarding.v vVar = this.A;
        boolean z = this.B;
        m0 m0Var = new m0(this.f142096y, this.z, vVar, z, (Continuation) obj4);
        m0Var.f142094w = (OnboardingFlowContract$InputData) obj2;
        m0Var.f142095x = (OnboardingFlowContract$State) obj3;
        return m0Var.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        UserAuthElement userAuthElement;
        Object objG;
        UserAuthElement userAuthElement2;
        OnboardingFlowContract$InputData onboardingFlowContract$InputData = this.f142094w;
        OnboardingFlowContract$State onboardingFlowContract$State = this.f142095x;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        com.revolut.feature.onboarding.impl.onboarding.v vVar = this.A;
        if (i == 0) {
            yhm.o.b(obj2);
            UserAuthElement userAuthElement3 = (UserAuthElement) zhm.d0.d0(this.f142096y);
            this.f142094w = onboardingFlowContract$InputData;
            this.f142095x = onboardingFlowContract$State;
            this.u = userAuthElement3;
            this.v = 1;
            Object objInvoke = this.z.invoke(userAuthElement3, this);
            if (objInvoke != aVar) {
                userAuthElement = userAuthElement3;
                obj2 = objInvoke;
            }
            return aVar;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            userAuthElement2 = this.u;
            yhm.o.b(obj2);
            com.revolut.feature.onboarding.impl.onboarding.v.L2(vVar, onboardingFlowContract$InputData, onboardingFlowContract$State, userAuthElement2, this.B);
            return Unit.f186387a;
        }
        userAuthElement = this.u;
        yhm.o.b(obj2);
        if (((Boolean) obj2).booleanValue()) {
            return Unit.f186387a;
        }
        if (userAuthElement == null) {
            vVar.C2(new q89.b(onboardingFlowContract$State.f78312a));
            return Unit.f186387a;
        }
        this.f142094w = onboardingFlowContract$InputData;
        this.f142095x = onboardingFlowContract$State;
        this.u = userAuthElement;
        this.v = 2;
        vVar.getClass();
        if ((!(userAuthElement instanceof UserAuthElement.DocumentId) && !(userAuthElement instanceof UserAuthElement.DocumentKyc) && !(userAuthElement instanceof UserAuthElement.ProductLifecycle) && !(userAuthElement instanceof UserAuthElement.Workflow) && !(userAuthElement instanceof UserAuthElement.SelfieKyc)) || (objG = skm.e0.G(new c0(vVar, null, 0), this)) != aVar) {
            objG = Unit.f186387a;
        }
        if (objG != aVar) {
            userAuthElement2 = userAuthElement;
            com.revolut.feature.onboarding.impl.onboarding.v.L2(vVar, onboardingFlowContract$InputData, onboardingFlowContract$State, userAuthElement2, this.B);
            return Unit.f186387a;
        }
        return aVar;
    }
}
