package oh5;

import akg.n;
import kotlin.jvm.internal.Intrinsics;
import w4l.h;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.b f225311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iy.b f225312b;

    public e(wsg.b walletsInteractor, iy.b resolver) {
        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        this.f225311a = walletsInteractor;
        this.f225312b = resolver;
    }

    public static n a(e eVar, xi0.b currency) {
        eVar.getClass();
        Intrinsics.checkNotNullParameter(currency, "currency");
        h loadingStrategy = h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(eVar.f225311a.e(loadingStrategy), new ofg.a(eVar, currency, 5));
    }
}
