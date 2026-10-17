package tki;

import android.content.Intent;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements e, pki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rki.a f271960a;

    public f(h controller, i model) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f271960a = new rki.a(v.k(new cli.v(controller, model, null), new zki.e(controller, model)));
    }

    @Override // pki.a
    public final void J() {
        this.f271960a.J();
    }

    @Override // pki.a
    public final void J0(boolean z) {
        this.f271960a.J0(z);
    }

    @Override // pki.a
    public final void J1(os2.g token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.f271960a.J1(token);
    }

    @Override // pki.a
    public final void L1(yii.c stateStorage) {
        Intrinsics.checkNotNullParameter(stateStorage, "stateStorage");
        this.f271960a.L1(stateStorage);
    }

    @Override // pki.a
    public final void R0() {
        this.f271960a.R0();
    }

    @Override // pki.a
    public final void W() {
        this.f271960a.W();
    }

    @Override // pki.a
    public final void b0(yii.c stateStorage) {
        Intrinsics.checkNotNullParameter(stateStorage, "stateStorage");
        this.f271960a.b0(stateStorage);
    }

    @Override // pki.a
    public final void c2() {
        this.f271960a.getClass();
    }

    @Override // yji.r
    public final void e(Bundle state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f271960a.e(state);
    }

    @Override // pki.a
    public final void e0(os2.g token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.f271960a.e0(token);
    }

    @Override // yji.r
    public final void g(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        this.f271960a.g(outState);
    }

    @Override // pki.a
    public final void g1(boolean z) {
        this.f271960a.g1(z);
    }

    @Override // pki.a
    public final void i1(boolean z) {
        this.f271960a.i1(z);
    }

    @Override // pki.a
    public final boolean l0(boolean z) {
        return this.f271960a.l0(z);
    }

    @Override // pki.a
    public final void n() {
        this.f271960a.n();
    }

    @Override // pki.a
    public final void o(int i, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        this.f271960a.o(i, permissions, grantResults);
    }

    @Override // pki.a
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.f271960a.onActivityResult(i, i2, intent);
    }

    @Override // pki.a
    public final void onCreate() {
        this.f271960a.onCreate();
    }

    @Override // pki.a
    public final void onDestroy() {
        this.f271960a.onDestroy();
    }

    @Override // pki.a
    public final void u(boolean z) {
        this.f271960a.u(z);
    }

    @Override // pki.a
    public final boolean u1(oki.d defaultHandler) {
        Intrinsics.checkNotNullParameter(defaultHandler, "defaultHandler");
        return this.f271960a.u1(defaultHandler);
    }

    @Override // pki.a
    public final void z() {
        this.f271960a.z();
    }
}
