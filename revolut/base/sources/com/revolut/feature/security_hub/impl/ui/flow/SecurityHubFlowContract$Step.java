package com.revolut.feature.security_hub.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payees.api.models.PayeesTargetUser;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.security_hub.api.models.DigitizedCard;
import com.revolut.feature.security_hub.api.models.WealthProtectionFeatureState;
import com.revolut.feature.security_hub.api.models.WealthProtectionFeaturesState;
import com.revolut.feature.security_hub.impl.interactor.ConnectedWifi;
import com.revolut.feature.security_hub.impl.repository.OutboundTransactionLimit;
import com.revolut.feature.security_hub.impl.ui.LimitType;
import com.revolut.feature.security_hub.impl.ui.street_mode.flow.StreetModeFlowContract$Step;
import com.revolut.feature.security_hub.impl.utils.SecurityHubProductArticleKey;
import com.revolut.kompot.navigable.flow.FlowStep;
import h93.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u001f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f \u0082\u0001\u001f!\"#$%&'()*+,-./0123456789:;<=>?¨\u0006@À\u0006\u0003"}, d2 = {"com/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Initial", "ProductArticle", "SecurityHub", "WealthProtection", "SignInMethods", "ManageMerchants", "GamblingBlock", "TransactionsLimit", "TransactionsDayNightLimits", "TransactionsLimitChange", "WealthProtectionLimitChangeAmount", "LostDevice", "LostCard", "SecureAccount", "LinkedWallets", "LinkedWalletDetails", "AddToClickToPay", "AddToClickToPayProductArticle", "LinkedWalletsAcknowledgeNew", "CardSecurity", "Payees", "Learn", "StreetMode", "StreetModeSetupWithWifi", "WealthProtectionSecurityDelay", "CallSecurityInfoProductArticle", "CallSecurityPermissionRequest", "HiddenAccountsAndTransactions", "HiddenAccountsList", "SecretAccounts", "HiddenTransactions", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$AddToClickToPay;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$AddToClickToPayProductArticle;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$CallSecurityInfoProductArticle;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$CallSecurityPermissionRequest;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$CardSecurity;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$GamblingBlock;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$HiddenAccountsAndTransactions;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$HiddenAccountsList;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$HiddenTransactions;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$Initial;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$Learn;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$LinkedWalletDetails;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$LinkedWallets;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$LinkedWalletsAcknowledgeNew;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$LostCard;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$LostDevice;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$ManageMerchants;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$Payees;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$ProductArticle;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$SecretAccounts;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$SecureAccount;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$SecurityHub;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$SignInMethods;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$StreetMode;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$StreetModeSetupWithWifi;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$TransactionsDayNightLimits;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$TransactionsLimit;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$TransactionsLimitChange;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$WealthProtection;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$WealthProtectionLimitChangeAmount;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$WealthProtectionSecurityDelay;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SecurityHubFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$AddToClickToPay;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddToClickToPay implements SecurityHubFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AddToClickToPay> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f0 f85506a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddToClickToPay((f0) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddToClickToPay[i];
            }
        }

        public AddToClickToPay(f0 revolutCard) {
            Intrinsics.checkNotNullParameter(revolutCard, "revolutCard");
            this.f85506a = revolutCard;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AddToClickToPay) && Intrinsics.f(this.f85506a, ((AddToClickToPay) obj2).f85506a);
        }

        public final int hashCode() {
            return this.f85506a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f85506a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$AddToClickToPayProductArticle;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddToClickToPayProductArticle implements SecurityHubFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AddToClickToPayProductArticle> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f0 f85507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SecurityHubProductArticleKey f85508b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddToClickToPayProductArticle((f0) parcel.readSerializable(), SecurityHubProductArticleKey.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddToClickToPayProductArticle[i];
            }
        }

        public AddToClickToPayProductArticle(f0 revolutCard, SecurityHubProductArticleKey productArticleKey) {
            Intrinsics.checkNotNullParameter(revolutCard, "revolutCard");
            Intrinsics.checkNotNullParameter(productArticleKey, "productArticleKey");
            this.f85507a = revolutCard;
            this.f85508b = productArticleKey;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AddToClickToPayProductArticle)) {
                return false;
            }
            AddToClickToPayProductArticle addToClickToPayProductArticle = (AddToClickToPayProductArticle) obj2;
            return Intrinsics.f(this.f85507a, addToClickToPayProductArticle.f85507a) && this.f85508b == addToClickToPayProductArticle.f85508b;
        }

        public final int hashCode() {
            return this.f85508b.hashCode() + (this.f85507a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f85507a);
            this.f85508b.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$CallSecurityInfoProductArticle;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CallSecurityInfoProductArticle implements SecurityHubFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CallSecurityInfoProductArticle f85509a = new CallSecurityInfoProductArticle();

        @NotNull
        public static final Parcelable.Creator<CallSecurityInfoProductArticle> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CallSecurityInfoProductArticle.f85509a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CallSecurityInfoProductArticle[i];
            }
        }

        private CallSecurityInfoProductArticle() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$CallSecurityPermissionRequest;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CallSecurityPermissionRequest implements SecurityHubFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CallSecurityPermissionRequest f85510a = new CallSecurityPermissionRequest();

        @NotNull
        public static final Parcelable.Creator<CallSecurityPermissionRequest> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CallSecurityPermissionRequest.f85510a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CallSecurityPermissionRequest[i];
            }
        }

        private CallSecurityPermissionRequest() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$CardSecurity;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CardSecurity implements SecurityHubFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CardSecurity f85511a = new CardSecurity();

        @NotNull
        public static final Parcelable.Creator<CardSecurity> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CardSecurity.f85511a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardSecurity[i];
            }
        }

        private CardSecurity() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$GamblingBlock;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GamblingBlock implements SecurityHubFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GamblingBlock f85512a = new GamblingBlock();

        @NotNull
        public static final Parcelable.Creator<GamblingBlock> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GamblingBlock.f85512a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GamblingBlock[i];
            }
        }

        private GamblingBlock() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$HiddenAccountsAndTransactions;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class HiddenAccountsAndTransactions implements SecurityHubFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HiddenAccountsAndTransactions f85513a = new HiddenAccountsAndTransactions();

        @NotNull
        public static final Parcelable.Creator<HiddenAccountsAndTransactions> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return HiddenAccountsAndTransactions.f85513a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HiddenAccountsAndTransactions[i];
            }
        }

        private HiddenAccountsAndTransactions() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$HiddenAccountsList;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class HiddenAccountsList implements SecurityHubFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HiddenAccountsList f85514a = new HiddenAccountsList();

        @NotNull
        public static final Parcelable.Creator<HiddenAccountsList> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return HiddenAccountsList.f85514a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HiddenAccountsList[i];
            }
        }

        private HiddenAccountsList() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$HiddenTransactions;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class HiddenTransactions implements SecurityHubFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HiddenTransactions f85515a = new HiddenTransactions();

        @NotNull
        public static final Parcelable.Creator<HiddenTransactions> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return HiddenTransactions.f85515a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HiddenTransactions[i];
            }
        }

        private HiddenTransactions() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$Initial;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "Destination", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initial implements SecurityHubFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Initial> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Destination f85516a;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$Initial$Destination;", "Landroid/os/Parcelable;", "Default", "Limits", "ChangeTransactionLimit", "WealthProtection", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$Initial$Destination$ChangeTransactionLimit;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$Initial$Destination$Default;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$Initial$Destination$Limits;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$Initial$Destination$WealthProtection;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface Destination extends Parcelable {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$Initial$Destination$ChangeTransactionLimit;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$Initial$Destination;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class ChangeTransactionLimit implements Destination {

                @NotNull
                public static final Parcelable.Creator<ChangeTransactionLimit> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f85517a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final boolean f85518b;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new ChangeTransactionLimit(parcel.readString(), parcel.readInt() != 0);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new ChangeTransactionLimit[i];
                    }
                }

                public ChangeTransactionLimit(String limitName, boolean z) {
                    Intrinsics.checkNotNullParameter(limitName, "limitName");
                    this.f85517a = limitName;
                    this.f85518b = z;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof ChangeTransactionLimit)) {
                        return false;
                    }
                    ChangeTransactionLimit changeTransactionLimit = (ChangeTransactionLimit) obj2;
                    return Intrinsics.f(this.f85517a, changeTransactionLimit.f85517a) && this.f85518b == changeTransactionLimit.f85518b;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.f85518b) + (this.f85517a.hashCode() * 31);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f85517a);
                    dest.writeInt(this.f85518b ? 1 : 0);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$Initial$Destination$Default;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$Initial$Destination;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Default implements Destination {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final Default f85519a = new Default();

                @NotNull
                public static final Parcelable.Creator<Default> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return Default.f85519a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Default[i];
                    }
                }

                private Default() {
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

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$Initial$Destination$Limits;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$Initial$Destination;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Limits implements Destination {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final Limits f85520a = new Limits();

                @NotNull
                public static final Parcelable.Creator<Limits> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return Limits.f85520a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Limits[i];
                    }
                }

                private Limits() {
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

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$Initial$Destination$WealthProtection;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$Initial$Destination;", "Main", "ChangeLimit", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$Initial$Destination$WealthProtection$ChangeLimit;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$Initial$Destination$WealthProtection$Main;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public interface WealthProtection extends Destination {

                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$Initial$Destination$WealthProtection$ChangeLimit;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$Initial$Destination$WealthProtection;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class ChangeLimit implements WealthProtection {

                    @NotNull
                    public static final Parcelable.Creator<ChangeLimit> CREATOR = new a();

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final qtc.k f85521a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final WealthProtectionFeatureState.Visible f85522b;

                    public static final class a implements Parcelable.Creator {
                        @Override // android.os.Parcelable.Creator
                        public final Object createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            return new ChangeLimit(qtc.k.valueOf(parcel.readString()), (WealthProtectionFeatureState.Visible) parcel.readParcelable(ChangeLimit.class.getClassLoader()));
                        }

                        @Override // android.os.Parcelable.Creator
                        public final Object[] newArray(int i) {
                            return new ChangeLimit[i];
                        }
                    }

                    public ChangeLimit(qtc.k wealthProtectionFeature, WealthProtectionFeatureState.Visible state) {
                        Intrinsics.checkNotNullParameter(wealthProtectionFeature, "wealthProtectionFeature");
                        Intrinsics.checkNotNullParameter(state, "state");
                        this.f85521a = wealthProtectionFeature;
                        this.f85522b = state;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj2) {
                        if (this == obj2) {
                            return true;
                        }
                        if (!(obj2 instanceof ChangeLimit)) {
                            return false;
                        }
                        ChangeLimit changeLimit = (ChangeLimit) obj2;
                        return this.f85521a == changeLimit.f85521a && Intrinsics.f(this.f85522b, changeLimit.f85522b);
                    }

                    public final int hashCode() {
                        return this.f85522b.hashCode() + (this.f85521a.hashCode() * 31);
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel dest, int i) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        dest.writeString(this.f85521a.name());
                        dest.writeParcelable(this.f85522b, i);
                    }
                }

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$Initial$Destination$WealthProtection$Main;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$Initial$Destination$WealthProtection;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class Main implements WealthProtection {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final Main f85523a = new Main();

                    @NotNull
                    public static final Parcelable.Creator<Main> CREATOR = new a();

                    public static final class a implements Parcelable.Creator {
                        @Override // android.os.Parcelable.Creator
                        public final Object createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            parcel.readInt();
                            return Main.f85523a;
                        }

                        @Override // android.os.Parcelable.Creator
                        public final Object[] newArray(int i) {
                            return new Main[i];
                        }
                    }

                    private Main() {
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
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Initial((Destination) parcel.readParcelable(Initial.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Initial[i];
            }
        }

        public Initial(Destination destination) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            this.f85516a = destination;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Initial) && Intrinsics.f(this.f85516a, ((Initial) obj2).f85516a);
        }

        public final int hashCode() {
            return this.f85516a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f85516a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$Learn;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Learn implements SecurityHubFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Learn f85524a = new Learn();

        @NotNull
        public static final Parcelable.Creator<Learn> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Learn.f85524a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Learn[i];
            }
        }

        private Learn() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$LinkedWalletDetails;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LinkedWalletDetails implements SecurityHubFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<LinkedWalletDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f0 f85525a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DigitizedCard f85526b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final vuc.g f85527c;
        public final tuc.m d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LinkedWalletDetails((f0) parcel.readSerializable(), (DigitizedCard) parcel.readParcelable(LinkedWalletDetails.class.getClassLoader()), vuc.g.valueOf(parcel.readString()), tuc.m.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LinkedWalletDetails[i];
            }
        }

        public LinkedWalletDetails(f0 revolutCard, DigitizedCard digitizedCard, vuc.g entryPoint, tuc.m screenType) {
            Intrinsics.checkNotNullParameter(revolutCard, "revolutCard");
            Intrinsics.checkNotNullParameter(digitizedCard, "digitizedCard");
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            Intrinsics.checkNotNullParameter(screenType, "screenType");
            this.f85525a = revolutCard;
            this.f85526b = digitizedCard;
            this.f85527c = entryPoint;
            this.d = screenType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LinkedWalletDetails)) {
                return false;
            }
            LinkedWalletDetails linkedWalletDetails = (LinkedWalletDetails) obj2;
            return Intrinsics.f(this.f85525a, linkedWalletDetails.f85525a) && Intrinsics.f(this.f85526b, linkedWalletDetails.f85526b) && this.f85527c == linkedWalletDetails.f85527c && this.d == linkedWalletDetails.d;
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.f85527c.hashCode() + ((this.f85526b.hashCode() + (this.f85525a.hashCode() * 31)) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f85525a);
            dest.writeParcelable(this.f85526b, i);
            dest.writeString(this.f85527c.name());
            dest.writeString(this.d.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$LinkedWallets;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LinkedWallets implements SecurityHubFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<LinkedWallets> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final vuc.g f85528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f85529b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LinkedWallets(vuc.g.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LinkedWallets[i];
            }
        }

        public LinkedWallets(vuc.g entryPoint, String str) {
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            this.f85528a = entryPoint;
            this.f85529b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LinkedWallets)) {
                return false;
            }
            LinkedWallets linkedWallets = (LinkedWallets) obj2;
            return this.f85528a == linkedWallets.f85528a && Intrinsics.f(this.f85529b, linkedWallets.f85529b);
        }

        public final int hashCode() {
            int iHashCode = this.f85528a.hashCode() * 31;
            String str = this.f85529b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85528a.name());
            dest.writeString(this.f85529b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$LinkedWalletsAcknowledgeNew;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LinkedWalletsAcknowledgeNew implements SecurityHubFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LinkedWalletsAcknowledgeNew f85530a = new LinkedWalletsAcknowledgeNew();

        @NotNull
        public static final Parcelable.Creator<LinkedWalletsAcknowledgeNew> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LinkedWalletsAcknowledgeNew.f85530a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LinkedWalletsAcknowledgeNew[i];
            }
        }

        private LinkedWalletsAcknowledgeNew() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$LostCard;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LostCard implements SecurityHubFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<LostCard> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f0 f85531a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LostCard((f0) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LostCard[i];
            }
        }

        public LostCard(f0 revolutCard) {
            Intrinsics.checkNotNullParameter(revolutCard, "revolutCard");
            this.f85531a = revolutCard;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LostCard) && Intrinsics.f(this.f85531a, ((LostCard) obj2).f85531a);
        }

        public final int hashCode() {
            return this.f85531a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f85531a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$LostDevice;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LostDevice implements SecurityHubFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LostDevice f85532a = new LostDevice();

        @NotNull
        public static final Parcelable.Creator<LostDevice> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LostDevice.f85532a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LostDevice[i];
            }
        }

        private LostDevice() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$ManageMerchants;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ManageMerchants implements SecurityHubFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ManageMerchants f85533a = new ManageMerchants();

        @NotNull
        public static final Parcelable.Creator<ManageMerchants> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ManageMerchants.f85533a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ManageMerchants[i];
            }
        }

        private ManageMerchants() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$Payees;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Payees implements SecurityHubFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Payees> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PayeesTargetUser f85534a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Payees((PayeesTargetUser) parcel.readParcelable(Payees.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Payees[i];
            }
        }

        public Payees(PayeesTargetUser targetUser) {
            Intrinsics.checkNotNullParameter(targetUser, "targetUser");
            this.f85534a = targetUser;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Payees) && Intrinsics.f(this.f85534a, ((Payees) obj2).f85534a);
        }

        public final int hashCode() {
            return this.f85534a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f85534a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$SecretAccounts;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SecretAccounts implements SecurityHubFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SecretAccounts f85538a = new SecretAccounts();

        @NotNull
        public static final Parcelable.Creator<SecretAccounts> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SecretAccounts.f85538a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SecretAccounts[i];
            }
        }

        private SecretAccounts() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$SecureAccount;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SecureAccount implements SecurityHubFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SecureAccount f85539a = new SecureAccount();

        @NotNull
        public static final Parcelable.Creator<SecureAccount> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SecureAccount.f85539a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SecureAccount[i];
            }
        }

        private SecureAccount() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$SignInMethods;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SignInMethods implements SecurityHubFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SignInMethods f85541a = new SignInMethods();

        @NotNull
        public static final Parcelable.Creator<SignInMethods> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SignInMethods.f85541a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SignInMethods[i];
            }
        }

        private SignInMethods() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$StreetMode;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StreetMode implements SecurityHubFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<StreetMode> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StreetModeFlowContract$Step f85542a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StreetMode((StreetModeFlowContract$Step) parcel.readParcelable(StreetMode.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StreetMode[i];
            }
        }

        public StreetMode(StreetModeFlowContract$Step initialStep) {
            Intrinsics.checkNotNullParameter(initialStep, "initialStep");
            this.f85542a = initialStep;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof StreetMode) && Intrinsics.f(this.f85542a, ((StreetMode) obj2).f85542a);
        }

        public final int hashCode() {
            return this.f85542a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f85542a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$StreetModeSetupWithWifi;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StreetModeSetupWithWifi implements SecurityHubFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<StreetModeSetupWithWifi> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConnectedWifi f85543a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StreetModeSetupWithWifi(ConnectedWifi.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StreetModeSetupWithWifi[i];
            }
        }

        public StreetModeSetupWithWifi(ConnectedWifi connectedWifi) {
            Intrinsics.checkNotNullParameter(connectedWifi, "connectedWifi");
            this.f85543a = connectedWifi;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof StreetModeSetupWithWifi) && Intrinsics.f(this.f85543a, ((StreetModeSetupWithWifi) obj2).f85543a);
        }

        public final int hashCode() {
            return this.f85543a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f85543a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$TransactionsDayNightLimits;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TransactionsDayNightLimits implements SecurityHubFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TransactionsDayNightLimits f85544a = new TransactionsDayNightLimits();

        @NotNull
        public static final Parcelable.Creator<TransactionsDayNightLimits> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TransactionsDayNightLimits.f85544a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransactionsDayNightLimits[i];
            }
        }

        private TransactionsDayNightLimits() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$TransactionsLimit;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TransactionsLimit implements SecurityHubFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TransactionsLimit f85545a = new TransactionsLimit();

        @NotNull
        public static final Parcelable.Creator<TransactionsLimit> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TransactionsLimit.f85545a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransactionsLimit[i];
            }
        }

        private TransactionsLimit() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$TransactionsLimitChange;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransactionsLimitChange implements SecurityHubFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TransactionsLimitChange> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OutboundTransactionLimit f85546a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LimitType f85547b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransactionsLimitChange(OutboundTransactionLimit.CREATOR.createFromParcel(parcel), (LimitType) parcel.readParcelable(TransactionsLimitChange.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransactionsLimitChange[i];
            }
        }

        public TransactionsLimitChange(OutboundTransactionLimit limit, LimitType limitType) {
            Intrinsics.checkNotNullParameter(limit, "limit");
            Intrinsics.checkNotNullParameter(limitType, "limitType");
            this.f85546a = limit;
            this.f85547b = limitType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TransactionsLimitChange)) {
                return false;
            }
            TransactionsLimitChange transactionsLimitChange = (TransactionsLimitChange) obj2;
            return Intrinsics.f(this.f85546a, transactionsLimitChange.f85546a) && Intrinsics.f(this.f85547b, transactionsLimitChange.f85547b);
        }

        public final int hashCode() {
            return this.f85547b.hashCode() + (this.f85546a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f85546a.writeToParcel(dest, i);
            dest.writeParcelable(this.f85547b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$WealthProtection;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WealthProtection implements SecurityHubFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<WealthProtection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WealthProtectionFeaturesState f85548a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WealthProtection((WealthProtectionFeaturesState) parcel.readParcelable(WealthProtection.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WealthProtection[i];
            }
        }

        public WealthProtection(WealthProtectionFeaturesState wealthProtectionFeaturesState) {
            Intrinsics.checkNotNullParameter(wealthProtectionFeaturesState, "wealthProtectionFeaturesState");
            this.f85548a = wealthProtectionFeaturesState;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof WealthProtection) && Intrinsics.f(this.f85548a, ((WealthProtection) obj2).f85548a);
        }

        public final int hashCode() {
            return this.f85548a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f85548a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$WealthProtectionLimitChangeAmount;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WealthProtectionLimitChangeAmount implements SecurityHubFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<WealthProtectionLimitChangeAmount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final qtc.k f85549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WealthProtectionFeatureState.Visible f85550b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WealthProtectionLimitChangeAmount(qtc.k.valueOf(parcel.readString()), (WealthProtectionFeatureState.Visible) parcel.readParcelable(WealthProtectionLimitChangeAmount.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WealthProtectionLimitChangeAmount[i];
            }
        }

        public WealthProtectionLimitChangeAmount(qtc.k feature, WealthProtectionFeatureState.Visible state) {
            Intrinsics.checkNotNullParameter(feature, "feature");
            Intrinsics.checkNotNullParameter(state, "state");
            this.f85549a = feature;
            this.f85550b = state;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof WealthProtectionLimitChangeAmount)) {
                return false;
            }
            WealthProtectionLimitChangeAmount wealthProtectionLimitChangeAmount = (WealthProtectionLimitChangeAmount) obj2;
            return this.f85549a == wealthProtectionLimitChangeAmount.f85549a && Intrinsics.f(this.f85550b, wealthProtectionLimitChangeAmount.f85550b);
        }

        public final int hashCode() {
            return this.f85550b.hashCode() + (this.f85549a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85549a.name());
            dest.writeParcelable(this.f85550b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$WealthProtectionSecurityDelay;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WealthProtectionSecurityDelay implements SecurityHubFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<WealthProtectionSecurityDelay> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Initial.Destination.WealthProtection f85551a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f85552b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WealthProtectionSecurityDelay((Initial.Destination.WealthProtection) parcel.readParcelable(WealthProtectionSecurityDelay.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WealthProtectionSecurityDelay[i];
            }
        }

        public WealthProtectionSecurityDelay(Initial.Destination.WealthProtection nextStep, boolean z) {
            Intrinsics.checkNotNullParameter(nextStep, "nextStep");
            this.f85551a = nextStep;
            this.f85552b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof WealthProtectionSecurityDelay)) {
                return false;
            }
            WealthProtectionSecurityDelay wealthProtectionSecurityDelay = (WealthProtectionSecurityDelay) obj2;
            return Intrinsics.f(this.f85551a, wealthProtectionSecurityDelay.f85551a) && this.f85552b == wealthProtectionSecurityDelay.f85552b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f85552b) + (this.f85551a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f85551a, i);
            dest.writeInt(this.f85552b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$SecurityHub;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SecurityHub implements SecurityHubFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SecurityHub> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f85540a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SecurityHub(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SecurityHub[i];
            }
        }

        public SecurityHub(boolean z) {
            this.f85540a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SecurityHub) && this.f85540a == ((SecurityHub) obj2).f85540a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f85540a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f85540a ? 1 : 0);
        }

        public SecurityHub() {
            this(false);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step$ProductArticle;", "Lcom/revolut/feature/security_hub/impl/ui/flow/SecurityHubFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/security_hub/impl/ui/flow/a", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProductArticle implements SecurityHubFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ProductArticle> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductArticleParams f85535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SecurityHubFlowContract$Step f85536b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.revolut.feature.security_hub.impl.ui.flow.a f85537c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProductArticle((ProductArticleParams) parcel.readParcelable(ProductArticle.class.getClassLoader()), (SecurityHubFlowContract$Step) parcel.readParcelable(ProductArticle.class.getClassLoader()), parcel.readInt() == 0 ? null : com.revolut.feature.security_hub.impl.ui.flow.a.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductArticle[i];
            }
        }

        public ProductArticle(ProductArticleParams productArticleParams, SecurityHubFlowContract$Step securityHubFlowContract$Step, com.revolut.feature.security_hub.impl.ui.flow.a aVar, boolean z) {
            Intrinsics.checkNotNullParameter(productArticleParams, "productArticleParams");
            this.f85535a = productArticleParams;
            this.f85536b = securityHubFlowContract$Step;
            this.f85537c = aVar;
            this.d = z;
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
            return Intrinsics.f(this.f85535a, productArticle.f85535a) && Intrinsics.f(this.f85536b, productArticle.f85536b) && this.f85537c == productArticle.f85537c && this.d == productArticle.d;
        }

        public final int hashCode() {
            int iHashCode = this.f85535a.hashCode() * 31;
            SecurityHubFlowContract$Step securityHubFlowContract$Step = this.f85536b;
            int iHashCode2 = (iHashCode + (securityHubFlowContract$Step == null ? 0 : securityHubFlowContract$Step.hashCode())) * 31;
            com.revolut.feature.security_hub.impl.ui.flow.a aVar = this.f85537c;
            return Boolean.hashCode(this.d) + ((iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f85535a, i);
            dest.writeParcelable(this.f85536b, i);
            com.revolut.feature.security_hub.impl.ui.flow.a aVar = this.f85537c;
            if (aVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(aVar.name());
            }
            dest.writeInt(this.d ? 1 : 0);
        }

        public /* synthetic */ ProductArticle(ProductArticleParams productArticleParams, SecurityHubFlowContract$Step securityHubFlowContract$Step, com.revolut.feature.security_hub.impl.ui.flow.a aVar, boolean z, int i) {
            this(productArticleParams, securityHubFlowContract$Step, (i & 4) != 0 ? null : aVar, (i & 8) != 0 ? false : z);
        }
    }
}
