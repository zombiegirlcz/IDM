package com.revolut.feature.mainscreen.core.api.ui.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/mainscreen/core/api/ui/screen/MainContainerInnerConfiguration;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_mainscreen_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MainContainerInnerConfiguration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MainContainerInnerConfiguration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainContainerNavigationId f78079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Parcelable f78080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NaviCommand f78081c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MainContainerInnerConfiguration((MainContainerNavigationId) parcel.readParcelable(MainContainerInnerConfiguration.class.getClassLoader()), parcel.readParcelable(MainContainerInnerConfiguration.class.getClassLoader()), (NaviCommand) parcel.readParcelable(MainContainerInnerConfiguration.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MainContainerInnerConfiguration[i];
        }
    }

    public MainContainerInnerConfiguration(MainContainerNavigationId navigationId, Parcelable parcelable, NaviCommand naviCommand) {
        Intrinsics.checkNotNullParameter(navigationId, "navigationId");
        this.f78079a = navigationId;
        this.f78080b = parcelable;
        this.f78081c = naviCommand;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MainContainerInnerConfiguration)) {
            return false;
        }
        MainContainerInnerConfiguration mainContainerInnerConfiguration = (MainContainerInnerConfiguration) obj2;
        return Intrinsics.f(this.f78079a, mainContainerInnerConfiguration.f78079a) && Intrinsics.f(this.f78080b, mainContainerInnerConfiguration.f78080b) && Intrinsics.f(this.f78081c, mainContainerInnerConfiguration.f78081c);
    }

    public final int hashCode() {
        int iHashCode = this.f78079a.hashCode() * 31;
        Parcelable parcelable = this.f78080b;
        int iHashCode2 = (iHashCode + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
        NaviCommand naviCommand = this.f78081c;
        return iHashCode2 + (naviCommand != null ? naviCommand.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f78079a, i);
        dest.writeParcelable(this.f78080b, i);
        dest.writeParcelable(this.f78081c, i);
    }

    public /* synthetic */ MainContainerInnerConfiguration(MainContainerNavigationId mainContainerNavigationId, Parcelable parcelable, NaviCommand naviCommand, int i) {
        this(mainContainerNavigationId, (i & 2) != 0 ? null : parcelable, (i & 4) != 0 ? null : naviCommand);
    }
}
