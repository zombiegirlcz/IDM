package com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/steps/review_product/ReviewProductDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReviewProductDetailsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ReviewProductDetailsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsProductData f83287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f83288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f83289c;
    public final ReviewProductDetailsScreenContract$ChallengeInfo d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            SavingsProductData savingsProductData = (SavingsProductData) j6.a.f(parcel, "parcel", ReviewProductDetailsScreenContract$InputData.class);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(ReviewProductDetailsScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new ReviewProductDetailsScreenContract$InputData(savingsProductData, arrayList, parcel.readInt() != 0, parcel.readInt() == 0 ? null : ReviewProductDetailsScreenContract$ChallengeInfo.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ReviewProductDetailsScreenContract$InputData[i];
        }
    }

    public ReviewProductDetailsScreenContract$InputData(SavingsProductData productData, List higherPlanProducts, boolean z, ReviewProductDetailsScreenContract$ChallengeInfo reviewProductDetailsScreenContract$ChallengeInfo) {
        Intrinsics.checkNotNullParameter(productData, "productData");
        Intrinsics.checkNotNullParameter(higherPlanProducts, "higherPlanProducts");
        this.f83287a = productData;
        this.f83288b = higherPlanProducts;
        this.f83289c = z;
        this.d = reviewProductDetailsScreenContract$ChallengeInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ReviewProductDetailsScreenContract$InputData)) {
            return false;
        }
        ReviewProductDetailsScreenContract$InputData reviewProductDetailsScreenContract$InputData = (ReviewProductDetailsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f83287a, reviewProductDetailsScreenContract$InputData.f83287a) && Intrinsics.f(this.f83288b, reviewProductDetailsScreenContract$InputData.f83288b) && this.f83289c == reviewProductDetailsScreenContract$InputData.f83289c && Intrinsics.f(this.d, reviewProductDetailsScreenContract$InputData.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.d(this.f83287a.hashCode() * 31, 31, this.f83288b), 31, this.f83289c);
        ReviewProductDetailsScreenContract$ChallengeInfo reviewProductDetailsScreenContract$ChallengeInfo = this.d;
        return iC + (reviewProductDetailsScreenContract$ChallengeInfo == null ? 0 : reviewProductDetailsScreenContract$ChallengeInfo.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f83287a, i);
        Iterator itV = p.a.v(this.f83288b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeInt(this.f83289c ? 1 : 0);
        ReviewProductDetailsScreenContract$ChallengeInfo reviewProductDetailsScreenContract$ChallengeInfo = this.d;
        if (reviewProductDetailsScreenContract$ChallengeInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            reviewProductDetailsScreenContract$ChallengeInfo.writeToParcel(dest, i);
        }
    }
}
