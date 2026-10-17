package l48;

import com.revolut.feature.joint.api.navigation.JointAccountsFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import n38.d0;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends i implements Function2 {
    public FeatureCommand u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f192072w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d0 f192073x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, d0 d0Var, Continuation continuation) {
        super(2, continuation);
        this.f192072w = eVar;
        this.f192073x = d0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.f192072w, this.f192073x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FeatureCommand featureCommand;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            FeatureCommand featureCommandA = jbb.a.a(ibb.c.f160140a, null, null, null, 14);
            k38.a aVar2 = this.f192072w.f192075b;
            FeatureCommand featureCommand2 = new FeatureCommand(new JointAccountsFeatureConfig.Invite(this.f192073x, 2));
            this.u = featureCommandA;
            this.v = 1;
            Object objB = ((com.revolut.feature.joint.impl.domain.a) aVar2).b(featureCommand2, this);
            if (objB == aVar) {
                return aVar;
            }
            featureCommand = featureCommandA;
            obj2 = objB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            featureCommand = this.u;
            o.b(obj2);
        }
        return com.revolut.retail.core.navigation.a.c(featureCommand, (NaviCommand) obj2);
    }
}
