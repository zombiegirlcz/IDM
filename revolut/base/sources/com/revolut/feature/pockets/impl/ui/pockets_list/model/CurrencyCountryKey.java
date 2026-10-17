package com.revolut.feature.pockets.impl.ui.pockets_list.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pockets/impl/ui/pockets_list/model/CurrencyCountryKey;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pockets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CurrencyCountryKey implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CurrencyCountryKey> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f80928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f80929b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CurrencyCountryKey((wi0.b) parcel.readSerializable(), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CurrencyCountryKey[i];
        }
    }

    public CurrencyCountryKey(wi0.b country, b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(country, "country");
        this.f80928a = currency;
        this.f80929b = country;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CurrencyCountryKey)) {
            return false;
        }
        CurrencyCountryKey currencyCountryKey = (CurrencyCountryKey) obj2;
        return Intrinsics.f(this.f80928a, currencyCountryKey.f80928a) && Intrinsics.f(this.f80929b, currencyCountryKey.f80929b);
    }

    public final int hashCode() {
        return this.f80929b.f297794a.hashCode() + (this.f80928a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f80928a);
        dest.writeSerializable(this.f80929b);
    }
}
