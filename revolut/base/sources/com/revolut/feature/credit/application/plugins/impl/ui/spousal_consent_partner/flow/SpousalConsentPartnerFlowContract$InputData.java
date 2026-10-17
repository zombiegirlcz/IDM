package com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentPartnerPopupScreenConfig;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import ft3.j1;
import grl.r2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_partner/flow/SpousalConsentPartnerFlowContract$InputData", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowContract$Input;", "", "toString", "()Ljava/lang/String;", "Config", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SpousalConsentPartnerFlowContract$InputData implements PluginFlowContract$Input {

    @NotNull
    public static final Parcelable.Creator<SpousalConsentPartnerFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditApplicationPluginFlowContract$Configuration f68459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Config f68460b;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_partner/flow/SpousalConsentPartnerFlowContract$InputData$Config;", "Landroid/os/Parcelable;", "<init>", "()V", "GiveConsent", "Popup", "Lcom/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_partner/flow/SpousalConsentPartnerFlowContract$InputData$Config$GiveConsent;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_partner/flow/SpousalConsentPartnerFlowContract$InputData$Config$Popup;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Config implements Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_partner/flow/SpousalConsentPartnerFlowContract$InputData$Config$GiveConsent;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_partner/flow/SpousalConsentPartnerFlowContract$InputData$Config;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class GiveConsent extends Config {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final GiveConsent f68461a = new GiveConsent();

            @NotNull
            public static final Parcelable.Creator<GiveConsent> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return GiveConsent.f68461a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new GiveConsent[i];
                }
            }

            private GiveConsent() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_partner/flow/SpousalConsentPartnerFlowContract$InputData$Config$Popup;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_partner/flow/SpousalConsentPartnerFlowContract$InputData$Config;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Popup extends Config {

            @NotNull
            public static final Parcelable.Creator<Popup> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SpousalConsentPartnerPopupScreenConfig f68462a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Popup((SpousalConsentPartnerPopupScreenConfig) parcel.readParcelable(Popup.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Popup[i];
                }
            }

            public Popup(SpousalConsentPartnerPopupScreenConfig popup) {
                Intrinsics.checkNotNullParameter(popup, "popup");
                this.f68462a = popup;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Popup) && Intrinsics.f(this.f68462a, ((Popup) obj2).f68462a);
            }

            public final int hashCode() {
                return this.f68462a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f68462a, i);
            }
        }

        private Config() {
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SpousalConsentPartnerFlowContract$InputData((CreditApplicationPluginFlowContract$Configuration) parcel.readParcelable(SpousalConsentPartnerFlowContract$InputData.class.getClassLoader()), (Config) parcel.readParcelable(SpousalConsentPartnerFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SpousalConsentPartnerFlowContract$InputData[i];
        }
    }

    public SpousalConsentPartnerFlowContract$InputData(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, Config config) {
        Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f68459a = pluginConfiguration;
        this.f68460b = config;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    /* JADX INFO: renamed from: O0, reason: from getter */
    public final CreditApplicationPluginFlowContract$Configuration getF68459a() {
        return this.f68459a;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final r2 P9() {
        return this.f68459a.f66893c;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final j1 R2() {
        return this.f68459a.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SpousalConsentPartnerFlowContract$InputData)) {
            return false;
        }
        SpousalConsentPartnerFlowContract$InputData spousalConsentPartnerFlowContract$InputData = (SpousalConsentPartnerFlowContract$InputData) obj2;
        return Intrinsics.f(this.f68459a, spousalConsentPartnerFlowContract$InputData.f68459a) && Intrinsics.f(this.f68460b, spousalConsentPartnerFlowContract$InputData.f68460b);
    }

    public final int hashCode() {
        return this.f68460b.hashCode() + (this.f68459a.hashCode() * 31);
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final String k8() {
        return getF67526b().f66892b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f68459a, i);
        dest.writeParcelable(this.f68460b, i);
    }
}
