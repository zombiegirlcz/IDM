package com.revolut.otp.input.flow.push;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.otp.input.flow.push.common.BaseOtpPushContract$InputData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/otp/input/flow/push/OtpPushScreenContract$InputData", "Lcom/revolut/otp/input/flow/push/common/BaseOtpPushContract$InputData;", "", "toString", "()Ljava/lang/String;", "revolut_otp_input_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OtpPushScreenContract$InputData implements BaseOtpPushContract$InputData {

    @NotNull
    public static final Parcelable.Creator<OtpPushScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98525a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OtpPushScreenContract$InputData(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OtpPushScreenContract$InputData[i];
        }
    }

    public OtpPushScreenContract$InputData(String otpCode) {
        Intrinsics.checkNotNullParameter(otpCode, "otpCode");
        this.f98525a = otpCode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof OtpPushScreenContract$InputData) && Intrinsics.f(this.f98525a, ((OtpPushScreenContract$InputData) obj2).f98525a);
    }

    public final int hashCode() {
        return this.f98525a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98525a);
    }

    @Override // com.revolut.otp.input.flow.push.common.BaseOtpPushContract$InputData
    /* JADX INFO: renamed from: y0, reason: from getter */
    public final String getF98526a() {
        return this.f98525a;
    }
}
