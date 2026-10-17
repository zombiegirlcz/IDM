package com.revolut.feature.travel.hotels.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/api/navigation/SearchResultsDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SearchResultsDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<SearchResultsDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f93621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f93622b;

    /* JADX INFO: loaded from: classes9.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SearchResultsDestination(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SearchResultsDestination[i];
        }
    }

    public SearchResultsDestination(boolean z, boolean z3) {
        this.f93621a = z;
        this.f93622b = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SearchResultsDestination)) {
            return false;
        }
        SearchResultsDestination searchResultsDestination = (SearchResultsDestination) obj2;
        return this.f93621a == searchResultsDestination.f93621a && this.f93622b == searchResultsDestination.f93622b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f93622b) + (Boolean.hashCode(this.f93621a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f93621a ? 1 : 0);
        dest.writeInt(this.f93622b ? 1 : 0);
    }

    public SearchResultsDestination() {
        this(false, false);
    }
}
