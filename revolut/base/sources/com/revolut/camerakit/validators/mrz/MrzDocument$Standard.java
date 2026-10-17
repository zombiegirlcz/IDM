package com.revolut.camerakit.validators.mrz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/camerakit/validators/mrz/MrzDocument$Standard", "", "", "toString", "()Ljava/lang/String;", "camera_kit_validators_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MrzDocument$Standard implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MrzDocument$Standard> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f50939c;
    public final String d;
    public final String e;
    public final String f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MrzDocument$Standard(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MrzDocument$Standard[i];
        }
    }

    public MrzDocument$Standard(String number, String numberChecksum, String dateOfBirth, String dateOfBirthChecksum, String expiryDate, String expiryDateChecksum) {
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(numberChecksum, "numberChecksum");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(dateOfBirthChecksum, "dateOfBirthChecksum");
        Intrinsics.checkNotNullParameter(expiryDate, "expiryDate");
        Intrinsics.checkNotNullParameter(expiryDateChecksum, "expiryDateChecksum");
        this.f50937a = number;
        this.f50938b = numberChecksum;
        this.f50939c = dateOfBirth;
        this.d = dateOfBirthChecksum;
        this.e = expiryDate;
        this.f = expiryDateChecksum;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MrzDocument$Standard)) {
            return false;
        }
        MrzDocument$Standard mrzDocument$Standard = (MrzDocument$Standard) obj2;
        return Intrinsics.f(this.f50937a, mrzDocument$Standard.f50937a) && Intrinsics.f(this.f50938b, mrzDocument$Standard.f50938b) && Intrinsics.f(this.f50939c, mrzDocument$Standard.f50939c) && Intrinsics.f(this.d, mrzDocument$Standard.d) && Intrinsics.f(this.e, mrzDocument$Standard.e) && Intrinsics.f(this.f, mrzDocument$Standard.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(this.f50937a.hashCode() * 31, 31, this.f50938b), 31, this.f50939c), 31, this.d), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f50937a);
        dest.writeString(this.f50938b);
        dest.writeString(this.f50939c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
    }
}
