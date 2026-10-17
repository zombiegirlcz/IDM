package com.revolut.feature.payments.who_to_transfer.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/common/RecipientCountryCurrencyConfig;", "Lcom/revolut/feature/payments/who_to_transfer/api/common/RecipientConfig;", "", "toString", "()Ljava/lang/String;", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RecipientCountryCurrencyConfig implements RecipientConfig {

    @NotNull
    public static final Parcelable.Creator<RecipientCountryCurrencyConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f79981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f79982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f79983c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RecipientCountryCurrencyConfig(parcel.readString(), (wi0.b) parcel.readSerializable(), (xi0.b) parcel.readSerializable(), (xi0.b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RecipientCountryCurrencyConfig[i];
        }
    }

    public RecipientCountryCurrencyConfig(String str, wi0.b countryCode, xi0.b currency, xi0.b sourceCurrency) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        this.f79981a = countryCode;
        this.f79982b = currency;
        this.f79983c = sourceCurrency;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RecipientCountryCurrencyConfig)) {
            return false;
        }
        RecipientCountryCurrencyConfig recipientCountryCurrencyConfig = (RecipientCountryCurrencyConfig) obj2;
        return Intrinsics.f(this.f79981a, recipientCountryCurrencyConfig.f79981a) && Intrinsics.f(this.f79982b, recipientCountryCurrencyConfig.f79982b) && Intrinsics.f(this.f79983c, recipientCountryCurrencyConfig.f79983c) && Intrinsics.f(this.d, recipientCountryCurrencyConfig.d);
    }

    public final int hashCode() {
        int iJ = l.j(this.f79983c, l.j(this.f79982b, this.f79981a.f297794a.hashCode() * 31, 31), 31);
        String str = this.d;
        return iJ + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f79981a);
        dest.writeSerializable(this.f79982b);
        dest.writeSerializable(this.f79983c);
        dest.writeString(this.d);
    }
}
