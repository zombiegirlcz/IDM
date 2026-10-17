package qgm;

import com.onfido.android.sdk.capture.utils.CountryCode;
import io.reactivex.rxjava3.core.Maybe;

/* JADX INFO: loaded from: classes14.dex */
public final class h extends Maybe implements bhm.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CountryCode f246377a;

    public h(CountryCode countryCode) {
        this.f246377a = countryCode;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public final void e(fgm.e eVar) {
        eVar.onSubscribe(jgm.c.INSTANCE);
        eVar.onSuccess(this.f246377a);
    }

    @Override // igm.q
    public final Object get() {
        return this.f246377a;
    }
}
