package com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/checklist_challenges_ui/impl/ui/checklist_collection/ChecklistCollectionScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_checklist_challenges_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChecklistCollectionScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ChecklistCollectionScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsProduct f65813b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChecklistCollectionScreenContract$InputData(parcel.readString(), (AnalyticsProduct) parcel.readParcelable(ChecklistCollectionScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChecklistCollectionScreenContract$InputData[i];
        }
    }

    public ChecklistCollectionScreenContract$InputData(String id10, AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f65812a = id10;
        this.f65813b = analyticsProduct;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ChecklistCollectionScreenContract$InputData)) {
            return false;
        }
        ChecklistCollectionScreenContract$InputData checklistCollectionScreenContract$InputData = (ChecklistCollectionScreenContract$InputData) obj2;
        return Intrinsics.f(this.f65812a, checklistCollectionScreenContract$InputData.f65812a) && Intrinsics.f(this.f65813b, checklistCollectionScreenContract$InputData.f65813b);
    }

    public final int hashCode() {
        return this.f65813b.hashCode() + (this.f65812a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f65812a);
        dest.writeParcelable(this.f65813b, i);
    }
}
