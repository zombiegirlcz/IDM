package com.revolut.feature.cryptocommodity_invest.api.navigation;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/revolut/feature/cryptocommodity_invest/api/navigation/CryptoCommodityInvestBizFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "BuyCollection", "CryptoCommodityBuyCollectionFlowNavigationDestination", "OverviewCollections", "CryptoCommodityCollectionsOverviewNavigationDestination", "DiscoverAllKompot", "DiscoverAllKompotNavigationDestination", "CollectionDetails", "CryptoCommodityCollectionsDetailsNavigationDestination", "Lcom/revolut/feature/cryptocommodity_invest/api/navigation/CryptoCommodityInvestBizFeatureConfig$BuyCollection;", "Lcom/revolut/feature/cryptocommodity_invest/api/navigation/CryptoCommodityInvestBizFeatureConfig$CollectionDetails;", "Lcom/revolut/feature/cryptocommodity_invest/api/navigation/CryptoCommodityInvestBizFeatureConfig$DiscoverAllKompot;", "Lcom/revolut/feature/cryptocommodity_invest/api/navigation/CryptoCommodityInvestBizFeatureConfig$OverviewCollections;", "feature_cryptocommodity_invest_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CryptoCommodityInvestBizFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cryptocommodity_invest/api/navigation/CryptoCommodityInvestBizFeatureConfig$BuyCollection;", "Lcom/revolut/feature/cryptocommodity_invest/api/navigation/CryptoCommodityInvestBizFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_cryptocommodity_invest_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BuyCollection extends CryptoCommodityInvestBizFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f71501g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f71502h;
        public final long i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f71503j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BuyCollection(long j2, String collectionKey, String defaultCurrency, String defaultPocketId) {
            super(new CryptoCommodityBuyCollectionFlowNavigationDestination(j2, collectionKey, defaultCurrency, defaultPocketId));
            Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
            Intrinsics.checkNotNullParameter(defaultCurrency, "defaultCurrency");
            Intrinsics.checkNotNullParameter(defaultPocketId, "defaultPocketId");
            this.f71501g = collectionKey;
            this.f71502h = defaultCurrency;
            this.i = j2;
            this.f71503j = defaultPocketId;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getF71979h() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BuyCollection)) {
                return false;
            }
            BuyCollection buyCollection = (BuyCollection) obj2;
            return Intrinsics.f(this.f71501g, buyCollection.f71501g) && Intrinsics.f(this.f71502h, buyCollection.f71502h) && this.i == buyCollection.i && Intrinsics.f(this.f71503j, buyCollection.f71503j);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f71503j.hashCode() + d.c(a.c(this.f71501g.hashCode() * 31, 31, this.f71502h), 31, this.i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cryptocommodity_invest/api/navigation/CryptoCommodityInvestBizFeatureConfig$CollectionDetails;", "Lcom/revolut/feature/cryptocommodity_invest/api/navigation/CryptoCommodityInvestBizFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_cryptocommodity_invest_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CollectionDetails extends CryptoCommodityInvestBizFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f71504g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CollectionDetails(String collectionKey) {
            super(new CryptoCommodityCollectionsDetailsNavigationDestination(collectionKey));
            Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
            this.f71504g = collectionKey;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getF71979h() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CollectionDetails) && Intrinsics.f(this.f71504g, ((CollectionDetails) obj2).f71504g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f71504g.hashCode() * 31;
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cryptocommodity_invest/api/navigation/CryptoCommodityInvestBizFeatureConfig$CryptoCommodityBuyCollectionFlowNavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_cryptocommodity_invest_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CryptoCommodityBuyCollectionFlowNavigationDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<CryptoCommodityBuyCollectionFlowNavigationDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f71505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f71506b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f71507c;
        public final String d;

        /* JADX INFO: loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CryptoCommodityBuyCollectionFlowNavigationDestination(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CryptoCommodityBuyCollectionFlowNavigationDestination[i];
            }
        }

        public CryptoCommodityBuyCollectionFlowNavigationDestination(long j2, String collectionKey, String defaultCurrency, String defaultPocketId) {
            Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
            Intrinsics.checkNotNullParameter(defaultCurrency, "defaultCurrency");
            Intrinsics.checkNotNullParameter(defaultPocketId, "defaultPocketId");
            this.f71505a = collectionKey;
            this.f71506b = defaultCurrency;
            this.f71507c = j2;
            this.d = defaultPocketId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CryptoCommodityBuyCollectionFlowNavigationDestination)) {
                return false;
            }
            CryptoCommodityBuyCollectionFlowNavigationDestination cryptoCommodityBuyCollectionFlowNavigationDestination = (CryptoCommodityBuyCollectionFlowNavigationDestination) obj2;
            return Intrinsics.f(this.f71505a, cryptoCommodityBuyCollectionFlowNavigationDestination.f71505a) && Intrinsics.f(this.f71506b, cryptoCommodityBuyCollectionFlowNavigationDestination.f71506b) && this.f71507c == cryptoCommodityBuyCollectionFlowNavigationDestination.f71507c && Intrinsics.f(this.d, cryptoCommodityBuyCollectionFlowNavigationDestination.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + d.c(p.a.c(this.f71505a.hashCode() * 31, 31, this.f71506b), 31, this.f71507c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71505a);
            dest.writeString(this.f71506b);
            dest.writeLong(this.f71507c);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cryptocommodity_invest/api/navigation/CryptoCommodityInvestBizFeatureConfig$CryptoCommodityCollectionsDetailsNavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_cryptocommodity_invest_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CryptoCommodityCollectionsDetailsNavigationDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<CryptoCommodityCollectionsDetailsNavigationDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f71508a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CryptoCommodityCollectionsDetailsNavigationDestination(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CryptoCommodityCollectionsDetailsNavigationDestination[i];
            }
        }

        public CryptoCommodityCollectionsDetailsNavigationDestination(String collectionKey) {
            Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
            this.f71508a = collectionKey;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF71508a() {
            return this.f71508a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CryptoCommodityCollectionsDetailsNavigationDestination) && Intrinsics.f(this.f71508a, ((CryptoCommodityCollectionsDetailsNavigationDestination) obj2).f71508a);
        }

        public final int hashCode() {
            return this.f71508a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71508a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/cryptocommodity_invest/api/navigation/CryptoCommodityInvestBizFeatureConfig$CryptoCommodityCollectionsOverviewNavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_cryptocommodity_invest_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CryptoCommodityCollectionsOverviewNavigationDestination implements KompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CryptoCommodityCollectionsOverviewNavigationDestination f71509a = new CryptoCommodityCollectionsOverviewNavigationDestination();

        @NotNull
        public static final Parcelable.Creator<CryptoCommodityCollectionsOverviewNavigationDestination> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CryptoCommodityCollectionsOverviewNavigationDestination.f71509a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CryptoCommodityCollectionsOverviewNavigationDestination[i];
            }
        }

        private CryptoCommodityCollectionsOverviewNavigationDestination() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cryptocommodity_invest/api/navigation/CryptoCommodityInvestBizFeatureConfig$DiscoverAllKompot;", "Lcom/revolut/feature/cryptocommodity_invest/api/navigation/CryptoCommodityInvestBizFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_cryptocommodity_invest_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DiscoverAllKompot extends CryptoCommodityInvestBizFeatureConfig {
        public DiscoverAllKompot() {
            this(0);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getF71979h() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof DiscoverAllKompot);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return 0;
        }

        public DiscoverAllKompot(int i) {
            super(DiscoverAllKompotNavigationDestination.f71510a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/cryptocommodity_invest/api/navigation/CryptoCommodityInvestBizFeatureConfig$DiscoverAllKompotNavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_cryptocommodity_invest_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DiscoverAllKompotNavigationDestination implements KompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DiscoverAllKompotNavigationDestination f71510a = new DiscoverAllKompotNavigationDestination();

        @NotNull
        public static final Parcelable.Creator<DiscoverAllKompotNavigationDestination> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DiscoverAllKompotNavigationDestination.f71510a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DiscoverAllKompotNavigationDestination[i];
            }
        }

        private DiscoverAllKompotNavigationDestination() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cryptocommodity_invest/api/navigation/CryptoCommodityInvestBizFeatureConfig$OverviewCollections;", "Lcom/revolut/feature/cryptocommodity_invest/api/navigation/CryptoCommodityInvestBizFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_cryptocommodity_invest_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OverviewCollections extends CryptoCommodityInvestBizFeatureConfig {
        public OverviewCollections() {
            this(0);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getF71979h() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof OverviewCollections);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return 0;
        }

        public OverviewCollections(int i) {
            super(CryptoCommodityCollectionsOverviewNavigationDestination.f71509a);
        }
    }

    public CryptoCommodityInvestBizFeatureConfig(KompotDestination kompotDestination) {
        super((ActivityAnimation) null, (ParcelableDestination) kompotDestination, false, (Integer) null, 0, 60);
    }
}
