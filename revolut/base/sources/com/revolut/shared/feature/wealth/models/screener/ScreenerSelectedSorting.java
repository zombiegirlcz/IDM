package com.revolut.shared.feature.wealth.models.screener;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zel.g;
import zel.i;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/screener/ScreenerSelectedSorting;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ScreenerSelectedSorting implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ScreenerSelectedSorting> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f105170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f105171b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ScreenerSelectedSorting(g.valueOf(parcel.readString()), i.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ScreenerSelectedSorting[i];
        }
    }

    public ScreenerSelectedSorting(g metric, i sortOrder) {
        Intrinsics.checkNotNullParameter(metric, "metric");
        Intrinsics.checkNotNullParameter(sortOrder, "sortOrder");
        this.f105170a = metric;
        this.f105171b = sortOrder;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ScreenerSelectedSorting)) {
            return false;
        }
        ScreenerSelectedSorting screenerSelectedSorting = (ScreenerSelectedSorting) obj2;
        return this.f105170a == screenerSelectedSorting.f105170a && this.f105171b == screenerSelectedSorting.f105171b;
    }

    public final int hashCode() {
        return this.f105171b.hashCode() + (this.f105170a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f105170a.name());
        dest.writeString(this.f105171b.name());
    }
}
