package com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/freelancer/impl/ui/invoice/screen/payment_schedule/InvoicePaymentScheduleScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvoicePaymentScheduleScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<InvoicePaymentScheduleScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f73900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InvoicePaymentSchedule f73901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InvoicePaymentScheduleScreenContract$ScheduleTab f73902c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InvoicePaymentScheduleScreenContract$InputData(parcel.readString(), InvoicePaymentSchedule.CREATOR.createFromParcel(parcel), (InvoicePaymentScheduleScreenContract$ScheduleTab) parcel.readParcelable(InvoicePaymentScheduleScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvoicePaymentScheduleScreenContract$InputData[i];
        }
    }

    public InvoicePaymentScheduleScreenContract$InputData(String invoiceId, InvoicePaymentSchedule invoiceSchedule, InvoicePaymentScheduleScreenContract$ScheduleTab selectedTab) {
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        Intrinsics.checkNotNullParameter(invoiceSchedule, "invoiceSchedule");
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        this.f73900a = invoiceId;
        this.f73901b = invoiceSchedule;
        this.f73902c = selectedTab;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InvoicePaymentScheduleScreenContract$InputData)) {
            return false;
        }
        InvoicePaymentScheduleScreenContract$InputData invoicePaymentScheduleScreenContract$InputData = (InvoicePaymentScheduleScreenContract$InputData) obj2;
        return Intrinsics.f(this.f73900a, invoicePaymentScheduleScreenContract$InputData.f73900a) && Intrinsics.f(this.f73901b, invoicePaymentScheduleScreenContract$InputData.f73901b) && Intrinsics.f(this.f73902c, invoicePaymentScheduleScreenContract$InputData.f73902c);
    }

    public final int hashCode() {
        return this.f73902c.hashCode() + ((this.f73901b.hashCode() + (this.f73900a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f73900a);
        this.f73901b.writeToParcel(dest, i);
        dest.writeParcelable(this.f73902c, i);
    }
}
