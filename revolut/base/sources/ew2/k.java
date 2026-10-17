package ew2;

import android.content.SharedPreferences;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.card_add_to_googlepay.api.NavigationIconConfig;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTimeUtils;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends nri.a implements e0m.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f130022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l93.b f130023c;
    public final eli.j d;
    public final ang.f e;
    public final fk3.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ecm.q f130024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final al4.b f130025h;
    public final v60.g i;

    public k(f state, l93.b cardsInteractor, eli.j twoFaErrorHandler, ang.f userInteractor, fk3.a configurationInteractor, ecm.q retailPreferencesInteractor, al4.b comboCardInteractor, ifm.b compositeDisposable) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(cardsInteractor, "cardsInteractor");
        Intrinsics.checkNotNullParameter(twoFaErrorHandler, "twoFaErrorHandler");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(retailPreferencesInteractor, "retailPreferencesInteractor");
        Intrinsics.checkNotNullParameter(comboCardInteractor, "comboCardInteractor");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        this.f130022b = state;
        this.f130023c = cardsInteractor;
        this.d = twoFaErrorHandler;
        this.e = userInteractor;
        this.f = configurationInteractor;
        this.f130024g = retailPreferencesInteractor;
        this.f130025h = comboCardInteractor;
        this.i = new v60.g(compositeDisposable, new eu7.c(this, 8));
    }

    @Override // nri.a
    public final void i3() {
        long jCurrentTimeMillis = DateTimeUtils.currentTimeMillis();
        ecm.q qVar = this.f130024g;
        qVar.getClass();
        Intrinsics.checkNotNullParameter("operation_prompts_google_pay_last_time_shown", "key");
        ((SharedPreferences) qVar.f124861b).edit().putLong("operation_prompts_google_pay_last_time_shown", jCurrentTimeMillis).commit();
    }

    public final h93.f0 j3() {
        return (h93.f0) ((v) this.f130022b).w0().get();
    }

    public final ResourceImage k3() {
        NavigationIconConfig navigationIconConfig = (NavigationIconConfig) ((od0.i) ((v) this.f130022b).x0().get()).f224257a;
        if (navigationIconConfig != null) {
            return navigationIconConfig.f64436a;
        }
        return null;
    }
}
