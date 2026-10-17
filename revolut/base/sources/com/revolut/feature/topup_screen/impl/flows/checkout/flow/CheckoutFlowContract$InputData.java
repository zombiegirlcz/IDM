package com.revolut.feature.topup_screen.impl.flows.checkout.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.checkout.models.CheckoutConfig;
import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.feature.topup_screen.common.TopUpTarget;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/topup_screen/impl/flows/checkout/flow/CheckoutFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CheckoutFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CheckoutFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckoutParams f90668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CheckoutConfig f90669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TopUpTarget f90670c;
    public final NaviCommand d;
    public final AnalyticsProduct e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CheckoutFlowContract$InputData((CheckoutParams) parcel.readParcelable(CheckoutFlowContract$InputData.class.getClassLoader()), (CheckoutConfig) parcel.readParcelable(CheckoutFlowContract$InputData.class.getClassLoader()), (TopUpTarget) parcel.readParcelable(CheckoutFlowContract$InputData.class.getClassLoader()), (NaviCommand) parcel.readParcelable(CheckoutFlowContract$InputData.class.getClassLoader()), (AnalyticsProduct) parcel.readParcelable(CheckoutFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CheckoutFlowContract$InputData[i];
        }
    }

    public CheckoutFlowContract$InputData(CheckoutParams checkoutParams, CheckoutConfig config, TopUpTarget topUpTarget, NaviCommand naviCommand, AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(topUpTarget, "topUpTarget");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f90668a = checkoutParams;
        this.f90669b = config;
        this.f90670c = topUpTarget;
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
        if (!(obj2 instanceof CheckoutFlowContract$InputData)) {
            return false;
        }
        CheckoutFlowContract$InputData checkoutFlowContract$InputData = (CheckoutFlowContract$InputData) obj2;
        return Intrinsics.f(this.f90668a, checkoutFlowContract$InputData.f90668a) && Intrinsics.f(this.f90669b, checkoutFlowContract$InputData.f90669b) && Intrinsics.f(this.f90670c, checkoutFlowContract$InputData.f90670c) && Intrinsics.f(this.d, checkoutFlowContract$InputData.d) && Intrinsics.f(this.e, checkoutFlowContract$InputData.e);
    }

    public final int hashCode() {
        CheckoutParams checkoutParams = this.f90668a;
        int iHashCode = (this.f90670c.hashCode() + ((this.f90669b.hashCode() + ((checkoutParams == null ? 0 : checkoutParams.hashCode()) * 31)) * 31)) * 31;
        NaviCommand naviCommand = this.d;
        return this.e.hashCode() + ((iHashCode + (naviCommand != null ? naviCommand.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f90668a, i);
        dest.writeParcelable(this.f90669b, i);
        dest.writeParcelable(this.f90670c, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
    }
}
