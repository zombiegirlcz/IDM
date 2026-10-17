package com.revolut.feature.security_hub.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payees.api.models.PayeesTargetUser;
import com.revolut.feature.security_hub.api.models.DigitizedCard;
import com.revolut.feature.security_hub.api.models.WealthProtectionFeatureState;
import h93.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qtc.k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0013\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0082\u0001\u0013\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'¨\u0006(À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen;", "Landroid/os/Parcelable;", "SecurityHub", "WealthProtection", "WealthProtectionChangeLimit", "GamblingBlock", "ManageMerchants", "LostDevice", "LearnAboutSecurity", "SecureAccount", "SignInMethods", "TransactionsDayNightLimitsWithoutSecurityHub", "TransactionsLimits", "CardSecurity", "LinkedWallets", "LinkedWalletsFromCardSettings", "LinkedWalletDetailsFromDeeplink", "LinkedWalletsAcknowledgeNew", "Payees", "TransactionsLimitChange", "HiddenAccountsAndTransactions", "Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen$CardSecurity;", "Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen$GamblingBlock;", "Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen$HiddenAccountsAndTransactions;", "Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen$LearnAboutSecurity;", "Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen$LinkedWalletDetailsFromDeeplink;", "Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen$LinkedWallets;", "Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen$LinkedWalletsAcknowledgeNew;", "Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen$LinkedWalletsFromCardSettings;", "Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen$LostDevice;", "Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen$ManageMerchants;", "Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen$Payees;", "Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen$SecureAccount;", "Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen$SecurityHub;", "Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen$SignInMethods;", "Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen$TransactionsDayNightLimitsWithoutSecurityHub;", "Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen$TransactionsLimitChange;", "Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen$TransactionsLimits;", "Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen$WealthProtection;", "Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen$WealthProtectionChangeLimit;", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SecurityHubStartScreen extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen$CardSecurity;", "Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen;", "<init>", "()V", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CardSecurity implements SecurityHubStartScreen {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CardSecurity f85373a = new CardSecurity();

        @NotNull
        public static final Parcelable.Creator<CardSecurity> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CardSecurity.f85373a;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen$GamblingBlock;", "Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen;", "<init>", "()V", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GamblingBlock implements SecurityHubStartScreen {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GamblingBlock f85374a = new GamblingBlock();

        @NotNull
        public static final Parcelable.Creator<GamblingBlock> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GamblingBlock.f85374a;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen$HiddenAccountsAndTransactions;", "Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen;", "<init>", "()V", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class HiddenAccountsAndTransactions implements SecurityHubStartScreen {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HiddenAccountsAndTransactions f85375a = new HiddenAccountsAndTransactions();

        @NotNull
        public static final Parcelable.Creator<HiddenAccountsAndTransactions> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return HiddenAccountsAndTransactions.f85375a;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen$LearnAboutSecurity;", "Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen;", "<init>", "()V", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LearnAboutSecurity implements SecurityHubStartScreen {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LearnAboutSecurity f85376a = new LearnAboutSecurity();

        @NotNull
        public static final Parcelable.Creator<LearnAboutSecurity> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LearnAboutSecurity.f85376a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LearnAboutSecurity[i];
            }
        }

        private LearnAboutSecurity() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen$LinkedWalletDetailsFromDeeplink;", "Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LinkedWalletDetailsFromDeeplink implements SecurityHubStartScreen {

        @NotNull
        public static final Parcelable.Creator<LinkedWalletDetailsFromDeeplink> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f0 f85377a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DigitizedCard f85378b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LinkedWalletDetailsFromDeeplink((f0) parcel.readSerializable(), DigitizedCard.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LinkedWalletDetailsFromDeeplink[i];
            }
        }

        public LinkedWalletDetailsFromDeeplink(f0 card, DigitizedCard digitizedCard) {
            Intrinsics.checkNotNullParameter(card, "card");
            Intrinsics.checkNotNullParameter(digitizedCard, "digitizedCard");
            this.f85377a = card;
            this.f85378b = digitizedCard;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LinkedWalletDetailsFromDeeplink)) {
                return false;
            }
            LinkedWalletDetailsFromDeeplink linkedWalletDetailsFromDeeplink = (LinkedWalletDetailsFromDeeplink) obj2;
            return Intrinsics.f(this.f85377a, linkedWalletDetailsFromDeeplink.f85377a) && Intrinsics.f(this.f85378b, linkedWalletDetailsFromDeeplink.f85378b);
        }

        public final int hashCode() {
            return this.f85378b.hashCode() + (this.f85377a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f85377a);
            this.f85378b.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen$LinkedWallets;", "Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen;", "<init>", "()V", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LinkedWallets implements SecurityHubStartScreen {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LinkedWallets f85379a = new LinkedWallets();

        @NotNull
        public static final Parcelable.Creator<LinkedWallets> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LinkedWallets.f85379a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LinkedWallets[i];
            }
        }

        private LinkedWallets() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen$LinkedWalletsAcknowledgeNew;", "Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen;", "<init>", "()V", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LinkedWalletsAcknowledgeNew implements SecurityHubStartScreen {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LinkedWalletsAcknowledgeNew f85380a = new LinkedWalletsAcknowledgeNew();

        @NotNull
        public static final Parcelable.Creator<LinkedWalletsAcknowledgeNew> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LinkedWalletsAcknowledgeNew.f85380a;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen$LinkedWalletsFromCardSettings;", "Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LinkedWalletsFromCardSettings implements SecurityHubStartScreen {

        @NotNull
        public static final Parcelable.Creator<LinkedWalletsFromCardSettings> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f85381a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LinkedWalletsFromCardSettings(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LinkedWalletsFromCardSettings[i];
            }
        }

        public LinkedWalletsFromCardSettings(String cardId) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            this.f85381a = cardId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LinkedWalletsFromCardSettings) && Intrinsics.f(this.f85381a, ((LinkedWalletsFromCardSettings) obj2).f85381a);
        }

        public final int hashCode() {
            return this.f85381a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85381a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen$LostDevice;", "Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen;", "<init>", "()V", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LostDevice implements SecurityHubStartScreen {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LostDevice f85382a = new LostDevice();

        @NotNull
        public static final Parcelable.Creator<LostDevice> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LostDevice.f85382a;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen$ManageMerchants;", "Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen;", "<init>", "()V", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ManageMerchants implements SecurityHubStartScreen {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ManageMerchants f85383a = new ManageMerchants();

        @NotNull
        public static final Parcelable.Creator<ManageMerchants> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ManageMerchants.f85383a;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen$Payees;", "Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Payees implements SecurityHubStartScreen {

        @NotNull
        public static final Parcelable.Creator<Payees> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PayeesTargetUser f85384a;

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
            this.f85384a = targetUser;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Payees) && Intrinsics.f(this.f85384a, ((Payees) obj2).f85384a);
        }

        public final int hashCode() {
            return this.f85384a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f85384a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen$SecureAccount;", "Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen;", "<init>", "()V", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SecureAccount implements SecurityHubStartScreen {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SecureAccount f85385a = new SecureAccount();

        @NotNull
        public static final Parcelable.Creator<SecureAccount> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SecureAccount.f85385a;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen$SecurityHub;", "Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen;", "<init>", "()V", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SecurityHub implements SecurityHubStartScreen {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SecurityHub f85386a = new SecurityHub();

        @NotNull
        public static final Parcelable.Creator<SecurityHub> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SecurityHub.f85386a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SecurityHub[i];
            }
        }

        private SecurityHub() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen$SignInMethods;", "Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen;", "<init>", "()V", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SignInMethods implements SecurityHubStartScreen {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SignInMethods f85387a = new SignInMethods();

        @NotNull
        public static final Parcelable.Creator<SignInMethods> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SignInMethods.f85387a;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen$TransactionsDayNightLimitsWithoutSecurityHub;", "Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen;", "<init>", "()V", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TransactionsDayNightLimitsWithoutSecurityHub implements SecurityHubStartScreen {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TransactionsDayNightLimitsWithoutSecurityHub f85388a = new TransactionsDayNightLimitsWithoutSecurityHub();

        @NotNull
        public static final Parcelable.Creator<TransactionsDayNightLimitsWithoutSecurityHub> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TransactionsDayNightLimitsWithoutSecurityHub.f85388a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransactionsDayNightLimitsWithoutSecurityHub[i];
            }
        }

        private TransactionsDayNightLimitsWithoutSecurityHub() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen$TransactionsLimitChange;", "Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransactionsLimitChange implements SecurityHubStartScreen {

        @NotNull
        public static final Parcelable.Creator<TransactionsLimitChange> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f85389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f85390b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransactionsLimitChange(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransactionsLimitChange[i];
            }
        }

        public TransactionsLimitChange(String limitName, boolean z) {
            Intrinsics.checkNotNullParameter(limitName, "limitName");
            this.f85389a = limitName;
            this.f85390b = z;
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
            return Intrinsics.f(this.f85389a, transactionsLimitChange.f85389a) && this.f85390b == transactionsLimitChange.f85390b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f85390b) + (this.f85389a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85389a);
            dest.writeInt(this.f85390b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen$TransactionsLimits;", "Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen;", "<init>", "()V", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TransactionsLimits implements SecurityHubStartScreen {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TransactionsLimits f85391a = new TransactionsLimits();

        @NotNull
        public static final Parcelable.Creator<TransactionsLimits> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TransactionsLimits.f85391a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransactionsLimits[i];
            }
        }

        private TransactionsLimits() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen$WealthProtection;", "Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen;", "<init>", "()V", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class WealthProtection implements SecurityHubStartScreen {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final WealthProtection f85392a = new WealthProtection();

        @NotNull
        public static final Parcelable.Creator<WealthProtection> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return WealthProtection.f85392a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WealthProtection[i];
            }
        }

        private WealthProtection() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen$WealthProtectionChangeLimit;", "Lcom/revolut/feature/security_hub/api/SecurityHubStartScreen;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WealthProtectionChangeLimit implements SecurityHubStartScreen {

        @NotNull
        public static final Parcelable.Creator<WealthProtectionChangeLimit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f85393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WealthProtectionFeatureState.Visible f85394b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WealthProtectionChangeLimit(k.valueOf(parcel.readString()), (WealthProtectionFeatureState.Visible) parcel.readParcelable(WealthProtectionChangeLimit.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WealthProtectionChangeLimit[i];
            }
        }

        public WealthProtectionChangeLimit(k wealthProtectionFeature, WealthProtectionFeatureState.Visible state) {
            Intrinsics.checkNotNullParameter(wealthProtectionFeature, "wealthProtectionFeature");
            Intrinsics.checkNotNullParameter(state, "state");
            this.f85393a = wealthProtectionFeature;
            this.f85394b = state;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof WealthProtectionChangeLimit)) {
                return false;
            }
            WealthProtectionChangeLimit wealthProtectionChangeLimit = (WealthProtectionChangeLimit) obj2;
            return this.f85393a == wealthProtectionChangeLimit.f85393a && Intrinsics.f(this.f85394b, wealthProtectionChangeLimit.f85394b);
        }

        public final int hashCode() {
            return this.f85394b.hashCode() + (this.f85393a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85393a.name());
            dest.writeParcelable(this.f85394b, i);
        }
    }
}
