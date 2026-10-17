package e8;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes16.dex */
public final class b extends WeakReference {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c8.g f123433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f123434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e0 f123435c;

    public b(c8.g gVar, z zVar, ReferenceQueue referenceQueue) {
        super(zVar, referenceQueue);
        y8.f.c(gVar, "Argument must not be null");
        this.f123433a = gVar;
        boolean z = zVar.f123543a;
        this.f123435c = null;
        this.f123434b = z;
    }

    public final void a() {
        this.f123435c = null;
        clear();
    }
}
