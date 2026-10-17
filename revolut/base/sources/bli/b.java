package bli;

import aki.e;
import android.content.Intent;
import android.os.Bundle;
import com.revolut.kompot.navigable.vc.ViewController;
import dki.o;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import oki.d;
import oki.f;
import os2.g;
import zhm.b0;
import zhm.w0;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements pki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f16703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f16704b;

    public b(o childControllerManagersProvider, f controller) {
        Intrinsics.checkNotNullParameter(childControllerManagersProvider, "childControllerManagersProvider");
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.f16703a = childControllerManagersProvider;
        this.f16704b = controller;
    }

    @Override // pki.a
    public final void J() {
        Iterator it8 = this.f16703a.getAll().iterator();
        while (it8.hasNext()) {
            ((com.revolut.kompot.navigable.b) it8.next()).f();
        }
    }

    @Override // pki.a
    public final void J0(boolean z) {
        Iterator it8 = this.f16703a.getAll().iterator();
        while (it8.hasNext()) {
            com.revolut.kompot.navigable.a aVar = ((com.revolut.kompot.navigable.b) it8.next()).k;
            if (aVar != null) {
                aVar.J0(z);
            }
        }
    }

    @Override // pki.a
    public final void J1(g token) {
        pki.a aVarK;
        Intrinsics.checkNotNullParameter(token, "token");
        Iterator it8 = this.f16703a.getAll().iterator();
        while (it8.hasNext()) {
            yji.o oVar = ((com.revolut.kompot.navigable.b) it8.next()).k;
            f fVar = oVar instanceof f ? (f) oVar : null;
            if (fVar != null && (aVarK = fVar.k()) != null) {
                aVarK.J1(token);
            }
        }
    }

    @Override // pki.a
    public final void R0() {
        Iterator it8 = b0.L(this.f16703a.getAll()).iterator();
        while (true) {
            ListIterator listIterator = ((w0) it8).f322483a;
            if (!listIterator.hasPrevious()) {
                return;
            }
            com.revolut.kompot.navigable.b bVar = (com.revolut.kompot.navigable.b) listIterator.previous();
            com.revolut.kompot.navigable.a aVar = bVar.k;
            if (aVar != null) {
                bVar.c();
                if (bVar.f98422h && !aVar.x2()) {
                    return;
                }
            }
        }
    }

    @Override // pki.a
    public final void W() {
        Iterator it8 = this.f16703a.getAll().iterator();
        while (it8.hasNext()) {
            ((com.revolut.kompot.navigable.b) it8.next()).g();
        }
    }

    @Override // pki.a
    public final void c2() {
        Iterator it8 = b0.L(this.f16703a.getAll()).iterator();
        while (true) {
            ListIterator listIterator = ((w0) it8).f322483a;
            if (!listIterator.hasPrevious()) {
                return;
            }
            com.revolut.kompot.navigable.a aVar = ((com.revolut.kompot.navigable.b) listIterator.previous()).k;
            if (aVar != null) {
                aVar.K2();
            }
        }
    }

    @Override // yji.r
    public final void e(Bundle state) {
        Intrinsics.checkNotNullParameter(state, "state");
    }

    @Override // pki.a
    public final void e0(g token) {
        pki.a aVarK;
        Intrinsics.checkNotNullParameter(token, "token");
        Iterator it8 = this.f16703a.getAll().iterator();
        while (it8.hasNext()) {
            yji.o oVar = ((com.revolut.kompot.navigable.b) it8.next()).k;
            f fVar = oVar instanceof f ? (f) oVar : null;
            if (fVar != null && (aVarK = fVar.k()) != null) {
                aVarK.e0(token);
            }
        }
    }

    @Override // yji.r
    public final void g(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // pki.a
    public final void g1(boolean z) {
        Iterator it8 = this.f16703a.getAll().iterator();
        while (it8.hasNext()) {
            com.revolut.kompot.navigable.a aVar = ((com.revolut.kompot.navigable.b) it8.next()).k;
            if (aVar != null) {
                aVar.g1(z);
            }
        }
    }

    @Override // pki.a
    public final void i1(boolean z) {
        Iterator it8 = this.f16703a.getAll().iterator();
        while (it8.hasNext()) {
            com.revolut.kompot.navigable.a aVar = ((com.revolut.kompot.navigable.b) it8.next()).k;
            if (aVar != null) {
                aVar.i1(z);
            }
        }
    }

    @Override // pki.a
    public final void n() {
        Iterator it8 = this.f16703a.getAll().iterator();
        while (it8.hasNext()) {
            com.revolut.kompot.navigable.a aVar = ((com.revolut.kompot.navigable.b) it8.next()).k;
            if (aVar != null) {
                aVar.n();
            }
        }
    }

    @Override // pki.a
    public final void o(int i, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        Iterator it8 = this.f16703a.getAll().iterator();
        while (it8.hasNext()) {
            ((com.revolut.kompot.navigable.b) it8.next()).h(i, permissions, grantResults);
        }
    }

    @Override // pki.a
    public final void onActivityResult(int i, int i2, Intent intent) {
        f fVar = this.f16704b;
        Intrinsics.i(fVar, "null cannot be cast to non-null type com.revolut.kompot.navigable.vc.ViewController<*>");
        ((ViewController) fVar).i2(new a(i, this, intent, i2, 0));
    }

    @Override // pki.a
    public final void onDestroy() throws e {
        Iterator it8 = this.f16703a.getAll().iterator();
        while (it8.hasNext()) {
            ((com.revolut.kompot.navigable.b) it8.next()).d();
        }
    }

    @Override // pki.a
    public final void u(boolean z) {
        Iterator it8 = this.f16703a.getAll().iterator();
        while (it8.hasNext()) {
            com.revolut.kompot.navigable.a aVar = ((com.revolut.kompot.navigable.b) it8.next()).k;
            if (aVar != null) {
                aVar.u(z);
            }
        }
    }

    @Override // pki.a
    public final boolean u1(d defaultHandler) {
        ListIterator listIterator;
        Intrinsics.checkNotNullParameter(defaultHandler, "defaultHandler");
        Iterator it8 = b0.L(this.f16703a.getAll()).iterator();
        do {
            listIterator = ((w0) it8).f322483a;
            if (!listIterator.hasPrevious()) {
                return ((Boolean) defaultHandler.invoke()).booleanValue();
            }
        } while (!((com.revolut.kompot.navigable.b) listIterator.previous()).b());
        return true;
    }

    @Override // pki.a
    public final void z() {
        Iterator it8 = b0.L(this.f16703a.getAll()).iterator();
        while (true) {
            ListIterator listIterator = ((w0) it8).f322483a;
            if (!listIterator.hasPrevious()) {
                return;
            } else {
                ((com.revolut.kompot.navigable.b) listIterator.previous()).e();
            }
        }
    }
}
