package ned;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.SharedCreateAlertScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;
import ms1.s;
import z0h.s1;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1 f214475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedCreateAlertScreenContract$InputData f214476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f214477c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f214478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f214479h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f214480j;

    public l(e eVar, c cVar, BaseScreen baseScreen, SharedCreateAlertScreenContract$InputData sharedCreateAlertScreenContract$InputData, s1 s1Var) {
        this.f214477c = eVar;
        this.f214475a = s1Var;
        this.f214476b = sharedCreateAlertScreenContract$InputData;
        int i = 20;
        this.d = e4m.b.b(new s(eVar, this, 0, i));
        this.e = e4m.b.b(new s(eVar, this, 3, i));
        this.f = e4m.b.b(new s(eVar, this, 2, i));
        this.f214478g = e4m.b.b(e4m.c.a(baseScreen));
        int i2 = 20;
        this.f214479h = e4m.b.b(new s(eVar, this, 4, i2));
        this.i = e4m.b.b(new s(eVar, this, 5, i2));
        this.f214480j = e4m.b.b(new s(eVar, this, 1, i2));
    }

    @Override // sji.b
    public final Set f() {
        aah.h hVar = (aah.h) this.d.get();
        a0k.b.m(hVar);
        return ImmutableSet.of(hVar);
    }

    @Override // sji.b
    public final Set g() {
        aah.i iVarD = ((u8h.b) this.f214477c.f).d();
        vc.s.j(iVarD);
        return ImmutableSet.of(a0k.b.k(iVarD, this.f214475a, (aah.h) this.d.get()));
    }
}
