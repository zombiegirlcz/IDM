package com.revolut.feature.topup_screen.api.feature_config;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.checkout.models.CheckoutOrder;
import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import grl.k9;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/api/feature_config/TopUpCheckoutFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TopUpCheckoutFeatureConfig implements FeatureConfig {

    @NotNull
    public static final Parcelable.Creator<TopUpCheckoutFeatureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckoutOrder f90514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CheckoutParams f90515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NaviCommand f90516c;
    public final AccountId d;
    public final AnalyticsProduct e;

    /* JADX INFO: loaded from: classes8.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TopUpCheckoutFeatureConfig((CheckoutOrder) parcel.readParcelable(TopUpCheckoutFeatureConfig.class.getClassLoader()), (CheckoutParams) parcel.readParcelable(TopUpCheckoutFeatureConfig.class.getClassLoader()), (NaviCommand) parcel.readParcelable(TopUpCheckoutFeatureConfig.class.getClassLoader()), (AccountId) parcel.readParcelable(TopUpCheckoutFeatureConfig.class.getClassLoader()), (AnalyticsProduct) parcel.readParcelable(TopUpCheckoutFeatureConfig.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TopUpCheckoutFeatureConfig[i];
        }
    }

    public TopUpCheckoutFeatureConfig(CheckoutOrder checkoutOrder, CheckoutParams checkoutParams, NaviCommand naviCommand, AccountId accountId, AnalyticsProduct automaticEventProduct) {
        Intrinsics.checkNotNullParameter(checkoutOrder, "checkoutOrder");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(automaticEventProduct, "automaticEventProduct");
        this.f90514a = checkoutOrder;
        this.f90515b = checkoutParams;
        this.f90516c = naviCommand;
        this.d = accountId;
        this.e = automaticEventProduct;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TopUpCheckoutFeatureConfig)) {
            return false;
        }
        TopUpCheckoutFeatureConfig topUpCheckoutFeatureConfig = (TopUpCheckoutFeatureConfig) obj2;
        return Intrinsics.f(this.f90514a, topUpCheckoutFeatureConfig.f90514a) && Intrinsics.f(this.f90515b, topUpCheckoutFeatureConfig.f90515b) && Intrinsics.f(this.f90516c, topUpCheckoutFeatureConfig.f90516c) && Intrinsics.f(this.d, topUpCheckoutFeatureConfig.d) && Intrinsics.f(this.e, topUpCheckoutFeatureConfig.e);
    }

    public final int hashCode() {
        int iHashCode = this.f90514a.hashCode() * 31;
        CheckoutParams checkoutParams = this.f90515b;
        int iHashCode2 = (iHashCode + (checkoutParams == null ? 0 : checkoutParams.hashCode())) * 31;
        NaviCommand naviCommand = this.f90516c;
        return this.e.hashCode() + l.b(this.d, (iHashCode2 + (naviCommand != null ? naviCommand.hashCode() : 0)) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f90514a, i);
        dest.writeParcelable(this.f90515b, i);
        dest.writeParcelable(this.f90516c, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TopUpCheckoutFeatureConfig(CheckoutOrder checkoutOrder, NaviCommand naviCommand, AccountId accountId, int i) {
        NaviCommand naviCommand2 = (i & 4) != 0 ? null : naviCommand;
        AccountId accountId2 = (i & 8) != 0 ? AccountId.Personal.f51414a : accountId;
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.f137507t;
        this(checkoutOrder, null, naviCommand2, accountId2, com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var));
    }
}
