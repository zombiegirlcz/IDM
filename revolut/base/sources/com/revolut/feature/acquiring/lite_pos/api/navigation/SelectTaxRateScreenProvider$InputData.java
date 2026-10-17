package com.revolut.feature.acquiring.lite_pos.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.acquiring.lite_pos.api.model.TaxRate;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/acquiring/lite_pos/api/navigation/SelectTaxRateScreenProvider$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_acquiring_lite_pos_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SelectTaxRateScreenProvider$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SelectTaxRateScreenProvider$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaxRate f60702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f60703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f60704c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SelectTaxRateScreenProvider$InputData(parcel.readInt() == 0 ? null : TaxRate.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SelectTaxRateScreenProvider$InputData[i];
        }
    }

    public SelectTaxRateScreenProvider$InputData(TaxRate taxRate, boolean z, boolean z3) {
        this.f60702a = taxRate;
        this.f60703b = z;
        this.f60704c = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SelectTaxRateScreenProvider$InputData)) {
            return false;
        }
        SelectTaxRateScreenProvider$InputData selectTaxRateScreenProvider$InputData = (SelectTaxRateScreenProvider$InputData) obj2;
        return Intrinsics.f(this.f60702a, selectTaxRateScreenProvider$InputData.f60702a) && this.f60703b == selectTaxRateScreenProvider$InputData.f60703b && this.f60704c == selectTaxRateScreenProvider$InputData.f60704c;
    }

    public final int hashCode() {
        TaxRate taxRate = this.f60702a;
        return Boolean.hashCode(this.f60704c) + j6.a.c((taxRate == null ? 0 : taxRate.hashCode()) * 31, 31, this.f60703b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        TaxRate taxRate = this.f60702a;
        if (taxRate == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            taxRate.writeToParcel(dest, i);
        }
        dest.writeInt(this.f60703b ? 1 : 0);
        dest.writeInt(this.f60704c ? 1 : 0);
    }
}
