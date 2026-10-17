package com.revolut.biometric_verification.impl.domain.models.dynamic_instructions;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.biometric_verification.api.models.BiometricVerificationDocumentType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/biometric_verification/impl/domain/models/dynamic_instructions/BiometricVerificationUserInput;", "Landroid/os/Parcelable;", "<init>", "()V", "DocumentUserInput", "SelfieUserInput", "Lcom/revolut/biometric_verification/impl/domain/models/dynamic_instructions/BiometricVerificationUserInput$DocumentUserInput;", "Lcom/revolut/biometric_verification/impl/domain/models/dynamic_instructions/BiometricVerificationUserInput$SelfieUserInput;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BiometricVerificationUserInput implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/biometric_verification/impl/domain/models/dynamic_instructions/BiometricVerificationUserInput$DocumentUserInput;", "Lcom/revolut/biometric_verification/impl/domain/models/dynamic_instructions/BiometricVerificationUserInput;", "", "toString", "()Ljava/lang/String;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentUserInput extends BiometricVerificationUserInput {

        @NotNull
        public static final Parcelable.Creator<DocumentUserInput> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiometricVerificationDocumentType f50469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f50470b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f50471c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DocumentUserInput((BiometricVerificationDocumentType) parcel.readParcelable(DocumentUserInput.class.getClassLoader()), (b) parcel.readSerializable(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentUserInput[i];
            }
        }

        public DocumentUserInput(BiometricVerificationDocumentType documentType, b documentCountry, boolean z) {
            Intrinsics.checkNotNullParameter(documentType, "documentType");
            Intrinsics.checkNotNullParameter(documentCountry, "documentCountry");
            this.f50469a = documentType;
            this.f50470b = documentCountry;
            this.f50471c = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DocumentUserInput)) {
                return false;
            }
            DocumentUserInput documentUserInput = (DocumentUserInput) obj2;
            return Intrinsics.f(this.f50469a, documentUserInput.f50469a) && Intrinsics.f(this.f50470b, documentUserInput.f50470b) && this.f50471c == documentUserInput.f50471c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f50471c) + p.a.c(this.f50469a.hashCode() * 31, 31, this.f50470b.f297794a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f50469a, i);
            dest.writeSerializable(this.f50470b);
            dest.writeInt(this.f50471c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/biometric_verification/impl/domain/models/dynamic_instructions/BiometricVerificationUserInput$SelfieUserInput;", "Lcom/revolut/biometric_verification/impl/domain/models/dynamic_instructions/BiometricVerificationUserInput;", "", "toString", "()Ljava/lang/String;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelfieUserInput extends BiometricVerificationUserInput {

        @NotNull
        public static final Parcelable.Creator<SelfieUserInput> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f50472a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelfieUserInput(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelfieUserInput[i];
            }
        }

        public SelfieUserInput(boolean z) {
            this.f50472a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SelfieUserInput) && this.f50472a == ((SelfieUserInput) obj2).f50472a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f50472a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f50472a ? 1 : 0);
        }
    }

    private BiometricVerificationUserInput() {
    }
}
