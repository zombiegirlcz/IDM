package com.revolut.core.backend_flow.ui.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/core/backend_flow/ui/screen/BackendScreenContract$Configuration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BackendScreenContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BackendScreenContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BackendScreen f51329a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BackendScreenContract$Configuration((BackendScreen) parcel.readParcelable(BackendScreenContract$Configuration.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BackendScreenContract$Configuration[i];
        }
    }

    public BackendScreenContract$Configuration(BackendScreen backendScreen) {
        this.f51329a = backendScreen;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof BackendScreenContract$Configuration) && Intrinsics.f(this.f51329a, ((BackendScreenContract$Configuration) obj2).f51329a);
    }

    public final int hashCode() {
        BackendScreen backendScreen = this.f51329a;
        if (backendScreen == null) {
            return 0;
        }
        return backendScreen.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f51329a, i);
    }
}
