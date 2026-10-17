package hsl;

import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.ForecastDelegate;
import efm.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends jdf.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jsl.d f155088c;
    public final jdf.e d;

    public f(jsl.d screen, jdf.e controllerModelExtension) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f155088c = screen;
        this.d = controllerModelExtension;
    }

    @Override // yji.d
    public final void M() {
        ForecastDelegate forecastDelegate;
        FixedTabsDelegate fixedTabsDelegate;
        jsl.d dVar = this.f155088c;
        switch (dVar.f178204a) {
            case 0:
                forecastDelegate = dVar.f178205b;
                break;
            default:
                forecastDelegate = dVar.f178205b;
                break;
        }
        r rVarHide = forecastDelegate.f52369c.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        yji.d.H(this, new c(rd0.e.b(rVarHide), 0), new e(this, null, 0), 3);
        switch (dVar.f178204a) {
            case 0:
                fixedTabsDelegate = dVar.f178206c;
                break;
            default:
                fixedTabsDelegate = dVar.f178206c;
                break;
        }
        yji.d.H(this, new c(rd0.e.b(fixedTabsDelegate.f52339c.f121375b), 1), new e(this, null, 1), 3);
    }
}
