package com.revolut.feature.credit.application.plugins.impl.ui.kontomatik;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.navigation.KontomatikIncomeCheckEntryPoint;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import ft3.j1;
import grl.r2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/kontomatik/KontomatikIncomeCheckFlowContract$InputData", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowContract$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class KontomatikIncomeCheckFlowContract$InputData implements PluginFlowContract$Input {

    @NotNull
    public static final Parcelable.Creator<KontomatikIncomeCheckFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f67799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditApplicationPluginFlowContract$Configuration f67800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KontomatikIncomeCheckEntryPoint f67801c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new KontomatikIncomeCheckFlowContract$InputData(parcel.readInt() != 0, (CreditApplicationPluginFlowContract$Configuration) parcel.readParcelable(KontomatikIncomeCheckFlowContract$InputData.class.getClassLoader()), (KontomatikIncomeCheckEntryPoint) parcel.readParcelable(KontomatikIncomeCheckFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new KontomatikIncomeCheckFlowContract$InputData[i];
        }
    }

    public KontomatikIncomeCheckFlowContract$InputData(boolean z, CreditApplicationPluginFlowContract$Configuration pluginConfiguration, KontomatikIncomeCheckEntryPoint entryPoint) {
        Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        this.f67799a = z;
        this.f67800b = pluginConfiguration;
        this.f67801c = entryPoint;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    /* JADX INFO: renamed from: O0, reason: from getter */
    public final CreditApplicationPluginFlowContract$Configuration getF67800b() {
        return this.f67800b;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final r2 P9() {
        return this.f67800b.f66893c;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final j1 R2() {
        return this.f67800b.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof KontomatikIncomeCheckFlowContract$InputData)) {
            return false;
        }
        KontomatikIncomeCheckFlowContract$InputData kontomatikIncomeCheckFlowContract$InputData = (KontomatikIncomeCheckFlowContract$InputData) obj2;
        return this.f67799a == kontomatikIncomeCheckFlowContract$InputData.f67799a && Intrinsics.f(this.f67800b, kontomatikIncomeCheckFlowContract$InputData.f67800b) && Intrinsics.f(this.f67801c, kontomatikIncomeCheckFlowContract$InputData.f67801c);
    }

    public final int hashCode() {
        return this.f67801c.hashCode() + org.bouncycastle.jcajce.provider.digest.a.c(this.f67800b, Boolean.hashCode(this.f67799a) * 31, 31);
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final String k8() {
        return getF67800b().f66892b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f67799a ? 1 : 0);
        dest.writeParcelable(this.f67800b, i);
        dest.writeParcelable(this.f67801c, i);
    }
}
