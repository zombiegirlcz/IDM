package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.popup.SpousalConsentInitiatorPopupScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class v6 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SpousalConsentInitiatorPopupScreenContract$InputData f120015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f120016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f120017c;
    public final e4m.e d;
    public final e4m.e e;
    public final g5 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f120018g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f120019h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f120020j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f120021l;

    public v6(c1 c1Var, BaseScreen baseScreen, SpousalConsentInitiatorPopupScreenContract$InputData spousalConsentInitiatorPopupScreenContract$InputData) {
        this.f120015a = spousalConsentInitiatorPopupScreenContract$InputData;
        this.f120016b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 20;
        this.f120017c = e4m.b.b(new g5(c1Var, this, 2, i));
        this.d = e4m.b.b(new g5(c1Var, this, 1, i));
        this.e = e4m.b.b(new g5(c1Var, this, 0, i));
        g5 g5Var = new g5(c1Var, this, 4, i);
        this.f = g5Var;
        this.f120018g = e4m.b.b(g5Var);
        this.f120019h = e4m.b.b(e4m.c.a(spousalConsentInitiatorPopupScreenContract$InputData));
        int i2 = 20;
        this.i = e4m.b.b(new g5(c1Var, this, 3, i2));
        this.f120020j = e4m.b.b(this.f);
        this.k = e4m.b.b(new g5(c1Var, this, 6, i2));
        this.f120021l = e4m.b.b(new g5(c1Var, this, 5, i2));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f120020j.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get(), (yji.d) this.i.get());
    }
}
