package g48;

import com.revolut.feature.joint.api.navigation.JointAccountsFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class y extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f140416w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(boolean z, z zVar, Continuation continuation) {
        super(2, continuation);
        this.v = z;
        this.f140416w = zVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new y(this.v, this.f140416w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((y) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            if (this.v) {
                return new FinishCommand(null, null, null, 7);
            }
            k38.a aVar2 = this.f140416w.e;
            FeatureCommand featureCommand = new FeatureCommand(new JointAccountsFeatureConfig.Invite((n38.d0) null, 3));
            this.u = 1;
            obj2 = ((com.revolut.feature.joint.impl.domain.a) aVar2).b(featureCommand, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return (NaviCommand) obj2;
    }
}
