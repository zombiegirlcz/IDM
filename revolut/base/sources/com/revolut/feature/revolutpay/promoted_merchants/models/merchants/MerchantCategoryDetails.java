package com.revolut.feature.revolutpay.promoted_merchants.models.merchants;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/promoted_merchants/models/merchants/MerchantCategoryDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_promoted_merchants_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MerchantCategoryDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MerchantCategoryDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84689b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MerchantCategoryDetails(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MerchantCategoryDetails[i];
        }
    }

    public MerchantCategoryDetails(String key, String name) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f84688a = key;
        this.f84689b = name;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MerchantCategoryDetails)) {
            return false;
        }
        MerchantCategoryDetails merchantCategoryDetails = (MerchantCategoryDetails) obj2;
        return Intrinsics.f(this.f84688a, merchantCategoryDetails.f84688a) && Intrinsics.f(this.f84689b, merchantCategoryDetails.f84689b);
    }

    public final int hashCode() {
        return this.f84689b.hashCode() + (this.f84688a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84688a);
        dest.writeString(this.f84689b);
    }
}
