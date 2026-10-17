package com.revolut.feature.slot_manager.impl.ui.screen.checklist;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0083\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/slot_manager/impl/ui/screen/checklist/SlotsChecklistVisibilityTracker$ChecklistDisplayRecord", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_slot_manager_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
final /* data */ class SlotsChecklistVisibilityTracker$ChecklistDisplayRecord implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SlotsChecklistVisibilityTracker$ChecklistDisplayRecord> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f87363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f87364b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SlotsChecklistVisibilityTracker$ChecklistDisplayRecord(parcel.readLong(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SlotsChecklistVisibilityTracker$ChecklistDisplayRecord[i];
        }
    }

    public SlotsChecklistVisibilityTracker$ChecklistDisplayRecord(long j2, int i) {
        this.f87363a = j2;
        this.f87364b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SlotsChecklistVisibilityTracker$ChecklistDisplayRecord)) {
            return false;
        }
        SlotsChecklistVisibilityTracker$ChecklistDisplayRecord slotsChecklistVisibilityTracker$ChecklistDisplayRecord = (SlotsChecklistVisibilityTracker$ChecklistDisplayRecord) obj2;
        return this.f87363a == slotsChecklistVisibilityTracker$ChecklistDisplayRecord.f87363a && this.f87364b == slotsChecklistVisibilityTracker$ChecklistDisplayRecord.f87364b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f87364b) + (Long.hashCode(this.f87363a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.f87363a);
        dest.writeInt(this.f87364b);
    }
}
