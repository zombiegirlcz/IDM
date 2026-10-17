package com.revolut.feature.transfer_reasons.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.transfer_reasons.models.interactor.TransferReasonsRequest;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasons;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonsValues;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/transfer_reasons/api/navigation/TransferReasonsFlowInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "OpenForResult", "EditForResult", "EditFromTransaction", "CreateForPendingTransaction", "Lcom/revolut/feature/transfer_reasons/api/navigation/TransferReasonsFlowInputData$CreateForPendingTransaction;", "Lcom/revolut/feature/transfer_reasons/api/navigation/TransferReasonsFlowInputData$EditForResult;", "Lcom/revolut/feature/transfer_reasons/api/navigation/TransferReasonsFlowInputData$EditFromTransaction;", "Lcom/revolut/feature/transfer_reasons/api/navigation/TransferReasonsFlowInputData$OpenForResult;", "feature_transfer_reasons_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TransferReasonsFlowInputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer_reasons/api/navigation/TransferReasonsFlowInputData$CreateForPendingTransaction;", "Lcom/revolut/feature/transfer_reasons/api/navigation/TransferReasonsFlowInputData;", "", "toString", "()Ljava/lang/String;", "feature_transfer_reasons_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreateForPendingTransaction implements TransferReasonsFlowInputData {

        @NotNull
        public static final Parcelable.Creator<CreateForPendingTransaction> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f92316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f92317b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TransferReasons f92318c;
        public final TransferReasonsRequest.ForTransaction d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreateForPendingTransaction((d) parcel.readSerializable(), parcel.readString(), (TransferReasons) parcel.readParcelable(CreateForPendingTransaction.class.getClassLoader()), (TransferReasonsRequest.ForTransaction) parcel.readParcelable(CreateForPendingTransaction.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreateForPendingTransaction[i];
            }
        }

        public CreateForPendingTransaction(d amount, String pocketId, TransferReasons reasons, TransferReasonsRequest.ForTransaction reasonsRequest) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(pocketId, "pocketId");
            Intrinsics.checkNotNullParameter(reasons, "reasons");
            Intrinsics.checkNotNullParameter(reasonsRequest, "reasonsRequest");
            this.f92316a = amount;
            this.f92317b = pocketId;
            this.f92318c = reasons;
            this.d = reasonsRequest;
        }

        @Override // com.revolut.feature.transfer_reasons.api.navigation.TransferReasonsFlowInputData
        /* JADX INFO: renamed from: G1 */
        public final TransferReasonsRequest getD() {
            return this.d;
        }

        @Override // com.revolut.feature.transfer_reasons.api.navigation.TransferReasonsFlowInputData
        /* JADX INFO: renamed from: Z0, reason: from getter */
        public final d getF92325a() {
            return this.f92316a;
        }

        @Override // com.revolut.feature.transfer_reasons.api.navigation.TransferReasonsFlowInputData
        /* JADX INFO: renamed from: b1, reason: from getter */
        public final TransferReasons getF92327c() {
            return this.f92318c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CreateForPendingTransaction)) {
                return false;
            }
            CreateForPendingTransaction createForPendingTransaction = (CreateForPendingTransaction) obj2;
            return Intrinsics.f(this.f92316a, createForPendingTransaction.f92316a) && Intrinsics.f(this.f92317b, createForPendingTransaction.f92317b) && Intrinsics.f(this.f92318c, createForPendingTransaction.f92318c) && Intrinsics.f(this.d, createForPendingTransaction.d);
        }

        @Override // com.revolut.feature.transfer_reasons.api.navigation.TransferReasonsFlowInputData
        /* JADX INFO: renamed from: getPocketId, reason: from getter */
        public final String getF92326b() {
            return this.f92317b;
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.f92318c.hashCode() + p.a.c(this.f92316a.hashCode() * 31, 31, this.f92317b)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f92316a);
            dest.writeString(this.f92317b);
            dest.writeParcelable(this.f92318c, i);
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer_reasons/api/navigation/TransferReasonsFlowInputData$EditForResult;", "Lcom/revolut/feature/transfer_reasons/api/navigation/TransferReasonsFlowInputData;", "", "toString", "()Ljava/lang/String;", "feature_transfer_reasons_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditForResult implements TransferReasonsFlowInputData {

        @NotNull
        public static final Parcelable.Creator<EditForResult> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f92319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f92320b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TransferReasons f92321c;
        public final TransferReasonsRequest d;
        public final TransferReasonsValues e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditForResult((d) parcel.readSerializable(), parcel.readString(), (TransferReasons) parcel.readParcelable(EditForResult.class.getClassLoader()), (TransferReasonsRequest) parcel.readParcelable(EditForResult.class.getClassLoader()), (TransferReasonsValues) parcel.readParcelable(EditForResult.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditForResult[i];
            }
        }

        public EditForResult(d amount, String pocketId, TransferReasons reasons, TransferReasonsRequest reasonsRequest, TransferReasonsValues initialValues) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(pocketId, "pocketId");
            Intrinsics.checkNotNullParameter(reasons, "reasons");
            Intrinsics.checkNotNullParameter(reasonsRequest, "reasonsRequest");
            Intrinsics.checkNotNullParameter(initialValues, "initialValues");
            this.f92319a = amount;
            this.f92320b = pocketId;
            this.f92321c = reasons;
            this.d = reasonsRequest;
            this.e = initialValues;
        }

        @Override // com.revolut.feature.transfer_reasons.api.navigation.TransferReasonsFlowInputData
        /* JADX INFO: renamed from: G1, reason: from getter */
        public final TransferReasonsRequest getD() {
            return this.d;
        }

        @Override // com.revolut.feature.transfer_reasons.api.navigation.TransferReasonsFlowInputData
        /* JADX INFO: renamed from: Z0, reason: from getter */
        public final d getF92325a() {
            return this.f92319a;
        }

        @Override // com.revolut.feature.transfer_reasons.api.navigation.TransferReasonsFlowInputData
        /* JADX INFO: renamed from: b1, reason: from getter */
        public final TransferReasons getF92327c() {
            return this.f92321c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EditForResult)) {
                return false;
            }
            EditForResult editForResult = (EditForResult) obj2;
            return Intrinsics.f(this.f92319a, editForResult.f92319a) && Intrinsics.f(this.f92320b, editForResult.f92320b) && Intrinsics.f(this.f92321c, editForResult.f92321c) && Intrinsics.f(this.d, editForResult.d) && Intrinsics.f(this.e, editForResult.e);
        }

        @Override // com.revolut.feature.transfer_reasons.api.navigation.TransferReasonsFlowInputData
        /* JADX INFO: renamed from: getPocketId, reason: from getter */
        public final String getF92326b() {
            return this.f92320b;
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + ((this.f92321c.hashCode() + p.a.c(this.f92319a.hashCode() * 31, 31, this.f92320b)) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f92319a);
            dest.writeString(this.f92320b);
            dest.writeParcelable(this.f92321c, i);
            dest.writeParcelable(this.d, i);
            dest.writeParcelable(this.e, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer_reasons/api/navigation/TransferReasonsFlowInputData$EditFromTransaction;", "Lcom/revolut/feature/transfer_reasons/api/navigation/TransferReasonsFlowInputData;", "", "toString", "()Ljava/lang/String;", "feature_transfer_reasons_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditFromTransaction implements TransferReasonsFlowInputData {

        @NotNull
        public static final Parcelable.Creator<EditFromTransaction> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f92322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TransferReasons f92323b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f92324c;
        public final String d;
        public final ttf.a e;
        public final TransferReasonsRequest f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditFromTransaction((d) parcel.readSerializable(), (TransferReasons) parcel.readParcelable(EditFromTransaction.class.getClassLoader()), parcel.readString(), parcel.readString(), (ttf.a) parcel.readSerializable(), (TransferReasonsRequest) parcel.readParcelable(EditFromTransaction.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditFromTransaction[i];
            }
        }

        public EditFromTransaction(d amount, TransferReasons reasons, String pocketId, String transactionId, ttf.a transactionTransferReasons, TransferReasonsRequest reasonsRequest) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(reasons, "reasons");
            Intrinsics.checkNotNullParameter(pocketId, "pocketId");
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            Intrinsics.checkNotNullParameter(transactionTransferReasons, "transactionTransferReasons");
            Intrinsics.checkNotNullParameter(reasonsRequest, "reasonsRequest");
            this.f92322a = amount;
            this.f92323b = reasons;
            this.f92324c = pocketId;
            this.d = transactionId;
            this.e = transactionTransferReasons;
            this.f = reasonsRequest;
        }

        @Override // com.revolut.feature.transfer_reasons.api.navigation.TransferReasonsFlowInputData
        /* JADX INFO: renamed from: G1, reason: from getter */
        public final TransferReasonsRequest getD() {
            return this.f;
        }

        @Override // com.revolut.feature.transfer_reasons.api.navigation.TransferReasonsFlowInputData
        /* JADX INFO: renamed from: Z0, reason: from getter */
        public final d getF92325a() {
            return this.f92322a;
        }

        @Override // com.revolut.feature.transfer_reasons.api.navigation.TransferReasonsFlowInputData
        /* JADX INFO: renamed from: b1, reason: from getter */
        public final TransferReasons getF92327c() {
            return this.f92323b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EditFromTransaction)) {
                return false;
            }
            EditFromTransaction editFromTransaction = (EditFromTransaction) obj2;
            return Intrinsics.f(this.f92322a, editFromTransaction.f92322a) && Intrinsics.f(this.f92323b, editFromTransaction.f92323b) && Intrinsics.f(this.f92324c, editFromTransaction.f92324c) && Intrinsics.f(this.d, editFromTransaction.d) && Intrinsics.f(this.e, editFromTransaction.e) && Intrinsics.f(this.f, editFromTransaction.f);
        }

        @Override // com.revolut.feature.transfer_reasons.api.navigation.TransferReasonsFlowInputData
        /* JADX INFO: renamed from: getPocketId, reason: from getter */
        public final String getF92326b() {
            return this.f92324c;
        }

        public final int hashCode() {
            return this.f.hashCode() + ((this.e.hashCode() + p.a.c(p.a.c((this.f92323b.hashCode() + (this.f92322a.hashCode() * 31)) * 31, 31, this.f92324c), 31, this.d)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f92322a);
            dest.writeParcelable(this.f92323b, i);
            dest.writeString(this.f92324c);
            dest.writeString(this.d);
            dest.writeSerializable(this.e);
            dest.writeParcelable(this.f, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer_reasons/api/navigation/TransferReasonsFlowInputData$OpenForResult;", "Lcom/revolut/feature/transfer_reasons/api/navigation/TransferReasonsFlowInputData;", "", "toString", "()Ljava/lang/String;", "feature_transfer_reasons_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenForResult implements TransferReasonsFlowInputData {

        @NotNull
        public static final Parcelable.Creator<OpenForResult> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f92325a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f92326b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TransferReasons f92327c;
        public final TransferReasonsRequest d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenForResult((d) parcel.readSerializable(), parcel.readString(), (TransferReasons) parcel.readParcelable(OpenForResult.class.getClassLoader()), (TransferReasonsRequest) parcel.readParcelable(OpenForResult.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenForResult[i];
            }
        }

        public OpenForResult(d amount, String pocketId, TransferReasons reasons, TransferReasonsRequest reasonsRequest) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(pocketId, "pocketId");
            Intrinsics.checkNotNullParameter(reasons, "reasons");
            Intrinsics.checkNotNullParameter(reasonsRequest, "reasonsRequest");
            this.f92325a = amount;
            this.f92326b = pocketId;
            this.f92327c = reasons;
            this.d = reasonsRequest;
        }

        @Override // com.revolut.feature.transfer_reasons.api.navigation.TransferReasonsFlowInputData
        /* JADX INFO: renamed from: G1, reason: from getter */
        public final TransferReasonsRequest getD() {
            return this.d;
        }

        @Override // com.revolut.feature.transfer_reasons.api.navigation.TransferReasonsFlowInputData
        /* JADX INFO: renamed from: Z0, reason: from getter */
        public final d getF92325a() {
            return this.f92325a;
        }

        @Override // com.revolut.feature.transfer_reasons.api.navigation.TransferReasonsFlowInputData
        /* JADX INFO: renamed from: b1, reason: from getter */
        public final TransferReasons getF92327c() {
            return this.f92327c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OpenForResult)) {
                return false;
            }
            OpenForResult openForResult = (OpenForResult) obj2;
            return Intrinsics.f(this.f92325a, openForResult.f92325a) && Intrinsics.f(this.f92326b, openForResult.f92326b) && Intrinsics.f(this.f92327c, openForResult.f92327c) && Intrinsics.f(this.d, openForResult.d);
        }

        @Override // com.revolut.feature.transfer_reasons.api.navigation.TransferReasonsFlowInputData
        /* JADX INFO: renamed from: getPocketId, reason: from getter */
        public final String getF92326b() {
            return this.f92326b;
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.f92327c.hashCode() + p.a.c(this.f92325a.hashCode() * 31, 31, this.f92326b)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f92325a);
            dest.writeString(this.f92326b);
            dest.writeParcelable(this.f92327c, i);
            dest.writeParcelable(this.d, i);
        }
    }

    /* JADX INFO: renamed from: G1 */
    TransferReasonsRequest getD();

    /* JADX INFO: renamed from: Z0 */
    d getF92325a();

    /* JADX INFO: renamed from: b1 */
    TransferReasons getF92327c();

    /* JADX INFO: renamed from: getPocketId */
    String getF92326b();
}
