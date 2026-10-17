package com.revolut.otp.input.flow.email.bottom_dialog;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/otp/input/flow/email/bottom_dialog/OtpEmailNoEmailReceivedBottomSheetContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "revolut_otp_input_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OtpEmailNoEmailReceivedBottomSheetContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<OtpEmailNoEmailReceivedBottomSheetContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f98513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f98514b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OtpEmailNoEmailReceivedBottomSheetContract$InputData(parcel.readLong(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OtpEmailNoEmailReceivedBottomSheetContract$InputData[i];
        }
    }

    public OtpEmailNoEmailReceivedBottomSheetContract$InputData(long j2, boolean z) {
        this.f98513a = j2;
        this.f98514b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OtpEmailNoEmailReceivedBottomSheetContract$InputData)) {
            return false;
        }
        OtpEmailNoEmailReceivedBottomSheetContract$InputData otpEmailNoEmailReceivedBottomSheetContract$InputData = (OtpEmailNoEmailReceivedBottomSheetContract$InputData) obj2;
        return this.f98513a == otpEmailNoEmailReceivedBottomSheetContract$InputData.f98513a && this.f98514b == otpEmailNoEmailReceivedBottomSheetContract$InputData.f98514b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f98514b) + (Long.hashCode(this.f98513a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.f98513a);
        dest.writeInt(this.f98514b ? 1 : 0);
    }
}
