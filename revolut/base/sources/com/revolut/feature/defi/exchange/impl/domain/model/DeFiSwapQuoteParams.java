package com.revolut.feature.defi.exchange.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import j6.a;
import java.math.BigInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/defi/exchange/impl/domain/model/DeFiSwapQuoteParams;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_defi_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeFiSwapQuoteParams implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DeFiSwapSource f71730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f71731c;
    public final String d;
    public final String e;
    public final BigInteger f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f71732g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f71733h;

    @NotNull
    public static final Parcelable.Creator<DeFiSwapQuoteParams> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeFiSwapQuoteParams(parcel.readString(), (DeFiSwapSource) parcel.readParcelable(DeFiSwapQuoteParams.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), (BigInteger) parcel.readSerializable(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeFiSwapQuoteParams[i];
        }
    }

    public DeFiSwapQuoteParams(String accountId, DeFiSwapSource assetIn, String assetOutId, String assetOutTicker, String assetOutRepresentations, BigInteger amount, int i, String side) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(assetIn, "assetIn");
        Intrinsics.checkNotNullParameter(assetOutId, "assetOutId");
        Intrinsics.checkNotNullParameter(assetOutTicker, "assetOutTicker");
        Intrinsics.checkNotNullParameter(assetOutRepresentations, "assetOutRepresentations");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(side, "side");
        this.f71729a = accountId;
        this.f71730b = assetIn;
        this.f71731c = assetOutId;
        this.d = assetOutTicker;
        this.e = assetOutRepresentations;
        this.f = amount;
        this.f71732g = i;
        this.f71733h = side;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DeFiSwapQuoteParams)) {
            return false;
        }
        DeFiSwapQuoteParams deFiSwapQuoteParams = (DeFiSwapQuoteParams) obj2;
        return Intrinsics.f(this.f71729a, deFiSwapQuoteParams.f71729a) && Intrinsics.f(this.f71730b, deFiSwapQuoteParams.f71730b) && Intrinsics.f(this.f71731c, deFiSwapQuoteParams.f71731c) && Intrinsics.f(this.d, deFiSwapQuoteParams.d) && Intrinsics.f(this.e, deFiSwapQuoteParams.e) && Intrinsics.f(this.f, deFiSwapQuoteParams.f) && this.f71732g == deFiSwapQuoteParams.f71732g && Intrinsics.f(this.f71733h, deFiSwapQuoteParams.f71733h);
    }

    public final int hashCode() {
        return this.f71733h.hashCode() + a.b(this.f71732g, (this.f.hashCode() + p.a.c(p.a.c(p.a.c((this.f71730b.hashCode() + (this.f71729a.hashCode() * 31)) * 31, 31, this.f71731c), 31, this.d), 31, this.e)) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71729a);
        dest.writeParcelable(this.f71730b, i);
        dest.writeString(this.f71731c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeSerializable(this.f);
        dest.writeInt(this.f71732g);
        dest.writeString(this.f71733h);
    }
}
