package com.revolut.feature.credit.application.plugins.impl.ui.debts.hub;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import ft3.j1;
import grl.r2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/debts/hub/DebtsHubScreenContract$InputData", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowContract$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DebtsHubScreenContract$InputData implements PluginFlowContract$Input {

    @NotNull
    public static final Parcelable.Creator<DebtsHubScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f67446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f67447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CreditApplicationPluginFlowContract$Configuration f67448c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DebtsHubScreenContract$InputData((b) parcel.readSerializable(), parcel.readInt() != 0, (CreditApplicationPluginFlowContract$Configuration) parcel.readParcelable(DebtsHubScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DebtsHubScreenContract$InputData[i];
        }
    }

    public DebtsHubScreenContract$InputData(b currency, boolean z, CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
        this.f67446a = currency;
        this.f67447b = z;
        this.f67448c = pluginConfiguration;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    /* JADX INFO: renamed from: O0, reason: from getter */
    public final CreditApplicationPluginFlowContract$Configuration getF67448c() {
        return this.f67448c;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final r2 P9() {
        return this.f67448c.f66893c;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final j1 R2() {
        return this.f67448c.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DebtsHubScreenContract$InputData)) {
            return false;
        }
        DebtsHubScreenContract$InputData debtsHubScreenContract$InputData = (DebtsHubScreenContract$InputData) obj2;
        return Intrinsics.f(this.f67446a, debtsHubScreenContract$InputData.f67446a) && this.f67447b == debtsHubScreenContract$InputData.f67447b && Intrinsics.f(this.f67448c, debtsHubScreenContract$InputData.f67448c);
    }

    public final int hashCode() {
        return this.f67448c.hashCode() + j6.a.c(this.f67446a.hashCode() * 31, 31, this.f67447b);
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final String k8() {
        return getF67448c().f66892b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f67446a);
        dest.writeInt(this.f67447b ? 1 : 0);
        dest.writeParcelable(this.f67448c, i);
    }
}
