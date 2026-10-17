package com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.edit;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lzi.h;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/rev10/custom_period/edit/EditCycleScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EditCycleScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EditCycleScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f87672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f87673b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EditCycleScreenContract$InputData((h) parcel.readSerializable(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EditCycleScreenContract$InputData[i];
        }
    }

    public EditCycleScreenContract$InputData(h analyticsCycle, boolean z) {
        Intrinsics.checkNotNullParameter(analyticsCycle, "analyticsCycle");
        this.f87672a = analyticsCycle;
        this.f87673b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EditCycleScreenContract$InputData)) {
            return false;
        }
        EditCycleScreenContract$InputData editCycleScreenContract$InputData = (EditCycleScreenContract$InputData) obj2;
        return Intrinsics.f(this.f87672a, editCycleScreenContract$InputData.f87672a) && this.f87673b == editCycleScreenContract$InputData.f87673b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f87673b) + (this.f87672a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f87672a);
        dest.writeInt(this.f87673b ? 1 : 0);
    }
}
