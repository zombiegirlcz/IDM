package kkf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final klf.h0 f185023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vlf.b f185024b;

    public y0(klf.h0 commonDataSource, vlf.b commonUiMapper) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonUiMapper, "commonUiMapper");
        this.f185023a = commonDataSource;
        this.f185024b = commonUiMapper;
    }

    public final cmf.p a() {
        return new cmf.p(new kh4.f(this.f185023a.c(), this, 9), new i0(3), zhm.f0.f322471a, "Equivalent");
    }
}
