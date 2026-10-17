package com.revolut.feature.credit.application.plugins.impl.ui.spinner;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.models.config.SpinnerConfiguration;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import ft3.j1;
import grl.r2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/spinner/SpinnerFlowContract$InputData", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowContract$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SpinnerFlowContract$InputData implements PluginFlowContract$Input {

    @NotNull
    public static final Parcelable.Creator<SpinnerFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SpinnerConfiguration f68407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f68408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f68409c;
    public final CreditApplicationPluginFlowContract$Configuration d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SpinnerFlowContract$InputData((SpinnerConfiguration) parcel.readParcelable(SpinnerFlowContract$InputData.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, (CreditApplicationPluginFlowContract$Configuration) parcel.readParcelable(SpinnerFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SpinnerFlowContract$InputData[i];
        }
    }

    public SpinnerFlowContract$InputData(SpinnerConfiguration configuration, boolean z, boolean z3, CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
        this.f68407a = configuration;
        this.f68408b = z;
        this.f68409c = z3;
        this.d = pluginConfiguration;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    /* JADX INFO: renamed from: O0, reason: from getter */
    public final CreditApplicationPluginFlowContract$Configuration getD() {
        return this.d;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final r2 P9() {
        return this.d.f66893c;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final j1 R2() {
        return this.d.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SpinnerFlowContract$InputData)) {
            return false;
        }
        SpinnerFlowContract$InputData spinnerFlowContract$InputData = (SpinnerFlowContract$InputData) obj2;
        return Intrinsics.f(this.f68407a, spinnerFlowContract$InputData.f68407a) && this.f68408b == spinnerFlowContract$InputData.f68408b && this.f68409c == spinnerFlowContract$InputData.f68409c && Intrinsics.f(this.d, spinnerFlowContract$InputData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c(j6.a.c(this.f68407a.hashCode() * 31, 31, this.f68408b), 31, this.f68409c);
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final String k8() {
        return getD().f66892b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f68407a, i);
        dest.writeInt(this.f68408b ? 1 : 0);
        dest.writeInt(this.f68409c ? 1 : 0);
        dest.writeParcelable(this.d, i);
    }

    public /* synthetic */ SpinnerFlowContract$InputData(SpinnerConfiguration spinnerConfiguration, CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$Configuration) {
        this(spinnerConfiguration, true, false, creditApplicationPluginFlowContract$Configuration);
    }
}
