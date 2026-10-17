package com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_gift_sending;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_gift_sending/PlanGiftSendingFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlanGiftSendingFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PlanGiftSendingFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f103175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f103176b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PlanGiftSendingFlowContract$InputData(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlanGiftSendingFlowContract$InputData[i];
        }
    }

    public PlanGiftSendingFlowContract$InputData(String receiverRevTag, String receiverVisibleName) {
        Intrinsics.checkNotNullParameter(receiverRevTag, "receiverRevTag");
        Intrinsics.checkNotNullParameter(receiverVisibleName, "receiverVisibleName");
        this.f103175a = receiverRevTag;
        this.f103176b = receiverVisibleName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PlanGiftSendingFlowContract$InputData)) {
            return false;
        }
        PlanGiftSendingFlowContract$InputData planGiftSendingFlowContract$InputData = (PlanGiftSendingFlowContract$InputData) obj2;
        return Intrinsics.f(this.f103175a, planGiftSendingFlowContract$InputData.f103175a) && Intrinsics.f(this.f103176b, planGiftSendingFlowContract$InputData.f103176b);
    }

    public final int hashCode() {
        return this.f103176b.hashCode() + (this.f103175a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f103175a);
        dest.writeString(this.f103176b);
    }
}
