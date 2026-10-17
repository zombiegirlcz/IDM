package com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import ft3.j1;
import grl.r2;
import hs3.j0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/mortgage_offer/MortgageOfferFlowContract$InputData", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowContract$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MortgageOfferFlowContract$InputData implements PluginFlowContract$Input {

    @NotNull
    public static final Parcelable.Creator<MortgageOfferFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hs3.c f67968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditApplicationPluginFlowContract$Configuration f67969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0 f67970c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MortgageOfferFlowContract$InputData((hs3.c) parcel.readSerializable(), (CreditApplicationPluginFlowContract$Configuration) parcel.readParcelable(MortgageOfferFlowContract$InputData.class.getClassLoader()), j0.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MortgageOfferFlowContract$InputData[i];
        }
    }

    public MortgageOfferFlowContract$InputData(hs3.c cVar, CreditApplicationPluginFlowContract$Configuration pluginConfiguration, j0 initialOfferLayout) {
        Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
        Intrinsics.checkNotNullParameter(initialOfferLayout, "initialOfferLayout");
        this.f67968a = cVar;
        this.f67969b = pluginConfiguration;
        this.f67970c = initialOfferLayout;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    /* JADX INFO: renamed from: O0, reason: from getter */
    public final CreditApplicationPluginFlowContract$Configuration getF67244a() {
        return this.f67969b;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final r2 P9() {
        return this.f67969b.f66893c;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final j1 R2() {
        return this.f67969b.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MortgageOfferFlowContract$InputData)) {
            return false;
        }
        MortgageOfferFlowContract$InputData mortgageOfferFlowContract$InputData = (MortgageOfferFlowContract$InputData) obj2;
        return Intrinsics.f(this.f67968a, mortgageOfferFlowContract$InputData.f67968a) && Intrinsics.f(this.f67969b, mortgageOfferFlowContract$InputData.f67969b) && this.f67970c == mortgageOfferFlowContract$InputData.f67970c;
    }

    public final int hashCode() {
        hs3.c cVar = this.f67968a;
        return this.f67970c.hashCode() + org.bouncycastle.jcajce.provider.digest.a.c(this.f67969b, (cVar == null ? 0 : cVar.hashCode()) * 31, 31);
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final String k8() {
        return getF67244a().f66892b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f67968a);
        dest.writeParcelable(this.f67969b, i);
        dest.writeString(this.f67970c.name());
    }
}
