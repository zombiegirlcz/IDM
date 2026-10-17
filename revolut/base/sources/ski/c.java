package ski;

import ali.f;
import android.content.Intent;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import oki.d;
import os2.g;
import tki.e;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements pki.a, ali.c, e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rki.a f263949a;

    public c(a controller, int i, b model, int i2) {
        f pagerModelBinding = new f(controller, i, model, i2);
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(pagerModelBinding, "pagerModelBinding");
        this.f263949a = new rki.a(v.k(pagerModelBinding, new tki.f(controller, model)));
    }

    @Override // pki.a
    public final void J() {
        this.f263949a.J();
    }

    @Override // pki.a
    public final void J0(boolean z) {
        this.f263949a.J0(z);
    }

    @Override // pki.a
    public final void J1(g token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.f263949a.J1(token);
    }

    @Override // pki.a
    public final void L1(yii.c stateStorage) {
        Intrinsics.checkNotNullParameter(stateStorage, "stateStorage");
        this.f263949a.L1(stateStorage);
    }

    @Override // pki.a
    public final void R0() {
        this.f263949a.R0();
    }

    @Override // pki.a
    public final void W() {
        this.f263949a.W();
    }

    @Override // pki.a
    public final void b0(yii.c stateStorage) {
        Intrinsics.checkNotNullParameter(stateStorage, "stateStorage");
        this.f263949a.b0(stateStorage);
    }

    @Override // pki.a
    public final void c2() {
        this.f263949a.getClass();
    }

    @Override // yji.r
    public final void e(Bundle state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f263949a.e(state);
    }

    @Override // pki.a
    public final void e0(g token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.f263949a.e0(token);
    }

    @Override // yji.r
    public final void g(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        this.f263949a.g(outState);
    }

    @Override // pki.a
    public final void g1(boolean z) {
        this.f263949a.g1(z);
    }

    @Override // pki.a
    public final void i1(boolean z) {
        this.f263949a.i1(z);
    }

    @Override // pki.a
    public final boolean l0(boolean z) {
        return this.f263949a.l0(z);
    }

    @Override // pki.a
    public final void n() {
        this.f263949a.n();
    }

    @Override // pki.a
    public final void o(int i, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        this.f263949a.o(i, permissions, grantResults);
    }

    @Override // pki.a
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.f263949a.onActivityResult(i, i2, intent);
    }

    @Override // pki.a
    public final void onCreate() {
        this.f263949a.onCreate();
    }

    @Override // pki.a
    public final void onDestroy() {
        this.f263949a.onDestroy();
    }

    @Override // pki.a
    public final void u(boolean z) {
        this.f263949a.u(z);
    }

    @Override // pki.a
    public final boolean u1(d defaultHandler) {
        Intrinsics.checkNotNullParameter(defaultHandler, "defaultHandler");
        return this.f263949a.u1(defaultHandler);
    }

    @Override // pki.a
    public final void z() {
        this.f263949a.z();
    }
}
