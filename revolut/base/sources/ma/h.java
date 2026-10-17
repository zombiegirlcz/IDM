package ma;

import android.os.Parcel;
import android.os.Parcelable;
import com.feature.navigation.hub.impl.ui.hub.NavigationHubControllerContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        return new NavigationHubControllerContract$InputData(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new NavigationHubControllerContract$InputData[i];
    }
}
