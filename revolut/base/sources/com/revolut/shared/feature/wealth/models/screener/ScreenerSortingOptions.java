package com.revolut.shared.feature.wealth.models.screener;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zel.g;
import zel.i;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/screener/ScreenerSortingOptions;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ScreenerSortingOptions implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ScreenerSortingOptions> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f105172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f105173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f105174c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(g.valueOf(parcel.readString()));
            }
            return new ScreenerSortingOptions(arrayList, g.valueOf(parcel.readString()), i.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ScreenerSortingOptions[i];
        }
    }

    public ScreenerSortingOptions(List metrics, g selectedMetric, i sortOrder) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(selectedMetric, "selectedMetric");
        Intrinsics.checkNotNullParameter(sortOrder, "sortOrder");
        this.f105172a = metrics;
        this.f105173b = selectedMetric;
        this.f105174c = sortOrder;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ScreenerSortingOptions)) {
            return false;
        }
        ScreenerSortingOptions screenerSortingOptions = (ScreenerSortingOptions) obj2;
        return Intrinsics.f(this.f105172a, screenerSortingOptions.f105172a) && this.f105173b == screenerSortingOptions.f105173b && this.f105174c == screenerSortingOptions.f105174c;
    }

    public final int hashCode() {
        return this.f105174c.hashCode() + ((this.f105173b.hashCode() + (this.f105172a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f105172a, dest);
        while (itV.hasNext()) {
            dest.writeString(((g) itV.next()).name());
        }
        dest.writeString(this.f105173b.name());
        dest.writeString(this.f105174c.name());
    }
}
