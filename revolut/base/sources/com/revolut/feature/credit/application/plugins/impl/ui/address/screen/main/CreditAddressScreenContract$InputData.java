package com.revolut.feature.credit.application.plugins.impl.ui.address.screen.main;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import cu3.e;
import ft3.j1;
import grl.r2;
import gv3.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/address/screen/main/CreditAddressScreenContract$InputData", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowContract$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditAddressScreenContract$InputData implements PluginFlowContract$Input {

    @NotNull
    public static final Parcelable.Creator<CreditAddressScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditApplicationPluginFlowContract$Configuration f66957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f66958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f66959c;
    public final e d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditAddressScreenContract$InputData((CreditApplicationPluginFlowContract$Configuration) parcel.readParcelable(CreditAddressScreenContract$InputData.class.getClassLoader()), (b) parcel.readSerializable(), (b) parcel.readSerializable(), e.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditAddressScreenContract$InputData[i];
        }
    }

    public CreditAddressScreenContract$InputData(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, b bVar, b bVar2, e addressType) {
        Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
        Intrinsics.checkNotNullParameter(addressType, "addressType");
        this.f66957a = pluginConfiguration;
        this.f66958b = bVar;
        this.f66959c = bVar2;
        this.d = addressType;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    /* JADX INFO: renamed from: O0, reason: from getter */
    public final CreditApplicationPluginFlowContract$Configuration getD() {
        return this.f66957a;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final r2 P9() {
        return this.f66957a.f66893c;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final j1 R2() {
        return this.f66957a.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditAddressScreenContract$InputData)) {
            return false;
        }
        CreditAddressScreenContract$InputData creditAddressScreenContract$InputData = (CreditAddressScreenContract$InputData) obj2;
        return Intrinsics.f(this.f66957a, creditAddressScreenContract$InputData.f66957a) && Intrinsics.f(this.f66958b, creditAddressScreenContract$InputData.f66958b) && Intrinsics.f(this.f66959c, creditAddressScreenContract$InputData.f66959c) && this.d == creditAddressScreenContract$InputData.d;
    }

    public final int hashCode() {
        int iHashCode = this.f66957a.hashCode() * 31;
        b bVar = this.f66958b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        b bVar2 = this.f66959c;
        return this.d.hashCode() + ((iHashCode2 + (bVar2 != null ? bVar2.hashCode() : 0)) * 31);
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final String k8() {
        return getD().f66892b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f66957a, i);
        dest.writeSerializable(this.f66958b);
        dest.writeSerializable(this.f66959c);
        dest.writeString(this.d.name());
    }
}
