package com.revolut.feature.external_accounts.impl.domain.open_banking_brazil;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.external_accounts.models.open_banking_brazil.ThirdPartyBrazil;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/domain/open_banking_brazil/OpenBankingBrazilLinkedAccountsGroup;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "LinkedAccount", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OpenBankingBrazilLinkedAccountsGroup implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OpenBankingBrazilLinkedAccountsGroup> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThirdPartyBrazil f72390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f72391b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/domain/open_banking_brazil/OpenBankingBrazilLinkedAccountsGroup$LinkedAccount;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LinkedAccount implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<LinkedAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72393b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LinkedAccount(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LinkedAccount[i];
            }
        }

        public LinkedAccount(String id10, String accountDescription) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(accountDescription, "accountDescription");
            this.f72392a = id10;
            this.f72393b = accountDescription;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LinkedAccount)) {
                return false;
            }
            LinkedAccount linkedAccount = (LinkedAccount) obj2;
            return Intrinsics.f(this.f72392a, linkedAccount.f72392a) && Intrinsics.f(this.f72393b, linkedAccount.f72393b);
        }

        public final int hashCode() {
            return this.f72393b.hashCode() + (this.f72392a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72392a);
            dest.writeString(this.f72393b);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ThirdPartyBrazil thirdPartyBrazil = (ThirdPartyBrazil) j6.a.f(parcel, "parcel", OpenBankingBrazilLinkedAccountsGroup.class);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(LinkedAccount.CREATOR, parcel, arrayList, iA, 1);
            }
            return new OpenBankingBrazilLinkedAccountsGroup(thirdPartyBrazil, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OpenBankingBrazilLinkedAccountsGroup[i];
        }
    }

    public OpenBankingBrazilLinkedAccountsGroup(ThirdPartyBrazil thirdParty, ArrayList linkedAccounts) {
        Intrinsics.checkNotNullParameter(thirdParty, "thirdParty");
        Intrinsics.checkNotNullParameter(linkedAccounts, "linkedAccounts");
        this.f72390a = thirdParty;
        this.f72391b = linkedAccounts;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OpenBankingBrazilLinkedAccountsGroup)) {
            return false;
        }
        OpenBankingBrazilLinkedAccountsGroup openBankingBrazilLinkedAccountsGroup = (OpenBankingBrazilLinkedAccountsGroup) obj2;
        return Intrinsics.f(this.f72390a, openBankingBrazilLinkedAccountsGroup.f72390a) && this.f72391b.equals(openBankingBrazilLinkedAccountsGroup.f72391b);
    }

    public final int hashCode() {
        return this.f72391b.hashCode() + (this.f72390a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f72390a, i);
        Iterator itY = j6.a.y(this.f72391b, dest);
        while (itY.hasNext()) {
            ((LinkedAccount) itY.next()).writeToParcel(dest, i);
        }
    }
}
