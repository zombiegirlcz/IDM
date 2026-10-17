package com.revolut.core.backend_flow.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/backend_flow/ui/BackendFlowPermissionDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BackendFlowPermissionDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<BackendFlowPermissionDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FormScreen f51311a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BackendFlowPermissionDestination((FormScreen) parcel.readParcelable(BackendFlowPermissionDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BackendFlowPermissionDestination[i];
        }
    }

    public BackendFlowPermissionDestination(FormScreen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.f51311a = screen;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final FormScreen getF51311a() {
        return this.f51311a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof BackendFlowPermissionDestination) && Intrinsics.f(this.f51311a, ((BackendFlowPermissionDestination) obj2).f51311a);
    }

    public final int hashCode() {
        return this.f51311a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f51311a, i);
    }
}
