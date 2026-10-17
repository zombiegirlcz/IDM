package com.revolut.feature.payments.groups.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import oq9.o;
import org.jetbrains.annotations.NotNull;
import st9.e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/groups/models/GroupMemberSettleInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GroupMemberSettleInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<GroupMemberSettleInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f79503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f79504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f79505c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GroupMemberSettleInfo((o) parcel.readSerializable(), (e) parcel.readSerializable(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GroupMemberSettleInfo[i];
        }
    }

    public GroupMemberSettleInfo(o member, e debt, boolean z) {
        Intrinsics.checkNotNullParameter(member, "member");
        Intrinsics.checkNotNullParameter(debt, "debt");
        this.f79503a = member;
        this.f79504b = debt;
        this.f79505c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof GroupMemberSettleInfo)) {
            return false;
        }
        GroupMemberSettleInfo groupMemberSettleInfo = (GroupMemberSettleInfo) obj2;
        return Intrinsics.f(this.f79503a, groupMemberSettleInfo.f79503a) && Intrinsics.f(this.f79504b, groupMemberSettleInfo.f79504b) && this.f79505c == groupMemberSettleInfo.f79505c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f79505c) + ((this.f79504b.hashCode() + (this.f79503a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f79503a);
        dest.writeSerializable(this.f79504b);
        dest.writeInt(this.f79505c ? 1 : 0);
    }
}
