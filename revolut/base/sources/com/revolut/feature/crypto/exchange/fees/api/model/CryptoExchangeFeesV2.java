package com.revolut.feature.crypto.exchange.fees.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/exchange/fees/api/model/CryptoExchangeFeesV2;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_crypto_exchange_fees_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoExchangeFeesV2 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CryptoExchangeFeesV2> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f70814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f70815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f70816c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            double d = parcel.readDouble();
            d dVar = (d) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(CryptoExchangePricingFee.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new CryptoExchangeFeesV2(d, dVar, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoExchangeFeesV2[i];
        }
    }

    public CryptoExchangeFeesV2(double d, d dVar, List list) {
        this.f70814a = d;
        this.f70815b = dVar;
        this.f70816c = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoExchangeFeesV2)) {
            return false;
        }
        CryptoExchangeFeesV2 cryptoExchangeFeesV2 = (CryptoExchangeFeesV2) obj2;
        return Double.compare(this.f70814a, cryptoExchangeFeesV2.f70814a) == 0 && Intrinsics.f(this.f70815b, cryptoExchangeFeesV2.f70815b) && Intrinsics.f(this.f70816c, cryptoExchangeFeesV2.f70816c);
    }

    public final int hashCode() {
        int iHashCode = Double.hashCode(this.f70814a) * 31;
        d dVar = this.f70815b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        List list = this.f70816c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeDouble(this.f70814a);
        dest.writeSerializable(this.f70815b);
        List list = this.f70816c;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ = v0.a.q(dest, 1, list);
        while (itQ.hasNext()) {
            ((CryptoExchangePricingFee) itQ.next()).writeToParcel(dest, i);
        }
    }
}
