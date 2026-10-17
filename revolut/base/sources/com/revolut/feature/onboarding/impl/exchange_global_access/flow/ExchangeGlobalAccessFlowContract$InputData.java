package com.revolut.feature.onboarding.impl.exchange_global_access.flow;

import android.os.Parcel;
import android.os.Parcelable;
import bla.c;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.core.navigation.NaviCommand;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/onboarding/impl/exchange_global_access/flow/ExchangeGlobalAccessFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExchangeGlobalAccessFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ExchangeGlobalAccessFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NaviCommand f78261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f78262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsProduct f78263c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ExchangeGlobalAccessFlowContract$InputData(parcel.readInt() == 0 ? null : c.valueOf(parcel.readString()), (AnalyticsProduct) parcel.readParcelable(ExchangeGlobalAccessFlowContract$InputData.class.getClassLoader()), (NaviCommand) parcel.readParcelable(ExchangeGlobalAccessFlowContract$InputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExchangeGlobalAccessFlowContract$InputData[i];
        }
    }

    public ExchangeGlobalAccessFlowContract$InputData(c cVar, AnalyticsProduct analyticsProduct, NaviCommand naviCommand, boolean z) {
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f78261a = naviCommand;
        this.f78262b = cVar;
        this.f78263c = analyticsProduct;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ExchangeGlobalAccessFlowContract$InputData)) {
            return false;
        }
        ExchangeGlobalAccessFlowContract$InputData exchangeGlobalAccessFlowContract$InputData = (ExchangeGlobalAccessFlowContract$InputData) obj2;
        return Intrinsics.f(this.f78261a, exchangeGlobalAccessFlowContract$InputData.f78261a) && this.f78262b == exchangeGlobalAccessFlowContract$InputData.f78262b && Intrinsics.f(this.f78263c, exchangeGlobalAccessFlowContract$InputData.f78263c) && this.d == exchangeGlobalAccessFlowContract$InputData.d;
    }

    public final int hashCode() {
        NaviCommand naviCommand = this.f78261a;
        int iHashCode = (naviCommand == null ? 0 : naviCommand.hashCode()) * 31;
        c cVar = this.f78262b;
        return Boolean.hashCode(this.d) + l.a((iHashCode + (cVar != null ? cVar.hashCode() : 0)) * 31, 31, this.f78263c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f78261a, i);
        c cVar = this.f78262b;
        if (cVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(cVar.name());
        }
        dest.writeParcelable(this.f78263c, i);
        dest.writeInt(this.d ? 1 : 0);
    }

    public /* synthetic */ ExchangeGlobalAccessFlowContract$InputData(NaviCommand naviCommand, AnalyticsProduct analyticsProduct, boolean z) {
        this(null, analyticsProduct, naviCommand, z);
    }
}
