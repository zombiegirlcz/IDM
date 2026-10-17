package com.revolut.feature.retail.crypto.advanced_charts.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.retail.advanced_charts.models.AdvancedChartSymbol;
import cp5.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/crypto/advanced_charts/api/models/CryptoAdvancedChartSymbol;", "Lcom/revolut/feature/retail/advanced_charts/models/AdvancedChartSymbol;", "", "toString", "()Ljava/lang/String;", "feature_retail_crypto_advanced_charts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoAdvancedChartSymbol implements AdvancedChartSymbol {

    @NotNull
    public static final Parcelable.Creator<CryptoAdvancedChartSymbol> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f82637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f82638b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoAdvancedChartSymbol((b) parcel.readSerializable(), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoAdvancedChartSymbol[i];
        }
    }

    public CryptoAdvancedChartSymbol(b baseCurrency, b quoteCurrency) {
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(quoteCurrency, "quoteCurrency");
        this.f82637a = baseCurrency;
        this.f82638b = quoteCurrency;
    }

    @Override // com.revolut.feature.retail.advanced_charts.models.AdvancedChartSymbol
    public final int S9() {
        r6.b.D("Crypto team should implement this method properly for v1");
        return 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoAdvancedChartSymbol)) {
            return false;
        }
        CryptoAdvancedChartSymbol cryptoAdvancedChartSymbol = (CryptoAdvancedChartSymbol) obj2;
        return Intrinsics.f(this.f82637a, cryptoAdvancedChartSymbol.f82637a) && Intrinsics.f(this.f82638b, cryptoAdvancedChartSymbol.f82638b);
    }

    @Override // com.revolut.feature.retail.advanced_charts.models.AdvancedChartSymbol
    public final String getId() {
        return com.google.android.gms.internal.mlkit_vision_face.a.o(this.f82637a.f306286a, "-", this.f82638b.f306286a);
    }

    public final int hashCode() {
        return this.f82638b.hashCode() + (this.f82637a.hashCode() * 31);
    }

    @Override // com.revolut.feature.retail.advanced_charts.models.AdvancedChartSymbol
    public final c1b.b m5() {
        return c1b.b.CRYPTO;
    }

    @Override // com.revolut.feature.retail.advanced_charts.models.AdvancedChartSymbol
    public final String s6() {
        return d.K(this.f82637a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f82637a);
        dest.writeSerializable(this.f82638b);
    }
}
