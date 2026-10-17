package b3j;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.missing_fields.MissingFieldsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class w implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MissingFieldsScreenContract$InputData f12114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f12115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f12116c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f12117g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f12118h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f12119j;

    public w(t tVar, ViewController viewController, MissingFieldsScreenContract$InputData missingFieldsScreenContract$InputData) {
        this.f12115b = tVar;
        this.f12114a = missingFieldsScreenContract$InputData;
        this.f12116c = e4m.b.b(e4m.c.a(viewController));
        int i = 6;
        this.d = e4m.b.b(new aq1.e(tVar, this, 1, i));
        this.e = e4m.b.b(new aq1.e(tVar, this, 0, i));
        this.f = e4m.b.b(new aq1.e(tVar, this, 3, i));
        this.f12117g = e4m.b.b(new aq1.e(tVar, this, 2, i));
        this.f12118h = e4m.b.b(new aq1.e(tVar, this, 5, i));
        this.i = e4m.b.b(new aq1.e(tVar, this, 4, i));
        this.f12119j = e4m.b.b(new aq1.e(tVar, this, 6, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f12117g.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
