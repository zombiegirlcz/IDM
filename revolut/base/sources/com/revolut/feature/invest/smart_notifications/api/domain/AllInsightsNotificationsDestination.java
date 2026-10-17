package com.revolut.feature.invest.smart_notifications.api.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.invest.smart_notifications.api.domain.models.FeedFilter;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/invest/smart_notifications/api/domain/AllInsightsNotificationsDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_invest_smart_notifications_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AllInsightsNotificationsDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<AllInsightsNotificationsDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FeedFilter f76420a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AllInsightsNotificationsDestination((FeedFilter) parcel.readParcelable(AllInsightsNotificationsDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AllInsightsNotificationsDestination[i];
        }
    }

    public AllInsightsNotificationsDestination(FeedFilter feedFilter) {
        Intrinsics.checkNotNullParameter(feedFilter, "feedFilter");
        this.f76420a = feedFilter;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof AllInsightsNotificationsDestination) && Intrinsics.f(this.f76420a, ((AllInsightsNotificationsDestination) obj2).f76420a);
    }

    public final int hashCode() {
        return this.f76420a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f76420a, i);
    }

    public AllInsightsNotificationsDestination() {
        this(new FeedFilter.ByAssetFilter(h0.f322473a));
    }
}
