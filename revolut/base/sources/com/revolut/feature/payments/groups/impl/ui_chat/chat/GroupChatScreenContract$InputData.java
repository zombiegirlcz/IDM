package com.revolut.feature.payments.groups.impl.ui_chat.chat;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/payments/groups/impl/ui_chat/chat/GroupChatScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GroupChatScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<GroupChatScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentGroup f79335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f79336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithContainerBackground f79337c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GroupChatScreenContract$InputData((PaymentGroup) parcel.readParcelable(GroupChatScreenContract$InputData.class.getClassLoader()), parcel.readInt() != 0, (NavBarWithContainerBackground) parcel.readParcelable(GroupChatScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GroupChatScreenContract$InputData[i];
        }
    }

    public GroupChatScreenContract$InputData(PaymentGroup group, boolean z, NavBarWithContainerBackground navBarWithContainerBackground) {
        Intrinsics.checkNotNullParameter(group, "group");
        this.f79335a = group;
        this.f79336b = z;
        this.f79337c = navBarWithContainerBackground;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof GroupChatScreenContract$InputData)) {
            return false;
        }
        GroupChatScreenContract$InputData groupChatScreenContract$InputData = (GroupChatScreenContract$InputData) obj2;
        return Intrinsics.f(this.f79335a, groupChatScreenContract$InputData.f79335a) && this.f79336b == groupChatScreenContract$InputData.f79336b && Intrinsics.f(this.f79337c, groupChatScreenContract$InputData.f79337c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f79335a.hashCode() * 31, 31, this.f79336b);
        NavBarWithContainerBackground navBarWithContainerBackground = this.f79337c;
        return iC + (navBarWithContainerBackground == null ? 0 : navBarWithContainerBackground.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f79335a, i);
        dest.writeInt(this.f79336b ? 1 : 0);
        dest.writeParcelable(this.f79337c, i);
    }
}
