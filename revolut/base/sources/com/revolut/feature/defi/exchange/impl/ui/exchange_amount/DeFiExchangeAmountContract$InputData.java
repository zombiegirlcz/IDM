package com.revolut.feature.defi.exchange.impl.ui.exchange_amount;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wd6.e;
import wp5.y;
import xi0.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/defi/exchange/impl/ui/exchange_amount/DeFiExchangeAmountContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_defi_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeFiExchangeAmountContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<DeFiExchangeAmountContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f71756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f71757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f71758c;
    public final h46.a d;
    public final FundingSource e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            b bVar = (b) parcel.readSerializable();
            String string = parcel.readString();
            e eVarValueOf = e.valueOf(parcel.readString());
            return new DeFiExchangeAmountContract$InputData((FundingSource) parcel.readParcelable(DeFiExchangeAmountContract$InputData.class.getClassLoader()), h46.a.valueOf(parcel.readString()), string, eVarValueOf, bVar);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeFiExchangeAmountContract$InputData[i];
        }
    }

    public DeFiExchangeAmountContract$InputData(FundingSource fundingSource, h46.a entryPoint, String deFiAccountId, e side, b targetCurrency) {
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(deFiAccountId, "deFiAccountId");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        this.f71756a = targetCurrency;
        this.f71757b = deFiAccountId;
        this.f71758c = side;
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
        if (!(obj2 instanceof DeFiExchangeAmountContract$InputData)) {
            return false;
        }
        DeFiExchangeAmountContract$InputData deFiExchangeAmountContract$InputData = (DeFiExchangeAmountContract$InputData) obj2;
        return Intrinsics.f(this.f71756a, deFiExchangeAmountContract$InputData.f71756a) && Intrinsics.f(this.f71757b, deFiExchangeAmountContract$InputData.f71757b) && this.f71758c == deFiExchangeAmountContract$InputData.f71758c && this.d == deFiExchangeAmountContract$InputData.d && Intrinsics.f(this.e, deFiExchangeAmountContract$InputData.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + y.g(this.f71758c, p.a.c(this.f71756a.hashCode() * 31, 31, this.f71757b), 31)) * 31;
        FundingSource fundingSource = this.e;
        return iHashCode + (fundingSource == null ? 0 : fundingSource.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f71756a);
        dest.writeString(this.f71757b);
        dest.writeString(this.f71758c.name());
        dest.writeString(this.d.name());
        dest.writeParcelable(this.e, i);
    }
}
