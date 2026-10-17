package com.revolut.feature.wealth.analytics.insights.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/analytics/insights/model/PortfolioInsightsInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PortfolioInsightsInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PortfolioInsightsInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f95008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f95009b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(PortfolioInsightsInfoItem.CREATOR, parcel, arrayList, iA, 1);
            }
            return new PortfolioInsightsInfo(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PortfolioInsightsInfo[i];
        }
    }

    public PortfolioInsightsInfo(String title, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f95008a = title;
        this.f95009b = items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PortfolioInsightsInfo)) {
            return false;
        }
        PortfolioInsightsInfo portfolioInsightsInfo = (PortfolioInsightsInfo) obj2;
        return Intrinsics.f(this.f95008a, portfolioInsightsInfo.f95008a) && this.f95009b.equals(portfolioInsightsInfo.f95009b);
    }

    public final int hashCode() {
        return this.f95009b.hashCode() + (this.f95008a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f95008a);
        Iterator itY = j6.a.y(this.f95009b, dest);
        while (itY.hasNext()) {
            ((PortfolioInsightsInfoItem) itY.next()).writeToParcel(dest, i);
        }
    }
}
