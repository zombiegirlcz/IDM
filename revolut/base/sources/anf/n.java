package anf;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class n extends fd0.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f7744c;

    public n(o oVar) {
        this.f7744c = oVar;
    }

    @Override // fd0.b
    public final Object b(fd0.c cVar, Object obj2) {
        a3 key = (a3) cVar;
        m mVar = (m) obj2;
        Intrinsics.checkNotNullParameter(key, "key");
        if (mVar == null) {
            throw new IllegalArgumentException("Sync object must be always passed");
        }
        return this.f7744c.p(key, mVar.f7741a, mVar.f7742b, mVar.f7743c, mVar.d);
    }
}
