package com.revolut.feature.wealth.account_closure.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosureCompetitorCompanyChoice;", "Landroid/os/Parcelable;", "Companion", "Company", "Other", "a", "Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosureCompetitorCompanyChoice$Company;", "Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosureCompetitorCompanyChoice$Other;", "feature_wealth_account_closure_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AccountClosureCompetitorCompanyChoice extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final /* synthetic */ Companion INSTANCE = Companion.f94854a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosureCompetitorCompanyChoice$Company;", "Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosureCompetitorCompanyChoice;", "", "toString", "()Ljava/lang/String;", "feature_wealth_account_closure_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Company implements AccountClosureCompetitorCompanyChoice {

        @NotNull
        public static final Parcelable.Creator<Company> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f94852a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Company(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Company[i];
            }
        }

        public Company(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f94852a = name;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Company) && Intrinsics.f(this.f94852a, ((Company) obj2).f94852a);
        }

        public final int hashCode() {
            return this.f94852a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94852a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosureCompetitorCompanyChoice$Other;", "Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosureCompetitorCompanyChoice;", "", "toString", "()Ljava/lang/String;", "feature_wealth_account_closure_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Other implements AccountClosureCompetitorCompanyChoice {

        @NotNull
        public static final Parcelable.Creator<Other> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f94853a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Other(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Other[i];
            }
        }

        public Other() {
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
            return (obj2 instanceof Other) && Intrinsics.f(this.f94853a, ((Other) obj2).f94853a);
        }

        public final int hashCode() {
            return this.f94853a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94853a);
        }

        public Other(String explanation) {
            Intrinsics.checkNotNullParameter(explanation, "explanation");
            this.f94853a = explanation;
        }

        public /* synthetic */ Other(int i) {
            this("Other");
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureCompetitorCompanyChoice$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f94854a = new Companion();

        private Companion() {
        }
    }
}
