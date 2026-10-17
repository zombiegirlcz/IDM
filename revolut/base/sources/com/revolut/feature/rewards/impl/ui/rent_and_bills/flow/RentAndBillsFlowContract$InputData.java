package com.revolut.feature.rewards.impl.ui.rent_and_bills.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.flow.RentAndBillsFlowContract$Step;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/rewards/impl/ui/rent_and_bills/flow/RentAndBillsFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RentAndBillsFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RentAndBillsFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RentAndBillsFlowContract$Step f84954a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RentAndBillsFlowContract$InputData((RentAndBillsFlowContract$Step) parcel.readParcelable(RentAndBillsFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RentAndBillsFlowContract$InputData[i];
        }
    }

    public RentAndBillsFlowContract$InputData() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof RentAndBillsFlowContract$InputData) && Intrinsics.f(this.f84954a, ((RentAndBillsFlowContract$InputData) obj2).f84954a);
    }

    public final int hashCode() {
        return this.f84954a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f84954a, i);
    }

    public RentAndBillsFlowContract$InputData(RentAndBillsFlowContract$Step initialStep) {
        Intrinsics.checkNotNullParameter(initialStep, "initialStep");
        this.f84954a = initialStep;
    }

    public /* synthetic */ RentAndBillsFlowContract$InputData(int i) {
        this(RentAndBillsFlowContract$Step.ProductArticle.f84965a);
    }
}
