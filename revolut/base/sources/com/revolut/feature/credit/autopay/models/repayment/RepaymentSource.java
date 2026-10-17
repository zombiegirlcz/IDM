package com.revolut.feature.credit.autopay.models.repayment;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.autopay.models.AccountDetails;
import com.revolut.feature.credit.core.R$string;
import dj0.d;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.f0;
import org.jetbrains.annotations.NotNull;
import xi0.b;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/feature/credit/autopay/models/repayment/RepaymentSource;", "Landroid/os/Parcelable;", "<init>", "()V", "RevolutWallet", "Pocket", "JointAccount", "ExternalAccount", "Lcom/revolut/feature/credit/autopay/models/repayment/RepaymentSource$ExternalAccount;", "Lcom/revolut/feature/credit/autopay/models/repayment/RepaymentSource$JointAccount;", "Lcom/revolut/feature/credit/autopay/models/repayment/RepaymentSource$Pocket;", "Lcom/revolut/feature/credit/autopay/models/repayment/RepaymentSource$RevolutWallet;", "feature_credit_autopay_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RepaymentSource implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/autopay/models/repayment/RepaymentSource$ExternalAccount;", "Lcom/revolut/feature/credit/autopay/models/repayment/RepaymentSource;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_credit_autopay_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExternalAccount extends RepaymentSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AccountDetails.LinkedAccount f68552a;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<ExternalAccount> CREATOR = new b();

        /* JADX INFO: renamed from: com.revolut.feature.credit.autopay.models.repayment.RepaymentSource$ExternalAccount$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public static TextLocalisedClause a(AccountDetails.LinkedAccount linkedAccount) {
                Intrinsics.checkNotNullParameter(linkedAccount, "<this>");
                return new TextLocalisedClause(R$string.credit_autopay_external_account_details, v.k(linkedAccount.f68540a, f0.V0(4, linkedAccount.f68543g)), null, 12);
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExternalAccount(AccountDetails.LinkedAccount.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExternalAccount[i];
            }
        }

        public ExternalAccount(AccountDetails.LinkedAccount linkedExternalAccount) {
            Intrinsics.checkNotNullParameter(linkedExternalAccount, "linkedExternalAccount");
            this.f68552a = linkedExternalAccount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ExternalAccount) && Intrinsics.f(this.f68552a, ((ExternalAccount) obj2).f68552a);
        }

        public final int hashCode() {
            return this.f68552a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f68552a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/autopay/models/repayment/RepaymentSource$JointAccount;", "Lcom/revolut/feature/credit/autopay/models/repayment/RepaymentSource;", "", "toString", "()Ljava/lang/String;", "feature_credit_autopay_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JointAccount extends RepaymentSource {

        @NotNull
        public static final Parcelable.Creator<JointAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f68553a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f68554b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f68555c;
        public final Clause d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JointAccount(parcel.readString(), (b) parcel.readSerializable(), (d) parcel.readSerializable(), (Clause) parcel.readParcelable(JointAccount.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JointAccount[i];
            }
        }

        public JointAccount(String sourceId, b currency, d dVar, Clause clause) {
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f68553a = sourceId;
            this.f68554b = currency;
            this.f68555c = dVar;
            this.d = clause;
        }

        @Override // com.revolut.feature.credit.autopay.models.repayment.RepaymentSource
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF68556a() {
            return this.f68553a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof JointAccount)) {
                return false;
            }
            JointAccount jointAccount = (JointAccount) obj2;
            return Intrinsics.f(this.f68553a, jointAccount.f68553a) && Intrinsics.f(this.f68554b, jointAccount.f68554b) && Intrinsics.f(this.f68555c, jointAccount.f68555c) && Intrinsics.f(this.d, jointAccount.d);
        }

        @Override // com.revolut.feature.credit.autopay.models.repayment.RepaymentSource
        /* JADX INFO: renamed from: getBalance, reason: from getter */
        public final d getF68558c() {
            return this.f68555c;
        }

        @Override // com.revolut.feature.credit.autopay.models.repayment.RepaymentSource
        /* JADX INFO: renamed from: getCurrency, reason: from getter */
        public final b getF68557b() {
            return this.f68554b;
        }

        public final int hashCode() {
            int iJ = l.j(this.f68554b, this.f68553a.hashCode() * 31, 31);
            d dVar = this.f68555c;
            int iHashCode = (iJ + (dVar == null ? 0 : dVar.hashCode())) * 31;
            Clause clause = this.d;
            return iHashCode + (clause != null ? clause.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f68553a);
            dest.writeSerializable(this.f68554b);
            dest.writeSerializable(this.f68555c);
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/autopay/models/repayment/RepaymentSource$Pocket;", "Lcom/revolut/feature/credit/autopay/models/repayment/RepaymentSource;", "", "toString", "()Ljava/lang/String;", "feature_credit_autopay_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Pocket extends RepaymentSource {

        @NotNull
        public static final Parcelable.Creator<Pocket> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f68556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f68557b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f68558c;
        public final Clause d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Pocket(parcel.readString(), (b) parcel.readSerializable(), (d) parcel.readSerializable(), (Clause) parcel.readParcelable(Pocket.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pocket[i];
            }
        }

        public Pocket(String str, b currency, d dVar, Clause clause) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f68556a = str;
            this.f68557b = currency;
            this.f68558c = dVar;
            this.d = clause;
        }

        @Override // com.revolut.feature.credit.autopay.models.repayment.RepaymentSource
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF68556a() {
            return this.f68556a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Pocket)) {
                return false;
            }
            Pocket pocket = (Pocket) obj2;
            return Intrinsics.f(this.f68556a, pocket.f68556a) && Intrinsics.f(this.f68557b, pocket.f68557b) && Intrinsics.f(this.f68558c, pocket.f68558c) && Intrinsics.f(this.d, pocket.d);
        }

        @Override // com.revolut.feature.credit.autopay.models.repayment.RepaymentSource
        /* JADX INFO: renamed from: getBalance, reason: from getter */
        public final d getF68558c() {
            return this.f68558c;
        }

        @Override // com.revolut.feature.credit.autopay.models.repayment.RepaymentSource
        /* JADX INFO: renamed from: getCurrency, reason: from getter */
        public final b getF68557b() {
            return this.f68557b;
        }

        public final int hashCode() {
            String str = this.f68556a;
            int iJ = l.j(this.f68557b, (str == null ? 0 : str.hashCode()) * 31, 31);
            d dVar = this.f68558c;
            int iHashCode = (iJ + (dVar == null ? 0 : dVar.hashCode())) * 31;
            Clause clause = this.d;
            return iHashCode + (clause != null ? clause.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f68556a);
            dest.writeSerializable(this.f68557b);
            dest.writeSerializable(this.f68558c);
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/autopay/models/repayment/RepaymentSource$RevolutWallet;", "Lcom/revolut/feature/credit/autopay/models/repayment/RepaymentSource;", "<init>", "()V", "feature_credit_autopay_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @yhm.d
    public static final class RevolutWallet extends RepaymentSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RevolutWallet f68559a = new RevolutWallet();

        @NotNull
        public static final Parcelable.Creator<RevolutWallet> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RevolutWallet.f68559a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevolutWallet[i];
            }
        }

        private RevolutWallet() {
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

    private RepaymentSource() {
    }

    /* JADX INFO: renamed from: a */
    public String getF68556a() {
        return null;
    }

    /* JADX INFO: renamed from: getBalance */
    public d getF68558c() {
        return null;
    }

    /* JADX INFO: renamed from: getCurrency */
    public b getF68557b() {
        return null;
    }
}
