package com.revolut.feature.credit.application.plugins.impl.ui.combo_card_ordering;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import com.revolut.kompot.common.IOData$Input;
import ft3.j1;
import grl.r2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/combo_card_ordering/ComboCardOrderingFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowContract$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ComboCardOrderingFlowContract$InputData implements IOData$Input, PluginFlowContract$Input {

    @NotNull
    public static final Parcelable.Creator<ComboCardOrderingFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f67239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PluginPayload f67240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CreditApplicationPluginFlowContract$Configuration f67241c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ComboCardOrderingFlowContract$InputData((PluginPayload) parcel.readParcelable(ComboCardOrderingFlowContract$InputData.class.getClassLoader()), (CreditApplicationPluginFlowContract$Configuration) parcel.readParcelable(ComboCardOrderingFlowContract$InputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ComboCardOrderingFlowContract$InputData[i];
        }
    }

    public ComboCardOrderingFlowContract$InputData(PluginPayload pluginPayload, CreditApplicationPluginFlowContract$Configuration pluginConfiguration, boolean z) {
        Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
        Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
        this.f67239a = z;
        this.f67240b = pluginPayload;
        this.f67241c = pluginConfiguration;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    /* JADX INFO: renamed from: O0, reason: from getter */
    public final CreditApplicationPluginFlowContract$Configuration getF68415b() {
        return this.f67241c;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final r2 P9() {
        return this.f67241c.f66893c;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final j1 R2() {
        return this.f67241c.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ComboCardOrderingFlowContract$InputData)) {
            return false;
        }
        ComboCardOrderingFlowContract$InputData comboCardOrderingFlowContract$InputData = (ComboCardOrderingFlowContract$InputData) obj2;
        return this.f67239a == comboCardOrderingFlowContract$InputData.f67239a && Intrinsics.f(this.f67240b, comboCardOrderingFlowContract$InputData.f67240b) && Intrinsics.f(this.f67241c, comboCardOrderingFlowContract$InputData.f67241c);
    }

    public final int hashCode() {
        return this.f67241c.hashCode() + ((this.f67240b.hashCode() + (Boolean.hashCode(this.f67239a) * 31)) * 31);
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final String k8() {
        return getD().f66892b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f67239a ? 1 : 0);
        dest.writeParcelable(this.f67240b, i);
        dest.writeParcelable(this.f67241c, i);
    }
}
