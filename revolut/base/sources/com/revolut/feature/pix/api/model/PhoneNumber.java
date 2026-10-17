package com.revolut.feature.pix.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import fj0.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/api/model/PhoneNumber;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PhoneNumber implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PhoneNumber> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f80395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f80396b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PhoneNumber(((b) parcel.readSerializable()).f135518a, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PhoneNumber[i];
        }
    }

    public PhoneNumber(int i, String number) {
        Intrinsics.checkNotNullParameter(number, "number");
        this.f80395a = i;
        this.f80396b = number;
    }

    public static PhoneNumber a(PhoneNumber phoneNumber, int i, String number, int i2) {
        if ((i2 & 1) != 0) {
            i = phoneNumber.f80395a;
        }
        if ((i2 & 2) != 0) {
            number = phoneNumber.f80396b;
        }
        phoneNumber.getClass();
        Intrinsics.checkNotNullParameter(number, "number");
        return new PhoneNumber(i, number);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PhoneNumber)) {
            return false;
        }
        PhoneNumber phoneNumber = (PhoneNumber) obj2;
        return this.f80395a == phoneNumber.f80395a && Intrinsics.f(this.f80396b, phoneNumber.f80396b);
    }

    public final int hashCode() {
        return this.f80396b.hashCode() + (Integer.hashCode(this.f80395a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(new b(this.f80395a));
        dest.writeString(this.f80396b);
    }
}
