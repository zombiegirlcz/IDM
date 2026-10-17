package n30;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class c implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f211613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f211614b;

    public /* synthetic */ c(n nVar, int i) {
        this.f211613a = i;
        this.f211614b = nVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f211613a) {
            case 0:
                n nVar = this.f211614b;
                nVar.getClass();
                return nVar.e(true, v30.c0.ASSISTANT);
            default:
                n nVar2 = this.f211614b;
                nVar2.getClass();
                return nVar2.e(true, v30.c0.PRIVATE_BANKING);
        }
    }
}
