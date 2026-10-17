package ywj;

import com.revolut.retail.feature.api.userauth.navigation.UserOnboardingNavigationProvider$UseCase;
import com.revolut.retail.feature.impl.userauth.screen.revolut_sso.RetailRevolutSsoFlowContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nii.n1;
import uv1.c0;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c f317486w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f317486w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m(this.f317486w, continuation, 0);
            default:
                return new m(this.f317486w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((m) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((m) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c cVar = this.f317486w;
                    Object objP2 = cVar.p2(this, new c0(cVar, UserOnboardingNavigationProvider$UseCase.Default.f99363a, cVar, (Continuation) null, 20));
                    if (objP2 != aVar) {
                        objP2 = Unit.f186387a;
                    }
                    if (objP2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c cVar2 = this.f317486w;
                    RetailRevolutSsoFlowContract$InputData retailRevolutSsoFlowContract$InputData = cVar2.f101710p;
                    Object obj3 = ((retailRevolutSsoFlowContract$InputData instanceof RetailRevolutSsoFlowContract$InputData.CombinedAuthentication) && ((RetailRevolutSsoFlowContract$InputData.CombinedAuthentication) retailRevolutSsoFlowContract$InputData).d) ? UserOnboardingNavigationProvider$UseCase.SignUp.f99365a : UserOnboardingNavigationProvider$UseCase.Default.f99363a;
                    this.v = 1;
                    Object objP22 = cVar2.p2(this, new c0(cVar2, obj3, cVar2, (Continuation) null, 20));
                    if (objP22 != aVar2) {
                        objP22 = Unit.f186387a;
                    }
                    if (objP22 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
