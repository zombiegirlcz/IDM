package com.revolut.feature.payments.splitbill.impl.ui_new.recurring_split;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qua.p;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/payments/splitbill/impl/ui_new/recurring_split/RecurringSplitFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_payments_splitbill_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RecurringSplitFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RecurringSplitFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f79896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f79897b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RecurringSplitFlowContract$InputData((p) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RecurringSplitFlowContract$InputData[i];
        }
    }

    public RecurringSplitFlowContract$InputData(p recurringPayment, String str) {
        Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
        this.f79896a = recurringPayment;
        this.f79897b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RecurringSplitFlowContract$InputData)) {
            return false;
        }
        RecurringSplitFlowContract$InputData recurringSplitFlowContract$InputData = (RecurringSplitFlowContract$InputData) obj2;
        return Intrinsics.f(this.f79896a, recurringSplitFlowContract$InputData.f79896a) && Intrinsics.f(this.f79897b, recurringSplitFlowContract$InputData.f79897b);
    }

    public final int hashCode() {
        int iHashCode = this.f79896a.hashCode() * 31;
        String str = this.f79897b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f79896a);
        dest.writeString(this.f79897b);
    }
}
