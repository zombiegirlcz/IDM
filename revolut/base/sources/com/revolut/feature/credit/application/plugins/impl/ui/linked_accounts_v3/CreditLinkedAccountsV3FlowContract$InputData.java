package com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v3;

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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v3/CreditLinkedAccountsV3FlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowContract$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditLinkedAccountsV3FlowContract$InputData implements IOData$Input, PluginFlowContract$Input {

    @NotNull
    public static final Parcelable.Creator<CreditLinkedAccountsV3FlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditApplicationPluginFlowContract$Configuration f67853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f67854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f67855c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditLinkedAccountsV3FlowContract$InputData((CreditApplicationPluginFlowContract$Configuration) parcel.readParcelable(CreditLinkedAccountsV3FlowContract$InputData.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditLinkedAccountsV3FlowContract$InputData[i];
        }
    }

    public CreditLinkedAccountsV3FlowContract$InputData(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
        this.f67853a = pluginConfiguration;
        this.f67854b = z;
        this.f67855c = z3;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    /* JADX INFO: renamed from: O0, reason: from getter */
    public final CreditApplicationPluginFlowContract$Configuration getF67853a() {
        return this.f67853a;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final r2 P9() {
        return this.f67853a.f66893c;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final j1 R2() {
        return this.f67853a.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditLinkedAccountsV3FlowContract$InputData)) {
            return false;
        }
        CreditLinkedAccountsV3FlowContract$InputData creditLinkedAccountsV3FlowContract$InputData = (CreditLinkedAccountsV3FlowContract$InputData) obj2;
        return Intrinsics.f(this.f67853a, creditLinkedAccountsV3FlowContract$InputData.f67853a) && this.f67854b == creditLinkedAccountsV3FlowContract$InputData.f67854b && this.f67855c == creditLinkedAccountsV3FlowContract$InputData.f67855c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f67855c) + j6.a.c(this.f67853a.hashCode() * 31, 31, this.f67854b);
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final String k8() {
        return getF67853a().f66892b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f67853a, i);
        dest.writeInt(this.f67854b ? 1 : 0);
        dest.writeInt(this.f67855c ? 1 : 0);
    }
}
