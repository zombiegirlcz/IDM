package com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.models.RemainingBalanceDestination;
import com.revolut.kompot.common.IOData$Input;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/destinations/ui/IncomeSorterDestinationsContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "SelectionMode", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IncomeSorterDestinationsContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<IncomeSorterDestinationsContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SelectionMode f87718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f87719b;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/destinations/ui/IncomeSorterDestinationsContract$InputData$SelectionMode;", "Landroid/os/Parcelable;", "DestinationsSelection", "RemainingBalanceDestinationSelection", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/destinations/ui/IncomeSorterDestinationsContract$InputData$SelectionMode$DestinationsSelection;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/destinations/ui/IncomeSorterDestinationsContract$InputData$SelectionMode$RemainingBalanceDestinationSelection;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface SelectionMode extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/destinations/ui/IncomeSorterDestinationsContract$InputData$SelectionMode$DestinationsSelection;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/destinations/ui/IncomeSorterDestinationsContract$InputData$SelectionMode;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DestinationsSelection implements SelectionMode {

            @NotNull
            public static final Parcelable.Creator<DestinationsSelection> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Set f87720a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f87721b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int i = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                    int iE = 0;
                    while (iE != i) {
                        iE = d.e(DestinationsSelection.class, parcel, linkedHashSet, iE, 1);
                    }
                    return new DestinationsSelection(parcel.readString(), linkedHashSet);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new DestinationsSelection[i];
                }
            }

            public DestinationsSelection(String fundingPocketId, Set filterOutDestinations) {
                Intrinsics.checkNotNullParameter(filterOutDestinations, "filterOutDestinations");
                Intrinsics.checkNotNullParameter(fundingPocketId, "fundingPocketId");
                this.f87720a = filterOutDestinations;
                this.f87721b = fundingPocketId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof DestinationsSelection)) {
                    return false;
                }
                DestinationsSelection destinationsSelection = (DestinationsSelection) obj2;
                return Intrinsics.f(this.f87720a, destinationsSelection.f87720a) && Intrinsics.f(this.f87721b, destinationsSelection.f87721b);
            }

            public final int hashCode() {
                return this.f87721b.hashCode() + (this.f87720a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Iterator itV = n.v(this.f87720a, dest);
                while (itV.hasNext()) {
                    dest.writeParcelable((Parcelable) itV.next(), i);
                }
                dest.writeString(this.f87721b);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/destinations/ui/IncomeSorterDestinationsContract$InputData$SelectionMode$RemainingBalanceDestinationSelection;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/destinations/ui/IncomeSorterDestinationsContract$InputData$SelectionMode;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class RemainingBalanceDestinationSelection implements SelectionMode {

            @NotNull
            public static final Parcelable.Creator<RemainingBalanceDestinationSelection> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final RemainingBalanceDestination.PlaceholderCurrencyDestination f87722a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final RemainingBalanceDestination f87723b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new RemainingBalanceDestinationSelection(parcel.readInt() == 0 ? null : RemainingBalanceDestination.PlaceholderCurrencyDestination.CREATOR.createFromParcel(parcel), (RemainingBalanceDestination) parcel.readParcelable(RemainingBalanceDestinationSelection.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new RemainingBalanceDestinationSelection[i];
                }
            }

            public RemainingBalanceDestinationSelection(RemainingBalanceDestination.PlaceholderCurrencyDestination placeholderCurrencyDestination, RemainingBalanceDestination selectedDestination) {
                Intrinsics.checkNotNullParameter(selectedDestination, "selectedDestination");
                this.f87722a = placeholderCurrencyDestination;
                this.f87723b = selectedDestination;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof RemainingBalanceDestinationSelection)) {
                    return false;
                }
                RemainingBalanceDestinationSelection remainingBalanceDestinationSelection = (RemainingBalanceDestinationSelection) obj2;
                return Intrinsics.f(this.f87722a, remainingBalanceDestinationSelection.f87722a) && Intrinsics.f(this.f87723b, remainingBalanceDestinationSelection.f87723b);
            }

            public final int hashCode() {
                RemainingBalanceDestination.PlaceholderCurrencyDestination placeholderCurrencyDestination = this.f87722a;
                return this.f87723b.hashCode() + ((placeholderCurrencyDestination == null ? 0 : placeholderCurrencyDestination.f87837a.hashCode()) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                RemainingBalanceDestination.PlaceholderCurrencyDestination placeholderCurrencyDestination = this.f87722a;
                if (placeholderCurrencyDestination == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    placeholderCurrencyDestination.writeToParcel(dest, i);
                }
                dest.writeParcelable(this.f87723b, i);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IncomeSorterDestinationsContract$InputData((SelectionMode) parcel.readParcelable(IncomeSorterDestinationsContract$InputData.class.getClassLoader()), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IncomeSorterDestinationsContract$InputData[i];
        }
    }

    public IncomeSorterDestinationsContract$InputData(SelectionMode selectionMode, b targetCurrency) {
        Intrinsics.checkNotNullParameter(selectionMode, "selectionMode");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        this.f87718a = selectionMode;
        this.f87719b = targetCurrency;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f87718a, i);
        dest.writeSerializable(this.f87719b);
    }
}
