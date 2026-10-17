package com.revolut.feature.credit.application.plugins.impl.ui.plan_selection;

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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/plan_selection/CreditPlanSelectionFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowContract$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditPlanSelectionFlowContract$InputData implements IOData$Input, PluginFlowContract$Input {

    @NotNull
    public static final Parcelable.Creator<CreditPlanSelectionFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f68206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CreditApplicationPluginFlowContract$Configuration f68207c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditPlanSelectionFlowContract$InputData(parcel.readString(), parcel.readString(), (CreditApplicationPluginFlowContract$Configuration) parcel.readParcelable(CreditPlanSelectionFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditPlanSelectionFlowContract$InputData[i];
        }
    }

    public CreditPlanSelectionFlowContract$InputData(String planDashboardSource, String title, CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
        Intrinsics.checkNotNullParameter(planDashboardSource, "planDashboardSource");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
        this.f68205a = planDashboardSource;
        this.f68206b = title;
        this.f68207c = pluginConfiguration;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    /* JADX INFO: renamed from: O0, reason: from getter */
    public final CreditApplicationPluginFlowContract$Configuration getF68342c() {
        return this.f68207c;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final r2 P9() {
        return this.f68207c.f66893c;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final j1 R2() {
        return this.f68207c.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditPlanSelectionFlowContract$InputData)) {
            return false;
        }
        CreditPlanSelectionFlowContract$InputData creditPlanSelectionFlowContract$InputData = (CreditPlanSelectionFlowContract$InputData) obj2;
        return Intrinsics.f(this.f68205a, creditPlanSelectionFlowContract$InputData.f68205a) && Intrinsics.f(this.f68206b, creditPlanSelectionFlowContract$InputData.f68206b) && Intrinsics.f(this.f68207c, creditPlanSelectionFlowContract$InputData.f68207c);
    }

    public final int hashCode() {
        return this.f68207c.hashCode() + p.a.c(this.f68205a.hashCode() * 31, 31, this.f68206b);
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final String k8() {
        return getF68342c().f66892b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f68205a);
        dest.writeString(this.f68206b);
        dest.writeParcelable(this.f68207c, i);
    }
}
