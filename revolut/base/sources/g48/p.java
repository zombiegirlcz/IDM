package g48;

import com.revolut.feature.joint.api.models.JointDeeplink;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ z v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ JointDeeplink.AccountId f140398w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(z zVar, JointDeeplink.AccountId accountId, Continuation continuation) {
        super(2, continuation);
        this.v = zVar;
        this.f140398w = accountId;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new p(this.v, this.f140398w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        jhi.b bVarG = mo3.a.g(this.v.f140417a.f(this.f140398w.f76467a), null, new g3e.s(6), 1);
        this.u = 1;
        Object objX = vkm.q.x(bVarG, this);
        return objX == aVar ? aVar : objX;
    }
}
