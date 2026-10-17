package com.revolut.feature.spending_analytics.impl.ui.rev10.select;

import android.os.Parcel;
import android.os.Parcelable;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/rev10/select/SelectTransactionContract$SelectionMode", "Landroid/os/Parcelable;", "Single", "Multiple", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/select/SelectTransactionContract$SelectionMode$Multiple;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/select/SelectTransactionContract$SelectionMode$Single;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SelectTransactionContract$SelectionMode extends Parcelable {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/select/SelectTransactionContract$SelectionMode$Multiple;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/select/SelectTransactionContract$SelectionMode;", "AllSelected", "AllDeselected", "SpecificTransactions", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/select/SelectTransactionContract$SelectionMode$Multiple$AllDeselected;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/select/SelectTransactionContract$SelectionMode$Multiple$AllSelected;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/select/SelectTransactionContract$SelectionMode$Multiple$SpecificTransactions;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Multiple extends SelectTransactionContract$SelectionMode {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/select/SelectTransactionContract$SelectionMode$Multiple$AllSelected;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/select/SelectTransactionContract$SelectionMode$Multiple;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class AllSelected implements Multiple {

            @NotNull
            public static final Parcelable.Creator<AllSelected> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LinkedHashSet f87886a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final SelectTransactionContract$DateRange f87887b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int i = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                    int iA = 0;
                    while (iA != i) {
                        iA = o.a(parcel, linkedHashSet, iA, 1);
                    }
                    return new AllSelected(linkedHashSet, SelectTransactionContract$DateRange.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new AllSelected[i];
                }
            }

            public AllSelected(LinkedHashSet deselectedTransactionIds, SelectTransactionContract$DateRange dateRange) {
                Intrinsics.checkNotNullParameter(deselectedTransactionIds, "deselectedTransactionIds");
                Intrinsics.checkNotNullParameter(dateRange, "dateRange");
                this.f87886a = deselectedTransactionIds;
                this.f87887b = dateRange;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof AllSelected)) {
                    return false;
                }
                AllSelected allSelected = (AllSelected) obj2;
                return this.f87886a.equals(allSelected.f87886a) && Intrinsics.f(this.f87887b, allSelected.f87887b);
            }

            public final int hashCode() {
                return this.f87887b.hashCode() + (this.f87886a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                LinkedHashSet linkedHashSet = this.f87886a;
                dest.writeInt(linkedHashSet.size());
                Iterator it8 = linkedHashSet.iterator();
                while (it8.hasNext()) {
                    dest.writeString((String) it8.next());
                }
                this.f87887b.writeToParcel(dest, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/select/SelectTransactionContract$SelectionMode$Multiple$SpecificTransactions;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/select/SelectTransactionContract$SelectionMode$Multiple;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SpecificTransactions implements Multiple {

            @NotNull
            public static final Parcelable.Creator<SpecificTransactions> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Set f87888a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final SelectTransactionContract$DateRange f87889b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int i = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                    int iA = 0;
                    while (iA != i) {
                        iA = o.a(parcel, linkedHashSet, iA, 1);
                    }
                    return new SpecificTransactions(linkedHashSet, parcel.readInt() == 0 ? null : SelectTransactionContract$DateRange.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SpecificTransactions[i];
                }
            }

            public SpecificTransactions(Set selectedTransactionIds, SelectTransactionContract$DateRange selectTransactionContract$DateRange) {
                Intrinsics.checkNotNullParameter(selectedTransactionIds, "selectedTransactionIds");
                this.f87888a = selectedTransactionIds;
                this.f87889b = selectTransactionContract$DateRange;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof SpecificTransactions)) {
                    return false;
                }
                SpecificTransactions specificTransactions = (SpecificTransactions) obj2;
                return Intrinsics.f(this.f87888a, specificTransactions.f87888a) && Intrinsics.f(this.f87889b, specificTransactions.f87889b);
            }

            public final int hashCode() {
                int iHashCode = this.f87888a.hashCode() * 31;
                SelectTransactionContract$DateRange selectTransactionContract$DateRange = this.f87889b;
                return iHashCode + (selectTransactionContract$DateRange == null ? 0 : selectTransactionContract$DateRange.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Iterator itV = n.v(this.f87888a, dest);
                while (itV.hasNext()) {
                    dest.writeString((String) itV.next());
                }
                SelectTransactionContract$DateRange selectTransactionContract$DateRange = this.f87889b;
                if (selectTransactionContract$DateRange == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    selectTransactionContract$DateRange.writeToParcel(dest, i);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/select/SelectTransactionContract$SelectionMode$Multiple$AllDeselected;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/select/SelectTransactionContract$SelectionMode$Multiple;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class AllDeselected implements Multiple {

            @NotNull
            public static final Parcelable.Creator<AllDeselected> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SelectTransactionContract$DateRange f87885a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new AllDeselected(parcel.readInt() == 0 ? null : SelectTransactionContract$DateRange.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new AllDeselected[i];
                }
            }

            public AllDeselected(SelectTransactionContract$DateRange selectTransactionContract$DateRange) {
                this.f87885a = selectTransactionContract$DateRange;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof AllDeselected) && Intrinsics.f(this.f87885a, ((AllDeselected) obj2).f87885a);
            }

            public final int hashCode() {
                SelectTransactionContract$DateRange selectTransactionContract$DateRange = this.f87885a;
                if (selectTransactionContract$DateRange == null) {
                    return 0;
                }
                return selectTransactionContract$DateRange.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                SelectTransactionContract$DateRange selectTransactionContract$DateRange = this.f87885a;
                if (selectTransactionContract$DateRange == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    selectTransactionContract$DateRange.writeToParcel(dest, i);
                }
            }

            public AllDeselected() {
                this(null);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/select/SelectTransactionContract$SelectionMode$Single;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/select/SelectTransactionContract$SelectionMode;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Single implements SelectTransactionContract$SelectionMode {

        @NotNull
        public static final Parcelable.Creator<Single> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f87890a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Single(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Single[i];
            }
        }

        public Single(boolean z) {
            this.f87890a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Single) && this.f87890a == ((Single) obj2).f87890a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f87890a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f87890a ? 1 : 0);
        }
    }
}
