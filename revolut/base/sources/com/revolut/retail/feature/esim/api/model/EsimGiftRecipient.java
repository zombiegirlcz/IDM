package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimGiftRecipient;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimGiftRecipient implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimGiftRecipient> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f100269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f100270c;
    public final String d;
    public final String e;
    public final String f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimGiftRecipient(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimGiftRecipient[i];
        }
    }

    public EsimGiftRecipient(String registeredIdentityId, String str, String code, String firstName, String lastName, String str2) {
        Intrinsics.checkNotNullParameter(registeredIdentityId, "registeredIdentityId");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        this.f100268a = registeredIdentityId;
        this.f100269b = str;
        this.f100270c = code;
        this.d = firstName;
        this.e = lastName;
        this.f = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimGiftRecipient)) {
            return false;
        }
        EsimGiftRecipient esimGiftRecipient = (EsimGiftRecipient) obj2;
        return Intrinsics.f(this.f100268a, esimGiftRecipient.f100268a) && Intrinsics.f(this.f100269b, esimGiftRecipient.f100269b) && Intrinsics.f(this.f100270c, esimGiftRecipient.f100270c) && Intrinsics.f(this.d, esimGiftRecipient.d) && Intrinsics.f(this.e, esimGiftRecipient.e) && Intrinsics.f(this.f, esimGiftRecipient.f);
    }

    public final int hashCode() {
        int iHashCode = this.f100268a.hashCode() * 31;
        String str = this.f100269b;
        int iC = p.a.c(p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f100270c), 31, this.d), 31, this.e);
        String str2 = this.f;
        return iC + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f100268a);
        dest.writeString(this.f100269b);
        dest.writeString(this.f100270c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
    }
}
