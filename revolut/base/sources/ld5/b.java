package ld5;

import efm.r;
import kotlin.jvm.internal.Intrinsics;
import lak.i;
import org.jetbrains.annotations.NotNull;
import w4l.h;
import yoj.c;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xoj.a f194033a;

    public b(xoj.a featuresInteractor) {
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        this.f194033a = featuresInteractor;
    }

    public final r a() {
        r map = ((cpj.b) this.f194033a).j(c.CARDS_CRYPTO, h.f294642c).map(new i(new laj.b(this, 8), 15));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}
