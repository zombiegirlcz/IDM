package com.revolut.feature.apm.bills.bpay.impl.screen.review.review;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.bills.bpay.impl.flow.configuration.ScreenConfiguration;
import com.revolut.feature.apm.bills.bpay.impl.model.BPayPaymentData;
import com.revolut.feature.apm.bills.bpay.impl.model.BPayPocketData;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qua.p;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/apm/bills/bpay/impl/screen/review/review/BPayReviewScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_bpay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BPayReviewScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BPayReviewScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BPayPaymentData f61233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f61234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransferScheduleData f61235c;
    public final p d;
    public final ScreenConfiguration e;
    public final BPayPocketData f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ApmQuote f61236g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BPayReviewScreenContract$InputData(BPayPaymentData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (TransferScheduleData) parcel.readParcelable(BPayReviewScreenContract$InputData.class.getClassLoader()), (p) parcel.readSerializable(), ScreenConfiguration.CREATOR.createFromParcel(parcel), BPayPocketData.CREATOR.createFromParcel(parcel), (ApmQuote) parcel.readParcelable(BPayReviewScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BPayReviewScreenContract$InputData[i];
        }
    }

    public BPayReviewScreenContract$InputData(BPayPaymentData paymentData, boolean z, TransferScheduleData scheduleData, p pVar, ScreenConfiguration screenConfiguration, BPayPocketData pocketData, ApmQuote apmQuote) {
        Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
        Intrinsics.checkNotNullParameter(screenConfiguration, "screenConfiguration");
        Intrinsics.checkNotNullParameter(pocketData, "pocketData");
        this.f61233a = paymentData;
        this.f61234b = z;
        this.f61235c = scheduleData;
        this.d = pVar;
        this.e = screenConfiguration;
        this.f = pocketData;
        this.f61236g = apmQuote;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BPayReviewScreenContract$InputData)) {
            return false;
        }
        BPayReviewScreenContract$InputData bPayReviewScreenContract$InputData = (BPayReviewScreenContract$InputData) obj2;
        return Intrinsics.f(this.f61233a, bPayReviewScreenContract$InputData.f61233a) && this.f61234b == bPayReviewScreenContract$InputData.f61234b && Intrinsics.f(this.f61235c, bPayReviewScreenContract$InputData.f61235c) && Intrinsics.f(this.d, bPayReviewScreenContract$InputData.d) && Intrinsics.f(this.e, bPayReviewScreenContract$InputData.e) && Intrinsics.f(this.f, bPayReviewScreenContract$InputData.f) && Intrinsics.f(this.f61236g, bPayReviewScreenContract$InputData.f61236g);
    }

    public final int hashCode() {
        int iF = l.f(this.f61235c, j6.a.c(this.f61233a.hashCode() * 31, 31, this.f61234b), 31);
        p pVar = this.d;
        int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + ((iF + (pVar == null ? 0 : pVar.hashCode())) * 31)) * 31)) * 31;
        ApmQuote apmQuote = this.f61236g;
        return iHashCode + (apmQuote != null ? apmQuote.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f61233a.writeToParcel(dest, i);
        dest.writeInt(this.f61234b ? 1 : 0);
        dest.writeParcelable(this.f61235c, i);
        dest.writeSerializable(this.d);
        this.e.writeToParcel(dest, i);
        this.f.writeToParcel(dest, i);
        dest.writeParcelable(this.f61236g, i);
    }
}
