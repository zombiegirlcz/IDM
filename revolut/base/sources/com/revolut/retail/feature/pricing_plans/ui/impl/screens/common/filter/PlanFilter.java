package com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.filter;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.p;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0004\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/common/filter/PlanFilter;", "Landroid/os/Parcelable;", "Companion", "Current", "Or", "And", "NoFilter", "a", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/common/filter/PlanFilter$And;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/common/filter/PlanFilter$Current;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/common/filter/PlanFilter$NoFilter;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/common/filter/PlanFilter$Or;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PlanFilter extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f103395a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/common/filter/PlanFilter$Current;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/common/filter/PlanFilter;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Current implements PlanFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Current f103385a = new Current();

        @NotNull
        public static final Parcelable.Creator<Current> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Current.f103385a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Current[i];
            }
        }

        private Current() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/common/filter/PlanFilter$NoFilter;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/common/filter/PlanFilter;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NoFilter implements PlanFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NoFilter f103390a = new NoFilter();

        @NotNull
        public static final Parcelable.Creator<NoFilter> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NoFilter.f103390a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NoFilter[i];
            }
        }

        private NoFilter() {
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

    /* JADX INFO: renamed from: com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.filter.PlanFilter$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f103395a = new Companion();

        private Companion() {
        }

        public static Or a(PlanFilter... filters) {
            Intrinsics.checkNotNullParameter(filters, "filters");
            return new Or(d.v0(filters));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/common/filter/PlanFilter$And;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/common/filter/PlanFilter;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class And implements PlanFilter {

        @NotNull
        public static final Parcelable.Creator<And> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f103384a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(And.class, parcel, arrayList, iE, 1);
                }
                return new And(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new And[i];
            }
        }

        public And(List filters) {
            Intrinsics.checkNotNullParameter(filters, "filters");
            this.f103384a = filters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof And) && Intrinsics.f(this.f103384a, ((And) obj2).f103384a);
        }

        public final int hashCode() {
            return this.f103384a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f103384a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public And(PlanFilter... filters) {
            this(p.c(filters));
            Intrinsics.checkNotNullParameter(filters, "filters");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/common/filter/PlanFilter$Or;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/common/filter/PlanFilter;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Or implements PlanFilter {

        @NotNull
        public static final Parcelable.Creator<Or> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f103391a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(Or.class, parcel, arrayList, iE, 1);
                }
                return new Or(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Or[i];
            }
        }

        public Or(List filters) {
            Intrinsics.checkNotNullParameter(filters, "filters");
            this.f103391a = filters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Or) && Intrinsics.f(this.f103391a, ((Or) obj2).f103391a);
        }

        public final int hashCode() {
            return this.f103391a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f103391a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Or(PlanFilter... filters) {
            this(p.c(filters));
            Intrinsics.checkNotNullParameter(filters, "filters");
        }
    }
}
