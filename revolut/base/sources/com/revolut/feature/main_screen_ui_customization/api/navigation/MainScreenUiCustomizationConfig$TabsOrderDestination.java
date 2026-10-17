package com.revolut.feature.main_screen_ui_customization.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/revolut/feature/main_screen_ui_customization/api/navigation/MainScreenUiCustomizationConfig$TabsOrderDestination", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_main_screen_ui_customization_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MainScreenUiCustomizationConfig$TabsOrderDestination implements KompotDestination {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MainScreenUiCustomizationConfig$TabsOrderDestination f78068a = new MainScreenUiCustomizationConfig$TabsOrderDestination();

    @NotNull
    public static final Parcelable.Creator<MainScreenUiCustomizationConfig$TabsOrderDestination> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return MainScreenUiCustomizationConfig$TabsOrderDestination.f78068a;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MainScreenUiCustomizationConfig$TabsOrderDestination[i];
        }
    }

    private MainScreenUiCustomizationConfig$TabsOrderDestination() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }
}
