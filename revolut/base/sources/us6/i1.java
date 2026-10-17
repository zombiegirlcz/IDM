package us6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.OrderInitPageCreateScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i1 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OrderInitPageCreateScreenContract$InputData f282575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f282576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f282577c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f282578g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f282579h;
    public final e4m.e i;

    public i1(q qVar, b0 b0Var, ViewController viewController, OrderInitPageCreateScreenContract$InputData orderInitPageCreateScreenContract$InputData) {
        this.f282576b = qVar;
        this.f282575a = orderInitPageCreateScreenContract$InputData;
        this.f282577c = e4m.b.b(new q0(qVar, this, 2, 6));
        this.d = e4m.b.b(new q0(qVar, this, 1, 6));
        this.e = e4m.b.b(new q0(qVar, this, 0, 6));
        this.f = e4m.b.b(new q0(qVar, this, 3, 6));
        this.f282578g = e4m.b.b(e4m.c.a(viewController));
        this.f282579h = e4m.b.b(new q0(qVar, this, 5, 6));
        this.i = e4m.b.b(new q0(qVar, this, 4, 6));
    }

    public final w80.b b() {
        qd0.b languageProvider = this.f282576b.f282691m.n();
        vc.s.j(languageProvider);
        e27.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        return v80.b.b(languageProvider, false, false, 58);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
