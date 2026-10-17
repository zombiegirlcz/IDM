package com.revolut.feature.revolutpay.impl.ui.summary_screen;

import aii.r;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.ParcelableDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u6c.k;

/* JADX INFO: loaded from: classes6.dex */
public abstract class RevolutPaySummaryScreenContract$OutputData implements r {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$OutputData$BackPressed;", "Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$OutputData;", "Landroid/os/Parcelable;", "<init>", "()V", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BackPressed extends RevolutPaySummaryScreenContract$OutputData implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BackPressed f84555a = new BackPressed();

        @NotNull
        public static final Parcelable.Creator<BackPressed> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BackPressed.f84555a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BackPressed[i];
            }
        }

        private BackPressed() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$OutputData$OAuthPaymentSuccessful;", "Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$OutputData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OAuthPaymentSuccessful extends RevolutPaySummaryScreenContract$OutputData implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<OAuthPaymentSuccessful> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84556a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OAuthPaymentSuccessful(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OAuthPaymentSuccessful[i];
            }
        }

        public OAuthPaymentSuccessful(String authorizationCode) {
            Intrinsics.checkNotNullParameter(authorizationCode, "authorizationCode");
            this.f84556a = authorizationCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OAuthPaymentSuccessful) && Intrinsics.f(this.f84556a, ((OAuthPaymentSuccessful) obj2).f84556a);
        }

        public final int hashCode() {
            return this.f84556a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84556a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$OutputData$OAuthSetupFailed;", "Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$OutputData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OAuthSetupFailed extends RevolutPaySummaryScreenContract$OutputData implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<OAuthSetupFailed> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u7c.c f84557a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OAuthSetupFailed(u7c.c.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OAuthSetupFailed[i];
            }
        }

        public OAuthSetupFailed(u7c.c errorCode) {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            this.f84557a = errorCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OAuthSetupFailed) && this.f84557a == ((OAuthSetupFailed) obj2).f84557a;
        }

        public final int hashCode() {
            return this.f84557a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84557a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$OutputData$OrderComplete;", "Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$OutputData;", "Landroid/os/Parcelable;", "<init>", "()V", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OrderComplete extends RevolutPaySummaryScreenContract$OutputData implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OrderComplete f84558a = new OrderComplete();

        @NotNull
        public static final Parcelable.Creator<OrderComplete> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OrderComplete.f84558a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OrderComplete[i];
            }
        }

        private OrderComplete() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$OutputData$PaymentFailure;", "Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$OutputData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentFailure extends RevolutPaySummaryScreenContract$OutputData implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<PaymentFailure> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f84559a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentFailure(parcel.readInt() == 0 ? null : k.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentFailure[i];
            }
        }

        public PaymentFailure(k kVar) {
            this.f84559a = kVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PaymentFailure) && this.f84559a == ((PaymentFailure) obj2).f84559a;
        }

        public final int hashCode() {
            k kVar = this.f84559a;
            if (kVar == null) {
                return 0;
            }
            return kVar.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            k kVar = this.f84559a;
            if (kVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(kVar.name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$OutputData$RedirectToBusiness;", "Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$OutputData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RedirectToBusiness extends RevolutPaySummaryScreenContract$OutputData implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<RedirectToBusiness> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ParcelableDestination f84561a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RedirectToBusiness((ParcelableDestination) parcel.readParcelable(RedirectToBusiness.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RedirectToBusiness[i];
            }
        }

        public RedirectToBusiness(ParcelableDestination destination) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            this.f84561a = destination;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RedirectToBusiness) && Intrinsics.f(this.f84561a, ((RedirectToBusiness) obj2).f84561a);
        }

        public final int hashCode() {
            return this.f84561a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f84561a, i);
        }
    }

    private RevolutPaySummaryScreenContract$OutputData() {
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$OutputData$PaymentSuccessful;", "Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$OutputData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentSuccessful extends RevolutPaySummaryScreenContract$OutputData implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<PaymentSuccessful> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84560a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentSuccessful(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentSuccessful[i];
            }
        }

        public PaymentSuccessful(String str) {
            this.f84560a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PaymentSuccessful) && Intrinsics.f(this.f84560a, ((PaymentSuccessful) obj2).f84560a);
        }

        public final int hashCode() {
            String str = this.f84560a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84560a);
        }

        public PaymentSuccessful() {
            this(null);
        }
    }
}
