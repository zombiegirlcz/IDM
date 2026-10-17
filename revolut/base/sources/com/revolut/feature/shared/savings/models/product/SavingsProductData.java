package com.revolut.feature.shared.savings.models.product;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/SavingsProductData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SavingsProductData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SavingsProductData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsProduct f86683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProductGroup f86684b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SavingsProductData(SavingsProduct.CREATOR.createFromParcel(parcel), ProductGroup.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SavingsProductData[i];
        }
    }

    public SavingsProductData(SavingsProduct savingsProduct, ProductGroup productGroup) {
        Intrinsics.checkNotNullParameter(savingsProduct, "savingsProduct");
        Intrinsics.checkNotNullParameter(productGroup, "productGroup");
        this.f86683a = savingsProduct;
        this.f86684b = productGroup;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SavingsProductData)) {
            return false;
        }
        SavingsProductData savingsProductData = (SavingsProductData) obj2;
        return Intrinsics.f(this.f86683a, savingsProductData.f86683a) && Intrinsics.f(this.f86684b, savingsProductData.f86684b);
    }

    public final int hashCode() {
        return this.f86684b.hashCode() + (this.f86683a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f86683a.writeToParcel(dest, i);
        this.f86684b.writeToParcel(dest, i);
    }
}
