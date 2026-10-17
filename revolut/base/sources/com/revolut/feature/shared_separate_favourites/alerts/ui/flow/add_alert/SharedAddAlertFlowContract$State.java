package com.revolut.feature.shared_separate_favourites.alerts.ui.flow.add_alert;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetDetails;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem;
import com.revolut.kompot.navigable.flow.FlowState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/shared_separate_favourites/alerts/ui/flow/add_alert/SharedAddAlertFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "", "toString", "()Ljava/lang/String;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SharedAddAlertFlowContract$State implements FlowState {

    @NotNull
    public static final Parcelable.Creator<SharedAddAlertFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FavouritesAssetTypeKey f86694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FavouritesAssetDetails f86695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f86696c;
    public final AlertItem d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SharedAddAlertFlowContract$State((FavouritesAssetTypeKey) parcel.readParcelable(SharedAddAlertFlowContract$State.class.getClassLoader()), (FavouritesAssetDetails) parcel.readParcelable(SharedAddAlertFlowContract$State.class.getClassLoader()), parcel.readString(), (AlertItem) parcel.readParcelable(SharedAddAlertFlowContract$State.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SharedAddAlertFlowContract$State[i];
        }
    }

    public SharedAddAlertFlowContract$State(FavouritesAssetTypeKey favouritesAssetTypeKey, FavouritesAssetDetails favouritesAssetDetails, String str, AlertItem alertItem) {
        this.f86694a = favouritesAssetTypeKey;
        this.f86695b = favouritesAssetDetails;
        this.f86696c = str;
        this.d = alertItem;
    }

    public static SharedAddAlertFlowContract$State a(SharedAddAlertFlowContract$State sharedAddAlertFlowContract$State, FavouritesAssetTypeKey favouritesAssetTypeKey, FavouritesAssetDetails favouritesAssetDetails, String str, int i) {
        if ((i & 1) != 0) {
            favouritesAssetTypeKey = sharedAddAlertFlowContract$State.f86694a;
        }
        if ((i & 2) != 0) {
            favouritesAssetDetails = sharedAddAlertFlowContract$State.f86695b;
        }
        if ((i & 4) != 0) {
            str = sharedAddAlertFlowContract$State.f86696c;
        }
        AlertItem alertItem = sharedAddAlertFlowContract$State.d;
        sharedAddAlertFlowContract$State.getClass();
        return new SharedAddAlertFlowContract$State(favouritesAssetTypeKey, favouritesAssetDetails, str, alertItem);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SharedAddAlertFlowContract$State)) {
            return false;
        }
        SharedAddAlertFlowContract$State sharedAddAlertFlowContract$State = (SharedAddAlertFlowContract$State) obj2;
        return Intrinsics.f(this.f86694a, sharedAddAlertFlowContract$State.f86694a) && Intrinsics.f(this.f86695b, sharedAddAlertFlowContract$State.f86695b) && Intrinsics.f(this.f86696c, sharedAddAlertFlowContract$State.f86696c) && Intrinsics.f(this.d, sharedAddAlertFlowContract$State.d);
    }

    public final int hashCode() {
        FavouritesAssetTypeKey favouritesAssetTypeKey = this.f86694a;
        int iHashCode = (favouritesAssetTypeKey == null ? 0 : favouritesAssetTypeKey.f86866a.hashCode()) * 31;
        FavouritesAssetDetails favouritesAssetDetails = this.f86695b;
        int iHashCode2 = (iHashCode + (favouritesAssetDetails == null ? 0 : favouritesAssetDetails.hashCode())) * 31;
        String str = this.f86696c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        AlertItem alertItem = this.d;
        return iHashCode3 + (alertItem != null ? alertItem.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f86694a, i);
        dest.writeParcelable(this.f86695b, i);
        dest.writeString(this.f86696c);
        dest.writeParcelable(this.d, i);
    }
}
