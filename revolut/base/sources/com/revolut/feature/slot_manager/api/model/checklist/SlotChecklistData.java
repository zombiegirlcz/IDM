package com.revolut.feature.slot_manager.api.model.checklist;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/slot_manager/api/model/checklist/SlotChecklistData;", "Lcom/revolut/feature/slot_manager/api/model/checklist/SlotChecklistPayload;", "", "toString", "()Ljava/lang/String;", "feature_slot_manager_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SlotChecklistData implements SlotChecklistPayload {

    @NotNull
    public static final Parcelable.Creator<SlotChecklistData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SlotChecklist f87294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SlotContext f87295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f87296c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SlotChecklistData(SlotChecklist.CREATOR.createFromParcel(parcel), SlotContext.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SlotChecklistData[i];
        }
    }

    public SlotChecklistData(SlotChecklist checklist, SlotContext context, boolean z) {
        Intrinsics.checkNotNullParameter(checklist, "checklist");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f87294a = checklist;
        this.f87295b = context;
        this.f87296c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SlotChecklistData)) {
            return false;
        }
        SlotChecklistData slotChecklistData = (SlotChecklistData) obj2;
        return Intrinsics.f(this.f87294a, slotChecklistData.f87294a) && Intrinsics.f(this.f87295b, slotChecklistData.f87295b) && this.f87296c == slotChecklistData.f87296c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f87296c) + ((this.f87295b.hashCode() + (this.f87294a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f87294a.writeToParcel(dest, i);
        this.f87295b.writeToParcel(dest, i);
        dest.writeInt(this.f87296c ? 1 : 0);
    }
}
