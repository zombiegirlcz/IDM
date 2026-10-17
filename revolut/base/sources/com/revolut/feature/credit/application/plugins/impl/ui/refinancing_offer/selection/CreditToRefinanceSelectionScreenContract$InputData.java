package com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.selection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import ft3.j1;
import grl.r2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mv3.k;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/refinancing_offer/selection/CreditToRefinanceSelectionScreenContract$InputData", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowContract$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditToRefinanceSelectionScreenContract$InputData implements PluginFlowContract$Input {

    @NotNull
    public static final Parcelable.Creator<CreditToRefinanceSelectionScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f68296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f68297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f68298c;
    public final CreditApplicationPluginFlowContract$Configuration d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditToRefinanceSelectionScreenContract$InputData(parcel.readInt() != 0, parcel.readInt() != 0, (k) parcel.readSerializable(), (CreditApplicationPluginFlowContract$Configuration) parcel.readParcelable(CreditToRefinanceSelectionScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditToRefinanceSelectionScreenContract$InputData[i];
        }
    }

    public CreditToRefinanceSelectionScreenContract$InputData(boolean z, boolean z3, k kVar, CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
        Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
        this.f68296a = z;
        this.f68297b = z3;
        this.f68298c = kVar;
        this.d = pluginConfiguration;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    /* JADX INFO: renamed from: O0, reason: from getter */
    public final CreditApplicationPluginFlowContract$Configuration getF67448c() {
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
        if (!(obj2 instanceof CreditToRefinanceSelectionScreenContract$InputData)) {
            return false;
        }
        CreditToRefinanceSelectionScreenContract$InputData creditToRefinanceSelectionScreenContract$InputData = (CreditToRefinanceSelectionScreenContract$InputData) obj2;
        return this.f68296a == creditToRefinanceSelectionScreenContract$InputData.f68296a && this.f68297b == creditToRefinanceSelectionScreenContract$InputData.f68297b && Intrinsics.f(this.f68298c, creditToRefinanceSelectionScreenContract$InputData.f68298c) && Intrinsics.f(this.d, creditToRefinanceSelectionScreenContract$InputData.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(Boolean.hashCode(this.f68296a) * 31, 31, this.f68297b);
        k kVar = this.f68298c;
        return this.d.hashCode() + ((iC + (kVar == null ? 0 : kVar.hashCode())) * 31);
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final String k8() {
        return getF67448c().f66892b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f68296a ? 1 : 0);
        dest.writeInt(this.f68297b ? 1 : 0);
        dest.writeSerializable(this.f68298c);
        dest.writeParcelable(this.d, i);
    }
}
