package x8b;

import kotlin.jvm.internal.Intrinsics;
import nw5.j;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fk3.a f303309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f303310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xv5.c f303311c;

    public d(fk3.a configurationInteractor, j cryptoStatsInteractor, xv5.c cryptoCommodityBaseCurrencyInteractor) {
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(cryptoStatsInteractor, "cryptoStatsInteractor");
        Intrinsics.checkNotNullParameter(cryptoCommodityBaseCurrencyInteractor, "cryptoCommodityBaseCurrencyInteractor");
        this.f303309a = configurationInteractor;
        this.f303310b = cryptoStatsInteractor;
        this.f303311c = cryptoCommodityBaseCurrencyInteractor;
    }
}
