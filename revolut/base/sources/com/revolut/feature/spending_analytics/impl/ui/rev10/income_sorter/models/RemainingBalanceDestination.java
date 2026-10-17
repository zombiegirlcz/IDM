package com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestinationId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/models/RemainingBalanceDestination;", "Landroid/os/Parcelable;", "DestinationInfo", "PlaceholderCurrencyDestination", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/models/RemainingBalanceDestination$DestinationInfo;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/models/RemainingBalanceDestination$PlaceholderCurrencyDestination;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RemainingBalanceDestination extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/models/RemainingBalanceDestination$DestinationInfo;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/models/RemainingBalanceDestination;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DestinationInfo implements RemainingBalanceDestination {

        @NotNull
        public static final Parcelable.Creator<DestinationInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IncomeSorterDestinationInfo f87835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final IncomeSorterDestinationId f87836b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DestinationInfo((IncomeSorterDestinationInfo) parcel.readParcelable(DestinationInfo.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DestinationInfo[i];
            }
        }

        public DestinationInfo(IncomeSorterDestinationInfo destinationInfo) {
            Intrinsics.checkNotNullParameter(destinationInfo, "destinationInfo");
            this.f87835a = destinationInfo;
            this.f87836b = destinationInfo.getId();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DestinationInfo) && Intrinsics.f(this.f87835a, ((DestinationInfo) obj2).f87835a);
        }

        @Override // com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.models.RemainingBalanceDestination
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final IncomeSorterDestinationId getF87836b() {
            return this.f87836b;
        }

        public final int hashCode() {
            return this.f87835a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f87835a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/models/RemainingBalanceDestination$PlaceholderCurrencyDestination;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/models/RemainingBalanceDestination;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlaceholderCurrencyDestination implements RemainingBalanceDestination {

        @NotNull
        public static final Parcelable.Creator<PlaceholderCurrencyDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f87837a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlaceholderCurrencyDestination((b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlaceholderCurrencyDestination[i];
            }
        }

        public PlaceholderCurrencyDestination(b currency) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f87837a = currency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PlaceholderCurrencyDestination) && Intrinsics.f(this.f87837a, ((PlaceholderCurrencyDestination) obj2).f87837a);
        }

        @Override // com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.models.RemainingBalanceDestination
        /* JADX INFO: renamed from: getId */
        public final IncomeSorterDestinationId getF87836b() {
            return null;
        }

        public final int hashCode() {
            return this.f87837a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f87837a);
        }
    }

    /* JADX INFO: renamed from: getId */
    IncomeSorterDestinationId getF87836b();
}
