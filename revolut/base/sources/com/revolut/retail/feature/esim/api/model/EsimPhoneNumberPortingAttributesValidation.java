package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimPhoneNumberPortingAttributesValidation;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimPhoneNumberPortingAttributesValidation implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimPhoneNumberPortingAttributesValidation> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f100342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f100343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f100344c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimPhoneNumberPortingAttributesValidation(parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimPhoneNumberPortingAttributesValidation[i];
        }
    }

    public EsimPhoneNumberPortingAttributesValidation(String str, boolean z, Long l2, Long l3) {
        this.f100342a = l2;
        this.f100343b = l3;
        this.f100344c = str;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimPhoneNumberPortingAttributesValidation)) {
            return false;
        }
        EsimPhoneNumberPortingAttributesValidation esimPhoneNumberPortingAttributesValidation = (EsimPhoneNumberPortingAttributesValidation) obj2;
        return Intrinsics.f(this.f100342a, esimPhoneNumberPortingAttributesValidation.f100342a) && Intrinsics.f(this.f100343b, esimPhoneNumberPortingAttributesValidation.f100343b) && Intrinsics.f(this.f100344c, esimPhoneNumberPortingAttributesValidation.f100344c) && this.d == esimPhoneNumberPortingAttributesValidation.d;
    }

    public final int hashCode() {
        Long l2 = this.f100342a;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        Long l3 = this.f100343b;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str = this.f100344c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Long l2 = this.f100342a;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l2);
        }
        Long l3 = this.f100343b;
        if (l3 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l3);
        }
        dest.writeString(this.f100344c);
        dest.writeInt(this.d ? 1 : 0);
    }
}
