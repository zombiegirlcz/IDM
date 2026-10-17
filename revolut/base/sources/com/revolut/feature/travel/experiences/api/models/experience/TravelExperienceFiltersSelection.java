package com.revolut.feature.travel.experiences.api.models.experience;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/experience/TravelExperienceFiltersSelection;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelExperienceFiltersSelection implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelExperienceFiltersSelection> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f92820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f92821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f92822c;
    public final boolean d;
    public final Set e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            d dVar = (d) parcel.readSerializable();
            d dVar2 = (d) parcel.readSerializable();
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iE = 0;
            int iA = 0;
            while (iA != i) {
                iA = o.a(parcel, linkedHashSet, iA, 1);
            }
            boolean z = parcel.readInt() != 0;
            int i2 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(i2);
            while (iE != i2) {
                iE = com.revolut.data.database.models.openbanking.d.e(TravelExperienceFiltersSelection.class, parcel, linkedHashSet2, iE, 1);
            }
            return new TravelExperienceFiltersSelection(dVar, dVar2, linkedHashSet, z, linkedHashSet2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelExperienceFiltersSelection[i];
        }
    }

    public TravelExperienceFiltersSelection() {
        this(31, null);
    }

    public static TravelExperienceFiltersSelection a(TravelExperienceFiltersSelection travelExperienceFiltersSelection, d dVar, d dVar2, Set set, boolean z, Set set2, int i) {
        if ((i & 1) != 0) {
            dVar = travelExperienceFiltersSelection.f92820a;
        }
        d dVar3 = dVar;
        if ((i & 2) != 0) {
            dVar2 = travelExperienceFiltersSelection.f92821b;
        }
        d dVar4 = dVar2;
        if ((i & 4) != 0) {
            set = travelExperienceFiltersSelection.f92822c;
        }
        Set categories = set;
        if ((i & 8) != 0) {
            z = travelExperienceFiltersSelection.d;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            set2 = travelExperienceFiltersSelection.e;
        }
        Set durations = set2;
        travelExperienceFiltersSelection.getClass();
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(durations, "durations");
        return new TravelExperienceFiltersSelection(dVar3, dVar4, categories, z3, durations);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelExperienceFiltersSelection)) {
            return false;
        }
        TravelExperienceFiltersSelection travelExperienceFiltersSelection = (TravelExperienceFiltersSelection) obj2;
        return Intrinsics.f(this.f92820a, travelExperienceFiltersSelection.f92820a) && Intrinsics.f(this.f92821b, travelExperienceFiltersSelection.f92821b) && Intrinsics.f(this.f92822c, travelExperienceFiltersSelection.f92822c) && this.d == travelExperienceFiltersSelection.d && Intrinsics.f(this.e, travelExperienceFiltersSelection.e);
    }

    public final int hashCode() {
        d dVar = this.f92820a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        d dVar2 = this.f92821b;
        return this.e.hashCode() + j6.a.c(p.a.f((iHashCode + (dVar2 != null ? dVar2.hashCode() : 0)) * 31, 31, this.f92822c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f92820a);
        dest.writeSerializable(this.f92821b);
        Iterator itV = n.v(this.f92822c, dest);
        while (itV.hasNext()) {
            dest.writeString((String) itV.next());
        }
        dest.writeInt(this.d ? 1 : 0);
        Iterator itV2 = n.v(this.e, dest);
        while (itV2.hasNext()) {
            dest.writeParcelable((Parcelable) itV2.next(), i);
        }
    }

    public TravelExperienceFiltersSelection(d dVar, d dVar2, Set categories, boolean z, Set durations) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(durations, "durations");
        this.f92820a = dVar;
        this.f92821b = dVar2;
        this.f92822c = categories;
        this.d = z;
        this.e = durations;
    }

    public TravelExperienceFiltersSelection(int i, Set set) {
        this(null, null, (i & 4) != 0 ? h0.f322473a : set, false, h0.f322473a);
    }
}
