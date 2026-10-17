package com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.country_picker;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import h30.l;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/trips/country_picker/TripsCountryPickerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TripsCountryPickerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TripsCountryPickerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f87605a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap2.put(parcel.readSerializable(), Integer.valueOf(parcel.readInt()));
                }
                linkedHashMap = linkedHashMap2;
            }
            return new TripsCountryPickerContract$InputData(linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TripsCountryPickerContract$InputData[i];
        }
    }

    public TripsCountryPickerContract$InputData(Map map) {
        this.f87605a = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof TripsCountryPickerContract$InputData) && Intrinsics.f(this.f87605a, ((TripsCountryPickerContract$InputData) obj2).f87605a);
    }

    public final int hashCode() {
        Map map = this.f87605a;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Map map = this.f87605a;
        if (map == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itV = l.v(dest, 1, map);
        while (itV.hasNext()) {
            Map.Entry entry = (Map.Entry) itV.next();
            dest.writeSerializable((Serializable) entry.getKey());
            dest.writeInt(((Number) entry.getValue()).intValue());
        }
    }

    public TripsCountryPickerContract$InputData() {
        this(null);
    }
}
