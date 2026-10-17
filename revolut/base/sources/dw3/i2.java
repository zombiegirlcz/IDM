package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.options.DocumentOptionsScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class i2 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DocumentOptionsScreenContract$InputData f118945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f118946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h1 f118947c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118948g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f118949h;

    public i2(c1 c1Var, b4 b4Var, BaseScreen baseScreen, DocumentOptionsScreenContract$InputData documentOptionsScreenContract$InputData) {
        this.f118945a = documentOptionsScreenContract$InputData;
        this.f118946b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 14;
        h1 h1Var = new h1(b4Var, this, 1, i);
        this.f118947c = h1Var;
        this.d = e4m.b.b(h1Var);
        this.e = e4m.b.b(new h1(b4Var, this, 0, i));
        this.f = e4m.b.b(this.f118947c);
        this.f118948g = e4m.b.b(new h1(b4Var, this, 3, i));
        this.f118949h = e4m.b.b(new h1(b4Var, this, 2, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
