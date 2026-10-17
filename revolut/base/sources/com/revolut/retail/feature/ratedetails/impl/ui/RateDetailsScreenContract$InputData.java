package com.revolut.retail.feature.ratedetails.impl.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.exchange.models.BuyFundingCurrencyPrefill;
import com.revolut.kompot.common.IOData$Input;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/ratedetails/impl/ui/RateDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_rate_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RateDetailsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RateDetailsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f103727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f103728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f103729c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f103730g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final BuyFundingCurrencyPrefill f103731h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            boolean z4;
            boolean z6;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            b bVar = (b) parcel.readSerializable();
            b bVar2 = (b) parcel.readSerializable();
            boolean z11 = false;
            boolean z12 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z11 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = true;
                z12 = z;
            }
            if (parcel.readInt() != 0) {
                z4 = z3;
            } else {
                z4 = z3;
                z3 = z;
            }
            if (parcel.readInt() != 0) {
                z6 = z4;
            } else {
                z6 = z4;
                z4 = z;
            }
            if (parcel.readInt() == 0) {
                z6 = z;
            }
            return new RateDetailsScreenContract$InputData(bVar, bVar2, z11, z12, z3, z4, z6, (BuyFundingCurrencyPrefill) parcel.readParcelable(RateDetailsScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RateDetailsScreenContract$InputData[i];
        }
    }

    public RateDetailsScreenContract$InputData(b currencyFrom, b currencyTo, boolean z, boolean z3, boolean z4, boolean z6, boolean z11, BuyFundingCurrencyPrefill buyFundingCurrencyPrefill) {
        Intrinsics.checkNotNullParameter(currencyFrom, "currencyFrom");
        Intrinsics.checkNotNullParameter(currencyTo, "currencyTo");
        this.f103727a = currencyFrom;
        this.f103728b = currencyTo;
        this.f103729c = z;
        this.d = z3;
        this.e = z4;
        this.f = z6;
        this.f103730g = z11;
        this.f103731h = buyFundingCurrencyPrefill;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RateDetailsScreenContract$InputData)) {
            return false;
        }
        RateDetailsScreenContract$InputData rateDetailsScreenContract$InputData = (RateDetailsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f103727a, rateDetailsScreenContract$InputData.f103727a) && Intrinsics.f(this.f103728b, rateDetailsScreenContract$InputData.f103728b) && this.f103729c == rateDetailsScreenContract$InputData.f103729c && this.d == rateDetailsScreenContract$InputData.d && this.e == rateDetailsScreenContract$InputData.e && this.f == rateDetailsScreenContract$InputData.f && this.f103730g == rateDetailsScreenContract$InputData.f103730g && Intrinsics.f(this.f103731h, rateDetailsScreenContract$InputData.f103731h);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(l.j(this.f103728b, this.f103727a.hashCode() * 31, 31), 31, this.f103729c), 31, this.d), 31, this.e), 31, this.f), 31, this.f103730g);
        BuyFundingCurrencyPrefill buyFundingCurrencyPrefill = this.f103731h;
        return iC + (buyFundingCurrencyPrefill == null ? 0 : buyFundingCurrencyPrefill.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f103727a);
        dest.writeSerializable(this.f103728b);
        dest.writeInt(this.f103729c ? 1 : 0);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeInt(this.f103730g ? 1 : 0);
        dest.writeParcelable(this.f103731h, i);
    }
}
