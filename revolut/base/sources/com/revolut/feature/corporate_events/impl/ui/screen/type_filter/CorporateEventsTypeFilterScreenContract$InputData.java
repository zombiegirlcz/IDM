package com.revolut.feature.corporate_events.impl.ui.screen.type_filter;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import ehe.n;
import iel.e;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/corporate_events/impl/ui/screen/type_filter/CorporateEventsTypeFilterScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_corporate_events_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CorporateEventsTypeFilterScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CorporateEventsTypeFilterScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f66153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f66154b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashSet.add(e.valueOf(parcel.readString()));
            }
            int i3 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(i3);
            for (int i5 = 0; i5 != i3; i5++) {
                linkedHashSet2.add(e.valueOf(parcel.readString()));
            }
            return new CorporateEventsTypeFilterScreenContract$InputData(linkedHashSet, linkedHashSet2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CorporateEventsTypeFilterScreenContract$InputData[i];
        }
    }

    public CorporateEventsTypeFilterScreenContract$InputData(Set allActiveFilters, Set selectedFilters) {
        Intrinsics.checkNotNullParameter(allActiveFilters, "allActiveFilters");
        Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
        this.f66153a = allActiveFilters;
        this.f66154b = selectedFilters;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CorporateEventsTypeFilterScreenContract$InputData)) {
            return false;
        }
        CorporateEventsTypeFilterScreenContract$InputData corporateEventsTypeFilterScreenContract$InputData = (CorporateEventsTypeFilterScreenContract$InputData) obj2;
        return Intrinsics.f(this.f66153a, corporateEventsTypeFilterScreenContract$InputData.f66153a) && Intrinsics.f(this.f66154b, corporateEventsTypeFilterScreenContract$InputData.f66154b);
    }

    public final int hashCode() {
        return this.f66154b.hashCode() + (this.f66153a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = n.v(this.f66153a, dest);
        while (itV.hasNext()) {
            dest.writeString(((e) itV.next()).name());
        }
        Iterator itV2 = n.v(this.f66154b, dest);
        while (itV2.hasNext()) {
            dest.writeString(((e) itV2.next()).name());
        }
    }
}
