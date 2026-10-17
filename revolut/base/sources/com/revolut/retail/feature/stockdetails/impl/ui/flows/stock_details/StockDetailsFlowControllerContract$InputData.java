package com.revolut.retail.feature.stockdetails.impl.ui.flows.stock_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.stockdetails.api.navigation.StartNavigation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vqk.c;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/stockdetails/impl/ui/flows/stock_details/StockDetailsFlowControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StockDetailsFlowControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<StockDetailsFlowControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f103875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f103876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StartNavigation.OrderFlow f103877c;
    public final StartNavigation.InsightsFlow d;
    public final boolean e;
    public final eel.c f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StockDetailsFlowControllerContract$InputData(parcel.readString(), parcel.readInt() == 0 ? null : c.valueOf(parcel.readString()), (StartNavigation.OrderFlow) parcel.readParcelable(StockDetailsFlowControllerContract$InputData.class.getClassLoader()), (StartNavigation.InsightsFlow) parcel.readParcelable(StockDetailsFlowControllerContract$InputData.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0 ? eel.c.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StockDetailsFlowControllerContract$InputData[i];
        }
    }

    public StockDetailsFlowControllerContract$InputData(String ref2, c cVar, StartNavigation.OrderFlow orderFlow, StartNavigation.InsightsFlow insightsFlow, boolean z, eel.c cVar2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f103875a = ref2;
        this.f103876b = cVar;
        this.f103877c = orderFlow;
        this.d = insightsFlow;
        this.e = z;
        this.f = cVar2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StockDetailsFlowControllerContract$InputData)) {
            return false;
        }
        StockDetailsFlowControllerContract$InputData stockDetailsFlowControllerContract$InputData = (StockDetailsFlowControllerContract$InputData) obj2;
        return Intrinsics.f(this.f103875a, stockDetailsFlowControllerContract$InputData.f103875a) && this.f103876b == stockDetailsFlowControllerContract$InputData.f103876b && Intrinsics.f(this.f103877c, stockDetailsFlowControllerContract$InputData.f103877c) && Intrinsics.f(this.d, stockDetailsFlowControllerContract$InputData.d) && this.e == stockDetailsFlowControllerContract$InputData.e && this.f == stockDetailsFlowControllerContract$InputData.f;
    }

    public final int hashCode() {
        int iHashCode = this.f103875a.hashCode() * 31;
        c cVar = this.f103876b;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        StartNavigation.OrderFlow orderFlow = this.f103877c;
        int iHashCode3 = (iHashCode2 + (orderFlow == null ? 0 : orderFlow.hashCode())) * 31;
        StartNavigation.InsightsFlow insightsFlow = this.d;
        int iC = j6.a.c((iHashCode3 + (insightsFlow == null ? 0 : insightsFlow.f103741a.hashCode())) * 31, 31, this.e);
        eel.c cVar2 = this.f;
        return iC + (cVar2 != null ? cVar2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f103875a);
        c cVar = this.f103876b;
        if (cVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(cVar.name());
        }
        dest.writeParcelable(this.f103877c, i);
        dest.writeParcelable(this.d, i);
        dest.writeInt(this.e ? 1 : 0);
        eel.c cVar2 = this.f;
        if (cVar2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(cVar2.name());
        }
    }
}
