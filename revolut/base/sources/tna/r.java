package tna;

import android.os.Build;
import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class r extends jki.g implements l {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ekg.g f272354p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final rla.c f272355q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final u7l.c f272356r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j60.a f272357s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l80.e f272358t;
    public final k u;
    public final a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(jki.p stateMapper, ekg.g uiPersonalisationInteractor, rla.c appearanceSettingsInteractor, u7l.c eventAppearanceInteractor, j60.a bottomDialogExtension, l80.e dateProvider, k70.a themeCompatibilityProvider) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(uiPersonalisationInteractor, "uiPersonalisationInteractor");
        Intrinsics.checkNotNullParameter(appearanceSettingsInteractor, "appearanceSettingsInteractor");
        Intrinsics.checkNotNullParameter(eventAppearanceInteractor, "eventAppearanceInteractor");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(themeCompatibilityProvider, "themeCompatibilityProvider");
        this.f272354p = uiPersonalisationInteractor;
        this.f272355q = appearanceSettingsInteractor;
        this.f272356r = eventAppearanceInteractor;
        this.f272357s = bottomDialogExtension;
        this.f272358t = dateProvider;
        this.u = new k(new Data(null, null, true, 3, null), Build.VERSION.SDK_INT >= 29, null, null);
        this.v = new a();
    }

    @Override // yji.l
    public final void I1() {
        akg.n nVarC = this.f272354p.c();
        hma.g gVar = (hma.g) this.f272355q;
        akg.n nVarV = nim.a.v(u0.i(nVarC, rd0.e.b(pd.b.r((efm.r) gVar.f153602h.getValue(), new hg4.a(gVar, 17))), rd0.e.b((efm.r) gVar.f153602h.getValue())), new tlf.n(5));
        Continuation continuation = null;
        yji.l.a1(this, nVarV, null, null, new p(this, continuation, 0), 3);
        l2(new q(this, continuation, 0), new yi5.b(26));
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.u;
    }

    @Override // jki.g
    public final kki.a s2() {
        return this.v;
    }
}
