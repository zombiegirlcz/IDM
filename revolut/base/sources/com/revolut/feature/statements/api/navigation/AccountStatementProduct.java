package com.revolut.feature.statements.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.core.model.domain.wallet.WalletId;
import com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId;
import kii.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/statements/api/navigation/AccountStatementProduct;", "Landroid/os/Parcelable;", "PersonalCurrent", "Pro", "Commodities", "JointCurrent", "Junior", "Teen", "Lcom/revolut/feature/statements/api/navigation/AccountStatementProduct$Commodities;", "Lcom/revolut/feature/statements/api/navigation/AccountStatementProduct$JointCurrent;", "Lcom/revolut/feature/statements/api/navigation/AccountStatementProduct$Junior;", "Lcom/revolut/feature/statements/api/navigation/AccountStatementProduct$PersonalCurrent;", "Lcom/revolut/feature/statements/api/navigation/AccountStatementProduct$Pro;", "Lcom/revolut/feature/statements/api/navigation/AccountStatementProduct$Teen;", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AccountStatementProduct extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/statements/api/navigation/AccountStatementProduct$Commodities;", "Lcom/revolut/feature/statements/api/navigation/AccountStatementProduct;", "<init>", "()V", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Commodities implements AccountStatementProduct {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Commodities f88234a = new Commodities();

        @NotNull
        public static final Parcelable.Creator<Commodities> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Commodities.f88234a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Commodities[i];
            }
        }

        private Commodities() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/statements/api/navigation/AccountStatementProduct$JointCurrent;", "Lcom/revolut/feature/statements/api/navigation/AccountStatementProduct;", "", "toString", "()Ljava/lang/String;", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JointCurrent implements AccountStatementProduct {

        @NotNull
        public static final Parcelable.Creator<JointCurrent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AccountId.Joint f88235a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JointCurrent((AccountId.Joint) parcel.readParcelable(JointCurrent.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JointCurrent[i];
            }
        }

        public JointCurrent(AccountId.Joint accountId) {
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.f88235a = accountId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof JointCurrent) && Intrinsics.f(this.f88235a, ((JointCurrent) obj2).f88235a);
        }

        public final int hashCode() {
            return this.f88235a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f88235a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/statements/api/navigation/AccountStatementProduct$Junior;", "Lcom/revolut/feature/statements/api/navigation/AccountStatementProduct;", "", "toString", "()Ljava/lang/String;", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Junior implements AccountStatementProduct {

        @NotNull
        public static final Parcelable.Creator<Junior> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f88236a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Junior(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Junior[i];
            }
        }

        public Junior(String juniorId) {
            Intrinsics.checkNotNullParameter(juniorId, "juniorId");
            this.f88236a = juniorId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Junior) && Intrinsics.f(this.f88236a, ((Junior) obj2).f88236a);
        }

        public final int hashCode() {
            return this.f88236a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f88236a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/statements/api/navigation/AccountStatementProduct$PersonalCurrent;", "Lcom/revolut/feature/statements/api/navigation/AccountStatementProduct;", "<init>", "()V", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PersonalCurrent implements AccountStatementProduct {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PersonalCurrent f88237a = new PersonalCurrent();

        @NotNull
        public static final Parcelable.Creator<PersonalCurrent> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PersonalCurrent.f88237a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PersonalCurrent[i];
            }
        }

        private PersonalCurrent() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/statements/api/navigation/AccountStatementProduct$Pro;", "Lcom/revolut/feature/statements/api/navigation/AccountStatementProduct;", "<init>", "()V", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Pro implements AccountStatementProduct {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Pro f88238a = new Pro();

        @NotNull
        public static final Parcelable.Creator<Pro> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Pro.f88238a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pro[i];
            }
        }

        private Pro() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/statements/api/navigation/AccountStatementProduct$Teen;", "Lcom/revolut/feature/statements/api/navigation/AccountStatementProduct;", "", "toString", "()Ljava/lang/String;", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Teen implements AccountStatementProduct {

        @NotNull
        public static final Parcelable.Creator<Teen> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f88239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f88240b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Teen(((RegisteredIdentityId) parcel.readParcelable(Teen.class.getClassLoader())).f74764a, ((WalletId) parcel.readParcelable(Teen.class.getClassLoader())).f66106a);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Teen[i];
            }
        }

        public Teen(String registeredIdentityId, String walletId) {
            Intrinsics.checkNotNullParameter(registeredIdentityId, "registeredIdentityId");
            Intrinsics.checkNotNullParameter(walletId, "walletId");
            this.f88239a = registeredIdentityId;
            this.f88240b = walletId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Teen)) {
                return false;
            }
            Teen teen = (Teen) obj2;
            return Intrinsics.f(this.f88239a, teen.f88239a) && Intrinsics.f(this.f88240b, teen.f88240b);
        }

        public final int hashCode() {
            return this.f88240b.hashCode() + (this.f88239a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            e.x(this.f88239a, dest, i);
            dest.writeParcelable(new WalletId(this.f88240b), i);
        }
    }
}
