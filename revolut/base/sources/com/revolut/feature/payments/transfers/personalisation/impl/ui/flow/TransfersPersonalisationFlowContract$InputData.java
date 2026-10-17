package com.revolut.feature.payments.transfers.personalisation.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.transfers.personalisation.api.navigation.StyleScreenInput;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t2a.e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/payments/transfers/personalisation/impl/ui/flow/TransfersPersonalisationFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_payments_transfers_personalisation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransfersPersonalisationFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TransfersPersonalisationFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f79961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StyleScreenInput f79962b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransfersPersonalisationFlowContract$InputData(e.valueOf(parcel.readString()), (StyleScreenInput) parcel.readParcelable(TransfersPersonalisationFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransfersPersonalisationFlowContract$InputData[i];
        }
    }

    public TransfersPersonalisationFlowContract$InputData(e selectedTab, StyleScreenInput styleScreenInput) {
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(styleScreenInput, "styleScreenInput");
        this.f79961a = selectedTab;
        this.f79962b = styleScreenInput;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransfersPersonalisationFlowContract$InputData)) {
            return false;
        }
        TransfersPersonalisationFlowContract$InputData transfersPersonalisationFlowContract$InputData = (TransfersPersonalisationFlowContract$InputData) obj2;
        return this.f79961a == transfersPersonalisationFlowContract$InputData.f79961a && Intrinsics.f(this.f79962b, transfersPersonalisationFlowContract$InputData.f79962b);
    }

    public final int hashCode() {
        return this.f79962b.hashCode() + (this.f79961a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f79961a.name());
        dest.writeParcelable(this.f79962b, i);
    }
}
