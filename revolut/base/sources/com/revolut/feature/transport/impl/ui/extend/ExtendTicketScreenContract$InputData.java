package com.revolut.feature.transport.impl.ui.extend;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.transport.models.transit.PurchasedTransitTicket;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/transport/impl/ui/extend/ExtendTicketScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_transport_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExtendTicketScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ExtendTicketScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PurchasedTransitTicket.Activated f92517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f92518b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            PurchasedTransitTicket.Activated activated = (PurchasedTransitTicket.Activated) j6.a.f(parcel, "parcel", ExtendTicketScreenContract$InputData.class);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(ExtendTicketScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new ExtendTicketScreenContract$InputData(activated, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExtendTicketScreenContract$InputData[i];
        }
    }

    public ExtendTicketScreenContract$InputData(PurchasedTransitTicket.Activated ticket, List ticketsForExtension) {
        Intrinsics.checkNotNullParameter(ticket, "ticket");
        Intrinsics.checkNotNullParameter(ticketsForExtension, "ticketsForExtension");
        this.f92517a = ticket;
        this.f92518b = ticketsForExtension;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ExtendTicketScreenContract$InputData)) {
            return false;
        }
        ExtendTicketScreenContract$InputData extendTicketScreenContract$InputData = (ExtendTicketScreenContract$InputData) obj2;
        return Intrinsics.f(this.f92517a, extendTicketScreenContract$InputData.f92517a) && Intrinsics.f(this.f92518b, extendTicketScreenContract$InputData.f92518b);
    }

    public final int hashCode() {
        return this.f92518b.hashCode() + (this.f92517a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f92517a, i);
        Iterator itV = p.a.v(this.f92518b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }
}
