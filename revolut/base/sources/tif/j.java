package tif;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class j implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f271507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f271508b;

    public /* synthetic */ j(AtomicReference atomicReference, int i) {
        this.f271507a = i;
        this.f271508b = atomicReference;
    }

    @Override // kfm.a
    public final void run() {
        switch (this.f271507a) {
            case 0:
                ifm.c cVar = (ifm.c) this.f271508b.getAndSet(null);
                if (cVar != null) {
                    cVar.dispose();
                }
                break;
            case 1:
                ifm.c cVar2 = (ifm.c) this.f271508b.getAndSet(null);
                if (cVar2 != null) {
                    cVar2.dispose();
                }
                break;
            case 2:
                ifm.c cVar3 = (ifm.c) this.f271508b.getAndSet(null);
                if (cVar3 != null) {
                    cVar3.dispose();
                }
                break;
            default:
                ifm.c cVar4 = (ifm.c) this.f271508b.getAndSet(null);
                if (cVar4 != null) {
                    cVar4.dispose();
                }
                break;
        }
    }
}
