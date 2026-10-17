package rql;

import kotlin.jvm.internal.Intrinsics;
import ne0.d;
import od0.e;
import pql.h;
import vkm.q;
import vkm.z1;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f256597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1 f256598b;

    public a(d cache) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        this.f256597a = cache;
        this.f256598b = q.b(1, 5, null);
    }

    public final void a(String url2, h value) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f256597a.f(url2, value);
        this.f256598b.k(value);
    }

    @Override // od0.e
    public final void clear() throws Throwable {
        this.f256597a.clear();
        this.f256598b.i();
    }
}
