package com.revolut.feature.tickets.api.extensions;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.model.Data;
import com.revolut.feature.feedback.api.domain.Feedback;
import com.revolut.feature.tickets.api.models.TicketDetails;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/tickets/api/extensions/TicketsWidgetContract$State", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_tickets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TicketsWidgetContract$State implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TicketsWidgetContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f90444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f90445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Feedback f90446c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readString(), new Data((TicketDetails) j6.a.f(parcel, "parcel", TicketDetails.class), null, parcel.readInt() == 1, 2, null));
            }
            return new TicketsWidgetContract$State(linkedHashMap, parcel.readString(), (Feedback) parcel.readParcelable(TicketsWidgetContract$State.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TicketsWidgetContract$State[i];
        }
    }

    public TicketsWidgetContract$State(Map activeDetailedTickets, String str, Feedback feedback) {
        Intrinsics.checkNotNullParameter(activeDetailedTickets, "activeDetailedTickets");
        this.f90444a = activeDetailedTickets;
        this.f90445b = str;
        this.f90446c = feedback;
    }

    public static TicketsWidgetContract$State a(TicketsWidgetContract$State ticketsWidgetContract$State, LinkedHashMap linkedHashMap, String str, Feedback feedback, int i) {
        Map activeDetailedTickets = linkedHashMap;
        if ((i & 1) != 0) {
            activeDetailedTickets = ticketsWidgetContract$State.f90444a;
        }
        if ((i & 2) != 0) {
            str = ticketsWidgetContract$State.f90445b;
        }
        if ((i & 4) != 0) {
            feedback = ticketsWidgetContract$State.f90446c;
        }
        Intrinsics.checkNotNullParameter(activeDetailedTickets, "activeDetailedTickets");
        return new TicketsWidgetContract$State(activeDetailedTickets, str, feedback);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TicketsWidgetContract$State)) {
            return false;
        }
        TicketsWidgetContract$State ticketsWidgetContract$State = (TicketsWidgetContract$State) obj2;
        return Intrinsics.f(this.f90444a, ticketsWidgetContract$State.f90444a) && Intrinsics.f(this.f90445b, ticketsWidgetContract$State.f90445b) && Intrinsics.f(this.f90446c, ticketsWidgetContract$State.f90446c);
    }

    public final int hashCode() {
        int iHashCode = this.f90444a.hashCode() * 31;
        String str = this.f90445b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Feedback feedback = this.f90446c;
        return iHashCode2 + (feedback != null ? feedback.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Iterator itZ = j6.a.z(this.f90444a, parcel);
        while (itZ.hasNext()) {
            Map.Entry entry = (Map.Entry) itZ.next();
            parcel.writeString((String) entry.getKey());
            Data data = (Data) entry.getValue();
            Intrinsics.checkNotNullParameter(data, "<this>");
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.writeParcelable((Parcelable) data.getContent(), i);
            parcel.writeInt(data.getLoading() ? 1 : 0);
        }
        parcel.writeString(this.f90445b);
        parcel.writeParcelable(this.f90446c, i);
    }
}
