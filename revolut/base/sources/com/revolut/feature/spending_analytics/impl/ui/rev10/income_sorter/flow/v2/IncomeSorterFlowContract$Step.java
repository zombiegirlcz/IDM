package com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2;

import android.os.Parcel;
import android.os.Parcelable;
import aqd.i0;
import com.revolut.feature.categorisation.api.model.CategorisationFilter;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.IncomeSortersDetailsContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home.IncomeSorterHomeContract$DestinationValue;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.models.RemainingBalanceDestination;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.IncomeSorterReviewContract$ReviewMode;
import com.revolut.feature.vaults.common.SavingAccountType;
import com.revolut.kompot.navigable.flow.FlowStep;
import ehe.n;
import h30.l;
import ip0.v7;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.a3;
import wp5.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/v2/IncomeSorterFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "IncomeSortersList", "IncomeSorterDetails", "IncomeSorterDestinations", "CreateSubaccount", "CreateSavings", "SelectIncome", "DestinationsExecution", "IncomeSorterExecution", "CreateTransfer", "Review", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/v2/IncomeSorterFlowContract$Step$CreateSavings;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/v2/IncomeSorterFlowContract$Step$CreateSubaccount;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/v2/IncomeSorterFlowContract$Step$CreateTransfer;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/v2/IncomeSorterFlowContract$Step$DestinationsExecution;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/v2/IncomeSorterFlowContract$Step$IncomeSorterDestinations;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/v2/IncomeSorterFlowContract$Step$IncomeSorterDetails;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/v2/IncomeSorterFlowContract$Step$IncomeSorterExecution;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/v2/IncomeSorterFlowContract$Step$IncomeSortersList;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/v2/IncomeSorterFlowContract$Step$Review;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/v2/IncomeSorterFlowContract$Step$SelectIncome;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface IncomeSorterFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/v2/IncomeSorterFlowContract$Step$CreateSavings;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/v2/IncomeSorterFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreateSavings implements IncomeSorterFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CreateSavings> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SavingAccountType f87788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f87789b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                SavingAccountType savingAccountType = (SavingAccountType) j6.a.f(parcel, "parcel", CreateSavings.class);
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iE = 0;
                while (iE != i) {
                    iE = com.revolut.data.database.models.openbanking.d.e(CreateSavings.class, parcel, linkedHashSet, iE, 1);
                }
                return new CreateSavings(savingAccountType, linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreateSavings[i];
            }
        }

        public CreateSavings(SavingAccountType savingsAccountType, Set pendingSelectedDestinationIds) {
            Intrinsics.checkNotNullParameter(savingsAccountType, "savingsAccountType");
            Intrinsics.checkNotNullParameter(pendingSelectedDestinationIds, "pendingSelectedDestinationIds");
            this.f87788a = savingsAccountType;
            this.f87789b = pendingSelectedDestinationIds;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CreateSavings)) {
                return false;
            }
            CreateSavings createSavings = (CreateSavings) obj2;
            return Intrinsics.f(this.f87788a, createSavings.f87788a) && Intrinsics.f(this.f87789b, createSavings.f87789b);
        }

        public final int hashCode() {
            return this.f87789b.hashCode() + (this.f87788a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f87788a, i);
            Iterator itV = n.v(this.f87789b, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/v2/IncomeSorterFlowContract$Step$CreateSubaccount;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/v2/IncomeSorterFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreateSubaccount implements IncomeSorterFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CreateSubaccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f87790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f87791b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Set f87792c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iE = 0;
                int iE2 = 0;
                while (iE2 != i) {
                    iE2 = com.revolut.data.database.models.openbanking.d.e(CreateSubaccount.class, parcel, linkedHashSet, iE2, 1);
                }
                String string = parcel.readString();
                int i2 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i2);
                while (iE != i2) {
                    iE = com.revolut.data.database.models.openbanking.d.e(CreateSubaccount.class, parcel, linkedHashSet2, iE, 1);
                }
                return new CreateSubaccount(string, linkedHashSet, linkedHashSet2);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreateSubaccount[i];
            }
        }

        public CreateSubaccount(String str, Set types, Set pendingSelectedDestinationIds) {
            Intrinsics.checkNotNullParameter(types, "types");
            Intrinsics.checkNotNullParameter(pendingSelectedDestinationIds, "pendingSelectedDestinationIds");
            this.f87790a = types;
            this.f87791b = str;
            this.f87792c = pendingSelectedDestinationIds;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CreateSubaccount)) {
                return false;
            }
            CreateSubaccount createSubaccount = (CreateSubaccount) obj2;
            return Intrinsics.f(this.f87790a, createSubaccount.f87790a) && Intrinsics.f(this.f87791b, createSubaccount.f87791b) && Intrinsics.f(this.f87792c, createSubaccount.f87792c);
        }

        public final int hashCode() {
            int iHashCode = this.f87790a.hashCode() * 31;
            String str = this.f87791b;
            return this.f87792c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = n.v(this.f87790a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeString(this.f87791b);
            Iterator itV2 = n.v(this.f87792c, dest);
            while (itV2.hasNext()) {
                dest.writeParcelable((Parcelable) itV2.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/v2/IncomeSorterFlowContract$Step$CreateTransfer;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/v2/IncomeSorterFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreateTransfer implements IncomeSorterFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CreateTransfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f87793a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xi0.b f87794b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Set f87795c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                xi0.b bVar = (xi0.b) parcel.readSerializable();
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iE = 0;
                while (iE != i) {
                    iE = com.revolut.data.database.models.openbanking.d.e(CreateTransfer.class, parcel, linkedHashSet, iE, 1);
                }
                return new CreateTransfer(string, bVar, linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreateTransfer[i];
            }
        }

        public CreateTransfer(String fundingPocketId, xi0.b targetCurrency, Set pendingSelectedDestinationIds) {
            Intrinsics.checkNotNullParameter(fundingPocketId, "fundingPocketId");
            Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
            Intrinsics.checkNotNullParameter(pendingSelectedDestinationIds, "pendingSelectedDestinationIds");
            this.f87793a = fundingPocketId;
            this.f87794b = targetCurrency;
            this.f87795c = pendingSelectedDestinationIds;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CreateTransfer)) {
                return false;
            }
            CreateTransfer createTransfer = (CreateTransfer) obj2;
            return Intrinsics.f(this.f87793a, createTransfer.f87793a) && Intrinsics.f(this.f87794b, createTransfer.f87794b) && Intrinsics.f(this.f87795c, createTransfer.f87795c);
        }

        public final int hashCode() {
            return this.f87795c.hashCode() + l.j(this.f87794b, this.f87793a.hashCode() * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87793a);
            dest.writeSerializable(this.f87794b);
            Iterator itV = n.v(this.f87795c, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/v2/IncomeSorterFlowContract$Step$DestinationsExecution;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/v2/IncomeSorterFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DestinationsExecution implements IncomeSorterFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DestinationsExecution> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f87796a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final IncomeSorterHomeContract$DestinationValue f87797b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final dj0.d f87798c;
        public final List d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iC = 0;
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(IncomeSorterHomeContract$DestinationValue.CREATOR, parcel, arrayList, iA, 1);
                }
                IncomeSorterHomeContract$DestinationValue incomeSorterHomeContract$DestinationValueCreateFromParcel = parcel.readInt() == 0 ? null : IncomeSorterHomeContract$DestinationValue.CREATOR.createFromParcel(parcel);
                dj0.d dVar = (dj0.d) parcel.readSerializable();
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                while (iC != i2) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList2, iC, 1);
                }
                return new DestinationsExecution(arrayList, incomeSorterHomeContract$DestinationValueCreateFromParcel, dVar, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DestinationsExecution[i];
            }
        }

        public DestinationsExecution(ArrayList destinations, IncomeSorterHomeContract$DestinationValue incomeSorterHomeContract$DestinationValue, dj0.d transactionAmount, List rates) {
            Intrinsics.checkNotNullParameter(destinations, "destinations");
            Intrinsics.checkNotNullParameter(transactionAmount, "transactionAmount");
            Intrinsics.checkNotNullParameter(rates, "rates");
            this.f87796a = destinations;
            this.f87797b = incomeSorterHomeContract$DestinationValue;
            this.f87798c = transactionAmount;
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
            if (!(obj2 instanceof DestinationsExecution)) {
                return false;
            }
            DestinationsExecution destinationsExecution = (DestinationsExecution) obj2;
            return this.f87796a.equals(destinationsExecution.f87796a) && Intrinsics.f(this.f87797b, destinationsExecution.f87797b) && Intrinsics.f(this.f87798c, destinationsExecution.f87798c) && Intrinsics.f(this.d, destinationsExecution.d);
        }

        public final int hashCode() {
            int iHashCode = this.f87796a.hashCode() * 31;
            IncomeSorterHomeContract$DestinationValue incomeSorterHomeContract$DestinationValue = this.f87797b;
            return this.d.hashCode() + v7.c((iHashCode + (incomeSorterHomeContract$DestinationValue == null ? 0 : incomeSorterHomeContract$DestinationValue.hashCode())) * 31, 31, this.f87798c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f87796a, dest);
            while (itY.hasNext()) {
                ((IncomeSorterHomeContract$DestinationValue) itY.next()).writeToParcel(dest, i);
            }
            IncomeSorterHomeContract$DestinationValue incomeSorterHomeContract$DestinationValue = this.f87797b;
            if (incomeSorterHomeContract$DestinationValue == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                incomeSorterHomeContract$DestinationValue.writeToParcel(dest, i);
            }
            dest.writeSerializable(this.f87798c);
            Iterator itV = p.a.v(this.d, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/v2/IncomeSorterFlowContract$Step$IncomeSorterDestinations;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/v2/IncomeSorterFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IncomeSorterDestinations implements IncomeSorterFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<IncomeSorterDestinations> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IncomeSorterFlowContract$SelectionMode f87799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xi0.b f87800b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IncomeSorterDestinations((IncomeSorterFlowContract$SelectionMode) parcel.readParcelable(IncomeSorterDestinations.class.getClassLoader()), (xi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IncomeSorterDestinations[i];
            }
        }

        public IncomeSorterDestinations(IncomeSorterFlowContract$SelectionMode selectionMode, xi0.b targetCurrency) {
            Intrinsics.checkNotNullParameter(selectionMode, "selectionMode");
            Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
            this.f87799a = selectionMode;
            this.f87800b = targetCurrency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof IncomeSorterDestinations)) {
                return false;
            }
            IncomeSorterDestinations incomeSorterDestinations = (IncomeSorterDestinations) obj2;
            return Intrinsics.f(this.f87799a, incomeSorterDestinations.f87799a) && Intrinsics.f(this.f87800b, incomeSorterDestinations.f87800b);
        }

        public final int hashCode() {
            return this.f87800b.hashCode() + (this.f87799a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f87799a, i);
            dest.writeSerializable(this.f87800b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/v2/IncomeSorterFlowContract$Step$IncomeSorterDetails;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/v2/IncomeSorterFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IncomeSorterDetails implements IncomeSorterFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<IncomeSorterDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IncomeSortersDetailsContract$InputData f87801a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IncomeSorterDetails(IncomeSortersDetailsContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IncomeSorterDetails[i];
            }
        }

        public IncomeSorterDetails(IncomeSortersDetailsContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f87801a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof IncomeSorterDetails) && Intrinsics.f(this.f87801a, ((IncomeSorterDetails) obj2).f87801a);
        }

        public final int hashCode() {
            return this.f87801a.f87742a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f87801a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/v2/IncomeSorterFlowContract$Step$IncomeSorterExecution;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/v2/IncomeSorterFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IncomeSorterExecution implements IncomeSorterFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<IncomeSorterExecution> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f87802a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IncomeSorterExecution(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IncomeSorterExecution[i];
            }
        }

        public IncomeSorterExecution(String executionId) {
            Intrinsics.checkNotNullParameter(executionId, "executionId");
            this.f87802a = executionId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof IncomeSorterExecution) && Intrinsics.f(this.f87802a, ((IncomeSorterExecution) obj2).f87802a);
        }

        public final int hashCode() {
            return this.f87802a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87802a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/v2/IncomeSorterFlowContract$Step$IncomeSortersList;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/v2/IncomeSorterFlowContract$Step;", "<init>", "()V", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IncomeSortersList implements IncomeSorterFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final IncomeSortersList f87803a = new IncomeSortersList();

        @NotNull
        public static final Parcelable.Creator<IncomeSortersList> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return IncomeSortersList.f87803a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IncomeSortersList[i];
            }
        }

        private IncomeSortersList() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/v2/IncomeSorterFlowContract$Step$Review;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/v2/IncomeSorterFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Review implements IncomeSorterFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Review> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final do3.n f87804a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f87805b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final RemainingBalanceDestination f87806c;
        public final a3 d;
        public final List e;
        public final i0 f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final IncomeSorterReviewContract$ReviewMode f87807g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                do3.n nVar = (do3.n) parcel.readSerializable();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iC = 0;
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(IncomeSorterHomeContract$DestinationValue.CREATOR, parcel, arrayList, iA, 1);
                }
                RemainingBalanceDestination remainingBalanceDestination = (RemainingBalanceDestination) parcel.readParcelable(Review.class.getClassLoader());
                a3 a3Var = (a3) parcel.readSerializable();
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                while (iC != i2) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList2, iC, 1);
                }
                return new Review(nVar, arrayList, remainingBalanceDestination, a3Var, arrayList2, i0.valueOf(parcel.readString()), (IncomeSorterReviewContract$ReviewMode) parcel.readParcelable(Review.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Review[i];
            }
        }

        public Review(do3.n user, ArrayList destinations, RemainingBalanceDestination remainingBalanceDestination, a3 transaction, List rates, i0 sortMethod, IncomeSorterReviewContract$ReviewMode reviewMode) {
            Intrinsics.checkNotNullParameter(user, "user");
            Intrinsics.checkNotNullParameter(destinations, "destinations");
            Intrinsics.checkNotNullParameter(remainingBalanceDestination, "remainingBalanceDestination");
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            Intrinsics.checkNotNullParameter(rates, "rates");
            Intrinsics.checkNotNullParameter(sortMethod, "sortMethod");
            Intrinsics.checkNotNullParameter(reviewMode, "reviewMode");
            this.f87804a = user;
            this.f87805b = destinations;
            this.f87806c = remainingBalanceDestination;
            this.d = transaction;
            this.e = rates;
            this.f = sortMethod;
            this.f87807g = reviewMode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Review)) {
                return false;
            }
            Review review = (Review) obj2;
            return Intrinsics.f(this.f87804a, review.f87804a) && this.f87805b.equals(review.f87805b) && Intrinsics.f(this.f87806c, review.f87806c) && Intrinsics.f(this.d, review.d) && Intrinsics.f(this.e, review.e) && this.f == review.f && Intrinsics.f(this.f87807g, review.f87807g);
        }

        public final int hashCode() {
            return this.f87807g.hashCode() + ((this.f.hashCode() + p.a.d(y.f(this.d, (this.f87806c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f87805b, this.f87804a.hashCode() * 31, 31)) * 31, 31), 31, this.e)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f87804a);
            Iterator itY = j6.a.y(this.f87805b, dest);
            while (itY.hasNext()) {
                ((IncomeSorterHomeContract$DestinationValue) itY.next()).writeToParcel(dest, i);
            }
            dest.writeParcelable(this.f87806c, i);
            dest.writeSerializable(this.d);
            Iterator itV = p.a.v(this.e, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
            dest.writeString(this.f.name());
            dest.writeParcelable(this.f87807g, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/v2/IncomeSorterFlowContract$Step$SelectIncome;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/v2/IncomeSorterFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectIncome implements IncomeSorterFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SelectIncome> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CategorisationFilter f87808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f87809b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                CategorisationFilter categorisationFilter = (CategorisationFilter) j6.a.f(parcel, "parcel", SelectIncome.class);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(SelectIncome.class, parcel, arrayList, iE, 1);
                }
                return new SelectIncome(categorisationFilter, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectIncome[i];
            }
        }

        public SelectIncome(CategorisationFilter filter, List analyticsAccounts) {
            Intrinsics.checkNotNullParameter(filter, "filter");
            Intrinsics.checkNotNullParameter(analyticsAccounts, "analyticsAccounts");
            this.f87808a = filter;
            this.f87809b = analyticsAccounts;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SelectIncome)) {
                return false;
            }
            SelectIncome selectIncome = (SelectIncome) obj2;
            return Intrinsics.f(this.f87808a, selectIncome.f87808a) && Intrinsics.f(this.f87809b, selectIncome.f87809b);
        }

        public final int hashCode() {
            return this.f87809b.hashCode() + (this.f87808a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f87808a, i);
            Iterator itV = p.a.v(this.f87809b, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }
}
