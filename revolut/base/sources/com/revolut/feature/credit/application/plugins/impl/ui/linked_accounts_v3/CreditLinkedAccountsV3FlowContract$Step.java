package com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v3;

import android.os.Parcel;
import android.os.Parcelable;
import av3.d;
import av3.h;
import com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v3/CreditLinkedAccountsV3FlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Prompt", "LinkedAccountsHub", "LinkExternalAccount", "Modal", "Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v3/CreditLinkedAccountsV3FlowContract$Step$LinkExternalAccount;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v3/CreditLinkedAccountsV3FlowContract$Step$LinkedAccountsHub;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v3/CreditLinkedAccountsV3FlowContract$Step$Modal;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v3/CreditLinkedAccountsV3FlowContract$Step$Prompt;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CreditLinkedAccountsV3FlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v3/CreditLinkedAccountsV3FlowContract$Step$LinkExternalAccount;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v3/CreditLinkedAccountsV3FlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LinkExternalAccount extends CreditLinkedAccountsV3FlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<LinkExternalAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExternalAccountsFeatureConfig.Configuration.TrueLayer f67858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ExternalAccountsFeatureConfig.Configuration.DirectLink f67859b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f67860c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LinkExternalAccount((ExternalAccountsFeatureConfig.Configuration.TrueLayer) parcel.readParcelable(LinkExternalAccount.class.getClassLoader()), (ExternalAccountsFeatureConfig.Configuration.DirectLink) parcel.readParcelable(LinkExternalAccount.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LinkExternalAccount[i];
            }
        }

        public LinkExternalAccount(ExternalAccountsFeatureConfig.Configuration.TrueLayer trueLayer, ExternalAccountsFeatureConfig.Configuration.DirectLink directLink, boolean z) {
            this.f67858a = trueLayer;
            this.f67859b = directLink;
            this.f67860c = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LinkExternalAccount)) {
                return false;
            }
            LinkExternalAccount linkExternalAccount = (LinkExternalAccount) obj2;
            return Intrinsics.f(this.f67858a, linkExternalAccount.f67858a) && Intrinsics.f(this.f67859b, linkExternalAccount.f67859b) && this.f67860c == linkExternalAccount.f67860c;
        }

        public final int hashCode() {
            ExternalAccountsFeatureConfig.Configuration.TrueLayer trueLayer = this.f67858a;
            int iHashCode = (trueLayer == null ? 0 : trueLayer.hashCode()) * 31;
            ExternalAccountsFeatureConfig.Configuration.DirectLink directLink = this.f67859b;
            return Boolean.hashCode(this.f67860c) + ((iHashCode + (directLink != null ? directLink.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f67858a, i);
            dest.writeParcelable(this.f67859b, i);
            dest.writeInt(this.f67860c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v3/CreditLinkedAccountsV3FlowContract$Step$LinkedAccountsHub;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v3/CreditLinkedAccountsV3FlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LinkedAccountsHub extends CreditLinkedAccountsV3FlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<LinkedAccountsHub> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f67861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f67862b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LinkedAccountsHub(parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LinkedAccountsHub[i];
            }
        }

        public LinkedAccountsHub(boolean z, boolean z3) {
            this.f67861a = z;
            this.f67862b = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LinkedAccountsHub)) {
                return false;
            }
            LinkedAccountsHub linkedAccountsHub = (LinkedAccountsHub) obj2;
            return this.f67861a == linkedAccountsHub.f67861a && this.f67862b == linkedAccountsHub.f67862b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f67862b) + (Boolean.hashCode(this.f67861a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f67861a ? 1 : 0);
            dest.writeInt(this.f67862b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v3/CreditLinkedAccountsV3FlowContract$Step$Modal;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v3/CreditLinkedAccountsV3FlowContract$Step;", "<init>", "()V", "Permissions", "LearnMore", "SkipLinking", "RevolutBankSelected", "CantFindBank", "Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v3/CreditLinkedAccountsV3FlowContract$Step$Modal$CantFindBank;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v3/CreditLinkedAccountsV3FlowContract$Step$Modal$LearnMore;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v3/CreditLinkedAccountsV3FlowContract$Step$Modal$Permissions;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v3/CreditLinkedAccountsV3FlowContract$Step$Modal$RevolutBankSelected;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v3/CreditLinkedAccountsV3FlowContract$Step$Modal$SkipLinking;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Modal extends CreditLinkedAccountsV3FlowContract$Step {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v3/CreditLinkedAccountsV3FlowContract$Step$Modal$CantFindBank;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v3/CreditLinkedAccountsV3FlowContract$Step$Modal;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CantFindBank extends Modal {

            @NotNull
            public static final Parcelable.Creator<CantFindBank> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f67863a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CantFindBank(parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CantFindBank[i];
                }
            }

            public CantFindBank(boolean z) {
                this.f67863a = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof CantFindBank) && this.f67863a == ((CantFindBank) obj2).f67863a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f67863a);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f67863a ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v3/CreditLinkedAccountsV3FlowContract$Step$Modal$LearnMore;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v3/CreditLinkedAccountsV3FlowContract$Step$Modal;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class LearnMore extends Modal {

            @NotNull
            public static final Parcelable.Creator<LearnMore> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final av3.c f67864a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new LearnMore((av3.c) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new LearnMore[i];
                }
            }

            public LearnMore(av3.c popup) {
                Intrinsics.checkNotNullParameter(popup, "popup");
                this.f67864a = popup;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof LearnMore) && Intrinsics.f(this.f67864a, ((LearnMore) obj2).f67864a);
            }

            public final int hashCode() {
                return this.f67864a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f67864a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v3/CreditLinkedAccountsV3FlowContract$Step$Modal$Permissions;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v3/CreditLinkedAccountsV3FlowContract$Step$Modal;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Permissions extends Modal {

            @NotNull
            public static final Parcelable.Creator<Permissions> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final h f67865a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Permissions((h) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Permissions[i];
                }
            }

            public Permissions(h permissions) {
                Intrinsics.checkNotNullParameter(permissions, "permissions");
                this.f67865a = permissions;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Permissions) && Intrinsics.f(this.f67865a, ((Permissions) obj2).f67865a);
            }

            public final int hashCode() {
                return this.f67865a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f67865a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v3/CreditLinkedAccountsV3FlowContract$Step$Modal$RevolutBankSelected;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v3/CreditLinkedAccountsV3FlowContract$Step$Modal;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class RevolutBankSelected extends Modal {

            @NotNull
            public static final Parcelable.Creator<RevolutBankSelected> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f67866a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new RevolutBankSelected(parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new RevolutBankSelected[i];
                }
            }

            public RevolutBankSelected(boolean z) {
                this.f67866a = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof RevolutBankSelected) && this.f67866a == ((RevolutBankSelected) obj2).f67866a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f67866a);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f67866a ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v3/CreditLinkedAccountsV3FlowContract$Step$Modal$SkipLinking;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v3/CreditLinkedAccountsV3FlowContract$Step$Modal;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SkipLinking extends Modal {

            @NotNull
            public static final Parcelable.Creator<SkipLinking> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final av3.b f67867a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new SkipLinking((av3.b) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SkipLinking[i];
                }
            }

            public SkipLinking(av3.b popup) {
                Intrinsics.checkNotNullParameter(popup, "popup");
                this.f67867a = popup;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof SkipLinking) && Intrinsics.f(this.f67867a, ((SkipLinking) obj2).f67867a);
            }

            public final int hashCode() {
                return this.f67867a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f67867a);
            }
        }

        private Modal() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v3/CreditLinkedAccountsV3FlowContract$Step$Prompt;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v3/CreditLinkedAccountsV3FlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Prompt extends CreditLinkedAccountsV3FlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Prompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f67868a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Prompt((d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Prompt[i];
            }
        }

        public Prompt(d infoScreen) {
            Intrinsics.checkNotNullParameter(infoScreen, "infoScreen");
            this.f67868a = infoScreen;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Prompt) && Intrinsics.f(this.f67868a, ((Prompt) obj2).f67868a);
        }

        public final int hashCode() {
            return this.f67868a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67868a);
        }
    }

    private CreditLinkedAccountsV3FlowContract$Step() {
    }
}
