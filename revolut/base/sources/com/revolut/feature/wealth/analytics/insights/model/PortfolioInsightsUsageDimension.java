package com.revolut.feature.wealth.analytics.insights.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/analytics/insights/model/PortfolioInsightsUsageDimension;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PortfolioInsightsUsageDimension implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PortfolioInsightsUsageDimension> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f95013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f95014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f95015c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PortfolioInsightsUsageDimension(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PortfolioInsightsUsageDimension[i];
        }
    }

    public PortfolioInsightsUsageDimension(String description, String progressText, boolean z) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(progressText, "progressText");
        this.f95013a = description;
        this.f95014b = progressText;
        this.f95015c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PortfolioInsightsUsageDimension)) {
            return false;
        }
        PortfolioInsightsUsageDimension portfolioInsightsUsageDimension = (PortfolioInsightsUsageDimension) obj2;
        return Intrinsics.f(this.f95013a, portfolioInsightsUsageDimension.f95013a) && Intrinsics.f(this.f95014b, portfolioInsightsUsageDimension.f95014b) && this.f95015c == portfolioInsightsUsageDimension.f95015c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f95015c) + p.a.c(this.f95013a.hashCode() * 31, 31, this.f95014b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f95013a);
        dest.writeString(this.f95014b);
        dest.writeInt(this.f95015c ? 1 : 0);
    }
}
