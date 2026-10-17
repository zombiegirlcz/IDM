package com.revolut.feature.slot_manager.impl.ui.screen.prompt;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.slot_manager.api.model.prompt.SlotDefaultPrompt;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/slot_manager/impl/ui/screen/prompt/SlotManagerPromptControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_slot_manager_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SlotManagerPromptControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SlotManagerPromptControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SlotDefaultPrompt f87376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsProduct f87377b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SlotManagerPromptControllerContract$InputData((SlotDefaultPrompt) parcel.readParcelable(SlotManagerPromptControllerContract$InputData.class.getClassLoader()), (AnalyticsProduct) parcel.readParcelable(SlotManagerPromptControllerContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SlotManagerPromptControllerContract$InputData[i];
        }
    }

    public SlotManagerPromptControllerContract$InputData(SlotDefaultPrompt prompt, AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f87376a = prompt;
        this.f87377b = analyticsProduct;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SlotManagerPromptControllerContract$InputData)) {
            return false;
        }
        SlotManagerPromptControllerContract$InputData slotManagerPromptControllerContract$InputData = (SlotManagerPromptControllerContract$InputData) obj2;
        return Intrinsics.f(this.f87376a, slotManagerPromptControllerContract$InputData.f87376a) && Intrinsics.f(this.f87377b, slotManagerPromptControllerContract$InputData.f87377b);
    }

    public final int hashCode() {
        return this.f87377b.hashCode() + (this.f87376a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f87376a, i);
        dest.writeParcelable(this.f87377b, i);
    }
}
