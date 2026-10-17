package com.revolut.feature.topup_screen.impl.mcy.mcy_exchange_rate;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.topup.mcy.McyTopUpMethod;
import com.revolut.feature.topup_screen.api.model.TopUpMethodsContext;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/topup_screen/impl/mcy/mcy_exchange_rate/McyExchangeRateScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class McyExchangeRateScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<McyExchangeRateScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f91086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f91087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f91088c;
    public final wi0.b d;
    public final McyTopUpMethod e;
    public final TopUpMethodsContext f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new McyExchangeRateScreenContract$InputData((b) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readInt() != 0, (wi0.b) parcel.readSerializable(), (McyTopUpMethod) parcel.readParcelable(McyExchangeRateScreenContract$InputData.class.getClassLoader()), (TopUpMethodsContext) parcel.readParcelable(McyExchangeRateScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new McyExchangeRateScreenContract$InputData[i];
        }
    }

    public McyExchangeRateScreenContract$InputData(b baseCurrency, d enteredAmount, boolean z, wi0.b countryCode, McyTopUpMethod mcyTopUpMethod, TopUpMethodsContext topUpMethodsContext) {
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(enteredAmount, "enteredAmount");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(topUpMethodsContext, "topUpMethodsContext");
        this.f91086a = baseCurrency;
        this.f91087b = enteredAmount;
        this.f91088c = z;
        this.d = countryCode;
        this.e = mcyTopUpMethod;
        this.f = topUpMethodsContext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof McyExchangeRateScreenContract$InputData)) {
            return false;
        }
        McyExchangeRateScreenContract$InputData mcyExchangeRateScreenContract$InputData = (McyExchangeRateScreenContract$InputData) obj2;
        return Intrinsics.f(this.f91086a, mcyExchangeRateScreenContract$InputData.f91086a) && Intrinsics.f(this.f91087b, mcyExchangeRateScreenContract$InputData.f91087b) && this.f91088c == mcyExchangeRateScreenContract$InputData.f91088c && Intrinsics.f(this.d, mcyExchangeRateScreenContract$InputData.d) && Intrinsics.f(this.e, mcyExchangeRateScreenContract$InputData.e) && Intrinsics.f(this.f, mcyExchangeRateScreenContract$InputData.f);
    }

    public final int hashCode() {
        int iC = p.a.c(j6.a.c(v7.c(this.f91086a.hashCode() * 31, 31, this.f91087b), 31, this.f91088c), 31, this.d.f297794a);
        McyTopUpMethod mcyTopUpMethod = this.e;
        return this.f.hashCode() + ((iC + (mcyTopUpMethod == null ? 0 : mcyTopUpMethod.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f91086a);
        dest.writeSerializable(this.f91087b);
        dest.writeInt(this.f91088c ? 1 : 0);
        dest.writeSerializable(this.d);
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
    }
}
