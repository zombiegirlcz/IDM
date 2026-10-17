package com.revolut.feature.topup_screen.impl.flows.checkout.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.kompot.navigable.flow.FlowState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/topup_screen/impl/flows/checkout/flow/CheckoutFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CheckoutFlowContract$State implements FlowState {

    @NotNull
    public static final Parcelable.Creator<CheckoutFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckoutParams f90671a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CheckoutFlowContract$State((CheckoutParams) parcel.readParcelable(CheckoutFlowContract$State.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CheckoutFlowContract$State[i];
        }
    }

    public CheckoutFlowContract$State(CheckoutParams checkoutParams) {
        this.f90671a = checkoutParams;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof CheckoutFlowContract$State) && Intrinsics.f(this.f90671a, ((CheckoutFlowContract$State) obj2).f90671a);
    }

    public final int hashCode() {
        CheckoutParams checkoutParams = this.f90671a;
        if (checkoutParams == null) {
            return 0;
        }
        return checkoutParams.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f90671a, i);
    }
}
