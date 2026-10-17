package com.revolut.feature.credit.application.plugins.impl.ui.emergency_payment.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import ft3.j1;
import grl.r2;
import hs3.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/emergency_payment/flow/EmergencyPaymentFlowContract$InputData", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowContract$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EmergencyPaymentFlowContract$InputData implements PluginFlowContract$Input {

    @NotNull
    public static final Parcelable.Creator<EmergencyPaymentFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f67641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f67642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CreditApplicationPluginFlowContract$Configuration f67643c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EmergencyPaymentFlowContract$InputData((CreditApplicationPluginFlowContract$Configuration) parcel.readParcelable(EmergencyPaymentFlowContract$InputData.class.getClassLoader()), (x0) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EmergencyPaymentFlowContract$InputData[i];
        }
    }

    public EmergencyPaymentFlowContract$InputData(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, x0 promptMetadata, String creditId) {
        Intrinsics.checkNotNullParameter(promptMetadata, "promptMetadata");
        Intrinsics.checkNotNullParameter(creditId, "creditId");
        Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
        this.f67641a = promptMetadata;
        this.f67642b = creditId;
        this.f67643c = pluginConfiguration;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    /* JADX INFO: renamed from: O0, reason: from getter */
    public final CreditApplicationPluginFlowContract$Configuration getF67643c() {
        return this.f67643c;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final r2 P9() {
        return this.f67643c.f66893c;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final j1 R2() {
        return this.f67643c.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EmergencyPaymentFlowContract$InputData)) {
            return false;
        }
        EmergencyPaymentFlowContract$InputData emergencyPaymentFlowContract$InputData = (EmergencyPaymentFlowContract$InputData) obj2;
        return Intrinsics.f(this.f67641a, emergencyPaymentFlowContract$InputData.f67641a) && Intrinsics.f(this.f67642b, emergencyPaymentFlowContract$InputData.f67642b) && Intrinsics.f(this.f67643c, emergencyPaymentFlowContract$InputData.f67643c);
    }

    public final int hashCode() {
        return this.f67643c.hashCode() + p.a.c(this.f67641a.hashCode() * 31, 31, this.f67642b);
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final String k8() {
        return getD().f66892b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f67641a);
        dest.writeString(this.f67642b);
        dest.writeParcelable(this.f67643c, i);
    }
}
