package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimUserPocket;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimUserPocket implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimUserPocket> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PaymentMethod.Pocket f100532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f100533c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimUserPocket(parcel.readString(), (PaymentMethod.Pocket) parcel.readParcelable(EsimUserPocket.class.getClassLoader()), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimUserPocket[i];
        }
    }

    public EsimUserPocket(String str, PaymentMethod.Pocket pocket, d balance) {
        Intrinsics.checkNotNullParameter(balance, "balance");
        this.f100531a = str;
        this.f100532b = pocket;
        this.f100533c = balance;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimUserPocket)) {
            return false;
        }
        EsimUserPocket esimUserPocket = (EsimUserPocket) obj2;
        return Intrinsics.f(this.f100531a, esimUserPocket.f100531a) && Intrinsics.f(this.f100532b, esimUserPocket.f100532b) && Intrinsics.f(this.f100533c, esimUserPocket.f100533c);
    }

    public final int hashCode() {
        String str = this.f100531a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        PaymentMethod.Pocket pocket = this.f100532b;
        return this.f100533c.hashCode() + ((iHashCode + (pocket != null ? pocket.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f100531a);
        dest.writeParcelable(this.f100532b, i);
        dest.writeSerializable(this.f100533c);
    }
}
