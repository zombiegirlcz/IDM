package com.revolut.feature.retail.restaurants.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/retail/restaurants/impl/domain/model/Customer;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_retail_restaurants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Customer implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f82803c;
    public final String d;

    @NotNull
    public static final Parcelable.Creator<Customer> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Customer(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Customer[i];
        }
    }

    public Customer(String firstName, String lastName, String phone, String email) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(email, "email");
        this.f82801a = firstName;
        this.f82802b = lastName;
        this.f82803c = phone;
        this.d = email;
    }

    public final boolean a() {
        return (d0.W(this.f82801a) || d0.W(this.f82802b) || d0.W(this.f82803c) || d0.W(this.d)) ? false : true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Customer)) {
            return false;
        }
        Customer customer = (Customer) obj2;
        return Intrinsics.f(this.f82801a, customer.f82801a) && Intrinsics.f(this.f82802b, customer.f82802b) && Intrinsics.f(this.f82803c, customer.f82803c) && Intrinsics.f(this.d, customer.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f82801a.hashCode() * 31, 31, this.f82802b), 31, this.f82803c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82801a);
        dest.writeString(this.f82802b);
        dest.writeString(this.f82803c);
        dest.writeString(this.d);
    }
}
