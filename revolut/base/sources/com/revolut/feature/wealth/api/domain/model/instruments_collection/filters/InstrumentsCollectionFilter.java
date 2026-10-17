package com.revolut.feature.wealth.api.domain.model.instruments_collection.filters;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/InstrumentsCollectionFilter;", "Landroid/os/Parcelable;", "FilterValue", "ListFilter", "RangeFilter", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/InstrumentsCollectionFilter$ListFilter;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/InstrumentsCollectionFilter$RangeFilter;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InstrumentsCollectionFilter extends Parcelable {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/InstrumentsCollectionFilter$FilterValue;", "Landroid/os/Parcelable;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/InstrumentsCollectionFilter$ListFilter$Value;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/InstrumentsCollectionFilter$RangeFilter$Range;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface FilterValue extends Parcelable {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/InstrumentsCollectionFilter$RangeFilter;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/InstrumentsCollectionFilter;", "", "toString", "()Ljava/lang/String;", "Range", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RangeFilter implements InstrumentsCollectionFilter {

        @NotNull
        public static final Parcelable.Creator<RangeFilter> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InstrumentsCollectionFilterId f95294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f95295b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f95296c;
        public final int d;
        public final Range e;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/InstrumentsCollectionFilter$RangeFilter$Range;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/InstrumentsCollectionFilter$FilterValue;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Range implements FilterValue {

            @NotNull
            public static final Parcelable.Creator<Range> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f95297a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f95298b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Range(parcel.readInt(), parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Range[i];
                }
            }

            public Range(int i, int i2) {
                this.f95297a = i;
                this.f95298b = i2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Range)) {
                    return false;
                }
                Range range = (Range) obj2;
                return this.f95297a == range.f95297a && this.f95298b == range.f95298b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f95298b) + (Integer.hashCode(this.f95297a) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f95297a);
                dest.writeInt(this.f95298b);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RangeFilter((InstrumentsCollectionFilterId) parcel.readParcelable(RangeFilter.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), Range.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RangeFilter[i];
            }
        }

        public RangeFilter(InstrumentsCollectionFilterId filterId, boolean z, int i, int i2, Range range) {
            Intrinsics.checkNotNullParameter(filterId, "filterId");
            Intrinsics.checkNotNullParameter(range, "range");
            this.f95294a = filterId;
            this.f95295b = z;
            this.f95296c = i;
            this.d = i2;
            this.e = range;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RangeFilter)) {
                return false;
            }
            RangeFilter rangeFilter = (RangeFilter) obj2;
            return Intrinsics.f(this.f95294a, rangeFilter.f95294a) && this.f95295b == rangeFilter.f95295b && this.f95296c == rangeFilter.f95296c && this.d == rangeFilter.d && Intrinsics.f(this.e, rangeFilter.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + j6.a.b(this.d, j6.a.b(this.f95296c, j6.a.c(this.f95294a.hashCode() * 31, 31, this.f95295b), 31), 31);
        }

        @Override // com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.InstrumentsCollectionFilter
        /* JADX INFO: renamed from: p9, reason: from getter */
        public final InstrumentsCollectionFilterId getF95294a() {
            return this.f95294a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f95294a, i);
            dest.writeInt(this.f95295b ? 1 : 0);
            dest.writeInt(this.f95296c);
            dest.writeInt(this.d);
            this.e.writeToParcel(dest, i);
        }
    }

    /* JADX INFO: renamed from: p9 */
    InstrumentsCollectionFilterId getF95294a();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/InstrumentsCollectionFilter$ListFilter;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/InstrumentsCollectionFilter;", "", "toString", "()Ljava/lang/String;", "Value", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ListFilter implements InstrumentsCollectionFilter {

        @NotNull
        public static final Parcelable.Creator<ListFilter> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InstrumentsCollectionFilterId f95289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f95290b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f95291c;
        public final int d;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/InstrumentsCollectionFilter$ListFilter$Value;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/InstrumentsCollectionFilter$FilterValue;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Value implements FilterValue {

            @NotNull
            public static final Parcelable.Creator<Value> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final InstrumentsCollectionFilterValueId f95292a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f95293b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Value((InstrumentsCollectionFilterValueId) parcel.readParcelable(Value.class.getClassLoader()), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Value[i];
                }
            }

            public Value(InstrumentsCollectionFilterValueId id10, boolean z) {
                Intrinsics.checkNotNullParameter(id10, "id");
                this.f95292a = id10;
                this.f95293b = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Value)) {
                    return false;
                }
                Value value = (Value) obj2;
                return Intrinsics.f(this.f95292a, value.f95292a) && this.f95293b == value.f95293b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f95293b) + (this.f95292a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f95292a, i);
                dest.writeInt(this.f95293b ? 1 : 0);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                InstrumentsCollectionFilterId instrumentsCollectionFilterId = (InstrumentsCollectionFilterId) j6.a.f(parcel, "parcel", ListFilter.class);
                int iA = 0;
                boolean z = parcel.readInt() != 0;
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Value.CREATOR, parcel, arrayList, iA, 1);
                }
                return new ListFilter(instrumentsCollectionFilterId, z, arrayList, parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ListFilter[i];
            }
        }

        public ListFilter(InstrumentsCollectionFilterId filterId, boolean z, List values, int i) {
            Intrinsics.checkNotNullParameter(filterId, "filterId");
            Intrinsics.checkNotNullParameter(values, "values");
            this.f95289a = filterId;
            this.f95290b = z;
            this.f95291c = values;
            this.d = i;
        }

        public final ArrayList a() {
            List list = this.f95291c;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((Value) obj2).f95293b) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                arrayList2.add(((Value) it8.next()).f95292a);
            }
            return arrayList2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ListFilter)) {
                return false;
            }
            ListFilter listFilter = (ListFilter) obj2;
            return Intrinsics.f(this.f95289a, listFilter.f95289a) && this.f95290b == listFilter.f95290b && Intrinsics.f(this.f95291c, listFilter.f95291c) && this.d == listFilter.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + p.a.d(j6.a.c(this.f95289a.hashCode() * 31, 31, this.f95290b), 31, this.f95291c);
        }

        @Override // com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.InstrumentsCollectionFilter
        /* JADX INFO: renamed from: p9, reason: from getter */
        public final InstrumentsCollectionFilterId getF95294a() {
            return this.f95289a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f95289a, i);
            dest.writeInt(this.f95290b ? 1 : 0);
            Iterator itV = p.a.v(this.f95291c, dest);
            while (itV.hasNext()) {
                ((Value) itV.next()).writeToParcel(dest, i);
            }
            dest.writeInt(this.d);
        }

        public /* synthetic */ ListFilter(BondsCollectionFilterId bondsCollectionFilterId, List list, int i) {
            this(bondsCollectionFilterId, (i & 2) == 0, list, (i & 8) != 0 ? list.size() : 3);
        }
    }
}
