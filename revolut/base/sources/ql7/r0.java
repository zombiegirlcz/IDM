package ql7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_car.impl.ui.screen.mta.date.MtaDateSelectorScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class r0 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MtaDateSelectorScreenContract$InputData f247448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f247449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f247450c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f247451g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f247452h;
    public final e4m.e i;

    public r0(k0 k0Var, t0 t0Var, BaseScreen baseScreen, MtaDateSelectorScreenContract$InputData mtaDateSelectorScreenContract$InputData) {
        this.f247448a = mtaDateSelectorScreenContract$InputData;
        this.f247449b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 15;
        this.f247450c = e4m.b.b(new l(k0Var, this, 3, i));
        this.d = e4m.b.b(new l(k0Var, this, 2, i));
        this.e = e4m.b.b(new l(k0Var, this, 1, i));
        this.f = e4m.b.b(new l(k0Var, this, 0, i));
        this.f247451g = e4m.b.b(new l(k0Var, this, 4, i));
        this.f247452h = e4m.b.b(new l(k0Var, this, 6, i));
        this.i = e4m.b.b(new l(k0Var, this, 5, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get(), (yji.d) this.f247451g.get());
    }
}
