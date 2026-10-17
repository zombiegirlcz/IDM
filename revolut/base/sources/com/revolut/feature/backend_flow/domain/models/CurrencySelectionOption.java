package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/CurrencySelectionOption;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CurrencySelectionOption implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CurrencySelectionOption> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f63377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63379c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CurrencySelectionOption(parcel.readString(), parcel.readString(), (xi0.b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CurrencySelectionOption[i];
        }
    }

    public CurrencySelectionOption(String str, String str2, xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f63377a = currency;
        this.f63378b = str;
        this.f63379c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CurrencySelectionOption)) {
            return false;
        }
        CurrencySelectionOption currencySelectionOption = (CurrencySelectionOption) obj2;
        return Intrinsics.f(this.f63377a, currencySelectionOption.f63377a) && Intrinsics.f(this.f63378b, currencySelectionOption.f63378b) && Intrinsics.f(this.f63379c, currencySelectionOption.f63379c);
    }

    public final int hashCode() {
        int iHashCode = this.f63377a.hashCode() * 31;
        String str = this.f63378b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f63379c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f63377a);
        dest.writeString(this.f63378b);
        dest.writeString(this.f63379c);
    }
}
