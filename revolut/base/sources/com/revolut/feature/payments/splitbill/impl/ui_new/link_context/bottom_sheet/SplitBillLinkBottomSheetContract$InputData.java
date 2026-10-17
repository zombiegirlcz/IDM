package com.revolut.feature.payments.splitbill.impl.ui_new.link_context.bottom_sheet;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/payments/splitbill/impl/ui_new/link_context/bottom_sheet/SplitBillLinkBottomSheetContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_payments_splitbill_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SplitBillLinkBottomSheetContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SplitBillLinkBottomSheetContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f79863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f79864b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SplitBillLinkBottomSheetContract$InputData((d) parcel.readSerializable(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SplitBillLinkBottomSheetContract$InputData[i];
        }
    }

    public SplitBillLinkBottomSheetContract$InputData(d billAmount, Integer num) {
        Intrinsics.checkNotNullParameter(billAmount, "billAmount");
        this.f79863a = billAmount;
        this.f79864b = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SplitBillLinkBottomSheetContract$InputData)) {
            return false;
        }
        SplitBillLinkBottomSheetContract$InputData splitBillLinkBottomSheetContract$InputData = (SplitBillLinkBottomSheetContract$InputData) obj2;
        return Intrinsics.f(this.f79863a, splitBillLinkBottomSheetContract$InputData.f79863a) && Intrinsics.f(this.f79864b, splitBillLinkBottomSheetContract$InputData.f79864b);
    }

    public final int hashCode() {
        int iHashCode = this.f79863a.hashCode() * 31;
        Integer num = this.f79864b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f79863a);
        Integer num = this.f79864b;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
    }
}
