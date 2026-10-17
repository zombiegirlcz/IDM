package com.revolut.feature.retail.reverywhere.impl.onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/retail/reverywhere/impl/onboarding/ReverywhereOnboardingFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "ProductArticle", "RevPointsOptIn", "Reverywhere", "Lcom/revolut/feature/retail/reverywhere/impl/onboarding/ReverywhereOnboardingFlowContract$Step$ProductArticle;", "Lcom/revolut/feature/retail/reverywhere/impl/onboarding/ReverywhereOnboardingFlowContract$Step$RevPointsOptIn;", "Lcom/revolut/feature/retail/reverywhere/impl/onboarding/ReverywhereOnboardingFlowContract$Step$Reverywhere;", "feature_retail_reverywhere_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ReverywhereOnboardingFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/reverywhere/impl/onboarding/ReverywhereOnboardingFlowContract$Step$ProductArticle;", "Lcom/revolut/feature/retail/reverywhere/impl/onboarding/ReverywhereOnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_reverywhere_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProductArticle extends ReverywhereOnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ProductArticle> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductArticleParams.ArticleReference f82906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f82907b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                ProductArticleParams.ArticleReference articleReference = (ProductArticleParams.ArticleReference) j6.a.f(parcel, "parcel", ProductArticle.class);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(ProductArticle.class, parcel, arrayList, iE, 1);
                }
                return new ProductArticle(articleReference, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductArticle[i];
            }
        }

        public ProductArticle(ProductArticleParams.ArticleReference articleReference, List scopesToAccept) {
            Intrinsics.checkNotNullParameter(articleReference, "articleReference");
            Intrinsics.checkNotNullParameter(scopesToAccept, "scopesToAccept");
            this.f82906a = articleReference;
            this.f82907b = scopesToAccept;
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
            return Intrinsics.f(this.f82906a, productArticle.f82906a) && Intrinsics.f(this.f82907b, productArticle.f82907b);
        }

        public final int hashCode() {
            return this.f82907b.hashCode() + (this.f82906a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f82906a, i);
            Iterator itV = p.a.v(this.f82907b, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/reverywhere/impl/onboarding/ReverywhereOnboardingFlowContract$Step$RevPointsOptIn;", "Lcom/revolut/feature/retail/reverywhere/impl/onboarding/ReverywhereOnboardingFlowContract$Step;", "<init>", "()V", "feature_retail_reverywhere_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevPointsOptIn extends ReverywhereOnboardingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RevPointsOptIn f82908a = new RevPointsOptIn();

        @NotNull
        public static final Parcelable.Creator<RevPointsOptIn> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RevPointsOptIn.f82908a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevPointsOptIn[i];
            }
        }

        private RevPointsOptIn() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/reverywhere/impl/onboarding/ReverywhereOnboardingFlowContract$Step$Reverywhere;", "Lcom/revolut/feature/retail/reverywhere/impl/onboarding/ReverywhereOnboardingFlowContract$Step;", "<init>", "()V", "feature_retail_reverywhere_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Reverywhere extends ReverywhereOnboardingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Reverywhere f82909a = new Reverywhere();

        @NotNull
        public static final Parcelable.Creator<Reverywhere> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Reverywhere.f82909a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Reverywhere[i];
            }
        }

        private Reverywhere() {
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

    private ReverywhereOnboardingFlowContract$Step() {
    }
}
