package com.revolut.feature.pay_later.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zh9.w;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_later/api/models/PayLaterPaymentOption;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pay_later_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PayLaterPaymentOption implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PayLaterPaymentOption> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PayLaterPaymentMethod f78816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f78817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f78818c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            PayLaterPaymentMethod payLaterPaymentMethodCreateFromParcel = PayLaterPaymentMethod.CREATOR.createFromParcel(parcel);
            w wVarValueOf = w.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(w.valueOf(parcel.readString()));
            }
            return new PayLaterPaymentOption(payLaterPaymentMethodCreateFromParcel, wVarValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PayLaterPaymentOption[i];
        }
    }

    public PayLaterPaymentOption(PayLaterPaymentMethod paymentMethod, w preferredInstalmentType, List availableInstalmentTypes) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(preferredInstalmentType, "preferredInstalmentType");
        Intrinsics.checkNotNullParameter(availableInstalmentTypes, "availableInstalmentTypes");
        this.f78816a = paymentMethod;
        this.f78817b = preferredInstalmentType;
        this.f78818c = availableInstalmentTypes;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PayLaterPaymentOption)) {
            return false;
        }
        PayLaterPaymentOption payLaterPaymentOption = (PayLaterPaymentOption) obj2;
        return this.f78816a == payLaterPaymentOption.f78816a && this.f78817b == payLaterPaymentOption.f78817b && Intrinsics.f(this.f78818c, payLaterPaymentOption.f78818c);
    }

    public final int hashCode() {
        return this.f78818c.hashCode() + ((this.f78817b.hashCode() + (this.f78816a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f78816a.writeToParcel(dest, i);
        dest.writeString(this.f78817b.name());
        Iterator itV = p.a.v(this.f78818c, dest);
        while (itV.hasNext()) {
            dest.writeString(((w) itV.next()).name());
        }
    }
}
