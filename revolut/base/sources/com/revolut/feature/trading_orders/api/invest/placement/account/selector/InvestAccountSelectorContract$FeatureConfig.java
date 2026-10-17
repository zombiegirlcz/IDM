package com.revolut.feature.trading_orders.api.invest.placement.account.selector;

import android.os.Parcel;
import android.os.Parcelable;
import bfl.g;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/trading_orders/api/invest/placement/account/selector/InvestAccountSelectorContract$FeatureConfig", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvestAccountSelectorContract$FeatureConfig extends KompotBridgeFeatureConfig {

    @NotNull
    public static final Parcelable.Creator<InvestAccountSelectorContract$FeatureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f91710g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f91711h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InvestAccountSelectorContract$Disclaimer f91712j;
    public final int k;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            g gVarValueOf = g.valueOf(parcel.readString());
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(InvestAccountSelectorContract$FeatureConfig.class, parcel, arrayList, iE, 1);
            }
            return new InvestAccountSelectorContract$FeatureConfig(gVarValueOf, string, arrayList, (InvestAccountSelectorContract$Disclaimer) parcel.readParcelable(InvestAccountSelectorContract$FeatureConfig.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvestAccountSelectorContract$FeatureConfig[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestAccountSelectorContract$FeatureConfig(g tradeSide, String defaultSelectedPocketId, List sectionsParams, InvestAccountSelectorContract$Disclaimer disclaimer, int i) {
        super((ActivityAnimation) null, (ParcelableDestination) new InvestAccountSelectorContract$Destination(tradeSide, defaultSelectedPocketId, sectionsParams, disclaimer), false, Integer.valueOf(i), 0, 53);
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(defaultSelectedPocketId, "defaultSelectedPocketId");
        Intrinsics.checkNotNullParameter(sectionsParams, "sectionsParams");
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        this.f91710g = tradeSide;
        this.f91711h = defaultSelectedPocketId;
        this.i = sectionsParams;
        this.f91712j = disclaimer;
        this.k = i;
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    /* JADX INFO: renamed from: c */
    public final Integer getF66060h() {
        return Integer.valueOf(this.k);
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InvestAccountSelectorContract$FeatureConfig)) {
            return false;
        }
        InvestAccountSelectorContract$FeatureConfig investAccountSelectorContract$FeatureConfig = (InvestAccountSelectorContract$FeatureConfig) obj2;
        return this.f91710g == investAccountSelectorContract$FeatureConfig.f91710g && Intrinsics.f(this.f91711h, investAccountSelectorContract$FeatureConfig.f91711h) && Intrinsics.f(this.i, investAccountSelectorContract$FeatureConfig.i) && Intrinsics.f(this.f91712j, investAccountSelectorContract$FeatureConfig.f91712j) && this.k == investAccountSelectorContract$FeatureConfig.k;
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final int hashCode() {
        return Integer.hashCode(this.k) + ((this.f91712j.hashCode() + p.a.d(p.a.c(this.f91710g.hashCode() * 31, 31, this.f91711h), 31, this.i)) * 31);
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91710g.name());
        dest.writeString(this.f91711h);
        Iterator itV = p.a.v(this.i, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeParcelable(this.f91712j, i);
        dest.writeInt(this.k);
    }
}
