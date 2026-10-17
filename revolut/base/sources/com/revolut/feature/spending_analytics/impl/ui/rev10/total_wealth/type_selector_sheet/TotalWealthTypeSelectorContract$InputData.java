package com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.type_selector_sheet;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/type_selector_sheet/TotalWealthTypeSelectorContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TotalWealthTypeSelectorContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TotalWealthTypeSelectorContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f88045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f88046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f88047c;
    public final int d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            d dVar = (d) parcel.readSerializable();
            return new TotalWealthTypeSelectorContract$InputData(parcel.readInt(), parcel.readInt(), dVar, (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TotalWealthTypeSelectorContract$InputData[i];
        }
    }

    public TotalWealthTypeSelectorContract$InputData(int i, int i2, d assetsTotal, d liabilitiesTotal) {
        Intrinsics.checkNotNullParameter(assetsTotal, "assetsTotal");
        Intrinsics.checkNotNullParameter(liabilitiesTotal, "liabilitiesTotal");
        this.f88045a = assetsTotal;
        this.f88046b = i;
        this.f88047c = liabilitiesTotal;
        this.d = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TotalWealthTypeSelectorContract$InputData)) {
            return false;
        }
        TotalWealthTypeSelectorContract$InputData totalWealthTypeSelectorContract$InputData = (TotalWealthTypeSelectorContract$InputData) obj2;
        return Intrinsics.f(this.f88045a, totalWealthTypeSelectorContract$InputData.f88045a) && this.f88046b == totalWealthTypeSelectorContract$InputData.f88046b && Intrinsics.f(this.f88047c, totalWealthTypeSelectorContract$InputData.f88047c) && this.d == totalWealthTypeSelectorContract$InputData.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + v7.c(j6.a.b(this.f88046b, this.f88045a.hashCode() * 31, 31), 31, this.f88047c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f88045a);
        dest.writeInt(this.f88046b);
        dest.writeSerializable(this.f88047c);
        dest.writeInt(this.d);
    }
}
