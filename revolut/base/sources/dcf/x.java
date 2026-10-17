package dcf;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class x implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f112967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f112968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f112969c;
    public final Data d;
    public final Data e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f112970g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f112971h;

    public x() {
        this(false, 255);
    }

    public static x a(x xVar, Data data, Data data2, Data data3, Data data4, Data data5, String str, Data data6, int i) {
        if ((i & 1) != 0) {
            data = xVar.f112967a;
        }
        Data addOn = data;
        if ((i & 2) != 0) {
            data2 = xVar.f112968b;
        }
        Data portfolioStatus = data2;
        if ((i & 4) != 0) {
            data3 = xVar.f112969c;
        }
        Data tradingContext = data3;
        if ((i & 8) != 0) {
            data4 = xVar.d;
        }
        Data disclaimersData = data4;
        if ((i & 16) != 0) {
            data5 = xVar.e;
        }
        Data cardholderTerms = data5;
        if ((i & 32) != 0) {
            str = xVar.f;
        }
        String str2 = str;
        Data eligibility = (i & 64) != 0 ? xVar.f112970g : data6;
        boolean z = xVar.f112971h;
        xVar.getClass();
        Intrinsics.checkNotNullParameter(addOn, "addOn");
        Intrinsics.checkNotNullParameter(portfolioStatus, "portfolioStatus");
        Intrinsics.checkNotNullParameter(tradingContext, "tradingContext");
        Intrinsics.checkNotNullParameter(disclaimersData, "disclaimersData");
        Intrinsics.checkNotNullParameter(cardholderTerms, "cardholderTerms");
        Intrinsics.checkNotNullParameter(eligibility, "eligibility");
        return new x(addOn, portfolioStatus, tradingContext, disclaimersData, cardholderTerms, str2, eligibility, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f112967a, xVar.f112967a) && Intrinsics.f(this.f112968b, xVar.f112968b) && Intrinsics.f(this.f112969c, xVar.f112969c) && Intrinsics.f(this.d, xVar.d) && Intrinsics.f(this.e, xVar.e) && Intrinsics.f(this.f, xVar.f) && Intrinsics.f(this.f112970g, xVar.f112970g) && this.f112971h == xVar.f112971h;
    }

    public final int hashCode() {
        int iC = kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f112969c, kii.e.c(this.f112968b, this.f112967a.hashCode() * 31, 31), 31), 31), 31);
        String str = this.f;
        return Boolean.hashCode(this.f112971h) + kii.e.c(this.f112970g, (iC + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public x(Data addOn, Data portfolioStatus, Data tradingContext, Data disclaimersData, Data cardholderTerms, String str, Data eligibility, boolean z) {
        Intrinsics.checkNotNullParameter(addOn, "addOn");
        Intrinsics.checkNotNullParameter(portfolioStatus, "portfolioStatus");
        Intrinsics.checkNotNullParameter(tradingContext, "tradingContext");
        Intrinsics.checkNotNullParameter(disclaimersData, "disclaimersData");
        Intrinsics.checkNotNullParameter(cardholderTerms, "cardholderTerms");
        Intrinsics.checkNotNullParameter(eligibility, "eligibility");
        this.f112967a = addOn;
        this.f112968b = portfolioStatus;
        this.f112969c = tradingContext;
        this.d = disclaimersData;
        this.e = cardholderTerms;
        this.f = str;
        this.f112970g = eligibility;
        this.f112971h = z;
    }

    public /* synthetic */ x(boolean z, int i) {
        this(new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), null, new Data(null, null, false, 7, null), (i & 128) != 0 ? false : z);
    }
}
