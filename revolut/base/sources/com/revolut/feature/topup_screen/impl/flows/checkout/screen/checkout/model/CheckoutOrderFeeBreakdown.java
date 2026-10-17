package com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/model/CheckoutOrderFeeBreakdown;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "CheckoutFeeTax", "jxe/d", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CheckoutOrderFeeBreakdown implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CheckoutOrderFeeBreakdown> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f90758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f90759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f90760c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/model/CheckoutOrderFeeBreakdown$CheckoutFeeTax;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CheckoutFeeTax implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<CheckoutFeeTax> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f90761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final jxe.d f90762b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CheckoutFeeTax((d) parcel.readSerializable(), jxe.d.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CheckoutFeeTax[i];
            }
        }

        public CheckoutFeeTax(d value, jxe.d taxType) {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(taxType, "taxType");
            this.f90761a = value;
            this.f90762b = taxType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CheckoutFeeTax)) {
                return false;
            }
            CheckoutFeeTax checkoutFeeTax = (CheckoutFeeTax) obj2;
            return Intrinsics.f(this.f90761a, checkoutFeeTax.f90761a) && this.f90762b == checkoutFeeTax.f90762b;
        }

        public final int hashCode() {
            return this.f90762b.hashCode() + (this.f90761a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f90761a);
            dest.writeString(this.f90762b.name());
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            d dVar = (d) parcel.readSerializable();
            d dVar2 = (d) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(CheckoutFeeTax.CREATOR, parcel, arrayList, iA, 1);
            }
            return new CheckoutOrderFeeBreakdown(dVar, dVar2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CheckoutOrderFeeBreakdown[i];
        }
    }

    public CheckoutOrderFeeBreakdown(d total, d fee2, List taxes) {
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(fee2, "fee");
        Intrinsics.checkNotNullParameter(taxes, "taxes");
        this.f90758a = total;
        this.f90759b = fee2;
        this.f90760c = taxes;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CheckoutOrderFeeBreakdown)) {
            return false;
        }
        CheckoutOrderFeeBreakdown checkoutOrderFeeBreakdown = (CheckoutOrderFeeBreakdown) obj2;
        return Intrinsics.f(this.f90758a, checkoutOrderFeeBreakdown.f90758a) && Intrinsics.f(this.f90759b, checkoutOrderFeeBreakdown.f90759b) && Intrinsics.f(this.f90760c, checkoutOrderFeeBreakdown.f90760c);
    }

    public final int hashCode() {
        return this.f90760c.hashCode() + v7.c(this.f90758a.hashCode() * 31, 31, this.f90759b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f90758a);
        dest.writeSerializable(this.f90759b);
        Iterator itV = p.a.v(this.f90760c, dest);
        while (itV.hasNext()) {
            ((CheckoutFeeTax) itV.next()).writeToParcel(dest, i);
        }
    }
}
