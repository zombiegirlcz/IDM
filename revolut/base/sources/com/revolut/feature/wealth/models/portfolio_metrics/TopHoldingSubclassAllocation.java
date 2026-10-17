package com.revolut.feature.wealth.models.portfolio_metrics;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/models/portfolio_metrics/TopHoldingSubclassAllocation;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TopHoldingSubclassAllocation implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TopHoldingSubclassAllocation> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f95695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f95696b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TopHoldingSubclassAllocation(parcel.readString(), (BigDecimal) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TopHoldingSubclassAllocation[i];
        }
    }

    public TopHoldingSubclassAllocation(String ref2, BigDecimal allocation) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(allocation, "allocation");
        this.f95695a = ref2;
        this.f95696b = allocation;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TopHoldingSubclassAllocation)) {
            return false;
        }
        TopHoldingSubclassAllocation topHoldingSubclassAllocation = (TopHoldingSubclassAllocation) obj2;
        return Intrinsics.f(this.f95695a, topHoldingSubclassAllocation.f95695a) && Intrinsics.f(this.f95696b, topHoldingSubclassAllocation.f95696b);
    }

    public final int hashCode() {
        return this.f95696b.hashCode() + (this.f95695a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f95695a);
        dest.writeSerializable(this.f95696b);
    }
}
