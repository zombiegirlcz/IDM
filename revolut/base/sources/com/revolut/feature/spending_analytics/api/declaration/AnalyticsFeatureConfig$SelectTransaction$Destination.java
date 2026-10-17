package com.revolut.feature.spending_analytics.api.declaration;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.categorisation.api.model.CategorisationFilter;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/spending_analytics/api/declaration/AnalyticsFeatureConfig$SelectTransaction$Destination", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AnalyticsFeatureConfig$SelectTransaction$Destination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<AnalyticsFeatureConfig$SelectTransaction$Destination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CategorisationFilter f87424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f87425b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            CategorisationFilter categorisationFilter = (CategorisationFilter) j6.a.f(parcel, "parcel", AnalyticsFeatureConfig$SelectTransaction$Destination.class);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(AnalyticsFeatureConfig$SelectTransaction$Destination.class, parcel, arrayList, iE, 1);
            }
            return new AnalyticsFeatureConfig$SelectTransaction$Destination(categorisationFilter, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AnalyticsFeatureConfig$SelectTransaction$Destination[i];
        }
    }

    public AnalyticsFeatureConfig$SelectTransaction$Destination(CategorisationFilter categorisationFilter, List analyticsAccounts) {
        Intrinsics.checkNotNullParameter(categorisationFilter, "categorisationFilter");
        Intrinsics.checkNotNullParameter(analyticsAccounts, "analyticsAccounts");
        this.f87424a = categorisationFilter;
        this.f87425b = analyticsAccounts;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getF87425b() {
        return this.f87425b;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final CategorisationFilter getF87424a() {
        return this.f87424a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AnalyticsFeatureConfig$SelectTransaction$Destination)) {
            return false;
        }
        AnalyticsFeatureConfig$SelectTransaction$Destination analyticsFeatureConfig$SelectTransaction$Destination = (AnalyticsFeatureConfig$SelectTransaction$Destination) obj2;
        return Intrinsics.f(this.f87424a, analyticsFeatureConfig$SelectTransaction$Destination.f87424a) && Intrinsics.f(this.f87425b, analyticsFeatureConfig$SelectTransaction$Destination.f87425b);
    }

    public final int hashCode() {
        return this.f87425b.hashCode() + (this.f87424a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f87424a, i);
        Iterator itV = p.a.v(this.f87425b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }
}
