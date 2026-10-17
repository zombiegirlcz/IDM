package com.revolut.feature.junior_settings.impl.ui_kompot.qr_code_scanner;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.identity.auth.domain.model.IndividualIdentityId;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/junior_settings/impl/ui_kompot/qr_code_scanner/JuniorAuthQrScannerFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "QrScanner", "QrCodeInstructionsDialog", "QrCodeChallenge", "EnterQrDataDialog", "Lcom/revolut/feature/junior_settings/impl/ui_kompot/qr_code_scanner/JuniorAuthQrScannerFlowContract$Step$EnterQrDataDialog;", "Lcom/revolut/feature/junior_settings/impl/ui_kompot/qr_code_scanner/JuniorAuthQrScannerFlowContract$Step$QrCodeChallenge;", "Lcom/revolut/feature/junior_settings/impl/ui_kompot/qr_code_scanner/JuniorAuthQrScannerFlowContract$Step$QrCodeInstructionsDialog;", "Lcom/revolut/feature/junior_settings/impl/ui_kompot/qr_code_scanner/JuniorAuthQrScannerFlowContract$Step$QrScanner;", "feature_junior_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class JuniorAuthQrScannerFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_settings/impl/ui_kompot/qr_code_scanner/JuniorAuthQrScannerFlowContract$Step$EnterQrDataDialog;", "Lcom/revolut/feature/junior_settings/impl/ui_kompot/qr_code_scanner/JuniorAuthQrScannerFlowContract$Step;", "<init>", "()V", "feature_junior_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EnterQrDataDialog extends JuniorAuthQrScannerFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EnterQrDataDialog f77313a = new EnterQrDataDialog();

        @NotNull
        public static final Parcelable.Creator<EnterQrDataDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EnterQrDataDialog.f77313a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EnterQrDataDialog[i];
            }
        }

        private EnterQrDataDialog() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_settings/impl/ui_kompot/qr_code_scanner/JuniorAuthQrScannerFlowContract$Step$QrCodeChallenge;", "Lcom/revolut/feature/junior_settings/impl/ui_kompot/qr_code_scanner/JuniorAuthQrScannerFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_junior_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class QrCodeChallenge extends JuniorAuthQrScannerFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<QrCodeChallenge> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f77314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f77315b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new QrCodeChallenge(parcel.readString(), ((IndividualIdentityId) parcel.readParcelable(QrCodeChallenge.class.getClassLoader())).f74763a);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new QrCodeChallenge[i];
            }
        }

        public QrCodeChallenge(String challengeId, String youthIndividualIdentityId) {
            Intrinsics.checkNotNullParameter(challengeId, "challengeId");
            Intrinsics.checkNotNullParameter(youthIndividualIdentityId, "youthIndividualIdentityId");
            this.f77314a = challengeId;
            this.f77315b = youthIndividualIdentityId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof QrCodeChallenge)) {
                return false;
            }
            QrCodeChallenge qrCodeChallenge = (QrCodeChallenge) obj2;
            return Intrinsics.f(this.f77314a, qrCodeChallenge.f77314a) && Intrinsics.f(this.f77315b, qrCodeChallenge.f77315b);
        }

        public final int hashCode() {
            return this.f77315b.hashCode() + (this.f77314a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77314a);
            dest.writeParcelable(new IndividualIdentityId(this.f77315b), i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_settings/impl/ui_kompot/qr_code_scanner/JuniorAuthQrScannerFlowContract$Step$QrCodeInstructionsDialog;", "Lcom/revolut/feature/junior_settings/impl/ui_kompot/qr_code_scanner/JuniorAuthQrScannerFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_junior_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class QrCodeInstructionsDialog extends JuniorAuthQrScannerFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<QrCodeInstructionsDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f77316a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new QrCodeInstructionsDialog(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new QrCodeInstructionsDialog[i];
            }
        }

        public QrCodeInstructionsDialog(String juniorFirstName) {
            Intrinsics.checkNotNullParameter(juniorFirstName, "juniorFirstName");
            this.f77316a = juniorFirstName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof QrCodeInstructionsDialog) && Intrinsics.f(this.f77316a, ((QrCodeInstructionsDialog) obj2).f77316a);
        }

        public final int hashCode() {
            return this.f77316a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77316a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_settings/impl/ui_kompot/qr_code_scanner/JuniorAuthQrScannerFlowContract$Step$QrScanner;", "Lcom/revolut/feature/junior_settings/impl/ui_kompot/qr_code_scanner/JuniorAuthQrScannerFlowContract$Step;", "<init>", "()V", "feature_junior_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class QrScanner extends JuniorAuthQrScannerFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final QrScanner f77317a = new QrScanner();

        @NotNull
        public static final Parcelable.Creator<QrScanner> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return QrScanner.f77317a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new QrScanner[i];
            }
        }

        private QrScanner() {
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

    private JuniorAuthQrScannerFlowContract$Step() {
    }
}
