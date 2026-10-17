package hhm;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f152425a;

    public /* synthetic */ b(int i) {
        this.f152425a = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f152425a) {
            case 0:
                return a.f152424a;
            case 1:
                return c.f152426a;
            case 2:
                return d.f152427a;
            case 3:
                return e.f152428a;
            default:
                return null;
        }
    }
}
