package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.intro.ManualUnderwritingIntroScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class c4 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ManualUnderwritingIntroScreenContract$InputData f118503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f118504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g3 f118505c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118506g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f118507h;

    public c4(c1 c1Var, b4 b4Var, BaseScreen baseScreen, ManualUnderwritingIntroScreenContract$InputData manualUnderwritingIntroScreenContract$InputData) {
        this.f118503a = manualUnderwritingIntroScreenContract$InputData;
        this.f118504b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 12;
        g3 g3Var = new g3(b4Var, this, 1, i);
        this.f118505c = g3Var;
        this.d = e4m.b.b(g3Var);
        this.e = e4m.b.b(new g3(b4Var, this, 0, i));
        this.f = e4m.b.b(this.f118505c);
        this.f118506g = e4m.b.b(new g3(b4Var, this, 3, i));
        this.f118507h = e4m.b.b(new g3(b4Var, this, 2, i));
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
