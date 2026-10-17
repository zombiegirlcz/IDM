package com.revolut.feature.shared_separate_favourites.api.watchlist.home_widget_customisation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.shared_separate_favourites.domain.combined_watchlist.CombinedWatchlistContext;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/shared_separate_favourites/api/watchlist/home_widget_customisation/WatchlistWidgetCustomisationScreen$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_shared_separate_favourites_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WatchlistWidgetCustomisationScreen$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<WatchlistWidgetCustomisationScreen$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f86794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f86795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f86796c;
    public final CombinedWatchlistContext d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WatchlistWidgetCustomisationScreen$InputData(parcel.readInt(), parcel.readString(), parcel.createStringArrayList(), (CombinedWatchlistContext) parcel.readParcelable(WatchlistWidgetCustomisationScreen$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WatchlistWidgetCustomisationScreen$InputData[i];
        }
    }

    public WatchlistWidgetCustomisationScreen$InputData(int i, String widgetId, ArrayList arrayList, CombinedWatchlistContext context) {
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f86794a = i;
        this.f86795b = widgetId;
        this.f86796c = arrayList;
        this.d = context;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WatchlistWidgetCustomisationScreen$InputData)) {
            return false;
        }
        WatchlistWidgetCustomisationScreen$InputData watchlistWidgetCustomisationScreen$InputData = (WatchlistWidgetCustomisationScreen$InputData) obj2;
        return this.f86794a == watchlistWidgetCustomisationScreen$InputData.f86794a && Intrinsics.f(this.f86795b, watchlistWidgetCustomisationScreen$InputData.f86795b) && Intrinsics.f(this.f86796c, watchlistWidgetCustomisationScreen$InputData.f86796c) && Intrinsics.f(this.d, watchlistWidgetCustomisationScreen$InputData.d);
    }

    public final int hashCode() {
        int iC = p.a.c(Integer.hashCode(this.f86794a) * 31, 31, this.f86795b);
        List list = this.f86796c;
        return this.d.hashCode() + ((iC + (list == null ? 0 : list.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f86794a);
        dest.writeString(this.f86795b);
        dest.writeStringList(this.f86796c);
        dest.writeParcelable(this.d, i);
    }
}
