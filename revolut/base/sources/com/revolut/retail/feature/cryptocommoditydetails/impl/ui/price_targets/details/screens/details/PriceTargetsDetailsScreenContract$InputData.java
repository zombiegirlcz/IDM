package com.revolut.retail.feature.cryptocommoditydetails.impl.ui.price_targets.details.screens.details;

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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/cryptocommoditydetails/impl/ui/price_targets/details/screens/details/PriceTargetsDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_cryptocommodity_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PriceTargetsDetailsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PriceTargetsDetailsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f100157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f100158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f100159c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PriceTargetsDetailsScreenContract$InputData((b) parcel.readSerializable(), (b) parcel.readSerializable(), d.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PriceTargetsDetailsScreenContract$InputData[i];
        }
    }

    public PriceTargetsDetailsScreenContract$InputData(b currency, b baseCurrency, d chartType) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(chartType, "chartType");
        this.f100157a = currency;
        this.f100158b = baseCurrency;
        this.f100159c = chartType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PriceTargetsDetailsScreenContract$InputData)) {
            return false;
        }
        PriceTargetsDetailsScreenContract$InputData priceTargetsDetailsScreenContract$InputData = (PriceTargetsDetailsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f100157a, priceTargetsDetailsScreenContract$InputData.f100157a) && Intrinsics.f(this.f100158b, priceTargetsDetailsScreenContract$InputData.f100158b) && this.f100159c == priceTargetsDetailsScreenContract$InputData.f100159c;
    }

    public final int hashCode() {
        return this.f100159c.hashCode() + l.j(this.f100158b, this.f100157a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f100157a);
        dest.writeSerializable(this.f100158b);
        dest.writeString(this.f100159c.name());
    }
}
