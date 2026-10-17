package com.revolut.feature.credit.application.plugins.impl.ui.rollee;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.models.rollee.RolleeSession;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import ft3.j1;
import grl.r2;
import ht3.l0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/rollee/RolleeFlowContract$InputData", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowContract$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RolleeFlowContract$InputData implements PluginFlowContract$Input {

    @NotNull
    public static final Parcelable.Creator<RolleeFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f68324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RolleeSession f68325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CreditApplicationPluginFlowContract$Configuration f68326c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RolleeFlowContract$InputData((RolleeSession) parcel.readParcelable(RolleeFlowContract$InputData.class.getClassLoader()), (CreditApplicationPluginFlowContract$Configuration) parcel.readParcelable(RolleeFlowContract$InputData.class.getClassLoader()), (l0) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RolleeFlowContract$InputData[i];
        }
    }

    public RolleeFlowContract$InputData(RolleeSession session, CreditApplicationPluginFlowContract$Configuration pluginConfiguration, l0 l0Var) {
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
        this.f68324a = l0Var;
        this.f68325b = session;
        this.f68326c = pluginConfiguration;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    /* JADX INFO: renamed from: O0, reason: from getter */
    public final CreditApplicationPluginFlowContract$Configuration getF68326c() {
        return this.f68326c;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final r2 P9() {
        return this.f68326c.f66893c;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final j1 R2() {
        return this.f68326c.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RolleeFlowContract$InputData)) {
            return false;
        }
        RolleeFlowContract$InputData rolleeFlowContract$InputData = (RolleeFlowContract$InputData) obj2;
        return Intrinsics.f(this.f68324a, rolleeFlowContract$InputData.f68324a) && Intrinsics.f(this.f68325b, rolleeFlowContract$InputData.f68325b) && Intrinsics.f(this.f68326c, rolleeFlowContract$InputData.f68326c);
    }

    public final int hashCode() {
        l0 l0Var = this.f68324a;
        return this.f68326c.hashCode() + ((this.f68325b.hashCode() + ((l0Var == null ? 0 : l0Var.hashCode()) * 31)) * 31);
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final String k8() {
        return getF68326c().f66892b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f68324a);
        dest.writeParcelable(this.f68325b, i);
        dest.writeParcelable(this.f68326c, i);
    }
}
