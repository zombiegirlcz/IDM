package com.revolut.feature.wealth_discovery.api.declaration;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.shared.feature.wealth.models.screener.ScreenerCollection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth_discovery/api/declaration/ScreenerCollectionDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_wealth_discovery_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ScreenerCollectionDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<ScreenerCollectionDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f96099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScreenerCollection f96100b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ScreenerCollectionDestination(parcel.readString(), (ScreenerCollection) parcel.readParcelable(ScreenerCollectionDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ScreenerCollectionDestination[i];
        }
    }

    public ScreenerCollectionDestination(String collectionId, ScreenerCollection screenerCollection) {
        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
        this.f96099a = collectionId;
        this.f96100b = screenerCollection;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ScreenerCollectionDestination)) {
            return false;
        }
        ScreenerCollectionDestination screenerCollectionDestination = (ScreenerCollectionDestination) obj2;
        return Intrinsics.f(this.f96099a, screenerCollectionDestination.f96099a) && Intrinsics.f(this.f96100b, screenerCollectionDestination.f96100b);
    }

    public final int hashCode() {
        int iHashCode = this.f96099a.hashCode() * 31;
        ScreenerCollection screenerCollection = this.f96100b;
        return iHashCode + (screenerCollection == null ? 0 : screenerCollection.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f96099a);
        dest.writeParcelable(this.f96100b, i);
    }
}
