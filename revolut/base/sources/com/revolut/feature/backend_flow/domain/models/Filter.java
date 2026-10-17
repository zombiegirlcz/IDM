package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.backend_flow.domain.models.FilterValue;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003:\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0005\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/Filter;", "Lcom/revolut/feature/backend_flow/domain/models/FilterValue;", "T", "Landroid/os/Parcelable;", "<init>", "()V", "Eq", "In", "Between", "Gt", "Lt", "Lcom/revolut/feature/backend_flow/domain/models/Filter$Between;", "Lcom/revolut/feature/backend_flow/domain/models/Filter$Eq;", "Lcom/revolut/feature/backend_flow/domain/models/Filter$Gt;", "Lcom/revolut/feature/backend_flow/domain/models/Filter$In;", "Lcom/revolut/feature/backend_flow/domain/models/Filter$Lt;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class Filter<T extends FilterValue> implements Parcelable {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/Filter$Between;", "Lcom/revolut/feature/backend_flow/domain/models/FilterValue;", "T", "Lcom/revolut/feature/backend_flow/domain/models/Filter;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Between<T extends FilterValue> extends Filter<T> {

        @NotNull
        public static final Parcelable.Creator<Between<?>> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f63441a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f63442b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final FilterValue f63443c;
        public final FilterValue d;
        public final boolean e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                boolean z3;
                FilterValue filterValue;
                boolean z4;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z6 = false;
                boolean z11 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z6 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = true;
                    z11 = z;
                }
                FilterValue filterValue2 = (FilterValue) parcel.readParcelable(Between.class.getClassLoader());
                FilterValue filterValue3 = (FilterValue) parcel.readParcelable(Between.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    z4 = z3;
                    filterValue = filterValue2;
                } else {
                    filterValue = filterValue2;
                    z4 = z;
                }
                return new Between(z6, z11, filterValue, filterValue3, z4);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Between[i];
            }
        }

        public Between(boolean z, boolean z3, FilterValue from, FilterValue to6, boolean z4) {
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(to6, "to");
            this.f63441a = z;
            this.f63442b = z3;
            this.f63443c = from;
            this.d = to6;
            this.e = z4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Between)) {
                return false;
            }
            Between between = (Between) obj2;
            return this.f63441a == between.f63441a && this.f63442b == between.f63442b && Intrinsics.f(this.f63443c, between.f63443c) && Intrinsics.f(this.d, between.d) && this.e == between.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.f63443c.hashCode() + j6.a.c(Boolean.hashCode(this.f63441a) * 31, 31, this.f63442b)) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f63441a ? 1 : 0);
            dest.writeInt(this.f63442b ? 1 : 0);
            dest.writeParcelable(this.f63443c, i);
            dest.writeParcelable(this.d, i);
            dest.writeInt(this.e ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/Filter$Eq;", "Lcom/revolut/feature/backend_flow/domain/models/FilterValue;", "T", "Lcom/revolut/feature/backend_flow/domain/models/Filter;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Eq<T extends FilterValue> extends Filter<T> {

        @NotNull
        public static final Parcelable.Creator<Eq<?>> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FilterValue f63444a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f63445b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Eq((FilterValue) parcel.readParcelable(Eq.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Eq[i];
            }
        }

        public Eq(FilterValue value, boolean z) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f63444a = value;
            this.f63445b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Eq)) {
                return false;
            }
            Eq eq7 = (Eq) obj2;
            return Intrinsics.f(this.f63444a, eq7.f63444a) && this.f63445b == eq7.f63445b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f63445b) + (this.f63444a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f63444a, i);
            dest.writeInt(this.f63445b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/Filter$Gt;", "Lcom/revolut/feature/backend_flow/domain/models/FilterValue;", "T", "Lcom/revolut/feature/backend_flow/domain/models/Filter;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Gt<T extends FilterValue> extends Filter<T> {

        @NotNull
        public static final Parcelable.Creator<Gt<?>> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FilterValue f63446a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f63447b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Gt((FilterValue) parcel.readParcelable(Gt.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Gt[i];
            }
        }

        public Gt(FilterValue value, boolean z) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f63446a = value;
            this.f63447b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Gt)) {
                return false;
            }
            Gt gt = (Gt) obj2;
            return Intrinsics.f(this.f63446a, gt.f63446a) && this.f63447b == gt.f63447b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f63447b) + (this.f63446a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f63446a, i);
            dest.writeInt(this.f63447b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/Filter$In;", "Lcom/revolut/feature/backend_flow/domain/models/FilterValue;", "T", "Lcom/revolut/feature/backend_flow/domain/models/Filter;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class In<T extends FilterValue> extends Filter<T> {

        @NotNull
        public static final Parcelable.Creator<In<?>> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f63448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f63449b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iE = 0;
                while (iE != i) {
                    iE = com.revolut.data.database.models.openbanking.d.e(In.class, parcel, linkedHashSet, iE, 1);
                }
                return new In(linkedHashSet, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new In[i];
            }
        }

        public In(Set values, boolean z) {
            Intrinsics.checkNotNullParameter(values, "values");
            this.f63448a = values;
            this.f63449b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof In)) {
                return false;
            }
            In in10 = (In) obj2;
            return Intrinsics.f(this.f63448a, in10.f63448a) && this.f63449b == in10.f63449b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f63449b) + (this.f63448a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = n.v(this.f63448a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeInt(this.f63449b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/Filter$Lt;", "Lcom/revolut/feature/backend_flow/domain/models/FilterValue;", "T", "Lcom/revolut/feature/backend_flow/domain/models/Filter;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Lt<T extends FilterValue> extends Filter<T> {

        @NotNull
        public static final Parcelable.Creator<Lt<?>> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FilterValue f63450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f63451b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Lt((FilterValue) parcel.readParcelable(Lt.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Lt[i];
            }
        }

        public Lt(FilterValue value, boolean z) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f63450a = value;
            this.f63451b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Lt)) {
                return false;
            }
            Lt lt2 = (Lt) obj2;
            return Intrinsics.f(this.f63450a, lt2.f63450a) && this.f63451b == lt2.f63451b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f63451b) + (this.f63450a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f63450a, i);
            dest.writeInt(this.f63451b ? 1 : 0);
        }
    }

    private Filter() {
    }
}
