package qtb;

import cli.y;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends oki.h implements i {
    public final ftb.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ekg.g f249066p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final kdh.b f249067q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f249068r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f249069s;

    public g(ekg.g uiPersonalisationInteractor, kdh.b tabBarCustomisationStateHelper, List customisableTabProviders, k mapper) {
        ftb.e playTabPreferencesInteractorWrapper = ftb.e.f138011a;
        Intrinsics.checkNotNullParameter(playTabPreferencesInteractorWrapper, "playTabPreferencesInteractorWrapper");
        Intrinsics.checkNotNullParameter(uiPersonalisationInteractor, "uiPersonalisationInteractor");
        Intrinsics.checkNotNullParameter(tabBarCustomisationStateHelper, "tabBarCustomisationStateHelper");
        Intrinsics.checkNotNullParameter(customisableTabProviders, "customisableTabProviders");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.o = playTabPreferencesInteractorWrapper;
        this.f249066p = uiPersonalisationInteractor;
        this.f249067q = tabBarCustomisationStateHelper;
        this.f249068r = customisableTabProviders;
        this.f249069s = mra.d.b(this, new h(0), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, this.f249067q.W(), null, null, new qp7.g(this, null, 7), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f249069s;
    }
}
