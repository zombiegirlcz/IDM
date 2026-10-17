package com.revolut.feature.wealth.analytics.insights.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/analytics/insights/model/PortfolioInsightsInfoItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PortfolioInsightsInfoItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PortfolioInsightsInfoItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f95010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f95011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f95012c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PortfolioInsightsInfoItem(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PortfolioInsightsInfoItem[i];
        }
    }

    public PortfolioInsightsInfoItem(String icon, String title, String description) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f95010a = icon;
        this.f95011b = title;
        this.f95012c = description;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PortfolioInsightsInfoItem)) {
            return false;
        }
        PortfolioInsightsInfoItem portfolioInsightsInfoItem = (PortfolioInsightsInfoItem) obj2;
        return Intrinsics.f(this.f95010a, portfolioInsightsInfoItem.f95010a) && Intrinsics.f(this.f95011b, portfolioInsightsInfoItem.f95011b) && Intrinsics.f(this.f95012c, portfolioInsightsInfoItem.f95012c);
    }

    public final int hashCode() {
        return this.f95012c.hashCode() + p.a.c(this.f95010a.hashCode() * 31, 31, this.f95011b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f95010a);
        dest.writeString(this.f95011b);
        dest.writeString(this.f95012c);
    }
}
