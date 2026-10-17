package com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.obligated_products;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.domain.SwitchOutReview;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/bank_account_switching/impl/ui/switch_out/review/obligated_products/SwitchOutObligatedProductsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SwitchOutObligatedProductsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SwitchOutObligatedProductsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SwitchOutReview f64071a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SwitchOutObligatedProductsScreenContract$InputData(SwitchOutReview.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SwitchOutObligatedProductsScreenContract$InputData[i];
        }
    }

    public SwitchOutObligatedProductsScreenContract$InputData(SwitchOutReview switchOutReview) {
        Intrinsics.checkNotNullParameter(switchOutReview, "switchOutReview");
        this.f64071a = switchOutReview;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof SwitchOutObligatedProductsScreenContract$InputData) && Intrinsics.f(this.f64071a, ((SwitchOutObligatedProductsScreenContract$InputData) obj2).f64071a);
    }

    public final int hashCode() {
        return this.f64071a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f64071a.writeToParcel(dest, i);
    }
}
