package com.revolut.feature.payments.splitbill.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.splitbill.models.splitbilllink.SplitBillQrState;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/splitbill/api/navigation/SplitBillQrInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_payments_splitbill_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SplitBillQrInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SplitBillQrInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SplitBillQrState f79828a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SplitBillQrInputData((SplitBillQrState) parcel.readParcelable(SplitBillQrInputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SplitBillQrInputData[i];
        }
    }

    public SplitBillQrInputData(SplitBillQrState qrState) {
        Intrinsics.checkNotNullParameter(qrState, "qrState");
        this.f79828a = qrState;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof SplitBillQrInputData) && Intrinsics.f(this.f79828a, ((SplitBillQrInputData) obj2).f79828a);
    }

    public final int hashCode() {
        return this.f79828a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f79828a, i);
    }
}
