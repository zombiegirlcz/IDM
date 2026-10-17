package com.revolut.feature.revolutpay.impl.ui.summary_screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.revolutpay.api.shared.domain.models.order.CheckoutMode;
import com.revolut.feature.revolutpay.api.shared.domain.models.payment.PaymentConfiguration;
import com.revolut.feature.revolutpay.api.shared.domain.models.payment.SplitBillPaymentParams;
import com.revolut.feature.revolutpay.api.shared.domain.models.ramp.RampOrderDetails;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pec.l;
import pec.n;
import q9c.j;
import q9c.m;
import q9c.o;
import q9c.p;
import tdc.g;
import u6c.t;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0002\u0007\b\u0082\u0001\u0002\t\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Ltdc/g;", "Lpec/a;", "Lq9c/m;", "Lq9c/j;", "Lsdc/d;", "Standard", "OAuthAuthorization", "Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$InputData$OAuthAuthorization;", "Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$InputData$Standard;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RevolutPaySummaryScreenContract$InputData extends IOData$Input, g, pec.a, m, j, sdc.d {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$InputData$OAuthAuthorization;", "Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OAuthAuthorization implements RevolutPaySummaryScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<OAuthAuthorization> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f84521b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f84522c;
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
            this.f84520a = clientId;
            this.f84521b = redirectUri;
            this.f84522c = scope;
            this.d = state;
            this.e = authorizationDetails;
        }

        @Override // sdc.d
        public final sdc.b a() {
            return null;
        }

        @Override // pec.a
        public final n b() {
            return l.f235371a;
        }

        @Override // tdc.g
        /* JADX INFO: renamed from: c */
        public final CheckoutMode getF84525c() {
            return CheckoutMode.MerchantInitiated.f84336b;
        }

        @Override // tdc.g
        /* JADX INFO: renamed from: d */
        public final boolean getF84528j() {
            return false;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // q9c.m
        public final p e() {
            return o.f243873a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OAuthAuthorization)) {
                return false;
            }
            OAuthAuthorization oAuthAuthorization = (OAuthAuthorization) obj2;
            return Intrinsics.f(this.f84520a, oAuthAuthorization.f84520a) && Intrinsics.f(this.f84521b, oAuthAuthorization.f84521b) && Intrinsics.f(this.f84522c, oAuthAuthorization.f84522c) && Intrinsics.f(this.d, oAuthAuthorization.d) && Intrinsics.f(this.e, oAuthAuthorization.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f84520a.hashCode() * 31, 31, this.f84521b), 31, this.f84522c), 31, this.d);
        }

        @Override // tdc.g
        /* JADX INFO: renamed from: j */
        public final PaymentConfiguration getF84526g() {
            return null;
        }

        @Override // tdc.g
        public final t l() {
            return t.REVPAY;
        }

        @Override // com.revolut.feature.revolutpay.impl.ui.summary_screen.RevolutPaySummaryScreenContract$InputData
        /* JADX INFO: renamed from: q2 */
        public final boolean getI() {
            return true;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84520a);
            dest.writeString(this.f84521b);
            dest.writeString(this.f84522c);
            dest.writeString(this.d);
            dest.writeString(this.e);
        }

        @Override // q9c.j
        public final q9c.c z() {
            return new q9c.b(this.f84520a, this.f84521b, this.f84522c, this.d, this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$InputData$Standard;", "Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Standard implements RevolutPaySummaryScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Standard> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f84524b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CheckoutMode f84525c;
        public final String d;
        public final boolean e;
        public final w7c.a f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final PaymentConfiguration f84526g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final RampOrderDetails f84527h;
        public final boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f84528j;
        public final f6c.a k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final p6c.b f84529l;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                PaymentConfiguration paymentConfiguration;
                boolean z3;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                CheckoutMode checkoutMode = (CheckoutMode) parcel.readParcelable(Standard.class.getClassLoader());
                String string3 = parcel.readString();
                boolean z4 = parcel.readInt() != 0;
                w7c.a aVarValueOf = w7c.a.valueOf(parcel.readString());
                PaymentConfiguration paymentConfiguration2 = (PaymentConfiguration) parcel.readParcelable(Standard.class.getClassLoader());
                RampOrderDetails rampOrderDetails = (RampOrderDetails) parcel.readParcelable(Standard.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    z = true;
                    paymentConfiguration = paymentConfiguration2;
                    z3 = true;
                } else {
                    z = true;
                    paymentConfiguration = paymentConfiguration2;
                    z3 = false;
                }
                if (parcel.readInt() == 0) {
                    z = false;
                }
                return new Standard(string, string2, checkoutMode, string3, z4, aVarValueOf, paymentConfiguration, rampOrderDetails, z3, z, f6c.a.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : p6c.b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Standard[i];
            }
        }

        public Standard(String orderToken, String merchantPublicKey, CheckoutMode checkoutMode, String str, boolean z, w7c.a paymentScheduleUserFlow, PaymentConfiguration paymentConfiguration, RampOrderDetails rampOrderDetails, boolean z3, boolean z4, f6c.a flowSource, p6c.b bVar) {
            Intrinsics.checkNotNullParameter(orderToken, "orderToken");
            Intrinsics.checkNotNullParameter(merchantPublicKey, "merchantPublicKey");
            Intrinsics.checkNotNullParameter(checkoutMode, "checkoutMode");
            Intrinsics.checkNotNullParameter(paymentScheduleUserFlow, "paymentScheduleUserFlow");
            Intrinsics.checkNotNullParameter(flowSource, "flowSource");
            this.f84523a = orderToken;
            this.f84524b = merchantPublicKey;
            this.f84525c = checkoutMode;
            this.d = str;
            this.e = z;
            this.f = paymentScheduleUserFlow;
            this.f84526g = paymentConfiguration;
            this.f84527h = rampOrderDetails;
            this.i = z3;
            this.f84528j = z4;
            this.k = flowSource;
            this.f84529l = bVar;
        }

        @Override // sdc.d
        public final sdc.b a() {
            SplitBillPaymentParams splitBillPaymentParams;
            String str;
            PaymentConfiguration paymentConfiguration = this.f84526g;
            if (paymentConfiguration == null || (splitBillPaymentParams = paymentConfiguration.f84343b) == null || (str = splitBillPaymentParams.f84347c) == null) {
                return null;
            }
            return new sdc.b(str);
        }

        @Override // pec.a
        public final n b() {
            return this.f84525c.getF84334a() ? new pec.m(this.f84523a) : l.f235371a;
        }

        @Override // tdc.g
        /* JADX INFO: renamed from: c, reason: from getter */
        public final CheckoutMode getF84525c() {
            return this.f84525c;
        }

        @Override // tdc.g
        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getF84528j() {
            return this.f84528j;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // q9c.m
        public final p e() {
            return this.f84527h != null ? o.f243873a : new q9c.n(this.e);
        }

        @Override // com.revolut.feature.revolutpay.impl.ui.summary_screen.RevolutPaySummaryScreenContract$InputData
        /* JADX INFO: renamed from: e4, reason: from getter */
        public final boolean getE() {
            return this.e;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Standard)) {
                return false;
            }
            Standard standard = (Standard) obj2;
            return Intrinsics.f(this.f84523a, standard.f84523a) && Intrinsics.f(this.f84524b, standard.f84524b) && Intrinsics.f(this.f84525c, standard.f84525c) && Intrinsics.f(this.d, standard.d) && this.e == standard.e && this.f == standard.f && Intrinsics.f(this.f84526g, standard.f84526g) && Intrinsics.f(this.f84527h, standard.f84527h) && this.i == standard.i && this.f84528j == standard.f84528j && this.k == standard.k && this.f84529l == standard.f84529l;
        }

        public final int hashCode() {
            int iHashCode = (this.f84525c.hashCode() + p.a.c(this.f84523a.hashCode() * 31, 31, this.f84524b)) * 31;
            String str = this.d;
            int iHashCode2 = (this.f.hashCode() + j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e)) * 31;
            PaymentConfiguration paymentConfiguration = this.f84526g;
            int iHashCode3 = (iHashCode2 + (paymentConfiguration == null ? 0 : paymentConfiguration.hashCode())) * 31;
            RampOrderDetails rampOrderDetails = this.f84527h;
            int iHashCode4 = (this.k.hashCode() + j6.a.c(j6.a.c((iHashCode3 + (rampOrderDetails == null ? 0 : rampOrderDetails.hashCode())) * 31, 31, this.i), 31, this.f84528j)) * 31;
            p6c.b bVar = this.f84529l;
            return iHashCode4 + (bVar != null ? bVar.hashCode() : 0);
        }

        @Override // tdc.g
        /* JADX INFO: renamed from: j, reason: from getter */
        public final PaymentConfiguration getF84526g() {
            return this.f84526g;
        }

        @Override // tdc.g
        public final t l() {
            return this.f84527h != null ? t.RAMP : t.REVPAY;
        }

        @Override // com.revolut.feature.revolutpay.impl.ui.summary_screen.RevolutPaySummaryScreenContract$InputData
        /* JADX INFO: renamed from: q2, reason: from getter */
        public final boolean getI() {
            return this.i;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84523a);
            dest.writeString(this.f84524b);
            dest.writeParcelable(this.f84525c, i);
            dest.writeString(this.d);
            dest.writeInt(this.e ? 1 : 0);
            dest.writeString(this.f.name());
            dest.writeParcelable(this.f84526g, i);
            dest.writeParcelable(this.f84527h, i);
            dest.writeInt(this.i ? 1 : 0);
            dest.writeInt(this.f84528j ? 1 : 0);
            dest.writeString(this.k.name());
            p6c.b bVar = this.f84529l;
            if (bVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(bVar.name());
            }
        }

        @Override // com.revolut.feature.revolutpay.impl.ui.summary_screen.RevolutPaySummaryScreenContract$InputData
        /* JADX INFO: renamed from: y2, reason: from getter */
        public final RampOrderDetails getF84527h() {
            return this.f84527h;
        }

        @Override // q9c.j
        public final q9c.c z() {
            return new q9c.a(this.f84523a, this.f84524b);
        }
    }

    /* JADX INFO: renamed from: e4 */
    default boolean getE() {
        return false;
    }

    /* JADX INFO: renamed from: q2 */
    boolean getI();

    /* JADX INFO: renamed from: y2 */
    default RampOrderDetails getF84527h() {
        return null;
    }
}
