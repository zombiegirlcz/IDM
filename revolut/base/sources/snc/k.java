package snc;

import com.revolut.feature.robo.impl.ui.screen.settings.SettingsScreenContract$Input;
import hmc.w;
import kotlin.jvm.internal.Intrinsics;
import yji.l;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f264511p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final SettingsScreenContract$Input f264512q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final dlc.g f264513r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final qmc.h f264514s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(e initialState, c mapper, SettingsScreenContract$Input input, dlc.g roboSettingsWidgetProvider, qmc.h roboPortfolioInfoProvider) {
        super(mapper);
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(roboSettingsWidgetProvider, "roboSettingsWidgetProvider");
        Intrinsics.checkNotNullParameter(roboPortfolioInfoProvider, "roboPortfolioInfoProvider");
        this.f264511p = initialState;
        this.f264512q = input;
        this.f264513r = roboSettingsWidgetProvider;
        this.f264514s = roboPortfolioInfoProvider;
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, ((w) this.f264513r).a(), null, null, new j(this, null, 0), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.a1(this, glc.a.a(this.f264514s, this.f264512q.f85202a), null, null, new j(this, null, 1), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f264511p;
    }
}
