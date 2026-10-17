package com.revolut.feature.credit.application.plugins.impl.ui.address.screen.search;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import cu3.e;
import ft3.j1;
import grl.r2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/address/screen/search/CreditAddressSearchScreenContract$InputData", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowContract$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditAddressSearchScreenContract$InputData implements PluginFlowContract$Input {

    @NotNull
    public static final Parcelable.Creator<CreditAddressSearchScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f66963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CreditApplicationPluginFlowContract$Configuration f66964c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditAddressSearchScreenContract$InputData(parcel.readString(), e.valueOf(parcel.readString()), (CreditApplicationPluginFlowContract$Configuration) parcel.readParcelable(CreditAddressSearchScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditAddressSearchScreenContract$InputData[i];
        }
    }

    public CreditAddressSearchScreenContract$InputData(String predefinedPostcode, e addressType, CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
        Intrinsics.checkNotNullParameter(predefinedPostcode, "predefinedPostcode");
        Intrinsics.checkNotNullParameter(addressType, "addressType");
        Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
        this.f66962a = predefinedPostcode;
        this.f66963b = addressType;
        this.f66964c = pluginConfiguration;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    /* JADX INFO: renamed from: O0, reason: from getter */
    public final CreditApplicationPluginFlowContract$Configuration getF67568a() {
        return this.f66964c;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final r2 P9() {
        return this.f66964c.f66893c;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final j1 R2() {
        return this.f66964c.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditAddressSearchScreenContract$InputData)) {
            return false;
        }
        CreditAddressSearchScreenContract$InputData creditAddressSearchScreenContract$InputData = (CreditAddressSearchScreenContract$InputData) obj2;
        return Intrinsics.f(this.f66962a, creditAddressSearchScreenContract$InputData.f66962a) && this.f66963b == creditAddressSearchScreenContract$InputData.f66963b && Intrinsics.f(this.f66964c, creditAddressSearchScreenContract$InputData.f66964c);
    }

    public final int hashCode() {
        return this.f66964c.hashCode() + ((this.f66963b.hashCode() + (this.f66962a.hashCode() * 31)) * 31);
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final String k8() {
        return getF68376b().f66892b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f66962a);
        dest.writeString(this.f66963b.name());
        dest.writeParcelable(this.f66964c, i);
    }
}
