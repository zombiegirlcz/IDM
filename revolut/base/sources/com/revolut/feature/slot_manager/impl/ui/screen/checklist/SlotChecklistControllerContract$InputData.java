package com.revolut.feature.slot_manager.impl.ui.screen.checklist;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistPayload;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/slot_manager/impl/ui/screen/checklist/SlotChecklistControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_slot_manager_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SlotChecklistControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SlotChecklistControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SlotChecklistPayload f87361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsProduct f87362b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SlotChecklistControllerContract$InputData((SlotChecklistPayload) parcel.readParcelable(SlotChecklistControllerContract$InputData.class.getClassLoader()), (AnalyticsProduct) parcel.readParcelable(SlotChecklistControllerContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SlotChecklistControllerContract$InputData[i];
        }
    }

    public SlotChecklistControllerContract$InputData(SlotChecklistPayload payload, AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f87361a = payload;
        this.f87362b = analyticsProduct;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SlotChecklistControllerContract$InputData)) {
            return false;
        }
        SlotChecklistControllerContract$InputData slotChecklistControllerContract$InputData = (SlotChecklistControllerContract$InputData) obj2;
        return Intrinsics.f(this.f87361a, slotChecklistControllerContract$InputData.f87361a) && Intrinsics.f(this.f87362b, slotChecklistControllerContract$InputData.f87362b);
    }

    public final int hashCode() {
        return this.f87362b.hashCode() + (this.f87361a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f87361a, i);
        dest.writeParcelable(this.f87362b, i);
    }
}
