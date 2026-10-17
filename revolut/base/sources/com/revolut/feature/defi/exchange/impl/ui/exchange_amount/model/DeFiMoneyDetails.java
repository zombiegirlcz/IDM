package com.revolut.feature.defi.exchange.impl.ui.exchange_amount.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kyh.f;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/defi/exchange/impl/ui/exchange_amount/model/DeFiMoneyDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_defi_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeFiMoneyDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DeFiMoneyDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f71768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigInteger f71769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f71770c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeFiMoneyDetails((b) parcel.readSerializable(), (BigInteger) parcel.readSerializable(), parcel.readInt() == 0 ? null : f.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeFiMoneyDetails[i];
        }
    }

    public DeFiMoneyDetails(b currency, BigInteger bigInteger, f fVar, boolean z) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f71768a = currency;
        this.f71769b = bigInteger;
        this.f71770c = fVar;
        this.d = z;
    }

    public static DeFiMoneyDetails a(DeFiMoneyDetails deFiMoneyDetails, b currency, BigInteger bigInteger, f fVar, boolean z, int i) {
        if ((i & 1) != 0) {
            currency = deFiMoneyDetails.f71768a;
        }
        if ((i & 2) != 0) {
            bigInteger = deFiMoneyDetails.f71769b;
        }
        if ((i & 4) != 0) {
            fVar = deFiMoneyDetails.f71770c;
        }
        if ((i & 8) != 0) {
            z = deFiMoneyDetails.d;
        }
        deFiMoneyDetails.getClass();
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new DeFiMoneyDetails(currency, bigInteger, fVar, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DeFiMoneyDetails)) {
            return false;
        }
        DeFiMoneyDetails deFiMoneyDetails = (DeFiMoneyDetails) obj2;
        return Intrinsics.f(this.f71768a, deFiMoneyDetails.f71768a) && Intrinsics.f(this.f71769b, deFiMoneyDetails.f71769b) && this.f71770c == deFiMoneyDetails.f71770c && this.d == deFiMoneyDetails.d;
    }

    public final int hashCode() {
        int iHashCode = this.f71768a.hashCode() * 31;
        BigInteger bigInteger = this.f71769b;
        int iHashCode2 = (iHashCode + (bigInteger == null ? 0 : bigInteger.hashCode())) * 31;
        f fVar = this.f71770c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (fVar != null ? fVar.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f71768a);
        dest.writeSerializable(this.f71769b);
        f fVar = this.f71770c;
        if (fVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(fVar.name());
        }
        dest.writeInt(this.d ? 1 : 0);
    }

    public /* synthetic */ DeFiMoneyDetails(b bVar) {
        this(bVar, null, null, false);
    }
}
