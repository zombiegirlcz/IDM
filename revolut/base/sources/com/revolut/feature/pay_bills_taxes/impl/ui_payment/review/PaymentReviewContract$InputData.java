package com.revolut.feature.pay_bills_taxes.impl.ui_payment.review;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.apm.bills.core.api.model.search.service_provider.ServiceProvider;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers.TransferReviewInfo;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers.models.PaymentData;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xo1.g;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/pay_bills_taxes/impl/ui_payment/review/PaymentReviewContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentReviewContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PaymentReviewContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f78796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PaymentData f78797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransferReviewInfo f78798c;
    public final Clause d;
    public final ServiceProvider e;
    public final TransferScheduleData f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentReviewContract$InputData(g.valueOf(parcel.readString()), PaymentData.CREATOR.createFromParcel(parcel), TransferReviewInfo.CREATOR.createFromParcel(parcel), (Clause) parcel.readParcelable(PaymentReviewContract$InputData.class.getClassLoader()), (ServiceProvider) parcel.readParcelable(PaymentReviewContract$InputData.class.getClassLoader()), (TransferScheduleData) parcel.readParcelable(PaymentReviewContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PaymentReviewContract$InputData[i];
        }
    }

    public PaymentReviewContract$InputData(g paymentMethod, PaymentData paymentData, TransferReviewInfo reviewInfo, Clause descriptor, ServiceProvider serviceProvider, TransferScheduleData scheduleData) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        Intrinsics.checkNotNullParameter(reviewInfo, "reviewInfo");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
        this.f78796a = paymentMethod;
        this.f78797b = paymentData;
        this.f78798c = reviewInfo;
        this.d = descriptor;
        this.e = serviceProvider;
        this.f = scheduleData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PaymentReviewContract$InputData)) {
            return false;
        }
        PaymentReviewContract$InputData paymentReviewContract$InputData = (PaymentReviewContract$InputData) obj2;
        return this.f78796a == paymentReviewContract$InputData.f78796a && Intrinsics.f(this.f78797b, paymentReviewContract$InputData.f78797b) && Intrinsics.f(this.f78798c, paymentReviewContract$InputData.f78798c) && Intrinsics.f(this.d, paymentReviewContract$InputData.d) && Intrinsics.f(this.e, paymentReviewContract$InputData.e) && Intrinsics.f(this.f, paymentReviewContract$InputData.f);
    }

    public final int hashCode() {
        int iA = p.a.a((this.f78798c.hashCode() + ((this.f78797b.hashCode() + (this.f78796a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        ServiceProvider serviceProvider = this.e;
        return this.f.hashCode() + ((iA + (serviceProvider == null ? 0 : serviceProvider.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f78796a.name());
        this.f78797b.writeToParcel(dest, i);
        this.f78798c.writeToParcel(dest, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
    }
}
