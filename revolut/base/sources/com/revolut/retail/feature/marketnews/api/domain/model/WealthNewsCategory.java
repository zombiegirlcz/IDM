package com.revolut.retail.feature.marketnews.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.global_markets.domain.Market;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rzj.g;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/retail/feature/marketnews/api/domain/model/WealthNewsCategory;", "Landroid/os/Parcelable;", "Stocks", "Crypto", "Commodities", "MacroEconomics", "Markets", "Lcom/revolut/retail/feature/marketnews/api/domain/model/WealthNewsCategory$Commodities;", "Lcom/revolut/retail/feature/marketnews/api/domain/model/WealthNewsCategory$Crypto;", "Lcom/revolut/retail/feature/marketnews/api/domain/model/WealthNewsCategory$MacroEconomics;", "Lcom/revolut/retail/feature/marketnews/api/domain/model/WealthNewsCategory$Markets;", "Lcom/revolut/retail/feature/marketnews/api/domain/model/WealthNewsCategory$Stocks;", "feature_market_news_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class WealthNewsCategory implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f101803a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/marketnews/api/domain/model/WealthNewsCategory$Commodities;", "Lcom/revolut/retail/feature/marketnews/api/domain/model/WealthNewsCategory;", "<init>", "()V", "feature_market_news_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Commodities extends WealthNewsCategory {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Commodities f101804b = new Commodities();

        @NotNull
        public static final Parcelable.Creator<Commodities> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Commodities.f101804b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Commodities[i];
            }
        }

        private Commodities() {
            super(g.COMMODITIES);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/marketnews/api/domain/model/WealthNewsCategory$Crypto;", "Lcom/revolut/retail/feature/marketnews/api/domain/model/WealthNewsCategory;", "<init>", "()V", "feature_market_news_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Crypto extends WealthNewsCategory {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Crypto f101805b = new Crypto();

        @NotNull
        public static final Parcelable.Creator<Crypto> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Crypto.f101805b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Crypto[i];
            }
        }

        private Crypto() {
            super(g.CRYPTO);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/marketnews/api/domain/model/WealthNewsCategory$MacroEconomics;", "Lcom/revolut/retail/feature/marketnews/api/domain/model/WealthNewsCategory;", "<init>", "()V", "feature_market_news_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MacroEconomics extends WealthNewsCategory {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final MacroEconomics f101806b = new MacroEconomics();

        @NotNull
        public static final Parcelable.Creator<MacroEconomics> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MacroEconomics.f101806b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MacroEconomics[i];
            }
        }

        private MacroEconomics() {
            super(g.STOCKS);
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/marketnews/api/domain/model/WealthNewsCategory$Markets;", "Lcom/revolut/retail/feature/marketnews/api/domain/model/WealthNewsCategory;", "", "toString", "()Ljava/lang/String;", "feature_market_news_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Markets extends WealthNewsCategory {

        @NotNull
        public static final Parcelable.Creator<Markets> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Market f101807b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Markets((Market) parcel.readParcelable(Markets.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Markets[i];
            }
        }

        public Markets(Market market) {
            super(g.STOCKS);
            this.f101807b = market;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Markets) && this.f101807b == ((Markets) obj2).f101807b;
        }

        public final int hashCode() {
            Market market = this.f101807b;
            if (market == null) {
                return 0;
            }
            return market.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101807b, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/marketnews/api/domain/model/WealthNewsCategory$Stocks;", "Lcom/revolut/retail/feature/marketnews/api/domain/model/WealthNewsCategory;", "<init>", "()V", "feature_market_news_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Stocks extends WealthNewsCategory {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Stocks f101808b = new Stocks();

        @NotNull
        public static final Parcelable.Creator<Stocks> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Stocks.f101808b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Stocks[i];
            }
        }

        private Stocks() {
            super(g.STOCKS);
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

    public WealthNewsCategory(g gVar) {
        this.f101803a = gVar;
    }
}
