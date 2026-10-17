package po8;

import cli.k;
import cli.y;
import com.revolut.feature.junior_settings.impl.ui_kompot.payments_settings_explanatory.JuniorPaymentsSettingsExplanatoryControllerContract$Input;
import kl.t1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends oki.h implements dli.b {
    public final JuniorPaymentsSettingsExplanatoryControllerContract$Input o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t1 f237904p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final kd8.e f237905q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f237906r;

    public h(j stateMapper, JuniorPaymentsSettingsExplanatoryControllerContract$Input input, t1 juniorSettingsInteractor, kd8.e juniorConsentInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(juniorSettingsInteractor, "juniorSettingsInteractor");
        Intrinsics.checkNotNullParameter(juniorConsentInteractor, "juniorConsentInteractor");
        this.o = input;
        this.f237904p = juniorSettingsInteractor;
        this.f237905q = juniorConsentInteractor;
        this.f237906r = mra.d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f237906r;
    }
}
