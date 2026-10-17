package com.revolut.feature.credit.health.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ft3.d1;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/health/impl/domain/model/PreapprovedOffer;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_health_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PreapprovedOffer implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PreapprovedOffer> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d1 f69990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f69991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f69992c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PreapprovedOffer((d1) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PreapprovedOffer[i];
        }
    }

    public PreapprovedOffer(d1 product, d maxAmount, String str, String str2) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(maxAmount, "maxAmount");
        this.f69990a = product;
        this.f69991b = maxAmount;
        this.f69992c = str;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PreapprovedOffer)) {
            return false;
        }
        PreapprovedOffer preapprovedOffer = (PreapprovedOffer) obj2;
        return Intrinsics.f(this.f69990a, preapprovedOffer.f69990a) && Intrinsics.f(this.f69991b, preapprovedOffer.f69991b) && Intrinsics.f(this.f69992c, preapprovedOffer.f69992c) && Intrinsics.f(this.d, preapprovedOffer.d);
    }

    public final int hashCode() {
        int iC = v7.c(this.f69990a.hashCode() * 31, 31, this.f69991b);
        String str = this.f69992c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f69990a);
        dest.writeSerializable(this.f69991b);
        dest.writeString(this.f69992c);
        dest.writeString(this.d);
    }
}
