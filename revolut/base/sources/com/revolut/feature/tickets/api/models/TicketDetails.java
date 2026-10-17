package com.revolut.feature.tickets.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.be_driven_design.models.domain.FincrimeHomeScreen$V2;
import com.revolut.feature.be_driven_design.models.domain.FincrimeHomeScreenSection;
import com.revolut.feature.be_driven_design.models.domain.SectionContent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tickets/api/models/TicketDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_tickets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TicketDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TicketDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f90447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FincrimeHomeScreen$V2 f90448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SectionContent.ProgressionSteps f90449c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TicketDetails(parcel.readString(), (FincrimeHomeScreen$V2) parcel.readParcelable(TicketDetails.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TicketDetails[i];
        }
    }

    public TicketDetails(String ticketId, FincrimeHomeScreen$V2 details) {
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        Intrinsics.checkNotNullParameter(details, "details");
        this.f90447a = ticketId;
        this.f90448b = details;
        details.getClass();
        List list = details.e;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((FincrimeHomeScreenSection) it8.next()).f64157c);
        }
        ArrayList arrayListU = w.u(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayListU) {
            if (obj2 instanceof SectionContent.ProgressionSteps) {
                arrayList2.add(obj2);
            }
        }
        this.f90449c = (SectionContent.ProgressionSteps) d0.d0(arrayList2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TicketDetails)) {
            return false;
        }
        TicketDetails ticketDetails = (TicketDetails) obj2;
        return Intrinsics.f(this.f90447a, ticketDetails.f90447a) && Intrinsics.f(this.f90448b, ticketDetails.f90448b);
    }

    public final int hashCode() {
        return this.f90448b.hashCode() + (this.f90447a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f90447a);
        dest.writeParcelable(this.f90448b, i);
    }
}
