package com.revolut.feature.payments.groups.impl.ui_chat.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/payments/groups/impl/ui_chat/flow/GroupChatFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GroupChatFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<GroupChatFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentGroup f79354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f79355b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GroupChatFlowContract$InputData((PaymentGroup) parcel.readParcelable(GroupChatFlowContract$InputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GroupChatFlowContract$InputData[i];
        }
    }

    public GroupChatFlowContract$InputData(PaymentGroup group, boolean z) {
        Intrinsics.checkNotNullParameter(group, "group");
        this.f79354a = group;
        this.f79355b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof GroupChatFlowContract$InputData)) {
            return false;
        }
        GroupChatFlowContract$InputData groupChatFlowContract$InputData = (GroupChatFlowContract$InputData) obj2;
        return Intrinsics.f(this.f79354a, groupChatFlowContract$InputData.f79354a) && this.f79355b == groupChatFlowContract$InputData.f79355b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f79355b) + (this.f79354a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f79354a, i);
        dest.writeInt(this.f79355b ? 1 : 0);
    }
}
