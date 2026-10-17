package com.revolut.feature.apm.wero.impl.ui.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$InputData;
import com.revolut.feature.apm.core.ui.api.navigation.pending_payments.ApmPaymentAuthorisationNavigation$InputData;
import com.revolut.feature.apm.core.ui.api.navigation.qr.QrDetailsInputData;
import com.revolut.feature.apm.core.ui.api.navigation.qr.QrFlowInputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentContract$InputData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"com/revolut/feature/apm/wero/impl/ui/pay/WeroPayFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Scanner", "Transfer", "ConfirmPayment", "PendingPayment", "ShowUserCode", "RequestLinkDetails", "CreateRequestLink", "Lcom/revolut/feature/apm/wero/impl/ui/pay/WeroPayFlowContract$Step$ConfirmPayment;", "Lcom/revolut/feature/apm/wero/impl/ui/pay/WeroPayFlowContract$Step$CreateRequestLink;", "Lcom/revolut/feature/apm/wero/impl/ui/pay/WeroPayFlowContract$Step$PendingPayment;", "Lcom/revolut/feature/apm/wero/impl/ui/pay/WeroPayFlowContract$Step$RequestLinkDetails;", "Lcom/revolut/feature/apm/wero/impl/ui/pay/WeroPayFlowContract$Step$Scanner;", "Lcom/revolut/feature/apm/wero/impl/ui/pay/WeroPayFlowContract$Step$ShowUserCode;", "Lcom/revolut/feature/apm/wero/impl/ui/pay/WeroPayFlowContract$Step$Transfer;", "feature_apm_wero_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WeroPayFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/wero/impl/ui/pay/WeroPayFlowContract$Step$ConfirmPayment;", "Lcom/revolut/feature/apm/wero/impl/ui/pay/WeroPayFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_wero_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConfirmPayment implements WeroPayFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ConfirmPayment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ApmPaymentAuthorisationNavigation$InputData f63085a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ConfirmPayment((ApmPaymentAuthorisationNavigation$InputData) parcel.readParcelable(ConfirmPayment.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConfirmPayment[i];
            }
        }

        public ConfirmPayment(ApmPaymentAuthorisationNavigation$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f63085a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ConfirmPayment) && Intrinsics.f(this.f63085a, ((ConfirmPayment) obj2).f63085a);
        }

        public final int hashCode() {
            return this.f63085a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f63085a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/wero/impl/ui/pay/WeroPayFlowContract$Step$CreateRequestLink;", "Lcom/revolut/feature/apm/wero/impl/ui/pay/WeroPayFlowContract$Step;", "<init>", "()V", "feature_apm_wero_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CreateRequestLink implements WeroPayFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CreateRequestLink f63086a = new CreateRequestLink();

        @NotNull
        public static final Parcelable.Creator<CreateRequestLink> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CreateRequestLink.f63086a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreateRequestLink[i];
            }
        }

        private CreateRequestLink() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/wero/impl/ui/pay/WeroPayFlowContract$Step$PendingPayment;", "Lcom/revolut/feature/apm/wero/impl/ui/pay/WeroPayFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_wero_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PendingPayment implements WeroPayFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PendingPayment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PendingPaymentContract$InputData.Apm f63087a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PendingPayment((PendingPaymentContract$InputData.Apm) parcel.readParcelable(PendingPayment.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PendingPayment[i];
            }
        }

        public PendingPayment(PendingPaymentContract$InputData.Apm inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f63087a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PendingPayment) && Intrinsics.f(this.f63087a, ((PendingPayment) obj2).f63087a);
        }

        public final int hashCode() {
            return this.f63087a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f63087a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/wero/impl/ui/pay/WeroPayFlowContract$Step$RequestLinkDetails;", "Lcom/revolut/feature/apm/wero/impl/ui/pay/WeroPayFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_wero_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RequestLinkDetails implements WeroPayFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<RequestLinkDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final QrDetailsInputData f63088a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RequestLinkDetails((QrDetailsInputData) parcel.readParcelable(RequestLinkDetails.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RequestLinkDetails[i];
            }
        }

        public RequestLinkDetails(QrDetailsInputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f63088a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RequestLinkDetails) && Intrinsics.f(this.f63088a, ((RequestLinkDetails) obj2).f63088a);
        }

        public final int hashCode() {
            return this.f63088a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f63088a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/wero/impl/ui/pay/WeroPayFlowContract$Step$Scanner;", "Lcom/revolut/feature/apm/wero/impl/ui/pay/WeroPayFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_wero_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Scanner implements WeroPayFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Scanner> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final QrFlowInputData f63089a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Scanner((QrFlowInputData) parcel.readParcelable(Scanner.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Scanner[i];
            }
        }

        public Scanner(QrFlowInputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f63089a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Scanner) && Intrinsics.f(this.f63089a, ((Scanner) obj2).f63089a);
        }

        public final int hashCode() {
            return this.f63089a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f63089a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/wero/impl/ui/pay/WeroPayFlowContract$Step$ShowUserCode;", "Lcom/revolut/feature/apm/wero/impl/ui/pay/WeroPayFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_wero_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowUserCode implements WeroPayFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ShowUserCode> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final QrDetailsInputData f63090a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowUserCode((QrDetailsInputData) parcel.readParcelable(ShowUserCode.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowUserCode[i];
            }
        }

        public ShowUserCode(QrDetailsInputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f63090a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ShowUserCode) && Intrinsics.f(this.f63090a, ((ShowUserCode) obj2).f63090a);
        }

        public final int hashCode() {
            return this.f63090a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f63090a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/wero/impl/ui/pay/WeroPayFlowContract$Step$Transfer;", "Lcom/revolut/feature/apm/wero/impl/ui/pay/WeroPayFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_wero_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Transfer implements WeroPayFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Transfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ApmTransferContract$InputData f63091a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Transfer((ApmTransferContract$InputData) parcel.readParcelable(Transfer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Transfer[i];
            }
        }

        public Transfer(ApmTransferContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f63091a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Transfer) && Intrinsics.f(this.f63091a, ((Transfer) obj2).f63091a);
        }

        public final int hashCode() {
            return this.f63091a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f63091a, i);
        }
    }
}
