package com.revolut.navigation.destination;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.checkout.models.CheckoutConfig;
import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.feature.topup_screen.common.TopUpTarget;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/navigation/destination/CheckoutDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CheckoutDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<CheckoutDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckoutParams f98460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CheckoutConfig f98461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TopUpTarget f98462c;
    public final NaviCommand d;
    public final AnalyticsProduct e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CheckoutDestination((CheckoutParams) parcel.readParcelable(CheckoutDestination.class.getClassLoader()), (CheckoutConfig) parcel.readParcelable(CheckoutDestination.class.getClassLoader()), (TopUpTarget) parcel.readParcelable(CheckoutDestination.class.getClassLoader()), (NaviCommand) parcel.readParcelable(CheckoutDestination.class.getClassLoader()), (AnalyticsProduct) parcel.readParcelable(CheckoutDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CheckoutDestination[i];
        }
    }

    public CheckoutDestination(CheckoutParams checkoutParams, CheckoutConfig config, TopUpTarget topUpTarget, NaviCommand naviCommand, AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(topUpTarget, "topUpTarget");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f98460a = checkoutParams;
        this.f98461b = config;
        this.f98462c = topUpTarget;
        this.d = naviCommand;
        this.e = analyticsProduct;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CheckoutDestination)) {
            return false;
        }
        CheckoutDestination checkoutDestination = (CheckoutDestination) obj2;
        return Intrinsics.f(this.f98460a, checkoutDestination.f98460a) && Intrinsics.f(this.f98461b, checkoutDestination.f98461b) && Intrinsics.f(this.f98462c, checkoutDestination.f98462c) && Intrinsics.f(this.d, checkoutDestination.d) && Intrinsics.f(this.e, checkoutDestination.e);
    }

    public final int hashCode() {
        CheckoutParams checkoutParams = this.f98460a;
        int iHashCode = (this.f98462c.hashCode() + ((this.f98461b.hashCode() + ((checkoutParams == null ? 0 : checkoutParams.hashCode()) * 31)) * 31)) * 31;
        NaviCommand naviCommand = this.d;
        return this.e.hashCode() + ((iHashCode + (naviCommand != null ? naviCommand.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f98460a, i);
        dest.writeParcelable(this.f98461b, i);
        dest.writeParcelable(this.f98462c, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
    }
}
