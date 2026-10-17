package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.picker;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/hotels/impl/ui_kompot/screen/search_results/filters/picker/TravelHotelsFilterOptionsPickerScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelHotelsFilterOptionsPickerScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TravelHotelsFilterOptionsPickerScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f94042b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iA = 0;
            while (iA != i) {
                iA = o.a(parcel, linkedHashSet, iA, 1);
            }
            return new TravelHotelsFilterOptionsPickerScreenContract$InputData(string, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelHotelsFilterOptionsPickerScreenContract$InputData[i];
        }
    }

    public TravelHotelsFilterOptionsPickerScreenContract$InputData(String filterReference, Set selectedOptionIds) {
        Intrinsics.checkNotNullParameter(filterReference, "filterReference");
        Intrinsics.checkNotNullParameter(selectedOptionIds, "selectedOptionIds");
        this.f94041a = filterReference;
        this.f94042b = selectedOptionIds;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelHotelsFilterOptionsPickerScreenContract$InputData)) {
            return false;
        }
        TravelHotelsFilterOptionsPickerScreenContract$InputData travelHotelsFilterOptionsPickerScreenContract$InputData = (TravelHotelsFilterOptionsPickerScreenContract$InputData) obj2;
        return Intrinsics.f(this.f94041a, travelHotelsFilterOptionsPickerScreenContract$InputData.f94041a) && Intrinsics.f(this.f94042b, travelHotelsFilterOptionsPickerScreenContract$InputData.f94042b);
    }

    public final int hashCode() {
        return this.f94042b.hashCode() + (this.f94041a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f94041a);
        Iterator itV = n.v(this.f94042b, dest);
        while (itV.hasNext()) {
            dest.writeString((String) itV.next());
        }
    }
}
