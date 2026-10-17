package com.revolut.feature.derivatives.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import oj1.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/derivatives/models/DerivativesBalance;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_derivatives_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DerivativesBalance implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f71898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f71899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f71900c;
    public final BigDecimal d;
    public final BigDecimal e;
    public final BigDecimal f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BigDecimal f71901g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final BigDecimal f71902h;
    public final BigDecimal i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final BigDecimal f71903j;
    public final BigDecimal k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final BigDecimal f71904l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final BigDecimal f71905m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final BigDecimal f71906n;
    public final a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f71907p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f71908q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f71909r;

    @NotNull
    public static final Parcelable.Creator<DerivativesBalance> CREATOR = new b();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final BigDecimal f71897s = new BigDecimal("100");

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DerivativesBalance((xi0.b) parcel.readSerializable(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readInt() == 0 ? null : a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DerivativesBalance[i];
        }
    }

    public DerivativesBalance(xi0.b currency, String str, BigDecimal totalCollateralBalance, BigDecimal portfolioCollateralBalance, BigDecimal totalEquity, BigDecimal portfolioEquity, BigDecimal portfolioMaintenanceMargin, BigDecimal portfolioMarginBalance, BigDecimal portfolioLockedMargin, BigDecimal totalUnrealizedPnl, BigDecimal portfolioUnrealizedPnl, BigDecimal portfolioAvailableToTrade, BigDecimal portfolioAvailableToWithdraw, BigDecimal bigDecimal, a aVar) {
        BigDecimal bigDecimalMultiply;
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
        this.f71898a = currency;
        this.f71899b = str;
        this.f71900c = totalCollateralBalance;
        this.d = portfolioCollateralBalance;
        this.e = totalEquity;
        this.f = portfolioEquity;
        this.f71901g = portfolioMaintenanceMargin;
        this.f71902h = portfolioMarginBalance;
        this.i = portfolioLockedMargin;
        this.f71903j = totalUnrealizedPnl;
        this.k = portfolioUnrealizedPnl;
        this.f71904l = portfolioAvailableToTrade;
        this.f71905m = portfolioAvailableToWithdraw;
        this.f71906n = bigDecimal;
        this.o = aVar;
        a(totalCollateralBalance);
        this.f71907p = a(totalEquity);
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        Comparable comparableC = f.c(portfolioAvailableToTrade, ZERO);
        Intrinsics.checkNotNullExpressionValue(comparableC, "coerceAtLeast(...)");
        a((BigDecimal) comparableC);
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        Comparable comparableC2 = f.c(portfolioAvailableToWithdraw, ZERO);
        Intrinsics.checkNotNullExpressionValue(comparableC2, "coerceAtLeast(...)");
        this.f71908q = a((BigDecimal) comparableC2);
        a(portfolioLockedMargin);
        this.f71909r = a(totalUnrealizedPnl);
        a(portfolioMarginBalance);
        a(portfolioMaintenanceMargin);
        BigDecimal bigDecimalSubtract = portfolioMarginBalance.subtract(portfolioMaintenanceMargin);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        a(bigDecimalSubtract);
        if (bigDecimal == null || (bigDecimalMultiply = bigDecimal.multiply(f71897s)) == null || bigDecimalMultiply.setScale(0, RoundingMode.HALF_UP) == null) {
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        }
    }

    public final d a(BigDecimal bigDecimal) {
        return mif.a.Q(new ej0.b(bigDecimal, this.f71898a));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DerivativesBalance)) {
            return false;
        }
        DerivativesBalance derivativesBalance = (DerivativesBalance) obj2;
        return Intrinsics.f(this.f71898a, derivativesBalance.f71898a) && Intrinsics.f(this.f71899b, derivativesBalance.f71899b) && Intrinsics.f(this.f71900c, derivativesBalance.f71900c) && Intrinsics.f(this.d, derivativesBalance.d) && Intrinsics.f(this.e, derivativesBalance.e) && Intrinsics.f(this.f, derivativesBalance.f) && Intrinsics.f(this.f71901g, derivativesBalance.f71901g) && Intrinsics.f(this.f71902h, derivativesBalance.f71902h) && Intrinsics.f(this.i, derivativesBalance.i) && Intrinsics.f(this.f71903j, derivativesBalance.f71903j) && Intrinsics.f(this.k, derivativesBalance.k) && Intrinsics.f(this.f71904l, derivativesBalance.f71904l) && Intrinsics.f(this.f71905m, derivativesBalance.f71905m) && Intrinsics.f(this.f71906n, derivativesBalance.f71906n) && this.o == derivativesBalance.o;
    }

    public final int hashCode() {
        int iHashCode = this.f71898a.hashCode() * 31;
        String str = this.f71899b;
        int iD = t61.a.d(this.f71905m, t61.a.d(this.f71904l, t61.a.d(this.k, t61.a.d(this.f71903j, t61.a.d(this.i, t61.a.d(this.f71902h, t61.a.d(this.f71901g, t61.a.d(this.f, t61.a.d(this.e, t61.a.d(this.d, t61.a.d(this.f71900c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        BigDecimal bigDecimal = this.f71906n;
        int iHashCode2 = (iD + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        a aVar = this.o;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f71898a);
        dest.writeString(this.f71899b);
        dest.writeSerializable(this.f71900c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
        dest.writeSerializable(this.f71901g);
        dest.writeSerializable(this.f71902h);
        dest.writeSerializable(this.i);
        dest.writeSerializable(this.f71903j);
        dest.writeSerializable(this.k);
        dest.writeSerializable(this.f71904l);
        dest.writeSerializable(this.f71905m);
        dest.writeSerializable(this.f71906n);
        a aVar = this.o;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
    }
}
