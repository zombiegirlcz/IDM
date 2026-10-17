package com.revolut.feature.credit.application.plugins.impl.ui.offer.content;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.models.CreditOfferParcel;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import ft3.j1;
import grl.r2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/offer/content/OfferContentScreenContract$InputData", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowContract$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OfferContentScreenContract$InputData implements PluginFlowContract$Input {

    @NotNull
    public static final Parcelable.Creator<OfferContentScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f68079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f68080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fu3.a f68081c;
    public final CreditOfferParcel d;
    public final CreditApplicationPluginFlowContract$Configuration e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OfferContentScreenContract$InputData(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? fu3.a.valueOf(parcel.readString()) : null, (CreditOfferParcel) parcel.readParcelable(OfferContentScreenContract$InputData.class.getClassLoader()), (CreditApplicationPluginFlowContract$Configuration) parcel.readParcelable(OfferContentScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OfferContentScreenContract$InputData[i];
        }
    }

    public OfferContentScreenContract$InputData(Long l2, Long l3, fu3.a aVar, CreditOfferParcel parcel, CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
        this.f68079a = l2;
        this.f68080b = l3;
        this.f68081c = aVar;
        this.d = parcel;
        this.e = pluginConfiguration;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    /* JADX INFO: renamed from: O0, reason: from getter */
    public final CreditApplicationPluginFlowContract$Configuration getF66957a() {
        return this.e;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final r2 P9() {
        return this.e.f66893c;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final j1 R2() {
        return this.e.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OfferContentScreenContract$InputData)) {
            return false;
        }
        OfferContentScreenContract$InputData offerContentScreenContract$InputData = (OfferContentScreenContract$InputData) obj2;
        return Intrinsics.f(this.f68079a, offerContentScreenContract$InputData.f68079a) && Intrinsics.f(this.f68080b, offerContentScreenContract$InputData.f68080b) && this.f68081c == offerContentScreenContract$InputData.f68081c && Intrinsics.f(this.d, offerContentScreenContract$InputData.d) && Intrinsics.f(this.e, offerContentScreenContract$InputData.e);
    }

    public final int hashCode() {
        Long l2 = this.f68079a;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        Long l3 = this.f68080b;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        fu3.a aVar = this.f68081c;
        return this.e.hashCode() + j6.a.c((iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31, 31, this.d.f66285a);
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final String k8() {
        return getF66957a().f66892b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Long l2 = this.f68079a;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l2);
        }
        Long l3 = this.f68080b;
        if (l3 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l3);
        }
        fu3.a aVar = this.f68081c;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
    }
}
