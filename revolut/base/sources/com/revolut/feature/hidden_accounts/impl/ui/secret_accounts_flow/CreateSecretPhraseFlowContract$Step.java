package com.revolut.feature.hidden_accounts.impl.ui.secret_accounts_flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/hidden_accounts/impl/ui/secret_accounts_flow/CreateSecretPhraseFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ProductArticle", "CreateSecretPhrase", "AccountMadeSecret", "Lcom/revolut/feature/hidden_accounts/impl/ui/secret_accounts_flow/CreateSecretPhraseFlowContract$Step$AccountMadeSecret;", "Lcom/revolut/feature/hidden_accounts/impl/ui/secret_accounts_flow/CreateSecretPhraseFlowContract$Step$CreateSecretPhrase;", "Lcom/revolut/feature/hidden_accounts/impl/ui/secret_accounts_flow/CreateSecretPhraseFlowContract$Step$ProductArticle;", "feature_hidden_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreateSecretPhraseFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/hidden_accounts/impl/ui/secret_accounts_flow/CreateSecretPhraseFlowContract$Step$AccountMadeSecret;", "Lcom/revolut/feature/hidden_accounts/impl/ui/secret_accounts_flow/CreateSecretPhraseFlowContract$Step;", "<init>", "()V", "feature_hidden_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AccountMadeSecret implements CreateSecretPhraseFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AccountMadeSecret f74681a = new AccountMadeSecret();

        @NotNull
        public static final Parcelable.Creator<AccountMadeSecret> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AccountMadeSecret.f74681a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountMadeSecret[i];
            }
        }

        private AccountMadeSecret() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/hidden_accounts/impl/ui/secret_accounts_flow/CreateSecretPhraseFlowContract$Step$CreateSecretPhrase;", "Lcom/revolut/feature/hidden_accounts/impl/ui/secret_accounts_flow/CreateSecretPhraseFlowContract$Step;", "<init>", "()V", "feature_hidden_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CreateSecretPhrase implements CreateSecretPhraseFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CreateSecretPhrase f74682a = new CreateSecretPhrase();

        @NotNull
        public static final Parcelable.Creator<CreateSecretPhrase> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CreateSecretPhrase.f74682a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreateSecretPhrase[i];
            }
        }

        private CreateSecretPhrase() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/hidden_accounts/impl/ui/secret_accounts_flow/CreateSecretPhraseFlowContract$Step$ProductArticle;", "Lcom/revolut/feature/hidden_accounts/impl/ui/secret_accounts_flow/CreateSecretPhraseFlowContract$Step;", "<init>", "()V", "feature_hidden_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ProductArticle implements CreateSecretPhraseFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProductArticle f74683a = new ProductArticle();

        @NotNull
        public static final Parcelable.Creator<ProductArticle> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ProductArticle.f74683a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductArticle[i];
            }
        }

        private ProductArticle() {
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
