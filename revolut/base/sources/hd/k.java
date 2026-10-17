package hd;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes17.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f151352b = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f151353a = new AtomicReference(new q(new zq.a()));

    public final synchronized void a(o oVar) {
        zq.a aVar = new zq.a((q) this.f151353a.get());
        aVar.y(oVar);
        this.f151353a.set(new q(aVar));
    }
}
