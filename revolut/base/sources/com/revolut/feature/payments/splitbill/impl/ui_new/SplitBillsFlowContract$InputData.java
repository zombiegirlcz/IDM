package com.revolut.feature.payments.splitbill.impl.ui_new;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.splitbill.api.navigation.SplitBillConfiguration;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/payments/splitbill/impl/ui_new/SplitBillsFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_payments_splitbill_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SplitBillsFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SplitBillsFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SplitBillConfiguration f79834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0a.a f79835b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SplitBillsFlowContract$InputData((SplitBillConfiguration) parcel.readParcelable(SplitBillsFlowContract$InputData.class.getClassLoader()), parcel.readInt() == 0 ? null : x0a.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SplitBillsFlowContract$InputData[i];
        }
    }

    public SplitBillsFlowContract$InputData(SplitBillConfiguration config, x0a.a aVar) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f79834a = config;
        this.f79835b = aVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SplitBillsFlowContract$InputData)) {
            return false;
        }
        SplitBillsFlowContract$InputData splitBillsFlowContract$InputData = (SplitBillsFlowContract$InputData) obj2;
        return Intrinsics.f(this.f79834a, splitBillsFlowContract$InputData.f79834a) && this.f79835b == splitBillsFlowContract$InputData.f79835b;
    }

    public final int hashCode() {
        int iHashCode = this.f79834a.hashCode() * 31;
        x0a.a aVar = this.f79835b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f79834a, i);
        x0a.a aVar = this.f79835b;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
    }
}
