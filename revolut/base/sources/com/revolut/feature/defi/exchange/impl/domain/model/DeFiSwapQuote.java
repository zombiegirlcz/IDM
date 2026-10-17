package com.revolut.feature.defi.exchange.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.defi.common.models.domain.DeFiAssetAmount;
import com.revolut.feature.defi.common.models.domain.DeFiFee;
import com.revolut.feature.defi.common.models.domain.DeFiFiatAmount;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/defi/exchange/impl/domain/model/DeFiSwapQuote;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_defi_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeFiSwapQuote implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DeFiSwapSourceAmount f71724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DeFiFiatAmount f71725c;
    public final DeFiAssetAmount d;
    public final DeFiFiatAmount e;
    public final DeFiSwapSourceAmount f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DeFiSwapRate f71726g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f71727h;
    public final DeFiFee i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Instant f71728j;
    public final String k;

    @NotNull
    public static final Parcelable.Creator<DeFiSwapQuote> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            Parcelable.Creator<DeFiSwapSourceAmount> creator = DeFiSwapSourceAmount.CREATOR;
            return new DeFiSwapQuote(string, creator.createFromParcel(parcel), (DeFiFiatAmount) parcel.readParcelable(DeFiSwapQuote.class.getClassLoader()), (DeFiAssetAmount) parcel.readParcelable(DeFiSwapQuote.class.getClassLoader()), (DeFiFiatAmount) parcel.readParcelable(DeFiSwapQuote.class.getClassLoader()), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), DeFiSwapRate.CREATOR.createFromParcel(parcel), parcel.readString(), (DeFiFee) parcel.readParcelable(DeFiSwapQuote.class.getClassLoader()), (Instant) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeFiSwapQuote[i];
        }
    }

    public DeFiSwapQuote(String accountId, DeFiSwapSourceAmount amountIn, DeFiFiatAmount amountInFiat, DeFiAssetAmount amountOut, DeFiFiatAmount amountOutFiat, DeFiSwapSourceAmount deFiSwapSourceAmount, DeFiSwapRate rate, String side, DeFiFee fee2, Instant expiresAt, String signature) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(amountIn, "amountIn");
        Intrinsics.checkNotNullParameter(amountInFiat, "amountInFiat");
        Intrinsics.checkNotNullParameter(amountOut, "amountOut");
        Intrinsics.checkNotNullParameter(amountOutFiat, "amountOutFiat");
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(fee2, "fee");
        Intrinsics.checkNotNullParameter(expiresAt, "expiresAt");
        Intrinsics.checkNotNullParameter(signature, "signature");
        this.f71723a = accountId;
        this.f71724b = amountIn;
        this.f71725c = amountInFiat;
        this.d = amountOut;
        this.e = amountOutFiat;
        this.f = deFiSwapSourceAmount;
        this.f71726g = rate;
        this.f71727h = side;
        this.i = fee2;
        this.f71728j = expiresAt;
        this.k = signature;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DeFiSwapQuote)) {
            return false;
        }
        DeFiSwapQuote deFiSwapQuote = (DeFiSwapQuote) obj2;
        return Intrinsics.f(this.f71723a, deFiSwapQuote.f71723a) && Intrinsics.f(this.f71724b, deFiSwapQuote.f71724b) && Intrinsics.f(this.f71725c, deFiSwapQuote.f71725c) && Intrinsics.f(this.d, deFiSwapQuote.d) && Intrinsics.f(this.e, deFiSwapQuote.e) && Intrinsics.f(this.f, deFiSwapQuote.f) && Intrinsics.f(this.f71726g, deFiSwapQuote.f71726g) && Intrinsics.f(this.f71727h, deFiSwapQuote.f71727h) && Intrinsics.f(this.i, deFiSwapQuote.i) && Intrinsics.f(this.f71728j, deFiSwapQuote.f71728j) && Intrinsics.f(this.k, deFiSwapQuote.k);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.f71725c.hashCode() + ((this.f71724b.hashCode() + (this.f71723a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        DeFiSwapSourceAmount deFiSwapSourceAmount = this.f;
        return this.k.hashCode() + r6.b.c((this.i.hashCode() + a.c((this.f71726g.hashCode() + ((iHashCode + (deFiSwapSourceAmount == null ? 0 : deFiSwapSourceAmount.hashCode())) * 31)) * 31, 31, this.f71727h)) * 31, 31, this.f71728j);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71723a);
        this.f71724b.writeToParcel(dest, i);
        dest.writeParcelable(this.f71725c, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        DeFiSwapSourceAmount deFiSwapSourceAmount = this.f;
        if (deFiSwapSourceAmount == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            deFiSwapSourceAmount.writeToParcel(dest, i);
        }
        this.f71726g.writeToParcel(dest, i);
        dest.writeString(this.f71727h);
        dest.writeParcelable(this.i, i);
        dest.writeSerializable(this.f71728j);
        dest.writeString(this.k);
    }
}
