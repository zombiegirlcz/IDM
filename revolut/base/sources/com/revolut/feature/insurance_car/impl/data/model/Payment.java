package com.revolut.feature.insurance_car.impl.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kl7.f1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/Payment;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Payment implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Payment> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1 f75272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PriceWithLabel f75273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PriceWithLabel f75274c;
    public final ArrayList d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            f1 f1VarValueOf = f1.valueOf(parcel.readString());
            Parcelable.Creator<PriceWithLabel> creator = PriceWithLabel.CREATOR;
            PriceWithLabel priceWithLabelCreateFromParcel = creator.createFromParcel(parcel);
            PriceWithLabel priceWithLabelCreateFromParcel2 = creator.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(PaymentBreakdownCategory.CREATOR, parcel, arrayList, iA, 1);
            }
            return new Payment(f1VarValueOf, priceWithLabelCreateFromParcel, priceWithLabelCreateFromParcel2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Payment[i];
        }
    }

    public Payment(f1 paymentFrequency, PriceWithLabel total, PriceWithLabel tax, ArrayList paymentBreakdownCategories) {
        Intrinsics.checkNotNullParameter(paymentFrequency, "paymentFrequency");
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(tax, "tax");
        Intrinsics.checkNotNullParameter(paymentBreakdownCategories, "paymentBreakdownCategories");
        this.f75272a = paymentFrequency;
        this.f75273b = total;
        this.f75274c = tax;
        this.d = paymentBreakdownCategories;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Payment)) {
            return false;
        }
        Payment payment = (Payment) obj2;
        return this.f75272a == payment.f75272a && Intrinsics.f(this.f75273b, payment.f75273b) && Intrinsics.f(this.f75274c, payment.f75274c) && this.d.equals(payment.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f75274c.hashCode() + ((this.f75273b.hashCode() + (this.f75272a.hashCode() * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75272a.name());
        this.f75273b.writeToParcel(dest, i);
        this.f75274c.writeToParcel(dest, i);
        Iterator itY = j6.a.y(this.d, dest);
        while (itY.hasNext()) {
            ((PaymentBreakdownCategory) itY.next()).writeToParcel(dest, i);
        }
    }
}
