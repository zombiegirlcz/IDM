package com.revolut.feature.shared.beneficiary.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.shared.beneficiary.api.common.QrScanResult;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.feature.transfer.models.ScannedBillDetails;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/shared/beneficiary/api/navigation/BeneficiaryCreationKompotFinishMode;", "Landroid/os/Parcelable;", "NavigateToTransfer", "Finish", "RequestCode", "LegacyResult", "KompotResult", "Lcom/revolut/feature/shared/beneficiary/api/navigation/BeneficiaryCreationKompotFinishMode$Finish;", "Lcom/revolut/feature/shared/beneficiary/api/navigation/BeneficiaryCreationKompotFinishMode$KompotResult;", "Lcom/revolut/feature/shared/beneficiary/api/navigation/BeneficiaryCreationKompotFinishMode$LegacyResult;", "Lcom/revolut/feature/shared/beneficiary/api/navigation/BeneficiaryCreationKompotFinishMode$NavigateToTransfer;", "Lcom/revolut/feature/shared/beneficiary/api/navigation/BeneficiaryCreationKompotFinishMode$RequestCode;", "feature_shared_beneficiary_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BeneficiaryCreationKompotFinishMode extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/shared/beneficiary/api/navigation/BeneficiaryCreationKompotFinishMode$Finish;", "Lcom/revolut/feature/shared/beneficiary/api/navigation/BeneficiaryCreationKompotFinishMode;", "<init>", "()V", "feature_shared_beneficiary_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Finish implements BeneficiaryCreationKompotFinishMode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Finish f86047a = new Finish();

        @NotNull
        public static final Parcelable.Creator<Finish> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Finish.f86047a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Finish[i];
            }
        }

        private Finish() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/shared/beneficiary/api/navigation/BeneficiaryCreationKompotFinishMode$KompotResult;", "Lcom/revolut/feature/shared/beneficiary/api/navigation/BeneficiaryCreationKompotFinishMode;", "<init>", "()V", "feature_shared_beneficiary_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class KompotResult implements BeneficiaryCreationKompotFinishMode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final KompotResult f86048a = new KompotResult();

        @NotNull
        public static final Parcelable.Creator<KompotResult> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return KompotResult.f86048a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new KompotResult[i];
            }
        }

        private KompotResult() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/shared/beneficiary/api/navigation/BeneficiaryCreationKompotFinishMode$LegacyResult;", "Lcom/revolut/feature/shared/beneficiary/api/navigation/BeneficiaryCreationKompotFinishMode;", "<init>", "()V", "feature_shared_beneficiary_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LegacyResult implements BeneficiaryCreationKompotFinishMode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LegacyResult f86049a = new LegacyResult();

        @NotNull
        public static final Parcelable.Creator<LegacyResult> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LegacyResult.f86049a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LegacyResult[i];
            }
        }

        private LegacyResult() {
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

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/shared/beneficiary/api/navigation/BeneficiaryCreationKompotFinishMode$NavigateToTransfer;", "Lcom/revolut/feature/shared/beneficiary/api/navigation/BeneficiaryCreationKompotFinishMode;", "Default", "QrResult", "Lcom/revolut/feature/shared/beneficiary/api/navigation/BeneficiaryCreationKompotFinishMode$NavigateToTransfer$Default;", "Lcom/revolut/feature/shared/beneficiary/api/navigation/BeneficiaryCreationKompotFinishMode$NavigateToTransfer$QrResult;", "feature_shared_beneficiary_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface NavigateToTransfer extends BeneficiaryCreationKompotFinishMode {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/beneficiary/api/navigation/BeneficiaryCreationKompotFinishMode$NavigateToTransfer$Default;", "Lcom/revolut/feature/shared/beneficiary/api/navigation/BeneficiaryCreationKompotFinishMode$NavigateToTransfer;", "", "toString", "()Ljava/lang/String;", "feature_shared_beneficiary_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Default implements NavigateToTransfer {

            @NotNull
            public static final Parcelable.Creator<Default> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TransferMoneyPocket f86050a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final AccountId f86051b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final ScannedBillDetails f86052c;
            public final String d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Default((TransferMoneyPocket) parcel.readParcelable(Default.class.getClassLoader()), (AccountId) parcel.readParcelable(Default.class.getClassLoader()), (ScannedBillDetails) parcel.readParcelable(Default.class.getClassLoader()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Default[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Default() {
                this((TransferMoneyPocket) null, (ScannedBillDetails) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), 15);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Default)) {
                    return false;
                }
                Default r56 = (Default) obj2;
                return Intrinsics.f(this.f86050a, r56.f86050a) && Intrinsics.f(this.f86051b, r56.f86051b) && Intrinsics.f(this.f86052c, r56.f86052c) && Intrinsics.f(this.d, r56.d);
            }

            public final int hashCode() {
                TransferMoneyPocket transferMoneyPocket = this.f86050a;
                int iB = l.b(this.f86051b, (transferMoneyPocket == null ? 0 : transferMoneyPocket.hashCode()) * 31, 31);
                ScannedBillDetails scannedBillDetails = this.f86052c;
                int iHashCode = (iB + (scannedBillDetails == null ? 0 : scannedBillDetails.f92265a.hashCode())) * 31;
                String str = this.d;
                return iHashCode + (str != null ? str.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f86050a, i);
                dest.writeParcelable(this.f86051b, i);
                dest.writeParcelable(this.f86052c, i);
                dest.writeString(this.d);
            }

            public Default(TransferMoneyPocket transferMoneyPocket, AccountId accountId, ScannedBillDetails scannedBillDetails, String str) {
                Intrinsics.checkNotNullParameter(accountId, "accountId");
                this.f86050a = transferMoneyPocket;
                this.f86051b = accountId;
                this.f86052c = scannedBillDetails;
                this.d = str;
            }

            public /* synthetic */ Default(TransferMoneyPocket transferMoneyPocket, ScannedBillDetails scannedBillDetails, String str, int i) {
                this((i & 1) != 0 ? null : transferMoneyPocket, AccountId.Personal.f51414a, (i & 4) != 0 ? null : scannedBillDetails, (i & 8) != 0 ? null : str);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/beneficiary/api/navigation/BeneficiaryCreationKompotFinishMode$NavigateToTransfer$QrResult;", "Lcom/revolut/feature/shared/beneficiary/api/navigation/BeneficiaryCreationKompotFinishMode$NavigateToTransfer;", "", "toString", "()Ljava/lang/String;", "feature_shared_beneficiary_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class QrResult implements NavigateToTransfer {

            @NotNull
            public static final Parcelable.Creator<QrResult> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final QrScanResult f86053a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new QrResult(QrScanResult.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new QrResult[i];
                }
            }

            public QrResult(QrScanResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                this.f86053a = result;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof QrResult) && Intrinsics.f(this.f86053a, ((QrResult) obj2).f86053a);
            }

            public final int hashCode() {
                return this.f86053a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f86053a.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/shared/beneficiary/api/navigation/BeneficiaryCreationKompotFinishMode$RequestCode;", "Lcom/revolut/feature/shared/beneficiary/api/navigation/BeneficiaryCreationKompotFinishMode;", "<init>", "()V", "feature_shared_beneficiary_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RequestCode implements BeneficiaryCreationKompotFinishMode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RequestCode f86054a = new RequestCode();

        @NotNull
        public static final Parcelable.Creator<RequestCode> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RequestCode.f86054a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RequestCode[i];
            }
        }

        private RequestCode() {
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
