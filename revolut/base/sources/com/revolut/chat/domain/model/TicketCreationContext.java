package com.revolut.chat.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/chat/domain/model/TicketCreationContext;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TicketCreationContext implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TicketCreationContext> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f51070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f51071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f51072c;
    public final NewTicketContext d;
    public final String e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(TicketCreationContext.class, parcel, arrayList, iE, 1);
                }
            }
            return new TicketCreationContext(string, arrayList, parcel.createStringArrayList(), (NewTicketContext) parcel.readParcelable(TicketCreationContext.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TicketCreationContext[i];
        }
    }

    public TicketCreationContext() {
        this((String) null, (List) null, (List) null, (NewTicketContext) null, 31);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TicketCreationContext)) {
            return false;
        }
        TicketCreationContext ticketCreationContext = (TicketCreationContext) obj2;
        return Intrinsics.f(this.f51070a, ticketCreationContext.f51070a) && Intrinsics.f(this.f51071b, ticketCreationContext.f51071b) && Intrinsics.f(this.f51072c, ticketCreationContext.f51072c) && Intrinsics.f(this.d, ticketCreationContext.d) && Intrinsics.f(this.e, ticketCreationContext.e);
    }

    public final int hashCode() {
        String str = this.f51070a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.f51071b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f51072c;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        NewTicketContext newTicketContext = this.d;
        int iHashCode4 = (iHashCode3 + (newTicketContext == null ? 0 : newTicketContext.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f51070a);
        List list = this.f51071b;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                dest.writeParcelable((Parcelable) itQ.next(), i);
            }
        }
        dest.writeStringList(this.f51072c);
        dest.writeParcelable(this.d, i);
        dest.writeString(this.e);
    }

    public TicketCreationContext(String str, List list, List list2, NewTicketContext newTicketContext, String str2) {
        this.f51070a = str;
        this.f51071b = list;
        this.f51072c = list2;
        this.d = newTicketContext;
        this.e = str2;
    }

    public /* synthetic */ TicketCreationContext(String str, List list, List list2, NewTicketContext newTicketContext, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : newTicketContext, (String) null);
    }
}
