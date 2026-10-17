package com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00042\u00020\u0001:\n\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsScreen;", "Landroid/os/Parcelable;", "<init>", "()V", "Companion", "FundData", "EeaFundData", "PriceAndVolume", "EeaPriceAndVolume", "BondPriceAndVolume", "PerShareData", "Ratios", "Yield", "Risk", "a", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsScreen$BondPriceAndVolume;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsScreen$EeaFundData;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsScreen$EeaPriceAndVolume;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsScreen$FundData;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsScreen$PerShareData;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsScreen$PriceAndVolume;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsScreen$Ratios;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsScreen$Risk;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsScreen$Yield;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class StatsScreen implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsScreen$BondPriceAndVolume;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsScreen;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BondPriceAndVolume extends StatsScreen {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BondPriceAndVolume f103752a = new BondPriceAndVolume();

        @NotNull
        public static final Parcelable.Creator<BondPriceAndVolume> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BondPriceAndVolume.f103752a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BondPriceAndVolume[i];
            }
        }

        private BondPriceAndVolume() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsScreen$EeaFundData;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsScreen;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EeaFundData extends StatsScreen {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EeaFundData f103753a = new EeaFundData();

        @NotNull
        public static final Parcelable.Creator<EeaFundData> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EeaFundData.f103753a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EeaFundData[i];
            }
        }

        private EeaFundData() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsScreen$EeaPriceAndVolume;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsScreen;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EeaPriceAndVolume extends StatsScreen {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EeaPriceAndVolume f103754a = new EeaPriceAndVolume();

        @NotNull
        public static final Parcelable.Creator<EeaPriceAndVolume> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EeaPriceAndVolume.f103754a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EeaPriceAndVolume[i];
            }
        }

        private EeaPriceAndVolume() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsScreen$FundData;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsScreen;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FundData extends StatsScreen {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FundData f103755a = new FundData();

        @NotNull
        public static final Parcelable.Creator<FundData> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FundData.f103755a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FundData[i];
            }
        }

        private FundData() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsScreen$PerShareData;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsScreen;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PerShareData extends StatsScreen {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PerShareData f103756a = new PerShareData();

        @NotNull
        public static final Parcelable.Creator<PerShareData> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PerShareData.f103756a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PerShareData[i];
            }
        }

        private PerShareData() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsScreen$PriceAndVolume;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsScreen;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PriceAndVolume extends StatsScreen {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PriceAndVolume f103757a = new PriceAndVolume();

        @NotNull
        public static final Parcelable.Creator<PriceAndVolume> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PriceAndVolume.f103757a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PriceAndVolume[i];
            }
        }

        private PriceAndVolume() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsScreen$Ratios;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsScreen;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Ratios extends StatsScreen {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Ratios f103758a = new Ratios();

        @NotNull
        public static final Parcelable.Creator<Ratios> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Ratios.f103758a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Ratios[i];
            }
        }

        private Ratios() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsScreen$Risk;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsScreen;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Risk extends StatsScreen {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Risk f103759a = new Risk();

        @NotNull
        public static final Parcelable.Creator<Risk> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Risk.f103759a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Risk[i];
            }
        }

        private Risk() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsScreen$Yield;", "Lcom/revolut/retail/feature/stockdetails/impl/domain/internal/key_stats/models/StatsScreen;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Yield extends StatsScreen {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Yield f103760a = new Yield();

        @NotNull
        public static final Parcelable.Creator<Yield> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Yield.f103760a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Yield[i];
            }
        }

        private Yield() {
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

    private StatsScreen() {
    }
}
