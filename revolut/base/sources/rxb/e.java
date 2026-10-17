package rxb;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f258118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f258119b;

    public /* synthetic */ e(l lVar, int i) {
        this.f258118a = i;
        this.f258119b = lVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f258118a) {
            case 0:
                od0.h hVar = od0.i.Companion;
                Long lB = this.f258119b.f258129b.g().b();
                hVar.getClass();
                return od0.h.a(lB);
            default:
                od0.h hVar2 = od0.i.Companion;
                Long lA = this.f258119b.f258129b.g().a();
                hVar2.getClass();
                return od0.h.a(lA);
        }
    }
}
