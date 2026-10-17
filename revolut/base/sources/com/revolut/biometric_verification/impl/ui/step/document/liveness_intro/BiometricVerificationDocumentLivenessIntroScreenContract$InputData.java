package com.revolut.biometric_verification.impl.ui.step.document.liveness_intro;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.biometric_verification.api.models.BiometricVerificationDocumentType;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/biometric_verification/impl/ui/step/document/liveness_intro/BiometricVerificationDocumentLivenessIntroScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BiometricVerificationDocumentLivenessIntroScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BiometricVerificationDocumentLivenessIntroScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiometricVerificationDocumentType f50598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f50599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsContext f50600c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BiometricVerificationDocumentLivenessIntroScreenContract$InputData((BiometricVerificationDocumentType) parcel.readParcelable(BiometricVerificationDocumentLivenessIntroScreenContract$InputData.class.getClassLoader()), parcel.readInt() != 0, (AnalyticsContext) parcel.readParcelable(BiometricVerificationDocumentLivenessIntroScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BiometricVerificationDocumentLivenessIntroScreenContract$InputData[i];
        }
    }

    public BiometricVerificationDocumentLivenessIntroScreenContract$InputData(BiometricVerificationDocumentType documentType, boolean z, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        this.f50598a = documentType;
        this.f50599b = z;
        this.f50600c = analyticsContext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BiometricVerificationDocumentLivenessIntroScreenContract$InputData)) {
            return false;
        }
        BiometricVerificationDocumentLivenessIntroScreenContract$InputData biometricVerificationDocumentLivenessIntroScreenContract$InputData = (BiometricVerificationDocumentLivenessIntroScreenContract$InputData) obj2;
        return Intrinsics.f(this.f50598a, biometricVerificationDocumentLivenessIntroScreenContract$InputData.f50598a) && this.f50599b == biometricVerificationDocumentLivenessIntroScreenContract$InputData.f50599b && Intrinsics.f(this.f50600c, biometricVerificationDocumentLivenessIntroScreenContract$InputData.f50600c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f50598a.hashCode() * 31, 31, this.f50599b);
        AnalyticsContext analyticsContext = this.f50600c;
        return iC + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f50598a, i);
        dest.writeInt(this.f50599b ? 1 : 0);
        dest.writeParcelable(this.f50600c, i);
    }
}
