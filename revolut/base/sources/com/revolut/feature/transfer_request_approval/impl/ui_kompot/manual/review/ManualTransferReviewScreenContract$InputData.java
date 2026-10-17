package com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.review;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferData;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/transfer_request_approval/impl/ui_kompot/manual/review/ManualTransferReviewScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_transfer_request_approval_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ManualTransferReviewScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ManualTransferReviewScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyRequest f92484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ManualTransferData f92485b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ManualTransferReviewScreenContract$InputData((MoneyRequest) parcel.readParcelable(ManualTransferReviewScreenContract$InputData.class.getClassLoader()), parcel.readInt() == 0 ? null : ManualTransferData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ManualTransferReviewScreenContract$InputData[i];
        }
    }

    public ManualTransferReviewScreenContract$InputData(MoneyRequest moneyRequest, ManualTransferData manualTransferData) {
        Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
        this.f92484a = moneyRequest;
        this.f92485b = manualTransferData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ManualTransferReviewScreenContract$InputData)) {
            return false;
        }
        ManualTransferReviewScreenContract$InputData manualTransferReviewScreenContract$InputData = (ManualTransferReviewScreenContract$InputData) obj2;
        return Intrinsics.f(this.f92484a, manualTransferReviewScreenContract$InputData.f92484a) && Intrinsics.f(this.f92485b, manualTransferReviewScreenContract$InputData.f92485b);
    }

    public final int hashCode() {
        int iHashCode = this.f92484a.hashCode() * 31;
        ManualTransferData manualTransferData = this.f92485b;
        return iHashCode + (manualTransferData == null ? 0 : manualTransferData.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f92484a, i);
        ManualTransferData manualTransferData = this.f92485b;
        if (manualTransferData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            manualTransferData.writeToParcel(dest, i);
        }
    }
}
