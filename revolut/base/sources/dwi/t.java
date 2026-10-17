package dwi;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class t implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f120461b;

    public /* synthetic */ t(x xVar, int i) {
        this.f120460a = i;
        this.f120461b = xVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f120460a) {
            case 0:
                return Boolean.valueOf(this.f120461b.b());
            default:
                return Boolean.valueOf(this.f120461b.f120468a.d("SCHEME_LOUNGES", null) == bla.c.ENABLED);
        }
    }
}
