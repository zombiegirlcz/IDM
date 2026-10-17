package com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentInitiatorIntroScreenConfig;
import com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentInitiatorPopupScreenConfig;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import ft3.j1;
import grl.r2;
import ju3.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_initiator/flow/SpousalConsentInitiatorFlowContract$InputData", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowContract$Input;", "", "toString", "()Ljava/lang/String;", "Config", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SpousalConsentInitiatorFlowContract$InputData implements PluginFlowContract$Input {

    @NotNull
    public static final Parcelable.Creator<SpousalConsentInitiatorFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditApplicationPluginFlowContract$Configuration f68430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Config f68431b;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_initiator/flow/SpousalConsentInitiatorFlowContract$InputData$Config;", "Landroid/os/Parcelable;", "<init>", "()V", "Intro", "Popup", "Lcom/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_initiator/flow/SpousalConsentInitiatorFlowContract$InputData$Config$Intro;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_initiator/flow/SpousalConsentInitiatorFlowContract$InputData$Config$Popup;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Config implements Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_initiator/flow/SpousalConsentInitiatorFlowContract$InputData$Config$Intro;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_initiator/flow/SpousalConsentInitiatorFlowContract$InputData$Config;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Intro extends Config {

            @NotNull
            public static final Parcelable.Creator<Intro> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SpousalConsentInitiatorIntroScreenConfig f68432a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Intro((SpousalConsentInitiatorIntroScreenConfig) parcel.readParcelable(Intro.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Intro[i];
                }
            }

            public Intro(SpousalConsentInitiatorIntroScreenConfig intro) {
                Intrinsics.checkNotNullParameter(intro, "intro");
                this.f68432a = intro;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Intro) && Intrinsics.f(this.f68432a, ((Intro) obj2).f68432a);
            }

            public final int hashCode() {
                return this.f68432a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f68432a, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_initiator/flow/SpousalConsentInitiatorFlowContract$InputData$Config$Popup;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_initiator/flow/SpousalConsentInitiatorFlowContract$InputData$Config;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Popup extends Config {

            @NotNull
            public static final Parcelable.Creator<Popup> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SpousalConsentInitiatorPopupScreenConfig f68433a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final g f68434b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Popup((SpousalConsentInitiatorPopupScreenConfig) parcel.readParcelable(Popup.class.getClassLoader()), g.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Popup[i];
                }
            }

            public Popup(SpousalConsentInitiatorPopupScreenConfig popup, g popupType) {
                Intrinsics.checkNotNullParameter(popup, "popup");
                Intrinsics.checkNotNullParameter(popupType, "popupType");
                this.f68433a = popup;
                this.f68434b = popupType;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Popup)) {
                    return false;
                }
                Popup popup = (Popup) obj2;
                return Intrinsics.f(this.f68433a, popup.f68433a) && this.f68434b == popup.f68434b;
            }

            public final int hashCode() {
                return this.f68434b.hashCode() + (this.f68433a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f68433a, i);
                dest.writeString(this.f68434b.name());
            }
        }

        private Config() {
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SpousalConsentInitiatorFlowContract$InputData((CreditApplicationPluginFlowContract$Configuration) parcel.readParcelable(SpousalConsentInitiatorFlowContract$InputData.class.getClassLoader()), (Config) parcel.readParcelable(SpousalConsentInitiatorFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SpousalConsentInitiatorFlowContract$InputData[i];
        }
    }

    public SpousalConsentInitiatorFlowContract$InputData(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, Config config) {
        Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f68430a = pluginConfiguration;
        this.f68431b = config;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    /* JADX INFO: renamed from: O0, reason: from getter */
    public final CreditApplicationPluginFlowContract$Configuration getF68430a() {
        return this.f68430a;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final r2 P9() {
        return this.f68430a.f66893c;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final j1 R2() {
        return this.f68430a.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SpousalConsentInitiatorFlowContract$InputData)) {
            return false;
        }
        SpousalConsentInitiatorFlowContract$InputData spousalConsentInitiatorFlowContract$InputData = (SpousalConsentInitiatorFlowContract$InputData) obj2;
        return Intrinsics.f(this.f68430a, spousalConsentInitiatorFlowContract$InputData.f68430a) && Intrinsics.f(this.f68431b, spousalConsentInitiatorFlowContract$InputData.f68431b);
    }

    public final int hashCode() {
        return this.f68431b.hashCode() + (this.f68430a.hashCode() * 31);
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final String k8() {
        return getF68430a().f66892b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f68430a, i);
        dest.writeParcelable(this.f68431b, i);
    }
}
