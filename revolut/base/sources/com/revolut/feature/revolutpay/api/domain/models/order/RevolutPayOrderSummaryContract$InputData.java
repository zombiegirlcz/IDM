package com.revolut.feature.revolutpay.api.domain.models.order;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.revolutpay.api.shared.domain.models.order.CheckoutMode;
import com.revolut.feature.revolutpay.api.shared.domain.models.payment.PaymentConfiguration;
import com.revolut.feature.revolutpay.api.shared.domain.models.ramp.RampOrderDetails;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p6c.b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/revolutpay/api/domain/models/order/RevolutPayOrderSummaryContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Standard", "OAuthAuthorization", "Lcom/revolut/feature/revolutpay/api/domain/models/order/RevolutPayOrderSummaryContract$InputData$OAuthAuthorization;", "Lcom/revolut/feature/revolutpay/api/domain/models/order/RevolutPayOrderSummaryContract$InputData$Standard;", "feature_revolut_pay_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RevolutPayOrderSummaryContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/api/domain/models/order/RevolutPayOrderSummaryContract$InputData$OAuthAuthorization;", "Lcom/revolut/feature/revolutpay/api/domain/models/order/RevolutPayOrderSummaryContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OAuthAuthorization implements RevolutPayOrderSummaryContract$InputData {

        @NotNull
        public static final Parcelable.Creator<OAuthAuthorization> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f84301b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f84302c;
        public final String d;
        public final String e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OAuthAuthorization(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OAuthAuthorization[i];
            }
        }

        public OAuthAuthorization(String clientId, String redirectUri, String scope, String state, String authorizationDetails) {
            Intrinsics.checkNotNullParameter(clientId, "clientId");
            Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
            Intrinsics.checkNotNullParameter(scope, "scope");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(authorizationDetails, "authorizationDetails");
            this.f84300a = clientId;
            this.f84301b = redirectUri;
            this.f84302c = scope;
            this.d = state;
            this.e = authorizationDetails;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OAuthAuthorization)) {
                return false;
            }
            OAuthAuthorization oAuthAuthorization = (OAuthAuthorization) obj2;
            return Intrinsics.f(this.f84300a, oAuthAuthorization.f84300a) && Intrinsics.f(this.f84301b, oAuthAuthorization.f84301b) && Intrinsics.f(this.f84302c, oAuthAuthorization.f84302c) && Intrinsics.f(this.d, oAuthAuthorization.d) && Intrinsics.f(this.e, oAuthAuthorization.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f84300a.hashCode() * 31, 31, this.f84301b), 31, this.f84302c), 31, this.d);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84300a);
            dest.writeString(this.f84301b);
            dest.writeString(this.f84302c);
            dest.writeString(this.d);
            dest.writeString(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/api/domain/models/order/RevolutPayOrderSummaryContract$InputData$Standard;", "Lcom/revolut/feature/revolutpay/api/domain/models/order/RevolutPayOrderSummaryContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Standard implements RevolutPayOrderSummaryContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Standard> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f84304b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f84305c;
        public final String d;
        public final String e;
        public final CheckoutMode f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f84306g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f84307h;
        public final boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final PaymentConfiguration f84308j;
        public final RampOrderDetails k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f84309l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f84310m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final b f84311n;
        public final String o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final f6c.a f84312p;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                boolean z3;
                PaymentConfiguration paymentConfiguration;
                boolean z4;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                CheckoutMode checkoutMode = (CheckoutMode) parcel.readParcelable(Standard.class.getClassLoader());
                String string6 = parcel.readString();
                boolean z6 = false;
                boolean z11 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = false;
                    z6 = true;
                } else {
                    z = false;
                }
                PaymentConfiguration paymentConfiguration2 = (PaymentConfiguration) parcel.readParcelable(Standard.class.getClassLoader());
                RampOrderDetails rampOrderDetails = (RampOrderDetails) parcel.readParcelable(Standard.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    z3 = true;
                    paymentConfiguration = paymentConfiguration2;
                    z4 = true;
                } else {
                    z3 = true;
                    paymentConfiguration = paymentConfiguration2;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z3 = z;
                }
                return new Standard(string, string2, string3, string4, string5, checkoutMode, string6, z11, z6, paymentConfiguration, rampOrderDetails, z4, z3, parcel.readInt() == 0 ? null : b.valueOf(parcel.readString()), parcel.readString(), f6c.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Standard[i];
            }
        }

        public Standard(String merchantPublicKey, String orderToken, String str, String str2, String str3, CheckoutMode checkoutMode, String str4, boolean z, boolean z3, PaymentConfiguration paymentConfiguration, RampOrderDetails rampOrderDetails, boolean z4, boolean z6, b bVar, String originalUri, f6c.a flowSource) {
            Intrinsics.checkNotNullParameter(merchantPublicKey, "merchantPublicKey");
            Intrinsics.checkNotNullParameter(orderToken, "orderToken");
            Intrinsics.checkNotNullParameter(checkoutMode, "checkoutMode");
            Intrinsics.checkNotNullParameter(originalUri, "originalUri");
            Intrinsics.checkNotNullParameter(flowSource, "flowSource");
            this.f84303a = merchantPublicKey;
            this.f84304b = orderToken;
            this.f84305c = str;
            this.d = str2;
            this.e = str3;
            this.f = checkoutMode;
            this.f84306g = str4;
            this.f84307h = z;
            this.i = z3;
            this.f84308j = paymentConfiguration;
            this.k = rampOrderDetails;
            this.f84309l = z4;
            this.f84310m = z6;
            this.f84311n = bVar;
            this.o = originalUri;
            this.f84312p = flowSource;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Standard)) {
                return false;
            }
            Standard standard = (Standard) obj2;
            return Intrinsics.f(this.f84303a, standard.f84303a) && Intrinsics.f(this.f84304b, standard.f84304b) && Intrinsics.f(this.f84305c, standard.f84305c) && Intrinsics.f(this.d, standard.d) && Intrinsics.f(this.e, standard.e) && Intrinsics.f(this.f, standard.f) && Intrinsics.f(this.f84306g, standard.f84306g) && this.f84307h == standard.f84307h && this.i == standard.i && Intrinsics.f(this.f84308j, standard.f84308j) && Intrinsics.f(this.k, standard.k) && this.f84309l == standard.f84309l && this.f84310m == standard.f84310m && this.f84311n == standard.f84311n && Intrinsics.f(this.o, standard.o) && this.f84312p == standard.f84312p;
        }

        public final int hashCode() {
            int iC = p.a.c(this.f84303a.hashCode() * 31, 31, this.f84304b);
            String str = this.f84305c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.e;
            int iHashCode3 = (this.f.hashCode() + ((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
            String str4 = this.f84306g;
            int iC2 = j6.a.c(j6.a.c((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f84307h), 31, this.i);
            PaymentConfiguration paymentConfiguration = this.f84308j;
            int iHashCode4 = (iC2 + (paymentConfiguration == null ? 0 : paymentConfiguration.hashCode())) * 31;
            RampOrderDetails rampOrderDetails = this.k;
            int iC3 = j6.a.c(j6.a.c((iHashCode4 + (rampOrderDetails == null ? 0 : rampOrderDetails.hashCode())) * 31, 31, this.f84309l), 31, this.f84310m);
            b bVar = this.f84311n;
            return this.f84312p.hashCode() + p.a.c((iC3 + (bVar != null ? bVar.hashCode() : 0)) * 31, 31, this.o);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84303a);
            dest.writeString(this.f84304b);
            dest.writeString(this.f84305c);
            dest.writeString(this.d);
            dest.writeString(this.e);
            dest.writeParcelable(this.f, i);
            dest.writeString(this.f84306g);
            dest.writeInt(this.f84307h ? 1 : 0);
            dest.writeInt(this.i ? 1 : 0);
            dest.writeParcelable(this.f84308j, i);
            dest.writeParcelable(this.k, i);
            dest.writeInt(this.f84309l ? 1 : 0);
            dest.writeInt(this.f84310m ? 1 : 0);
            b bVar = this.f84311n;
            if (bVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(bVar.name());
            }
            dest.writeString(this.o);
            dest.writeString(this.f84312p.name());
        }
    }
}
