package zh0;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.j;
import zc0.m;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends gi0.b implements gh0.a {

    @NotNull
    public static final c Companion = new c(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uqi.b f322207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f322208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f322209c;

    public e(uqi.b locationClientProvider) {
        Intrinsics.checkNotNullParameter(locationClientProvider, "locationClientProvider");
        this.f322207a = locationClientProvider;
        this.f322208b = j.b(new m(24));
        this.f322209c = j.b(new b(this, 0));
    }
}
