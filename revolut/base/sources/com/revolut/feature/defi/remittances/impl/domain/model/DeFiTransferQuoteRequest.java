package com.revolut.feature.defi.remittances.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import b36.a;
import b36.d;
import java.math.BigInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/defi/remittances/impl/domain/model/DeFiTransferQuoteRequest;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_defi_remittances_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeFiTransferQuoteRequest implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f71797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f71798c;
    public final BigInteger d;
    public final int e;
    public final a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f71799g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f71800h;
    public final wk5.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f71801j;

    @NotNull
    public static final Parcelable.Creator<DeFiTransferQuoteRequest> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeFiTransferQuoteRequest(parcel.readString(), parcel.readString(), parcel.readString(), (BigInteger) parcel.readSerializable(), parcel.readInt(), a.valueOf(parcel.readString()), parcel.readString(), d.valueOf(parcel.readString()), wk5.a.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeFiTransferQuoteRequest[i];
        }
    }

    public DeFiTransferQuoteRequest(String accountId, String assetInId, String assetInTicker, BigInteger amount, int i, a amountDenomination, String assetOutRepresentations, d side, wk5.a chain, String str) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(assetInId, "assetInId");
        Intrinsics.checkNotNullParameter(assetInTicker, "assetInTicker");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(amountDenomination, "amountDenomination");
        Intrinsics.checkNotNullParameter(assetOutRepresentations, "assetOutRepresentations");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(chain, "chain");
        this.f71796a = accountId;
        this.f71797b = assetInId;
        this.f71798c = assetInTicker;
        this.d = amount;
        this.e = i;
        this.f = amountDenomination;
        this.f71799g = assetOutRepresentations;
        this.f71800h = side;
        this.i = chain;
        this.f71801j = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DeFiTransferQuoteRequest)) {
            return false;
        }
        DeFiTransferQuoteRequest deFiTransferQuoteRequest = (DeFiTransferQuoteRequest) obj2;
        return Intrinsics.f(this.f71796a, deFiTransferQuoteRequest.f71796a) && Intrinsics.f(this.f71797b, deFiTransferQuoteRequest.f71797b) && Intrinsics.f(this.f71798c, deFiTransferQuoteRequest.f71798c) && Intrinsics.f(this.d, deFiTransferQuoteRequest.d) && this.e == deFiTransferQuoteRequest.e && this.f == deFiTransferQuoteRequest.f && Intrinsics.f(this.f71799g, deFiTransferQuoteRequest.f71799g) && this.f71800h == deFiTransferQuoteRequest.f71800h && this.i == deFiTransferQuoteRequest.i && Intrinsics.f(this.f71801j, deFiTransferQuoteRequest.f71801j);
    }

    public final int hashCode() {
        int iHashCode = (this.i.hashCode() + ((this.f71800h.hashCode() + p.a.c((this.f.hashCode() + j6.a.b(this.e, (this.d.hashCode() + p.a.c(p.a.c(this.f71796a.hashCode() * 31, 31, this.f71797b), 31, this.f71798c)) * 31, 31)) * 31, 31, this.f71799g)) * 31)) * 31;
        String str = this.f71801j;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71796a);
        dest.writeString(this.f71797b);
        dest.writeString(this.f71798c);
        dest.writeSerializable(this.d);
        dest.writeInt(this.e);
        dest.writeString(this.f.name());
        dest.writeString(this.f71799g);
        dest.writeString(this.f71800h.name());
        dest.writeString(this.i.name());
        dest.writeString(this.f71801j);
    }
}
