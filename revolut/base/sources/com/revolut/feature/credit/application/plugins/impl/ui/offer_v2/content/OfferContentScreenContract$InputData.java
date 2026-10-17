package com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import cv3.s;
import ft3.j1;
import grl.r2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pf4.c;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/offer_v2/content/OfferContentScreenContract$InputData", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowContract$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OfferContentScreenContract$InputData implements PluginFlowContract$Input {

    @NotNull
    public static final Parcelable.Creator<OfferContentScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditApplicationPluginFlowContract$Configuration f68133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f68134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f68135c;
    public final Parcelable d;
    public final boolean e;
    public final c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zv3.a f68136g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OfferContentScreenContract$InputData((CreditApplicationPluginFlowContract$Configuration) parcel.readParcelable(OfferContentScreenContract$InputData.class.getClassLoader()), (s) parcel.readSerializable(), parcel.readString(), parcel.readParcelable(OfferContentScreenContract$InputData.class.getClassLoader()), parcel.readInt() != 0, c.valueOf(parcel.readString()), zv3.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OfferContentScreenContract$InputData[i];
        }
    }

    public OfferContentScreenContract$InputData(CreditApplicationPluginFlowContract$Configuration pluginConfiguration, s sVar, String str, Parcelable parcelable, boolean z, c buttonLoadingMode, zv3.a navigationIcon) {
        Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
        Intrinsics.checkNotNullParameter(buttonLoadingMode, "buttonLoadingMode");
        Intrinsics.checkNotNullParameter(navigationIcon, "navigationIcon");
        this.f68133a = pluginConfiguration;
        this.f68134b = sVar;
        this.f68135c = str;
        this.d = parcelable;
        this.e = z;
        this.f = buttonLoadingMode;
        this.f68136g = navigationIcon;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    /* JADX INFO: renamed from: O0, reason: from getter */
    public final CreditApplicationPluginFlowContract$Configuration getD() {
        return this.f68133a;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final r2 P9() {
        return this.f68133a.f66893c;
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final j1 R2() {
        return this.f68133a.d;
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
        return Intrinsics.f(this.f68133a, offerContentScreenContract$InputData.f68133a) && Intrinsics.f(this.f68134b, offerContentScreenContract$InputData.f68134b) && Intrinsics.f(this.f68135c, offerContentScreenContract$InputData.f68135c) && Intrinsics.f(this.d, offerContentScreenContract$InputData.d) && this.e == offerContentScreenContract$InputData.e && this.f == offerContentScreenContract$InputData.f && this.f68136g == offerContentScreenContract$InputData.f68136g;
    }

    public final int hashCode() {
        int iHashCode = this.f68133a.hashCode() * 31;
        s sVar = this.f68134b;
        int iHashCode2 = (iHashCode + (sVar == null ? 0 : sVar.hashCode())) * 31;
        String str = this.f68135c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Parcelable parcelable = this.d;
        return this.f68136g.hashCode() + ((this.f.hashCode() + j6.a.c((iHashCode3 + (parcelable != null ? parcelable.hashCode() : 0)) * 31, 31, this.e)) * 31);
    }

    @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
    public final String k8() {
        return getD().f66892b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f68133a, i);
        dest.writeSerializable(this.f68134b);
        dest.writeString(this.f68135c);
        dest.writeParcelable(this.d, i);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeString(this.f.name());
        dest.writeString(this.f68136g.name());
    }

    public /* synthetic */ OfferContentScreenContract$InputData(CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$Configuration, s sVar, String str, Parcelable parcelable, c cVar, zv3.a aVar, int i) {
        this(creditApplicationPluginFlowContract$Configuration, (i & 2) != 0 ? null : sVar, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : parcelable, (i & 16) == 0, (i & 32) != 0 ? c.NON_BLOCKING : cVar, (i & 64) != 0 ? zv3.a.CLOSE : aVar);
    }
}
