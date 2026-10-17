package lx0;

import kotlin.jvm.internal.Intrinsics;
import pfm.r;
import te0.w;

/* JADX INFO: loaded from: classes.dex */
public final class j implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f200515a;

    public j(f cache) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        this.f200515a = cache;
    }

    public final boolean a(String videoUrl) {
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        return this.f200515a.f200510a.getKeys().contains(videoUrl);
    }

    public final r b(String videoUrl) {
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        pfm.h hVar = new pfm.h(new la8.j(this, videoUrl, 5), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return w.g0(hVar);
    }
}
