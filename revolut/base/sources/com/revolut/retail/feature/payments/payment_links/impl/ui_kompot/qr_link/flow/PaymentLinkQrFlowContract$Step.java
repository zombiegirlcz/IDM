package com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.qr_link.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/retail/feature/payments/payment_links/impl/ui_kompot/qr_link/flow/PaymentLinkQrFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "QrCodeScreen", "PermissionScreen", "Lcom/revolut/retail/feature/payments/payment_links/impl/ui_kompot/qr_link/flow/PaymentLinkQrFlowContract$Step$PermissionScreen;", "Lcom/revolut/retail/feature/payments/payment_links/impl/ui_kompot/qr_link/flow/PaymentLinkQrFlowContract$Step$QrCodeScreen;", "feature_payments_payment_links_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PaymentLinkQrFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/payment_links/impl/ui_kompot/qr_link/flow/PaymentLinkQrFlowContract$Step$PermissionScreen;", "Lcom/revolut/retail/feature/payments/payment_links/impl/ui_kompot/qr_link/flow/PaymentLinkQrFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_payments_payment_links_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PermissionScreen extends PaymentLinkQrFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PermissionScreen> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f102217a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PermissionScreen(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PermissionScreen[i];
            }
        }

        public PermissionScreen(String username) {
            Intrinsics.checkNotNullParameter(username, "username");
            this.f102217a = username;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PermissionScreen) && Intrinsics.f(this.f102217a, ((PermissionScreen) obj2).f102217a);
        }

        public final int hashCode() {
            return this.f102217a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102217a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/payment_links/impl/ui_kompot/qr_link/flow/PaymentLinkQrFlowContract$Step$QrCodeScreen;", "Lcom/revolut/retail/feature/payments/payment_links/impl/ui_kompot/qr_link/flow/PaymentLinkQrFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_payments_payment_links_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class QrCodeScreen extends PaymentLinkQrFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<QrCodeScreen> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f102218a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new QrCodeScreen(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new QrCodeScreen[i];
            }
        }

        public QrCodeScreen(String username) {
            Intrinsics.checkNotNullParameter(username, "username");
            this.f102218a = username;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof QrCodeScreen) && Intrinsics.f(this.f102218a, ((QrCodeScreen) obj2).f102218a);
        }

        public final int hashCode() {
            return this.f102218a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102218a);
        }
    }

    private PaymentLinkQrFlowContract$Step() {
    }
}
