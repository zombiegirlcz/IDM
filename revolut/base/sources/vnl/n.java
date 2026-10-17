package vnl;

import com.revolut.sso.impl.domain.models.ChallengeDetails;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.h2;

/* JADX INFO: loaded from: classes12.dex */
public final class n extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ p v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ChallengeDetails.PushOtp f290827w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, ChallengeDetails.PushOtp pushOtp, Continuation continuation) {
        super(1, continuation);
        this.v = pVar;
        this.f290827w = pushOtp;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new n(this.v, this.f290827w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((n) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        p pVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            vmf.k kVar = new vmf.k(pVar, null, 1);
            this.u = 1;
            obj2 = h2.d(5000L, kVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        String str = (String) obj2;
        pVar.f290831m.i();
        if (str == null) {
            return g.f290824a;
        }
        ChallengeDetails.PushOtp pushOtp = this.f290827w;
        return (pushOtp == null || !pushOtp.f106113a) ? new e(str) : new f(str);
    }
}
