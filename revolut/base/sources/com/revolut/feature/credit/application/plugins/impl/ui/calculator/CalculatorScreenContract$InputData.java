package com.revolut.feature.credit.application.plugins.impl.ui.calculator;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import ft3.j1;
import grl.r2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/calculator/CalculatorScreenContract$InputData", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowContract$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CalculatorScreenContract$InputData implements PluginFlowContract$Input {

    @NotNull
    public static final Parcelable.Creator<CalculatorScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f67186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f67187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f67188c;
    public final fu3.a d;
    public final boolean e;
    public final CreditApplicationPluginFlowContract$Configuration f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CalculatorScreenContract$InputData(parcel.readInt(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? fu3.a.valueOf(parcel.readString()) : null, parcel.readInt() != 0, (CreditApplicationPluginFlowContract$Configuration) parcel.readParcelable(CalculatorScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CalculatorScreenContract$InputData[i];
        }
    }

    public CalculatorScreenContract$InputData(int i, Long l2, Long l3, fu3.a aVar, boolean z, CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
        Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
        this.f67186a = i;
        this.f67187b = l2;
        this.f67188c = l3;
        this.d = aVar;
        this.e = z;
        this.f = pluginConfiguration;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    /* JADX INFO: renamed from: O0, reason: from getter */
    public final CreditApplicationPluginFlowContract$Configuration getF68284a() {
        return this.f;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final r2 P9() {
        return this.f.f66893c;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final j1 R2() {
        return this.f.d;
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
        return this.f67186a == calculatorScreenContract$InputData.f67186a && Intrinsics.f(this.f67187b, calculatorScreenContract$InputData.f67187b) && Intrinsics.f(this.f67188c, calculatorScreenContract$InputData.f67188c) && this.d == calculatorScreenContract$InputData.d && this.e == calculatorScreenContract$InputData.e && Intrinsics.f(this.f, calculatorScreenContract$InputData.f);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f67186a) * 31;
        Long l2 = this.f67187b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f67188c;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        fu3.a aVar = this.d;
        return this.f.hashCode() + j6.a.c((iHashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31, 31, this.e);
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final String k8() {
        return getF68284a().f66892b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f67186a);
        Long l2 = this.f67187b;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l2);
        }
        Long l3 = this.f67188c;
        if (l3 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l3);
        }
        fu3.a aVar = this.d;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        dest.writeInt(this.e ? 1 : 0);
        dest.writeParcelable(this.f, i);
    }

    public /* synthetic */ CalculatorScreenContract$InputData(int i, Long l2, Long l3, fu3.a aVar, CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$Configuration, int i2) {
        this(i, l2, l3, (i2 & 8) != 0 ? null : aVar, false, creditApplicationPluginFlowContract$Configuration);
    }
}
