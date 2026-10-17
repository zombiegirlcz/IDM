package com.revolut.kompot.bridge.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/kompot/bridge/navigation/MainScreenDestination;", "Lcom/revolut/kompot/bridge/navigation/AppHomeDestination;", "<init>", "()V", "kompot_bridge_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MainScreenDestination implements AppHomeDestination {

    @NotNull
    public static final Parcelable.Creator<MainScreenDestination> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MainScreenDestination f98280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FeatureCommand f98281b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return MainScreenDestination.f98280a;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MainScreenDestination[i];
        }
    }

    static {
        MainScreenDestination mainScreenDestination = new MainScreenDestination();
        f98280a = mainScreenDestination;
        f98281b = new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) mainScreenDestination, false, (Integer) null, 335577088, 45));
        CREATOR = new a();
    }

    private MainScreenDestination() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.revolut.kompot.bridge.navigation.AppHomeDestination
    /* JADX INFO: renamed from: g1 */
    public final FeatureCommand getF83419c() {
        return f98281b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }
}
