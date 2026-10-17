package com.revolut.feature.subaccount.impl.ui.edit.permission;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.kompot.common.IOData$Input;
import do3.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/subaccount/impl/ui/edit/permission/UserPermissionEditScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_subaccount_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserPermissionEditScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<UserPermissionEditScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Subaccount.Group f89081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f89082b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UserPermissionEditScreenContract$InputData((Subaccount.Group) parcel.readParcelable(UserPermissionEditScreenContract$InputData.class.getClassLoader()), (n) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UserPermissionEditScreenContract$InputData[i];
        }
    }

    public UserPermissionEditScreenContract$InputData(Subaccount.Group group, n user) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(user, "user");
        this.f89081a = group;
        this.f89082b = user;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof UserPermissionEditScreenContract$InputData)) {
            return false;
        }
        UserPermissionEditScreenContract$InputData userPermissionEditScreenContract$InputData = (UserPermissionEditScreenContract$InputData) obj2;
        return Intrinsics.f(this.f89081a, userPermissionEditScreenContract$InputData.f89081a) && Intrinsics.f(this.f89082b, userPermissionEditScreenContract$InputData.f89082b);
    }

    public final int hashCode() {
        return this.f89082b.hashCode() + (this.f89081a.f88953a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f89081a, i);
        dest.writeSerializable(this.f89082b);
    }
}
