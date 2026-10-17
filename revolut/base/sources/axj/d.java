package axj;

import a5k.n;
import bjl.p;
import bjl.q;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.api.userauth.navigation.UserAuthFeatureConfig;
import com.revolut.retail.feature.api.userauth.navigation.UserOnboardingNavigationProvider$UseCase;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends i implements Function1 {
    public int u;
    public final /* synthetic */ Ref$ObjectRef v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f10984w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.impl.userauth.screen.revolut_sso.wrapper.a f10985x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Ref$ObjectRef ref$ObjectRef, q qVar, com.revolut.retail.feature.impl.userauth.screen.revolut_sso.wrapper.a aVar, Continuation continuation) {
        super(1, continuation);
        this.v = ref$ObjectRef;
        this.f10984w = qVar;
        this.f10985x = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d(this.v, this.f10984w, this.f10985x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            Object obj3 = this.v.f186409a;
            if (obj3 == null) {
                Intrinsics.r("codeVerifier");
                throw null;
            }
            FeatureCommand featureCommand = new FeatureCommand(new UserAuthFeatureConfig.AutoSignInAfterSsoUnlockAppWithBiometrics((String) obj3, ((p) this.f10984w).f16182a, true, new UserAuthFeatureConfig.UseCase.SignIn(0)));
            this.u = 1;
            com.revolut.retail.feature.impl.userauth.screen.revolut_sso.wrapper.a aVar2 = this.f10985x;
            Object objP2 = aVar2.p2(this, new n(2, aVar2, UserOnboardingNavigationProvider$UseCase.Default.f99363a, aVar2, featureCommand, (Continuation) null));
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
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
