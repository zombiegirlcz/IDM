package com.revolut.feature.subaccount.impl.ui.edit.invite.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/subaccount/impl/ui/edit/invite/flow/InviteMembersFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_subaccount_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InviteMembersFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<InviteMembersFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f89072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f89073b;

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
            return new InviteMembersFlowContract$InputData(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InviteMembersFlowContract$InputData[i];
        }
    }

    public InviteMembersFlowContract$InputData(String groupSubaccountId, List members) {
        Intrinsics.checkNotNullParameter(groupSubaccountId, "groupSubaccountId");
        Intrinsics.checkNotNullParameter(members, "members");
        this.f89072a = groupSubaccountId;
        this.f89073b = members;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InviteMembersFlowContract$InputData)) {
            return false;
        }
        InviteMembersFlowContract$InputData inviteMembersFlowContract$InputData = (InviteMembersFlowContract$InputData) obj2;
        return Intrinsics.f(this.f89072a, inviteMembersFlowContract$InputData.f89072a) && Intrinsics.f(this.f89073b, inviteMembersFlowContract$InputData.f89073b);
    }

    public final int hashCode() {
        return this.f89073b.hashCode() + (this.f89072a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f89072a);
        Iterator itV = p.a.v(this.f89073b, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
    }
}
