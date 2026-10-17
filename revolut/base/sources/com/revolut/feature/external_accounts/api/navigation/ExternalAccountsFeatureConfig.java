package com.revolut.feature.external_accounts.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.external_accounts.api.model.PlaidConfig;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import yhm.d;
import zhm.f0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "<init>", "()V", "LinkSuccess", "Permissions", "Configuration", "AppToApp", "Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig$AppToApp;", "Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig$LinkSuccess;", "Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig$Permissions;", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ExternalAccountsFeatureConfig implements FeatureConfig {

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig$AppToApp;", "Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig;", "<init>", "()V", "AuthenticateAccounts", "Payment", "Funds", "Configuration", "Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig$AppToApp$AuthenticateAccounts;", "Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig$AppToApp$Funds;", "Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig$AppToApp$Payment;", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class AppToApp extends ExternalAccountsFeatureConfig {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig$AppToApp$AuthenticateAccounts;", "Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig$AppToApp;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class AuthenticateAccounts extends AppToApp {

            @NotNull
            public static final Parcelable.Creator<AuthenticateAccounts> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Configuration f72271a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new AuthenticateAccounts(Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new AuthenticateAccounts[i];
                }
            }

            public AuthenticateAccounts(Configuration configuration) {
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                this.f72271a = configuration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof AuthenticateAccounts) && Intrinsics.f(this.f72271a, ((AuthenticateAccounts) obj2).f72271a);
            }

            public final int hashCode() {
                return this.f72271a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f72271a.writeToParcel(dest, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig$AppToApp$Configuration;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Configuration implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Configuration> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f72272a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f72273b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f72274c;
            public final String d;
            public final String e;
            public final String f;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Configuration(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Configuration[i];
                }
            }

            public Configuration(String str, String str2, String request, String clientId, String redirectUri, String str3) {
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(clientId, "clientId");
                Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
                this.f72272a = str;
                this.f72273b = str2;
                this.f72274c = request;
                this.d = clientId;
                this.e = redirectUri;
                this.f = str3;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Configuration)) {
                    return false;
                }
                Configuration configuration = (Configuration) obj2;
                return Intrinsics.f(this.f72272a, configuration.f72272a) && Intrinsics.f(this.f72273b, configuration.f72273b) && Intrinsics.f(this.f72274c, configuration.f72274c) && Intrinsics.f(this.d, configuration.d) && Intrinsics.f(this.e, configuration.e) && Intrinsics.f(this.f, configuration.f);
            }

            public final int hashCode() {
                String str = this.f72272a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f72273b;
                int iC = p.a.c(p.a.c(p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f72274c), 31, this.d), 31, this.e);
                String str3 = this.f;
                return iC + (str3 != null ? str3.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f72272a);
                dest.writeString(this.f72273b);
                dest.writeString(this.f72274c);
                dest.writeString(this.d);
                dest.writeString(this.e);
                dest.writeString(this.f);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig$AppToApp$Funds;", "Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig$AppToApp;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @d
        public static final /* data */ class Funds extends AppToApp {

            @NotNull
            public static final Parcelable.Creator<Funds> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Configuration f72275a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Funds(Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Funds[i];
                }
            }

            public Funds(Configuration configuration) {
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                this.f72275a = configuration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Funds) && Intrinsics.f(this.f72275a, ((Funds) obj2).f72275a);
            }

            public final int hashCode() {
                return this.f72275a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f72275a.writeToParcel(dest, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig$AppToApp$Payment;", "Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig$AppToApp;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Payment extends AppToApp {

            @NotNull
            public static final Parcelable.Creator<Payment> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Configuration f72276a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Payment(Configuration.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Payment[i];
                }
            }

            public Payment(Configuration configuration) {
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                this.f72276a = configuration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Payment) && Intrinsics.f(this.f72276a, ((Payment) obj2).f72276a);
            }

            public final int hashCode() {
                return this.f72276a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f72276a.writeToParcel(dest, i);
            }
        }

        private AppToApp() {
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig$Configuration;", "Landroid/os/Parcelable;", "<init>", "()V", "TrueLayer", "DirectLink", "ExternalInstitutionsConfiguration", "ExternalConsentConfiguration", "Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig$Configuration$DirectLink;", "Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig$Configuration$TrueLayer;", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Configuration implements Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig$Configuration$DirectLink;", "Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig$Configuration;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DirectLink extends Configuration {

            @NotNull
            public static final Parcelable.Creator<DirectLink> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Integer f72277a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final PlaidConfig f72278b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final x61.d f72279c;
            public final boolean d;
            public final NaviCommand e;
            public final AnalyticsProduct f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final boolean f72280g;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    boolean z;
                    NaviCommand naviCommand;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                    PlaidConfig plaidConfig = (PlaidConfig) parcel.readParcelable(DirectLink.class.getClassLoader());
                    x61.d dVar = (x61.d) parcel.readSerializable();
                    boolean z3 = parcel.readInt() != 0;
                    NaviCommand naviCommand2 = (NaviCommand) parcel.readParcelable(DirectLink.class.getClassLoader());
                    AnalyticsProduct analyticsProduct = (AnalyticsProduct) parcel.readParcelable(DirectLink.class.getClassLoader());
                    if (parcel.readInt() != 0) {
                        naviCommand = naviCommand2;
                        z = true;
                    } else {
                        z = false;
                        naviCommand = naviCommand2;
                    }
                    return new DirectLink(numValueOf, plaidConfig, dVar, z3, naviCommand, analyticsProduct, z);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new DirectLink[i];
                }
            }

            public DirectLink() {
                this(null, null, null, null, null, CertificateBody.profileType);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof DirectLink)) {
                    return false;
                }
                DirectLink directLink = (DirectLink) obj2;
                return Intrinsics.f(this.f72277a, directLink.f72277a) && Intrinsics.f(this.f72278b, directLink.f72278b) && Intrinsics.f(this.f72279c, directLink.f72279c) && this.d == directLink.d && Intrinsics.f(this.e, directLink.e) && Intrinsics.f(this.f, directLink.f) && this.f72280g == directLink.f72280g;
            }

            public final int hashCode() {
                Integer num = this.f72277a;
                int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
                PlaidConfig plaidConfig = this.f72278b;
                int iC = j6.a.c(j6.a.c((iHashCode + (plaidConfig == null ? 0 : plaidConfig.hashCode())) * 31, 31, this.f72279c.f303012a), 31, this.d);
                NaviCommand naviCommand = this.e;
                int iHashCode2 = (iC + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31;
                AnalyticsProduct analyticsProduct = this.f;
                return Boolean.hashCode(this.f72280g) + ((iHashCode2 + (analyticsProduct != null ? analyticsProduct.hashCode() : 0)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Integer num = this.f72277a;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    p.a.B(dest, 1, num);
                }
                dest.writeParcelable(this.f72278b, i);
                dest.writeSerializable(this.f72279c);
                dest.writeInt(this.d ? 1 : 0);
                dest.writeParcelable(this.e, i);
                dest.writeParcelable(this.f, i);
                dest.writeInt(this.f72280g ? 1 : 0);
            }

            public DirectLink(Integer num, PlaidConfig plaidConfig, x61.d linkingScope, boolean z, NaviCommand naviCommand, AnalyticsProduct analyticsProduct, boolean z3) {
                Intrinsics.checkNotNullParameter(linkingScope, "linkingScope");
                this.f72277a = num;
                this.f72278b = plaidConfig;
                this.f72279c = linkingScope;
                this.d = z;
                this.e = naviCommand;
                this.f = analyticsProduct;
                this.f72280g = z3;
            }

            public /* synthetic */ DirectLink(Integer num, PlaidConfig plaidConfig, x61.d dVar, NaviCommand naviCommand, AnalyticsProduct.Retail retail, int i) {
                this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : plaidConfig, (i & 4) != 0 ? new x61.d(false) : dVar, (i & 8) == 0, (i & 16) != 0 ? null : naviCommand, (i & 32) != 0 ? null : retail, true);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig$Configuration$ExternalConsentConfiguration;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ConsentItem", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ExternalConsentConfiguration implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ExternalConsentConfiguration> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Clause f72281a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Clause f72282b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final List f72283c;
            public final Clause d;
            public final Clause e;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig$Configuration$ExternalConsentConfiguration$ConsentItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class ConsentItem implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<ConsentItem> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Clause f72284a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Clause f72285b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Image f72286c;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new ConsentItem((Clause) parcel.readParcelable(ConsentItem.class.getClassLoader()), (Clause) parcel.readParcelable(ConsentItem.class.getClassLoader()), (Image) parcel.readParcelable(ConsentItem.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new ConsentItem[i];
                    }
                }

                public ConsentItem(Clause title, Clause description, Image image) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(description, "description");
                    Intrinsics.checkNotNullParameter(image, "image");
                    this.f72284a = title;
                    this.f72285b = description;
                    this.f72286c = image;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof ConsentItem)) {
                        return false;
                    }
                    ConsentItem consentItem = (ConsentItem) obj2;
                    return Intrinsics.f(this.f72284a, consentItem.f72284a) && Intrinsics.f(this.f72285b, consentItem.f72285b) && Intrinsics.f(this.f72286c, consentItem.f72286c);
                }

                public final int hashCode() {
                    return this.f72286c.hashCode() + p.a.a(this.f72284a.hashCode() * 31, 31, this.f72285b);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeParcelable(this.f72284a, i);
                    dest.writeParcelable(this.f72285b, i);
                    dest.writeParcelable(this.f72286c, i);
                }
            }

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Clause clause = (Clause) j6.a.f(parcel, "parcel", ExternalConsentConfiguration.class);
                    Clause clause2 = (Clause) parcel.readParcelable(ExternalConsentConfiguration.class.getClassLoader());
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int iA = 0;
                    while (iA != i) {
                        iA = org.bouncycastle.jcajce.provider.digest.a.a(ConsentItem.CREATOR, parcel, arrayList, iA, 1);
                    }
                    return new ExternalConsentConfiguration(clause, clause2, arrayList, (Clause) parcel.readParcelable(ExternalConsentConfiguration.class.getClassLoader()), (Clause) parcel.readParcelable(ExternalConsentConfiguration.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ExternalConsentConfiguration[i];
                }
            }

            public ExternalConsentConfiguration(Clause title, Clause description, List items, Clause disclaimer, Clause button) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(description, "description");
                Intrinsics.checkNotNullParameter(items, "items");
                Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
                Intrinsics.checkNotNullParameter(button, "button");
                this.f72281a = title;
                this.f72282b = description;
                this.f72283c = items;
                this.d = disclaimer;
                this.e = button;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof ExternalConsentConfiguration)) {
                    return false;
                }
                ExternalConsentConfiguration externalConsentConfiguration = (ExternalConsentConfiguration) obj2;
                return Intrinsics.f(this.f72281a, externalConsentConfiguration.f72281a) && Intrinsics.f(this.f72282b, externalConsentConfiguration.f72282b) && Intrinsics.f(this.f72283c, externalConsentConfiguration.f72283c) && Intrinsics.f(this.d, externalConsentConfiguration.d) && Intrinsics.f(this.e, externalConsentConfiguration.e);
            }

            public final int hashCode() {
                return this.e.hashCode() + p.a.a(p.a.d(p.a.a(this.f72281a.hashCode() * 31, 31, this.f72282b), 31, this.f72283c), 31, this.d);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f72281a, i);
                dest.writeParcelable(this.f72282b, i);
                Iterator itV = p.a.v(this.f72283c, dest);
                while (itV.hasNext()) {
                    ((ConsentItem) itV.next()).writeToParcel(dest, i);
                }
                dest.writeParcelable(this.d, i);
                dest.writeParcelable(this.e, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig$Configuration$TrueLayer;", "Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig$Configuration;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class TrueLayer extends Configuration {

            @NotNull
            public static final Parcelable.Creator<TrueLayer> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Integer f72298a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f72299b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f72300c;
            public final String d;
            public final boolean e;
            public final boolean f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final ExternalConsentConfiguration f72301g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final ExternalInstitutionsConfiguration f72302h;
            public final NaviCommand i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final AnalyticsProduct f72303j;
            public final boolean k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final String f72304l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final boolean f72305m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public final String f72306n;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    boolean z;
                    boolean z3;
                    ExternalConsentConfiguration externalConsentConfiguration;
                    NaviCommand naviCommand;
                    boolean z4;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    boolean z6 = false;
                    boolean z11 = parcel.readInt() != 0;
                    if (parcel.readInt() != 0) {
                        z = false;
                        z6 = true;
                    } else {
                        z = false;
                    }
                    ExternalConsentConfiguration externalConsentConfigurationCreateFromParcel = parcel.readInt() == 0 ? null : ExternalConsentConfiguration.CREATOR.createFromParcel(parcel);
                    ExternalInstitutionsConfiguration externalInstitutionsConfigurationCreateFromParcel = parcel.readInt() != 0 ? ExternalInstitutionsConfiguration.CREATOR.createFromParcel(parcel) : null;
                    NaviCommand naviCommand2 = (NaviCommand) parcel.readParcelable(TrueLayer.class.getClassLoader());
                    AnalyticsProduct analyticsProduct = (AnalyticsProduct) parcel.readParcelable(TrueLayer.class.getClassLoader());
                    if (parcel.readInt() != 0) {
                        z3 = true;
                        externalConsentConfiguration = externalConsentConfigurationCreateFromParcel;
                        naviCommand = naviCommand2;
                        z4 = true;
                    } else {
                        z3 = true;
                        externalConsentConfiguration = externalConsentConfigurationCreateFromParcel;
                        naviCommand = naviCommand2;
                        z4 = z;
                    }
                    String string4 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        z3 = z;
                    }
                    return new TrueLayer(numValueOf, string, string2, string3, z11, z6, externalConsentConfiguration, externalInstitutionsConfigurationCreateFromParcel, naviCommand, analyticsProduct, z4, string4, z3, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new TrueLayer[i];
                }
            }

            public TrueLayer() {
                this(null, null, null, null, null, null, false, null, 16383);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof TrueLayer)) {
                    return false;
                }
                TrueLayer trueLayer = (TrueLayer) obj2;
                return Intrinsics.f(this.f72298a, trueLayer.f72298a) && Intrinsics.f(this.f72299b, trueLayer.f72299b) && Intrinsics.f(this.f72300c, trueLayer.f72300c) && Intrinsics.f(this.d, trueLayer.d) && this.e == trueLayer.e && this.f == trueLayer.f && Intrinsics.f(this.f72301g, trueLayer.f72301g) && Intrinsics.f(this.f72302h, trueLayer.f72302h) && Intrinsics.f(this.i, trueLayer.i) && Intrinsics.f(this.f72303j, trueLayer.f72303j) && this.k == trueLayer.k && Intrinsics.f(this.f72304l, trueLayer.f72304l) && this.f72305m == trueLayer.f72305m && Intrinsics.f(this.f72306n, trueLayer.f72306n);
            }

            public final int hashCode() {
                Integer num = this.f72298a;
                int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
                String str = this.f72299b;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f72300c;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.d;
                int iC = j6.a.c(j6.a.c((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.e), 31, this.f);
                ExternalConsentConfiguration externalConsentConfiguration = this.f72301g;
                int iHashCode4 = (iC + (externalConsentConfiguration == null ? 0 : externalConsentConfiguration.hashCode())) * 31;
                ExternalInstitutionsConfiguration externalInstitutionsConfiguration = this.f72302h;
                int iHashCode5 = (iHashCode4 + (externalInstitutionsConfiguration == null ? 0 : externalInstitutionsConfiguration.hashCode())) * 31;
                NaviCommand naviCommand = this.i;
                int iHashCode6 = (iHashCode5 + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31;
                AnalyticsProduct analyticsProduct = this.f72303j;
                int iC2 = j6.a.c((iHashCode6 + (analyticsProduct == null ? 0 : analyticsProduct.hashCode())) * 31, 31, this.k);
                String str4 = this.f72304l;
                int iC3 = j6.a.c((iC2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f72305m);
                String str5 = this.f72306n;
                return iC3 + (str5 != null ? str5.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Integer num = this.f72298a;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    p.a.B(dest, 1, num);
                }
                dest.writeString(this.f72299b);
                dest.writeString(this.f72300c);
                dest.writeString(this.d);
                dest.writeInt(this.e ? 1 : 0);
                dest.writeInt(this.f ? 1 : 0);
                ExternalConsentConfiguration externalConsentConfiguration = this.f72301g;
                if (externalConsentConfiguration == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    externalConsentConfiguration.writeToParcel(dest, i);
                }
                ExternalInstitutionsConfiguration externalInstitutionsConfiguration = this.f72302h;
                if (externalInstitutionsConfiguration == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    externalInstitutionsConfiguration.writeToParcel(dest, i);
                }
                dest.writeParcelable(this.i, i);
                dest.writeParcelable(this.f72303j, i);
                dest.writeInt(this.k ? 1 : 0);
                dest.writeString(this.f72304l);
                dest.writeInt(this.f72305m ? 1 : 0);
                dest.writeString(this.f72306n);
            }

            public TrueLayer(Integer num, String str, String str2, String str3, boolean z, boolean z3, ExternalConsentConfiguration externalConsentConfiguration, ExternalInstitutionsConfiguration externalInstitutionsConfiguration, NaviCommand naviCommand, AnalyticsProduct analyticsProduct, boolean z4, String str4, boolean z6, String str5) {
                this.f72298a = num;
                this.f72299b = str;
                this.f72300c = str2;
                this.d = str3;
                this.e = z;
                this.f = z3;
                this.f72301g = externalConsentConfiguration;
                this.f72302h = externalInstitutionsConfiguration;
                this.i = naviCommand;
                this.f72303j = analyticsProduct;
                this.k = z4;
                this.f72304l = str4;
                this.f72305m = z6;
                this.f72306n = str5;
            }

            public /* synthetic */ TrueLayer(String str, String str2, String str3, ExternalConsentConfiguration externalConsentConfiguration, ExternalInstitutionsConfiguration externalInstitutionsConfiguration, AnalyticsProduct.Retail retail, boolean z, String str4, int i) {
                this(null, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) == 0, (i & 32) == 0, (i & 64) != 0 ? null : externalConsentConfiguration, (i & 128) != 0 ? null : externalInstitutionsConfiguration, null, (i & 512) != 0 ? null : retail, true, null, (i & 4096) != 0 ? false : z, (i & 8192) != 0 ? null : str4);
            }
        }

        private Configuration() {
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig$Configuration$ExternalInstitutionsConfiguration;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ExternalAccountItem", "CantLinkAccountItem", "Result", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ExternalInstitutionsConfiguration implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ExternalInstitutionsConfiguration> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Clause f72287a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Clause f72288b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f72289c;
            public final List d;
            public final CantLinkAccountItem e;
            public final List f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final boolean f72290g;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig$Configuration$ExternalInstitutionsConfiguration$CantLinkAccountItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class CantLinkAccountItem implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<CantLinkAccountItem> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Clause f72291a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final NaviCommand f72292b;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new CantLinkAccountItem((Clause) parcel.readParcelable(CantLinkAccountItem.class.getClassLoader()), (NaviCommand) parcel.readParcelable(CantLinkAccountItem.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new CantLinkAccountItem[i];
                    }
                }

                public CantLinkAccountItem(Clause title, NaviCommand naviCommand) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    this.f72291a = title;
                    this.f72292b = naviCommand;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof CantLinkAccountItem)) {
                        return false;
                    }
                    CantLinkAccountItem cantLinkAccountItem = (CantLinkAccountItem) obj2;
                    return Intrinsics.f(this.f72291a, cantLinkAccountItem.f72291a) && Intrinsics.f(this.f72292b, cantLinkAccountItem.f72292b);
                }

                public final int hashCode() {
                    int iHashCode = this.f72291a.hashCode() * 31;
                    NaviCommand naviCommand = this.f72292b;
                    return iHashCode + (naviCommand == null ? 0 : naviCommand.hashCode());
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeParcelable(this.f72291a, i);
                    dest.writeParcelable(this.f72292b, i);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig$Configuration$ExternalInstitutionsConfiguration$ExternalAccountItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class ExternalAccountItem implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<ExternalAccountItem> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f72293a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f72294b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Clause f72295c;
                public final Image d;
                public final NaviCommand e;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new ExternalAccountItem(parcel.readString(), parcel.readString(), (Clause) parcel.readParcelable(ExternalAccountItem.class.getClassLoader()), (Image) parcel.readParcelable(ExternalAccountItem.class.getClassLoader()), (NaviCommand) parcel.readParcelable(ExternalAccountItem.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new ExternalAccountItem[i];
                    }
                }

                public ExternalAccountItem(String searchName, String id10, Clause title, Image image, NaviCommand naviCommand) {
                    Intrinsics.checkNotNullParameter(searchName, "searchName");
                    Intrinsics.checkNotNullParameter(id10, "id");
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(image, "image");
                    this.f72293a = searchName;
                    this.f72294b = id10;
                    this.f72295c = title;
                    this.d = image;
                    this.e = naviCommand;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof ExternalAccountItem)) {
                        return false;
                    }
                    ExternalAccountItem externalAccountItem = (ExternalAccountItem) obj2;
                    return Intrinsics.f(this.f72293a, externalAccountItem.f72293a) && Intrinsics.f(this.f72294b, externalAccountItem.f72294b) && Intrinsics.f(this.f72295c, externalAccountItem.f72295c) && Intrinsics.f(this.d, externalAccountItem.d) && Intrinsics.f(this.e, externalAccountItem.e);
                }

                public final int hashCode() {
                    int iC = a10.b.c(this.d, p.a.a(p.a.c(this.f72293a.hashCode() * 31, 31, this.f72294b), 31, this.f72295c), 31);
                    NaviCommand naviCommand = this.e;
                    return iC + (naviCommand == null ? 0 : naviCommand.hashCode());
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f72293a);
                    dest.writeString(this.f72294b);
                    dest.writeParcelable(this.f72295c, i);
                    dest.writeParcelable(this.d, i);
                    dest.writeParcelable(this.e, i);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig$Configuration$ExternalInstitutionsConfiguration$Result;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Result implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<Result> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f72296a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f72297b;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Result(parcel.readInt(), parcel.readInt());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Result[i];
                    }
                }

                public Result(int i, int i2) {
                    this.f72296a = i;
                    this.f72297b = i2;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof Result)) {
                        return false;
                    }
                    Result result = (Result) obj2;
                    return this.f72296a == result.f72296a && this.f72297b == result.f72297b;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.f72297b) + (Integer.hashCode(this.f72296a) * 31);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeInt(this.f72296a);
                    dest.writeInt(this.f72297b);
                }
            }

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    ArrayList arrayList;
                    Clause clause = (Clause) j6.a.f(parcel, "parcel", ExternalInstitutionsConfiguration.class);
                    Clause clause2 = (Clause) parcel.readParcelable(ExternalInstitutionsConfiguration.class.getClassLoader());
                    boolean z = parcel.readInt() != 0;
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int i = parcel.readInt();
                        arrayList = new ArrayList(i);
                        int iA = 0;
                        while (iA != i) {
                            iA = org.bouncycastle.jcajce.provider.digest.a.a(ExternalAccountItem.CREATOR, parcel, arrayList, iA, 1);
                        }
                    }
                    CantLinkAccountItem cantLinkAccountItemCreateFromParcel = parcel.readInt() != 0 ? CantLinkAccountItem.CREATOR.createFromParcel(parcel) : null;
                    int i2 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i2);
                    int iA2 = 0;
                    while (iA2 != i2) {
                        iA2 = org.bouncycastle.jcajce.provider.digest.a.a(Result.CREATOR, parcel, arrayList2, iA2, 1);
                    }
                    return new ExternalInstitutionsConfiguration(clause, clause2, z, arrayList, cantLinkAccountItemCreateFromParcel, arrayList2, parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ExternalInstitutionsConfiguration[i];
                }
            }

            public ExternalInstitutionsConfiguration(Clause clause, Clause clause2, List list, CantLinkAccountItem cantLinkAccountItem, boolean z, int i) {
                this(clause, (i & 2) != 0 ? null : clause2, (i & 4) == 0, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : cantLinkAccountItem, f0.f322471a, (i & 64) != 0 ? true : z);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof ExternalInstitutionsConfiguration)) {
                    return false;
                }
                ExternalInstitutionsConfiguration externalInstitutionsConfiguration = (ExternalInstitutionsConfiguration) obj2;
                return Intrinsics.f(this.f72287a, externalInstitutionsConfiguration.f72287a) && Intrinsics.f(this.f72288b, externalInstitutionsConfiguration.f72288b) && this.f72289c == externalInstitutionsConfiguration.f72289c && Intrinsics.f(this.d, externalInstitutionsConfiguration.d) && Intrinsics.f(this.e, externalInstitutionsConfiguration.e) && Intrinsics.f(this.f, externalInstitutionsConfiguration.f) && this.f72290g == externalInstitutionsConfiguration.f72290g;
            }

            public final int hashCode() {
                int iHashCode = this.f72287a.hashCode() * 31;
                Clause clause = this.f72288b;
                int iC = j6.a.c((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f72289c);
                List list = this.d;
                int iHashCode2 = (iC + (list == null ? 0 : list.hashCode())) * 31;
                CantLinkAccountItem cantLinkAccountItem = this.e;
                return Boolean.hashCode(this.f72290g) + p.a.d((iHashCode2 + (cantLinkAccountItem != null ? cantLinkAccountItem.hashCode() : 0)) * 31, 31, this.f);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f72287a, i);
                dest.writeParcelable(this.f72288b, i);
                dest.writeInt(this.f72289c ? 1 : 0);
                List list = this.d;
                if (list == null) {
                    dest.writeInt(0);
                } else {
                    Iterator itQ = v0.a.q(dest, 1, list);
                    while (itQ.hasNext()) {
                        ((ExternalAccountItem) itQ.next()).writeToParcel(dest, i);
                    }
                }
                CantLinkAccountItem cantLinkAccountItem = this.e;
                if (cantLinkAccountItem == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    cantLinkAccountItem.writeToParcel(dest, i);
                }
                Iterator itV = p.a.v(this.f, dest);
                while (itV.hasNext()) {
                    ((Result) itV.next()).writeToParcel(dest, i);
                }
                dest.writeInt(this.f72290g ? 1 : 0);
            }

            public ExternalInstitutionsConfiguration(Clause title, Clause clause, boolean z, List list, CantLinkAccountItem cantLinkAccountItem, List forwardResults, boolean z3) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(forwardResults, "forwardResults");
                this.f72287a = title;
                this.f72288b = clause;
                this.f72289c = z;
                this.d = list;
                this.e = cantLinkAccountItem;
                this.f = forwardResults;
                this.f72290g = z3;
            }
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig$Permissions;", "Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig;", "<init>", "()V", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @d
    public static final class Permissions extends ExternalAccountsFeatureConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Permissions f72324a = new Permissions();

        @NotNull
        public static final Parcelable.Creator<Permissions> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Permissions.f72324a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Permissions[i];
            }
        }

        private Permissions() {
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

    private ExternalAccountsFeatureConfig() {
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig$LinkSuccess;", "Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig;", "", "toString", "()Ljava/lang/String;", "UseCase", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @d
    public static final /* data */ class LinkSuccess extends ExternalAccountsFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<LinkSuccess> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f72308b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f72309c;
        public final UseCase d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LinkSuccess(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, (UseCase) parcel.readParcelable(LinkSuccess.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LinkSuccess[i];
            }
        }

        public LinkSuccess(String institutionId, boolean z, boolean z3, UseCase usecase) {
            Intrinsics.checkNotNullParameter(institutionId, "institutionId");
            Intrinsics.checkNotNullParameter(usecase, "usecase");
            this.f72307a = institutionId;
            this.f72308b = z;
            this.f72309c = z3;
            this.d = usecase;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LinkSuccess)) {
                return false;
            }
            LinkSuccess linkSuccess = (LinkSuccess) obj2;
            return Intrinsics.f(this.f72307a, linkSuccess.f72307a) && this.f72308b == linkSuccess.f72308b && this.f72309c == linkSuccess.f72309c && Intrinsics.f(this.d, linkSuccess.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + j6.a.c(j6.a.c(this.f72307a.hashCode() * 31, 31, this.f72308b), 31, this.f72309c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72307a);
            dest.writeInt(this.f72308b ? 1 : 0);
            dest.writeInt(this.f72309c ? 1 : 0);
            dest.writeParcelable(this.d, i);
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig$LinkSuccess$UseCase;", "Landroid/os/Parcelable;", "OpenBanking", "EgiroLink", "EgiroUnlink", "AkahuLink", "AkahuUnlink", "UsPlaidLink", "Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig$LinkSuccess$UseCase$AkahuLink;", "Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig$LinkSuccess$UseCase$AkahuUnlink;", "Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig$LinkSuccess$UseCase$EgiroLink;", "Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig$LinkSuccess$UseCase$EgiroUnlink;", "Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig$LinkSuccess$UseCase$OpenBanking;", "Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig$LinkSuccess$UseCase$UsPlaidLink;", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface UseCase extends Parcelable {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig$LinkSuccess$UseCase$EgiroLink;", "Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig$LinkSuccess$UseCase;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class EgiroLink implements UseCase {

                @NotNull
                public static final Parcelable.Creator<EgiroLink> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final boolean f72316a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final boolean f72317b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f72318c;
                public final String d;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new EgiroLink(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new EgiroLink[i];
                    }
                }

                public EgiroLink(String institutionName, String str, boolean z, boolean z3) {
                    Intrinsics.checkNotNullParameter(institutionName, "institutionName");
                    this.f72316a = z;
                    this.f72317b = z3;
                    this.f72318c = institutionName;
                    this.d = str;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof EgiroLink)) {
                        return false;
                    }
                    EgiroLink egiroLink = (EgiroLink) obj2;
                    return this.f72316a == egiroLink.f72316a && this.f72317b == egiroLink.f72317b && Intrinsics.f(this.f72318c, egiroLink.f72318c) && Intrinsics.f(this.d, egiroLink.d);
                }

                public final int hashCode() {
                    int iC = p.a.c(j6.a.c(Boolean.hashCode(this.f72316a) * 31, 31, this.f72317b), 31, this.f72318c);
                    String str = this.d;
                    return iC + (str == null ? 0 : str.hashCode());
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeInt(this.f72316a ? 1 : 0);
                    dest.writeInt(this.f72317b ? 1 : 0);
                    dest.writeString(this.f72318c);
                    dest.writeString(this.d);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig$LinkSuccess$UseCase$EgiroUnlink;", "Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig$LinkSuccess$UseCase;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class EgiroUnlink implements UseCase {

                @NotNull
                public static final Parcelable.Creator<EgiroUnlink> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final boolean f72319a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final boolean f72320b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f72321c;
                public final String d;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new EgiroUnlink(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new EgiroUnlink[i];
                    }
                }

                public EgiroUnlink(String institutionName, String str, boolean z, boolean z3) {
                    Intrinsics.checkNotNullParameter(institutionName, "institutionName");
                    this.f72319a = z;
                    this.f72320b = z3;
                    this.f72321c = institutionName;
                    this.d = str;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof EgiroUnlink)) {
                        return false;
                    }
                    EgiroUnlink egiroUnlink = (EgiroUnlink) obj2;
                    return this.f72319a == egiroUnlink.f72319a && this.f72320b == egiroUnlink.f72320b && Intrinsics.f(this.f72321c, egiroUnlink.f72321c) && Intrinsics.f(this.d, egiroUnlink.d);
                }

                public final int hashCode() {
                    int iC = p.a.c(j6.a.c(Boolean.hashCode(this.f72319a) * 31, 31, this.f72320b), 31, this.f72321c);
                    String str = this.d;
                    return iC + (str == null ? 0 : str.hashCode());
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeInt(this.f72319a ? 1 : 0);
                    dest.writeInt(this.f72320b ? 1 : 0);
                    dest.writeString(this.f72321c);
                    dest.writeString(this.d);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig$LinkSuccess$UseCase$OpenBanking;", "Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig$LinkSuccess$UseCase;", "<init>", "()V", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class OpenBanking implements UseCase {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final OpenBanking f72322a = new OpenBanking();

                @NotNull
                public static final Parcelable.Creator<OpenBanking> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return OpenBanking.f72322a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new OpenBanking[i];
                    }
                }

                private OpenBanking() {
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

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig$LinkSuccess$UseCase$UsPlaidLink;", "Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig$LinkSuccess$UseCase;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class UsPlaidLink implements UseCase {

                @NotNull
                public static final Parcelable.Creator<UsPlaidLink> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final PlaidConfig f72323a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new UsPlaidLink((PlaidConfig) parcel.readParcelable(UsPlaidLink.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new UsPlaidLink[i];
                    }
                }

                public UsPlaidLink(PlaidConfig configuration) {
                    Intrinsics.checkNotNullParameter(configuration, "configuration");
                    this.f72323a = configuration;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof UsPlaidLink) && Intrinsics.f(this.f72323a, ((UsPlaidLink) obj2).f72323a);
                }

                public final int hashCode() {
                    return this.f72323a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeParcelable(this.f72323a, i);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig$LinkSuccess$UseCase$AkahuLink;", "Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig$LinkSuccess$UseCase;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class AkahuLink implements UseCase {

                @NotNull
                public static final Parcelable.Creator<AkahuLink> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f72310a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f72311b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f72312c;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new AkahuLink(parcel.readString(), parcel.readString(), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new AkahuLink[i];
                    }
                }

                public AkahuLink(String str, String str2, String str3) {
                    this.f72310a = str;
                    this.f72311b = str2;
                    this.f72312c = str3;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof AkahuLink)) {
                        return false;
                    }
                    AkahuLink akahuLink = (AkahuLink) obj2;
                    return Intrinsics.f(this.f72310a, akahuLink.f72310a) && Intrinsics.f(this.f72311b, akahuLink.f72311b) && Intrinsics.f(this.f72312c, akahuLink.f72312c);
                }

                public final int hashCode() {
                    String str = this.f72310a;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.f72311b;
                    int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.f72312c;
                    return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f72310a);
                    dest.writeString(this.f72311b);
                    dest.writeString(this.f72312c);
                }

                public AkahuLink() {
                    this(null, null, null);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig$LinkSuccess$UseCase$AkahuUnlink;", "Lcom/revolut/feature/external_accounts/api/navigation/ExternalAccountsFeatureConfig$LinkSuccess$UseCase;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class AkahuUnlink implements UseCase {

                @NotNull
                public static final Parcelable.Creator<AkahuUnlink> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f72313a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f72314b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f72315c;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new AkahuUnlink(parcel.readString(), parcel.readString(), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new AkahuUnlink[i];
                    }
                }

                public AkahuUnlink(String str, String str2, String str3) {
                    this.f72313a = str;
                    this.f72314b = str2;
                    this.f72315c = str3;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof AkahuUnlink)) {
                        return false;
                    }
                    AkahuUnlink akahuUnlink = (AkahuUnlink) obj2;
                    return Intrinsics.f(this.f72313a, akahuUnlink.f72313a) && Intrinsics.f(this.f72314b, akahuUnlink.f72314b) && Intrinsics.f(this.f72315c, akahuUnlink.f72315c);
                }

                public final int hashCode() {
                    String str = this.f72313a;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.f72314b;
                    int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.f72315c;
                    return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f72313a);
                    dest.writeString(this.f72314b);
                    dest.writeString(this.f72315c);
                }

                public AkahuUnlink() {
                    this(null, null, null);
                }
            }
        }

        public /* synthetic */ LinkSuccess(String str, boolean z) {
            this(str, z, true, UseCase.OpenBanking.f72322a);
        }
    }
}
