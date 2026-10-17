package com.revolut.feature.travel.experiences.impl.ui.screen.location_picker;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/experiences/impl/ui/screen/location_picker/TravelExperienceLocationPickerScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelExperienceLocationPickerScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TravelExperienceLocationPickerScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f93085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f93086c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(TravelExperienceLocationPickerScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            int iE2 = 0;
            while (iE2 != i2) {
                iE2 = j6.a.e(TravelExperienceLocationPickerScreenContract$InputData.class, parcel, arrayList2, iE2, 1);
            }
            return new TravelExperienceLocationPickerScreenContract$InputData(string, parcel.readInt() != 0, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelExperienceLocationPickerScreenContract$InputData[i];
        }
    }

    public TravelExperienceLocationPickerScreenContract$InputData(String title, boolean z, List availableValues, List locations) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(availableValues, "availableValues");
        Intrinsics.checkNotNullParameter(locations, "locations");
        this.f93084a = title;
        this.f93085b = availableValues;
        this.f93086c = locations;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelExperienceLocationPickerScreenContract$InputData)) {
            return false;
        }
        TravelExperienceLocationPickerScreenContract$InputData travelExperienceLocationPickerScreenContract$InputData = (TravelExperienceLocationPickerScreenContract$InputData) obj2;
        return Intrinsics.f(this.f93084a, travelExperienceLocationPickerScreenContract$InputData.f93084a) && Intrinsics.f(this.f93085b, travelExperienceLocationPickerScreenContract$InputData.f93085b) && Intrinsics.f(this.f93086c, travelExperienceLocationPickerScreenContract$InputData.f93086c) && this.d == travelExperienceLocationPickerScreenContract$InputData.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + p.a.d(p.a.d(this.f93084a.hashCode() * 31, 31, this.f93085b), 31, this.f93086c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f93084a);
        Iterator itV = p.a.v(this.f93085b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        Iterator itV2 = p.a.v(this.f93086c, dest);
        while (itV2.hasNext()) {
            dest.writeParcelable((Parcelable) itV2.next(), i);
        }
        dest.writeInt(this.d ? 1 : 0);
    }
}
