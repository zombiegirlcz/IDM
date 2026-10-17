package g48;

import com.revolut.feature.joint.api.models.JointDeeplink;
import com.revolut.kompot.common.StackDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class v extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ z v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ JointDeeplink.InvitationMcy f140415w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(z zVar, JointDeeplink.InvitationMcy invitationMcy, Continuation continuation) {
        super(2, continuation);
        this.v = zVar;
        this.f140415w = invitationMcy;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new v(this.v, this.f140415w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            x48.k kVar = this.v.f140420g;
            this.u = 1;
            obj2 = kVar.e(this.f140415w, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return u0.f((StackDestination) obj2);
    }
}
