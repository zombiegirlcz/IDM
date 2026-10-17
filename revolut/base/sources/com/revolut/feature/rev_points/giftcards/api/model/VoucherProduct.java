package com.revolut.feature.rev_points.giftcards.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev_points.models.RevPoints;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/giftcards/api/model/VoucherProduct;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_giftcards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VoucherProduct implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<VoucherProduct> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f83639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevPoints f83640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f83641c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new VoucherProduct(parcel.readString(), (RevPoints) parcel.readParcelable(VoucherProduct.class.getClassLoader()), (d) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VoucherProduct[i];
        }
    }

    public VoucherProduct(String id10, RevPoints pointsAmount, d monetaryAmount, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(pointsAmount, "pointsAmount");
        Intrinsics.checkNotNullParameter(monetaryAmount, "monetaryAmount");
        this.f83639a = id10;
        this.f83640b = pointsAmount;
        this.f83641c = monetaryAmount;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof VoucherProduct)) {
            return false;
        }
        VoucherProduct voucherProduct = (VoucherProduct) obj2;
        return Intrinsics.f(this.f83639a, voucherProduct.f83639a) && Intrinsics.f(this.f83640b, voucherProduct.f83640b) && Intrinsics.f(this.f83641c, voucherProduct.f83641c) && Intrinsics.f(this.d, voucherProduct.d);
    }

    public final int hashCode() {
        int iC = v7.c(v7.c(this.f83639a.hashCode() * 31, 31, this.f83640b.f83960a), 31, this.f83641c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f83639a);
        dest.writeParcelable(this.f83640b, i);
        dest.writeSerializable(this.f83641c);
        dest.writeString(this.d);
    }
}
