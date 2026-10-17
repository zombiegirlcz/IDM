package com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.popup;

import android.os.Parcel;
import android.os.Parcelable;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_initiator/popup/SpousalConsentInitiatorPopupScreenContract$InputData", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowContract$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SpousalConsentInitiatorPopupScreenContract$InputData implements PluginFlowContract$Input {

    @NotNull
    public static final Parcelable.Creator<SpousalConsentInitiatorPopupScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SpousalConsentInitiatorPopupScreenConfig f68445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f68446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CreditApplicationPluginFlowContract$Configuration f68447c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SpousalConsentInitiatorPopupScreenContract$InputData((SpousalConsentInitiatorPopupScreenConfig) parcel.readParcelable(SpousalConsentInitiatorPopupScreenContract$InputData.class.getClassLoader()), g.valueOf(parcel.readString()), (CreditApplicationPluginFlowContract$Configuration) parcel.readParcelable(SpousalConsentInitiatorPopupScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SpousalConsentInitiatorPopupScreenContract$InputData[i];
        }
    }

    public SpousalConsentInitiatorPopupScreenContract$InputData(SpousalConsentInitiatorPopupScreenConfig configuration, g popupType, CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(popupType, "popupType");
        Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
        this.f68445a = configuration;
        this.f68446b = popupType;
        this.f68447c = pluginConfiguration;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    /* JADX INFO: renamed from: O0, reason: from getter */
    public final CreditApplicationPluginFlowContract$Configuration getF68447c() {
        return this.f68447c;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final r2 P9() {
        return this.f68447c.f66893c;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final j1 R2() {
        return this.f68447c.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SpousalConsentInitiatorPopupScreenContract$InputData)) {
            return false;
        }
        SpousalConsentInitiatorPopupScreenContract$InputData spousalConsentInitiatorPopupScreenContract$InputData = (SpousalConsentInitiatorPopupScreenContract$InputData) obj2;
        return Intrinsics.f(this.f68445a, spousalConsentInitiatorPopupScreenContract$InputData.f68445a) && this.f68446b == spousalConsentInitiatorPopupScreenContract$InputData.f68446b && Intrinsics.f(this.f68447c, spousalConsentInitiatorPopupScreenContract$InputData.f68447c);
    }

    public final int hashCode() {
        return this.f68447c.hashCode() + ((this.f68446b.hashCode() + (this.f68445a.hashCode() * 31)) * 31);
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final String k8() {
        return getF68447c().f66892b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f68445a, i);
        dest.writeString(this.f68446b.name());
        dest.writeParcelable(this.f68447c, i);
    }
}
