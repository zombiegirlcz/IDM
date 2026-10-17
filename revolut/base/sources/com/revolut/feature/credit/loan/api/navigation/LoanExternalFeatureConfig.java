package com.revolut.feature.credit.loan.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import dj0.d;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;
import tof.a3;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanExternalFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "<init>", "()V", "LoanTopUp", "LoanPdfView", "LoanSupport", "LoanTransactionDetails", "LoanTransactionsSearch", "LoanForbearanceApplication", "Lcom/revolut/feature/credit/loan/api/navigation/LoanExternalFeatureConfig$LoanForbearanceApplication;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanExternalFeatureConfig$LoanPdfView;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanExternalFeatureConfig$LoanSupport;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanExternalFeatureConfig$LoanTopUp;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanExternalFeatureConfig$LoanTransactionDetails;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanExternalFeatureConfig$LoanTransactionsSearch;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class LoanExternalFeatureConfig implements FeatureConfig {

    /* JADX INFO: loaded from: classes21.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanExternalFeatureConfig$LoanForbearanceApplication;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanExternalFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LoanForbearanceApplication extends LoanExternalFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<LoanForbearanceApplication> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70209a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LoanForbearanceApplication(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LoanForbearanceApplication[i];
            }
        }

        public LoanForbearanceApplication(String facilityId) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            this.f70209a = facilityId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LoanForbearanceApplication) && Intrinsics.f(this.f70209a, ((LoanForbearanceApplication) obj2).f70209a);
        }

        public final int hashCode() {
            return this.f70209a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70209a);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanExternalFeatureConfig$LoanPdfView;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanExternalFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LoanPdfView extends LoanExternalFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<LoanPdfView> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f70211b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f70212c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LoanPdfView((Clause) parcel.readParcelable(LoanPdfView.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LoanPdfView[i];
            }
        }

        public LoanPdfView(Clause title, String url2, boolean z) {
            Intrinsics.checkNotNullParameter(url2, "url");
            Intrinsics.checkNotNullParameter(title, "title");
            this.f70210a = url2;
            this.f70211b = title;
            this.f70212c = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LoanPdfView)) {
                return false;
            }
            LoanPdfView loanPdfView = (LoanPdfView) obj2;
            return Intrinsics.f(this.f70210a, loanPdfView.f70210a) && Intrinsics.f(this.f70211b, loanPdfView.f70211b) && this.f70212c == loanPdfView.f70212c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f70212c) + p.a.a(this.f70210a.hashCode() * 31, 31, this.f70211b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70210a);
            dest.writeParcelable(this.f70211b, i);
            dest.writeInt(this.f70212c ? 1 : 0);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanExternalFeatureConfig$LoanSupport;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanExternalFeatureConfig;", "<init>", "()V", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LoanSupport extends LoanExternalFeatureConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LoanSupport f70213a = new LoanSupport();

        @NotNull
        public static final Parcelable.Creator<LoanSupport> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LoanSupport.f70213a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LoanSupport[i];
            }
        }

        private LoanSupport() {
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

    /* JADX INFO: loaded from: classes21.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanExternalFeatureConfig$LoanTopUp;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanExternalFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LoanTopUp extends LoanExternalFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<LoanTopUp> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f70214a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LoanTopUp((d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LoanTopUp[i];
            }
        }

        public LoanTopUp(d money) {
            Intrinsics.checkNotNullParameter(money, "money");
            this.f70214a = money;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LoanTopUp) && Intrinsics.f(this.f70214a, ((LoanTopUp) obj2).f70214a);
        }

        public final int hashCode() {
            return this.f70214a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f70214a);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanExternalFeatureConfig$LoanTransactionDetails;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanExternalFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LoanTransactionDetails extends LoanExternalFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<LoanTransactionDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a3 f70215a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LoanTransactionDetails((a3) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LoanTransactionDetails[i];
            }
        }

        public LoanTransactionDetails(a3 transaction) {
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            this.f70215a = transaction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LoanTransactionDetails) && Intrinsics.f(this.f70215a, ((LoanTransactionDetails) obj2).f70215a);
        }

        public final int hashCode() {
            return this.f70215a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f70215a);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/navigation/LoanExternalFeatureConfig$LoanTransactionsSearch;", "Lcom/revolut/feature/credit/loan/api/navigation/LoanExternalFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LoanTransactionsSearch extends LoanExternalFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<LoanTransactionsSearch> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LinkedHashSet f70217b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iA = 0;
                while (iA != i) {
                    iA = o.a(parcel, linkedHashSet, iA, 1);
                }
                return new LoanTransactionsSearch(linkedHashSet, string);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LoanTransactionsSearch[i];
            }
        }

        public LoanTransactionsSearch(LinkedHashSet transactionIds, String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(transactionIds, "transactionIds");
            this.f70216a = id10;
            this.f70217b = transactionIds;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LoanTransactionsSearch)) {
                return false;
            }
            LoanTransactionsSearch loanTransactionsSearch = (LoanTransactionsSearch) obj2;
            return Intrinsics.f(this.f70216a, loanTransactionsSearch.f70216a) && this.f70217b.equals(loanTransactionsSearch.f70217b);
        }

        public final int hashCode() {
            return this.f70217b.hashCode() + (this.f70216a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70216a);
            LinkedHashSet linkedHashSet = this.f70217b;
            dest.writeInt(linkedHashSet.size());
            Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                dest.writeString((String) it8.next());
            }
        }
    }

    private LoanExternalFeatureConfig() {
    }
}
