package zb6;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f320805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f320806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f320807c;
    public final Data d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ba6.u f320808g;

    public h(Data charityData, Data currency, Data pocket, Data donationMoneyInputState, Data exchangeInfo, Data suggestions, ba6.u donationMode) {
        Intrinsics.checkNotNullParameter(charityData, "charityData");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(donationMoneyInputState, "donationMoneyInputState");
        Intrinsics.checkNotNullParameter(exchangeInfo, "exchangeInfo");
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        Intrinsics.checkNotNullParameter(donationMode, "donationMode");
        this.f320805a = charityData;
        this.f320806b = currency;
        this.f320807c = pocket;
        this.d = donationMoneyInputState;
        this.e = exchangeInfo;
        this.f = suggestions;
        this.f320808g = donationMode;
    }

    public static h a(h hVar, Data data, Data data2, Data data3, Data data4, Data data5, Data data6, int i) {
        if ((i & 1) != 0) {
            data = hVar.f320805a;
        }
        Data charityData = data;
        if ((i & 2) != 0) {
            data2 = hVar.f320806b;
        }
        Data currency = data2;
        if ((i & 4) != 0) {
            data3 = hVar.f320807c;
        }
        Data pocket = data3;
        if ((i & 8) != 0) {
            data4 = hVar.d;
        }
        Data donationMoneyInputState = data4;
        if ((i & 16) != 0) {
            data5 = hVar.e;
        }
        Data exchangeInfo = data5;
        if ((i & 32) != 0) {
            data6 = hVar.f;
        }
        Data suggestions = data6;
        ba6.u donationMode = hVar.f320808g;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(charityData, "charityData");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(donationMoneyInputState, "donationMoneyInputState");
        Intrinsics.checkNotNullParameter(exchangeInfo, "exchangeInfo");
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        Intrinsics.checkNotNullParameter(donationMode, "donationMode");
        return new h(charityData, currency, pocket, donationMoneyInputState, exchangeInfo, suggestions, donationMode);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f320805a, hVar.f320805a) && Intrinsics.f(this.f320806b, hVar.f320806b) && Intrinsics.f(this.f320807c, hVar.f320807c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f) && this.f320808g == hVar.f320808g;
    }

    public final int hashCode() {
        return this.f320808g.hashCode() + kii.e.c(this.f, kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f320807c, kii.e.c(this.f320806b, this.f320805a.hashCode() * 31, 31), 31), 31), 31), 31);
    }
}
