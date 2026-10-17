package p2a;

import kotlin.jvm.internal.Intrinsics;
import q2a.f;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f232189a;

    public a(f transfersWallpaperInteractor) {
        Intrinsics.checkNotNullParameter(transfersWallpaperInteractor, "transfersWallpaperInteractor");
        this.f232189a = transfersWallpaperInteractor;
    }

    public final b a() {
        return new b(this.f232189a);
    }
}
