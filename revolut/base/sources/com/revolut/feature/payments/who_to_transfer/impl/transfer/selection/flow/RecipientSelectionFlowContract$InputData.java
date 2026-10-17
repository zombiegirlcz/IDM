package com.revolut.feature.payments.who_to_transfer.impl.transfer.selection.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.who_to_transfer.api.navigation.RecipientSelectionInputData;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/payments/who_to_transfer/impl/transfer/selection/flow/RecipientSelectionFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RecipientSelectionFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RecipientSelectionFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f80142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecipientSelectionInputData f80143b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RecipientSelectionFlowContract$InputData(parcel.readString(), (RecipientSelectionInputData) parcel.readParcelable(RecipientSelectionFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RecipientSelectionFlowContract$InputData[i];
        }
    }

    public RecipientSelectionFlowContract$InputData(String requestId, RecipientSelectionInputData screenInputData) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(screenInputData, "screenInputData");
        this.f80142a = requestId;
        this.f80143b = screenInputData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RecipientSelectionFlowContract$InputData)) {
            return false;
        }
        RecipientSelectionFlowContract$InputData recipientSelectionFlowContract$InputData = (RecipientSelectionFlowContract$InputData) obj2;
        return Intrinsics.f(this.f80142a, recipientSelectionFlowContract$InputData.f80142a) && Intrinsics.f(this.f80143b, recipientSelectionFlowContract$InputData.f80143b);
    }

    public final int hashCode() {
        return this.f80143b.hashCode() + (this.f80142a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f80142a);
        dest.writeParcelable(this.f80143b, i);
    }
}
