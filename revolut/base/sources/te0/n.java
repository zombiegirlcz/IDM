package te0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n extends f {
    /* JADX WARN: Illegal instructions before constructor call */
    public n() {
        od0.i.Companion.getClass();
        od0.i iVar = od0.i.f224256b;
        Intrinsics.checkNotNullParameter(iVar, "default");
        super(iVar);
    }

    @Override // te0.f
    public final e a(Object obj2, String key) {
        od0.i iVar = (od0.i) obj2;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(iVar, "default");
        return new m(key, iVar);
    }

    @Override // te0.f
    public final e b(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new m(key, k.f);
    }
}
