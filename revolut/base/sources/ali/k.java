package ali;

import android.content.Intent;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements c, pki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rki.a f6280a;

    public k(g controller, int i, h model, int i2) {
        f pagerModelBinding = new f(controller, i, model, i2);
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(pagerModelBinding, "pagerModelBinding");
        this.f6280a = new rki.a(v.k(pagerModelBinding, new cli.v(controller, model, null)));
    }

    @Override // pki.a
    public final void J() {
        this.f6280a.J();
    }

    @Override // pki.a
    public final void J0(boolean z) {
        this.f6280a.J0(z);
    }

    @Override // pki.a
    public final void J1(os2.g token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.f6280a.J1(token);
    }

    @Override // pki.a
    public final void L1(yii.c stateStorage) {
        Intrinsics.checkNotNullParameter(stateStorage, "stateStorage");
        this.f6280a.L1(stateStorage);
    }

    @Override // pki.a
    public final void R0() {
        this.f6280a.R0();
    }

    @Override // pki.a
    public final void W() {
        this.f6280a.W();
    }

    @Override // pki.a
    public final void b0(yii.c stateStorage) {
        Intrinsics.checkNotNullParameter(stateStorage, "stateStorage");
        this.f6280a.b0(stateStorage);
    }

    @Override // pki.a
    public final void c2() {
        this.f6280a.getClass();
    }

    @Override // yji.r
    public final void e(Bundle state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f6280a.e(state);
    }

    @Override // pki.a
    public final void e0(os2.g token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.f6280a.e0(token);
    }

    @Override // yji.r
    public final void g(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        this.f6280a.g(outState);
    }

    @Override // pki.a
    public final void g1(boolean z) {
        this.f6280a.g1(z);
    }

    @Override // pki.a
    public final void i1(boolean z) {
        this.f6280a.i1(z);
    }

    @Override // pki.a
    public final boolean l0(boolean z) {
        return this.f6280a.l0(z);
    }

    @Override // pki.a
    public final void n() {
        this.f6280a.n();
    }

    @Override // pki.a
    public final void o(int i, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        this.f6280a.o(i, permissions, grantResults);
    }

    @Override // pki.a
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.f6280a.onActivityResult(i, i2, intent);
    }

    @Override // pki.a
    public final void onCreate() {
        this.f6280a.onCreate();
    }

    @Override // pki.a
    public final void onDestroy() {
        this.f6280a.onDestroy();
    }

    @Override // pki.a
    public final void u(boolean z) {
        this.f6280a.u(z);
    }

    @Override // pki.a
    public final boolean u1(oki.d defaultHandler) {
        Intrinsics.checkNotNullParameter(defaultHandler, "defaultHandler");
        return this.f6280a.u1(defaultHandler);
    }

    @Override // pki.a
    public final void z() {
        this.f6280a.z();
    }
}
