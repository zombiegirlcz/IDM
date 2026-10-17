package com.revolut.biometric_verification.impl.ui.step.document.card_details_edit.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.biometric_verification.impl.ui.step.document.flow.BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okl.m;
import org.jetbrains.annotations.NotNull;
import vs.f;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/biometric_verification/impl/ui/step/document/card_details_edit/details/BiometricVerificationMyNumberDetailsEditScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BiometricVerificationMyNumberDetailsEditScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BiometricVerificationMyNumberDetailsEditScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails f50536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f50537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0 f50538c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BiometricVerificationMyNumberDetailsEditScreenContract$InputData(BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : f.valueOf(parcel.readString()), ((AnalyticsContext) parcel.readParcelable(BiometricVerificationMyNumberDetailsEditScreenContract$InputData.class.getClassLoader())).f50296a);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BiometricVerificationMyNumberDetailsEditScreenContract$InputData[i];
        }
    }

    public BiometricVerificationMyNumberDetailsEditScreenContract$InputData(BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails details, f fVar, w0 w0Var) {
        Intrinsics.checkNotNullParameter(details, "details");
        this.f50536a = details;
        this.f50537b = fVar;
        this.f50538c = w0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BiometricVerificationMyNumberDetailsEditScreenContract$InputData)) {
            return false;
        }
        BiometricVerificationMyNumberDetailsEditScreenContract$InputData biometricVerificationMyNumberDetailsEditScreenContract$InputData = (BiometricVerificationMyNumberDetailsEditScreenContract$InputData) obj2;
        return Intrinsics.f(this.f50536a, biometricVerificationMyNumberDetailsEditScreenContract$InputData.f50536a) && this.f50537b == biometricVerificationMyNumberDetailsEditScreenContract$InputData.f50537b && Intrinsics.f(this.f50538c, biometricVerificationMyNumberDetailsEditScreenContract$InputData.f50538c);
    }

    public final int hashCode() {
        int iHashCode = this.f50536a.hashCode() * 31;
        f fVar = this.f50537b;
        return AnalyticsContext.a(this.f50538c) + ((iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f50536a.writeToParcel(dest, i);
        f fVar = this.f50537b;
        if (fVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(fVar.name());
        }
        m.x(this.f50538c, dest, i);
    }
}
