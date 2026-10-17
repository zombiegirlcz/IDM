package esa;

import com.revolut.data.model.Data;
import com.revolut.feature.push_to_card.api.data.CardOwner;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardOwner f128915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f128916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f128917c;
    public final b6k.e d;

    public d(CardOwner cardOwner, Data paymentSettings, Data transactionsContent, b6k.e recipientAnalytics) {
        Intrinsics.checkNotNullParameter(cardOwner, "cardOwner");
        Intrinsics.checkNotNullParameter(paymentSettings, "paymentSettings");
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        Intrinsics.checkNotNullParameter(recipientAnalytics, "recipientAnalytics");
        this.f128915a = cardOwner;
        this.f128916b = paymentSettings;
        this.f128917c = transactionsContent;
        this.d = recipientAnalytics;
    }

    public static d a(d dVar, CardOwner cardOwner, Data paymentSettings, Data transactionsContent, b6k.e recipientAnalytics, int i) {
        if ((i & 1) != 0) {
            cardOwner = dVar.f128915a;
        }
        if ((i & 2) != 0) {
            paymentSettings = dVar.f128916b;
        }
        if ((i & 4) != 0) {
            transactionsContent = dVar.f128917c;
        }
        if ((i & 8) != 0) {
            recipientAnalytics = dVar.d;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(cardOwner, "cardOwner");
        Intrinsics.checkNotNullParameter(paymentSettings, "paymentSettings");
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        Intrinsics.checkNotNullParameter(recipientAnalytics, "recipientAnalytics");
        return new d(cardOwner, paymentSettings, transactionsContent, recipientAnalytics);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f128915a, dVar.f128915a) && Intrinsics.f(this.f128916b, dVar.f128916b) && Intrinsics.f(this.f128917c, dVar.f128917c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kii.e.c(this.f128917c, kii.e.c(this.f128916b, this.f128915a.hashCode() * 31, 31), 31);
    }
}
