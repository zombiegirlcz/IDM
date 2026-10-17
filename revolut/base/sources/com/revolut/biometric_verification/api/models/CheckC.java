package com.revolut.biometric_verification.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/biometric_verification/api/models/CheckC;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "biometric_verification_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CheckC implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CheckC> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f50420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f50421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f50422c;
    public final Long d;
    public final Integer e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CheckC(parcel.readInt() != 0, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CheckC[i];
        }
    }

    public CheckC(boolean z, Long l2, Integer num, Long l3, Integer num2) {
        this.f50420a = z;
        this.f50421b = l2;
        this.f50422c = num;
        this.d = l3;
        this.e = num2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CheckC)) {
            return false;
        }
        CheckC checkC = (CheckC) obj2;
        return this.f50420a == checkC.f50420a && Intrinsics.f(this.f50421b, checkC.f50421b) && Intrinsics.f(this.f50422c, checkC.f50422c) && Intrinsics.f(this.d, checkC.d) && Intrinsics.f(this.e, checkC.e);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f50420a) * 31;
        Long l2 = this.f50421b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.f50422c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l3 = this.d;
        int iHashCode4 = (iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num2 = this.e;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f50420a ? 1 : 0);
        Long l2 = this.f50421b;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l2);
        }
        Integer num = this.f50422c;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        Long l3 = this.d;
        if (l3 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l3);
        }
        Integer num2 = this.e;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num2);
        }
    }
}
