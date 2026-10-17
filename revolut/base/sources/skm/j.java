package skm;

import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes14.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f263982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f263983b;

    public /* synthetic */ j(Object obj2, int i) {
        this.f263982a = i;
        this.f263983b = obj2;
    }

    @Override // skm.k
    public final void a(Throwable th10) {
        switch (this.f263982a) {
            case 0:
                ((ScheduledFuture) this.f263983b).cancel(false);
                break;
            default:
                ((Function1) this.f263983b).invoke(th10);
                break;
        }
    }

    public final String toString() {
        switch (this.f263982a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f263983b) + ']';
            default:
                return "CancelHandler.UserSupplied[" + ((Function1) this.f263983b).getClass().getSimpleName() + '@' + e0.s(this) + ']';
        }
    }
}
