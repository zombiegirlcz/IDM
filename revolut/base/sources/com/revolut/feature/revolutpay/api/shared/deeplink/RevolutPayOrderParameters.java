package com.revolut.feature.revolutpay.api.shared.deeplink;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.revolutpay.api.shared.domain.models.order.CheckoutMode;
import com.revolut.feature.revolutpay.api.shared.domain.models.payment.PaymentConfiguration;
import com.revolut.feature.revolutpay.api.shared.domain.models.ramp.RampOrderDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import p6c.b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/api/shared/deeplink/RevolutPayOrderParameters;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevolutPayOrderParameters implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RevolutPayOrderParameters> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f84318c;
    public final String d;
    public final String e;
    public final CheckoutMode f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f84319g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f84320h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final PaymentConfiguration f84321j;
    public final RampOrderDetails k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f84322l;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            CheckoutMode checkoutMode = (CheckoutMode) parcel.readParcelable(RevolutPayOrderParameters.class.getClassLoader());
            String string6 = parcel.readString();
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            return new RevolutPayOrderParameters(string, string2, string3, string4, string5, checkoutMode, string6, z3, parcel.readInt() == 0 ? z : true, parcel.readInt() == 0 ? null : PaymentConfiguration.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RampOrderDetails.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? b.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevolutPayOrderParameters[i];
        }
    }

    public RevolutPayOrderParameters(String merchantPublicKey, String orderToken, String str, String str2, String str3, CheckoutMode checkoutMode, String str4, boolean z, boolean z3, PaymentConfiguration paymentConfiguration, RampOrderDetails rampOrderDetails, b bVar) {
        Intrinsics.checkNotNullParameter(merchantPublicKey, "merchantPublicKey");
        Intrinsics.checkNotNullParameter(orderToken, "orderToken");
        Intrinsics.checkNotNullParameter(checkoutMode, "checkoutMode");
        this.f84316a = merchantPublicKey;
        this.f84317b = orderToken;
        this.f84318c = str;
        this.d = str2;
        this.e = str3;
        this.f = checkoutMode;
        this.f84319g = str4;
        this.f84320h = z;
        this.i = z3;
        this.f84321j = paymentConfiguration;
        this.k = rampOrderDetails;
        this.f84322l = bVar;
    }

    public final boolean a() {
        return (d0.W(this.f84316a) || d0.W(this.f84317b)) ? false : true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevolutPayOrderParameters)) {
            return false;
        }
        RevolutPayOrderParameters revolutPayOrderParameters = (RevolutPayOrderParameters) obj2;
        return Intrinsics.f(this.f84316a, revolutPayOrderParameters.f84316a) && Intrinsics.f(this.f84317b, revolutPayOrderParameters.f84317b) && Intrinsics.f(this.f84318c, revolutPayOrderParameters.f84318c) && Intrinsics.f(this.d, revolutPayOrderParameters.d) && Intrinsics.f(this.e, revolutPayOrderParameters.e) && Intrinsics.f(this.f, revolutPayOrderParameters.f) && Intrinsics.f(this.f84319g, revolutPayOrderParameters.f84319g) && this.f84320h == revolutPayOrderParameters.f84320h && this.i == revolutPayOrderParameters.i && Intrinsics.f(this.f84321j, revolutPayOrderParameters.f84321j) && Intrinsics.f(this.k, revolutPayOrderParameters.k) && this.f84322l == revolutPayOrderParameters.f84322l;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f84316a.hashCode() * 31, 31, this.f84317b);
        String str = this.f84318c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode3 = (this.f.hashCode() + ((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.f84319g;
        int iC2 = j6.a.c(j6.a.c((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f84320h), 31, this.i);
        PaymentConfiguration paymentConfiguration = this.f84321j;
        int iHashCode4 = (iC2 + (paymentConfiguration == null ? 0 : paymentConfiguration.hashCode())) * 31;
        RampOrderDetails rampOrderDetails = this.k;
        int iHashCode5 = (iHashCode4 + (rampOrderDetails == null ? 0 : rampOrderDetails.hashCode())) * 31;
        b bVar = this.f84322l;
        return iHashCode5 + (bVar != null ? bVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84316a);
        dest.writeString(this.f84317b);
        dest.writeString(this.f84318c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeParcelable(this.f, i);
        dest.writeString(this.f84319g);
        dest.writeInt(this.f84320h ? 1 : 0);
        dest.writeInt(this.i ? 1 : 0);
        PaymentConfiguration paymentConfiguration = this.f84321j;
        if (paymentConfiguration == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            paymentConfiguration.writeToParcel(dest, i);
        }
        RampOrderDetails rampOrderDetails = this.k;
        if (rampOrderDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            rampOrderDetails.writeToParcel(dest, i);
        }
        b bVar = this.f84322l;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(bVar.name());
        }
    }
}
