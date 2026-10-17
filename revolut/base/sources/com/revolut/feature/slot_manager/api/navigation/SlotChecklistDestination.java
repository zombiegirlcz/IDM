package com.revolut.feature.slot_manager.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistPayload;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/slot_manager/api/navigation/SlotChecklistDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_slot_manager_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SlotChecklistDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<SlotChecklistDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SlotChecklistPayload f87345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsProduct f87346b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SlotChecklistDestination((SlotChecklistPayload) parcel.readParcelable(SlotChecklistDestination.class.getClassLoader()), (AnalyticsProduct) parcel.readParcelable(SlotChecklistDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SlotChecklistDestination[i];
        }
    }

    public SlotChecklistDestination(SlotChecklistPayload payload, AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f87345a = payload;
        this.f87346b = analyticsProduct;
    }

    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getF87346b() {
        return this.f87346b;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final SlotChecklistPayload getF87345a() {
        return this.f87345a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SlotChecklistDestination)) {
            return false;
        }
        SlotChecklistDestination slotChecklistDestination = (SlotChecklistDestination) obj2;
        return Intrinsics.f(this.f87345a, slotChecklistDestination.f87345a) && Intrinsics.f(this.f87346b, slotChecklistDestination.f87346b);
    }

    public final int hashCode() {
        return this.f87346b.hashCode() + (this.f87345a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f87345a, i);
        dest.writeParcelable(this.f87346b, i);
    }
}
