package com.revolut.biometric_verification.impl.ui.step.document.before_you_proceed;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okl.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/biometric_verification/impl/ui/step/document/before_you_proceed/BiometricVerificationBeforeYouProceedScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BiometricVerificationBeforeYouProceedScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BiometricVerificationBeforeYouProceedScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f50518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0 f50519b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BiometricVerificationBeforeYouProceedScreenContract$InputData(((AnalyticsContext) parcel.readParcelable(BiometricVerificationBeforeYouProceedScreenContract$InputData.class.getClassLoader())).f50296a, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BiometricVerificationBeforeYouProceedScreenContract$InputData[i];
        }
    }

    public BiometricVerificationBeforeYouProceedScreenContract$InputData(w0 w0Var, boolean z) {
        this.f50518a = z;
        this.f50519b = w0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BiometricVerificationBeforeYouProceedScreenContract$InputData)) {
            return false;
        }
        BiometricVerificationBeforeYouProceedScreenContract$InputData biometricVerificationBeforeYouProceedScreenContract$InputData = (BiometricVerificationBeforeYouProceedScreenContract$InputData) obj2;
        return this.f50518a == biometricVerificationBeforeYouProceedScreenContract$InputData.f50518a && Intrinsics.f(this.f50519b, biometricVerificationBeforeYouProceedScreenContract$InputData.f50519b);
    }

    public final int hashCode() {
        return AnalyticsContext.a(this.f50519b) + (Boolean.hashCode(this.f50518a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f50518a ? 1 : 0);
        m.x(this.f50519b, dest, i);
    }
}
