package com.revolut.feature.freelancer.impl.ui.profile;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.freelancer.common.models.FreelancerProfileSettings;
import com.revolut.feature.freelancer.common.models.tax_hub.FreelancerTaxProfile;
import com.revolut.kompot.navigable.flow.FlowStep;
import ds6.j;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\r\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\r\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"com/revolut/feature/freelancer/impl/ui/profile/FreelancerProfileFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Profile", "Email", "Website", "TradingName", "Vat", "VatPrompt", "VatReminder", "MerchantTerms", "PaymentProcessingFees", "Account", "Taxes", "TaxProfile", "InvoiceSettings", "Lcom/revolut/feature/freelancer/impl/ui/profile/FreelancerProfileFlowContract$Step$Account;", "Lcom/revolut/feature/freelancer/impl/ui/profile/FreelancerProfileFlowContract$Step$Email;", "Lcom/revolut/feature/freelancer/impl/ui/profile/FreelancerProfileFlowContract$Step$InvoiceSettings;", "Lcom/revolut/feature/freelancer/impl/ui/profile/FreelancerProfileFlowContract$Step$MerchantTerms;", "Lcom/revolut/feature/freelancer/impl/ui/profile/FreelancerProfileFlowContract$Step$PaymentProcessingFees;", "Lcom/revolut/feature/freelancer/impl/ui/profile/FreelancerProfileFlowContract$Step$Profile;", "Lcom/revolut/feature/freelancer/impl/ui/profile/FreelancerProfileFlowContract$Step$TaxProfile;", "Lcom/revolut/feature/freelancer/impl/ui/profile/FreelancerProfileFlowContract$Step$Taxes;", "Lcom/revolut/feature/freelancer/impl/ui/profile/FreelancerProfileFlowContract$Step$TradingName;", "Lcom/revolut/feature/freelancer/impl/ui/profile/FreelancerProfileFlowContract$Step$Vat;", "Lcom/revolut/feature/freelancer/impl/ui/profile/FreelancerProfileFlowContract$Step$VatPrompt;", "Lcom/revolut/feature/freelancer/impl/ui/profile/FreelancerProfileFlowContract$Step$VatReminder;", "Lcom/revolut/feature/freelancer/impl/ui/profile/FreelancerProfileFlowContract$Step$Website;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class FreelancerProfileFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/profile/FreelancerProfileFlowContract$Step$Account;", "Lcom/revolut/feature/freelancer/impl/ui/profile/FreelancerProfileFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Account extends FreelancerProfileFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Account> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FreelancerProfileSettings f74016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FreelancerTaxProfile f74017b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Account((FreelancerProfileSettings) parcel.readParcelable(Account.class.getClassLoader()), (FreelancerTaxProfile) parcel.readParcelable(Account.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Account[i];
            }
        }

        public Account(FreelancerProfileSettings freelancerProfileSettings, FreelancerTaxProfile freelancerTaxProfile) {
            this.f74016a = freelancerProfileSettings;
            this.f74017b = freelancerTaxProfile;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Account)) {
                return false;
            }
            Account account = (Account) obj2;
            return Intrinsics.f(this.f74016a, account.f74016a) && Intrinsics.f(this.f74017b, account.f74017b);
        }

        public final int hashCode() {
            FreelancerProfileSettings freelancerProfileSettings = this.f74016a;
            int iHashCode = (freelancerProfileSettings == null ? 0 : freelancerProfileSettings.hashCode()) * 31;
            FreelancerTaxProfile freelancerTaxProfile = this.f74017b;
            return iHashCode + (freelancerTaxProfile != null ? freelancerTaxProfile.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f74016a, i);
            dest.writeParcelable(this.f74017b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/profile/FreelancerProfileFlowContract$Step$Email;", "Lcom/revolut/feature/freelancer/impl/ui/profile/FreelancerProfileFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Email extends FreelancerProfileFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Email> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f74018a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Email(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Email[i];
            }
        }

        public Email(String str) {
            this.f74018a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Email) && Intrinsics.f(this.f74018a, ((Email) obj2).f74018a);
        }

        public final int hashCode() {
            String str = this.f74018a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f74018a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/profile/FreelancerProfileFlowContract$Step$InvoiceSettings;", "Lcom/revolut/feature/freelancer/impl/ui/profile/FreelancerProfileFlowContract$Step;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class InvoiceSettings extends FreelancerProfileFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InvoiceSettings f74019a = new InvoiceSettings();

        @NotNull
        public static final Parcelable.Creator<InvoiceSettings> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return InvoiceSettings.f74019a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InvoiceSettings[i];
            }
        }

        private InvoiceSettings() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/profile/FreelancerProfileFlowContract$Step$MerchantTerms;", "Lcom/revolut/feature/freelancer/impl/ui/profile/FreelancerProfileFlowContract$Step;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MerchantTerms extends FreelancerProfileFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MerchantTerms f74020a = new MerchantTerms();

        @NotNull
        public static final Parcelable.Creator<MerchantTerms> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MerchantTerms.f74020a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MerchantTerms[i];
            }
        }

        private MerchantTerms() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/profile/FreelancerProfileFlowContract$Step$PaymentProcessingFees;", "Lcom/revolut/feature/freelancer/impl/ui/profile/FreelancerProfileFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentProcessingFees extends FreelancerProfileFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PaymentProcessingFees> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f74021a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashSet.add(as6.a.valueOf(parcel.readString()));
                }
                return new PaymentProcessingFees(linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentProcessingFees[i];
            }
        }

        public PaymentProcessingFees() {
            this(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PaymentProcessingFees) && Intrinsics.f(this.f74021a, ((PaymentProcessingFees) obj2).f74021a);
        }

        public final int hashCode() {
            return this.f74021a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = n.v(this.f74021a, dest);
            while (itV.hasNext()) {
                dest.writeString(((as6.a) itV.next()).name());
            }
        }

        public PaymentProcessingFees(Set includedGroupTypes) {
            Intrinsics.checkNotNullParameter(includedGroupTypes, "includedGroupTypes");
            this.f74021a = includedGroupTypes;
        }

        public /* synthetic */ PaymentProcessingFees(int i) {
            this(d0.i1(as6.a.a()));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/profile/FreelancerProfileFlowContract$Step$Profile;", "Lcom/revolut/feature/freelancer/impl/ui/profile/FreelancerProfileFlowContract$Step;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Profile extends FreelancerProfileFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Profile f74022a = new Profile();

        @NotNull
        public static final Parcelable.Creator<Profile> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Profile.f74022a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Profile[i];
            }
        }

        private Profile() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/profile/FreelancerProfileFlowContract$Step$TaxProfile;", "Lcom/revolut/feature/freelancer/impl/ui/profile/FreelancerProfileFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TaxProfile extends FreelancerProfileFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TaxProfile> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f74023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f74024b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TaxProfile(j.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaxProfile[i];
            }
        }

        public TaxProfile(j taxType, String taxProfileId) {
            Intrinsics.checkNotNullParameter(taxType, "taxType");
            Intrinsics.checkNotNullParameter(taxProfileId, "taxProfileId");
            this.f74023a = taxType;
            this.f74024b = taxProfileId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TaxProfile)) {
                return false;
            }
            TaxProfile taxProfile = (TaxProfile) obj2;
            return this.f74023a == taxProfile.f74023a && Intrinsics.f(this.f74024b, taxProfile.f74024b);
        }

        public final int hashCode() {
            return this.f74024b.hashCode() + (this.f74023a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f74023a.name());
            dest.writeString(this.f74024b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/profile/FreelancerProfileFlowContract$Step$Taxes;", "Lcom/revolut/feature/freelancer/impl/ui/profile/FreelancerProfileFlowContract$Step;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Taxes extends FreelancerProfileFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Taxes f74025a = new Taxes();

        @NotNull
        public static final Parcelable.Creator<Taxes> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Taxes.f74025a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Taxes[i];
            }
        }

        private Taxes() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/profile/FreelancerProfileFlowContract$Step$TradingName;", "Lcom/revolut/feature/freelancer/impl/ui/profile/FreelancerProfileFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TradingName extends FreelancerProfileFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TradingName> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f74026a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f74027b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TradingName(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TradingName[i];
            }
        }

        public TradingName(String str, String str2) {
            this.f74026a = str;
            this.f74027b = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TradingName)) {
                return false;
            }
            TradingName tradingName = (TradingName) obj2;
            return Intrinsics.f(this.f74026a, tradingName.f74026a) && Intrinsics.f(this.f74027b, tradingName.f74027b);
        }

        public final int hashCode() {
            String str = this.f74026a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f74027b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f74026a);
            dest.writeString(this.f74027b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/profile/FreelancerProfileFlowContract$Step$Vat;", "Lcom/revolut/feature/freelancer/impl/ui/profile/FreelancerProfileFlowContract$Step;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Vat extends FreelancerProfileFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Vat f74028a = new Vat();

        @NotNull
        public static final Parcelable.Creator<Vat> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Vat.f74028a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Vat[i];
            }
        }

        private Vat() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/profile/FreelancerProfileFlowContract$Step$VatPrompt;", "Lcom/revolut/feature/freelancer/impl/ui/profile/FreelancerProfileFlowContract$Step;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class VatPrompt extends FreelancerProfileFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final VatPrompt f74029a = new VatPrompt();

        @NotNull
        public static final Parcelable.Creator<VatPrompt> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return VatPrompt.f74029a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VatPrompt[i];
            }
        }

        private VatPrompt() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/profile/FreelancerProfileFlowContract$Step$VatReminder;", "Lcom/revolut/feature/freelancer/impl/ui/profile/FreelancerProfileFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class VatReminder extends FreelancerProfileFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<VatReminder> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f74030a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new VatReminder(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VatReminder[i];
            }
        }

        public VatReminder(String taxProfileId) {
            Intrinsics.checkNotNullParameter(taxProfileId, "taxProfileId");
            this.f74030a = taxProfileId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof VatReminder) && Intrinsics.f(this.f74030a, ((VatReminder) obj2).f74030a);
        }

        public final int hashCode() {
            return this.f74030a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f74030a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/profile/FreelancerProfileFlowContract$Step$Website;", "Lcom/revolut/feature/freelancer/impl/ui/profile/FreelancerProfileFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Website extends FreelancerProfileFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Website> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f74031a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final gs6.a f74032b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Website(parcel.readString(), gs6.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Website[i];
            }
        }

        public Website(String str, gs6.a urlVerificationMode) {
            Intrinsics.checkNotNullParameter(urlVerificationMode, "urlVerificationMode");
            this.f74031a = str;
            this.f74032b = urlVerificationMode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Website)) {
                return false;
            }
            Website website = (Website) obj2;
            return Intrinsics.f(this.f74031a, website.f74031a) && this.f74032b == website.f74032b;
        }

        public final int hashCode() {
            String str = this.f74031a;
            return this.f74032b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f74031a);
            dest.writeString(this.f74032b.name());
        }
    }

    private FreelancerProfileFlowContract$Step() {
    }
}
