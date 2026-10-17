package lf9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.SubformScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class u implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SubformScreenContract$InputData f194800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f194801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f194802c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f194803g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f194804h;
    public final e4m.e i;

    public u(m mVar, h hVar, SubformScreenContract$InputData subformScreenContract$InputData) {
        this.f194801b = mVar;
        this.f194802c = hVar;
        this.f194800a = subformScreenContract$InputData;
        this.d = e4m.b.b(new ld1.q(mVar, hVar, this, 1, 6));
        int i = 6;
        this.e = e4m.b.b(new ld1.q(mVar, hVar, this, 0, i));
        this.f = e4m.b.b(new ld1.q(mVar, hVar, this, 3, i));
        this.f194803g = e4m.b.b(new ld1.q(mVar, hVar, this, 2, i));
        this.f194804h = e4m.b.b(new ld1.q(mVar, hVar, this, 5, i));
        this.i = e4m.b.b(new ld1.q(mVar, hVar, this, 4, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.e.get(), (yji.n) this.f194803g.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
