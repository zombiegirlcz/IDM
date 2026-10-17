package z8j;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.crypto.asset_details.api.CryptoAssetDetailsApi$Toggles;
import e5d.e;
import fn2.c;
import go.g;
import jte.d;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import od0.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements e {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f320150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f320151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f320152c;
    public final df0.b d;

    public b(xi0.b currency, c cryptoDetailsAboutInteractor, gte.a featureToggleInteractor, df0.b timeProvider) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(cryptoDetailsAboutInteractor, "cryptoDetailsAboutInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        this.f320150a = currency;
        this.f320151b = cryptoDetailsAboutInteractor;
        this.f320152c = featureToggleInteractor;
        this.d = timeProvider;
    }

    @Override // e5d.e
    public final Flow c() {
        if (((d) this.f320152c).c(CryptoAssetDetailsApi$Toggles.CryptoAirTip.f99932c)) {
            return nim.a.v(rd0.e.b(this.f320151b.q(this.f320150a)), new z2.a(this, 25));
        }
        i.Companion.getClass();
        return new g(new Data(i.f224256b, null, false, 6, null), 2);
    }
}
