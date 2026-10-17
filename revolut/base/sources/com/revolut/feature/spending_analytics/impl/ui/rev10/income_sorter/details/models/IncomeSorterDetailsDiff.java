package com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.models;

import android.os.Parcel;
import android.os.Parcelable;
import aqd.i0;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home.IncomeSorterHomeContract$DestinationValue;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.models.RemainingBalanceDestination;
import dj0.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.provider.digest.a;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/details/models/IncomeSorterDetailsDiff;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IncomeSorterDetailsDiff implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f87768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RemainingBalanceDestination f87769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f87770c;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<IncomeSorterDetailsDiff> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.models.IncomeSorterDetailsDiff$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static IncomeSorterDetailsDiff a(ArrayList currentDestinations, ArrayList originalDestinations, RemainingBalanceDestination currentRemainingBalance, RemainingBalanceDestination originalRemainingBalance, i0 currentSortMethod, i0 originalSortMethod) {
            Intrinsics.checkNotNullParameter(currentDestinations, "currentDestinations");
            Intrinsics.checkNotNullParameter(originalDestinations, "originalDestinations");
            Intrinsics.checkNotNullParameter(currentRemainingBalance, "currentRemainingBalance");
            Intrinsics.checkNotNullParameter(originalRemainingBalance, "originalRemainingBalance");
            Intrinsics.checkNotNullParameter(currentSortMethod, "currentSortMethod");
            Intrinsics.checkNotNullParameter(originalSortMethod, "originalSortMethod");
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : currentDestinations) {
                if (((IncomeSorterHomeContract$DestinationValue) obj2).f87826b.f(d.e)) {
                    arrayList.add(obj2);
                }
            }
            Set setI1 = d0.i1(arrayList);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : originalDestinations) {
                if (((IncomeSorterHomeContract$DestinationValue) obj3).f87826b.f(d.e)) {
                    arrayList2.add(obj3);
                }
            }
            if (Intrinsics.f(setI1, d0.i1(arrayList2))) {
                currentDestinations = null;
            }
            if (Intrinsics.f(currentRemainingBalance, originalRemainingBalance)) {
                currentRemainingBalance = null;
            }
            if (currentSortMethod == originalSortMethod) {
                currentSortMethod = null;
            }
            return new IncomeSorterDetailsDiff(currentDestinations, currentRemainingBalance, currentSortMethod);
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = a.a(IncomeSorterHomeContract$DestinationValue.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            return new IncomeSorterDetailsDiff(arrayList, (RemainingBalanceDestination) parcel.readParcelable(IncomeSorterDetailsDiff.class.getClassLoader()), parcel.readInt() != 0 ? i0.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IncomeSorterDetailsDiff[i];
        }
    }

    public IncomeSorterDetailsDiff(ArrayList arrayList, RemainingBalanceDestination remainingBalanceDestination, i0 i0Var) {
        this.f87768a = arrayList;
        this.f87769b = remainingBalanceDestination;
        this.f87770c = i0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IncomeSorterDetailsDiff)) {
            return false;
        }
        IncomeSorterDetailsDiff incomeSorterDetailsDiff = (IncomeSorterDetailsDiff) obj2;
        return Intrinsics.f(this.f87768a, incomeSorterDetailsDiff.f87768a) && Intrinsics.f(this.f87769b, incomeSorterDetailsDiff.f87769b) && this.f87770c == incomeSorterDetailsDiff.f87770c;
    }

    public final int hashCode() {
        List list = this.f87768a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        RemainingBalanceDestination remainingBalanceDestination = this.f87769b;
        int iHashCode2 = (iHashCode + (remainingBalanceDestination == null ? 0 : remainingBalanceDestination.hashCode())) * 31;
        i0 i0Var = this.f87770c;
        return iHashCode2 + (i0Var != null ? i0Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List list = this.f87768a;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((IncomeSorterHomeContract$DestinationValue) itQ.next()).writeToParcel(dest, i);
            }
        }
        dest.writeParcelable(this.f87769b, i);
        i0 i0Var = this.f87770c;
        if (i0Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(i0Var.name());
        }
    }
}
