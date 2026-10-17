package com.revolut.retail.feature.actions.api.retail_accounts.ui.members_widget;

import android.os.Parcel;
import android.os.Parcelable;
import do3.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pcd.s;
import pcd.x;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/actions/api/retail_accounts/ui/members_widget/GroupMemberClickData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GroupMemberClickData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<GroupMemberClickData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f98696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f98697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f98698c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            x xVar = (x) parcel.readSerializable();
            return new GroupMemberClickData((n) parcel.readSerializable(), (s) parcel.readSerializable(), xVar);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GroupMemberClickData[i];
        }
    }

    public GroupMemberClickData(n user, s vault, x vaultMember) {
        Intrinsics.checkNotNullParameter(vaultMember, "vaultMember");
        Intrinsics.checkNotNullParameter(vault, "vault");
        Intrinsics.checkNotNullParameter(user, "user");
        this.f98696a = vaultMember;
        this.f98697b = vault;
        this.f98698c = user;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof GroupMemberClickData)) {
            return false;
        }
        GroupMemberClickData groupMemberClickData = (GroupMemberClickData) obj2;
        return Intrinsics.f(this.f98696a, groupMemberClickData.f98696a) && Intrinsics.f(this.f98697b, groupMemberClickData.f98697b) && Intrinsics.f(this.f98698c, groupMemberClickData.f98698c);
    }

    public final int hashCode() {
        return this.f98698c.hashCode() + ((this.f98697b.hashCode() + (this.f98696a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f98696a);
        dest.writeSerializable(this.f98697b);
        dest.writeSerializable(this.f98698c);
    }
}
