package com.revolut.feature.credit.application.plugins.impl.navigation.plugins;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.models.initialization_contract.PluginLaunchInstructions;
import com.revolut.feature.credit.application.plugins.api.models.CreditOfferParcel;
import hs3.k0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/navigation/plugins/OfferPluginFactory$OfferPluginLaunchInstructions", "Lcom/revolut/feature/credit/application/models/initialization_contract/PluginLaunchInstructions;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OfferPluginFactory$OfferPluginLaunchInstructions implements PluginLaunchInstructions {

    @NotNull
    public static final Parcelable.Creator<OfferPluginFactory$OfferPluginLaunchInstructions> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditOfferParcel f66928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f66929b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OfferPluginFactory$OfferPluginLaunchInstructions((CreditOfferParcel) parcel.readParcelable(OfferPluginFactory$OfferPluginLaunchInstructions.class.getClassLoader()), (k0) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OfferPluginFactory$OfferPluginLaunchInstructions[i];
        }
    }

    public OfferPluginFactory$OfferPluginLaunchInstructions(CreditOfferParcel parcel, k0 metadata) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.f66928a = parcel;
        this.f66929b = metadata;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OfferPluginFactory$OfferPluginLaunchInstructions)) {
            return false;
        }
        OfferPluginFactory$OfferPluginLaunchInstructions offerPluginFactory$OfferPluginLaunchInstructions = (OfferPluginFactory$OfferPluginLaunchInstructions) obj2;
        return Intrinsics.f(this.f66928a, offerPluginFactory$OfferPluginLaunchInstructions.f66928a) && Intrinsics.f(this.f66929b, offerPluginFactory$OfferPluginLaunchInstructions.f66929b);
    }

    public final int hashCode() {
        return this.f66929b.hashCode() + (Boolean.hashCode(this.f66928a.f66285a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f66928a, i);
        dest.writeSerializable(this.f66929b);
    }
}
