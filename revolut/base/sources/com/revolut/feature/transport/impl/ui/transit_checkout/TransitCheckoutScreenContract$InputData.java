package com.revolut.feature.transport.impl.ui.transit_checkout;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.transport.models.transit.TransitTicket;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/transport/impl/ui/transit_checkout/TransitCheckoutScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_transport_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransitCheckoutScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TransitCheckoutScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransitTicket f92566a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransitCheckoutScreenContract$InputData((TransitTicket) parcel.readParcelable(TransitCheckoutScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransitCheckoutScreenContract$InputData[i];
        }
    }

    public TransitCheckoutScreenContract$InputData(TransitTicket transitTicket) {
        Intrinsics.checkNotNullParameter(transitTicket, "transitTicket");
        this.f92566a = transitTicket;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof TransitCheckoutScreenContract$InputData) && Intrinsics.f(this.f92566a, ((TransitCheckoutScreenContract$InputData) obj2).f92566a);
    }

    public final int hashCode() {
        return this.f92566a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f92566a, i);
    }
}
