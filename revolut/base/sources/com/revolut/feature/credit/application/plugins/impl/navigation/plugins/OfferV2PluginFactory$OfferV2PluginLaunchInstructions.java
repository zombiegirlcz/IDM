package com.revolut.feature.credit.application.plugins.impl.navigation.plugins;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.models.initialization_contract.PluginLaunchInstructions;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/navigation/plugins/OfferV2PluginFactory$OfferV2PluginLaunchInstructions", "Lcom/revolut/feature/credit/application/models/initialization_contract/PluginLaunchInstructions;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OfferV2PluginFactory$OfferV2PluginLaunchInstructions implements PluginLaunchInstructions {

    @NotNull
    public static final Parcelable.Creator<OfferV2PluginFactory$OfferV2PluginLaunchInstructions> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditApplicationKompotFeatureConfig.OfferV2.Config f66930a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OfferV2PluginFactory$OfferV2PluginLaunchInstructions((CreditApplicationKompotFeatureConfig.OfferV2.Config) parcel.readParcelable(OfferV2PluginFactory$OfferV2PluginLaunchInstructions.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OfferV2PluginFactory$OfferV2PluginLaunchInstructions[i];
        }
    }

    public OfferV2PluginFactory$OfferV2PluginLaunchInstructions(CreditApplicationKompotFeatureConfig.OfferV2.Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f66930a = config;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof OfferV2PluginFactory$OfferV2PluginLaunchInstructions) && Intrinsics.f(this.f66930a, ((OfferV2PluginFactory$OfferV2PluginLaunchInstructions) obj2).f66930a);
    }

    public final int hashCode() {
        return this.f66930a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f66930a, i);
    }
}
