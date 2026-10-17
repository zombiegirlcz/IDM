package com.revolut.feature.donations.impl.ui.kompot.flow.root;

import android.os.Parcel;
import android.os.Parcelable;
import ba6.u;
import com.revolut.kompot.common.IOData$Input;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"com/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "Overview", "CharityDetails", "CharitiesCollectionDetails", "RecurringDonation", "AmountSuggestion", "CharityNotFound", "CharitiesCollectionNotFound", "Lcom/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$InputData$AmountSuggestion;", "Lcom/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$InputData$CharitiesCollectionDetails;", "Lcom/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$InputData$CharitiesCollectionNotFound;", "Lcom/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$InputData$CharityDetails;", "Lcom/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$InputData$CharityNotFound;", "Lcom/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$InputData$Overview;", "Lcom/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$InputData$RecurringDonation;", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class DonationsFlowContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$InputData$AmountSuggestion;", "Lcom/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AmountSuggestion extends DonationsFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<AmountSuggestion> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u f72031b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map f72032c;

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
            this.f72030a = charityId;
            this.f72031b = donationMode;
            this.f72032c = parameters;
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
            return Intrinsics.f(this.f72030a, amountSuggestion.f72030a) && this.f72031b == amountSuggestion.f72031b && Intrinsics.f(this.f72032c, amountSuggestion.f72032c);
        }

        public final int hashCode() {
            return this.f72032c.hashCode() + ((this.f72031b.hashCode() + (this.f72030a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72030a);
            dest.writeString(this.f72031b.name());
            Iterator itZ = j6.a.z(this.f72032c, dest);
            while (itZ.hasNext()) {
                Map.Entry entry = (Map.Entry) itZ.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$InputData$CharitiesCollectionDetails;", "Lcom/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CharitiesCollectionDetails extends DonationsFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<CharitiesCollectionDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f72034b;

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
            this.f72033a = collectionId;
            this.f72034b = z;
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
            return Intrinsics.f(this.f72033a, charitiesCollectionDetails.f72033a) && this.f72034b == charitiesCollectionDetails.f72034b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f72034b) + (this.f72033a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72033a);
            dest.writeInt(this.f72034b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$InputData$CharitiesCollectionNotFound;", "Lcom/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$InputData;", "<init>", "()V", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CharitiesCollectionNotFound extends DonationsFlowContract$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CharitiesCollectionNotFound f72035a = new CharitiesCollectionNotFound();

        @NotNull
        public static final Parcelable.Creator<CharitiesCollectionNotFound> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CharitiesCollectionNotFound.f72035a;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$InputData$CharityDetails;", "Lcom/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CharityDetails extends DonationsFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<CharityDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72036a;

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
            this.f72036a = charityId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CharityDetails) && Intrinsics.f(this.f72036a, ((CharityDetails) obj2).f72036a);
        }

        public final int hashCode() {
            return this.f72036a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72036a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$InputData$CharityNotFound;", "Lcom/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$InputData;", "<init>", "()V", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CharityNotFound extends DonationsFlowContract$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CharityNotFound f72037a = new CharityNotFound();

        @NotNull
        public static final Parcelable.Creator<CharityNotFound> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CharityNotFound.f72037a;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$InputData$Overview;", "Lcom/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$InputData;", "<init>", "()V", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Overview extends DonationsFlowContract$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Overview f72038a = new Overview();

        @NotNull
        public static final Parcelable.Creator<Overview> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Overview.f72038a;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$InputData$RecurringDonation;", "Lcom/revolut/feature/donations/impl/ui/kompot/flow/root/DonationsFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RecurringDonation extends DonationsFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<RecurringDonation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72039a;

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
            this.f72039a = charityId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RecurringDonation) && Intrinsics.f(this.f72039a, ((RecurringDonation) obj2).f72039a);
        }

        public final int hashCode() {
            return this.f72039a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72039a);
        }
    }

    private DonationsFlowContract$InputData() {
    }
}
