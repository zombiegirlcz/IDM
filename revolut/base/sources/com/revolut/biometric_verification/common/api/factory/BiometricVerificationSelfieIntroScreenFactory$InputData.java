package com.revolut.biometric_verification.common.api.factory;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/biometric_verification/common/api/factory/BiometricVerificationSelfieIntroScreenFactory$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "biometric_verification_common_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BiometricVerificationSelfieIntroScreenFactory$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BiometricVerificationSelfieIntroScreenFactory$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f50462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsContext f50463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsProduct f50464c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BiometricVerificationSelfieIntroScreenFactory$InputData(parcel.readInt() != 0, (AnalyticsContext) parcel.readParcelable(BiometricVerificationSelfieIntroScreenFactory$InputData.class.getClassLoader()), (AnalyticsProduct) parcel.readParcelable(BiometricVerificationSelfieIntroScreenFactory$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BiometricVerificationSelfieIntroScreenFactory$InputData[i];
        }
    }

    public BiometricVerificationSelfieIntroScreenFactory$InputData(boolean z, AnalyticsContext analyticsContext, AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f50462a = z;
        this.f50463b = analyticsContext;
        this.f50464c = analyticsProduct;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BiometricVerificationSelfieIntroScreenFactory$InputData)) {
            return false;
        }
        BiometricVerificationSelfieIntroScreenFactory$InputData biometricVerificationSelfieIntroScreenFactory$InputData = (BiometricVerificationSelfieIntroScreenFactory$InputData) obj2;
        return this.f50462a == biometricVerificationSelfieIntroScreenFactory$InputData.f50462a && Intrinsics.f(this.f50463b, biometricVerificationSelfieIntroScreenFactory$InputData.f50463b) && Intrinsics.f(this.f50464c, biometricVerificationSelfieIntroScreenFactory$InputData.f50464c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f50462a) * 31;
        AnalyticsContext analyticsContext = this.f50463b;
        return this.f50464c.hashCode() + ((iHashCode + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a))) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f50462a ? 1 : 0);
        dest.writeParcelable(this.f50463b, i);
        dest.writeParcelable(this.f50464c, i);
    }
}
