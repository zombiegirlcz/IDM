package egm;

import io.reactivex.rxjava3.core.Scheduler;
import ygm.g;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Scheduler f125669a;

    static {
        try {
            e eVar = a.f125668a;
            if (eVar == null) {
                throw new NullPointerException("Scheduler Callable returned null");
            }
            f125669a = eVar;
        } catch (Throwable th10) {
            throw g.f(th10);
        }
    }

    public static Scheduler a() {
        Scheduler scheduler = f125669a;
        if (scheduler != null) {
            return scheduler;
        }
        throw new NullPointerException("scheduler == null");
    }
}
