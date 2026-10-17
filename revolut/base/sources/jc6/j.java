package jc6;

import com.revolut.data.model.Data;
import com.revolut.feature.donations.impl.ui.kompot.screen.recurring.DonationSchedule;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DonationSchedule f172713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f172714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f172715c;
    public final nqi.c d;
    public final dj0.d e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f172716g;

    public j(DonationSchedule donationSchedule, Data charity, Data currency, nqi.c moneyInputState, dj0.d currencyPocketBalance, Data orderQuote, String str) {
        Intrinsics.checkNotNullParameter(donationSchedule, "donationSchedule");
        Intrinsics.checkNotNullParameter(charity, "charity");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(moneyInputState, "moneyInputState");
        Intrinsics.checkNotNullParameter(currencyPocketBalance, "currencyPocketBalance");
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        this.f172713a = donationSchedule;
        this.f172714b = charity;
        this.f172715c = currency;
        this.d = moneyInputState;
        this.e = currencyPocketBalance;
        this.f = orderQuote;
        this.f172716g = str;
    }

    public static j a(j jVar, Data data, Data currency, nqi.c moneyInputState, dj0.d currencyPocketBalance, Data orderQuote, String str, int i) {
        Data charity = data;
        DonationSchedule donationSchedule = jVar.f172713a;
        if ((i & 2) != 0) {
            charity = jVar.f172714b;
        }
        if ((i & 4) != 0) {
            currency = jVar.f172715c;
        }
        if ((i & 8) != 0) {
            moneyInputState = jVar.d;
        }
        if ((i & 16) != 0) {
            currencyPocketBalance = jVar.e;
        }
        if ((i & 32) != 0) {
            orderQuote = jVar.f;
        }
        if ((i & 64) != 0) {
            str = jVar.f172716g;
        }
        String str2 = str;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(donationSchedule, "donationSchedule");
        Intrinsics.checkNotNullParameter(charity, "charity");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(moneyInputState, "moneyInputState");
        Intrinsics.checkNotNullParameter(currencyPocketBalance, "currencyPocketBalance");
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Data data2 = orderQuote;
        dj0.d dVar = currencyPocketBalance;
        nqi.c cVar = moneyInputState;
        return new j(donationSchedule, charity, currency, cVar, dVar, data2, str2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f172713a, jVar.f172713a) && Intrinsics.f(this.f172714b, jVar.f172714b) && Intrinsics.f(this.f172715c, jVar.f172715c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e) && Intrinsics.f(this.f, jVar.f) && Intrinsics.f(this.f172716g, jVar.f172716g);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f, v7.c((this.d.hashCode() + kii.e.c(this.f172715c, kii.e.c(this.f172714b, this.f172713a.hashCode() * 31, 31), 31)) * 31, 31, this.e), 31);
        String str = this.f172716g;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
