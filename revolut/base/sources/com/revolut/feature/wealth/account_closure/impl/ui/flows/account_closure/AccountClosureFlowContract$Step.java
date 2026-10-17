package com.revolut.feature.wealth.account_closure.impl.ui.flows.account_closure;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeedbackOptions;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode;
import ehe.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"com/revolut/feature/wealth/account_closure/impl/ui/flows/account_closure/AccountClosureFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ConsentPromptAndPreconditionsCheck", "TradingProductConsentPromptAndPreconditionsCheck", "NegativeBalance", "TradingAccountConsent", "PrivateMarketsConsent", "Feedback", "FeedbackCompetitor", "FeatureRating", "UpcomingDividends", "Lcom/revolut/feature/wealth/account_closure/impl/ui/flows/account_closure/AccountClosureFlowContract$Step$ConsentPromptAndPreconditionsCheck;", "Lcom/revolut/feature/wealth/account_closure/impl/ui/flows/account_closure/AccountClosureFlowContract$Step$FeatureRating;", "Lcom/revolut/feature/wealth/account_closure/impl/ui/flows/account_closure/AccountClosureFlowContract$Step$Feedback;", "Lcom/revolut/feature/wealth/account_closure/impl/ui/flows/account_closure/AccountClosureFlowContract$Step$FeedbackCompetitor;", "Lcom/revolut/feature/wealth/account_closure/impl/ui/flows/account_closure/AccountClosureFlowContract$Step$NegativeBalance;", "Lcom/revolut/feature/wealth/account_closure/impl/ui/flows/account_closure/AccountClosureFlowContract$Step$PrivateMarketsConsent;", "Lcom/revolut/feature/wealth/account_closure/impl/ui/flows/account_closure/AccountClosureFlowContract$Step$TradingAccountConsent;", "Lcom/revolut/feature/wealth/account_closure/impl/ui/flows/account_closure/AccountClosureFlowContract$Step$TradingProductConsentPromptAndPreconditionsCheck;", "Lcom/revolut/feature/wealth/account_closure/impl/ui/flows/account_closure/AccountClosureFlowContract$Step$UpcomingDividends;", "feature_wealth_account_closure_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AccountClosureFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/impl/ui/flows/account_closure/AccountClosureFlowContract$Step$ConsentPromptAndPreconditionsCheck;", "Lcom/revolut/feature/wealth/account_closure/impl/ui/flows/account_closure/AccountClosureFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_wealth_account_closure_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConsentPromptAndPreconditionsCheck implements AccountClosureFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ConsentPromptAndPreconditionsCheck> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f94904a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ConsentPromptAndPreconditionsCheck(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConsentPromptAndPreconditionsCheck[i];
            }
        }

        public ConsentPromptAndPreconditionsCheck(String portfolioId) {
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            this.f94904a = portfolioId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ConsentPromptAndPreconditionsCheck) && Intrinsics.f(this.f94904a, ((ConsentPromptAndPreconditionsCheck) obj2).f94904a);
        }

        public final int hashCode() {
            return this.f94904a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94904a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/impl/ui/flows/account_closure/AccountClosureFlowContract$Step$FeatureRating;", "Lcom/revolut/feature/wealth/account_closure/impl/ui/flows/account_closure/AccountClosureFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_wealth_account_closure_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FeatureRating implements AccountClosureFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<FeatureRating> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f94905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f94906b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(FeatureRating.class, parcel, arrayList, iE, 1);
                }
                return new FeatureRating(string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FeatureRating[i];
            }
        }

        public FeatureRating(String portfolioId, ArrayList features) {
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            Intrinsics.checkNotNullParameter(features, "features");
            this.f94905a = portfolioId;
            this.f94906b = features;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FeatureRating)) {
                return false;
            }
            FeatureRating featureRating = (FeatureRating) obj2;
            return Intrinsics.f(this.f94905a, featureRating.f94905a) && this.f94906b.equals(featureRating.f94906b);
        }

        public final int hashCode() {
            return this.f94906b.hashCode() + (this.f94905a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94905a);
            Iterator itY = j6.a.y(this.f94906b, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/impl/ui/flows/account_closure/AccountClosureFlowContract$Step$Feedback;", "Lcom/revolut/feature/wealth/account_closure/impl/ui/flows/account_closure/AccountClosureFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_wealth_account_closure_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Feedback implements AccountClosureFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Feedback> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f94907a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AccountClosureFeedbackOptions f94908b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Feedback(parcel.readString(), (AccountClosureFeedbackOptions) parcel.readParcelable(Feedback.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Feedback[i];
            }
        }

        public Feedback(String portfolioId, AccountClosureFeedbackOptions feedbackOptions) {
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            Intrinsics.checkNotNullParameter(feedbackOptions, "feedbackOptions");
            this.f94907a = portfolioId;
            this.f94908b = feedbackOptions;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Feedback)) {
                return false;
            }
            Feedback feedback = (Feedback) obj2;
            return Intrinsics.f(this.f94907a, feedback.f94907a) && Intrinsics.f(this.f94908b, feedback.f94908b);
        }

        public final int hashCode() {
            return this.f94908b.hashCode() + (this.f94907a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94907a);
            dest.writeParcelable(this.f94908b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/impl/ui/flows/account_closure/AccountClosureFlowContract$Step$FeedbackCompetitor;", "Lcom/revolut/feature/wealth/account_closure/impl/ui/flows/account_closure/AccountClosureFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_wealth_account_closure_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FeedbackCompetitor implements AccountClosureFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<FeedbackCompetitor> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f94909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f94910b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FeedbackCompetitor(parcel.readString(), parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FeedbackCompetitor[i];
            }
        }

        public FeedbackCompetitor(String portfolioId, List companies) {
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            Intrinsics.checkNotNullParameter(companies, "companies");
            this.f94909a = portfolioId;
            this.f94910b = companies;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FeedbackCompetitor)) {
                return false;
            }
            FeedbackCompetitor feedbackCompetitor = (FeedbackCompetitor) obj2;
            return Intrinsics.f(this.f94909a, feedbackCompetitor.f94909a) && Intrinsics.f(this.f94910b, feedbackCompetitor.f94910b);
        }

        public final int hashCode() {
            return this.f94910b.hashCode() + (this.f94909a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94909a);
            dest.writeStringList(this.f94910b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/impl/ui/flows/account_closure/AccountClosureFlowContract$Step$NegativeBalance;", "Lcom/revolut/feature/wealth/account_closure/impl/ui/flows/account_closure/AccountClosureFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_wealth_account_closure_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NegativeBalance implements AccountClosureFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<NegativeBalance> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f94911a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NegativeBalance(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NegativeBalance[i];
            }
        }

        public NegativeBalance(String portfolioId) {
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            this.f94911a = portfolioId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof NegativeBalance) && Intrinsics.f(this.f94911a, ((NegativeBalance) obj2).f94911a);
        }

        public final int hashCode() {
            return this.f94911a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94911a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/impl/ui/flows/account_closure/AccountClosureFlowContract$Step$PrivateMarketsConsent;", "Lcom/revolut/feature/wealth/account_closure/impl/ui/flows/account_closure/AccountClosureFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_wealth_account_closure_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PrivateMarketsConsent implements AccountClosureFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PrivateMarketsConsent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f94912a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PrivateMarketsConsent(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PrivateMarketsConsent[i];
            }
        }

        public PrivateMarketsConsent(String portfolioId) {
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            this.f94912a = portfolioId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PrivateMarketsConsent) && Intrinsics.f(this.f94912a, ((PrivateMarketsConsent) obj2).f94912a);
        }

        public final int hashCode() {
            return this.f94912a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94912a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/impl/ui/flows/account_closure/AccountClosureFlowContract$Step$TradingAccountConsent;", "Lcom/revolut/feature/wealth/account_closure/impl/ui/flows/account_closure/AccountClosureFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_wealth_account_closure_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TradingAccountConsent implements AccountClosureFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TradingAccountConsent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f94913a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TradingAccountConsent(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TradingAccountConsent[i];
            }
        }

        public TradingAccountConsent(String portfolioId) {
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            this.f94913a = portfolioId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TradingAccountConsent) && Intrinsics.f(this.f94913a, ((TradingAccountConsent) obj2).f94913a);
        }

        public final int hashCode() {
            return this.f94913a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94913a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/impl/ui/flows/account_closure/AccountClosureFlowContract$Step$TradingProductConsentPromptAndPreconditionsCheck;", "Lcom/revolut/feature/wealth/account_closure/impl/ui/flows/account_closure/AccountClosureFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_wealth_account_closure_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TradingProductConsentPromptAndPreconditionsCheck implements AccountClosureFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TradingProductConsentPromptAndPreconditionsCheck> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f94914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TradingProductCode f94915b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Set f94916c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                TradingProductCode tradingProductCode = (TradingProductCode) parcel.readParcelable(TradingProductConsentPromptAndPreconditionsCheck.class.getClassLoader());
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iE = 0;
                while (iE != i) {
                    iE = d.e(TradingProductConsentPromptAndPreconditionsCheck.class, parcel, linkedHashSet, iE, 1);
                }
                return new TradingProductConsentPromptAndPreconditionsCheck(string, tradingProductCode, linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TradingProductConsentPromptAndPreconditionsCheck[i];
            }
        }

        public TradingProductConsentPromptAndPreconditionsCheck(String accountId, TradingProductCode product, Set applicablePreconditions) {
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(product, "product");
            Intrinsics.checkNotNullParameter(applicablePreconditions, "applicablePreconditions");
            this.f94914a = accountId;
            this.f94915b = product;
            this.f94916c = applicablePreconditions;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TradingProductConsentPromptAndPreconditionsCheck)) {
                return false;
            }
            TradingProductConsentPromptAndPreconditionsCheck tradingProductConsentPromptAndPreconditionsCheck = (TradingProductConsentPromptAndPreconditionsCheck) obj2;
            return Intrinsics.f(this.f94914a, tradingProductConsentPromptAndPreconditionsCheck.f94914a) && Intrinsics.f(this.f94915b, tradingProductConsentPromptAndPreconditionsCheck.f94915b) && Intrinsics.f(this.f94916c, tradingProductConsentPromptAndPreconditionsCheck.f94916c);
        }

        public final int hashCode() {
            return this.f94916c.hashCode() + ((this.f94915b.hashCode() + (this.f94914a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94914a);
            dest.writeParcelable(this.f94915b, i);
            Iterator itV = n.v(this.f94916c, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/impl/ui/flows/account_closure/AccountClosureFlowContract$Step$UpcomingDividends;", "Lcom/revolut/feature/wealth/account_closure/impl/ui/flows/account_closure/AccountClosureFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_wealth_account_closure_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UpcomingDividends implements AccountClosureFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<UpcomingDividends> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f94917a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UpcomingDividends(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UpcomingDividends[i];
            }
        }

        public UpcomingDividends(String portfolioId) {
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            this.f94917a = portfolioId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof UpcomingDividends) && Intrinsics.f(this.f94917a, ((UpcomingDividends) obj2).f94917a);
        }

        public final int hashCode() {
            return this.f94917a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94917a);
        }
    }
}
