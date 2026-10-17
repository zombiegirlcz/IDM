package com.revolut.retail.feature.stockdetails.impl.ui.screens.insights;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/stockdetails/impl/ui/screens/insights/InsightsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InsightsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<InsightsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f104019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f104020b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InsightsScreenContract$InputData(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InsightsScreenContract$InputData[i];
        }
    }

    public InsightsScreenContract$InputData(String ref2, boolean z) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f104019a = ref2;
        this.f104020b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InsightsScreenContract$InputData)) {
            return false;
        }
        InsightsScreenContract$InputData insightsScreenContract$InputData = (InsightsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f104019a, insightsScreenContract$InputData.f104019a) && this.f104020b == insightsScreenContract$InputData.f104020b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f104020b) + (this.f104019a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f104019a);
        dest.writeInt(this.f104020b ? 1 : 0);
    }
}
