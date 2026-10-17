package com.revolut.feature.pockets.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/pockets/api/navigation/PocketDetailsInitialAction;", "Landroid/os/Parcelable;", "ShowCountryPicker", "Lcom/revolut/feature/pockets/api/navigation/PocketDetailsInitialAction$ShowCountryPicker;", "feature_pockets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PocketDetailsInitialAction extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pockets/api/navigation/PocketDetailsInitialAction$ShowCountryPicker;", "Lcom/revolut/feature/pockets/api/navigation/PocketDetailsInitialAction;", "<init>", "()V", "feature_pockets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ShowCountryPicker implements PocketDetailsInitialAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShowCountryPicker f80778a = new ShowCountryPicker();

        @NotNull
        public static final Parcelable.Creator<ShowCountryPicker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ShowCountryPicker.f80778a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowCountryPicker[i];
            }
        }

        private ShowCountryPicker() {
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
}
