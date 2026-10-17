package com.revolut.feature.travel.experiences.impl.ui.screen.selection.dates;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/travel/experiences/impl/ui/screen/selection/dates/TravelExperiencesDatesSelectionScreenContract$DateAvailabilityStrategy", "Landroid/os/Parcelable;", "<init>", "()V", "All", "OnlyAvailable", "Lcom/revolut/feature/travel/experiences/impl/ui/screen/selection/dates/TravelExperiencesDatesSelectionScreenContract$DateAvailabilityStrategy$All;", "Lcom/revolut/feature/travel/experiences/impl/ui/screen/selection/dates/TravelExperiencesDatesSelectionScreenContract$DateAvailabilityStrategy$OnlyAvailable;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TravelExperiencesDatesSelectionScreenContract$DateAvailabilityStrategy implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/screen/selection/dates/TravelExperiencesDatesSelectionScreenContract$DateAvailabilityStrategy$All;", "Lcom/revolut/feature/travel/experiences/impl/ui/screen/selection/dates/TravelExperiencesDatesSelectionScreenContract$DateAvailabilityStrategy;", "Landroid/os/Parcelable;", "<init>", "()V", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class All extends TravelExperiencesDatesSelectionScreenContract$DateAvailabilityStrategy implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final All f93159a = new All();

        @NotNull
        public static final Parcelable.Creator<All> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return All.f93159a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new All[i];
            }
        }

        private All() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/screen/selection/dates/TravelExperiencesDatesSelectionScreenContract$DateAvailabilityStrategy$OnlyAvailable;", "Lcom/revolut/feature/travel/experiences/impl/ui/screen/selection/dates/TravelExperiencesDatesSelectionScreenContract$DateAvailabilityStrategy;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OnlyAvailable extends TravelExperiencesDatesSelectionScreenContract$DateAvailabilityStrategy implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<OnlyAvailable> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f93160a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i);
                    int iE = 0;
                    while (iE != i) {
                        iE = j6.a.e(OnlyAvailable.class, parcel, arrayList2, iE, 1);
                    }
                    arrayList = arrayList2;
                }
                return new OnlyAvailable(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OnlyAvailable[i];
            }
        }

        public OnlyAvailable(List list) {
            this.f93160a = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OnlyAvailable) && Intrinsics.f(this.f93160a, ((OnlyAvailable) obj2).f93160a);
        }

        public final int hashCode() {
            List list = this.f93160a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List list = this.f93160a;
            if (list == null) {
                dest.writeInt(0);
                return;
            }
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                dest.writeParcelable((Parcelable) itQ.next(), i);
            }
        }
    }

    private TravelExperiencesDatesSelectionScreenContract$DateAvailabilityStrategy() {
    }
}
