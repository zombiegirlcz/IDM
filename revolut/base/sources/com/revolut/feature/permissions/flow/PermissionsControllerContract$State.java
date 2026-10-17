package com.revolut.feature.permissions.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/permissions/flow/PermissionsControllerContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "", "toString", "()Ljava/lang/String;", "feature_permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PermissionsControllerContract$State implements FlowState {

    @NotNull
    public static final Parcelable.Creator<PermissionsControllerContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f80332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f80333b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            int iA2 = 0;
            while (iA2 != i) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(PermissionsControllerContract$Permission.CREATOR, parcel, arrayList, iA2, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(PermissionsControllerContract$Permission.CREATOR, parcel, arrayList2, iA, 1);
            }
            return new PermissionsControllerContract$State(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PermissionsControllerContract$State[i];
        }
    }

    public PermissionsControllerContract$State(List permissions, List pendingToRequestPermissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(pendingToRequestPermissions, "pendingToRequestPermissions");
        this.f80332a = permissions;
        this.f80333b = pendingToRequestPermissions;
    }

    public static PermissionsControllerContract$State a(PermissionsControllerContract$State permissionsControllerContract$State, List pendingToRequestPermissions) {
        List permissions = permissionsControllerContract$State.f80332a;
        permissionsControllerContract$State.getClass();
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(pendingToRequestPermissions, "pendingToRequestPermissions");
        return new PermissionsControllerContract$State(permissions, pendingToRequestPermissions);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PermissionsControllerContract$State)) {
            return false;
        }
        PermissionsControllerContract$State permissionsControllerContract$State = (PermissionsControllerContract$State) obj2;
        return Intrinsics.f(this.f80332a, permissionsControllerContract$State.f80332a) && Intrinsics.f(this.f80333b, permissionsControllerContract$State.f80333b);
    }

    public final int hashCode() {
        return this.f80333b.hashCode() + (this.f80332a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f80332a, dest);
        while (itV.hasNext()) {
            ((PermissionsControllerContract$Permission) itV.next()).writeToParcel(dest, i);
        }
        Iterator itV2 = p.a.v(this.f80333b, dest);
        while (itV2.hasNext()) {
            ((PermissionsControllerContract$Permission) itV2.next()).writeToParcel(dest, i);
        }
    }
}
