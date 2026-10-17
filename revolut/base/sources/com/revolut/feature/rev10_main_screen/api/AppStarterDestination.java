package com.revolut.feature.rev10_main_screen.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ParcelableDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev10_main_screen/api/AppStarterDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_rev10_main_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AppStarterDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<AppStarterDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainContainerScreenDestination.JustShow f83410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ParcelableDestination f83411b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AppStarterDestination(MainContainerScreenDestination.JustShow.CREATOR.createFromParcel(parcel), (ParcelableDestination) parcel.readParcelable(AppStarterDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AppStarterDestination[i];
        }
    }

    public AppStarterDestination(MainContainerScreenDestination.JustShow baseDestination, ParcelableDestination targetDestination) {
        Intrinsics.checkNotNullParameter(baseDestination, "baseDestination");
        Intrinsics.checkNotNullParameter(targetDestination, "targetDestination");
        this.f83410a = baseDestination;
        this.f83411b = targetDestination;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AppStarterDestination)) {
            return false;
        }
        AppStarterDestination appStarterDestination = (AppStarterDestination) obj2;
        return Intrinsics.f(this.f83410a, appStarterDestination.f83410a) && Intrinsics.f(this.f83411b, appStarterDestination.f83411b);
    }

    public final int hashCode() {
        return this.f83411b.hashCode() + (this.f83410a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f83410a.writeToParcel(dest, i);
        dest.writeParcelable(this.f83411b, i);
    }
}
