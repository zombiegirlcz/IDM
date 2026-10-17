package iyi;

import cli.y;
import com.revolut.feature.hyper_text.model.HyperTextTarget;
import com.revolut.feature.hyper_text.ui.HyperTextClickData;
import com.revolut.retail.feature.airportlounges.api.model.AirportLoungesDisclaimer;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_list.modals.disclaimer_acceptance.AirportLoungesDisclaimerAcceptanceContract$InputData;
import dwi.a0;
import kotlin.jvm.internal.Intrinsics;
import wli.x;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends oki.h implements c {
    public final x o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a0 f169770p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f169771q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f169772r;

    public m(AirportLoungesDisclaimerAcceptanceContract$InputData inputData, cli.n stateMapper, x deeplinkHandler, a0 disclaimerInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(disclaimerInteractor, "disclaimerInteractor");
        this.o = deeplinkHandler;
        this.f169770p = disclaimerInteractor;
        AirportLoungesDisclaimer airportLoungesDisclaimer = inputData.f99133a;
        this.f169771q = airportLoungesDisclaimer.f98912a;
        this.f169772r = mra.d.b(this, new a(airportLoungesDisclaimer), stateMapper, null, false, 12);
    }

    public final void I2(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        Object obj2 = clickData.d;
        HyperTextClickData hyperTextClickData = obj2 instanceof HyperTextClickData ? (HyperTextClickData) obj2 : null;
        if (hyperTextClickData == null) {
            return;
        }
        HyperTextTarget hyperTextTarget = hyperTextClickData.f74762a;
        HyperTextTarget.Link link = hyperTextTarget instanceof HyperTextTarget.Link ? (HyperTextTarget.Link) hyperTextTarget : null;
        if (link == null) {
            return;
        }
        l2(new l(this, link, null), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f169772r;
    }
}
