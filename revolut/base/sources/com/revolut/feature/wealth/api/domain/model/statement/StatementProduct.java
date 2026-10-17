package com.revolut.feature.wealth.api.domain.model.statement;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/statement/StatementProduct;", "Landroid/os/Parcelable;", "d0h/a", "Stocks", "Robo", "MarginTrading", "TaxAdvantage", "Commodities", "Lcom/revolut/feature/wealth/api/domain/model/statement/StatementProduct$Commodities;", "Lcom/revolut/feature/wealth/api/domain/model/statement/StatementProduct$MarginTrading;", "Lcom/revolut/feature/wealth/api/domain/model/statement/StatementProduct$Robo;", "Lcom/revolut/feature/wealth/api/domain/model/statement/StatementProduct$Stocks;", "Lcom/revolut/feature/wealth/api/domain/model/statement/StatementProduct$TaxAdvantage;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface StatementProduct extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/statement/StatementProduct$Commodities;", "Lcom/revolut/feature/wealth/api/domain/model/statement/StatementProduct;", "<init>", "()V", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Commodities implements StatementProduct {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Commodities f95310a = new Commodities();

        @NotNull
        public static final Parcelable.Creator<Commodities> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Commodities.f95310a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Commodities[i];
            }
        }

        private Commodities() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/statement/StatementProduct$MarginTrading;", "Lcom/revolut/feature/wealth/api/domain/model/statement/StatementProduct;", "Ld0h/a;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MarginTrading implements StatementProduct, d0h.a {

        @NotNull
        public static final Parcelable.Creator<MarginTrading> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f95311a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MarginTrading(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MarginTrading[i];
            }
        }

        public MarginTrading(String portfolioId) {
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            this.f95311a = portfolioId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MarginTrading) && Intrinsics.f(this.f95311a, ((MarginTrading) obj2).f95311a);
        }

        @Override // d0h.a
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getF95314a() {
            return this.f95311a;
        }

        public final int hashCode() {
            return this.f95311a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95311a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/statement/StatementProduct$Robo;", "Lcom/revolut/feature/wealth/api/domain/model/statement/StatementProduct;", "Ld0h/a;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Robo implements StatementProduct, d0h.a {

        @NotNull
        public static final Parcelable.Creator<Robo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f95312a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Robo(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Robo[i];
            }
        }

        public Robo(String portfolioId) {
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            this.f95312a = portfolioId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Robo) && Intrinsics.f(this.f95312a, ((Robo) obj2).f95312a);
        }

        @Override // d0h.a
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getF95314a() {
            return this.f95312a;
        }

        public final int hashCode() {
            return this.f95312a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95312a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/statement/StatementProduct$Stocks;", "Lcom/revolut/feature/wealth/api/domain/model/statement/StatementProduct;", "Ld0h/a;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Stocks implements StatementProduct, d0h.a {

        @NotNull
        public static final Parcelable.Creator<Stocks> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f95313a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Stocks(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Stocks[i];
            }
        }

        public Stocks(String portfolioId) {
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            this.f95313a = portfolioId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Stocks) && Intrinsics.f(this.f95313a, ((Stocks) obj2).f95313a);
        }

        @Override // d0h.a
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getF95314a() {
            return this.f95313a;
        }

        public final int hashCode() {
            return this.f95313a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95313a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/statement/StatementProduct$TaxAdvantage;", "Lcom/revolut/feature/wealth/api/domain/model/statement/StatementProduct;", "Ld0h/a;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TaxAdvantage implements StatementProduct, d0h.a {

        @NotNull
        public static final Parcelable.Creator<TaxAdvantage> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f95314a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TaxAdvantage(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaxAdvantage[i];
            }
        }

        public TaxAdvantage(String portfolioId) {
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            this.f95314a = portfolioId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TaxAdvantage) && Intrinsics.f(this.f95314a, ((TaxAdvantage) obj2).f95314a);
        }

        @Override // d0h.a
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getF95314a() {
            return this.f95314a;
        }

        public final int hashCode() {
            return this.f95314a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95314a);
        }
    }
}
