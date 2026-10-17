package com.revolut.feature.defi.exchange.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigInteger;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sii.a;
import yhm.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/defi/exchange/impl/domain/model/DeFiSwapSourceAmount;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_defi_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeFiSwapSourceAmount implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeFiSwapSource f71741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigInteger f71742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f71743c;
    public final Lazy d;

    @NotNull
    public static final Parcelable.Creator<DeFiSwapSourceAmount> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeFiSwapSourceAmount((DeFiSwapSource) parcel.readParcelable(DeFiSwapSourceAmount.class.getClassLoader()), (BigInteger) parcel.readSerializable(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeFiSwapSourceAmount[i];
        }
    }

    public DeFiSwapSourceAmount(DeFiSwapSource source, BigInteger amount, int i) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f71741a = source;
        this.f71742b = amount;
        this.f71743c = i;
        this.d = j.b(new a(this, 18));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DeFiSwapSourceAmount)) {
            return false;
        }
        DeFiSwapSourceAmount deFiSwapSourceAmount = (DeFiSwapSourceAmount) obj2;
        return Intrinsics.f(this.f71741a, deFiSwapSourceAmount.f71741a) && Intrinsics.f(this.f71742b, deFiSwapSourceAmount.f71742b) && this.f71743c == deFiSwapSourceAmount.f71743c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f71743c) + ((this.f71742b.hashCode() + (this.f71741a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f71741a, i);
        dest.writeSerializable(this.f71742b);
        dest.writeInt(this.f71743c);
    }
}
