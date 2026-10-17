package com.revolut.shared.feature.wealth.domain.api.interactors;

import kotlin.Metadata;
import n9l.b;
import p.a;

/* JADX INFO: loaded from: classes12.dex */
public final class InstrumentTickerInteractor$Companion {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ InstrumentTickerInteractor$Companion f105073a = new InstrumentTickerInteractor$Companion();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f105074b = b.SEC_3;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/shared/feature/wealth/domain/api/interactors/InstrumentTickerInteractor$Companion$NoTradeInstrumentException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "feature_shared_wealth_domain_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NoTradeInstrumentException extends Exception {
        public NoTradeInstrumentException(String str) {
            super(a.p("Instrument ", str, " not found"));
        }
    }

    private InstrumentTickerInteractor$Companion() {
    }
}
