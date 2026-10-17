package com.revolut.biometric_verification.impl.ui.step.nfc.flow;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import omi.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/biometric_verification/impl/ui/step/nfc/flow/BiometricVerificationNfcFlowContract$AuthData", "Landroid/os/Parcelable;", "<init>", "()V", "ICAO", "MyNumberCard", "Lcom/revolut/biometric_verification/impl/ui/step/nfc/flow/BiometricVerificationNfcFlowContract$AuthData$ICAO;", "Lcom/revolut/biometric_verification/impl/ui/step/nfc/flow/BiometricVerificationNfcFlowContract$AuthData$MyNumberCard;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BiometricVerificationNfcFlowContract$AuthData implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/nfc/flow/BiometricVerificationNfcFlowContract$AuthData$ICAO;", "Lcom/revolut/biometric_verification/impl/ui/step/nfc/flow/BiometricVerificationNfcFlowContract$AuthData;", "", "toString", "()Ljava/lang/String;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ICAO extends BiometricVerificationNfcFlowContract$AuthData {

        @NotNull
        public static final Parcelable.Creator<ICAO> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f50614a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f50615b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f50616c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ICAO(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ICAO[i];
            }
        }

        public ICAO(String documentNumber, String dateOfBirth, String dateOfExpiry) {
            Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
            Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
            Intrinsics.checkNotNullParameter(dateOfExpiry, "dateOfExpiry");
            this.f50614a = documentNumber;
            this.f50615b = dateOfBirth;
            this.f50616c = dateOfExpiry;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ICAO)) {
                return false;
            }
            ICAO icao = (ICAO) obj2;
            return Intrinsics.f(this.f50614a, icao.f50614a) && Intrinsics.f(this.f50615b, icao.f50615b) && Intrinsics.f(this.f50616c, icao.f50616c);
        }

        public final int hashCode() {
            return this.f50616c.hashCode() + p.a.c(this.f50614a.hashCode() * 31, 31, this.f50615b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f50614a);
            dest.writeString(this.f50615b);
            dest.writeString(this.f50616c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/nfc/flow/BiometricVerificationNfcFlowContract$AuthData$MyNumberCard;", "Lcom/revolut/biometric_verification/impl/ui/step/nfc/flow/BiometricVerificationNfcFlowContract$AuthData;", "", "toString", "()Ljava/lang/String;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MyNumberCard extends BiometricVerificationNfcFlowContract$AuthData {

        @NotNull
        public static final Parcelable.Creator<MyNumberCard> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f50617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f50618b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f50619c;
        public final String d;
        public final b e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MyNumberCard(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MyNumberCard[i];
            }
        }

        public MyNumberCard(String pin, String dateOfBirth, String cardExpiryYear, String securityCode, b birthDataFormat) {
            Intrinsics.checkNotNullParameter(pin, "pin");
            Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
            Intrinsics.checkNotNullParameter(cardExpiryYear, "cardExpiryYear");
            Intrinsics.checkNotNullParameter(securityCode, "securityCode");
            Intrinsics.checkNotNullParameter(birthDataFormat, "birthDataFormat");
            this.f50617a = pin;
            this.f50618b = dateOfBirth;
            this.f50619c = cardExpiryYear;
            this.d = securityCode;
            this.e = birthDataFormat;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MyNumberCard)) {
                return false;
            }
            MyNumberCard myNumberCard = (MyNumberCard) obj2;
            return Intrinsics.f(this.f50617a, myNumberCard.f50617a) && Intrinsics.f(this.f50618b, myNumberCard.f50618b) && Intrinsics.f(this.f50619c, myNumberCard.f50619c) && Intrinsics.f(this.d, myNumberCard.d) && this.e == myNumberCard.e;
        }

        public final int hashCode() {
            return this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f50617a.hashCode() * 31, 31, this.f50618b), 31, this.f50619c), 31, this.d);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f50617a);
            dest.writeString(this.f50618b);
            dest.writeString(this.f50619c);
            dest.writeString(this.d);
            dest.writeString(this.e.name());
        }
    }

    private BiometricVerificationNfcFlowContract$AuthData() {
    }
}
