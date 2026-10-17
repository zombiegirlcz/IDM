package com.revolut.feature.permissions.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$Explanation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/permissions/flow/PermissionsControllerContract$Permission", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PermissionsControllerContract$Permission implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PermissionsControllerContract$Permission> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f80329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PermissionsControllerContract$Explanation f80330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PermissionsControllerContract$Explanation f80331c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PermissionsControllerContract$Permission(parcel.readString(), (PermissionsControllerContract$Explanation) parcel.readParcelable(PermissionsControllerContract$Permission.class.getClassLoader()), (PermissionsControllerContract$Explanation) parcel.readParcelable(PermissionsControllerContract$Permission.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PermissionsControllerContract$Permission[i];
        }
    }

    public PermissionsControllerContract$Permission(String key, PermissionsControllerContract$Explanation introduction, PermissionsControllerContract$Explanation explanation, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(introduction, "introduction");
        Intrinsics.checkNotNullParameter(explanation, "explanation");
        this.f80329a = key;
        this.f80330b = introduction;
        this.f80331c = explanation;
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
        if (!(obj2 instanceof PermissionsControllerContract$Permission)) {
            return false;
        }
        PermissionsControllerContract$Permission permissionsControllerContract$Permission = (PermissionsControllerContract$Permission) obj2;
        return Intrinsics.f(this.f80329a, permissionsControllerContract$Permission.f80329a) && Intrinsics.f(this.f80330b, permissionsControllerContract$Permission.f80330b) && Intrinsics.f(this.f80331c, permissionsControllerContract$Permission.f80331c) && this.d == permissionsControllerContract$Permission.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.f80331c.hashCode() + ((this.f80330b.hashCode() + (this.f80329a.hashCode() * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f80329a);
        dest.writeParcelable(this.f80330b, i);
        dest.writeParcelable(this.f80331c, i);
        dest.writeInt(this.d ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PermissionsControllerContract$Permission(String str, PermissionsControllerContract$Explanation.PromptScreen promptScreen, PermissionsControllerContract$Explanation permissionsControllerContract$Explanation, boolean z, int i) {
        int i2 = i & 2;
        PermissionsControllerContract$Explanation.None none = PermissionsControllerContract$Explanation.None.f80324a;
        this(str, i2 != 0 ? none : promptScreen, (i & 4) != 0 ? none : permissionsControllerContract$Explanation, (i & 8) != 0 ? false : z);
    }
}
