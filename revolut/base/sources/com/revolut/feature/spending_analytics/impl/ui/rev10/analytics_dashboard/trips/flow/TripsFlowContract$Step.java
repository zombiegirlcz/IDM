package com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.categorisation.api.model.CategorisationFilter;
import com.revolut.feature.core.model.domain.wallet.WalletId;
import com.revolut.feature.globe_resources.api.model.TripsMapBitmapConfig;
import com.revolut.feature.spending_analytics.impl.ui.rev10.group_details.GroupDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.api.trips.models.Trip;
import ehe.n;
import h30.l;
import ip0.v7;
import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/trips/flow/TripsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "CountryPicker", "List", "DatePicker", "EditOptions", "RemoveConfirmation", "SelectTransactions", "Share", "GroupDetails", "ManageCategories", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/trips/flow/TripsFlowContract$Step$CountryPicker;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/trips/flow/TripsFlowContract$Step$DatePicker;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/trips/flow/TripsFlowContract$Step$EditOptions;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/trips/flow/TripsFlowContract$Step$GroupDetails;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/trips/flow/TripsFlowContract$Step$List;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/trips/flow/TripsFlowContract$Step$ManageCategories;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/trips/flow/TripsFlowContract$Step$RemoveConfirmation;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/trips/flow/TripsFlowContract$Step$SelectTransactions;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/trips/flow/TripsFlowContract$Step$Share;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TripsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/trips/flow/TripsFlowContract$Step$DatePicker;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/trips/flow/TripsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DatePicker extends TripsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DatePicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Trip f87613a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f87614b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Trip trip = (Trip) j6.a.f(parcel, "parcel", DatePicker.class);
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iD = 0;
                while (iD != i) {
                    iD = v7.d(parcel, linkedHashSet, iD, 1);
                }
                return new DatePicker(trip, linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DatePicker[i];
            }
        }

        public DatePicker(Trip trip, Set excludedDates) {
            Intrinsics.checkNotNullParameter(trip, "trip");
            Intrinsics.checkNotNullParameter(excludedDates, "excludedDates");
            this.f87613a = trip;
            this.f87614b = excludedDates;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DatePicker)) {
                return false;
            }
            DatePicker datePicker = (DatePicker) obj2;
            return Intrinsics.f(this.f87613a, datePicker.f87613a) && Intrinsics.f(this.f87614b, datePicker.f87614b);
        }

        public final int hashCode() {
            return this.f87614b.hashCode() + (this.f87613a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f87613a, i);
            Iterator itV = n.v(this.f87614b, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/trips/flow/TripsFlowContract$Step$EditOptions;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/trips/flow/TripsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditOptions extends TripsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<EditOptions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Trip f87615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f87616b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CategorisationFilter f87617c;
        public final java.util.List d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Trip trip = (Trip) j6.a.f(parcel, "parcel", EditOptions.class);
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iD = 0;
                while (iD != i) {
                    iD = v7.d(parcel, linkedHashSet, iD, 1);
                }
                return new EditOptions(trip, linkedHashSet, (CategorisationFilter) parcel.readParcelable(EditOptions.class.getClassLoader()), parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditOptions[i];
            }
        }

        public EditOptions(Trip trip, Set excludedDates, CategorisationFilter categorisationFilter, java.util.List actuallyIncludedTransactions) {
            Intrinsics.checkNotNullParameter(trip, "trip");
            Intrinsics.checkNotNullParameter(excludedDates, "excludedDates");
            Intrinsics.checkNotNullParameter(categorisationFilter, "categorisationFilter");
            Intrinsics.checkNotNullParameter(actuallyIncludedTransactions, "actuallyIncludedTransactions");
            this.f87615a = trip;
            this.f87616b = excludedDates;
            this.f87617c = categorisationFilter;
            this.d = actuallyIncludedTransactions;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EditOptions)) {
                return false;
            }
            EditOptions editOptions = (EditOptions) obj2;
            return Intrinsics.f(this.f87615a, editOptions.f87615a) && Intrinsics.f(this.f87616b, editOptions.f87616b) && Intrinsics.f(this.f87617c, editOptions.f87617c) && Intrinsics.f(this.d, editOptions.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.f87617c.hashCode() + p.a.f(this.f87615a.hashCode() * 31, 31, this.f87616b)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f87615a, i);
            Iterator itV = n.v(this.f87616b, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
            dest.writeParcelable(this.f87617c, i);
            dest.writeStringList(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/trips/flow/TripsFlowContract$Step$GroupDetails;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/trips/flow/TripsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GroupDetails extends TripsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<GroupDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GroupDetailsScreenContract$InputData f87618a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GroupDetails(GroupDetailsScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GroupDetails[i];
            }
        }

        public GroupDetails(GroupDetailsScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f87618a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof GroupDetails) && Intrinsics.f(this.f87618a, ((GroupDetails) obj2).f87618a);
        }

        public final int hashCode() {
            return this.f87618a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f87618a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/trips/flow/TripsFlowContract$Step$List;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/trips/flow/TripsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class List extends TripsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<List> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f87619a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new List(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new List[i];
            }
        }

        public List(String str) {
            this.f87619a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof List) && Intrinsics.f(this.f87619a, ((List) obj2).f87619a);
        }

        public final int hashCode() {
            String str = this.f87619a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87619a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/trips/flow/TripsFlowContract$Step$ManageCategories;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/trips/flow/TripsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ManageCategories extends TripsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ManageCategories> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f87620a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ManageCategories(((WalletId) parcel.readParcelable(ManageCategories.class.getClassLoader())).f66106a);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ManageCategories[i];
            }
        }

        public ManageCategories(String walletId) {
            Intrinsics.checkNotNullParameter(walletId, "walletId");
            this.f87620a = walletId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ManageCategories) && Intrinsics.f(this.f87620a, ((ManageCategories) obj2).f87620a);
        }

        public final int hashCode() {
            return this.f87620a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(new WalletId(this.f87620a), i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/trips/flow/TripsFlowContract$Step$RemoveConfirmation;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/trips/flow/TripsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RemoveConfirmation extends TripsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<RemoveConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Trip f87621a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RemoveConfirmation((Trip) parcel.readParcelable(RemoveConfirmation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RemoveConfirmation[i];
            }
        }

        public RemoveConfirmation(Trip trip) {
            Intrinsics.checkNotNullParameter(trip, "trip");
            this.f87621a = trip;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RemoveConfirmation) && Intrinsics.f(this.f87621a, ((RemoveConfirmation) obj2).f87621a);
        }

        public final int hashCode() {
            return this.f87621a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f87621a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/trips/flow/TripsFlowContract$Step$SelectTransactions;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/trips/flow/TripsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectTransactions extends TripsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SelectTransactions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Trip f87622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CategorisationFilter f87623b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final java.util.List f87624c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelectTransactions((Trip) parcel.readParcelable(SelectTransactions.class.getClassLoader()), (CategorisationFilter) parcel.readParcelable(SelectTransactions.class.getClassLoader()), parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectTransactions[i];
            }
        }

        public SelectTransactions(Trip trip, CategorisationFilter categorisationFilter, java.util.List actuallyIncludedTransactions) {
            Intrinsics.checkNotNullParameter(trip, "trip");
            Intrinsics.checkNotNullParameter(categorisationFilter, "categorisationFilter");
            Intrinsics.checkNotNullParameter(actuallyIncludedTransactions, "actuallyIncludedTransactions");
            this.f87622a = trip;
            this.f87623b = categorisationFilter;
            this.f87624c = actuallyIncludedTransactions;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SelectTransactions)) {
                return false;
            }
            SelectTransactions selectTransactions = (SelectTransactions) obj2;
            return Intrinsics.f(this.f87622a, selectTransactions.f87622a) && Intrinsics.f(this.f87623b, selectTransactions.f87623b) && Intrinsics.f(this.f87624c, selectTransactions.f87624c);
        }

        public final int hashCode() {
            return this.f87624c.hashCode() + ((this.f87623b.hashCode() + (this.f87622a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f87622a, i);
            dest.writeParcelable(this.f87623b, i);
            dest.writeStringList(this.f87624c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/trips/flow/TripsFlowContract$Step$Share;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/trips/flow/TripsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Share extends TripsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Share> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f87625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f87626b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ZonedDateTime f87627c;
        public final TripsMapBitmapConfig d;
        public final int e;
        public final Set f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iD = 0;
                int iD2 = 0;
                while (iD2 != i) {
                    iD2 = v7.d(parcel, linkedHashSet, iD2, 1);
                }
                String string = parcel.readString();
                ZonedDateTime zonedDateTime = (ZonedDateTime) parcel.readSerializable();
                TripsMapBitmapConfig tripsMapBitmapConfig = (TripsMapBitmapConfig) parcel.readParcelable(Share.class.getClassLoader());
                int i2 = parcel.readInt();
                int i3 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i3);
                while (iD != i3) {
                    iD = v7.d(parcel, linkedHashSet2, iD, 1);
                }
                return new Share(linkedHashSet, string, zonedDateTime, tripsMapBitmapConfig, i2, linkedHashSet2);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Share[i];
            }
        }

        public Share(Set visitedCountries, String userName, ZonedDateTime joinDate, TripsMapBitmapConfig bitmapConfig, int i, Set allCountryCodes) {
            Intrinsics.checkNotNullParameter(visitedCountries, "visitedCountries");
            Intrinsics.checkNotNullParameter(userName, "userName");
            Intrinsics.checkNotNullParameter(joinDate, "joinDate");
            Intrinsics.checkNotNullParameter(bitmapConfig, "bitmapConfig");
            Intrinsics.checkNotNullParameter(allCountryCodes, "allCountryCodes");
            this.f87625a = visitedCountries;
            this.f87626b = userName;
            this.f87627c = joinDate;
            this.d = bitmapConfig;
            this.e = i;
            this.f = allCountryCodes;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Share)) {
                return false;
            }
            Share share = (Share) obj2;
            return Intrinsics.f(this.f87625a, share.f87625a) && Intrinsics.f(this.f87626b, share.f87626b) && Intrinsics.f(this.f87627c, share.f87627c) && Intrinsics.f(this.d, share.d) && this.e == share.e && Intrinsics.f(this.f, share.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + j6.a.b(this.e, (this.d.hashCode() + l.h(this.f87627c, p.a.c(this.f87625a.hashCode() * 31, 31, this.f87626b), 31)) * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = n.v(this.f87625a, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
            dest.writeString(this.f87626b);
            dest.writeSerializable(this.f87627c);
            dest.writeParcelable(this.d, i);
            dest.writeInt(this.e);
            Iterator itV2 = n.v(this.f, dest);
            while (itV2.hasNext()) {
                dest.writeSerializable((Serializable) itV2.next());
            }
        }
    }

    private TripsFlowContract$Step() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/trips/flow/TripsFlowContract$Step$CountryPicker;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/trips/flow/TripsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CountryPicker extends TripsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CountryPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f87612a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashMap2.put(parcel.readSerializable(), Integer.valueOf(parcel.readInt()));
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new CountryPicker(linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CountryPicker[i];
            }
        }

        public CountryPicker(LinkedHashMap linkedHashMap) {
            this.f87612a = linkedHashMap;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CountryPicker) && Intrinsics.f(this.f87612a, ((CountryPicker) obj2).f87612a);
        }

        public final int hashCode() {
            Map map = this.f87612a;
            if (map == null) {
                return 0;
            }
            return map.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Map map = this.f87612a;
            if (map == null) {
                dest.writeInt(0);
                return;
            }
            Iterator itV = l.v(dest, 1, map);
            while (itV.hasNext()) {
                Map.Entry entry = (Map.Entry) itV.next();
                dest.writeSerializable((Serializable) entry.getKey());
                dest.writeInt(((Number) entry.getValue()).intValue());
            }
        }

        public CountryPicker() {
            this(null);
        }
    }
}
