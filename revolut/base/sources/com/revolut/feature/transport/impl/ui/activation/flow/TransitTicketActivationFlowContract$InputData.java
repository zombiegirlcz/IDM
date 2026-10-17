package com.revolut.feature.transport.impl.ui.activation.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.transport.models.transit.PurchasedTransitTicket;
import com.revolut.feature.transport.models.transit.TransitTicketActivationConfig;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/transport/impl/ui/activation/flow/TransitTicketActivationFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_transport_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransitTicketActivationFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TransitTicketActivationFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PurchasedTransitTicket.ToBeActivated f92509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransitTicketActivationConfig f92510b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransitTicketActivationFlowContract$InputData((PurchasedTransitTicket.ToBeActivated) parcel.readParcelable(TransitTicketActivationFlowContract$InputData.class.getClassLoader()), (TransitTicketActivationConfig) parcel.readParcelable(TransitTicketActivationFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransitTicketActivationFlowContract$InputData[i];
        }
    }

    public TransitTicketActivationFlowContract$InputData(PurchasedTransitTicket.ToBeActivated ticket, TransitTicketActivationConfig transitTicketActivationConfig) {
        Intrinsics.checkNotNullParameter(ticket, "ticket");
        this.f92509a = ticket;
        this.f92510b = transitTicketActivationConfig;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransitTicketActivationFlowContract$InputData)) {
            return false;
        }
        TransitTicketActivationFlowContract$InputData transitTicketActivationFlowContract$InputData = (TransitTicketActivationFlowContract$InputData) obj2;
        return Intrinsics.f(this.f92509a, transitTicketActivationFlowContract$InputData.f92509a) && Intrinsics.f(this.f92510b, transitTicketActivationFlowContract$InputData.f92510b);
    }

    public final int hashCode() {
        int iHashCode = this.f92509a.hashCode() * 31;
        TransitTicketActivationConfig transitTicketActivationConfig = this.f92510b;
        return iHashCode + (transitTicketActivationConfig == null ? 0 : transitTicketActivationConfig.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f92509a, i);
        dest.writeParcelable(this.f92510b, i);
    }
}
