package nji;

import ix0.v1;
import ix0.w1;
import ix0.x1;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements x1, xji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.kompot.navigable.a f216535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f216536b;

    public j(com.revolut.kompot.navigable.a controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.f216535a = controller;
        this.f216536b = new ArrayList();
    }

    @Override // xji.a
    public final void U0(com.revolut.kompot.navigable.a controller, boolean z) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(controller, "controller");
        b(controller);
    }

    public final v1 a() {
        int i = i.f216534a[this.f216535a.f98411t.ordinal()];
        if (i == 1) {
            return v1.ENTER;
        }
        if (i == 2) {
            return v1.EXIT;
        }
        if (i == 3) {
            return v1.NONE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void b(com.revolut.kompot.navigable.a aVar) {
        if (!Intrinsics.f(this.f216535a, aVar)) {
            return;
        }
        ArrayList arrayList = this.f216536b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            } else {
                ((w1) arrayList.get(size)).a(a());
            }
        }
    }

    @Override // xji.a
    public final void d2(com.revolut.kompot.navigable.a controller, boolean z) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(controller, "controller");
        b(controller);
    }

    @Override // xji.a
    public final void m0(com.revolut.kompot.navigable.a controller, boolean z) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(controller, "controller");
        b(controller);
    }
}
