package com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import dx4.p4;
import ft3.j1;
import grl.r2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/refinancing_account_details/input/RefinancingAccountDetailsInputScreenContract$InputData", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowContract$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RefinancingAccountDetailsInputScreenContract$InputData implements PluginFlowContract$Input {

    @NotNull
    public static final Parcelable.Creator<RefinancingAccountDetailsInputScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p4 f68268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f68269c;
    public final CreditApplicationPluginFlowContract$Configuration d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RefinancingAccountDetailsInputScreenContract$InputData(parcel.readString(), (p4) parcel.readSerializable(), parcel.readInt(), (CreditApplicationPluginFlowContract$Configuration) parcel.readParcelable(RefinancingAccountDetailsInputScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RefinancingAccountDetailsInputScreenContract$InputData[i];
        }
    }

    public RefinancingAccountDetailsInputScreenContract$InputData(String facilityId, p4 screen, int i, CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
        this.f68267a = facilityId;
        this.f68268b = screen;
        this.f68269c = i;
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
        if (!(obj2 instanceof RefinancingAccountDetailsInputScreenContract$InputData)) {
            return false;
        }
        RefinancingAccountDetailsInputScreenContract$InputData refinancingAccountDetailsInputScreenContract$InputData = (RefinancingAccountDetailsInputScreenContract$InputData) obj2;
        return Intrinsics.f(this.f68267a, refinancingAccountDetailsInputScreenContract$InputData.f68267a) && Intrinsics.f(this.f68268b, refinancingAccountDetailsInputScreenContract$InputData.f68268b) && this.f68269c == refinancingAccountDetailsInputScreenContract$InputData.f68269c && Intrinsics.f(this.d, refinancingAccountDetailsInputScreenContract$InputData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.b(this.f68269c, (this.f68268b.hashCode() + (this.f68267a.hashCode() * 31)) * 31, 31);
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final String k8() {
        return getD().f66892b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f68267a);
        dest.writeSerializable(this.f68268b);
        dest.writeInt(this.f68269c);
        dest.writeParcelable(this.d, i);
    }
}
