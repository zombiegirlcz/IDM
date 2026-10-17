package com.revolut.retail.feature.stockdetails.impl.ui.flows.etf_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.stockdetails.api.navigation.StartNavigation;
import eel.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/stockdetails/impl/ui/flows/etf_details/EtfDetailsFlowControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EtfDetailsFlowControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EtfDetailsFlowControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f103837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StartNavigation.OrderFlow f103838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f103839c;
    public final c d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EtfDetailsFlowControllerContract$InputData(parcel.readString(), (StartNavigation.OrderFlow) parcel.readParcelable(EtfDetailsFlowControllerContract$InputData.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : c.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EtfDetailsFlowControllerContract$InputData[i];
        }
    }

    public EtfDetailsFlowControllerContract$InputData(String ref2, StartNavigation.OrderFlow orderFlow, boolean z, c cVar) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f103837a = ref2;
        this.f103838b = orderFlow;
        this.f103839c = z;
        this.d = cVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EtfDetailsFlowControllerContract$InputData)) {
            return false;
        }
        EtfDetailsFlowControllerContract$InputData etfDetailsFlowControllerContract$InputData = (EtfDetailsFlowControllerContract$InputData) obj2;
        return Intrinsics.f(this.f103837a, etfDetailsFlowControllerContract$InputData.f103837a) && Intrinsics.f(this.f103838b, etfDetailsFlowControllerContract$InputData.f103838b) && this.f103839c == etfDetailsFlowControllerContract$InputData.f103839c && this.d == etfDetailsFlowControllerContract$InputData.d;
    }

    public final int hashCode() {
        int iHashCode = this.f103837a.hashCode() * 31;
        StartNavigation.OrderFlow orderFlow = this.f103838b;
        int iC = j6.a.c((iHashCode + (orderFlow == null ? 0 : orderFlow.hashCode())) * 31, 31, this.f103839c);
        c cVar = this.d;
        return iC + (cVar != null ? cVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f103837a);
        dest.writeParcelable(this.f103838b, i);
        dest.writeInt(this.f103839c ? 1 : 0);
        c cVar = this.d;
        if (cVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(cVar.name());
        }
    }
}
