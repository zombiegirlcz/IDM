package com.revolut.feature.credit.loan.autopay.impl.ui.select_account.selector_v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/credit/loan/autopay/impl/ui/select_account/selector_v2/SelectAccountV2ControllerContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "AddExternalAccount", "ExternalAccountDetails", "Article", "Lcom/revolut/feature/credit/loan/autopay/impl/ui/select_account/selector_v2/SelectAccountV2ControllerContract$ModalStep$AddExternalAccount;", "Lcom/revolut/feature/credit/loan/autopay/impl/ui/select_account/selector_v2/SelectAccountV2ControllerContract$ModalStep$Article;", "Lcom/revolut/feature/credit/loan/autopay/impl/ui/select_account/selector_v2/SelectAccountV2ControllerContract$ModalStep$ExternalAccountDetails;", "feature_credit_loan_autopay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SelectAccountV2ControllerContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/autopay/impl/ui/select_account/selector_v2/SelectAccountV2ControllerContract$ModalStep$AddExternalAccount;", "Lcom/revolut/feature/credit/loan/autopay/impl/ui/select_account/selector_v2/SelectAccountV2ControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_autopay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddExternalAccount extends SelectAccountV2ControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<AddExternalAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70298a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddExternalAccount(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddExternalAccount[i];
            }
        }

        public AddExternalAccount(String userName) {
            Intrinsics.checkNotNullParameter(userName, "userName");
            this.f70298a = userName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AddExternalAccount) && Intrinsics.f(this.f70298a, ((AddExternalAccount) obj2).f70298a);
        }

        public final int hashCode() {
            return this.f70298a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70298a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/autopay/impl/ui/select_account/selector_v2/SelectAccountV2ControllerContract$ModalStep$Article;", "Lcom/revolut/feature/credit/loan/autopay/impl/ui/select_account/selector_v2/SelectAccountV2ControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_autopay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Article extends SelectAccountV2ControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Article> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductArticleParams f70299a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Article((ProductArticleParams) parcel.readParcelable(Article.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Article[i];
            }
        }

        public Article(ProductArticleParams articleParams) {
            Intrinsics.checkNotNullParameter(articleParams, "articleParams");
            this.f70299a = articleParams;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Article) && Intrinsics.f(this.f70299a, ((Article) obj2).f70299a);
        }

        public final int hashCode() {
            return this.f70299a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f70299a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/autopay/impl/ui/select_account/selector_v2/SelectAccountV2ControllerContract$ModalStep$ExternalAccountDetails;", "Lcom/revolut/feature/credit/loan/autopay/impl/ui/select_account/selector_v2/SelectAccountV2ControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_autopay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExternalAccountDetails extends SelectAccountV2ControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ExternalAccountDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x35.b f70300a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExternalAccountDetails((x35.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExternalAccountDetails[i];
            }
        }

        public ExternalAccountDetails(x35.b account) {
            Intrinsics.checkNotNullParameter(account, "account");
            this.f70300a = account;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ExternalAccountDetails) && Intrinsics.f(this.f70300a, ((ExternalAccountDetails) obj2).f70300a);
        }

        public final int hashCode() {
            return this.f70300a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f70300a);
        }
    }

    private SelectAccountV2ControllerContract$ModalStep() {
    }
}
