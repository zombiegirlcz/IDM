package e59;

import com.revolut.feature.market_alert_settings.impl.data.network.MarketAlertSettingsService;
import kotlin.jvm.internal.Intrinsics;
import vc.s;
import xe0.f;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f122788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f122789b;

    public a(b bVar, int i) {
        this.f122788a = bVar;
        this.f122789b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f122788a;
        nj0.a aVar = bVar.f122790a;
        ee0.a aVar2 = bVar.f122791b;
        int i = this.f122789b;
        if (i == 0) {
            ik0.b retrofitFactory = ((nj0.d) aVar).m();
            s.j(retrofitFactory);
            ek.a converterFactory = ((nj0.d) aVar).d();
            e.Companion.getClass();
            Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
            Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
            Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(MarketAlertSettingsService.class);
            Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
            MarketAlertSettingsService marketAlertSettingsService = (MarketAlertSettingsService) objCreate;
            s.k(marketAlertSettingsService);
            return marketAlertSettingsService;
        }
        if (i != 1) {
            if (i == 2) {
                return new ne0.d();
            }
            throw new AssertionError(i);
        }
        je0.d mapper = aVar2.d();
        s.j(mapper);
        yk0.a databaseSessionProvider = bVar.f122792c.b();
        s.j(databaseSessionProvider);
        f storageFactory = aVar2.f();
        s.j(storageFactory);
        e.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return f.f(storageFactory, databaseSessionProvider, "crypto_volatility_alert", mapper, 0, null, 56);
    }
}
