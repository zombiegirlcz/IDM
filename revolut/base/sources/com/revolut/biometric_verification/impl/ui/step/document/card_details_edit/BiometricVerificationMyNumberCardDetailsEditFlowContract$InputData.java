package com.revolut.biometric_verification.impl.ui.step.document.card_details_edit;

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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/biometric_verification/impl/ui/step/document/card_details_edit/BiometricVerificationMyNumberCardDetailsEditFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BiometricVerificationMyNumberCardDetailsEditFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BiometricVerificationMyNumberCardDetailsEditFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails f50522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f50523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0 f50524c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BiometricVerificationMyNumberCardDetailsEditFlowContract$InputData(BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails.CREATOR.createFromParcel(parcel), f.valueOf(parcel.readString()), ((AnalyticsContext) parcel.readParcelable(BiometricVerificationMyNumberCardDetailsEditFlowContract$InputData.class.getClassLoader())).f50296a);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BiometricVerificationMyNumberCardDetailsEditFlowContract$InputData[i];
        }
    }

    public BiometricVerificationMyNumberCardDetailsEditFlowContract$InputData(BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails details, f editTarget, w0 w0Var) {
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(editTarget, "editTarget");
        this.f50522a = details;
        this.f50523b = editTarget;
        this.f50524c = w0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BiometricVerificationMyNumberCardDetailsEditFlowContract$InputData)) {
            return false;
        }
        BiometricVerificationMyNumberCardDetailsEditFlowContract$InputData biometricVerificationMyNumberCardDetailsEditFlowContract$InputData = (BiometricVerificationMyNumberCardDetailsEditFlowContract$InputData) obj2;
        return Intrinsics.f(this.f50522a, biometricVerificationMyNumberCardDetailsEditFlowContract$InputData.f50522a) && this.f50523b == biometricVerificationMyNumberCardDetailsEditFlowContract$InputData.f50523b && Intrinsics.f(this.f50524c, biometricVerificationMyNumberCardDetailsEditFlowContract$InputData.f50524c);
    }

    public final int hashCode() {
        return AnalyticsContext.a(this.f50524c) + ((this.f50523b.hashCode() + (this.f50522a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f50522a.writeToParcel(dest, i);
        dest.writeString(this.f50523b.name());
        m.x(this.f50524c, dest, i);
    }
}
