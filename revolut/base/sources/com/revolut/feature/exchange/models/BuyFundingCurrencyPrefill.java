package com.revolut.feature.exchange.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/exchange/models/BuyFundingCurrencyPrefill;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "wd6/a", "feature_exchange_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BuyFundingCurrencyPrefill implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BuyFundingCurrencyPrefill> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f72124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wd6.a f72125b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BuyFundingCurrencyPrefill((b) parcel.readSerializable(), wd6.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BuyFundingCurrencyPrefill[i];
        }
    }

    public BuyFundingCurrencyPrefill(b currency, wd6.a entryPoint) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        this.f72124a = currency;
        this.f72125b = entryPoint;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BuyFundingCurrencyPrefill)) {
            return false;
        }
        BuyFundingCurrencyPrefill buyFundingCurrencyPrefill = (BuyFundingCurrencyPrefill) obj2;
        return Intrinsics.f(this.f72124a, buyFundingCurrencyPrefill.f72124a) && this.f72125b == buyFundingCurrencyPrefill.f72125b;
    }

    public final int hashCode() {
        return this.f72125b.hashCode() + (this.f72124a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f72124a);
        dest.writeString(this.f72125b.name());
    }
}
