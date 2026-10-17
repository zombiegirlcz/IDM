package skm;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.internal.ChildCancelledException;

/* JADX INFO: loaded from: classes14.dex */
public final class b2 extends zkm.s {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b2(CoroutineContext coroutineContext, Continuation continuation, int i) {
        super(continuation, coroutineContext);
        this.e = i;
    }

    @Override // skm.r1
    public final boolean D(Throwable th10) {
        switch (this.e) {
            case 0:
                return false;
            default:
                if (th10 instanceof ChildCancelledException) {
                    return true;
                }
                return z(th10);
        }
    }
}
