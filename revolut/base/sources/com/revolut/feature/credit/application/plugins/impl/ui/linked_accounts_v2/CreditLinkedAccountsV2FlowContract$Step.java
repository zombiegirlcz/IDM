package com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v2;

import android.os.Parcel;
import android.os.Parcelable;
import av3.h;
import com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v2/CreditLinkedAccountsV2FlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Prompt", "LinkedAccountsHub", "LinkExternalAccount", "Modal", "Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v2/CreditLinkedAccountsV2FlowContract$Step$LinkExternalAccount;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v2/CreditLinkedAccountsV2FlowContract$Step$LinkedAccountsHub;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v2/CreditLinkedAccountsV2FlowContract$Step$Modal;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v2/CreditLinkedAccountsV2FlowContract$Step$Prompt;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CreditLinkedAccountsV2FlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v2/CreditLinkedAccountsV2FlowContract$Step$LinkExternalAccount;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v2/CreditLinkedAccountsV2FlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LinkExternalAccount extends CreditLinkedAccountsV2FlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<LinkExternalAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExternalAccountsFeatureConfig.Configuration.TrueLayer f67829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ExternalAccountsFeatureConfig.Configuration.DirectLink f67830b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f67831c;

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
            this.f67829a = trueLayer;
            this.f67830b = directLink;
            this.f67831c = z;
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
            return Intrinsics.f(this.f67829a, linkExternalAccount.f67829a) && Intrinsics.f(this.f67830b, linkExternalAccount.f67830b) && this.f67831c == linkExternalAccount.f67831c;
        }

        public final int hashCode() {
            ExternalAccountsFeatureConfig.Configuration.TrueLayer trueLayer = this.f67829a;
            int iHashCode = (trueLayer == null ? 0 : trueLayer.hashCode()) * 31;
            ExternalAccountsFeatureConfig.Configuration.DirectLink directLink = this.f67830b;
            return Boolean.hashCode(this.f67831c) + ((iHashCode + (directLink != null ? directLink.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f67829a, i);
            dest.writeParcelable(this.f67830b, i);
            dest.writeInt(this.f67831c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v2/CreditLinkedAccountsV2FlowContract$Step$LinkedAccountsHub;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v2/CreditLinkedAccountsV2FlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LinkedAccountsHub extends CreditLinkedAccountsV2FlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<LinkedAccountsHub> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f67832a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LinkedAccountsHub(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LinkedAccountsHub[i];
            }
        }

        public LinkedAccountsHub(boolean z) {
            this.f67832a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LinkedAccountsHub) && this.f67832a == ((LinkedAccountsHub) obj2).f67832a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f67832a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f67832a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v2/CreditLinkedAccountsV2FlowContract$Step$Modal;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v2/CreditLinkedAccountsV2FlowContract$Step;", "<init>", "()V", "Permissions", "LearnMore", "SkipLinking", "RevolutBankSelected", "CantFindBank", "Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v2/CreditLinkedAccountsV2FlowContract$Step$Modal$CantFindBank;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v2/CreditLinkedAccountsV2FlowContract$Step$Modal$LearnMore;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v2/CreditLinkedAccountsV2FlowContract$Step$Modal$Permissions;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v2/CreditLinkedAccountsV2FlowContract$Step$Modal$RevolutBankSelected;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v2/CreditLinkedAccountsV2FlowContract$Step$Modal$SkipLinking;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Modal extends CreditLinkedAccountsV2FlowContract$Step {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v2/CreditLinkedAccountsV2FlowContract$Step$Modal$CantFindBank;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v2/CreditLinkedAccountsV2FlowContract$Step$Modal;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CantFindBank extends Modal {

            @NotNull
            public static final Parcelable.Creator<CantFindBank> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f67833a;

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
                this.f67833a = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof CantFindBank) && this.f67833a == ((CantFindBank) obj2).f67833a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f67833a);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f67833a ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v2/CreditLinkedAccountsV2FlowContract$Step$Modal$LearnMore;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v2/CreditLinkedAccountsV2FlowContract$Step$Modal;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class LearnMore extends Modal {

            @NotNull
            public static final Parcelable.Creator<LearnMore> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final av3.c f67834a;

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
                this.f67834a = popup;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof LearnMore) && Intrinsics.f(this.f67834a, ((LearnMore) obj2).f67834a);
            }

            public final int hashCode() {
                return this.f67834a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f67834a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v2/CreditLinkedAccountsV2FlowContract$Step$Modal$Permissions;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v2/CreditLinkedAccountsV2FlowContract$Step$Modal;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Permissions extends Modal {

            @NotNull
            public static final Parcelable.Creator<Permissions> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final h f67835a;

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
                this.f67835a = permissions;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Permissions) && Intrinsics.f(this.f67835a, ((Permissions) obj2).f67835a);
            }

            public final int hashCode() {
                return this.f67835a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f67835a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v2/CreditLinkedAccountsV2FlowContract$Step$Modal$RevolutBankSelected;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v2/CreditLinkedAccountsV2FlowContract$Step$Modal;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class RevolutBankSelected extends Modal {

            @NotNull
            public static final Parcelable.Creator<RevolutBankSelected> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f67836a;

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
                this.f67836a = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof RevolutBankSelected) && this.f67836a == ((RevolutBankSelected) obj2).f67836a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f67836a);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f67836a ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v2/CreditLinkedAccountsV2FlowContract$Step$Modal$SkipLinking;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v2/CreditLinkedAccountsV2FlowContract$Step$Modal;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SkipLinking extends Modal {

            @NotNull
            public static final Parcelable.Creator<SkipLinking> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final av3.b f67837a;

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
                this.f67837a = popup;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof SkipLinking) && Intrinsics.f(this.f67837a, ((SkipLinking) obj2).f67837a);
            }

            public final int hashCode() {
                return this.f67837a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f67837a);
            }
        }

        private Modal() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v2/CreditLinkedAccountsV2FlowContract$Step$Prompt;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v2/CreditLinkedAccountsV2FlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Prompt extends CreditLinkedAccountsV2FlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Prompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final av3.d f67838a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Prompt((av3.d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Prompt[i];
            }
        }

        public Prompt(av3.d infoScreen) {
            Intrinsics.checkNotNullParameter(infoScreen, "infoScreen");
            this.f67838a = infoScreen;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Prompt) && Intrinsics.f(this.f67838a, ((Prompt) obj2).f67838a);
        }

        public final int hashCode() {
            return this.f67838a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67838a);
        }
    }

    private CreditLinkedAccountsV2FlowContract$Step() {
    }
}
