package com.revolut.feature.transport.impl.ui.hub.ticket_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.transport.models.transit.PurchasedTransitTicket;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/transport/impl/ui/hub/ticket_details/TicketDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "TicketDetails", "TicketId", "Lcom/revolut/feature/transport/impl/ui/hub/ticket_details/TicketDetailsScreenContract$InputData$TicketDetails;", "Lcom/revolut/feature/transport/impl/ui/hub/ticket_details/TicketDetailsScreenContract$InputData$TicketId;", "feature_transport_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TicketDetailsScreenContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transport/impl/ui/hub/ticket_details/TicketDetailsScreenContract$InputData$TicketDetails;", "Lcom/revolut/feature/transport/impl/ui/hub/ticket_details/TicketDetailsScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_transport_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TicketDetails implements TicketDetailsScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<TicketDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PurchasedTransitTicket f92528a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TicketDetails((PurchasedTransitTicket) parcel.readParcelable(TicketDetails.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TicketDetails[i];
            }
        }

        public TicketDetails(PurchasedTransitTicket ticket) {
            Intrinsics.checkNotNullParameter(ticket, "ticket");
            this.f92528a = ticket;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TicketDetails) && Intrinsics.f(this.f92528a, ((TicketDetails) obj2).f92528a);
        }

        public final int hashCode() {
            return this.f92528a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f92528a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transport/impl/ui/hub/ticket_details/TicketDetailsScreenContract$InputData$TicketId;", "Lcom/revolut/feature/transport/impl/ui/hub/ticket_details/TicketDetailsScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_transport_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TicketId implements TicketDetailsScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<TicketId> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f92529a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TicketId(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TicketId[i];
            }
        }

        public TicketId(String ticketId) {
            Intrinsics.checkNotNullParameter(ticketId, "ticketId");
            this.f92529a = ticketId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TicketId) && Intrinsics.f(this.f92529a, ((TicketId) obj2).f92529a);
        }

        public final int hashCode() {
            return this.f92529a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f92529a);
        }
    }
}
