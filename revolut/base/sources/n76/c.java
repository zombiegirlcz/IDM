package n76;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f213002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f213003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f213004c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f213005g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f213006h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f213007j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f213008l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f213009m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f213010n;
    public final String o;

    public /* synthetic */ c(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        if (32767 != (i & 32767)) {
            j1.f(a.f213001a.getDescriptor(), i, 32767);
            throw null;
        }
        this.f213002a = str;
        this.f213003b = str2;
        this.f213004c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.f213005g = str7;
        this.f213006h = str8;
        this.i = str9;
        this.f213007j = str10;
        this.k = str11;
        this.f213008l = str12;
        this.f213009m = str13;
        this.f213010n = str14;
        this.o = str15;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f213002a, cVar.f213002a) && Intrinsics.f(this.f213003b, cVar.f213003b) && Intrinsics.f(this.f213004c, cVar.f213004c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f213005g, cVar.f213005g) && Intrinsics.f(this.f213006h, cVar.f213006h) && Intrinsics.f(this.i, cVar.i) && Intrinsics.f(this.f213007j, cVar.f213007j) && Intrinsics.f(this.k, cVar.k) && Intrinsics.f(this.f213008l, cVar.f213008l) && Intrinsics.f(this.f213009m, cVar.f213009m) && Intrinsics.f(this.f213010n, cVar.f213010n) && Intrinsics.f(this.o, cVar.o);
    }

    public final int hashCode() {
        int iHashCode = this.f213002a.hashCode() * 31;
        String str = this.f213003b;
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f213004c), 31, this.d), 31, this.e), 31, this.f), 31, this.f213005g), 31, this.f213006h), 31, this.i), 31, this.f213007j), 31, this.k), 31, this.f213008l), 31, this.f213009m);
        String str2 = this.f213010n;
        int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.o;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public c(String currency, String str, String totalCollateralBalance, String portfolioCollateralBalance, String totalEquity, String portfolioEquity, String portfolioMaintenanceMargin, String portfolioMarginBalance, String portfolioLockedMargin, String totalUnrealizedPnl, String portfolioUnrealizedPnl, String portfolioAvailableToTrade, String portfolioAvailableToWithdraw, String str2, String str3) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(totalCollateralBalance, "totalCollateralBalance");
        Intrinsics.checkNotNullParameter(portfolioCollateralBalance, "portfolioCollateralBalance");
        Intrinsics.checkNotNullParameter(totalEquity, "totalEquity");
        Intrinsics.checkNotNullParameter(portfolioEquity, "portfolioEquity");
        Intrinsics.checkNotNullParameter(portfolioMaintenanceMargin, "portfolioMaintenanceMargin");
        Intrinsics.checkNotNullParameter(portfolioMarginBalance, "portfolioMarginBalance");
        Intrinsics.checkNotNullParameter(portfolioLockedMargin, "portfolioLockedMargin");
        Intrinsics.checkNotNullParameter(totalUnrealizedPnl, "totalUnrealizedPnl");
        Intrinsics.checkNotNullParameter(portfolioUnrealizedPnl, "portfolioUnrealizedPnl");
        Intrinsics.checkNotNullParameter(portfolioAvailableToTrade, "portfolioAvailableToTrade");
        Intrinsics.checkNotNullParameter(portfolioAvailableToWithdraw, "portfolioAvailableToWithdraw");
        this.f213002a = currency;
        this.f213003b = str;
        this.f213004c = totalCollateralBalance;
        this.d = portfolioCollateralBalance;
        this.e = totalEquity;
        this.f = portfolioEquity;
        this.f213005g = portfolioMaintenanceMargin;
        this.f213006h = portfolioMarginBalance;
        this.i = portfolioLockedMargin;
        this.f213007j = totalUnrealizedPnl;
        this.k = portfolioUnrealizedPnl;
        this.f213008l = portfolioAvailableToTrade;
        this.f213009m = portfolioAvailableToWithdraw;
        this.f213010n = str2;
        this.o = str3;
    }
}
