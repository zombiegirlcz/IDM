package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favorites;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/travel/hotels/impl/ui_kompot/screen/favorites/TravelHotelsHomeFavoritesScreenContract$UndoAction", "Landroid/os/Parcelable;", "<init>", "()V", "Stay", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/favorites/TravelHotelsHomeFavoritesScreenContract$UndoAction$Stay;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TravelHotelsHomeFavoritesScreenContract$UndoAction implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/favorites/TravelHotelsHomeFavoritesScreenContract$UndoAction$Stay;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/favorites/TravelHotelsHomeFavoritesScreenContract$UndoAction;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Stay extends TravelHotelsHomeFavoritesScreenContract$UndoAction {

        @NotNull
        public static final Parcelable.Creator<Stay> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f93919a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Stay(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Stay[i];
            }
        }

        public Stay(String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f93919a = id10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Stay) && Intrinsics.f(this.f93919a, ((Stay) obj2).f93919a);
        }

        public final int hashCode() {
            return this.f93919a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f93919a);
        }
    }

    private TravelHotelsHomeFavoritesScreenContract$UndoAction() {
    }
}
