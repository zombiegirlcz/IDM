package com.revolut.feature.payments.groups.impl.members_picker;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.contacts_chooser.api.context.ContextAction;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/members_picker/GroupChatQrAction;", "Lcom/revolut/feature/contacts_chooser/api/context/ContextAction;", "", "COPY", "SHARE", "SHOW_QR", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GroupChatQrAction implements ContextAction {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ GroupChatQrAction[] $VALUES;
    public static final GroupChatQrAction COPY;

    @NotNull
    public static final Parcelable.Creator<GroupChatQrAction> CREATOR;
    public static final GroupChatQrAction SHARE;
    public static final GroupChatQrAction SHOW_QR;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return GroupChatQrAction.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GroupChatQrAction[i];
        }
    }

    static {
        GroupChatQrAction groupChatQrAction = new GroupChatQrAction("COPY", 0);
        COPY = groupChatQrAction;
        GroupChatQrAction groupChatQrAction2 = new GroupChatQrAction("SHARE", 1);
        SHARE = groupChatQrAction2;
        GroupChatQrAction groupChatQrAction3 = new GroupChatQrAction("SHOW_QR", 2);
        SHOW_QR = groupChatQrAction3;
        GroupChatQrAction[] groupChatQrActionArr = {groupChatQrAction, groupChatQrAction2, groupChatQrAction3};
        $VALUES = groupChatQrActionArr;
        $ENTRIES = s.n(groupChatQrActionArr);
        CREATOR = new a();
    }

    public static GroupChatQrAction valueOf(String str) {
        return (GroupChatQrAction) Enum.valueOf(GroupChatQrAction.class, str);
    }

    public static GroupChatQrAction[] values() {
        return (GroupChatQrAction[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }
}
