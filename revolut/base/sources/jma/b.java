package jma;

import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import rfm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements jf0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f176493a;

    public b(sri.m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f176493a = navigator;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return Intrinsics.f(deeplink.e(1) + "/" + deeplink.e(2), "cards/card-confirmation");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        f0 f0VarF = new pfm.h(new i1i.a(this, 5), 2).f(d0.m(Boolean.TRUE));
        Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
        return ue0.e.F(f0VarF, Boolean.FALSE);
    }
}
