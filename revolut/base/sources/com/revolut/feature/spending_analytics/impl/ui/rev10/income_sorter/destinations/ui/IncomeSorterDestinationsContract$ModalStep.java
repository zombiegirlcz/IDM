package com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/destinations/ui/IncomeSorterDestinationsContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "WealthAssetSelection", "CryptoSeeAllStep", "WealthDisclaimerStep", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/destinations/ui/IncomeSorterDestinationsContract$ModalStep$CryptoSeeAllStep;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/destinations/ui/IncomeSorterDestinationsContract$ModalStep$WealthAssetSelection;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/destinations/ui/IncomeSorterDestinationsContract$ModalStep$WealthDisclaimerStep;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class IncomeSorterDestinationsContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/destinations/ui/IncomeSorterDestinationsContract$ModalStep$CryptoSeeAllStep;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/destinations/ui/IncomeSorterDestinationsContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CryptoSeeAllStep extends IncomeSorterDestinationsContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CryptoSeeAllStep> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f87724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f87725b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iC = 0;
                int iC2 = 0;
                while (iC2 != i) {
                    iC2 = ch.qos.logback.core.util.a.c(parcel, arrayList, iC2, 1);
                }
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                while (iC != i2) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList2, iC, 1);
                }
                return new CryptoSeeAllStep(arrayList, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CryptoSeeAllStep[i];
            }
        }

        public CryptoSeeAllStep(ArrayList filteredOutCurrencies, List selectedCurrencies) {
            Intrinsics.checkNotNullParameter(filteredOutCurrencies, "filteredOutCurrencies");
            Intrinsics.checkNotNullParameter(selectedCurrencies, "selectedCurrencies");
            this.f87724a = filteredOutCurrencies;
            this.f87725b = selectedCurrencies;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CryptoSeeAllStep)) {
                return false;
            }
            CryptoSeeAllStep cryptoSeeAllStep = (CryptoSeeAllStep) obj2;
            return this.f87724a.equals(cryptoSeeAllStep.f87724a) && Intrinsics.f(this.f87725b, cryptoSeeAllStep.f87725b);
        }

        public final int hashCode() {
            return this.f87725b.hashCode() + (this.f87724a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f87724a, dest);
            while (itY.hasNext()) {
                dest.writeSerializable((Serializable) itY.next());
            }
            Iterator itV = p.a.v(this.f87725b, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/destinations/ui/IncomeSorterDestinationsContract$ModalStep$WealthAssetSelection;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/destinations/ui/IncomeSorterDestinationsContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WealthAssetSelection extends IncomeSorterDestinationsContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<WealthAssetSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.revolut.feature.spending_analytics.api.models.income_sorter.a f87726a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f87727b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f87728c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                com.revolut.feature.spending_analytics.api.models.income_sorter.a aVarValueOf = com.revolut.feature.spending_analytics.api.models.income_sorter.a.valueOf(parcel.readString());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(WealthAssetSelection.class, parcel, arrayList, iE, 1);
                }
                return new WealthAssetSelection(aVarValueOf, parcel.readString(), arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WealthAssetSelection[i];
            }
        }

        public WealthAssetSelection(com.revolut.feature.spending_analytics.api.models.income_sorter.a investmentType, String str, ArrayList investments) {
            Intrinsics.checkNotNullParameter(investmentType, "investmentType");
            Intrinsics.checkNotNullParameter(investments, "investments");
            this.f87726a = investmentType;
            this.f87727b = investments;
            this.f87728c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof WealthAssetSelection)) {
                return false;
            }
            WealthAssetSelection wealthAssetSelection = (WealthAssetSelection) obj2;
            return this.f87726a == wealthAssetSelection.f87726a && this.f87727b.equals(wealthAssetSelection.f87727b) && Intrinsics.f(this.f87728c, wealthAssetSelection.f87728c);
        }

        public final int hashCode() {
            int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f87727b, this.f87726a.hashCode() * 31, 31);
            String str = this.f87728c;
            return iB + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87726a.name());
            Iterator itY = j6.a.y(this.f87727b, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
            dest.writeString(this.f87728c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/destinations/ui/IncomeSorterDestinationsContract$ModalStep$WealthDisclaimerStep;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/destinations/ui/IncomeSorterDestinationsContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WealthDisclaimerStep extends IncomeSorterDestinationsContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<WealthDisclaimerStep> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IncomeSorterDestinationsContract$SectionInfoParcel f87729a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WealthDisclaimerStep(IncomeSorterDestinationsContract$SectionInfoParcel.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WealthDisclaimerStep[i];
            }
        }

        public WealthDisclaimerStep(IncomeSorterDestinationsContract$SectionInfoParcel sectionInfoParcel) {
            Intrinsics.checkNotNullParameter(sectionInfoParcel, "sectionInfoParcel");
            this.f87729a = sectionInfoParcel;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof WealthDisclaimerStep) && Intrinsics.f(this.f87729a, ((WealthDisclaimerStep) obj2).f87729a);
        }

        public final int hashCode() {
            return this.f87729a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f87729a.writeToParcel(dest, i);
        }
    }

    private IncomeSorterDestinationsContract$ModalStep() {
    }
}
