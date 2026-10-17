package com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.retail.savings.api.challenge.model.SavingsChallengeOnboarding;
import com.revolut.feature.retail.savings.impl.creation.navigation.SavingsAccountCreationStepDestination;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ncd.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u000f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0082\u0001\u000f\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 À\u0006\u0003"}, d2 = {"com/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Upsell", "SelectCurrency", "SelectTerm", "OptionSelection", "ProductDetailsReview", "PendingJointAccount", "Article", "Documents", "ProtectionAndSafety", "FundInfo", "InterestAndFees", "AccountCreation", "TieredLimits", "ChallengeSetup", "ChallengeReview", "Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step$AccountCreation;", "Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step$Article;", "Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step$ChallengeReview;", "Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step$ChallengeSetup;", "Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step$Documents;", "Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step$FundInfo;", "Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step$InterestAndFees;", "Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step$OptionSelection;", "Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step$PendingJointAccount;", "Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step$ProductDetailsReview;", "Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step$ProtectionAndSafety;", "Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step$SelectCurrency;", "Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step$SelectTerm;", "Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step$TieredLimits;", "Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step$Upsell;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SavingsOnboardingFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step$AccountCreation;", "Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccountCreation implements SavingsOnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AccountCreation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SavingsAccountCreationStepDestination f83240a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AccountCreation((SavingsAccountCreationStepDestination) parcel.readParcelable(AccountCreation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountCreation[i];
            }
        }

        public AccountCreation(SavingsAccountCreationStepDestination input) {
            Intrinsics.checkNotNullParameter(input, "input");
            this.f83240a = input;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AccountCreation) && Intrinsics.f(this.f83240a, ((AccountCreation) obj2).f83240a);
        }

        public final int hashCode() {
            return this.f83240a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f83240a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step$Article;", "Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step;", "PreFlow", "InFlow", "Type", "Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step$Article$InFlow;", "Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step$Article$PreFlow;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Article extends SavingsOnboardingFlowContract$Step {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step$Article$InFlow;", "Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step$Article;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class InFlow implements Article {

            @NotNull
            public static final Parcelable.Creator<InFlow> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Type f83241a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ProductArticleParams f83242b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f83243c;
            public final String d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new InFlow((Type) parcel.readParcelable(InFlow.class.getClassLoader()), (ProductArticleParams) parcel.readParcelable(InFlow.class.getClassLoader()), parcel.readInt() != 0, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new InFlow[i];
                }
            }

            public InFlow(Type type, ProductArticleParams params, boolean z, String str) {
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(params, "params");
                this.f83241a = type;
                this.f83242b = params;
                this.f83243c = z;
                this.d = str;
            }

            @Override // com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.SavingsOnboardingFlowContract$Step.Article
            /* JADX INFO: renamed from: C0, reason: from getter */
            public final String getD() {
                return this.d;
            }

            @Override // com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.SavingsOnboardingFlowContract$Step.Article
            /* JADX INFO: renamed from: G6, reason: from getter */
            public final boolean getF83246c() {
                return this.f83243c;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof InFlow)) {
                    return false;
                }
                InFlow inFlow = (InFlow) obj2;
                return Intrinsics.f(this.f83241a, inFlow.f83241a) && Intrinsics.f(this.f83242b, inFlow.f83242b) && this.f83243c == inFlow.f83243c && Intrinsics.f(this.d, inFlow.d);
            }

            @Override // com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.SavingsOnboardingFlowContract$Step.Article
            /* JADX INFO: renamed from: getParams, reason: from getter */
            public final ProductArticleParams getF83245b() {
                return this.f83242b;
            }

            @Override // com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.SavingsOnboardingFlowContract$Step.Article
            /* JADX INFO: renamed from: getType, reason: from getter */
            public final Type getF83244a() {
                return this.f83241a;
            }

            public final int hashCode() {
                int iC = j6.a.c((this.f83242b.hashCode() + (this.f83241a.hashCode() * 31)) * 31, 31, this.f83243c);
                String str = this.d;
                return iC + (str == null ? 0 : str.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f83241a, i);
                dest.writeParcelable(this.f83242b, i);
                dest.writeInt(this.f83243c ? 1 : 0);
                dest.writeString(this.d);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step$Article$PreFlow;", "Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step$Article;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class PreFlow implements Article {

            @NotNull
            public static final Parcelable.Creator<PreFlow> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Type f83244a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ProductArticleParams f83245b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f83246c;
            public final String d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new PreFlow((Type) parcel.readParcelable(PreFlow.class.getClassLoader()), (ProductArticleParams) parcel.readParcelable(PreFlow.class.getClassLoader()), parcel.readInt() != 0, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new PreFlow[i];
                }
            }

            public PreFlow(Type type, ProductArticleParams params, boolean z, String str) {
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(params, "params");
                this.f83244a = type;
                this.f83245b = params;
                this.f83246c = z;
                this.d = str;
            }

            @Override // com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.SavingsOnboardingFlowContract$Step.Article
            /* JADX INFO: renamed from: C0, reason: from getter */
            public final String getD() {
                return this.d;
            }

            @Override // com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.SavingsOnboardingFlowContract$Step.Article
            /* JADX INFO: renamed from: G6, reason: from getter */
            public final boolean getF83246c() {
                return this.f83246c;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof PreFlow)) {
                    return false;
                }
                PreFlow preFlow = (PreFlow) obj2;
                return Intrinsics.f(this.f83244a, preFlow.f83244a) && Intrinsics.f(this.f83245b, preFlow.f83245b) && this.f83246c == preFlow.f83246c && Intrinsics.f(this.d, preFlow.d);
            }

            @Override // com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.SavingsOnboardingFlowContract$Step.Article
            /* JADX INFO: renamed from: getParams, reason: from getter */
            public final ProductArticleParams getF83245b() {
                return this.f83245b;
            }

            @Override // com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.SavingsOnboardingFlowContract$Step.Article
            /* JADX INFO: renamed from: getType, reason: from getter */
            public final Type getF83244a() {
                return this.f83244a;
            }

            public final int hashCode() {
                int iC = j6.a.c((this.f83245b.hashCode() + (this.f83244a.hashCode() * 31)) * 31, 31, this.f83246c);
                String str = this.d;
                return iC + (str == null ? 0 : str.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f83244a, i);
                dest.writeParcelable(this.f83245b, i);
                dest.writeInt(this.f83246c ? 1 : 0);
                dest.writeString(this.d);
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step$Article$Type;", "Landroid/os/Parcelable;", "Product", "Challenge", "Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step$Article$Type$Challenge;", "Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step$Article$Type$Product;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface Type extends Parcelable {

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step$Article$Type$Challenge;", "Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step$Article$Type;", "<init>", "()V", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Challenge implements Type {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final Challenge f83247a = new Challenge();

                @NotNull
                public static final Parcelable.Creator<Challenge> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return Challenge.f83247a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Challenge[i];
                    }
                }

                private Challenge() {
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

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step$Article$Type$Product;", "Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step$Article$Type;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Product implements Type {

                @NotNull
                public static final Parcelable.Creator<Product> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final g f83248a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Product(g.valueOf(parcel.readString()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Product[i];
                    }
                }

                public Product(g productGroupType) {
                    Intrinsics.checkNotNullParameter(productGroupType, "productGroupType");
                    this.f83248a = productGroupType;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof Product) && this.f83248a == ((Product) obj2).f83248a;
                }

                public final int hashCode() {
                    return this.f83248a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f83248a.name());
                }
            }
        }

        /* JADX INFO: renamed from: C0 */
        String getD();

        /* JADX INFO: renamed from: G6 */
        boolean getF83246c();

        /* JADX INFO: renamed from: getParams */
        ProductArticleParams getF83245b();

        /* JADX INFO: renamed from: getType */
        Type getF83244a();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step$ChallengeReview;", "Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChallengeReview implements SavingsOnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ChallengeReview> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SavingsProductData f83249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SavingsChallengeOnboarding f83250b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final dj0.d f83251c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChallengeReview((SavingsProductData) parcel.readParcelable(ChallengeReview.class.getClassLoader()), (SavingsChallengeOnboarding) parcel.readParcelable(ChallengeReview.class.getClassLoader()), (dj0.d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChallengeReview[i];
            }
        }

        public ChallengeReview(SavingsProductData productData, SavingsChallengeOnboarding challengeOnboarding, dj0.d selectedAmount) {
            Intrinsics.checkNotNullParameter(productData, "productData");
            Intrinsics.checkNotNullParameter(challengeOnboarding, "challengeOnboarding");
            Intrinsics.checkNotNullParameter(selectedAmount, "selectedAmount");
            this.f83249a = productData;
            this.f83250b = challengeOnboarding;
            this.f83251c = selectedAmount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ChallengeReview)) {
                return false;
            }
            ChallengeReview challengeReview = (ChallengeReview) obj2;
            return Intrinsics.f(this.f83249a, challengeReview.f83249a) && Intrinsics.f(this.f83250b, challengeReview.f83250b) && Intrinsics.f(this.f83251c, challengeReview.f83251c);
        }

        public final int hashCode() {
            return this.f83251c.hashCode() + ((this.f83250b.hashCode() + (this.f83249a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f83249a, i);
            dest.writeParcelable(this.f83250b, i);
            dest.writeSerializable(this.f83251c);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step$ChallengeSetup;", "Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step;", "<init>", "()V", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ChallengeSetup implements SavingsOnboardingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ChallengeSetup f83252a = new ChallengeSetup();

        @NotNull
        public static final Parcelable.Creator<ChallengeSetup> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ChallengeSetup.f83252a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChallengeSetup[i];
            }
        }

        private ChallengeSetup() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step$Documents;", "Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Documents implements SavingsOnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Documents> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SavingsProductData f83253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f83254b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Documents((SavingsProductData) parcel.readParcelable(Documents.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Documents[i];
            }
        }

        public Documents(SavingsProductData productData, String str) {
            Intrinsics.checkNotNullParameter(productData, "productData");
            this.f83253a = productData;
            this.f83254b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Documents)) {
                return false;
            }
            Documents documents = (Documents) obj2;
            return Intrinsics.f(this.f83253a, documents.f83253a) && Intrinsics.f(this.f83254b, documents.f83254b);
        }

        public final int hashCode() {
            int iHashCode = this.f83253a.hashCode() * 31;
            String str = this.f83254b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f83253a, i);
            dest.writeString(this.f83254b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step$FundInfo;", "Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FundInfo implements SavingsOnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<FundInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f83255a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FundInfo(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FundInfo[i];
            }
        }

        public FundInfo(String productId) {
            Intrinsics.checkNotNullParameter(productId, "productId");
            this.f83255a = productId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FundInfo) && Intrinsics.f(this.f83255a, ((FundInfo) obj2).f83255a);
        }

        public final int hashCode() {
            return this.f83255a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83255a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step$InterestAndFees;", "Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InterestAndFees implements SavingsOnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<InterestAndFees> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f83256a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InterestAndFees(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InterestAndFees[i];
            }
        }

        public InterestAndFees(String productId) {
            Intrinsics.checkNotNullParameter(productId, "productId");
            this.f83256a = productId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InterestAndFees) && Intrinsics.f(this.f83256a, ((InterestAndFees) obj2).f83256a);
        }

        public final int hashCode() {
            return this.f83256a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83256a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step$OptionSelection;", "Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step;", "<init>", "()V", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OptionSelection implements SavingsOnboardingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OptionSelection f83257a = new OptionSelection();

        @NotNull
        public static final Parcelable.Creator<OptionSelection> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OptionSelection.f83257a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OptionSelection[i];
            }
        }

        private OptionSelection() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step$PendingJointAccount;", "Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step;", "<init>", "()V", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PendingJointAccount implements SavingsOnboardingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PendingJointAccount f83258a = new PendingJointAccount();

        @NotNull
        public static final Parcelable.Creator<PendingJointAccount> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PendingJointAccount.f83258a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PendingJointAccount[i];
            }
        }

        private PendingJointAccount() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step$ProductDetailsReview;", "Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProductDetailsReview implements SavingsOnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ProductDetailsReview> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SavingsProductData f83259a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProductDetailsReview((SavingsProductData) parcel.readParcelable(ProductDetailsReview.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductDetailsReview[i];
            }
        }

        public ProductDetailsReview(SavingsProductData productData) {
            Intrinsics.checkNotNullParameter(productData, "productData");
            this.f83259a = productData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ProductDetailsReview) && Intrinsics.f(this.f83259a, ((ProductDetailsReview) obj2).f83259a);
        }

        public final int hashCode() {
            return this.f83259a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f83259a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step$ProtectionAndSafety;", "Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProtectionAndSafety implements SavingsOnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ProtectionAndSafety> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f83260a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProtectionAndSafety(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProtectionAndSafety[i];
            }
        }

        public ProtectionAndSafety(String productId) {
            Intrinsics.checkNotNullParameter(productId, "productId");
            this.f83260a = productId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ProtectionAndSafety) && Intrinsics.f(this.f83260a, ((ProtectionAndSafety) obj2).f83260a);
        }

        public final int hashCode() {
            return this.f83260a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83260a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step$SelectCurrency;", "Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectCurrency implements SavingsOnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SelectCurrency> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f83261a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelectCurrency(g.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectCurrency[i];
            }
        }

        public SelectCurrency(g productGroupType) {
            Intrinsics.checkNotNullParameter(productGroupType, "productGroupType");
            this.f83261a = productGroupType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SelectCurrency) && this.f83261a == ((SelectCurrency) obj2).f83261a;
        }

        public final int hashCode() {
            return this.f83261a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83261a.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step$SelectTerm;", "Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step;", "<init>", "()V", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SelectTerm implements SavingsOnboardingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SelectTerm f83262a = new SelectTerm();

        @NotNull
        public static final Parcelable.Creator<SelectTerm> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SelectTerm.f83262a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectTerm[i];
            }
        }

        private SelectTerm() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step$TieredLimits;", "Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TieredLimits implements SavingsOnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TieredLimits> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SavingsProduct f83263a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TieredLimits((SavingsProduct) parcel.readParcelable(TieredLimits.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TieredLimits[i];
            }
        }

        public TieredLimits(SavingsProduct product) {
            Intrinsics.checkNotNullParameter(product, "product");
            this.f83263a = product;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TieredLimits) && Intrinsics.f(this.f83263a, ((TieredLimits) obj2).f83263a);
        }

        public final int hashCode() {
            return this.f83263a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f83263a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step$Upsell;", "Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Upsell implements SavingsOnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Upsell> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f83264a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g f83265b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Upsell(parcel.readInt() != 0, g.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Upsell[i];
            }
        }

        public Upsell(boolean z, g productGroupType) {
            Intrinsics.checkNotNullParameter(productGroupType, "productGroupType");
            this.f83264a = z;
            this.f83265b = productGroupType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Upsell)) {
                return false;
            }
            Upsell upsell = (Upsell) obj2;
            return this.f83264a == upsell.f83264a && this.f83265b == upsell.f83265b;
        }

        public final int hashCode() {
            return this.f83265b.hashCode() + (Boolean.hashCode(this.f83264a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f83264a ? 1 : 0);
            dest.writeString(this.f83265b.name());
        }
    }
}
