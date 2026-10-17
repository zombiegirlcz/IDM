package com.revolut.biometric_verification.impl.ui.step.document.flow;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/biometric_verification/impl/ui/step/document/flow/BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f50545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f50546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f50547c;
    public final omi.b d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            LocalDate localDateOfEpochDay = LocalDate.ofEpochDay(parcel.readLong());
            Intrinsics.checkNotNullExpressionValue(localDateOfEpochDay, "ofEpochDay(...)");
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            LocalDate localDateOfEpochDay2 = LocalDate.ofEpochDay(parcel.readLong());
            Intrinsics.checkNotNullExpressionValue(localDateOfEpochDay2, "ofEpochDay(...)");
            return new BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails(localDateOfEpochDay, localDateOfEpochDay2, parcel.readString(), omi.b.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails[i];
        }
    }

    public BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails(LocalDate dateOfBirth, LocalDate cardExpiryYear, String securityCode, omi.b birthDataFormat) {
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(cardExpiryYear, "cardExpiryYear");
        Intrinsics.checkNotNullParameter(securityCode, "securityCode");
        Intrinsics.checkNotNullParameter(birthDataFormat, "birthDataFormat");
        this.f50545a = dateOfBirth;
        this.f50546b = cardExpiryYear;
        this.f50547c = securityCode;
        this.d = birthDataFormat;
    }

    public static BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails a(BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails biometricVerificationDocumentStepFlowContract$MyNumberCardDetails, LocalDate dateOfBirth, LocalDate cardExpiryYear, String securityCode, omi.b birthDataFormat, int i) {
        if ((i & 1) != 0) {
            dateOfBirth = biometricVerificationDocumentStepFlowContract$MyNumberCardDetails.f50545a;
        }
        if ((i & 2) != 0) {
            cardExpiryYear = biometricVerificationDocumentStepFlowContract$MyNumberCardDetails.f50546b;
        }
        if ((i & 4) != 0) {
            securityCode = biometricVerificationDocumentStepFlowContract$MyNumberCardDetails.f50547c;
        }
        if ((i & 8) != 0) {
            birthDataFormat = biometricVerificationDocumentStepFlowContract$MyNumberCardDetails.d;
        }
        biometricVerificationDocumentStepFlowContract$MyNumberCardDetails.getClass();
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(cardExpiryYear, "cardExpiryYear");
        Intrinsics.checkNotNullParameter(securityCode, "securityCode");
        Intrinsics.checkNotNullParameter(birthDataFormat, "birthDataFormat");
        return new BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails(dateOfBirth, cardExpiryYear, securityCode, birthDataFormat);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails)) {
            return false;
        }
        BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails biometricVerificationDocumentStepFlowContract$MyNumberCardDetails = (BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails) obj2;
        return Intrinsics.f(this.f50545a, biometricVerificationDocumentStepFlowContract$MyNumberCardDetails.f50545a) && Intrinsics.f(this.f50546b, biometricVerificationDocumentStepFlowContract$MyNumberCardDetails.f50546b) && Intrinsics.f(this.f50547c, biometricVerificationDocumentStepFlowContract$MyNumberCardDetails.f50547c) && this.d == biometricVerificationDocumentStepFlowContract$MyNumberCardDetails.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(y.a(this.f50545a.hashCode() * 31, 31, this.f50546b), 31, this.f50547c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        LocalDate localDate = this.f50545a;
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeLong(localDate.toEpochDay());
        LocalDate localDate2 = this.f50546b;
        Intrinsics.checkNotNullParameter(localDate2, "<this>");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeLong(localDate2.toEpochDay());
        parcel.writeString(this.f50547c);
        parcel.writeString(this.d.name());
    }
}
