package com.revolut.feature.travel.flights.impl.ui.screen.checkout;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/checkout/TravelFlightsRevPayError;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelFlightsRevPayError extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f93308a;

    public TravelFlightsRevPayError(TextLocalisedClause revPayMessage) {
        Intrinsics.checkNotNullParameter(revPayMessage, "revPayMessage");
        this.f93308a = revPayMessage;
    }
}
