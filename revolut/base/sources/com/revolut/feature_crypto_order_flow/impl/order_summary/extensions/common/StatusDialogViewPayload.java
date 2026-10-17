package com.revolut.feature_crypto_order_flow.impl.order_summary.extensions.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature_crypto_order_flow.impl.order_summary.models.ExchangeStakingData;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_crypto_order_flow/impl/order_summary/extensions/common/StatusDialogViewPayload;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_crypto_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StatusDialogViewPayload implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StatusDialogViewPayload> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f96786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExchangeStakingData f96787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f96788c;
    public final b d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StatusDialogViewPayload(parcel.readString(), parcel.readInt() == 0 ? null : ExchangeStakingData.CREATOR.createFromParcel(parcel), (b) parcel.readSerializable(), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StatusDialogViewPayload[i];
        }
    }

    public StatusDialogViewPayload(String buttonId, ExchangeStakingData exchangeStakingData, b fromCurrency, b toCurrency) {
        Intrinsics.checkNotNullParameter(buttonId, "buttonId");
        Intrinsics.checkNotNullParameter(fromCurrency, "fromCurrency");
        Intrinsics.checkNotNullParameter(toCurrency, "toCurrency");
        this.f96786a = buttonId;
        this.f96787b = exchangeStakingData;
        this.f96788c = fromCurrency;
        this.d = toCurrency;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StatusDialogViewPayload)) {
            return false;
        }
        StatusDialogViewPayload statusDialogViewPayload = (StatusDialogViewPayload) obj2;
        return Intrinsics.f(this.f96786a, statusDialogViewPayload.f96786a) && Intrinsics.f(this.f96787b, statusDialogViewPayload.f96787b) && Intrinsics.f(this.f96788c, statusDialogViewPayload.f96788c) && Intrinsics.f(this.d, statusDialogViewPayload.d);
    }

    public final int hashCode() {
        int iHashCode = this.f96786a.hashCode() * 31;
        ExchangeStakingData exchangeStakingData = this.f96787b;
        return this.d.hashCode() + l.j(this.f96788c, (iHashCode + (exchangeStakingData == null ? 0 : exchangeStakingData.hashCode())) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f96786a);
        ExchangeStakingData exchangeStakingData = this.f96787b;
        if (exchangeStakingData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            exchangeStakingData.writeToParcel(dest, i);
        }
        dest.writeSerializable(this.f96788c);
        dest.writeSerializable(this.d);
    }
}
