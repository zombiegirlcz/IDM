package com.revolut.retail.feature.payments.bank_transfer.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0005\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/api/domain/model/RemittanceAccountSwitchingInformation;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getTitle", "title", "b", "getDescription", "description", "c", "bankName", "d", "bankLogo", "e", "getRedirectToBeneficiaryId", "redirectToBeneficiaryId", "", "Lcom/revolut/retail/feature/payments/bank_transfer/api/domain/model/RemittanceAccountSwitchingInformation$AccountDetails;", "f", "Ljava/util/List;", "()Ljava/util/List;", "accountDetails", "AccountDetails", "feature_payments_bank_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RemittanceAccountSwitchingInformation implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RemittanceAccountSwitchingInformation> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("description")
    @NotNull
    private final String description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @b("bankName")
    @NotNull
    private final String bankName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @b("bankLogo")
    @NotNull
    private final String bankLogo;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @b("redirectToBeneficiaryId")
    private final String redirectToBeneficiaryId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @b("accountDetails")
    @NotNull
    private final List<AccountDetails> accountDetails;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004¨\u0006\f"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/api/domain/model/RemittanceAccountSwitchingInformation$AccountDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getLabel", "label", "b", "getValue", "value", "feature_payments_bank_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccountDetails implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<AccountDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @b("label")
        @NotNull
        private final String label;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @b("value")
        @NotNull
        private final String value;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AccountDetails(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountDetails[i];
            }
        }

        public AccountDetails(String label, String value) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(value, "value");
            this.label = label;
            this.value = value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AccountDetails)) {
                return false;
            }
            AccountDetails accountDetails = (AccountDetails) obj2;
            return Intrinsics.f(this.label, accountDetails.label) && Intrinsics.f(this.value, accountDetails.value);
        }

        public final String getLabel() {
            return this.label;
        }

        public final String getValue() {
            return this.value;
        }

        public final int hashCode() {
            return this.value.hashCode() + (this.label.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.label);
            dest.writeString(this.value);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(AccountDetails.CREATOR, parcel, arrayList, iA, 1);
            }
            return new RemittanceAccountSwitchingInformation(string, string2, string3, string4, string5, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RemittanceAccountSwitchingInformation[i];
        }
    }

    public RemittanceAccountSwitchingInformation(String title, String description, String bankName, String bankLogo, String str, ArrayList accountDetails) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(bankName, "bankName");
        Intrinsics.checkNotNullParameter(bankLogo, "bankLogo");
        Intrinsics.checkNotNullParameter(accountDetails, "accountDetails");
        this.title = title;
        this.description = description;
        this.bankName = bankName;
        this.bankLogo = bankLogo;
        this.redirectToBeneficiaryId = str;
        this.accountDetails = accountDetails;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAccountDetails() {
        return this.accountDetails;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBankLogo() {
        return this.bankLogo;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getBankName() {
        return this.bankName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RemittanceAccountSwitchingInformation)) {
            return false;
        }
        RemittanceAccountSwitchingInformation remittanceAccountSwitchingInformation = (RemittanceAccountSwitchingInformation) obj2;
        return Intrinsics.f(this.title, remittanceAccountSwitchingInformation.title) && Intrinsics.f(this.description, remittanceAccountSwitchingInformation.description) && Intrinsics.f(this.bankName, remittanceAccountSwitchingInformation.bankName) && Intrinsics.f(this.bankLogo, remittanceAccountSwitchingInformation.bankLogo) && Intrinsics.f(this.redirectToBeneficiaryId, remittanceAccountSwitchingInformation.redirectToBeneficiaryId) && Intrinsics.f(this.accountDetails, remittanceAccountSwitchingInformation.accountDetails);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.title.hashCode() * 31, 31, this.description), 31, this.bankName), 31, this.bankLogo);
        String str = this.redirectToBeneficiaryId;
        return this.accountDetails.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeString(this.bankName);
        dest.writeString(this.bankLogo);
        dest.writeString(this.redirectToBeneficiaryId);
        Iterator itV = p.a.v(this.accountDetails, dest);
        while (itV.hasNext()) {
            ((AccountDetails) itV.next()).writeToParcel(dest, i);
        }
    }
}
