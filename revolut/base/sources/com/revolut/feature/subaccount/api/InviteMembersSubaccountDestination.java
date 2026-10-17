package com.revolut.feature.subaccount.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subaccount/api/InviteMembersSubaccountDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_subaccount_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InviteMembersSubaccountDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<InviteMembersSubaccountDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f88935b;

    /* JADX INFO: loaded from: classes8.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iC = 0;
            while (iC != i) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
            }
            return new InviteMembersSubaccountDestination(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InviteMembersSubaccountDestination[i];
        }
    }

    public InviteMembersSubaccountDestination(String groupId, List members) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(members, "members");
        this.f88934a = groupId;
        this.f88935b = members;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InviteMembersSubaccountDestination)) {
            return false;
        }
        InviteMembersSubaccountDestination inviteMembersSubaccountDestination = (InviteMembersSubaccountDestination) obj2;
        return Intrinsics.f(this.f88934a, inviteMembersSubaccountDestination.f88934a) && Intrinsics.f(this.f88935b, inviteMembersSubaccountDestination.f88935b);
    }

    public final int hashCode() {
        return this.f88935b.hashCode() + (this.f88934a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f88934a);
        Iterator itV = p.a.v(this.f88935b, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
    }
}
