package com.revolut.retail.feature.plan_rewards.impl.presentation.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.plan_rewards.api.model.MonthlyDrawHub$BottomSheet;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanOfferPrompt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"com/revolut/retail/feature/plan_rewards/impl/presentation/flow/MonthlyDrawsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "ProductArticle", "Hub", "Reveal", "OptOut", "BottomSheet", "PreparingRevealSheet", "PromoOffer", "Lcom/revolut/retail/feature/plan_rewards/impl/presentation/flow/MonthlyDrawsFlowContract$Step$BottomSheet;", "Lcom/revolut/retail/feature/plan_rewards/impl/presentation/flow/MonthlyDrawsFlowContract$Step$Hub;", "Lcom/revolut/retail/feature/plan_rewards/impl/presentation/flow/MonthlyDrawsFlowContract$Step$OptOut;", "Lcom/revolut/retail/feature/plan_rewards/impl/presentation/flow/MonthlyDrawsFlowContract$Step$PreparingRevealSheet;", "Lcom/revolut/retail/feature/plan_rewards/impl/presentation/flow/MonthlyDrawsFlowContract$Step$ProductArticle;", "Lcom/revolut/retail/feature/plan_rewards/impl/presentation/flow/MonthlyDrawsFlowContract$Step$PromoOffer;", "Lcom/revolut/retail/feature/plan_rewards/impl/presentation/flow/MonthlyDrawsFlowContract$Step$Reveal;", "feature_retail_plan_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class MonthlyDrawsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/plan_rewards/impl/presentation/flow/MonthlyDrawsFlowContract$Step$BottomSheet;", "Lcom/revolut/retail/feature/plan_rewards/impl/presentation/flow/MonthlyDrawsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_plan_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BottomSheet extends MonthlyDrawsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BottomSheet> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MonthlyDrawHub$BottomSheet f102543a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BottomSheet((MonthlyDrawHub$BottomSheet) parcel.readParcelable(BottomSheet.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BottomSheet[i];
            }
        }

        public BottomSheet(MonthlyDrawHub$BottomSheet bottomSheet) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            this.f102543a = bottomSheet;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BottomSheet) && Intrinsics.f(this.f102543a, ((BottomSheet) obj2).f102543a);
        }

        public final int hashCode() {
            return this.f102543a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f102543a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/plan_rewards/impl/presentation/flow/MonthlyDrawsFlowContract$Step$Hub;", "Lcom/revolut/retail/feature/plan_rewards/impl/presentation/flow/MonthlyDrawsFlowContract$Step;", "<init>", "()V", "feature_retail_plan_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Hub extends MonthlyDrawsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Hub f102544a = new Hub();

        @NotNull
        public static final Parcelable.Creator<Hub> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Hub.f102544a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Hub[i];
            }
        }

        private Hub() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/plan_rewards/impl/presentation/flow/MonthlyDrawsFlowContract$Step$OptOut;", "Lcom/revolut/retail/feature/plan_rewards/impl/presentation/flow/MonthlyDrawsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_plan_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OptOut extends MonthlyDrawsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<OptOut> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f102545a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OptOut(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OptOut[i];
            }
        }

        public OptOut(String str) {
            this.f102545a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OptOut) && Intrinsics.f(this.f102545a, ((OptOut) obj2).f102545a);
        }

        public final int hashCode() {
            String str = this.f102545a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102545a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/plan_rewards/impl/presentation/flow/MonthlyDrawsFlowContract$Step$PreparingRevealSheet;", "Lcom/revolut/retail/feature/plan_rewards/impl/presentation/flow/MonthlyDrawsFlowContract$Step;", "<init>", "()V", "feature_retail_plan_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PreparingRevealSheet extends MonthlyDrawsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PreparingRevealSheet f102546a = new PreparingRevealSheet();

        @NotNull
        public static final Parcelable.Creator<PreparingRevealSheet> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PreparingRevealSheet.f102546a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PreparingRevealSheet[i];
            }
        }

        private PreparingRevealSheet() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/plan_rewards/impl/presentation/flow/MonthlyDrawsFlowContract$Step$ProductArticle;", "Lcom/revolut/retail/feature/plan_rewards/impl/presentation/flow/MonthlyDrawsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_plan_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProductArticle extends MonthlyDrawsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ProductArticle> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductArticleParams f102547a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f102548b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProductArticle((ProductArticleParams) parcel.readParcelable(ProductArticle.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductArticle[i];
            }
        }

        public ProductArticle(ProductArticleParams params, boolean z) {
            Intrinsics.checkNotNullParameter(params, "params");
            this.f102547a = params;
            this.f102548b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ProductArticle)) {
                return false;
            }
            ProductArticle productArticle = (ProductArticle) obj2;
            return Intrinsics.f(this.f102547a, productArticle.f102547a) && this.f102548b == productArticle.f102548b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f102548b) + (this.f102547a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f102547a, i);
            dest.writeInt(this.f102548b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/plan_rewards/impl/presentation/flow/MonthlyDrawsFlowContract$Step$PromoOffer;", "Lcom/revolut/retail/feature/plan_rewards/impl/presentation/flow/MonthlyDrawsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_plan_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PromoOffer extends MonthlyDrawsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PromoOffer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PricingPlanOfferPrompt.Available f102549a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PromoOffer((PricingPlanOfferPrompt.Available) parcel.readParcelable(PromoOffer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PromoOffer[i];
            }
        }

        public PromoOffer(PricingPlanOfferPrompt.Available offer) {
            Intrinsics.checkNotNullParameter(offer, "offer");
            this.f102549a = offer;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PromoOffer) && Intrinsics.f(this.f102549a, ((PromoOffer) obj2).f102549a);
        }

        public final int hashCode() {
            return this.f102549a.f102847a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f102549a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/plan_rewards/impl/presentation/flow/MonthlyDrawsFlowContract$Step$Reveal;", "Lcom/revolut/retail/feature/plan_rewards/impl/presentation/flow/MonthlyDrawsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_plan_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Reveal extends MonthlyDrawsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Reveal> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f102550a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Reveal(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Reveal[i];
            }
        }

        public Reveal(String str) {
            this.f102550a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Reveal) && Intrinsics.f(this.f102550a, ((Reveal) obj2).f102550a);
        }

        public final int hashCode() {
            String str = this.f102550a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102550a);
        }
    }

    private MonthlyDrawsFlowContract$Step() {
    }
}
