package qna;

import cli.y;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import vkm.q0;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class s extends oki.h implements dli.b {
    public final ji5.m o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Set f247926p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final am2.a f247927q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final oqk.b f247928r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ekg.g f247929s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final uke.a f247930t;
    public final x8h.k u;
    public final xv5.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final hwl.c f247931w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y f247932x;

    public s(ji5.m cryptoPreferencesInteractor, Set customisableTabProviders, am2.a profileTypeInteractor, oqk.b retailAccountCustomizationInteractor, ekg.g uiPersonalisationInteractor, uke.a investTabStateInteractor, x8h.k investDisplayCurrenciesInteractor, xv5.c cryptoDisplayCurrenciesInteractor, hwl.c uiTogglesProvider, t mapper) {
        Intrinsics.checkNotNullParameter(cryptoPreferencesInteractor, "cryptoPreferencesInteractor");
        Intrinsics.checkNotNullParameter(customisableTabProviders, "customisableTabProviders");
        Intrinsics.checkNotNullParameter(profileTypeInteractor, "profileTypeInteractor");
        Intrinsics.checkNotNullParameter(retailAccountCustomizationInteractor, "retailAccountCustomizationInteractor");
        Intrinsics.checkNotNullParameter(uiPersonalisationInteractor, "uiPersonalisationInteractor");
        Intrinsics.checkNotNullParameter(investTabStateInteractor, "investTabStateInteractor");
        Intrinsics.checkNotNullParameter(investDisplayCurrenciesInteractor, "investDisplayCurrenciesInteractor");
        Intrinsics.checkNotNullParameter(cryptoDisplayCurrenciesInteractor, "cryptoDisplayCurrenciesInteractor");
        Intrinsics.checkNotNullParameter(uiTogglesProvider, "uiTogglesProvider");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.o = cryptoPreferencesInteractor;
        this.f247926p = customisableTabProviders;
        this.f247927q = profileTypeInteractor;
        this.f247928r = retailAccountCustomizationInteractor;
        this.f247929s = uiPersonalisationInteractor;
        this.f247930t = investTabStateInteractor;
        this.u = investDisplayCurrenciesInteractor;
        this.v = cryptoDisplayCurrenciesInteractor;
        this.f247931w = uiTogglesProvider;
        this.f247932x = mra.d.b(this, new f(0), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, vkm.q.Q(mo3.a.g(rd0.e.b(ue0.e.p(this.f247927q.a(), h0.f322473a)), null, null, 3), new i(2, null, this)), null, null, null, 7);
    }

    public final q0 I2() {
        return new q0(rd0.e.b(((akg.o) this.f247929s.f127161b).f5954h.f(Unit.f186387a, false)), new k(2, null, this), 1);
    }

    public final q0 J2() {
        this.f247931w.getClass();
        return new q0(rd0.e.b(((akg.o) this.f247929s.f127161b).i.f(Unit.f186387a, false)), new k(3, null, this), 1);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f247932x;
    }
}
