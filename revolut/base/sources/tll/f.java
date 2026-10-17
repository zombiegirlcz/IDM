package tll;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends yji.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f272110c;

    public f(e interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        this.f272110c = interceptor;
    }

    @Override // yji.d
    public final boolean I() {
        return this.f272110c.f();
    }
}
