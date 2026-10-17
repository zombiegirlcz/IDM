package com.revolut.otp.input.flow.code;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lni.b;
import lni.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/otp/input/flow/code/OtpCodeInputScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "revolut_otp_input_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OtpCodeInputScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<OtpCodeInputScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f98496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f98497c;
    public final List d;
    public final b e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f98498g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f98499h;

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
                arrayList.add(mni.b.valueOf(parcel.readString()));
            }
            b bVarValueOf = b.valueOf(parcel.readString());
            boolean z3 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z3 = false;
            }
            return new OtpCodeInputScreenContract$InputData(string, string2, j2, arrayList, bVarValueOf, z3, parcel.readInt() == 0 ? null : j.valueOf(parcel.readString()), parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0 ? z : false) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OtpCodeInputScreenContract$InputData[i];
        }
    }

    public OtpCodeInputScreenContract$InputData(String str, String str2, long j2, List availableResendMethods, b inputType, boolean z, j jVar, Boolean bool) {
        Intrinsics.checkNotNullParameter(availableResendMethods, "availableResendMethods");
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        this.f98495a = str;
        this.f98496b = str2;
        this.f98497c = j2;
        this.d = availableResendMethods;
        this.e = inputType;
        this.f = z;
        this.f98498g = jVar;
        this.f98499h = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OtpCodeInputScreenContract$InputData)) {
            return false;
        }
        OtpCodeInputScreenContract$InputData otpCodeInputScreenContract$InputData = (OtpCodeInputScreenContract$InputData) obj2;
        return Intrinsics.f(this.f98495a, otpCodeInputScreenContract$InputData.f98495a) && Intrinsics.f(this.f98496b, otpCodeInputScreenContract$InputData.f98496b) && this.f98497c == otpCodeInputScreenContract$InputData.f98497c && Intrinsics.f(this.d, otpCodeInputScreenContract$InputData.d) && this.e == otpCodeInputScreenContract$InputData.e && this.f == otpCodeInputScreenContract$InputData.f && this.f98498g == otpCodeInputScreenContract$InputData.f98498g && Intrinsics.f(this.f98499h, otpCodeInputScreenContract$InputData.f98499h);
    }

    public final int hashCode() {
        String str = this.f98495a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f98496b;
        int iC = j6.a.c((this.e.hashCode() + p.a.d(d.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f98497c), 31, this.d)) * 31, 31, this.f);
        j jVar = this.f98498g;
        int iHashCode2 = (iC + (jVar == null ? 0 : jVar.hashCode())) * 31;
        Boolean bool = this.f98499h;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98495a);
        dest.writeString(this.f98496b);
        dest.writeLong(this.f98497c);
        Iterator itV = p.a.v(this.d, dest);
        while (itV.hasNext()) {
            dest.writeString(((mni.b) itV.next()).name());
        }
        dest.writeString(this.e.name());
        dest.writeInt(this.f ? 1 : 0);
        j jVar = this.f98498g;
        if (jVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(jVar.name());
        }
        Boolean bool = this.f98499h;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
    }
}
