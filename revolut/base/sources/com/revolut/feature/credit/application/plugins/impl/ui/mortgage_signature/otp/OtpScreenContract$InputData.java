package com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.otp;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yy3.h;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/mortgage_signature/otp/OtpScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OtpScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<OtpScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f68041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f68042c;
    public final long d;
    public final h e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OtpScreenContract$InputData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), (h) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OtpScreenContract$InputData[i];
        }
    }

    public OtpScreenContract$InputData(String signingMethodId, String processId, String oneTimePassword, long j2, h configuration) {
        Intrinsics.checkNotNullParameter(signingMethodId, "signingMethodId");
        Intrinsics.checkNotNullParameter(processId, "processId");
        Intrinsics.checkNotNullParameter(oneTimePassword, "oneTimePassword");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f68040a = signingMethodId;
        this.f68041b = processId;
        this.f68042c = oneTimePassword;
        this.d = j2;
        this.e = configuration;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OtpScreenContract$InputData)) {
            return false;
        }
        OtpScreenContract$InputData otpScreenContract$InputData = (OtpScreenContract$InputData) obj2;
        return Intrinsics.f(this.f68040a, otpScreenContract$InputData.f68040a) && Intrinsics.f(this.f68041b, otpScreenContract$InputData.f68041b) && Intrinsics.f(this.f68042c, otpScreenContract$InputData.f68042c) && this.d == otpScreenContract$InputData.d && Intrinsics.f(this.e, otpScreenContract$InputData.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + d.c(p.a.c(p.a.c(this.f68040a.hashCode() * 31, 31, this.f68041b), 31, this.f68042c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f68040a);
        dest.writeString(this.f68041b);
        dest.writeString(this.f68042c);
        dest.writeLong(this.d);
        dest.writeSerializable(this.e);
    }
}
