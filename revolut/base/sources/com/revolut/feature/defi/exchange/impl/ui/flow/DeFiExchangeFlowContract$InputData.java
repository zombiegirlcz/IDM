package com.revolut.feature.defi.exchange.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.kompot.common.IOData$Input;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wd6.e;
import xi0.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/defi/exchange/impl/ui/flow/DeFiExchangeFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_defi_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeFiExchangeFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<DeFiExchangeFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f71784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f71785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f71786c;
    public final h46.a d;
    public final FundingSource e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            e eVarValueOf = e.valueOf(parcel.readString());
            b bVar = (b) parcel.readSerializable();
            String string = parcel.readString();
            return new DeFiExchangeFlowContract$InputData((FundingSource) parcel.readParcelable(DeFiExchangeFlowContract$InputData.class.getClassLoader()), h46.a.valueOf(parcel.readString()), string, eVarValueOf, bVar);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeFiExchangeFlowContract$InputData[i];
        }
    }

    public DeFiExchangeFlowContract$InputData(FundingSource fundingSource, h46.a entryPoint, String deFiAccountId, e side, b targetCurrency) {
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(deFiAccountId, "deFiAccountId");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        this.f71784a = side;
        this.f71785b = targetCurrency;
        this.f71786c = deFiAccountId;
        this.d = entryPoint;
        this.e = fundingSource;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DeFiExchangeFlowContract$InputData)) {
            return false;
        }
        DeFiExchangeFlowContract$InputData deFiExchangeFlowContract$InputData = (DeFiExchangeFlowContract$InputData) obj2;
        return this.f71784a == deFiExchangeFlowContract$InputData.f71784a && Intrinsics.f(this.f71785b, deFiExchangeFlowContract$InputData.f71785b) && Intrinsics.f(this.f71786c, deFiExchangeFlowContract$InputData.f71786c) && this.d == deFiExchangeFlowContract$InputData.d && Intrinsics.f(this.e, deFiExchangeFlowContract$InputData.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + p.a.c(l.j(this.f71785b, this.f71784a.hashCode() * 31, 31), 31, this.f71786c)) * 31;
        FundingSource fundingSource = this.e;
        return iHashCode + (fundingSource == null ? 0 : fundingSource.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71784a.name());
        dest.writeSerializable(this.f71785b);
        dest.writeString(this.f71786c);
        dest.writeString(this.d.name());
        dest.writeParcelable(this.e, i);
    }
}
