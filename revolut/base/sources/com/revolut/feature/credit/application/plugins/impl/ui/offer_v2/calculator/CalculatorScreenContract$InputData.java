package com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import ft3.j1;
import grl.r2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/offer_v2/calculator/CalculatorScreenContract$InputData", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowContract$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CalculatorScreenContract$InputData implements PluginFlowContract$Input {

    @NotNull
    public static final Parcelable.Creator<CalculatorScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f68121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f68122c;
    public final CreditApplicationPluginFlowContract$Configuration d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CalculatorScreenContract$InputData(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, (CreditApplicationPluginFlowContract$Configuration) parcel.readParcelable(CalculatorScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CalculatorScreenContract$InputData[i];
        }
    }

    public CalculatorScreenContract$InputData(String screenId, boolean z, boolean z3, CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
        Intrinsics.checkNotNullParameter(screenId, "screenId");
        Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
        this.f68120a = screenId;
        this.f68121b = z;
        this.f68122c = z3;
        this.d = pluginConfiguration;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    /* JADX INFO: renamed from: O0, reason: from getter */
    public final CreditApplicationPluginFlowContract$Configuration getF68159a() {
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
        if (!(obj2 instanceof CalculatorScreenContract$InputData)) {
            return false;
        }
        CalculatorScreenContract$InputData calculatorScreenContract$InputData = (CalculatorScreenContract$InputData) obj2;
        return Intrinsics.f(this.f68120a, calculatorScreenContract$InputData.f68120a) && this.f68121b == calculatorScreenContract$InputData.f68121b && this.f68122c == calculatorScreenContract$InputData.f68122c && Intrinsics.f(this.d, calculatorScreenContract$InputData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c(j6.a.c(this.f68120a.hashCode() * 31, 31, this.f68121b), 31, this.f68122c);
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final String k8() {
        return getF68159a().f66892b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f68120a);
        dest.writeInt(this.f68121b ? 1 : 0);
        dest.writeInt(this.f68122c ? 1 : 0);
        dest.writeParcelable(this.d, i);
    }
}
