package com.revolut.feature.wealth.models.portfolio_metrics;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/models/portfolio_metrics/RegionSubclassAllocation;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RegionSubclassAllocation implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RegionSubclassAllocation> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qdh.a f95691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f95692b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RegionSubclassAllocation((BigDecimal) parcel.readSerializable(), qdh.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RegionSubclassAllocation[i];
        }
    }

    public RegionSubclassAllocation(BigDecimal allocation, qdh.a region) {
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(allocation, "allocation");
        this.f95691a = region;
        this.f95692b = allocation;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RegionSubclassAllocation)) {
            return false;
        }
        RegionSubclassAllocation regionSubclassAllocation = (RegionSubclassAllocation) obj2;
        return this.f95691a == regionSubclassAllocation.f95691a && Intrinsics.f(this.f95692b, regionSubclassAllocation.f95692b);
    }

    public final int hashCode() {
        return this.f95692b.hashCode() + (this.f95691a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f95691a.name());
        dest.writeSerializable(this.f95692b);
    }
}
