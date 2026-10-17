package com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.intro;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.plan_gifting.api.model.PlanGiftingClaimingExitRule;
import kbk.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/plan_gifting/impl/ui/screens/receiver/intro/PlanGiftingReceiverIntroScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_plan_gifting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlanGiftingReceiverIntroScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PlanGiftingReceiverIntroScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f102499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlanGiftingClaimingExitRule f102500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f102501c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PlanGiftingReceiverIntroScreenContract$InputData(parcel.readString(), (PlanGiftingClaimingExitRule) parcel.readParcelable(PlanGiftingReceiverIntroScreenContract$InputData.class.getClassLoader()), k.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlanGiftingReceiverIntroScreenContract$InputData[i];
        }
    }

    public PlanGiftingReceiverIntroScreenContract$InputData(String giftId, PlanGiftingClaimingExitRule exitRule, k introVariant) {
        Intrinsics.checkNotNullParameter(giftId, "giftId");
        Intrinsics.checkNotNullParameter(exitRule, "exitRule");
        Intrinsics.checkNotNullParameter(introVariant, "introVariant");
        this.f102499a = giftId;
        this.f102500b = exitRule;
        this.f102501c = introVariant;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PlanGiftingReceiverIntroScreenContract$InputData)) {
            return false;
        }
        PlanGiftingReceiverIntroScreenContract$InputData planGiftingReceiverIntroScreenContract$InputData = (PlanGiftingReceiverIntroScreenContract$InputData) obj2;
        return Intrinsics.f(this.f102499a, planGiftingReceiverIntroScreenContract$InputData.f102499a) && Intrinsics.f(this.f102500b, planGiftingReceiverIntroScreenContract$InputData.f102500b) && this.f102501c == planGiftingReceiverIntroScreenContract$InputData.f102501c;
    }

    public final int hashCode() {
        return this.f102501c.hashCode() + ((this.f102500b.hashCode() + (this.f102499a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f102499a);
        dest.writeParcelable(this.f102500b, i);
        dest.writeString(this.f102501c.name());
    }
}
