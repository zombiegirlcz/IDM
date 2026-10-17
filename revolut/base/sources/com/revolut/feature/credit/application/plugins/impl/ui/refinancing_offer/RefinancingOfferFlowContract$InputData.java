package com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import ft3.j1;
import grl.r2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/refinancing_offer/RefinancingOfferFlowContract$InputData", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowContract$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RefinancingOfferFlowContract$InputData implements PluginFlowContract$Input {

    @NotNull
    public static final Parcelable.Creator<RefinancingOfferFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditApplicationPluginFlowContract$Configuration f68284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditApplicationKompotFeatureConfig.RefinancingOffer.Config f68285b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RefinancingOfferFlowContract$InputData((CreditApplicationPluginFlowContract$Configuration) parcel.readParcelable(RefinancingOfferFlowContract$InputData.class.getClassLoader()), (CreditApplicationKompotFeatureConfig.RefinancingOffer.Config) parcel.readParcelable(RefinancingOfferFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RefinancingOfferFlowContract$InputData[i];
        }
    }

    public RefinancingOfferFlowContract$InputData(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, CreditApplicationKompotFeatureConfig.RefinancingOffer.Config config) {
        Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f68284a = pluginConfiguration;
        this.f68285b = config;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    /* JADX INFO: renamed from: O0, reason: from getter */
    public final CreditApplicationPluginFlowContract$Configuration getF68284a() {
        return this.f68284a;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final r2 P9() {
        return this.f68284a.f66893c;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final j1 R2() {
        return this.f68284a.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RefinancingOfferFlowContract$InputData)) {
            return false;
        }
        RefinancingOfferFlowContract$InputData refinancingOfferFlowContract$InputData = (RefinancingOfferFlowContract$InputData) obj2;
        return Intrinsics.f(this.f68284a, refinancingOfferFlowContract$InputData.f68284a) && Intrinsics.f(this.f68285b, refinancingOfferFlowContract$InputData.f68285b);
    }

    public final int hashCode() {
        return this.f68285b.hashCode() + (this.f68284a.hashCode() * 31);
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final String k8() {
        return getF68284a().f66892b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f68284a, i);
        dest.writeParcelable(this.f68285b, i);
    }
}
