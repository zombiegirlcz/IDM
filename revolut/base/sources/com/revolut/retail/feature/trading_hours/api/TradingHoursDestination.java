package com.revolut.retail.feature.trading_hours.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/trading_hours/api/TradingHoursDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "MarketHours", "CommodityMarketHours", "Lcom/revolut/retail/feature/trading_hours/api/TradingHoursDestination$CommodityMarketHours;", "Lcom/revolut/retail/feature/trading_hours/api/TradingHoursDestination$MarketHours;", "feature_trading_hours_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TradingHoursDestination extends KompotDestination {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/trading_hours/api/TradingHoursDestination$CommodityMarketHours;", "Lcom/revolut/retail/feature/trading_hours/api/TradingHoursDestination;", "<init>", "()V", "feature_trading_hours_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CommodityMarketHours implements TradingHoursDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CommodityMarketHours f104065a = new CommodityMarketHours();

        @NotNull
        public static final Parcelable.Creator<CommodityMarketHours> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CommodityMarketHours.f104065a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CommodityMarketHours[i];
            }
        }

        private CommodityMarketHours() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/trading_hours/api/TradingHoursDestination$MarketHours;", "Lcom/revolut/retail/feature/trading_hours/api/TradingHoursDestination;", "", "toString", "()Ljava/lang/String;", "feature_trading_hours_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MarketHours implements TradingHoursDestination {

        @NotNull
        public static final Parcelable.Creator<MarketHours> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n f104066a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MarketHours((n) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MarketHours[i];
            }
        }

        public MarketHours(n mainAsset) {
            Intrinsics.checkNotNullParameter(mainAsset, "mainAsset");
            this.f104066a = mainAsset;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final n getF104066a() {
            return this.f104066a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MarketHours) && Intrinsics.f(this.f104066a, ((MarketHours) obj2).f104066a);
        }

        public final int hashCode() {
            return this.f104066a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f104066a);
        }
    }
}
