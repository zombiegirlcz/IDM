package com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.transfers.money_requests.ApmAcceptMoneyRequest;
import com.revolut.feature.apm.core.models.transfers.money_requests.ApmMoneyRequestInfo;
import com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentDraftRequest;
import com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentInfo;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferRecipient;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonsValues;
import hrf.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/transfer/helpers/models/TransferReviewInfo;", "Landroid/os/Parcelable;", "Send", "Request", "AcceptMoneyRequest", "Draft", "Lcom/revolut/feature/apm/core/ui/impl/ui/transfer/helpers/models/TransferReviewInfo$AcceptMoneyRequest;", "Lcom/revolut/feature/apm/core/ui/impl/ui/transfer/helpers/models/TransferReviewInfo$Draft;", "Lcom/revolut/feature/apm/core/ui/impl/ui/transfer/helpers/models/TransferReviewInfo$Request;", "Lcom/revolut/feature/apm/core/ui/impl/ui/transfer/helpers/models/TransferReviewInfo$Send;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TransferReviewInfo extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/transfer/helpers/models/TransferReviewInfo$AcceptMoneyRequest;", "Lcom/revolut/feature/apm/core/ui/impl/ui/transfer/helpers/models/TransferReviewInfo;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AcceptMoneyRequest implements TransferReviewInfo {

        @NotNull
        public static final Parcelable.Creator<AcceptMoneyRequest> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ApmAcceptMoneyRequest f62458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ApmTransferRecipient f62459b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AcceptMoneyRequest((ApmAcceptMoneyRequest) parcel.readParcelable(AcceptMoneyRequest.class.getClassLoader()), (ApmTransferRecipient) parcel.readParcelable(AcceptMoneyRequest.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AcceptMoneyRequest[i];
            }
        }

        public AcceptMoneyRequest(ApmAcceptMoneyRequest info, ApmTransferRecipient recipient) {
            Intrinsics.checkNotNullParameter(info, "info");
            Intrinsics.checkNotNullParameter(recipient, "recipient");
            this.f62458a = info;
            this.f62459b = recipient;
        }

        @Override // com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo
        public final String G0() {
            return this.f62459b.getF62300a();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AcceptMoneyRequest)) {
                return false;
            }
            AcceptMoneyRequest acceptMoneyRequest = (AcceptMoneyRequest) obj2;
            return Intrinsics.f(this.f62458a, acceptMoneyRequest.f62458a) && Intrinsics.f(this.f62459b, acceptMoneyRequest.f62459b);
        }

        public final int hashCode() {
            return this.f62459b.hashCode() + (this.f62458a.hashCode() * 31);
        }

        @Override // com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo
        public final f k() {
            return f.OUTGOING;
        }

        @Override // com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo
        /* JADX INFO: renamed from: t0, reason: from getter */
        public final ApmTransferRecipient getF62463a() {
            return this.f62459b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62458a, i);
            dest.writeParcelable(this.f62459b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/transfer/helpers/models/TransferReviewInfo$Draft;", "Lcom/revolut/feature/apm/core/ui/impl/ui/transfer/helpers/models/TransferReviewInfo;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Draft implements TransferReviewInfo {

        @NotNull
        public static final Parcelable.Creator<Draft> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ApmPaymentDraftRequest f62460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ApmTransferRecipient f62461b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Draft((ApmPaymentDraftRequest) parcel.readParcelable(Draft.class.getClassLoader()), (ApmTransferRecipient) parcel.readParcelable(Draft.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Draft[i];
            }
        }

        public Draft(ApmPaymentDraftRequest info, ApmTransferRecipient recipient) {
            Intrinsics.checkNotNullParameter(info, "info");
            Intrinsics.checkNotNullParameter(recipient, "recipient");
            this.f62460a = info;
            this.f62461b = recipient;
        }

        @Override // com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo
        public final String G0() {
            return this.f62461b.getF62300a();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Draft)) {
                return false;
            }
            Draft draft = (Draft) obj2;
            return Intrinsics.f(this.f62460a, draft.f62460a) && Intrinsics.f(this.f62461b, draft.f62461b);
        }

        public final int hashCode() {
            return this.f62461b.hashCode() + (this.f62460a.hashCode() * 31);
        }

        @Override // com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo
        public final f k() {
            return f.OUTGOING;
        }

        @Override // com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo
        /* JADX INFO: renamed from: t0, reason: from getter */
        public final ApmTransferRecipient getF62463a() {
            return this.f62461b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62460a, i);
            dest.writeParcelable(this.f62461b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/transfer/helpers/models/TransferReviewInfo$Request;", "Lcom/revolut/feature/apm/core/ui/impl/ui/transfer/helpers/models/TransferReviewInfo;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Request implements TransferReviewInfo {

        @NotNull
        public static final Parcelable.Creator<Request> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ApmMoneyRequestInfo f62462a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Request((ApmMoneyRequestInfo) parcel.readParcelable(Request.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Request[i];
            }
        }

        public Request(ApmMoneyRequestInfo info) {
            Intrinsics.checkNotNullParameter(info, "info");
            this.f62462a = info;
        }

        @Override // com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo
        public final String G0() {
            return this.f62462a.getF62189b().getDisplayName();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Request) && Intrinsics.f(this.f62462a, ((Request) obj2).f62462a);
        }

        public final int hashCode() {
            return this.f62462a.hashCode();
        }

        @Override // com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo
        public final f k() {
            return f.INCOMING;
        }

        @Override // com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo
        /* JADX INFO: renamed from: t0 */
        public final ApmTransferRecipient getF62463a() {
            return new ApmTransferRecipient.Contact(this.f62462a.getF62189b());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62462a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/transfer/helpers/models/TransferReviewInfo$Send;", "Lcom/revolut/feature/apm/core/ui/impl/ui/transfer/helpers/models/TransferReviewInfo;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Send implements TransferReviewInfo {

        @NotNull
        public static final Parcelable.Creator<Send> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ApmTransferRecipient f62463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ApmPaymentInfo f62464b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TransferReasonsValues f62465c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Send((ApmTransferRecipient) parcel.readParcelable(Send.class.getClassLoader()), (ApmPaymentInfo) parcel.readParcelable(Send.class.getClassLoader()), (TransferReasonsValues) parcel.readParcelable(Send.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Send[i];
            }
        }

        public Send(ApmTransferRecipient recipient, ApmPaymentInfo info, TransferReasonsValues transferReasonsValues) {
            Intrinsics.checkNotNullParameter(recipient, "recipient");
            Intrinsics.checkNotNullParameter(info, "info");
            this.f62463a = recipient;
            this.f62464b = info;
            this.f62465c = transferReasonsValues;
        }

        @Override // com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo
        public final String G0() {
            String str = this.f62464b.f62206c;
            return str == null ? this.f62463a.getF62300a() : str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Send)) {
                return false;
            }
            Send send = (Send) obj2;
            return Intrinsics.f(this.f62463a, send.f62463a) && Intrinsics.f(this.f62464b, send.f62464b) && Intrinsics.f(this.f62465c, send.f62465c);
        }

        public final int hashCode() {
            int iHashCode = (this.f62464b.hashCode() + (this.f62463a.hashCode() * 31)) * 31;
            TransferReasonsValues transferReasonsValues = this.f62465c;
            return iHashCode + (transferReasonsValues == null ? 0 : transferReasonsValues.hashCode());
        }

        @Override // com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo
        public final f k() {
            return f.OUTGOING;
        }

        @Override // com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo
        /* JADX INFO: renamed from: t0, reason: from getter */
        public final ApmTransferRecipient getF62463a() {
            return this.f62463a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62463a, i);
            dest.writeParcelable(this.f62464b, i);
            dest.writeParcelable(this.f62465c, i);
        }
    }

    String G0();

    f k();

    /* JADX INFO: renamed from: t0 */
    ApmTransferRecipient getF62463a();
}
