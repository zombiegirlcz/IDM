package com.revolut.feature.crypto.exchange.fees.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/exchange/fees/api/model/CryptoExchangeFees;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_crypto_exchange_fees_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoExchangeFees implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CryptoExchangeFees> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f70809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f70810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f70811c;
    public final double d;
    public final List e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            int iC = 0;
            while (iC != i) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
            }
            boolean z = parcel.readInt() != 0;
            d dVar = (d) parcel.readSerializable();
            double d = parcel.readDouble();
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(CryptoExchangePricingFee.CREATOR, parcel, arrayList2, iA, 1);
            }
            return new CryptoExchangeFees(arrayList, z, dVar, d, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoExchangeFees[i];
        }
    }

    public CryptoExchangeFees(List pricingPlans, boolean z, d currentTradingVolume, double d, List pricingFees) {
        Intrinsics.checkNotNullParameter(pricingPlans, "pricingPlans");
        Intrinsics.checkNotNullParameter(currentTradingVolume, "currentTradingVolume");
        Intrinsics.checkNotNullParameter(pricingFees, "pricingFees");
        this.f70809a = pricingPlans;
        this.f70810b = z;
        this.f70811c = currentTradingVolume;
        this.d = d;
        this.e = pricingFees;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoExchangeFees)) {
            return false;
        }
        CryptoExchangeFees cryptoExchangeFees = (CryptoExchangeFees) obj2;
        return Intrinsics.f(this.f70809a, cryptoExchangeFees.f70809a) && this.f70810b == cryptoExchangeFees.f70810b && Intrinsics.f(this.f70811c, cryptoExchangeFees.f70811c) && Double.compare(this.d, cryptoExchangeFees.d) == 0 && Intrinsics.f(this.e, cryptoExchangeFees.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + b.c(v7.c(j6.a.c(this.f70809a.hashCode() * 31, 31, this.f70810b), 31, this.f70811c), this.d, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f70809a, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
        dest.writeInt(this.f70810b ? 1 : 0);
        dest.writeSerializable(this.f70811c);
        dest.writeDouble(this.d);
        Iterator itV2 = p.a.v(this.e, dest);
        while (itV2.hasNext()) {
            ((CryptoExchangePricingFee) itV2.next()).writeToParcel(dest, i);
        }
    }
}
