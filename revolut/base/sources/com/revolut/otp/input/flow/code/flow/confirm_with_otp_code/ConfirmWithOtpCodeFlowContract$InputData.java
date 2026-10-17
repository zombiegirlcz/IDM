package com.revolut.otp.input.flow.code.flow.confirm_with_otp_code;

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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/otp/input/flow/code/flow/confirm_with_otp_code/ConfirmWithOtpCodeFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "revolut_otp_input_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ConfirmWithOtpCodeFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ConfirmWithOtpCodeFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f98501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f98502c;
    public final List d;
    public final b e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f98503g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f98504h;

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
            return new ConfirmWithOtpCodeFlowContract$InputData(string, string2, j2, arrayList, bVarValueOf, z3, parcel.readInt() == 0 ? null : j.valueOf(parcel.readString()), parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0 ? z : false) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ConfirmWithOtpCodeFlowContract$InputData[i];
        }
    }

    public ConfirmWithOtpCodeFlowContract$InputData(String str, String str2, long j2, List availableResendMethods, b inputType, boolean z, j jVar, Boolean bool) {
        Intrinsics.checkNotNullParameter(availableResendMethods, "availableResendMethods");
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        this.f98500a = str;
        this.f98501b = str2;
        this.f98502c = j2;
        this.d = availableResendMethods;
        this.e = inputType;
        this.f = z;
        this.f98503g = jVar;
        this.f98504h = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ConfirmWithOtpCodeFlowContract$InputData)) {
            return false;
        }
        ConfirmWithOtpCodeFlowContract$InputData confirmWithOtpCodeFlowContract$InputData = (ConfirmWithOtpCodeFlowContract$InputData) obj2;
        return Intrinsics.f(this.f98500a, confirmWithOtpCodeFlowContract$InputData.f98500a) && Intrinsics.f(this.f98501b, confirmWithOtpCodeFlowContract$InputData.f98501b) && this.f98502c == confirmWithOtpCodeFlowContract$InputData.f98502c && Intrinsics.f(this.d, confirmWithOtpCodeFlowContract$InputData.d) && this.e == confirmWithOtpCodeFlowContract$InputData.e && this.f == confirmWithOtpCodeFlowContract$InputData.f && this.f98503g == confirmWithOtpCodeFlowContract$InputData.f98503g && Intrinsics.f(this.f98504h, confirmWithOtpCodeFlowContract$InputData.f98504h);
    }

    public final int hashCode() {
        String str = this.f98500a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f98501b;
        int iC = j6.a.c((this.e.hashCode() + p.a.d(d.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f98502c), 31, this.d)) * 31, 31, this.f);
        j jVar = this.f98503g;
        int iHashCode2 = (iC + (jVar == null ? 0 : jVar.hashCode())) * 31;
        Boolean bool = this.f98504h;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98500a);
        dest.writeString(this.f98501b);
        dest.writeLong(this.f98502c);
        Iterator itV = p.a.v(this.d, dest);
        while (itV.hasNext()) {
            dest.writeString(((mni.b) itV.next()).name());
        }
        dest.writeString(this.e.name());
        dest.writeInt(this.f ? 1 : 0);
        j jVar = this.f98503g;
        if (jVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(jVar.name());
        }
        Boolean bool = this.f98504h;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
    }

    public /* synthetic */ ConfirmWithOtpCodeFlowContract$InputData(String str, String str2, List list, b bVar, j jVar, int i) {
        this(str, str2, 60L, list, bVar, false, (i & 64) != 0 ? null : jVar, null);
    }
}
