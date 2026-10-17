package com.revolut.retail.feature.esim.impl.ui.screens.refund_summary;

import android.os.Parcel;
import android.os.Parcelable;
import cli.j;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionRefundProration;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/refund_summary/EsimDataPlanRefundSummaryBottomSheetScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Lcli/j;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimDataPlanRefundSummaryBottomSheetScreenContract$InputData implements IOData$Input, j {

    @NotNull
    public static final Parcelable.Creator<EsimDataPlanRefundSummaryBottomSheetScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimSubscriptionRefundProration f101414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f101415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f101416c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimDataPlanRefundSummaryBottomSheetScreenContract$InputData((EsimSubscriptionRefundProration) parcel.readParcelable(EsimDataPlanRefundSummaryBottomSheetScreenContract$InputData.class.getClassLoader()), (d) parcel.readSerializable(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimDataPlanRefundSummaryBottomSheetScreenContract$InputData[i];
        }
    }

    public EsimDataPlanRefundSummaryBottomSheetScreenContract$InputData(EsimSubscriptionRefundProration esimSubscriptionRefundProration, d refundAmount, double d) {
        Intrinsics.checkNotNullParameter(refundAmount, "refundAmount");
        this.f101414a = esimSubscriptionRefundProration;
        this.f101415b = refundAmount;
        this.f101416c = d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimDataPlanRefundSummaryBottomSheetScreenContract$InputData)) {
            return false;
        }
        EsimDataPlanRefundSummaryBottomSheetScreenContract$InputData esimDataPlanRefundSummaryBottomSheetScreenContract$InputData = (EsimDataPlanRefundSummaryBottomSheetScreenContract$InputData) obj2;
        return Intrinsics.f(this.f101414a, esimDataPlanRefundSummaryBottomSheetScreenContract$InputData.f101414a) && Intrinsics.f(this.f101415b, esimDataPlanRefundSummaryBottomSheetScreenContract$InputData.f101415b) && Double.compare(this.f101416c, esimDataPlanRefundSummaryBottomSheetScreenContract$InputData.f101416c) == 0;
    }

    public final int hashCode() {
        EsimSubscriptionRefundProration esimSubscriptionRefundProration = this.f101414a;
        return Double.hashCode(this.f101416c) + v7.c((esimSubscriptionRefundProration == null ? 0 : esimSubscriptionRefundProration.hashCode()) * 31, 31, this.f101415b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f101414a, i);
        dest.writeSerializable(this.f101415b);
        dest.writeDouble(this.f101416c);
    }
}
