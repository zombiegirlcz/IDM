package com.revolut.feature.credit.application.plugins.impl.ui.akahu;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import dx4.z2;
import ft3.j1;
import grl.r2;
import ht3.l0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/akahu/AkahuFlowContract$InputData", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowContract$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AkahuFlowContract$InputData implements PluginFlowContract$Input {

    @NotNull
    public static final Parcelable.Creator<AkahuFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f67021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f67022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z2 f67023c;
    public final CreditApplicationPluginFlowContract$Configuration d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AkahuFlowContract$InputData(parcel.readString(), (l0) parcel.readSerializable(), (z2) parcel.readSerializable(), (CreditApplicationPluginFlowContract$Configuration) parcel.readParcelable(AkahuFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AkahuFlowContract$InputData[i];
        }
    }

    public AkahuFlowContract$InputData(String akahuLink, l0 introPrompt, z2 z2Var, CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
        Intrinsics.checkNotNullParameter(akahuLink, "akahuLink");
        Intrinsics.checkNotNullParameter(introPrompt, "introPrompt");
        Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
        this.f67021a = akahuLink;
        this.f67022b = introPrompt;
        this.f67023c = z2Var;
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
        if (!(obj2 instanceof AkahuFlowContract$InputData)) {
            return false;
        }
        AkahuFlowContract$InputData akahuFlowContract$InputData = (AkahuFlowContract$InputData) obj2;
        return Intrinsics.f(this.f67021a, akahuFlowContract$InputData.f67021a) && Intrinsics.f(this.f67022b, akahuFlowContract$InputData.f67022b) && Intrinsics.f(this.f67023c, akahuFlowContract$InputData.f67023c) && Intrinsics.f(this.d, akahuFlowContract$InputData.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f67022b.hashCode() + (this.f67021a.hashCode() * 31)) * 31;
        z2 z2Var = this.f67023c;
        return this.d.hashCode() + ((iHashCode + (z2Var == null ? 0 : z2Var.hashCode())) * 31);
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final String k8() {
        return getD().f66892b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f67021a);
        dest.writeSerializable(this.f67022b);
        dest.writeSerializable(this.f67023c);
        dest.writeParcelable(this.d, i);
    }
}
