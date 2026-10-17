package com.revolut.feature.support.impl.transfer_tracker.ui.inbound_swift_transfer_status;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.support.impl.transfer_tracker.domain.model.TransferArrivalRequest;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq2.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/support/impl/transfer_tracker/ui/inbound_swift_transfer_status/InboundSwiftTransferStatusScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_support_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InboundSwiftTransferStatusScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<InboundSwiftTransferStatusScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f89406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferArrivalRequest f89407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f89408c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InboundSwiftTransferStatusScreenContract$InputData(parcel.readString(), TransferArrivalRequest.CREATOR.createFromParcel(parcel), l.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InboundSwiftTransferStatusScreenContract$InputData[i];
        }
    }

    public InboundSwiftTransferStatusScreenContract$InputData(String uetr, TransferArrivalRequest request, l transferType) {
        Intrinsics.checkNotNullParameter(uetr, "uetr");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(transferType, "transferType");
        this.f89406a = uetr;
        this.f89407b = request;
        this.f89408c = transferType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InboundSwiftTransferStatusScreenContract$InputData)) {
            return false;
        }
        InboundSwiftTransferStatusScreenContract$InputData inboundSwiftTransferStatusScreenContract$InputData = (InboundSwiftTransferStatusScreenContract$InputData) obj2;
        return Intrinsics.f(this.f89406a, inboundSwiftTransferStatusScreenContract$InputData.f89406a) && Intrinsics.f(this.f89407b, inboundSwiftTransferStatusScreenContract$InputData.f89407b) && this.f89408c == inboundSwiftTransferStatusScreenContract$InputData.f89408c;
    }

    public final int hashCode() {
        return this.f89408c.hashCode() + ((this.f89407b.hashCode() + (this.f89406a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f89406a);
        this.f89407b.writeToParcel(dest, i);
        dest.writeString(this.f89408c.name());
    }
}
