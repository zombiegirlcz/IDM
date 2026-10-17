package dki;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import zhm.w0;

/* JADX INFO: loaded from: classes13.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.kompot.navigable.a f115552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yji.l f115553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function0 f115554c;
    public final kotlin.jvm.internal.q d;

    /* JADX WARN: Multi-variable type inference failed */
    public r(com.revolut.kompot.navigable.a controller, yji.l controllerModel, Function0 childControllerManagers, Function3 onActivityResultInternal) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(controllerModel, "controllerModel");
        Intrinsics.checkNotNullParameter(childControllerManagers, "childControllerManagers");
        Intrinsics.checkNotNullParameter(onActivityResultInternal, "onActivityResultInternal");
        this.f115552a = controller;
        this.f115553b = controllerModel;
        this.f115554c = childControllerManagers;
        this.d = (kotlin.jvm.internal.q) onActivityResultInternal;
    }

    public final void a() {
        this.f115553b.S1(aii.s.HIDDEN);
        Iterator it8 = zhm.b0.L((List) this.f115554c.invoke()).iterator();
        while (true) {
            ListIterator listIterator = ((w0) it8).f322483a;
            if (!listIterator.hasPrevious()) {
                return;
            } else {
                ((com.revolut.kompot.navigable.b) listIterator.previous()).e();
            }
        }
    }

    public final void b(int i, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        Iterator it8 = ((Iterable) this.f115554c.invoke()).iterator();
        while (it8.hasNext()) {
            ((com.revolut.kompot.navigable.b) it8.next()).h(i, permissions, grantResults);
        }
    }

    public final void c() {
        Iterator it8 = ((Iterable) this.f115554c.invoke()).iterator();
        while (it8.hasNext()) {
            com.revolut.kompot.navigable.a aVar = ((com.revolut.kompot.navigable.b) it8.next()).k;
            if (aVar != null) {
                aVar.n();
            }
        }
    }

    public final void d(boolean z) {
        Iterator it8 = ((Iterable) this.f115554c.invoke()).iterator();
        while (it8.hasNext()) {
            com.revolut.kompot.navigable.a aVar = ((com.revolut.kompot.navigable.b) it8.next()).k;
            if (aVar != null) {
                aVar.J0(z);
            }
        }
    }

    public final void e(boolean z) {
        Iterator it8 = ((Iterable) this.f115554c.invoke()).iterator();
        while (it8.hasNext()) {
            com.revolut.kompot.navigable.a aVar = ((com.revolut.kompot.navigable.b) it8.next()).k;
            if (aVar != null) {
                aVar.g1(z);
            }
        }
    }

    public final void f(boolean z) {
        Iterator it8 = ((Iterable) this.f115554c.invoke()).iterator();
        while (it8.hasNext()) {
            com.revolut.kompot.navigable.a aVar = ((com.revolut.kompot.navigable.b) it8.next()).k;
            if (aVar != null) {
                aVar.i1(z);
            }
        }
    }

    public final void g(boolean z) {
        Iterator it8 = ((Iterable) this.f115554c.invoke()).iterator();
        while (it8.hasNext()) {
            com.revolut.kompot.navigable.a aVar = ((com.revolut.kompot.navigable.b) it8.next()).k;
            if (aVar != null) {
                aVar.u(z);
            }
        }
    }
}
