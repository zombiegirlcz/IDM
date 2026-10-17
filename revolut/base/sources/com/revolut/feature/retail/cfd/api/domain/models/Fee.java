package com.revolut.feature.retail.cfd.api.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cfd/api/domain/models/Fee;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_cfd_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Fee implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Fee> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Amount f82103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f82104b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Amount amount = (Amount) j6.a.f(parcel, "parcel", Fee.class);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(FeeBreakdownItem.CREATOR, parcel, arrayList, iA, 1);
            }
            return new Fee(amount, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Fee[i];
        }
    }

    public Fee(Amount total, ArrayList breakdown) {
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
        this.f82103a = total;
        this.f82104b = breakdown;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Fee)) {
            return false;
        }
        Fee fee2 = (Fee) obj2;
        return Intrinsics.f(this.f82103a, fee2.f82103a) && this.f82104b.equals(fee2.f82104b);
    }

    public final int hashCode() {
        return this.f82104b.hashCode() + (this.f82103a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f82103a, i);
        Iterator itY = j6.a.y(this.f82104b, dest);
        while (itY.hasNext()) {
            ((FeeBreakdownItem) itY.next()).writeToParcel(dest, i);
        }
    }
}
