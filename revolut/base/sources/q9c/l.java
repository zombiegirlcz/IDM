package q9c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends yji.n implements vki.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j f243869l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final q7c.q f243870m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final vki.a f243871n;

    public l(j inputData, q7c.q revolutPayInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revolutPayInteractor, "revolutPayInteractor");
        this.f243869l = inputData;
        this.f243870m = revolutPayInteractor;
        this.f243871n = pyd.c.a(this, new k(null));
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f243871n;
    }
}
