package gag;

import androidx.collection.LruCache;
import kotlin.jvm.internal.Intrinsics;
import lk0.f;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LruCache f142173a = new LruCache(20);

    @Override // gag.d
    public final Object a(f fVar, Object obj2) {
        vfi.a key = (vfi.a) fVar;
        eag.a value = (eag.a) obj2;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        eag.a aVar = (eag.a) this.f142173a.put(key, value);
        return aVar == null ? new eag.a(null, f0.f322471a) : aVar;
    }

    @Override // gag.d
    public final Object b(f fVar) {
        vfi.a key = (vfi.a) fVar;
        Intrinsics.checkNotNullParameter(key, "key");
        return (eag.a) this.f142173a.get(key);
    }
}
