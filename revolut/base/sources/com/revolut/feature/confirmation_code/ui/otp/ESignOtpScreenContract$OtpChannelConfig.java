package com.revolut.feature.confirmation_code.ui.otp;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/confirmation_code/ui/otp/ESignOtpScreenContract$OtpChannelConfig", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_confirmation_code_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ESignOtpScreenContract$OtpChannelConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ESignOtpScreenContract$OtpChannelConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f65961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nk3.a f65962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nk3.a f65963c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ESignOtpScreenContract$OtpChannelConfig(parcel.readInt() != 0, nk3.a.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : nk3.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ESignOtpScreenContract$OtpChannelConfig[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ESignOtpScreenContract$OtpChannelConfig() {
        nk3.a aVar = null;
        this(aVar, aVar, 7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ESignOtpScreenContract$OtpChannelConfig)) {
            return false;
        }
        ESignOtpScreenContract$OtpChannelConfig eSignOtpScreenContract$OtpChannelConfig = (ESignOtpScreenContract$OtpChannelConfig) obj2;
        return this.f65961a == eSignOtpScreenContract$OtpChannelConfig.f65961a && this.f65962b == eSignOtpScreenContract$OtpChannelConfig.f65962b && this.f65963c == eSignOtpScreenContract$OtpChannelConfig.f65963c;
    }

    public final int hashCode() {
        int iHashCode = (this.f65962b.hashCode() + (Boolean.hashCode(this.f65961a) * 31)) * 31;
        nk3.a aVar = this.f65963c;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f65961a ? 1 : 0);
        dest.writeString(this.f65962b.name());
        nk3.a aVar = this.f65963c;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
    }

    public ESignOtpScreenContract$OtpChannelConfig(boolean z, nk3.a otpChannel, nk3.a aVar) {
        Intrinsics.checkNotNullParameter(otpChannel, "otpChannel");
        this.f65961a = z;
        this.f65962b = otpChannel;
        this.f65963c = aVar;
    }

    public /* synthetic */ ESignOtpScreenContract$OtpChannelConfig(nk3.a aVar, nk3.a aVar2, int i) {
        this((i & 1) == 0, (i & 2) != 0 ? nk3.a.SMS : aVar, (i & 4) != 0 ? null : aVar2);
    }
}
