package com.revolut.feature.donations.impl.ui.kompot.flow.root;

import android.os.Parcel;
import android.os.Parcelable;
import ba6.u;
import com.revolut.feature.donations.impl.domain.model.CharityTransactionsParams;
import com.revolut.kompot.navigable.flow.FlowStep;
import dj0.d;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"com/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Overview", "CharityDetails", "CharitiesCollectionDetails", "CharitiesCollectionNotFound", "CharityNotFound", "RecurringDonation", "AmountSuggestion", "OneTimeDonation", "Transactions", "Lcom/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$Step$AmountSuggestion;", "Lcom/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$Step$CharitiesCollectionDetails;", "Lcom/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$Step$CharitiesCollectionNotFound;", "Lcom/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$Step$CharityDetails;", "Lcom/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$Step$CharityNotFound;", "Lcom/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$Step$OneTimeDonation;", "Lcom/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$Step$Overview;", "Lcom/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$Step$RecurringDonation;", "Lcom/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$Step$Transactions;", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class DonationsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$Step$AmountSuggestion;", "Lcom/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AmountSuggestion extends DonationsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AmountSuggestion> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72040a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u f72041b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map f72042c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                u uVarValueOf = u.valueOf(parcel.readString());
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new AmountSuggestion(string, uVarValueOf, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AmountSuggestion[i];
            }
        }

        public AmountSuggestion(String charityId, u donationMode, Map parameters) {
            Intrinsics.checkNotNullParameter(charityId, "charityId");
            Intrinsics.checkNotNullParameter(donationMode, "donationMode");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.f72040a = charityId;
            this.f72041b = donationMode;
            this.f72042c = parameters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AmountSuggestion)) {
                return false;
            }
            AmountSuggestion amountSuggestion = (AmountSuggestion) obj2;
            return Intrinsics.f(this.f72040a, amountSuggestion.f72040a) && this.f72041b == amountSuggestion.f72041b && Intrinsics.f(this.f72042c, amountSuggestion.f72042c);
        }

        public final int hashCode() {
            return this.f72042c.hashCode() + ((this.f72041b.hashCode() + (this.f72040a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72040a);
            dest.writeString(this.f72041b.name());
            Iterator itZ = j6.a.z(this.f72042c, dest);
            while (itZ.hasNext()) {
                Map.Entry entry = (Map.Entry) itZ.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$Step$CharitiesCollectionDetails;", "Lcom/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CharitiesCollectionDetails extends DonationsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CharitiesCollectionDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72043a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f72044b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CharitiesCollectionDetails(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CharitiesCollectionDetails[i];
            }
        }

        public CharitiesCollectionDetails(String collectionId, boolean z) {
            Intrinsics.checkNotNullParameter(collectionId, "collectionId");
            this.f72043a = collectionId;
            this.f72044b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CharitiesCollectionDetails)) {
                return false;
            }
            CharitiesCollectionDetails charitiesCollectionDetails = (CharitiesCollectionDetails) obj2;
            return Intrinsics.f(this.f72043a, charitiesCollectionDetails.f72043a) && this.f72044b == charitiesCollectionDetails.f72044b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f72044b) + (this.f72043a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72043a);
            dest.writeInt(this.f72044b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$Step$CharitiesCollectionNotFound;", "Lcom/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$Step;", "<init>", "()V", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CharitiesCollectionNotFound extends DonationsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CharitiesCollectionNotFound f72045a = new CharitiesCollectionNotFound();

        @NotNull
        public static final Parcelable.Creator<CharitiesCollectionNotFound> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CharitiesCollectionNotFound.f72045a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CharitiesCollectionNotFound[i];
            }
        }

        private CharitiesCollectionNotFound() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$Step$CharityDetails;", "Lcom/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CharityDetails extends DonationsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CharityDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72046a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CharityDetails(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CharityDetails[i];
            }
        }

        public CharityDetails(String charityId) {
            Intrinsics.checkNotNullParameter(charityId, "charityId");
            this.f72046a = charityId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CharityDetails) && Intrinsics.f(this.f72046a, ((CharityDetails) obj2).f72046a);
        }

        public final int hashCode() {
            return this.f72046a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72046a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$Step$CharityNotFound;", "Lcom/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$Step;", "<init>", "()V", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CharityNotFound extends DonationsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CharityNotFound f72047a = new CharityNotFound();

        @NotNull
        public static final Parcelable.Creator<CharityNotFound> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CharityNotFound.f72047a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CharityNotFound[i];
            }
        }

        private CharityNotFound() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$Step$OneTimeDonation;", "Lcom/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OneTimeDonation extends DonationsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<OneTimeDonation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72048a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u f72049b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map f72050c;
        public final d d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                u uVarValueOf = u.valueOf(parcel.readString());
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new OneTimeDonation(uVarValueOf, (d) parcel.readSerializable(), string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OneTimeDonation[i];
            }
        }

        public OneTimeDonation(u donationMode, d dVar, String charityId, Map parameters) {
            Intrinsics.checkNotNullParameter(charityId, "charityId");
            Intrinsics.checkNotNullParameter(donationMode, "donationMode");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.f72048a = charityId;
            this.f72049b = donationMode;
            this.f72050c = parameters;
            this.d = dVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OneTimeDonation)) {
                return false;
            }
            OneTimeDonation oneTimeDonation = (OneTimeDonation) obj2;
            return Intrinsics.f(this.f72048a, oneTimeDonation.f72048a) && this.f72049b == oneTimeDonation.f72049b && Intrinsics.f(this.f72050c, oneTimeDonation.f72050c) && Intrinsics.f(this.d, oneTimeDonation.d);
        }

        public final int hashCode() {
            int iE = p.a.e((this.f72049b.hashCode() + (this.f72048a.hashCode() * 31)) * 31, 31, this.f72050c);
            d dVar = this.d;
            return iE + (dVar == null ? 0 : dVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72048a);
            dest.writeString(this.f72049b.name());
            Iterator itZ = j6.a.z(this.f72050c, dest);
            while (itZ.hasNext()) {
                Map.Entry entry = (Map.Entry) itZ.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
            dest.writeSerializable(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$Step$Overview;", "Lcom/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$Step;", "<init>", "()V", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Overview extends DonationsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Overview f72051a = new Overview();

        @NotNull
        public static final Parcelable.Creator<Overview> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Overview.f72051a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Overview[i];
            }
        }

        private Overview() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$Step$RecurringDonation;", "Lcom/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RecurringDonation extends DonationsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<RecurringDonation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72052a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RecurringDonation(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RecurringDonation[i];
            }
        }

        public RecurringDonation(String charityId) {
            Intrinsics.checkNotNullParameter(charityId, "charityId");
            this.f72052a = charityId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RecurringDonation) && Intrinsics.f(this.f72052a, ((RecurringDonation) obj2).f72052a);
        }

        public final int hashCode() {
            return this.f72052a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72052a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$Step$Transactions;", "Lcom/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Transactions extends DonationsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Transactions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CharityTransactionsParams f72053a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Transactions(CharityTransactionsParams.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Transactions[i];
            }
        }

        public Transactions(CharityTransactionsParams params) {
            Intrinsics.checkNotNullParameter(params, "params");
            this.f72053a = params;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Transactions) && Intrinsics.f(this.f72053a, ((Transactions) obj2).f72053a);
        }

        public final int hashCode() {
            return this.f72053a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f72053a.writeToParcel(dest, i);
        }
    }

    private DonationsFlowContract$Step() {
    }
}
