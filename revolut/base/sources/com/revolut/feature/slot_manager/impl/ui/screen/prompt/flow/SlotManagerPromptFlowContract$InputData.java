package com.revolut.feature.slot_manager.impl.ui.screen.prompt.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.slot_manager.api.model.prompt.SlotDefaultPrompt;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/slot_manager/impl/ui/screen/prompt/flow/SlotManagerPromptFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_slot_manager_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SlotManagerPromptFlowContract$InputData implements IOData$Input, Parcelable {

    @NotNull
    public static final Parcelable.Creator<SlotManagerPromptFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SlotDefaultPrompt f87379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsProduct f87380b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SlotManagerPromptFlowContract$InputData((SlotDefaultPrompt) parcel.readParcelable(SlotManagerPromptFlowContract$InputData.class.getClassLoader()), (AnalyticsProduct) parcel.readParcelable(SlotManagerPromptFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SlotManagerPromptFlowContract$InputData[i];
        }
    }

    public SlotManagerPromptFlowContract$InputData(SlotDefaultPrompt prompt, AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f87379a = prompt;
        this.f87380b = analyticsProduct;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SlotManagerPromptFlowContract$InputData)) {
            return false;
        }
        SlotManagerPromptFlowContract$InputData slotManagerPromptFlowContract$InputData = (SlotManagerPromptFlowContract$InputData) obj2;
        return Intrinsics.f(this.f87379a, slotManagerPromptFlowContract$InputData.f87379a) && Intrinsics.f(this.f87380b, slotManagerPromptFlowContract$InputData.f87380b);
    }

    public final int hashCode() {
        return this.f87380b.hashCode() + (this.f87379a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f87379a, i);
        dest.writeParcelable(this.f87380b, i);
    }
}
