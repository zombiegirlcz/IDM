package com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home.providers.IncomeSorterDestinationCrossSell$PersonalJisaAccount;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorter;
import com.revolut.retail.feature.api.income_sorter.models.IncomeSorterExecution;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.a3;
import wp5.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/details/IncomeSortersDetailsContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "IncomeSorterDelete", "InvestDisclaimer", "InvestDisclaimerDestination", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/details/IncomeSortersDetailsContract$ModalStep$IncomeSorterDelete;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/details/IncomeSortersDetailsContract$ModalStep$InvestDisclaimer;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface IncomeSortersDetailsContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/details/IncomeSortersDetailsContract$ModalStep$IncomeSorterDelete;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/details/IncomeSortersDetailsContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IncomeSorterDelete implements IncomeSortersDetailsContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<IncomeSorterDelete> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IncomeSorter f87746a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a3 f87747b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final IncomeSorterExecution f87748c;
        public final List d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                IncomeSorter incomeSorter = (IncomeSorter) j6.a.f(parcel, "parcel", IncomeSorterDelete.class);
                a3 a3Var = (a3) parcel.readSerializable();
                IncomeSorterExecution incomeSorterExecution = (IncomeSorterExecution) parcel.readParcelable(IncomeSorterDelete.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
                return new IncomeSorterDelete(incomeSorter, incomeSorterExecution, arrayList, a3Var);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IncomeSorterDelete[i];
            }
        }

        public IncomeSorterDelete(IncomeSorter incomeSorter, IncomeSorterExecution incomeSorterExecution, List rates, a3 transaction) {
            Intrinsics.checkNotNullParameter(incomeSorter, "incomeSorter");
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            Intrinsics.checkNotNullParameter(rates, "rates");
            this.f87746a = incomeSorter;
            this.f87747b = transaction;
            this.f87748c = incomeSorterExecution;
            this.d = rates;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof IncomeSorterDelete)) {
                return false;
            }
            IncomeSorterDelete incomeSorterDelete = (IncomeSorterDelete) obj2;
            return Intrinsics.f(this.f87746a, incomeSorterDelete.f87746a) && Intrinsics.f(this.f87747b, incomeSorterDelete.f87747b) && Intrinsics.f(this.f87748c, incomeSorterDelete.f87748c) && Intrinsics.f(this.d, incomeSorterDelete.d);
        }

        public final int hashCode() {
            int iF = y.f(this.f87747b, this.f87746a.hashCode() * 31, 31);
            IncomeSorterExecution incomeSorterExecution = this.f87748c;
            return this.d.hashCode() + ((iF + (incomeSorterExecution == null ? 0 : incomeSorterExecution.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f87746a, i);
            dest.writeSerializable(this.f87747b);
            dest.writeParcelable(this.f87748c, i);
            Iterator itV = p.a.v(this.d, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/details/IncomeSortersDetailsContract$ModalStep$InvestDisclaimer;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/details/IncomeSortersDetailsContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InvestDisclaimer implements IncomeSortersDetailsContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<InvestDisclaimer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InvestDisclaimerDestination f87749a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InvestDisclaimer((InvestDisclaimerDestination) parcel.readParcelable(InvestDisclaimer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InvestDisclaimer[i];
            }
        }

        public InvestDisclaimer(InvestDisclaimerDestination destination) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            this.f87749a = destination;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InvestDisclaimer) && Intrinsics.f(this.f87749a, ((InvestDisclaimer) obj2).f87749a);
        }

        public final int hashCode() {
            return this.f87749a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f87749a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/details/IncomeSortersDetailsContract$ModalStep$InvestDisclaimerDestination;", "Landroid/os/Parcelable;", "Gia", "PersonalJisa", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/details/IncomeSortersDetailsContract$ModalStep$InvestDisclaimerDestination$Gia;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/details/IncomeSortersDetailsContract$ModalStep$InvestDisclaimerDestination$PersonalJisa;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InvestDisclaimerDestination extends Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/details/IncomeSortersDetailsContract$ModalStep$InvestDisclaimerDestination$Gia;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/details/IncomeSortersDetailsContract$ModalStep$InvestDisclaimerDestination;", "<init>", "()V", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Gia implements InvestDisclaimerDestination {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Gia f87750a = new Gia();

            @NotNull
            public static final Parcelable.Creator<Gia> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Gia.f87750a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Gia[i];
                }
            }

            private Gia() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/details/IncomeSortersDetailsContract$ModalStep$InvestDisclaimerDestination$PersonalJisa;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/details/IncomeSortersDetailsContract$ModalStep$InvestDisclaimerDestination;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class PersonalJisa implements InvestDisclaimerDestination {

            @NotNull
            public static final Parcelable.Creator<PersonalJisa> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final IncomeSorterDestinationCrossSell$PersonalJisaAccount f87751a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new PersonalJisa((IncomeSorterDestinationCrossSell$PersonalJisaAccount) parcel.readParcelable(PersonalJisa.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new PersonalJisa[i];
                }
            }

            public PersonalJisa(IncomeSorterDestinationCrossSell$PersonalJisaAccount account) {
                Intrinsics.checkNotNullParameter(account, "account");
                this.f87751a = account;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof PersonalJisa) && Intrinsics.f(this.f87751a, ((PersonalJisa) obj2).f87751a);
            }

            public final int hashCode() {
                return this.f87751a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f87751a, i);
            }
        }
    }
}
