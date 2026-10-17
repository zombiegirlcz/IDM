package zki;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f323052a;

    public e(f controller, h model) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f323052a = model;
    }

    @Override // pki.a
    public final void J1(os2.g token) {
        Intrinsics.checkNotNullParameter(token, "token");
    }

    @Override // yji.r
    public final void e(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "state");
        com.revolut.kompot.navigable.vc.modal.a aVarK = this.f323052a.K();
        aVarK.getClass();
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        aVarK.f98444c = bundle;
    }

    @Override // pki.a
    public final void e0(os2.g token) {
        Intrinsics.checkNotNullParameter(token, "token");
    }

    @Override // yji.r
    public final void g(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        this.f323052a.K().e(outState);
    }

    @Override // pki.a
    public final void onCreate() {
        this.f323052a.K().c();
    }
}
