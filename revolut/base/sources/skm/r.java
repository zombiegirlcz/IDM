package skm;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes13.dex */
public final class r extends r1 implements q {
    public r(Job job2) {
        super(true);
        R(job2);
    }

    public final boolean h0(Throwable th10) {
        return U(new u(th10, false));
    }

    @Override // skm.g0
    public final Object i(Continuation continuation) {
        Object objY = y(continuation);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        return objY;
    }
}
