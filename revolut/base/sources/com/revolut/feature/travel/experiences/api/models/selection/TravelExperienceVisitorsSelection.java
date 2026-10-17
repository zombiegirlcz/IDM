package com.revolut.feature.travel.experiences.api.models.selection;

import android.os.Parcel;
import android.os.Parcelable;
import j6.a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.r0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/selection/TravelExperienceVisitorsSelection;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelExperienceVisitorsSelection implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f92916a;

    @NotNull
    public static final Parcelable.Creator<TravelExperienceVisitorsSelection> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(myf.b.valueOf(parcel.readString()), Integer.valueOf(parcel.readInt()));
            }
            return new TravelExperienceVisitorsSelection(linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelExperienceVisitorsSelection[i];
        }
    }

    static {
        new TravelExperienceVisitorsSelection(r0.g());
    }

    public TravelExperienceVisitorsSelection(Map ageBandSelectionMap) {
        Intrinsics.checkNotNullParameter(ageBandSelectionMap, "ageBandSelectionMap");
        this.f92916a = ageBandSelectionMap;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof TravelExperienceVisitorsSelection) && Intrinsics.f(this.f92916a, ((TravelExperienceVisitorsSelection) obj2).f92916a);
    }

    public final int hashCode() {
        return this.f92916a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itZ = a.z(this.f92916a, dest);
        while (itZ.hasNext()) {
            Map.Entry entry = (Map.Entry) itZ.next();
            dest.writeString(((myf.b) entry.getKey()).name());
            dest.writeInt(((Number) entry.getValue()).intValue());
        }
    }
}
