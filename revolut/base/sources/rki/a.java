package rki;

import android.content.Intent;
import android.os.Bundle;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import oki.d;
import os2.g;
import yii.c;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements pki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f254886a;

    public a(List bindings) {
        Intrinsics.checkNotNullParameter(bindings, "bindings");
        this.f254886a = bindings;
    }

    @Override // pki.a
    public final void J() {
        Iterator it8 = this.f254886a.iterator();
        while (it8.hasNext()) {
            ((pki.a) it8.next()).J();
        }
    }

    @Override // pki.a
    public final void J0(boolean z) {
        Iterator it8 = this.f254886a.iterator();
        while (it8.hasNext()) {
            ((pki.a) it8.next()).J0(z);
        }
    }

    @Override // pki.a
    public final void J1(g token) {
        Intrinsics.checkNotNullParameter(token, "token");
        Iterator it8 = this.f254886a.iterator();
        while (it8.hasNext()) {
            ((pki.a) it8.next()).J1(token);
        }
    }

    @Override // pki.a
    public final void L1(c stateStorage) {
        Intrinsics.checkNotNullParameter(stateStorage, "stateStorage");
        Iterator it8 = this.f254886a.iterator();
        while (it8.hasNext()) {
            ((pki.a) it8.next()).L1(stateStorage);
        }
    }

    @Override // pki.a
    public final void R0() {
        Iterator it8 = this.f254886a.iterator();
        while (it8.hasNext()) {
            ((pki.a) it8.next()).R0();
        }
    }

    @Override // pki.a
    public final void W() {
        Iterator it8 = this.f254886a.iterator();
        while (it8.hasNext()) {
            ((pki.a) it8.next()).W();
        }
    }

    @Override // pki.a
    public final void b0(c stateStorage) {
        Intrinsics.checkNotNullParameter(stateStorage, "stateStorage");
        Iterator it8 = this.f254886a.iterator();
        while (it8.hasNext()) {
            ((pki.a) it8.next()).b0(stateStorage);
        }
    }

    @Override // yji.r
    public final void e(Bundle state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Iterator it8 = this.f254886a.iterator();
        while (it8.hasNext()) {
            ((pki.a) it8.next()).e(state);
        }
    }

    @Override // pki.a
    public final void e0(g token) {
        Intrinsics.checkNotNullParameter(token, "token");
        Iterator it8 = this.f254886a.iterator();
        while (it8.hasNext()) {
            ((pki.a) it8.next()).e0(token);
        }
    }

    @Override // yji.r
    public final void g(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        Iterator it8 = this.f254886a.iterator();
        while (it8.hasNext()) {
            ((pki.a) it8.next()).g(outState);
        }
    }

    @Override // pki.a
    public final void g1(boolean z) {
        Iterator it8 = this.f254886a.iterator();
        while (it8.hasNext()) {
            ((pki.a) it8.next()).g1(z);
        }
    }

    @Override // pki.a
    public final void i1(boolean z) {
        Iterator it8 = this.f254886a.iterator();
        while (it8.hasNext()) {
            ((pki.a) it8.next()).i1(z);
        }
    }

    @Override // pki.a
    public final boolean l0(boolean z) {
        List list = this.f254886a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            if (((pki.a) it8.next()).l0(z)) {
                return true;
            }
        }
        return false;
    }

    @Override // pki.a
    public final void n() {
        Iterator it8 = this.f254886a.iterator();
        while (it8.hasNext()) {
            ((pki.a) it8.next()).n();
        }
    }

    @Override // pki.a
    public final void o(int i, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        Iterator it8 = this.f254886a.iterator();
        while (it8.hasNext()) {
            ((pki.a) it8.next()).o(i, permissions, grantResults);
        }
    }

    @Override // pki.a
    public final void onActivityResult(int i, int i2, Intent intent) {
        Iterator it8 = this.f254886a.iterator();
        while (it8.hasNext()) {
            ((pki.a) it8.next()).onActivityResult(i, i2, intent);
        }
    }

    @Override // pki.a
    public final void onCreate() {
        Iterator it8 = this.f254886a.iterator();
        while (it8.hasNext()) {
            ((pki.a) it8.next()).onCreate();
        }
    }

    @Override // pki.a
    public final void onDestroy() {
        Iterator it8 = this.f254886a.iterator();
        while (it8.hasNext()) {
            ((pki.a) it8.next()).onDestroy();
        }
    }

    @Override // pki.a
    public final void u(boolean z) {
        Iterator it8 = this.f254886a.iterator();
        while (it8.hasNext()) {
            ((pki.a) it8.next()).u(z);
        }
    }

    @Override // pki.a
    public final boolean u1(d defaultHandler) {
        Intrinsics.checkNotNullParameter(defaultHandler, "defaultHandler");
        List list = this.f254886a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            if (((pki.a) it8.next()).u1(defaultHandler)) {
                return true;
            }
        }
        return false;
    }

    @Override // pki.a
    public final void z() {
        Iterator it8 = this.f254886a.iterator();
        while (it8.hasNext()) {
            ((pki.a) it8.next()).z();
        }
    }
}
