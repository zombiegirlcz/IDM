package com.revolut.retail.feature.cryptocommoditydetails.impl.ui.price_targets.details.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ncj.d;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/cryptocommoditydetails/impl/ui/price_targets/details/flow/PriceTargetsDetailsFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_cryptocommodity_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PriceTargetsDetailsFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PriceTargetsDetailsFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f100147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f100148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f100149c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PriceTargetsDetailsFlowContract$InputData((b) parcel.readSerializable(), (b) parcel.readSerializable(), d.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PriceTargetsDetailsFlowContract$InputData[i];
        }
    }

    public PriceTargetsDetailsFlowContract$InputData(b currency, b baseCurrency, d chartType) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(chartType, "chartType");
        this.f100147a = currency;
        this.f100148b = baseCurrency;
        this.f100149c = chartType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PriceTargetsDetailsFlowContract$InputData)) {
            return false;
        }
        PriceTargetsDetailsFlowContract$InputData priceTargetsDetailsFlowContract$InputData = (PriceTargetsDetailsFlowContract$InputData) obj2;
        return Intrinsics.f(this.f100147a, priceTargetsDetailsFlowContract$InputData.f100147a) && Intrinsics.f(this.f100148b, priceTargetsDetailsFlowContract$InputData.f100148b) && this.f100149c == priceTargetsDetailsFlowContract$InputData.f100149c;
    }

    public final int hashCode() {
        return this.f100149c.hashCode() + l.j(this.f100148b, this.f100147a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f100147a);
        dest.writeSerializable(this.f100148b);
        dest.writeString(this.f100149c.name());
    }
}
