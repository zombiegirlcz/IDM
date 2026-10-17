package com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.post_activation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsCardConfiguration;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlan;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/retail/cobranded_cards/impl/presentation/flows/post_activation/CobrandedCardsPostActivationFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ProductArticle", "CardSelectionDashboard", "AdditionalValue", "CardTypeSelection", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/post_activation/CobrandedCardsPostActivationFlowContract$Step$AdditionalValue;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/post_activation/CobrandedCardsPostActivationFlowContract$Step$CardSelectionDashboard;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/post_activation/CobrandedCardsPostActivationFlowContract$Step$CardTypeSelection;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/post_activation/CobrandedCardsPostActivationFlowContract$Step$ProductArticle;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CobrandedCardsPostActivationFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/post_activation/CobrandedCardsPostActivationFlowContract$Step$AdditionalValue;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/post_activation/CobrandedCardsPostActivationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AdditionalValue implements CobrandedCardsPostActivationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AdditionalValue> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CobrandedCardsPlan f82539a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AdditionalValue((CobrandedCardsPlan) parcel.readParcelable(AdditionalValue.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AdditionalValue[i];
            }
        }

        public AdditionalValue(CobrandedCardsPlan plan) {
            Intrinsics.checkNotNullParameter(plan, "plan");
            this.f82539a = plan;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AdditionalValue) && Intrinsics.f(this.f82539a, ((AdditionalValue) obj2).f82539a);
        }

        public final int hashCode() {
            return this.f82539a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f82539a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/post_activation/CobrandedCardsPostActivationFlowContract$Step$CardSelectionDashboard;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/post_activation/CobrandedCardsPostActivationFlowContract$Step;", "<init>", "()V", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CardSelectionDashboard implements CobrandedCardsPostActivationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CardSelectionDashboard f82540a = new CardSelectionDashboard();

        @NotNull
        public static final Parcelable.Creator<CardSelectionDashboard> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CardSelectionDashboard.f82540a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardSelectionDashboard[i];
            }
        }

        private CardSelectionDashboard() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/post_activation/CobrandedCardsPostActivationFlowContract$Step$CardTypeSelection;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/post_activation/CobrandedCardsPostActivationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardTypeSelection implements CobrandedCardsPostActivationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CardTypeSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CobrandedCardsPlan f82541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CobrandedCardsCardConfiguration f82542b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CobrandedCardsCardConfiguration f82543c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardTypeSelection((CobrandedCardsPlan) parcel.readParcelable(CardTypeSelection.class.getClassLoader()), (CobrandedCardsCardConfiguration) parcel.readParcelable(CardTypeSelection.class.getClassLoader()), (CobrandedCardsCardConfiguration) parcel.readParcelable(CardTypeSelection.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardTypeSelection[i];
            }
        }

        public CardTypeSelection(CobrandedCardsPlan plan, CobrandedCardsCardConfiguration physicalCardConfiguration, CobrandedCardsCardConfiguration virtualCardConfiguration) {
            Intrinsics.checkNotNullParameter(plan, "plan");
            Intrinsics.checkNotNullParameter(physicalCardConfiguration, "physicalCardConfiguration");
            Intrinsics.checkNotNullParameter(virtualCardConfiguration, "virtualCardConfiguration");
            this.f82541a = plan;
            this.f82542b = physicalCardConfiguration;
            this.f82543c = virtualCardConfiguration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CardTypeSelection)) {
                return false;
            }
            CardTypeSelection cardTypeSelection = (CardTypeSelection) obj2;
            return Intrinsics.f(this.f82541a, cardTypeSelection.f82541a) && Intrinsics.f(this.f82542b, cardTypeSelection.f82542b) && Intrinsics.f(this.f82543c, cardTypeSelection.f82543c);
        }

        public final int hashCode() {
            return this.f82543c.hashCode() + ((this.f82542b.hashCode() + (this.f82541a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f82541a, i);
            dest.writeParcelable(this.f82542b, i);
            dest.writeParcelable(this.f82543c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/post_activation/CobrandedCardsPostActivationFlowContract$Step$ProductArticle;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/post_activation/CobrandedCardsPostActivationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProductArticle implements CobrandedCardsPostActivationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ProductArticle> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductArticleParams f82544a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProductArticle((ProductArticleParams) parcel.readParcelable(ProductArticle.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductArticle[i];
            }
        }

        public ProductArticle(ProductArticleParams params) {
            Intrinsics.checkNotNullParameter(params, "params");
            this.f82544a = params;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ProductArticle) && Intrinsics.f(this.f82544a, ((ProductArticle) obj2).f82544a);
        }

        public final int hashCode() {
            return this.f82544a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f82544a, i);
        }
    }
}
