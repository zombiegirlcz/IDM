package xsb;

import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pfm.h;
import pfm.z;
import sri.m;
import ue0.e;
import v3e.t;
import wp5.y;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements jf0.d {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f308441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lfa.b f308442b;

    public b(m navigator, lfa.b postActivationInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(postActivationInteractor, "postActivationInteractor");
        this.f308441a = navigator;
        this.f308442b = postActivationInteractor;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "relaunch");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        z zVarD = new h(new t(deeplink, this, 28), 2).D(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
        return e.F(zVarD, Boolean.FALSE);
    }
}
