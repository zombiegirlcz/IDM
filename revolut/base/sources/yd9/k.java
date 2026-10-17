package yd9;

import com.revolut.feature.orders.ui.api.OrdersWidgetContract$Config;
import efm.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import qua.y;
import te0.w;
import ybh.a0;
import yua.q;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0i.b f312663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xua.a f312664b;

    public k(p0i.b fxOrderInteractor, xua.a recurringPaymentInteractor) {
        Intrinsics.checkNotNullParameter(fxOrderInteractor, "fxOrderInteractor");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        this.f312663a = fxOrderInteractor;
        this.f312664b = recurringPaymentInteractor;
    }

    public static boolean c(xi0.b bVar, OrdersWidgetContract$Config ordersWidgetContract$Config) {
        int i = h.f312662a[ordersWidgetContract$Config.f78608a.ordinal()];
        if (i == 1) {
            return cp5.d.y(bVar);
        }
        if (i == 2) {
            return true;
        }
        if (i != 3) {
            return false;
        }
        return cp5.d.z(bVar);
    }

    public final r a(OrdersWidgetContract$Config ordersWidgetContract$Config) {
        return nim.a.w(((x0i.g) this.f312663a).f301642a.e.f(Unit.f186387a, true), new y8a.h(this, ordersWidgetContract$Config, 25));
    }

    public final r b(OrdersWidgetContract$Config config) {
        r rVarH;
        Intrinsics.checkNotNullParameter(config, "config");
        wd9.d dVar = config.f78608a;
        int[] iArr = h.f312662a;
        int i = iArr[dVar.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            r rVarA = a(config);
            xi0.b bVar = null;
            if (iArr[dVar.ordinal()] == 3) {
                q qVar = (q) this.f312664b;
                rVarH = nim.a.w(qVar.s(false, y.f249342a, false), new vgc.b(qVar, bVar, 17));
            } else {
                rVarH = w.h(zi0.c.P(f0.f322471a, false, null, 3));
            }
            return nim.a.w(u1.d(rVarA, nim.a.w(rVarH, new a0(25))), new a0(24));
        }
        return a(config);
    }
}
