package be0;

import a09.r;
import a31.l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rfm.m;
import rfm.y;
import sd0.f;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zq.a f14648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ae0.b f14649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yd0.b f14650c;
    public final r39.a d;
    public final zm0.c e;

    public e(zq.a configProvider, ae0.b mapper, yd0.b currenciesInfoHolder, r39.a jsonCurrenciesConfigProvider, zm0.c sessionProvider) {
        Intrinsics.checkNotNullParameter(configProvider, "configProvider");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(currenciesInfoHolder, "currenciesInfoHolder");
        Intrinsics.checkNotNullParameter(jsonCurrenciesConfigProvider, "jsonCurrenciesConfigProvider");
        Intrinsics.checkNotNullParameter(sessionProvider, "sessionProvider");
        this.f14648a = configProvider;
        this.f14649b = mapper;
        this.f14650c = currenciesInfoHolder;
        this.d = jsonCurrenciesConfigProvider;
        this.e = sessionProvider;
    }

    public final rfm.d a(f strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        rfm.d dVar = new rfm.d(new r(this, strategy, 6), 1);
        Intrinsics.checkNotNullExpressionValue(dVar, "defer(...)");
        return dVar;
    }

    public final m b() {
        rfm.d dVar = new rfm.d(new l(this.f14648a, 6), 1);
        Intrinsics.checkNotNullExpressionValue(dVar, "defer(...)");
        ae0.b bVar = this.f14649b;
        m mVar = new m(dVar, new bce.e(new ax9.d(1, bVar, ae0.b.class, "configToEntity", "configToEntity(Lcom/revolut/core/currency/api/CurrenciesConfig;)Lcom/revolut/core/currency/impl/entity/CurrenciesConfigEntity;", 0, 13), 15), 1);
        bce.e eVar = new bce.e(new ax9.d(1, this, e.class, "updateStorage", "updateStorage(Lcom/revolut/core/currency/impl/entity/CurrenciesConfigEntity;)V", 0, 14), 16);
        dfm.c cVar = mfm.f.d;
        m mVar2 = new m(new y(mVar, cVar, eVar, cVar, mfm.f.f205043c), new bce.e(new ax9.d(1, bVar, ae0.b.class, "currenciesInfoEntityToDomain", "currenciesInfoEntityToDomain(Lcom/revolut/core/currency/impl/entity/CurrenciesConfigEntity;)Ljava/util/Map;", 0, 15), 17), 1);
        Intrinsics.checkNotNullExpressionValue(mVar2, "map(...)");
        return ue0.e.B(mVar2, new b9i.f(this, 14));
    }
}
