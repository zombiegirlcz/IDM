package wki;

import android.content.Intent;
import android.os.Bundle;
import cli.a0;
import kotlin.jvm.internal.Intrinsics;
import oki.d;
import os2.g;
import yki.e;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements pki.a, yki.c, a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rki.a f298288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f298289b;

    public c(int i, a controller, b model) {
        e flowModelBinding = new e(i, 56, null, controller, model);
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(flowModelBinding, "flowModelBinding");
        this.f298288a = new rki.a(v.k(flowModelBinding, new cli.v(controller, model, null)));
        this.f298289b = flowModelBinding;
    }

    @Override // pki.a
    public final void J() {
        this.f298288a.J();
    }

    @Override // pki.a
    public final void J0(boolean z) {
        this.f298288a.J0(z);
    }

    @Override // pki.a
    public final void J1(g token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.f298288a.J1(token);
    }

    @Override // pki.a
    public final void L1(yii.c stateStorage) {
        Intrinsics.checkNotNullParameter(stateStorage, "stateStorage");
        this.f298288a.L1(stateStorage);
    }

    @Override // pki.a
    public final void R0() {
        this.f298288a.R0();
    }

    @Override // pki.a
    public final void W() {
        this.f298288a.W();
    }

    @Override // yki.c
    public final boolean b() {
        return this.f298289b.b();
    }

    @Override // pki.a
    public final void b0(yii.c stateStorage) {
        Intrinsics.checkNotNullParameter(stateStorage, "stateStorage");
        this.f298288a.b0(stateStorage);
    }

    @Override // pki.a
    public final void c2() {
        this.f298288a.getClass();
    }

    @Override // yji.r
    public final void e(Bundle state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f298288a.e(state);
    }

    @Override // pki.a
    public final void e0(g token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.f298288a.e0(token);
    }

    @Override // yji.r
    public final void g(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        this.f298288a.g(outState);
    }

    @Override // pki.a
    public final void g1(boolean z) {
        this.f298288a.g1(z);
    }

    @Override // pki.a
    public final void i1(boolean z) {
        this.f298288a.i1(z);
    }

    @Override // pki.a
    public final boolean l0(boolean z) {
        return this.f298288a.l0(z);
    }

    @Override // pki.a
    public final void n() {
        this.f298288a.n();
    }

    @Override // yki.c
    public final boolean n0() {
        return this.f298289b.n0();
    }

    @Override // pki.a
    public final void o(int i, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        this.f298288a.o(i, permissions, grantResults);
    }

    @Override // pki.a
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.f298288a.onActivityResult(i, i2, intent);
    }

    @Override // pki.a
    public final void onCreate() {
        this.f298288a.onCreate();
    }

    @Override // pki.a
    public final void onDestroy() {
        this.f298288a.onDestroy();
    }

    @Override // yki.c
    public final yki.b s() {
        return this.f298289b.f314629c.s();
    }

    @Override // pki.a
    public final void u(boolean z) {
        this.f298288a.u(z);
    }

    @Override // pki.a
    public final boolean u1(d defaultHandler) {
        Intrinsics.checkNotNullParameter(defaultHandler, "defaultHandler");
        return this.f298288a.u1(defaultHandler);
    }

    @Override // pki.a
    public final void z() {
        this.f298288a.z();
    }
}
