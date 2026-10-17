package com.revolut.feature.hidden_accounts.impl.ui.secret_accounts;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"com/revolut/feature/hidden_accounts/impl/ui/secret_accounts/SecretAccountsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Authentication", "SecretAccountsRoot", "ProductArticle", "UnhideSecretAccountsDialog", "SecretAccountsPicker", "CreateSecretPhrase", "Lcom/revolut/feature/hidden_accounts/impl/ui/secret_accounts/SecretAccountsFlowContract$Step$Authentication;", "Lcom/revolut/feature/hidden_accounts/impl/ui/secret_accounts/SecretAccountsFlowContract$Step$CreateSecretPhrase;", "Lcom/revolut/feature/hidden_accounts/impl/ui/secret_accounts/SecretAccountsFlowContract$Step$ProductArticle;", "Lcom/revolut/feature/hidden_accounts/impl/ui/secret_accounts/SecretAccountsFlowContract$Step$SecretAccountsPicker;", "Lcom/revolut/feature/hidden_accounts/impl/ui/secret_accounts/SecretAccountsFlowContract$Step$SecretAccountsRoot;", "Lcom/revolut/feature/hidden_accounts/impl/ui/secret_accounts/SecretAccountsFlowContract$Step$UnhideSecretAccountsDialog;", "feature_hidden_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SecretAccountsFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/hidden_accounts/impl/ui/secret_accounts/SecretAccountsFlowContract$Step$Authentication;", "Lcom/revolut/feature/hidden_accounts/impl/ui/secret_accounts/SecretAccountsFlowContract$Step;", "<init>", "()V", "feature_hidden_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Authentication implements SecretAccountsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Authentication f74672a = new Authentication();

        @NotNull
        public static final Parcelable.Creator<Authentication> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Authentication.f74672a;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/hidden_accounts/impl/ui/secret_accounts/SecretAccountsFlowContract$Step$CreateSecretPhrase;", "Lcom/revolut/feature/hidden_accounts/impl/ui/secret_accounts/SecretAccountsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_hidden_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreateSecretPhrase implements SecretAccountsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CreateSecretPhrase> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f74673a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreateSecretPhrase(parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreateSecretPhrase[i];
            }
        }

        public CreateSecretPhrase(List selectedAccountIds) {
            Intrinsics.checkNotNullParameter(selectedAccountIds, "selectedAccountIds");
            this.f74673a = selectedAccountIds;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CreateSecretPhrase) && Intrinsics.f(this.f74673a, ((CreateSecretPhrase) obj2).f74673a);
        }

        public final int hashCode() {
            return this.f74673a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeStringList(this.f74673a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/hidden_accounts/impl/ui/secret_accounts/SecretAccountsFlowContract$Step$ProductArticle;", "Lcom/revolut/feature/hidden_accounts/impl/ui/secret_accounts/SecretAccountsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_hidden_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProductArticle implements SecretAccountsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ProductArticle> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductArticleParams f74674a;

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

        public ProductArticle(ProductArticleParams param) {
            Intrinsics.checkNotNullParameter(param, "param");
            this.f74674a = param;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ProductArticle) && Intrinsics.f(this.f74674a, ((ProductArticle) obj2).f74674a);
        }

        public final int hashCode() {
            return this.f74674a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f74674a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/hidden_accounts/impl/ui/secret_accounts/SecretAccountsFlowContract$Step$SecretAccountsPicker;", "Lcom/revolut/feature/hidden_accounts/impl/ui/secret_accounts/SecretAccountsFlowContract$Step;", "<init>", "()V", "feature_hidden_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SecretAccountsPicker implements SecretAccountsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SecretAccountsPicker f74675a = new SecretAccountsPicker();

        @NotNull
        public static final Parcelable.Creator<SecretAccountsPicker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SecretAccountsPicker.f74675a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SecretAccountsPicker[i];
            }
        }

        private SecretAccountsPicker() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/hidden_accounts/impl/ui/secret_accounts/SecretAccountsFlowContract$Step$SecretAccountsRoot;", "Lcom/revolut/feature/hidden_accounts/impl/ui/secret_accounts/SecretAccountsFlowContract$Step;", "<init>", "()V", "feature_hidden_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SecretAccountsRoot implements SecretAccountsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SecretAccountsRoot f74676a = new SecretAccountsRoot();

        @NotNull
        public static final Parcelable.Creator<SecretAccountsRoot> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SecretAccountsRoot.f74676a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SecretAccountsRoot[i];
            }
        }

        private SecretAccountsRoot() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/hidden_accounts/impl/ui/secret_accounts/SecretAccountsFlowContract$Step$UnhideSecretAccountsDialog;", "Lcom/revolut/feature/hidden_accounts/impl/ui/secret_accounts/SecretAccountsFlowContract$Step;", "<init>", "()V", "feature_hidden_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UnhideSecretAccountsDialog implements SecretAccountsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UnhideSecretAccountsDialog f74677a = new UnhideSecretAccountsDialog();

        @NotNull
        public static final Parcelable.Creator<UnhideSecretAccountsDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return UnhideSecretAccountsDialog.f74677a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UnhideSecretAccountsDialog[i];
            }
        }

        private UnhideSecretAccountsDialog() {
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
}
