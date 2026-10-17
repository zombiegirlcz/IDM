package com.revolut.retail.feature.beneficiary.api.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/api/domain/PaymentCodeTransactor;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentCodeTransactor implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PaymentCodeTransactor> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f99614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f99615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f99616c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f99617g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentCodeTransactor(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PaymentCodeTransactor[i];
        }
    }

    public PaymentCodeTransactor(String name, String addressType, String addressLine1, String addressLine2, String postcode, String city, String country) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(addressType, "addressType");
        Intrinsics.checkNotNullParameter(addressLine1, "addressLine1");
        Intrinsics.checkNotNullParameter(addressLine2, "addressLine2");
        Intrinsics.checkNotNullParameter(postcode, "postcode");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(country, "country");
        this.f99614a = name;
        this.f99615b = addressType;
        this.f99616c = addressLine1;
        this.d = addressLine2;
        this.e = postcode;
        this.f = city;
        this.f99617g = country;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PaymentCodeTransactor)) {
            return false;
        }
        PaymentCodeTransactor paymentCodeTransactor = (PaymentCodeTransactor) obj2;
        return Intrinsics.f(this.f99614a, paymentCodeTransactor.f99614a) && Intrinsics.f(this.f99615b, paymentCodeTransactor.f99615b) && Intrinsics.f(this.f99616c, paymentCodeTransactor.f99616c) && Intrinsics.f(this.d, paymentCodeTransactor.d) && Intrinsics.f(this.e, paymentCodeTransactor.e) && Intrinsics.f(this.f, paymentCodeTransactor.f) && Intrinsics.f(this.f99617g, paymentCodeTransactor.f99617g);
    }

    public final int hashCode() {
        return this.f99617g.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f99614a.hashCode() * 31, 31, this.f99615b), 31, this.f99616c), 31, this.d), 31, this.e), 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f99614a);
        dest.writeString(this.f99615b);
        dest.writeString(this.f99616c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.f99617g);
    }
}
