package com.revolut.feature.donations.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import ba6.u;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.core.navigation.ActivityAnimation;
import dj0.d;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/revolut/feature/donations/api/navigation/DonationsKompotFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "CharitiesOverview", "Charity", "RecurringDonation", "CharitiesOverviewDestination", "CollectionDestination", "CharityDestination", "RecurringDonationDestination", "CharityNotFoundDestination", "AmountSuggestionDestination", "OneTimeDonationDestination", "Lcom/revolut/feature/donations/api/navigation/DonationsKompotFeatureConfig$CharitiesOverview;", "Lcom/revolut/feature/donations/api/navigation/DonationsKompotFeatureConfig$Charity;", "Lcom/revolut/feature/donations/api/navigation/DonationsKompotFeatureConfig$RecurringDonation;", "feature_donations_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class DonationsKompotFeatureConfig extends KompotBridgeFeatureConfig {

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/donations/api/navigation/DonationsKompotFeatureConfig$AmountSuggestionDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_donations_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AmountSuggestionDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<AmountSuggestionDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f71973a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u f71974b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map f71975c;

        /* JADX INFO: loaded from: classes3.dex */
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
                return new AmountSuggestionDestination(string, uVarValueOf, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AmountSuggestionDestination[i];
            }
        }

        public AmountSuggestionDestination(String charityId, u donationMode, Map parameters) {
            Intrinsics.checkNotNullParameter(charityId, "charityId");
            Intrinsics.checkNotNullParameter(donationMode, "donationMode");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.f71973a = charityId;
            this.f71974b = donationMode;
            this.f71975c = parameters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AmountSuggestionDestination)) {
                return false;
            }
            AmountSuggestionDestination amountSuggestionDestination = (AmountSuggestionDestination) obj2;
            return Intrinsics.f(this.f71973a, amountSuggestionDestination.f71973a) && this.f71974b == amountSuggestionDestination.f71974b && Intrinsics.f(this.f71975c, amountSuggestionDestination.f71975c);
        }

        public final int hashCode() {
            return this.f71975c.hashCode() + ((this.f71974b.hashCode() + (this.f71973a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71973a);
            dest.writeString(this.f71974b.name());
            Iterator itZ = j6.a.z(this.f71975c, dest);
            while (itZ.hasNext()) {
                Map.Entry entry = (Map.Entry) itZ.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/donations/api/navigation/DonationsKompotFeatureConfig$CharitiesOverview;", "Lcom/revolut/feature/donations/api/navigation/DonationsKompotFeatureConfig;", "<init>", "()V", "feature_donations_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CharitiesOverview extends DonationsKompotFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final CharitiesOverview f71976g = new CharitiesOverview();

        @NotNull
        public static final Parcelable.Creator<CharitiesOverview> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CharitiesOverview.f71976g;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CharitiesOverview[i];
            }
        }

        private CharitiesOverview() {
            super(new CharitiesOverviewDestination(null));
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/donations/api/navigation/DonationsKompotFeatureConfig$Charity;", "Lcom/revolut/feature/donations/api/navigation/DonationsKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_donations_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Charity extends DonationsKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Charity> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f71978g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ActivityAnimation f71979h;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Charity(parcel.readString(), (ActivityAnimation) parcel.readParcelable(Charity.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Charity[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Charity(String charityId, ActivityAnimation activityAnimation) {
            super(new CharityDestination(charityId));
            Intrinsics.checkNotNullParameter(charityId, "charityId");
            this.f71978g = charityId;
            this.f71979h = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF71979h() {
            return this.f71979h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Charity)) {
                return false;
            }
            Charity charity = (Charity) obj2;
            return Intrinsics.f(this.f71978g, charity.f71978g) && Intrinsics.f(this.f71979h, charity.f71979h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f71978g.hashCode() * 31;
            ActivityAnimation activityAnimation = this.f71979h;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71978g);
            dest.writeParcelable(this.f71979h, i);
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/donations/api/navigation/DonationsKompotFeatureConfig$CharityDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_donations_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CharityDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<CharityDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f71980a;

        /* JADX INFO: loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CharityDestination(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CharityDestination[i];
            }
        }

        public CharityDestination(String charityId) {
            Intrinsics.checkNotNullParameter(charityId, "charityId");
            this.f71980a = charityId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CharityDestination) && Intrinsics.f(this.f71980a, ((CharityDestination) obj2).f71980a);
        }

        public final int hashCode() {
            return this.f71980a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71980a);
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/donations/api/navigation/DonationsKompotFeatureConfig$CharityNotFoundDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_donations_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CharityNotFoundDestination implements KompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CharityNotFoundDestination f71981a = new CharityNotFoundDestination();

        @NotNull
        public static final Parcelable.Creator<CharityNotFoundDestination> CREATOR = new a();

        /* JADX INFO: loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CharityNotFoundDestination.f71981a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CharityNotFoundDestination[i];
            }
        }

        private CharityNotFoundDestination() {
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

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/donations/api/navigation/DonationsKompotFeatureConfig$CollectionDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_donations_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CollectionDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<CollectionDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f71982a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f71983b;

        /* JADX INFO: loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CollectionDestination(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CollectionDestination[i];
            }
        }

        public CollectionDestination(String collectionId, boolean z) {
            Intrinsics.checkNotNullParameter(collectionId, "collectionId");
            this.f71982a = collectionId;
            this.f71983b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CollectionDestination)) {
                return false;
            }
            CollectionDestination collectionDestination = (CollectionDestination) obj2;
            return Intrinsics.f(this.f71982a, collectionDestination.f71982a) && this.f71983b == collectionDestination.f71983b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f71983b) + (this.f71982a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71982a);
            dest.writeInt(this.f71983b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/donations/api/navigation/DonationsKompotFeatureConfig$OneTimeDonationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_donations_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OneTimeDonationDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<OneTimeDonationDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f71984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u f71985b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f71986c;
        public final Map d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                u uVarValueOf = u.valueOf(parcel.readString());
                d dVar = (d) parcel.readSerializable();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new OneTimeDonationDestination(uVarValueOf, dVar, string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OneTimeDonationDestination[i];
            }
        }

        public OneTimeDonationDestination(u donationMode, d dVar, String charityId, Map parameters) {
            Intrinsics.checkNotNullParameter(charityId, "charityId");
            Intrinsics.checkNotNullParameter(donationMode, "donationMode");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.f71984a = charityId;
            this.f71985b = donationMode;
            this.f71986c = dVar;
            this.d = parameters;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF71984a() {
            return this.f71984a;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final u getF71985b() {
            return this.f71985b;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final d getF71986c() {
            return this.f71986c;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Map getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OneTimeDonationDestination)) {
                return false;
            }
            OneTimeDonationDestination oneTimeDonationDestination = (OneTimeDonationDestination) obj2;
            return Intrinsics.f(this.f71984a, oneTimeDonationDestination.f71984a) && this.f71985b == oneTimeDonationDestination.f71985b && Intrinsics.f(this.f71986c, oneTimeDonationDestination.f71986c) && Intrinsics.f(this.d, oneTimeDonationDestination.d);
        }

        public final int hashCode() {
            int iHashCode = (this.f71985b.hashCode() + (this.f71984a.hashCode() * 31)) * 31;
            d dVar = this.f71986c;
            return this.d.hashCode() + ((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71984a);
            dest.writeString(this.f71985b.name());
            dest.writeSerializable(this.f71986c);
            Iterator itZ = j6.a.z(this.d, dest);
            while (itZ.hasNext()) {
                Map.Entry entry = (Map.Entry) itZ.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/donations/api/navigation/DonationsKompotFeatureConfig$RecurringDonation;", "Lcom/revolut/feature/donations/api/navigation/DonationsKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_donations_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RecurringDonation extends DonationsKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<RecurringDonation> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f71987g;

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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecurringDonation(String charityId) {
            super(new RecurringDonationDestination(charityId));
            Intrinsics.checkNotNullParameter(charityId, "charityId");
            this.f71987g = charityId;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RecurringDonation) && Intrinsics.f(this.f71987g, ((RecurringDonation) obj2).f71987g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f71987g.hashCode();
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71987g);
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/donations/api/navigation/DonationsKompotFeatureConfig$RecurringDonationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_donations_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RecurringDonationDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<RecurringDonationDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f71988a;

        /* JADX INFO: loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RecurringDonationDestination(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RecurringDonationDestination[i];
            }
        }

        public RecurringDonationDestination(String charityId) {
            Intrinsics.checkNotNullParameter(charityId, "charityId");
            this.f71988a = charityId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RecurringDonationDestination) && Intrinsics.f(this.f71988a, ((RecurringDonationDestination) obj2).f71988a);
        }

        public final int hashCode() {
            return this.f71988a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71988a);
        }
    }

    public DonationsKompotFeatureConfig(KompotDestination kompotDestination) {
        super((ActivityAnimation) null, (ParcelableDestination) kompotDestination, false, (Integer) null, 0, 60);
    }

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/donations/api/navigation/DonationsKompotFeatureConfig$CharitiesOverviewDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_donations_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CharitiesOverviewDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<CharitiesOverviewDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TransitionAnimation f71977a;

        /* JADX INFO: loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CharitiesOverviewDestination((TransitionAnimation) parcel.readParcelable(CharitiesOverviewDestination.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CharitiesOverviewDestination[i];
            }
        }

        public CharitiesOverviewDestination(TransitionAnimation transitionAnimation) {
            this.f71977a = transitionAnimation;
        }

        @Override // aii.d0
        /* JADX INFO: renamed from: Y0, reason: from getter */
        public final TransitionAnimation getF71977a() {
            return this.f71977a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CharitiesOverviewDestination) && Intrinsics.f(this.f71977a, ((CharitiesOverviewDestination) obj2).f71977a);
        }

        public final int hashCode() {
            TransitionAnimation transitionAnimation = this.f71977a;
            if (transitionAnimation == null) {
                return 0;
            }
            return transitionAnimation.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f71977a, i);
        }

        public CharitiesOverviewDestination() {
            this(null);
        }
    }
}
