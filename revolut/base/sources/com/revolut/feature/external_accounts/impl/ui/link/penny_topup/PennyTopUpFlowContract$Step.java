package com.revolut.feature.external_accounts.impl.ui.link.penny_topup;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution;
import com.revolut.feature.external_accounts.impl.ui.link.screens.iban.IbanScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/link/penny_topup/PennyTopUpFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Institutions", "Branches", "AccountInformationService", "PaymentInitiationService", "Iban", "Lcom/revolut/feature/external_accounts/impl/ui/link/penny_topup/PennyTopUpFlowContract$Step$AccountInformationService;", "Lcom/revolut/feature/external_accounts/impl/ui/link/penny_topup/PennyTopUpFlowContract$Step$Branches;", "Lcom/revolut/feature/external_accounts/impl/ui/link/penny_topup/PennyTopUpFlowContract$Step$Iban;", "Lcom/revolut/feature/external_accounts/impl/ui/link/penny_topup/PennyTopUpFlowContract$Step$Institutions;", "Lcom/revolut/feature/external_accounts/impl/ui/link/penny_topup/PennyTopUpFlowContract$Step$PaymentInitiationService;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PennyTopUpFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/link/penny_topup/PennyTopUpFlowContract$Step$AccountInformationService;", "Lcom/revolut/feature/external_accounts/impl/ui/link/penny_topup/PennyTopUpFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccountInformationService implements PennyTopUpFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AccountInformationService> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExternalInstitution f73025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ho3.a f73026b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f73027c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AccountInformationService((ExternalInstitution) parcel.readParcelable(AccountInformationService.class.getClassLoader()), (ho3.a) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountInformationService[i];
            }
        }

        public AccountInformationService(ExternalInstitution institution, ho3.a aVar, String str) {
            Intrinsics.checkNotNullParameter(institution, "institution");
            this.f73025a = institution;
            this.f73026b = aVar;
            this.f73027c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AccountInformationService)) {
                return false;
            }
            AccountInformationService accountInformationService = (AccountInformationService) obj2;
            return Intrinsics.f(this.f73025a, accountInformationService.f73025a) && Intrinsics.f(this.f73026b, accountInformationService.f73026b) && Intrinsics.f(this.f73027c, accountInformationService.f73027c);
        }

        public final int hashCode() {
            int iHashCode = this.f73025a.hashCode() * 31;
            ho3.a aVar = this.f73026b;
            int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
            String str = this.f73027c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f73025a, i);
            dest.writeSerializable(this.f73026b);
            dest.writeString(this.f73027c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/link/penny_topup/PennyTopUpFlowContract$Step$Branches;", "Lcom/revolut/feature/external_accounts/impl/ui/link/penny_topup/PennyTopUpFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Branches implements PennyTopUpFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Branches> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExternalInstitution f73028a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Branches((ExternalInstitution) parcel.readParcelable(Branches.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Branches[i];
            }
        }

        public Branches(ExternalInstitution institution) {
            Intrinsics.checkNotNullParameter(institution, "institution");
            this.f73028a = institution;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Branches) && Intrinsics.f(this.f73028a, ((Branches) obj2).f73028a);
        }

        public final int hashCode() {
            return this.f73028a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f73028a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/link/penny_topup/PennyTopUpFlowContract$Step$Iban;", "Lcom/revolut/feature/external_accounts/impl/ui/link/penny_topup/PennyTopUpFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Iban implements PennyTopUpFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Iban> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExternalInstitution f73029a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ho3.a f73030b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final IbanScreenContract$InputData f73031c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Iban((ExternalInstitution) parcel.readParcelable(Iban.class.getClassLoader()), (ho3.a) parcel.readSerializable(), IbanScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Iban[i];
            }
        }

        public Iban(ExternalInstitution institution, ho3.a aVar, IbanScreenContract$InputData ibanScreenInputData) {
            Intrinsics.checkNotNullParameter(institution, "institution");
            Intrinsics.checkNotNullParameter(ibanScreenInputData, "ibanScreenInputData");
            this.f73029a = institution;
            this.f73030b = aVar;
            this.f73031c = ibanScreenInputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Iban)) {
                return false;
            }
            Iban iban = (Iban) obj2;
            return Intrinsics.f(this.f73029a, iban.f73029a) && Intrinsics.f(this.f73030b, iban.f73030b) && Intrinsics.f(this.f73031c, iban.f73031c);
        }

        public final int hashCode() {
            int iHashCode = this.f73029a.hashCode() * 31;
            ho3.a aVar = this.f73030b;
            return this.f73031c.hashCode() + ((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f73029a, i);
            dest.writeSerializable(this.f73030b);
            this.f73031c.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/link/penny_topup/PennyTopUpFlowContract$Step$Institutions;", "Lcom/revolut/feature/external_accounts/impl/ui/link/penny_topup/PennyTopUpFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Institutions implements PennyTopUpFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Institutions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f73032a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
                return new Institutions(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Institutions[i];
            }
        }

        public Institutions(List applicableCountries) {
            Intrinsics.checkNotNullParameter(applicableCountries, "applicableCountries");
            this.f73032a = applicableCountries;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Institutions) && Intrinsics.f(this.f73032a, ((Institutions) obj2).f73032a);
        }

        public final int hashCode() {
            return this.f73032a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f73032a, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/link/penny_topup/PennyTopUpFlowContract$Step$PaymentInitiationService;", "Lcom/revolut/feature/external_accounts/impl/ui/link/penny_topup/PennyTopUpFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentInitiationService implements PennyTopUpFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PaymentInitiationService> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExternalInstitution f73033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ho3.a f73034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f73035c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentInitiationService((ExternalInstitution) parcel.readParcelable(PaymentInitiationService.class.getClassLoader()), (ho3.a) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentInitiationService[i];
            }
        }

        public PaymentInitiationService(ExternalInstitution institution, ho3.a aVar, String str) {
            Intrinsics.checkNotNullParameter(institution, "institution");
            this.f73033a = institution;
            this.f73034b = aVar;
            this.f73035c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PaymentInitiationService)) {
                return false;
            }
            PaymentInitiationService paymentInitiationService = (PaymentInitiationService) obj2;
            return Intrinsics.f(this.f73033a, paymentInitiationService.f73033a) && Intrinsics.f(this.f73034b, paymentInitiationService.f73034b) && Intrinsics.f(this.f73035c, paymentInitiationService.f73035c);
        }

        public final int hashCode() {
            int iHashCode = this.f73033a.hashCode() * 31;
            ho3.a aVar = this.f73034b;
            int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
            String str = this.f73035c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f73033a, i);
            dest.writeSerializable(this.f73034b);
            dest.writeString(this.f73035c);
        }
    }
}
