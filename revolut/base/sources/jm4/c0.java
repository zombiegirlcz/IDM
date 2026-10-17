package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.autopay.settings.AutopaySettingsContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class c0 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AutopaySettingsContract$InputData f176011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f176012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f176013c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f176014g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f176015h;

    public c0(a3 a3Var, j0 j0Var, BaseScreen baseScreen, AutopaySettingsContract$InputData autopaySettingsContract$InputData) {
        this.f176012b = a3Var;
        this.f176011a = autopaySettingsContract$InputData;
        this.f176013c = e4m.b.b(e4m.c.a(baseScreen));
        int i = 5;
        this.d = e4m.b.b(new il8.d(a3Var, j0Var, this, 2, i));
        this.e = e4m.b.b(new il8.d(a3Var, j0Var, this, 1, i));
        this.f = e4m.b.b(new il8.d(a3Var, j0Var, this, 0, i));
        this.f176014g = e4m.b.b(new il8.d(a3Var, j0Var, this, 4, i));
        this.f176015h = e4m.b.b(new il8.d(a3Var, j0Var, this, 3, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
