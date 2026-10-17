package com.revolut.feature.hidden_accounts.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.hidden_accounts.api.domain.HiddenAccountsConfig;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import na7.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/hidden_accounts/impl/ui/flow/HiddenAccountsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Authentication", "HiddenAccountsList", "ProductArticle", "Lcom/revolut/feature/hidden_accounts/impl/ui/flow/HiddenAccountsFlowContract$Step$Authentication;", "Lcom/revolut/feature/hidden_accounts/impl/ui/flow/HiddenAccountsFlowContract$Step$HiddenAccountsList;", "Lcom/revolut/feature/hidden_accounts/impl/ui/flow/HiddenAccountsFlowContract$Step$ProductArticle;", "feature_hidden_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface HiddenAccountsFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/hidden_accounts/impl/ui/flow/HiddenAccountsFlowContract$Step$Authentication;", "Lcom/revolut/feature/hidden_accounts/impl/ui/flow/HiddenAccountsFlowContract$Step;", "<init>", "()V", "feature_hidden_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Authentication implements HiddenAccountsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Authentication f74663a = new Authentication();

        @NotNull
        public static final Parcelable.Creator<Authentication> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Authentication.f74663a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Authentication[i];
            }
        }

        private Authentication() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/hidden_accounts/impl/ui/flow/HiddenAccountsFlowContract$Step$HiddenAccountsList;", "Lcom/revolut/feature/hidden_accounts/impl/ui/flow/HiddenAccountsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_hidden_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class HiddenAccountsList implements HiddenAccountsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<HiddenAccountsList> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HiddenAccountsConfig f74664a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f74665b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new HiddenAccountsList((HiddenAccountsConfig) parcel.readParcelable(HiddenAccountsList.class.getClassLoader()), b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HiddenAccountsList[i];
            }
        }

        public HiddenAccountsList(HiddenAccountsConfig config, b accountType) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            this.f74664a = config;
            this.f74665b = accountType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof HiddenAccountsList)) {
                return false;
            }
            HiddenAccountsList hiddenAccountsList = (HiddenAccountsList) obj2;
            return Intrinsics.f(this.f74664a, hiddenAccountsList.f74664a) && this.f74665b == hiddenAccountsList.f74665b;
        }

        public final int hashCode() {
            return this.f74665b.hashCode() + (this.f74664a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f74664a, i);
            dest.writeString(this.f74665b.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/hidden_accounts/impl/ui/flow/HiddenAccountsFlowContract$Step$ProductArticle;", "Lcom/revolut/feature/hidden_accounts/impl/ui/flow/HiddenAccountsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_hidden_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProductArticle implements HiddenAccountsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ProductArticle> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductArticleParams f74666a;

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

        public ProductArticle(ProductArticleParams productArticleParams) {
            Intrinsics.checkNotNullParameter(productArticleParams, "productArticleParams");
            this.f74666a = productArticleParams;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ProductArticle) && Intrinsics.f(this.f74666a, ((ProductArticle) obj2).f74666a);
        }

        public final int hashCode() {
            return this.f74666a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f74666a, i);
        }
    }
}
