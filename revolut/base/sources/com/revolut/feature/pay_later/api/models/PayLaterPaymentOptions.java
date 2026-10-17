package com.revolut.feature.pay_later.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_later/api/models/PayLaterPaymentOptions;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pay_later_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PayLaterPaymentOptions implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PayLaterPaymentOptions> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f78819a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(PayLaterPaymentOption.CREATOR, parcel, arrayList, iA, 1);
            }
            return new PayLaterPaymentOptions(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PayLaterPaymentOptions[i];
        }
    }

    public PayLaterPaymentOptions(ArrayList paymentMethods) {
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        this.f78819a = paymentMethods;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof PayLaterPaymentOptions) && this.f78819a.equals(((PayLaterPaymentOptions) obj2).f78819a);
    }

    public final int hashCode() {
        return this.f78819a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itY = j6.a.y(this.f78819a, dest);
        while (itY.hasNext()) {
            ((PayLaterPaymentOption) itY.next()).writeToParcel(dest, i);
        }
    }
}
