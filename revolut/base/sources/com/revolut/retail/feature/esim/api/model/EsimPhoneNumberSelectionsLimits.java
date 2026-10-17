package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimPhoneNumberSelectionsLimits;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimPhoneNumberSelectionsLimits implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimPhoneNumberSelectionsLimits> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f100412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f100413b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimPhoneNumberSelectionsLimits(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimPhoneNumberSelectionsLimits[i];
        }
    }

    public EsimPhoneNumberSelectionsLimits(Long l2, Long l3) {
        this.f100412a = l2;
        this.f100413b = l3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimPhoneNumberSelectionsLimits)) {
            return false;
        }
        EsimPhoneNumberSelectionsLimits esimPhoneNumberSelectionsLimits = (EsimPhoneNumberSelectionsLimits) obj2;
        return Intrinsics.f(this.f100412a, esimPhoneNumberSelectionsLimits.f100412a) && Intrinsics.f(this.f100413b, esimPhoneNumberSelectionsLimits.f100413b);
    }

    public final int hashCode() {
        Long l2 = this.f100412a;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        Long l3 = this.f100413b;
        return iHashCode + (l3 != null ? l3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Long l2 = this.f100412a;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l2);
        }
        Long l3 = this.f100413b;
        if (l3 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l3);
        }
    }
}
