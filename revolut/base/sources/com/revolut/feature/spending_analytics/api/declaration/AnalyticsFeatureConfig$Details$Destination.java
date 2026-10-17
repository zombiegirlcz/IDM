package com.revolut.feature.spending_analytics.api.declaration;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.retail.feature.api.AnalyticsAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yld.d;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$Details$Destination", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AnalyticsFeatureConfig$Details$Destination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<AnalyticsFeatureConfig$Details$Destination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsAccount f87412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f87413b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AnalyticsFeatureConfig$Details$Destination((AnalyticsAccount) parcel.readParcelable(AnalyticsFeatureConfig$Details$Destination.class.getClassLoader()), d.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AnalyticsFeatureConfig$Details$Destination[i];
        }
    }

    public AnalyticsFeatureConfig$Details$Destination(AnalyticsAccount analyticsAccount, d screenType) {
        Intrinsics.checkNotNullParameter(analyticsAccount, "analyticsAccount");
        Intrinsics.checkNotNullParameter(screenType, "screenType");
        this.f87412a = analyticsAccount;
        this.f87413b = screenType;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AnalyticsAccount getF87412a() {
        return this.f87412a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final d getF87413b() {
        return this.f87413b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AnalyticsFeatureConfig$Details$Destination)) {
            return false;
        }
        AnalyticsFeatureConfig$Details$Destination analyticsFeatureConfig$Details$Destination = (AnalyticsFeatureConfig$Details$Destination) obj2;
        return Intrinsics.f(this.f87412a, analyticsFeatureConfig$Details$Destination.f87412a) && this.f87413b == analyticsFeatureConfig$Details$Destination.f87413b;
    }

    public final int hashCode() {
        return this.f87413b.hashCode() + (this.f87412a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f87412a, i);
        dest.writeString(this.f87413b.name());
    }
}
