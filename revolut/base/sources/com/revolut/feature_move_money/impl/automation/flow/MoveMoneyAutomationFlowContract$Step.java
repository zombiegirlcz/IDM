package com.revolut.feature_move_money.impl.automation.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature_move_money/impl/automation/flow/MoveMoneyAutomationFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "AutomationScreen", "ProductArticleScreen", "Lcom/revolut/feature_move_money/impl/automation/flow/MoveMoneyAutomationFlowContract$Step$AutomationScreen;", "Lcom/revolut/feature_move_money/impl/automation/flow/MoveMoneyAutomationFlowContract$Step$ProductArticleScreen;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class MoveMoneyAutomationFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_move_money/impl/automation/flow/MoveMoneyAutomationFlowContract$Step$AutomationScreen;", "Lcom/revolut/feature_move_money/impl/automation/flow/MoveMoneyAutomationFlowContract$Step;", "<init>", "()V", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AutomationScreen extends MoveMoneyAutomationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AutomationScreen f97315a = new AutomationScreen();

        @NotNull
        public static final Parcelable.Creator<AutomationScreen> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AutomationScreen.f97315a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AutomationScreen[i];
            }
        }

        private AutomationScreen() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/impl/automation/flow/MoveMoneyAutomationFlowContract$Step$ProductArticleScreen;", "Lcom/revolut/feature_move_money/impl/automation/flow/MoveMoneyAutomationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProductArticleScreen extends MoveMoneyAutomationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ProductArticleScreen> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductArticleParams f97316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SkipShownArticleBehaviour f97317b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProductArticleScreen((ProductArticleParams) parcel.readParcelable(ProductArticleScreen.class.getClassLoader()), (SkipShownArticleBehaviour) parcel.readParcelable(ProductArticleScreen.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductArticleScreen[i];
            }
        }

        public ProductArticleScreen(ProductArticleParams params, SkipShownArticleBehaviour skipShownArticleBehaviour) {
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.checkNotNullParameter(skipShownArticleBehaviour, "skipShownArticleBehaviour");
            this.f97316a = params;
            this.f97317b = skipShownArticleBehaviour;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ProductArticleScreen)) {
                return false;
            }
            ProductArticleScreen productArticleScreen = (ProductArticleScreen) obj2;
            return Intrinsics.f(this.f97316a, productArticleScreen.f97316a) && Intrinsics.f(this.f97317b, productArticleScreen.f97317b);
        }

        public final int hashCode() {
            return this.f97317b.hashCode() + (this.f97316a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97316a, i);
            dest.writeParcelable(this.f97317b, i);
        }
    }

    private MoveMoneyAutomationFlowContract$Step() {
    }
}
