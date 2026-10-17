package lf9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.FormScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FormScreenContract$InputData f194728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f194729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f194730c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f194731g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f194732h;

    public l(m mVar, h hVar, FormScreenContract$InputData formScreenContract$InputData) {
        this.f194729b = mVar;
        this.f194730c = hVar;
        this.f194728a = formScreenContract$InputData;
        this.d = e4m.b.b(new ld1.q(mVar, hVar, this, 1, 2));
        int i = 2;
        this.e = e4m.b.b(new ld1.q(mVar, hVar, this, 0, i));
        this.f = e4m.b.b(new ld1.q(mVar, hVar, this, 3, i));
        this.f194731g = e4m.b.b(new ld1.q(mVar, hVar, this, 2, i));
        this.f194732h = e4m.b.b(new ld1.q(mVar, hVar, this, 4, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.e.get(), (yji.n) this.f194731g.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
