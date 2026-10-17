package com.revolut.feature.instruments.trend.collections.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000e\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0082\u0001\u000e\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/instruments/trend/collections/api/model/InstrumentsTrendCollectionId;", "Landroid/os/Parcelable;", "MostTraded", "PopularStarterCfds", "CfdsPnlDrivers", "MostShortedCfds", "Bonds", "IndexEtfs", "TechnologyEtfs", "EtnsCryptoExposure", "EtcsCommodityExposure", "EtpsLeveraged", "DividendLeaders", "RecommendedBuy", "FreeStocks", "PreciousMetalsEtcs", "Lcom/revolut/feature/instruments/trend/collections/api/model/InstrumentsTrendCollectionId$Bonds;", "Lcom/revolut/feature/instruments/trend/collections/api/model/InstrumentsTrendCollectionId$CfdsPnlDrivers;", "Lcom/revolut/feature/instruments/trend/collections/api/model/InstrumentsTrendCollectionId$DividendLeaders;", "Lcom/revolut/feature/instruments/trend/collections/api/model/InstrumentsTrendCollectionId$EtcsCommodityExposure;", "Lcom/revolut/feature/instruments/trend/collections/api/model/InstrumentsTrendCollectionId$EtnsCryptoExposure;", "Lcom/revolut/feature/instruments/trend/collections/api/model/InstrumentsTrendCollectionId$EtpsLeveraged;", "Lcom/revolut/feature/instruments/trend/collections/api/model/InstrumentsTrendCollectionId$FreeStocks;", "Lcom/revolut/feature/instruments/trend/collections/api/model/InstrumentsTrendCollectionId$IndexEtfs;", "Lcom/revolut/feature/instruments/trend/collections/api/model/InstrumentsTrendCollectionId$MostShortedCfds;", "Lcom/revolut/feature/instruments/trend/collections/api/model/InstrumentsTrendCollectionId$MostTraded;", "Lcom/revolut/feature/instruments/trend/collections/api/model/InstrumentsTrendCollectionId$PopularStarterCfds;", "Lcom/revolut/feature/instruments/trend/collections/api/model/InstrumentsTrendCollectionId$PreciousMetalsEtcs;", "Lcom/revolut/feature/instruments/trend/collections/api/model/InstrumentsTrendCollectionId$RecommendedBuy;", "Lcom/revolut/feature/instruments/trend/collections/api/model/InstrumentsTrendCollectionId$TechnologyEtfs;", "feature_instruments_trend_collections_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InstrumentsTrendCollectionId extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/instruments/trend/collections/api/model/InstrumentsTrendCollectionId$Bonds;", "Lcom/revolut/feature/instruments/trend/collections/api/model/InstrumentsTrendCollectionId;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/instruments/trend/collections/api/model/a", "feature_instruments_trend_collections_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Bonds implements InstrumentsTrendCollectionId {

        @NotNull
        public static final Parcelable.Creator<Bonds> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.revolut.feature.instruments.trend.collections.api.model.a f74893a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Bonds(com.revolut.feature.instruments.trend.collections.api.model.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Bonds[i];
            }
        }

        public Bonds(com.revolut.feature.instruments.trend.collections.api.model.a type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.f74893a = type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Bonds) && this.f74893a == ((Bonds) obj2).f74893a;
        }

        public final int hashCode() {
            return this.f74893a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f74893a.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/instruments/trend/collections/api/model/InstrumentsTrendCollectionId$CfdsPnlDrivers;", "Lcom/revolut/feature/instruments/trend/collections/api/model/InstrumentsTrendCollectionId;", "<init>", "()V", "feature_instruments_trend_collections_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CfdsPnlDrivers implements InstrumentsTrendCollectionId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CfdsPnlDrivers f74894a = new CfdsPnlDrivers();

        @NotNull
        public static final Parcelable.Creator<CfdsPnlDrivers> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CfdsPnlDrivers.f74894a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CfdsPnlDrivers[i];
            }
        }

        private CfdsPnlDrivers() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/instruments/trend/collections/api/model/InstrumentsTrendCollectionId$DividendLeaders;", "Lcom/revolut/feature/instruments/trend/collections/api/model/InstrumentsTrendCollectionId;", "<init>", "()V", "feature_instruments_trend_collections_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DividendLeaders implements InstrumentsTrendCollectionId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DividendLeaders f74895a = new DividendLeaders();

        @NotNull
        public static final Parcelable.Creator<DividendLeaders> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DividendLeaders.f74895a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DividendLeaders[i];
            }
        }

        private DividendLeaders() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/instruments/trend/collections/api/model/InstrumentsTrendCollectionId$EtcsCommodityExposure;", "Lcom/revolut/feature/instruments/trend/collections/api/model/InstrumentsTrendCollectionId;", "<init>", "()V", "feature_instruments_trend_collections_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EtcsCommodityExposure implements InstrumentsTrendCollectionId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EtcsCommodityExposure f74896a = new EtcsCommodityExposure();

        @NotNull
        public static final Parcelable.Creator<EtcsCommodityExposure> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EtcsCommodityExposure.f74896a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EtcsCommodityExposure[i];
            }
        }

        private EtcsCommodityExposure() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/instruments/trend/collections/api/model/InstrumentsTrendCollectionId$EtnsCryptoExposure;", "Lcom/revolut/feature/instruments/trend/collections/api/model/InstrumentsTrendCollectionId;", "<init>", "()V", "feature_instruments_trend_collections_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EtnsCryptoExposure implements InstrumentsTrendCollectionId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EtnsCryptoExposure f74897a = new EtnsCryptoExposure();

        @NotNull
        public static final Parcelable.Creator<EtnsCryptoExposure> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EtnsCryptoExposure.f74897a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EtnsCryptoExposure[i];
            }
        }

        private EtnsCryptoExposure() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/instruments/trend/collections/api/model/InstrumentsTrendCollectionId$EtpsLeveraged;", "Lcom/revolut/feature/instruments/trend/collections/api/model/InstrumentsTrendCollectionId;", "<init>", "()V", "feature_instruments_trend_collections_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EtpsLeveraged implements InstrumentsTrendCollectionId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EtpsLeveraged f74898a = new EtpsLeveraged();

        @NotNull
        public static final Parcelable.Creator<EtpsLeveraged> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EtpsLeveraged.f74898a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EtpsLeveraged[i];
            }
        }

        private EtpsLeveraged() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/instruments/trend/collections/api/model/InstrumentsTrendCollectionId$FreeStocks;", "Lcom/revolut/feature/instruments/trend/collections/api/model/InstrumentsTrendCollectionId;", "<init>", "()V", "feature_instruments_trend_collections_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FreeStocks implements InstrumentsTrendCollectionId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FreeStocks f74899a = new FreeStocks();

        @NotNull
        public static final Parcelable.Creator<FreeStocks> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FreeStocks.f74899a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FreeStocks[i];
            }
        }

        private FreeStocks() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/instruments/trend/collections/api/model/InstrumentsTrendCollectionId$IndexEtfs;", "Lcom/revolut/feature/instruments/trend/collections/api/model/InstrumentsTrendCollectionId;", "<init>", "()V", "feature_instruments_trend_collections_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IndexEtfs implements InstrumentsTrendCollectionId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final IndexEtfs f74900a = new IndexEtfs();

        @NotNull
        public static final Parcelable.Creator<IndexEtfs> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return IndexEtfs.f74900a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IndexEtfs[i];
            }
        }

        private IndexEtfs() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/instruments/trend/collections/api/model/InstrumentsTrendCollectionId$MostShortedCfds;", "Lcom/revolut/feature/instruments/trend/collections/api/model/InstrumentsTrendCollectionId;", "<init>", "()V", "feature_instruments_trend_collections_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MostShortedCfds implements InstrumentsTrendCollectionId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MostShortedCfds f74901a = new MostShortedCfds();

        @NotNull
        public static final Parcelable.Creator<MostShortedCfds> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MostShortedCfds.f74901a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MostShortedCfds[i];
            }
        }

        private MostShortedCfds() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/instruments/trend/collections/api/model/InstrumentsTrendCollectionId$MostTraded;", "Lcom/revolut/feature/instruments/trend/collections/api/model/InstrumentsTrendCollectionId;", "<init>", "()V", "feature_instruments_trend_collections_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MostTraded implements InstrumentsTrendCollectionId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MostTraded f74902a = new MostTraded();

        @NotNull
        public static final Parcelable.Creator<MostTraded> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MostTraded.f74902a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MostTraded[i];
            }
        }

        private MostTraded() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/instruments/trend/collections/api/model/InstrumentsTrendCollectionId$PopularStarterCfds;", "Lcom/revolut/feature/instruments/trend/collections/api/model/InstrumentsTrendCollectionId;", "<init>", "()V", "feature_instruments_trend_collections_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PopularStarterCfds implements InstrumentsTrendCollectionId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PopularStarterCfds f74903a = new PopularStarterCfds();

        @NotNull
        public static final Parcelable.Creator<PopularStarterCfds> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PopularStarterCfds.f74903a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PopularStarterCfds[i];
            }
        }

        private PopularStarterCfds() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/instruments/trend/collections/api/model/InstrumentsTrendCollectionId$PreciousMetalsEtcs;", "Lcom/revolut/feature/instruments/trend/collections/api/model/InstrumentsTrendCollectionId;", "<init>", "()V", "feature_instruments_trend_collections_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PreciousMetalsEtcs implements InstrumentsTrendCollectionId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PreciousMetalsEtcs f74904a = new PreciousMetalsEtcs();

        @NotNull
        public static final Parcelable.Creator<PreciousMetalsEtcs> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PreciousMetalsEtcs.f74904a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PreciousMetalsEtcs[i];
            }
        }

        private PreciousMetalsEtcs() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/instruments/trend/collections/api/model/InstrumentsTrendCollectionId$RecommendedBuy;", "Lcom/revolut/feature/instruments/trend/collections/api/model/InstrumentsTrendCollectionId;", "<init>", "()V", "feature_instruments_trend_collections_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RecommendedBuy implements InstrumentsTrendCollectionId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RecommendedBuy f74905a = new RecommendedBuy();

        @NotNull
        public static final Parcelable.Creator<RecommendedBuy> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RecommendedBuy.f74905a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RecommendedBuy[i];
            }
        }

        private RecommendedBuy() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/instruments/trend/collections/api/model/InstrumentsTrendCollectionId$TechnologyEtfs;", "Lcom/revolut/feature/instruments/trend/collections/api/model/InstrumentsTrendCollectionId;", "<init>", "()V", "feature_instruments_trend_collections_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TechnologyEtfs implements InstrumentsTrendCollectionId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TechnologyEtfs f74906a = new TechnologyEtfs();

        @NotNull
        public static final Parcelable.Creator<TechnologyEtfs> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TechnologyEtfs.f74906a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TechnologyEtfs[i];
            }
        }

        private TechnologyEtfs() {
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
}
