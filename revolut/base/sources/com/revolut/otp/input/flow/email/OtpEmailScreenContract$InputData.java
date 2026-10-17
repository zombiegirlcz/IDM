package com.revolut.otp.input.flow.email;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mni.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/otp/input/flow/email/OtpEmailScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "revolut_otp_input_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OtpEmailScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<OtpEmailScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f98510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f98511c;
    public final List d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Boolean f98512g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            long j2 = parcel.readLong();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(b.valueOf(parcel.readString()));
            }
            boolean z3 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z3 = false;
            }
            return new OtpEmailScreenContract$InputData(string, string2, j2, arrayList, z3, parcel.readInt() != 0 ? z : false, parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0 ? z : false));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OtpEmailScreenContract$InputData[i];
        }
    }

    public OtpEmailScreenContract$InputData(String str, String str2, long j2, List availableResendMethods, boolean z, boolean z3, Boolean bool) {
        Intrinsics.checkNotNullParameter(availableResendMethods, "availableResendMethods");
        this.f98509a = str;
        this.f98510b = str2;
        this.f98511c = j2;
        this.d = availableResendMethods;
        this.e = z;
        this.f = z3;
        this.f98512g = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OtpEmailScreenContract$InputData)) {
            return false;
        }
        OtpEmailScreenContract$InputData otpEmailScreenContract$InputData = (OtpEmailScreenContract$InputData) obj2;
        return Intrinsics.f(this.f98509a, otpEmailScreenContract$InputData.f98509a) && Intrinsics.f(this.f98510b, otpEmailScreenContract$InputData.f98510b) && this.f98511c == otpEmailScreenContract$InputData.f98511c && Intrinsics.f(this.d, otpEmailScreenContract$InputData.d) && this.e == otpEmailScreenContract$InputData.e && this.f == otpEmailScreenContract$InputData.f && Intrinsics.f(this.f98512g, otpEmailScreenContract$InputData.f98512g);
    }

    public final int hashCode() {
        String str = this.f98509a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f98510b;
        int iC = j6.a.c(j6.a.c(p.a.d(d.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f98511c), 31, this.d), 31, this.e), 31, this.f);
        Boolean bool = this.f98512g;
        return iC + (bool != null ? bool.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98509a);
        dest.writeString(this.f98510b);
        dest.writeLong(this.f98511c);
        Iterator itV = p.a.v(this.d, dest);
        while (itV.hasNext()) {
            dest.writeString(((b) itV.next()).name());
        }
        dest.writeInt(this.e ? 1 : 0);
        dest.writeInt(this.f ? 1 : 0);
        Boolean bool = this.f98512g;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
    }
}
