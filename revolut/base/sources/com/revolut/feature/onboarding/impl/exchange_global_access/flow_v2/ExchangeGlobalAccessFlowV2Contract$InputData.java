package com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/onboarding/impl/exchange_global_access/flow_v2/ExchangeGlobalAccessFlowV2Contract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExchangeGlobalAccessFlowV2Contract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ExchangeGlobalAccessFlowV2Contract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsProduct f78270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bla.c f78271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f78272c;
    public final NaviCommand d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ExchangeGlobalAccessFlowV2Contract$InputData(parcel.readInt() == 0 ? null : bla.c.valueOf(parcel.readString()), (AnalyticsProduct) parcel.readParcelable(ExchangeGlobalAccessFlowV2Contract$InputData.class.getClassLoader()), (NaviCommand) parcel.readParcelable(ExchangeGlobalAccessFlowV2Contract$InputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExchangeGlobalAccessFlowV2Contract$InputData[i];
        }
    }

    public ExchangeGlobalAccessFlowV2Contract$InputData(bla.c cVar, AnalyticsProduct analyticsProduct, NaviCommand naviCommand, boolean z) {
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f78270a = analyticsProduct;
        this.f78271b = cVar;
        this.f78272c = z;
        this.d = naviCommand;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ExchangeGlobalAccessFlowV2Contract$InputData)) {
            return false;
        }
        ExchangeGlobalAccessFlowV2Contract$InputData exchangeGlobalAccessFlowV2Contract$InputData = (ExchangeGlobalAccessFlowV2Contract$InputData) obj2;
        return Intrinsics.f(this.f78270a, exchangeGlobalAccessFlowV2Contract$InputData.f78270a) && this.f78271b == exchangeGlobalAccessFlowV2Contract$InputData.f78271b && this.f78272c == exchangeGlobalAccessFlowV2Contract$InputData.f78272c && Intrinsics.f(this.d, exchangeGlobalAccessFlowV2Contract$InputData.d);
    }

    public final int hashCode() {
        int iHashCode = this.f78270a.hashCode() * 31;
        bla.c cVar = this.f78271b;
        int iC = j6.a.c((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31, 31, this.f78272c);
        NaviCommand naviCommand = this.d;
        return iC + (naviCommand != null ? naviCommand.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f78270a, i);
        bla.c cVar = this.f78271b;
        if (cVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(cVar.name());
        }
        dest.writeInt(this.f78272c ? 1 : 0);
        dest.writeParcelable(this.d, i);
    }
}
