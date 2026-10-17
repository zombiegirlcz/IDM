package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimFeaturedPhoneNumberTiers;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimFeaturedPhoneNumberTiers implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimFeaturedPhoneNumberTiers> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f100257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f100258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f100259c;
    public final EsimPhoneNumberSelectionsFee d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimFeaturedPhoneNumberTiers(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : EsimPhoneNumberSelectionsFee.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimFeaturedPhoneNumberTiers[i];
        }
    }

    public EsimFeaturedPhoneNumberTiers(long j2, String code, String name, EsimPhoneNumberSelectionsFee esimPhoneNumberSelectionsFee) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f100257a = j2;
        this.f100258b = code;
        this.f100259c = name;
        this.d = esimPhoneNumberSelectionsFee;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimFeaturedPhoneNumberTiers)) {
            return false;
        }
        EsimFeaturedPhoneNumberTiers esimFeaturedPhoneNumberTiers = (EsimFeaturedPhoneNumberTiers) obj2;
        return this.f100257a == esimFeaturedPhoneNumberTiers.f100257a && Intrinsics.f(this.f100258b, esimFeaturedPhoneNumberTiers.f100258b) && Intrinsics.f(this.f100259c, esimFeaturedPhoneNumberTiers.f100259c) && Intrinsics.f(this.d, esimFeaturedPhoneNumberTiers.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(Long.hashCode(this.f100257a) * 31, 31, this.f100258b), 31, this.f100259c);
        EsimPhoneNumberSelectionsFee esimPhoneNumberSelectionsFee = this.d;
        return iC + (esimPhoneNumberSelectionsFee == null ? 0 : esimPhoneNumberSelectionsFee.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.f100257a);
        dest.writeString(this.f100258b);
        dest.writeString(this.f100259c);
        EsimPhoneNumberSelectionsFee esimPhoneNumberSelectionsFee = this.d;
        if (esimPhoneNumberSelectionsFee == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimPhoneNumberSelectionsFee.writeToParcel(dest, i);
        }
    }
}
