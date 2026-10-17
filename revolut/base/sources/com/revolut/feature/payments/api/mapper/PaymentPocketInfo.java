package com.revolut.feature.payments.api.mapper;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/api/mapper/PaymentPocketInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "retail_feature_payments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentPocketInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PaymentPocketInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f79169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f79170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f79171c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentPocketInfo((Clause) parcel.readParcelable(PaymentPocketInfo.class.getClassLoader()), (Clause) parcel.readParcelable(PaymentPocketInfo.class.getClassLoader()), (Image) parcel.readParcelable(PaymentPocketInfo.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PaymentPocketInfo[i];
        }
    }

    public PaymentPocketInfo(Clause title, Clause clause, Image icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f79169a = icon;
        this.f79170b = title;
        this.f79171c = clause;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PaymentPocketInfo)) {
            return false;
        }
        PaymentPocketInfo paymentPocketInfo = (PaymentPocketInfo) obj2;
        return Intrinsics.f(this.f79169a, paymentPocketInfo.f79169a) && Intrinsics.f(this.f79170b, paymentPocketInfo.f79170b) && Intrinsics.f(this.f79171c, paymentPocketInfo.f79171c);
    }

    public final int hashCode() {
        int iA = p.a.a(this.f79169a.hashCode() * 31, 31, this.f79170b);
        Clause clause = this.f79171c;
        return iA + (clause == null ? 0 : clause.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f79169a, i);
        dest.writeParcelable(this.f79170b, i);
        dest.writeParcelable(this.f79171c, i);
    }
}
