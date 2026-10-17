package com.revolut.feature.apm.multibanco.impl.ui.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.multibanco.MultibancoRegistrationStatus;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/apm/multibanco/impl/ui/pay/MultibancoPayFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MultibancoPayFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<MultibancoPayFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferMoneyPocket f62610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MultibancoRegistrationStatus.Registered f62611b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MultibancoPayFlowContract$InputData((TransferMoneyPocket) parcel.readParcelable(MultibancoPayFlowContract$InputData.class.getClassLoader()), (MultibancoRegistrationStatus.Registered) parcel.readParcelable(MultibancoPayFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MultibancoPayFlowContract$InputData[i];
        }
    }

    public MultibancoPayFlowContract$InputData(TransferMoneyPocket fundingSource, MultibancoRegistrationStatus.Registered status) {
        Intrinsics.checkNotNullParameter(fundingSource, "fundingSource");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f62610a = fundingSource;
        this.f62611b = status;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MultibancoPayFlowContract$InputData)) {
            return false;
        }
        MultibancoPayFlowContract$InputData multibancoPayFlowContract$InputData = (MultibancoPayFlowContract$InputData) obj2;
        return Intrinsics.f(this.f62610a, multibancoPayFlowContract$InputData.f62610a) && Intrinsics.f(this.f62611b, multibancoPayFlowContract$InputData.f62611b);
    }

    public final int hashCode() {
        return this.f62611b.hashCode() + (this.f62610a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f62610a, i);
        dest.writeParcelable(this.f62611b, i);
    }
}
