package anf;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends fd0.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f7740c;

    public j(k kVar) {
        this.f7740c = kVar;
    }

    @Override // fd0.b
    public final Object b(fd0.c cVar, Object obj2) {
        a3 key = (a3) cVar;
        i iVar = (i) obj2;
        Intrinsics.checkNotNullParameter(key, "key");
        if (iVar == null) {
            throw new IllegalArgumentException("Sync object must be always passed");
        }
        return this.f7740c.p(key, iVar.f7738a, iVar.f7739b);
    }
}
