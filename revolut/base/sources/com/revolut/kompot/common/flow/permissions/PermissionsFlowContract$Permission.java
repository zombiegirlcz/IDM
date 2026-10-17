package com.revolut.kompot.common.flow.permissions;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.flow.permissions.PermissionsFlowContract$Explanation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/kompot/common/flow/permissions/PermissionsFlowContract$Permission", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "kompot_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PermissionsFlowContract$Permission implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PermissionsFlowContract$Permission> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PermissionsFlowContract$Explanation f98348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PermissionsFlowContract$Explanation f98349c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PermissionsFlowContract$Permission(parcel.readString(), (PermissionsFlowContract$Explanation) parcel.readParcelable(PermissionsFlowContract$Permission.class.getClassLoader()), (PermissionsFlowContract$Explanation) parcel.readParcelable(PermissionsFlowContract$Permission.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PermissionsFlowContract$Permission[i];
        }
    }

    public PermissionsFlowContract$Permission(String key, PermissionsFlowContract$Explanation introduction, PermissionsFlowContract$Explanation explanation, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(introduction, "introduction");
        Intrinsics.checkNotNullParameter(explanation, "explanation");
        this.f98347a = key;
        this.f98348b = introduction;
        this.f98349c = explanation;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PermissionsFlowContract$Permission)) {
            return false;
        }
        PermissionsFlowContract$Permission permissionsFlowContract$Permission = (PermissionsFlowContract$Permission) obj2;
        return Intrinsics.f(this.f98347a, permissionsFlowContract$Permission.f98347a) && Intrinsics.f(this.f98348b, permissionsFlowContract$Permission.f98348b) && Intrinsics.f(this.f98349c, permissionsFlowContract$Permission.f98349c) && this.d == permissionsFlowContract$Permission.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.f98349c.hashCode() + ((this.f98348b.hashCode() + (this.f98347a.hashCode() * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98347a);
        dest.writeParcelable(this.f98348b, i);
        dest.writeParcelable(this.f98349c, i);
        dest.writeInt(this.d ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PermissionsFlowContract$Permission(String str, PermissionsFlowContract$Explanation permissionsFlowContract$Explanation, int i) {
        int i2 = i & 4;
        PermissionsFlowContract$Explanation.None none = PermissionsFlowContract$Explanation.None.f98339a;
        this(str, none, i2 != 0 ? none : permissionsFlowContract$Explanation, (i & 8) == 0);
    }
}
