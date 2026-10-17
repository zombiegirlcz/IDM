package com.revolut.retail.feature.stockdetails.impl.ui.flows.insights;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/stockdetails/impl/ui/flows/insights/InsightsFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InsightsFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<InsightsFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f103849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f103850b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InsightsFlowContract$InputData(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InsightsFlowContract$InputData[i];
        }
    }

    public InsightsFlowContract$InputData(String ref2, boolean z) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f103849a = ref2;
        this.f103850b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InsightsFlowContract$InputData)) {
            return false;
        }
        InsightsFlowContract$InputData insightsFlowContract$InputData = (InsightsFlowContract$InputData) obj2;
        return Intrinsics.f(this.f103849a, insightsFlowContract$InputData.f103849a) && this.f103850b == insightsFlowContract$InputData.f103850b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f103850b) + (this.f103849a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f103849a);
        dest.writeInt(this.f103850b ? 1 : 0);
    }
}
