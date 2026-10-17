package jtk;

import ael.d0;
import java.time.Duration;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class o {

    @NotNull
    private static final n Companion = new n();
    public static final Duration f = Duration.ofHours(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f178542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.b f178543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yhl.b f178544c;
    public final gte.a d;
    public final fxk.a e;

    public o(d0 stocksInteractor, ybl.b instrumentTickerInteractor, yhl.b corporateEventBannersInteractor, gte.a featureToggleInteractor, fxk.a tradingHoursInteractor) {
        Intrinsics.checkNotNullParameter(stocksInteractor, "stocksInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(corporateEventBannersInteractor, "corporateEventBannersInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(tradingHoursInteractor, "tradingHoursInteractor");
        this.f178542a = stocksInteractor;
        this.f178543b = instrumentTickerInteractor;
        this.f178544c = corporateEventBannersInteractor;
        this.d = featureToggleInteractor;
        this.e = tradingHoursInteractor;
    }
}
