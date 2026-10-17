package kwi;

import android.view.Window;
import android.view.WindowManager;
import com.revolut.retail.feature.airportlounges.api.AirportLoungesApi$Toggles;
import kotlin.jvm.internal.Intrinsics;
import yji.d;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.kompot.navigable.a f190366c;
    public final gte.a d;

    public a(com.revolut.kompot.navigable.a controller, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f190366c = controller;
        this.d = featureToggleInteractor;
    }

    @Override // yji.d
    public final void M() {
        if (((jte.d) this.d).c(AirportLoungesApi$Toggles.AirportLoungesQrCodeBrightness.f98911c)) {
            Window window = this.f190366c.m2().getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.screenBrightness = 1.0f;
            window.setAttributes(attributes);
        }
    }

    @Override // yji.d
    public final void N() {
        Window window = this.f190366c.m2().getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.screenBrightness = -1.0f;
        window.setAttributes(attributes);
    }
}
