package com.revolut.feature.travel.experiences.impl.ui.screen.filter.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/screen/filter/model/ExpandableFilterSection;", "Landroid/os/Parcelable;", "T", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExpandableFilterSection<T extends Parcelable> implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ExpandableFilterSection<?>> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f93071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i2g.a f93072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f93073c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(ExpandableFilterSection.class, parcel, arrayList, iE, 1);
            }
            return new ExpandableFilterSection(arrayList, i2g.a.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExpandableFilterSection[i];
        }
    }

    public ExpandableFilterSection(List items, i2g.a filterType, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(filterType, "filterType");
        this.f93071a = items;
        this.f93072b = filterType;
        this.f93073c = z;
    }

    public static ExpandableFilterSection a(ExpandableFilterSection expandableFilterSection, boolean z) {
        List items = expandableFilterSection.f93071a;
        i2g.a filterType = expandableFilterSection.f93072b;
        expandableFilterSection.getClass();
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(filterType, "filterType");
        return new ExpandableFilterSection(items, filterType, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ExpandableFilterSection)) {
            return false;
        }
        ExpandableFilterSection expandableFilterSection = (ExpandableFilterSection) obj2;
        return Intrinsics.f(this.f93071a, expandableFilterSection.f93071a) && this.f93072b == expandableFilterSection.f93072b && this.f93073c == expandableFilterSection.f93073c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f93073c) + ((this.f93072b.hashCode() + (this.f93071a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f93071a, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeString(this.f93072b.name());
        dest.writeInt(this.f93073c ? 1 : 0);
    }
}
