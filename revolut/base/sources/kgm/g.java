package kgm;

import fgm.l;

/* JADX INFO: loaded from: classes14.dex */
public final class g implements igm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f184020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f184021b;

    public /* synthetic */ g(Object obj2, int i) {
        this.f184020a = i;
        this.f184021b = obj2;
    }

    @Override // igm.a
    public final void run() {
        switch (this.f184020a) {
            case 0:
                ((igm.g) this.f184021b).accept(fgm.f.f135106b);
                break;
            default:
                ((l) this.f184021b).onComplete();
                break;
        }
    }
}
