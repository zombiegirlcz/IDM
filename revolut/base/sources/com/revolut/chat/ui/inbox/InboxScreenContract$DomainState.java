package com.revolut.chat.ui.inbox;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.model.Data;
import com.revolut.feature.in_app_calls.InAppCallStateWithData;
import com.revolut.feature.tickets.api.extensions.TicketsWidgetContract$State;
import com.revolut.kompot.navigable.vc.ui.States$PersistentDomain;
import java.util.LinkedHashMap;
import java.util.Map;
import kii.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/revolut/chat/ui/inbox/InboxScreenContract$DomainState", "Lcom/revolut/kompot/navigable/vc/ui/States$PersistentDomain;", "", "toString", "()Ljava/lang/String;", "Companion", "b", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InboxScreenContract$DomainState implements States$PersistentDomain {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f51167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f51168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f51169c;
    public final InAppCallStateWithData d;
    public final Data e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f51170g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f51171h;
    public final Data i;

    @NotNull
    public static final Parcelable.Creator<InboxScreenContract$DomainState> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            TicketsWidgetContract$State ticketsWidgetContract$State = (TicketsWidgetContract$State) j6.a.f(parcel, "source", TicketsWidgetContract$State.class);
            return new InboxScreenContract$DomainState(ticketsWidgetContract$State != null ? new Data(ticketsWidgetContract$State, null, true, 2, null) : new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null, new Data(null, null, true, 3, null), false, false, new Data(null, null, true, 3, null), new Data(f0.f322471a, null, false, 6, null));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InboxScreenContract$DomainState[i];
        }
    }

    public InboxScreenContract$DomainState(Data ticketsWidgetState, Data feeds, Data pricingPlan, InAppCallStateWithData inAppCallStateWithData, Data newsfeedItems, boolean z, boolean z3, Data disclaimerItems, Data extensionItems) {
        Intrinsics.checkNotNullParameter(ticketsWidgetState, "ticketsWidgetState");
        Intrinsics.checkNotNullParameter(feeds, "feeds");
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        Intrinsics.checkNotNullParameter(newsfeedItems, "newsfeedItems");
        Intrinsics.checkNotNullParameter(disclaimerItems, "disclaimerItems");
        Intrinsics.checkNotNullParameter(extensionItems, "extensionItems");
        this.f51167a = ticketsWidgetState;
        this.f51168b = feeds;
        this.f51169c = pricingPlan;
        this.d = inAppCallStateWithData;
        this.e = newsfeedItems;
        this.f = z;
        this.f51170g = z3;
        this.f51171h = disclaimerItems;
        this.i = extensionItems;
    }

    public static InboxScreenContract$DomainState a(InboxScreenContract$DomainState inboxScreenContract$DomainState, Data data, Data data2, Data data3, InAppCallStateWithData inAppCallStateWithData, Data data4, boolean z, boolean z3, Data data5, Data data6, int i) {
        if ((i & 1) != 0) {
            data = inboxScreenContract$DomainState.f51167a;
        }
        Data ticketsWidgetState = data;
        if ((i & 2) != 0) {
            data2 = inboxScreenContract$DomainState.f51168b;
        }
        Data feeds = data2;
        if ((i & 4) != 0) {
            data3 = inboxScreenContract$DomainState.f51169c;
        }
        Data pricingPlan = data3;
        if ((i & 8) != 0) {
            inAppCallStateWithData = inboxScreenContract$DomainState.d;
        }
        InAppCallStateWithData inAppCallStateWithData2 = inAppCallStateWithData;
        if ((i & 16) != 0) {
            data4 = inboxScreenContract$DomainState.e;
        }
        Data newsfeedItems = data4;
        boolean z4 = (i & 32) != 0 ? inboxScreenContract$DomainState.f : z;
        boolean z6 = (i & 64) != 0 ? inboxScreenContract$DomainState.f51170g : z3;
        Data disclaimerItems = (i & 128) != 0 ? inboxScreenContract$DomainState.f51171h : data5;
        Data extensionItems = (i & 256) != 0 ? inboxScreenContract$DomainState.i : data6;
        inboxScreenContract$DomainState.getClass();
        Intrinsics.checkNotNullParameter(ticketsWidgetState, "ticketsWidgetState");
        Intrinsics.checkNotNullParameter(feeds, "feeds");
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        Intrinsics.checkNotNullParameter(newsfeedItems, "newsfeedItems");
        Intrinsics.checkNotNullParameter(disclaimerItems, "disclaimerItems");
        Intrinsics.checkNotNullParameter(extensionItems, "extensionItems");
        return new InboxScreenContract$DomainState(ticketsWidgetState, feeds, pricingPlan, inAppCallStateWithData2, newsfeedItems, z4, z6, disclaimerItems, extensionItems);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InboxScreenContract$DomainState)) {
            return false;
        }
        InboxScreenContract$DomainState inboxScreenContract$DomainState = (InboxScreenContract$DomainState) obj2;
        return Intrinsics.f(this.f51167a, inboxScreenContract$DomainState.f51167a) && Intrinsics.f(this.f51168b, inboxScreenContract$DomainState.f51168b) && Intrinsics.f(this.f51169c, inboxScreenContract$DomainState.f51169c) && Intrinsics.f(this.d, inboxScreenContract$DomainState.d) && Intrinsics.f(this.e, inboxScreenContract$DomainState.e) && this.f == inboxScreenContract$DomainState.f && this.f51170g == inboxScreenContract$DomainState.f51170g && Intrinsics.f(this.f51171h, inboxScreenContract$DomainState.f51171h) && Intrinsics.f(this.i, inboxScreenContract$DomainState.i);
    }

    public final int hashCode() {
        int iC = e.c(this.f51169c, e.c(this.f51168b, this.f51167a.hashCode() * 31, 31), 31);
        InAppCallStateWithData inAppCallStateWithData = this.d;
        return this.i.hashCode() + e.c(this.f51171h, j6.a.c(j6.a.c(e.c(this.e, (iC + (inAppCallStateWithData == null ? 0 : inAppCallStateWithData.hashCode())) * 31, 31), 31, this.f), 31, this.f51170g), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        TicketsWidgetContract$State ticketsWidgetContract$StateA = null;
        Data data = this.f51167a;
        TicketsWidgetContract$State ticketsWidgetContract$State = data != null ? (TicketsWidgetContract$State) data.getContent() : null;
        if (ticketsWidgetContract$State != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i2 = 5;
            for (Map.Entry entry : ticketsWidgetContract$State.f90444a.entrySet()) {
                if (i2 == 0) {
                    break;
                }
                linkedHashMap.put(entry.getKey(), entry.getValue());
                i2--;
            }
            ticketsWidgetContract$StateA = TicketsWidgetContract$State.a(ticketsWidgetContract$State, linkedHashMap, null, null, 4);
        }
        dest.writeParcelable(ticketsWidgetContract$StateA, 0);
    }
}
