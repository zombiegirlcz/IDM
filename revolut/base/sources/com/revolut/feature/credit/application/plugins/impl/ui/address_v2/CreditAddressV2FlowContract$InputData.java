package com.revolut.feature.credit.application.plugins.impl.ui.address_v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import com.revolut.kompot.common.IOData$Input;
import ft3.j1;
import grl.r2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/address_v2/CreditAddressV2FlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowContract$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditAddressV2FlowContract$InputData implements IOData$Input, PluginFlowContract$Input {

    @NotNull
    public static final Parcelable.Creator<CreditAddressV2FlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditAddressV2FlowContract$Config f66971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditApplicationPluginFlowContract$Configuration f66972b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditAddressV2FlowContract$InputData((CreditAddressV2FlowContract$Config) parcel.readParcelable(CreditAddressV2FlowContract$InputData.class.getClassLoader()), (CreditApplicationPluginFlowContract$Configuration) parcel.readParcelable(CreditAddressV2FlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditAddressV2FlowContract$InputData[i];
        }
    }

    public CreditAddressV2FlowContract$InputData(CreditAddressV2FlowContract$Config config, CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
        this.f66971a = config;
        this.f66972b = pluginConfiguration;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    /* JADX INFO: renamed from: O0, reason: from getter */
    public final CreditApplicationPluginFlowContract$Configuration getF68301c() {
        return this.f66972b;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final r2 P9() {
        return this.f66972b.f66893c;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final j1 R2() {
        return this.f66972b.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditAddressV2FlowContract$InputData)) {
            return false;
        }
        CreditAddressV2FlowContract$InputData creditAddressV2FlowContract$InputData = (CreditAddressV2FlowContract$InputData) obj2;
        return Intrinsics.f(this.f66971a, creditAddressV2FlowContract$InputData.f66971a) && Intrinsics.f(this.f66972b, creditAddressV2FlowContract$InputData.f66972b);
    }

    public final int hashCode() {
        return this.f66972b.hashCode() + (this.f66971a.hashCode() * 31);
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final String k8() {
        return getF68301c().f66892b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f66971a, i);
        dest.writeParcelable(this.f66972b, i);
    }
}
