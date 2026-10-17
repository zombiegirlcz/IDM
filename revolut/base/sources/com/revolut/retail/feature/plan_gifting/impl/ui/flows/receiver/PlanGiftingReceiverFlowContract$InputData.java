package com.revolut.retail.feature.plan_gifting.impl.ui.flows.receiver;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.plan_gifting.api.model.PlanGiftingClaimingExitRule;
import kbk.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/plan_gifting/impl/ui/flows/receiver/PlanGiftingReceiverFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_plan_gifting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlanGiftingReceiverFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PlanGiftingReceiverFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f102457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlanGiftingClaimingExitRule f102458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f102459c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PlanGiftingReceiverFlowContract$InputData(parcel.readString(), (PlanGiftingClaimingExitRule) parcel.readParcelable(PlanGiftingReceiverFlowContract$InputData.class.getClassLoader()), k.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlanGiftingReceiverFlowContract$InputData[i];
        }
    }

    public PlanGiftingReceiverFlowContract$InputData(String giftId, PlanGiftingClaimingExitRule exitRule, k introVariant) {
        Intrinsics.checkNotNullParameter(giftId, "giftId");
        Intrinsics.checkNotNullParameter(exitRule, "exitRule");
        Intrinsics.checkNotNullParameter(introVariant, "introVariant");
        this.f102457a = giftId;
        this.f102458b = exitRule;
        this.f102459c = introVariant;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PlanGiftingReceiverFlowContract$InputData)) {
            return false;
        }
        PlanGiftingReceiverFlowContract$InputData planGiftingReceiverFlowContract$InputData = (PlanGiftingReceiverFlowContract$InputData) obj2;
        return Intrinsics.f(this.f102457a, planGiftingReceiverFlowContract$InputData.f102457a) && Intrinsics.f(this.f102458b, planGiftingReceiverFlowContract$InputData.f102458b) && this.f102459c == planGiftingReceiverFlowContract$InputData.f102459c;
    }

    public final int hashCode() {
        return this.f102459c.hashCode() + ((this.f102458b.hashCode() + (this.f102457a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f102457a);
        dest.writeParcelable(this.f102458b, i);
        dest.writeString(this.f102459c.name());
    }
}
