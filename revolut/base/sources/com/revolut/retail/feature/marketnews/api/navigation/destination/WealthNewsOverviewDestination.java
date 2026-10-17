package com.revolut.retail.feature.marketnews.api.navigation.destination;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/marketnews/api/navigation/destination/WealthNewsOverviewDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_market_news_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WealthNewsOverviewDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<WealthNewsOverviewDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tzj.a f101822a;

    /* JADX INFO: loaded from: classes11.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WealthNewsOverviewDestination(tzj.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WealthNewsOverviewDestination[i];
        }
    }

    public WealthNewsOverviewDestination(tzj.a section) {
        Intrinsics.checkNotNullParameter(section, "section");
        this.f101822a = section;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof WealthNewsOverviewDestination) && this.f101822a == ((WealthNewsOverviewDestination) obj2).f101822a;
    }

    public final int hashCode() {
        return this.f101822a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f101822a.name());
    }
}
