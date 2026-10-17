package com.revolut.feature.revolutpay.impl.ui.flow.summary;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u6c.k;
import u7c.c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"com/revolut/feature/revolutpay/impl/ui/flow/summary/SummaryFlowContract$PaymentResult", "Landroid/os/Parcelable;", "Successful", "DropOff", "TerminalPayment", "Failure", "OAuthSuccessful", "OAuthSetupFailed", "Lcom/revolut/feature/revolutpay/impl/ui/flow/summary/SummaryFlowContract$PaymentResult$DropOff;", "Lcom/revolut/feature/revolutpay/impl/ui/flow/summary/SummaryFlowContract$PaymentResult$Failure;", "Lcom/revolut/feature/revolutpay/impl/ui/flow/summary/SummaryFlowContract$PaymentResult$OAuthSetupFailed;", "Lcom/revolut/feature/revolutpay/impl/ui/flow/summary/SummaryFlowContract$PaymentResult$OAuthSuccessful;", "Lcom/revolut/feature/revolutpay/impl/ui/flow/summary/SummaryFlowContract$PaymentResult$Successful;", "Lcom/revolut/feature/revolutpay/impl/ui/flow/summary/SummaryFlowContract$PaymentResult$TerminalPayment;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SummaryFlowContract$PaymentResult extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/ui/flow/summary/SummaryFlowContract$PaymentResult$DropOff;", "Lcom/revolut/feature/revolutpay/impl/ui/flow/summary/SummaryFlowContract$PaymentResult;", "<init>", "()V", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DropOff implements SummaryFlowContract$PaymentResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DropOff f84482a = new DropOff();

        @NotNull
        public static final Parcelable.Creator<DropOff> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DropOff.f84482a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DropOff[i];
            }
        }

        private DropOff() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/ui/flow/summary/SummaryFlowContract$PaymentResult$Failure;", "Lcom/revolut/feature/revolutpay/impl/ui/flow/summary/SummaryFlowContract$PaymentResult;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Failure implements SummaryFlowContract$PaymentResult {

        @NotNull
        public static final Parcelable.Creator<Failure> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f84483a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Failure(parcel.readInt() == 0 ? null : k.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Failure[i];
            }
        }

        public Failure(k kVar) {
            this.f84483a = kVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Failure) && this.f84483a == ((Failure) obj2).f84483a;
        }

        public final int hashCode() {
            k kVar = this.f84483a;
            if (kVar == null) {
                return 0;
            }
            return kVar.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            k kVar = this.f84483a;
            if (kVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(kVar.name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/ui/flow/summary/SummaryFlowContract$PaymentResult$OAuthSetupFailed;", "Lcom/revolut/feature/revolutpay/impl/ui/flow/summary/SummaryFlowContract$PaymentResult;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OAuthSetupFailed implements SummaryFlowContract$PaymentResult {

        @NotNull
        public static final Parcelable.Creator<OAuthSetupFailed> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f84484a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OAuthSetupFailed(c.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OAuthSetupFailed[i];
            }
        }

        public OAuthSetupFailed(c errorCode) {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            this.f84484a = errorCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OAuthSetupFailed) && this.f84484a == ((OAuthSetupFailed) obj2).f84484a;
        }

        public final int hashCode() {
            return this.f84484a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84484a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/ui/flow/summary/SummaryFlowContract$PaymentResult$OAuthSuccessful;", "Lcom/revolut/feature/revolutpay/impl/ui/flow/summary/SummaryFlowContract$PaymentResult;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OAuthSuccessful implements SummaryFlowContract$PaymentResult {

        @NotNull
        public static final Parcelable.Creator<OAuthSuccessful> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84485a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OAuthSuccessful(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OAuthSuccessful[i];
            }
        }

        public OAuthSuccessful(String authorizationCode) {
            Intrinsics.checkNotNullParameter(authorizationCode, "authorizationCode");
            this.f84485a = authorizationCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OAuthSuccessful) && Intrinsics.f(this.f84485a, ((OAuthSuccessful) obj2).f84485a);
        }

        public final int hashCode() {
            return this.f84485a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84485a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/ui/flow/summary/SummaryFlowContract$PaymentResult$Successful;", "Lcom/revolut/feature/revolutpay/impl/ui/flow/summary/SummaryFlowContract$PaymentResult;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Successful implements SummaryFlowContract$PaymentResult {

        @NotNull
        public static final Parcelable.Creator<Successful> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84486a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Successful(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Successful[i];
            }
        }

        public Successful() {
            this(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Successful) && Intrinsics.f(this.f84486a, ((Successful) obj2).f84486a);
        }

        public final int hashCode() {
            String str = this.f84486a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84486a);
        }

        public Successful(String str) {
            this.f84486a = str;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/ui/flow/summary/SummaryFlowContract$PaymentResult$TerminalPayment;", "Lcom/revolut/feature/revolutpay/impl/ui/flow/summary/SummaryFlowContract$PaymentResult;", "<init>", "()V", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TerminalPayment implements SummaryFlowContract$PaymentResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TerminalPayment f84487a = new TerminalPayment();

        @NotNull
        public static final Parcelable.Creator<TerminalPayment> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TerminalPayment.f84487a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TerminalPayment[i];
            }
        }

        private TerminalPayment() {
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
}
