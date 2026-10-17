package sd;

import com.google.firebase.analytics.FirebaseAnalytics;
import efm.r;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes17.dex */
public final class d implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f261777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f261778b;

    public /* synthetic */ d(Object obj2, int i) {
        this.f261777a = i;
        this.f261778b = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f261777a) {
            case 0:
                return ((FirebaseAnalytics) this.f261778b).f49440a.zzl();
            case 1:
                return this.f261778b;
            case 2:
                return ((r) this.f261778b).replay();
            default:
                synchronized (((z7.c) this.f261778b)) {
                    try {
                        z7.c cVar = (z7.c) this.f261778b;
                        if (cVar.i == null) {
                            return null;
                        }
                        cVar.r();
                        if (((z7.c) this.f261778b).k()) {
                            ((z7.c) this.f261778b).p();
                            ((z7.c) this.f261778b).k = 0;
                        }
                        return null;
                    } finally {
                    }
                }
        }
    }
}
