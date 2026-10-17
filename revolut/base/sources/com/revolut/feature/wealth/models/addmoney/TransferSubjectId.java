package com.revolut.feature.wealth.models.addmoney;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/wealth/models/addmoney/TransferSubjectId;", "Landroid/os/Parcelable;", "Portfolio", "CashHolding", "Lcom/revolut/feature/wealth/models/addmoney/TransferSubjectId$CashHolding;", "Lcom/revolut/feature/wealth/models/addmoney/TransferSubjectId$Portfolio;", "feature_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TransferSubjectId extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/models/addmoney/TransferSubjectId$CashHolding;", "Lcom/revolut/feature/wealth/models/addmoney/TransferSubjectId;", "", "toString", "()Ljava/lang/String;", "feature_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CashHolding implements TransferSubjectId {

        @NotNull
        public static final Parcelable.Creator<CashHolding> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f95654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f95655b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f95656c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CashHolding(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CashHolding[i];
            }
        }

        public CashHolding(String portfolioId, String holdingId, String currency, String pocketId) {
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            Intrinsics.checkNotNullParameter(holdingId, "holdingId");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(pocketId, "pocketId");
            this.f95654a = portfolioId;
            this.f95655b = holdingId;
            this.f95656c = currency;
            this.d = pocketId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CashHolding)) {
                return false;
            }
            CashHolding cashHolding = (CashHolding) obj2;
            return Intrinsics.f(this.f95654a, cashHolding.f95654a) && Intrinsics.f(this.f95655b, cashHolding.f95655b) && Intrinsics.f(this.f95656c, cashHolding.f95656c) && Intrinsics.f(this.d, cashHolding.d);
        }

        @Override // com.revolut.feature.wealth.models.addmoney.TransferSubjectId
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getF95657a() {
            return this.f95654a;
        }

        public final int hashCode() {
            return this.d.hashCode() + p.a.c(p.a.c(this.f95654a.hashCode() * 31, 31, this.f95655b), 31, this.f95656c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95654a);
            dest.writeString(this.f95655b);
            dest.writeString(this.f95656c);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/models/addmoney/TransferSubjectId$Portfolio;", "Lcom/revolut/feature/wealth/models/addmoney/TransferSubjectId;", "", "toString", "()Ljava/lang/String;", "feature_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Portfolio implements TransferSubjectId {

        @NotNull
        public static final Parcelable.Creator<Portfolio> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f95657a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Portfolio(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Portfolio[i];
            }
        }

        public Portfolio(String portfolioId) {
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            this.f95657a = portfolioId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Portfolio) && Intrinsics.f(this.f95657a, ((Portfolio) obj2).f95657a);
        }

        @Override // com.revolut.feature.wealth.models.addmoney.TransferSubjectId
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getF95657a() {
            return this.f95657a;
        }

        public final int hashCode() {
            return this.f95657a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95657a);
        }
    }

    /* JADX INFO: renamed from: g */
    String getF95657a();
}
