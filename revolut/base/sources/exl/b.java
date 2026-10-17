package exl;

import es.e;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.j;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gxl.b f130467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a61.a f130468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hxl.b f130469c;
    public final Lazy d;

    public b(gxl.b instanceProvider, a61.a cardSceneLoader, hxl.b ndkLoader) {
        Intrinsics.checkNotNullParameter(instanceProvider, "instanceProvider");
        Intrinsics.checkNotNullParameter(cardSceneLoader, "cardSceneLoader");
        Intrinsics.checkNotNullParameter(ndkLoader, "ndkLoader");
        this.f130467a = instanceProvider;
        this.f130468b = cardSceneLoader;
        this.f130469c = ndkLoader;
        this.d = j.b(new e(this, 8));
    }
}
