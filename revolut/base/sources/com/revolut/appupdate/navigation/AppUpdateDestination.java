package com.revolut.appupdate.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.appupdate.ui.AppUpdateContract$InputData;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/appupdate/navigation/AppUpdateDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "appupdate_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AppUpdateDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<AppUpdateDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppUpdateContract$InputData f50360a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AppUpdateDestination(AppUpdateContract$InputData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AppUpdateDestination[i];
        }
    }

    public AppUpdateDestination(AppUpdateContract$InputData input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.f50360a = input;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AppUpdateContract$InputData getF50360a() {
        return this.f50360a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof AppUpdateDestination) && Intrinsics.f(this.f50360a, ((AppUpdateDestination) obj2).f50360a);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f50360a.f50361a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f50360a.writeToParcel(dest, i);
    }
}
