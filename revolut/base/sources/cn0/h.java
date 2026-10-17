package cn0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h implements od0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ne0.d f25341a;

    public h(ne0.d cache) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        this.f25341a = cache;
    }

    @Override // od0.e
    public final void clear() {
        this.f25341a.clear();
    }
}
