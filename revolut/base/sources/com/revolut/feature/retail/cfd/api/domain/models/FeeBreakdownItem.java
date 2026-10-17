package com.revolut.feature.retail.cfd.api.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cfd/api/domain/models/FeeBreakdownItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_cfd_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FeeBreakdownItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FeeBreakdownItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f82109c;
    public final FeeBreakdownDetails d;
    public final Amount e;
    public final Amount f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FeeBreakdownItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : FeeBreakdownDetails.CREATOR.createFromParcel(parcel), (Amount) parcel.readParcelable(FeeBreakdownItem.class.getClassLoader()), (Amount) parcel.readParcelable(FeeBreakdownItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FeeBreakdownItem[i];
        }
    }

    public FeeBreakdownItem(String title, String shortDescription, String description, FeeBreakdownDetails feeBreakdownDetails, Amount amount, Amount amount2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(shortDescription, "shortDescription");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f82107a = title;
        this.f82108b = shortDescription;
        this.f82109c = description;
        this.d = feeBreakdownDetails;
        this.e = amount;
        this.f = amount2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FeeBreakdownItem)) {
            return false;
        }
        FeeBreakdownItem feeBreakdownItem = (FeeBreakdownItem) obj2;
        return Intrinsics.f(this.f82107a, feeBreakdownItem.f82107a) && Intrinsics.f(this.f82108b, feeBreakdownItem.f82108b) && Intrinsics.f(this.f82109c, feeBreakdownItem.f82109c) && Intrinsics.f(this.d, feeBreakdownItem.d) && Intrinsics.f(this.e, feeBreakdownItem.e) && Intrinsics.f(this.f, feeBreakdownItem.f);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f82107a.hashCode() * 31, 31, this.f82108b), 31, this.f82109c);
        FeeBreakdownDetails feeBreakdownDetails = this.d;
        int iD = y.d(this.e, (iC + (feeBreakdownDetails == null ? 0 : feeBreakdownDetails.hashCode())) * 31, 31);
        Amount amount = this.f;
        return iD + (amount != null ? amount.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82107a);
        dest.writeString(this.f82108b);
        dest.writeString(this.f82109c);
        FeeBreakdownDetails feeBreakdownDetails = this.d;
        if (feeBreakdownDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            feeBreakdownDetails.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
    }
}
