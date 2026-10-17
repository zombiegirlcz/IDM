package com.revolut.feature.payments.splitbill.impl.ui_new.link_context.qr.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.splitbill.api.navigation.SplitBillQrInputData;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/payments/splitbill/impl/ui_new/link_context/qr/flow/SplitBillQrFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_payments_splitbill_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SplitBillQrFlowContract$InputData implements IOData$Input, Parcelable {

    @NotNull
    public static final Parcelable.Creator<SplitBillQrFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SplitBillQrInputData f79865a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SplitBillQrFlowContract$InputData((SplitBillQrInputData) parcel.readParcelable(SplitBillQrFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SplitBillQrFlowContract$InputData[i];
        }
    }

    public SplitBillQrFlowContract$InputData(SplitBillQrInputData qrInputData) {
        Intrinsics.checkNotNullParameter(qrInputData, "qrInputData");
        this.f79865a = qrInputData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof SplitBillQrFlowContract$InputData) && Intrinsics.f(this.f79865a, ((SplitBillQrFlowContract$InputData) obj2).f79865a);
    }

    public final int hashCode() {
        return this.f79865a.f79828a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f79865a, i);
    }
}
