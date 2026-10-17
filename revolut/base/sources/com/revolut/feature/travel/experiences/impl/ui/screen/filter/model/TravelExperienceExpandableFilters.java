package com.revolut.feature.travel.experiences.impl.ui.screen.filter.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperiencePricingFilter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/screen/filter/model/TravelExperienceExpandableFilters;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelExperienceExpandableFilters implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelExperienceExpandableFilters> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperiencePricingFilter f93074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExpandableFilterSection f93075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExpandableFilterSection f93076c;
    public final ExpandableFilterSection d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelExperienceExpandableFilters((TravelExperiencePricingFilter) parcel.readParcelable(TravelExperienceExpandableFilters.class.getClassLoader()), parcel.readInt() == 0 ? null : ExpandableFilterSection.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ExpandableFilterSection.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ExpandableFilterSection.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelExperienceExpandableFilters[i];
        }
    }

    public TravelExperienceExpandableFilters(TravelExperiencePricingFilter travelExperiencePricingFilter, ExpandableFilterSection expandableFilterSection, ExpandableFilterSection expandableFilterSection2, ExpandableFilterSection expandableFilterSection3) {
        this.f93074a = travelExperiencePricingFilter;
        this.f93075b = expandableFilterSection;
        this.f93076c = expandableFilterSection2;
        this.d = expandableFilterSection3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelExperienceExpandableFilters)) {
            return false;
        }
        TravelExperienceExpandableFilters travelExperienceExpandableFilters = (TravelExperienceExpandableFilters) obj2;
        return Intrinsics.f(this.f93074a, travelExperienceExpandableFilters.f93074a) && Intrinsics.f(this.f93075b, travelExperienceExpandableFilters.f93075b) && Intrinsics.f(this.f93076c, travelExperienceExpandableFilters.f93076c) && Intrinsics.f(this.d, travelExperienceExpandableFilters.d);
    }

    public final int hashCode() {
        TravelExperiencePricingFilter travelExperiencePricingFilter = this.f93074a;
        int iHashCode = (travelExperiencePricingFilter == null ? 0 : travelExperiencePricingFilter.hashCode()) * 31;
        ExpandableFilterSection expandableFilterSection = this.f93075b;
        int iHashCode2 = (iHashCode + (expandableFilterSection == null ? 0 : expandableFilterSection.hashCode())) * 31;
        ExpandableFilterSection expandableFilterSection2 = this.f93076c;
        int iHashCode3 = (iHashCode2 + (expandableFilterSection2 == null ? 0 : expandableFilterSection2.hashCode())) * 31;
        ExpandableFilterSection expandableFilterSection3 = this.d;
        return iHashCode3 + (expandableFilterSection3 != null ? expandableFilterSection3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f93074a, i);
        ExpandableFilterSection expandableFilterSection = this.f93075b;
        if (expandableFilterSection == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            expandableFilterSection.writeToParcel(dest, i);
        }
        ExpandableFilterSection expandableFilterSection2 = this.f93076c;
        if (expandableFilterSection2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            expandableFilterSection2.writeToParcel(dest, i);
        }
        ExpandableFilterSection expandableFilterSection3 = this.d;
        if (expandableFilterSection3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            expandableFilterSection3.writeToParcel(dest, i);
        }
    }

    public TravelExperienceExpandableFilters() {
        this(null, null, null, null);
    }
}
