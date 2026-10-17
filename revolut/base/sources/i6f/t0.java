package i6f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public abstract class t0 extends yji.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0 f158981c;
    public final v0 d;
    public final String e;

    public t0(w0 view, v0 model, String retryKey) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(retryKey, "retryKey");
        this.f158981c = view;
        this.d = model;
        this.e = retryKey;
    }

    @Override // yji.d
    public void M() {
        yji.d.H(this, new ghk.a0(this.f158981c.L0(), this, 27), new s0(this, null), 3);
    }
}
