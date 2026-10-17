package com.revolut.feature.retail.goals.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/retail/goals/api/navigation/GoalsContract$Account", "Landroid/os/Parcelable;", "SavingsAccount", "Vault", "Lcom/revolut/feature/retail/goals/api/navigation/GoalsContract$Account$SavingsAccount;", "Lcom/revolut/feature/retail/goals/api/navigation/GoalsContract$Account$Vault;", "feature_retail_goals_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface GoalsContract$Account extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/goals/api/navigation/GoalsContract$Account$SavingsAccount;", "Lcom/revolut/feature/retail/goals/api/navigation/GoalsContract$Account;", "", "toString", "()Ljava/lang/String;", "feature_retail_goals_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SavingsAccount implements GoalsContract$Account {

        @NotNull
        public static final Parcelable.Creator<SavingsAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f82646a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Long f82647b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SavingsAccount(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavingsAccount[i];
            }
        }

        public SavingsAccount(String accountId, Long l2) {
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.f82646a = accountId;
            this.f82647b = l2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SavingsAccount)) {
                return false;
            }
            SavingsAccount savingsAccount = (SavingsAccount) obj2;
            return Intrinsics.f(this.f82646a, savingsAccount.f82646a) && Intrinsics.f(this.f82647b, savingsAccount.f82647b);
        }

        @Override // com.revolut.feature.retail.goals.api.navigation.GoalsContract$Account
        /* JADX INFO: renamed from: f, reason: from getter */
        public final Long getF82649b() {
            return this.f82647b;
        }

        public final int hashCode() {
            int iHashCode = this.f82646a.hashCode() * 31;
            Long l2 = this.f82647b;
            return iHashCode + (l2 == null ? 0 : l2.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f82646a);
            Long l2 = this.f82647b;
            if (l2 == null) {
                dest.writeInt(0);
            } else {
                b.A(dest, 1, l2);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/goals/api/navigation/GoalsContract$Account$Vault;", "Lcom/revolut/feature/retail/goals/api/navigation/GoalsContract$Account;", "", "toString", "()Ljava/lang/String;", "feature_retail_goals_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Vault implements GoalsContract$Account {

        @NotNull
        public static final Parcelable.Creator<Vault> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f82648a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Long f82649b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Vault(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Vault[i];
            }
        }

        public Vault(String vaultId, Long l2) {
            Intrinsics.checkNotNullParameter(vaultId, "vaultId");
            this.f82648a = vaultId;
            this.f82649b = l2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Vault)) {
                return false;
            }
            Vault vault = (Vault) obj2;
            return Intrinsics.f(this.f82648a, vault.f82648a) && Intrinsics.f(this.f82649b, vault.f82649b);
        }

        @Override // com.revolut.feature.retail.goals.api.navigation.GoalsContract$Account
        /* JADX INFO: renamed from: f, reason: from getter */
        public final Long getF82649b() {
            return this.f82649b;
        }

        public final int hashCode() {
            int iHashCode = this.f82648a.hashCode() * 31;
            Long l2 = this.f82649b;
            return iHashCode + (l2 == null ? 0 : l2.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f82648a);
            Long l2 = this.f82649b;
            if (l2 == null) {
                dest.writeInt(0);
            } else {
                b.A(dest, 1, l2);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    Long getF82649b();
}
