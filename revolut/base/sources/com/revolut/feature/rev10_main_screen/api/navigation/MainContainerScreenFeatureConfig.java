package com.revolut.feature.rev10_main_screen.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev10_main_screen/api/navigation/MainContainerScreenFeatureConfig;", "Lcom/revolut/feature/rev10_main_screen/api/navigation/AppHomeFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_rev10_main_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MainContainerScreenFeatureConfig implements AppHomeFeatureConfig {

    @NotNull
    public static final Parcelable.Creator<MainContainerScreenFeatureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainContainerScreenDestination f83426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f83427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f83428c;

    /* JADX INFO: loaded from: classes6.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MainContainerScreenFeatureConfig((MainContainerScreenDestination) parcel.readParcelable(MainContainerScreenFeatureConfig.class.getClassLoader()), parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MainContainerScreenFeatureConfig[i];
        }
    }

    public MainContainerScreenFeatureConfig(MainContainerScreenDestination destination, int i, boolean z) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f83426a = destination;
        this.f83427b = i;
        this.f83428c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MainContainerScreenFeatureConfig)) {
            return false;
        }
        MainContainerScreenFeatureConfig mainContainerScreenFeatureConfig = (MainContainerScreenFeatureConfig) obj2;
        return Intrinsics.f(this.f83426a, mainContainerScreenFeatureConfig.f83426a) && this.f83427b == mainContainerScreenFeatureConfig.f83427b && this.f83428c == mainContainerScreenFeatureConfig.f83428c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f83428c) + j6.a.b(this.f83427b, this.f83426a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f83426a, i);
        dest.writeInt(this.f83427b);
        dest.writeInt(this.f83428c ? 1 : 0);
    }
}
