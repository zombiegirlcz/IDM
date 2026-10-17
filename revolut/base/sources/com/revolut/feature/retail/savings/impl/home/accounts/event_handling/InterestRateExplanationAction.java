package com.revolut.feature.retail.savings.impl.home.accounts.event_handling;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/home/accounts/event_handling/InterestRateExplanationAction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InterestRateExplanationAction implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InterestRateExplanationAction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsProduct f83344a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InterestRateExplanationAction((SavingsProduct) parcel.readParcelable(InterestRateExplanationAction.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InterestRateExplanationAction[i];
        }
    }

    public InterestRateExplanationAction(SavingsProduct savingsProduct) {
        Intrinsics.checkNotNullParameter(savingsProduct, "savingsProduct");
        this.f83344a = savingsProduct;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof InterestRateExplanationAction) && Intrinsics.f(this.f83344a, ((InterestRateExplanationAction) obj2).f83344a);
    }

    public final int hashCode() {
        return this.f83344a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f83344a, i);
    }
}
