package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.expired.popup.ExpiredPopupControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class c3 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExpiredPopupControllerContract$InputData f118496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f118497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cbb.b f118498c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118499g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f118500h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f118501j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f118502l;

    public c3(c1 c1Var, ViewController viewController, ExpiredPopupControllerContract$InputData expiredPopupControllerContract$InputData) {
        this.f118496a = expiredPopupControllerContract$InputData;
        this.f118497b = e4m.b.b(e4m.c.a(viewController));
        cbb.b bVar = new cbb.b(this, 1, 27);
        this.f118498c = bVar;
        this.d = e4m.b.b(bVar);
        this.e = e4m.b.b(e4m.c.a(expiredPopupControllerContract$InputData));
        this.f = e4m.b.b(new cbb.b(this, 0, 27));
        this.f118499g = e4m.b.b(new cbb.b(this, 4, 27));
        this.f118500h = e4m.b.b(new cbb.b(this, 3, 27));
        this.i = e4m.b.b(new cbb.b(this, 2, 27));
        this.f118501j = e4m.b.b(this.f118498c);
        this.k = e4m.b.b(new cbb.b(this, 6, 27));
        this.f118502l = e4m.b.b(new cbb.b(this, 5, 27));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f118501j.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get(), (yji.d) this.i.get());
    }
}
