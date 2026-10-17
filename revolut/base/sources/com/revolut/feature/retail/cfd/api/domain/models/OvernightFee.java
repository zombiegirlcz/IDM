package com.revolut.feature.retail.cfd.api.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cfd/api/domain/models/OvernightFee;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_cfd_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OvernightFee implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OvernightFee> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Amount f82122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f82123b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OvernightFee((Amount) parcel.readParcelable(OvernightFee.class.getClassLoader()), (BigDecimal) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OvernightFee[i];
        }
    }

    public OvernightFee(Amount amount, BigDecimal rate) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(rate, "rate");
        this.f82122a = amount;
        this.f82123b = rate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OvernightFee)) {
            return false;
        }
        OvernightFee overnightFee = (OvernightFee) obj2;
        return Intrinsics.f(this.f82122a, overnightFee.f82122a) && Intrinsics.f(this.f82123b, overnightFee.f82123b);
    }

    public final int hashCode() {
        return this.f82123b.hashCode() + (this.f82122a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f82122a, i);
        dest.writeSerializable(this.f82123b);
    }
}
