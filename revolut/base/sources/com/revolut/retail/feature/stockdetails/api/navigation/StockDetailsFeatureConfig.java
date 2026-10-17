package com.revolut.retail.feature.stockdetails.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.feature.stockdetails.api.navigation.StartNavigation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vqk.c;
import yhm.d;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/api/navigation/StockDetailsFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_stock_details_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final /* data */ class StockDetailsFeatureConfig extends KompotBridgeFeatureConfig {

    @NotNull
    public static final Parcelable.Creator<StockDetailsFeatureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f103744g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f103745h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f103746j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final StartNavigation f103747l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f103748m;

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StockDetailsFeatureConfig(parcel.readString(), parcel.readInt() == 0 ? null : c.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt() != 0, parcel.readString(), (StartNavigation) parcel.readParcelable(StockDetailsFeatureConfig.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StockDetailsFeatureConfig[i];
        }
    }

    public /* synthetic */ StockDetailsFeatureConfig(String str, StartNavigation.OrderFlow orderFlow, int i) {
        this(str, null, 67108864, true, null, (i & 32) != 0 ? null : orderFlow, str);
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getI() {
        return this.i;
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StockDetailsFeatureConfig)) {
            return false;
        }
        StockDetailsFeatureConfig stockDetailsFeatureConfig = (StockDetailsFeatureConfig) obj2;
        return Intrinsics.f(this.f103744g, stockDetailsFeatureConfig.f103744g) && this.f103745h == stockDetailsFeatureConfig.f103745h && this.i == stockDetailsFeatureConfig.i && this.f103746j == stockDetailsFeatureConfig.f103746j && Intrinsics.f(this.k, stockDetailsFeatureConfig.k) && Intrinsics.f(this.f103747l, stockDetailsFeatureConfig.f103747l) && Intrinsics.f(this.f103748m, stockDetailsFeatureConfig.f103748m);
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final int hashCode() {
        int iHashCode = this.f103744g.hashCode() * 31;
        c cVar = this.f103745h;
        int iC = j6.a.c(j6.a.b(this.i, (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31, 31), 31, this.f103746j);
        String str = this.k;
        int iHashCode2 = (iC + (str == null ? 0 : str.hashCode())) * 31;
        StartNavigation startNavigation = this.f103747l;
        return this.f103748m.hashCode() + ((iHashCode2 + (startNavigation != null ? startNavigation.hashCode() : 0)) * 31);
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f103744g);
        c cVar = this.f103745h;
        if (cVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(cVar.name());
        }
        dest.writeInt(this.i);
        dest.writeInt(this.f103746j ? 1 : 0);
        dest.writeString(this.k);
        dest.writeParcelable(this.f103747l, i);
        dest.writeString(this.f103748m);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StockDetailsFeatureConfig(String ref2, c cVar, int i, boolean z, String str, StartNavigation startNavigation, String trackableRef) {
        super((ActivityAnimation) null, (ParcelableDestination) new AssetDetailsDestination(ref2, cVar, z, str, startNavigation, null, 32), false, (Integer) null, i, 45);
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(trackableRef, "trackableRef");
        this.f103744g = ref2;
        this.f103745h = cVar;
        this.i = i;
        this.f103746j = z;
        this.k = str;
        this.f103747l = startNavigation;
        this.f103748m = trackableRef;
    }
}
