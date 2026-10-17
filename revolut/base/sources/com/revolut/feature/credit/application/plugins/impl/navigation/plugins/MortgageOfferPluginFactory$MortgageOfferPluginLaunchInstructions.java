package com.revolut.feature.credit.application.plugins.impl.navigation.plugins;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.models.initialization_contract.PluginLaunchInstructions;
import hs3.c;
import hs3.j0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/navigation/plugins/MortgageOfferPluginFactory$MortgageOfferPluginLaunchInstructions", "Lcom/revolut/feature/credit/application/models/initialization_contract/PluginLaunchInstructions;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MortgageOfferPluginFactory$MortgageOfferPluginLaunchInstructions implements PluginLaunchInstructions {

    @NotNull
    public static final Parcelable.Creator<MortgageOfferPluginFactory$MortgageOfferPluginLaunchInstructions> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f66925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f66926b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MortgageOfferPluginFactory$MortgageOfferPluginLaunchInstructions((c) parcel.readSerializable(), j0.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MortgageOfferPluginFactory$MortgageOfferPluginLaunchInstructions[i];
        }
    }

    public MortgageOfferPluginFactory$MortgageOfferPluginLaunchInstructions(c cVar, j0 initialOfferLayout) {
        Intrinsics.checkNotNullParameter(initialOfferLayout, "initialOfferLayout");
        this.f66925a = cVar;
        this.f66926b = initialOfferLayout;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MortgageOfferPluginFactory$MortgageOfferPluginLaunchInstructions)) {
            return false;
        }
        MortgageOfferPluginFactory$MortgageOfferPluginLaunchInstructions mortgageOfferPluginFactory$MortgageOfferPluginLaunchInstructions = (MortgageOfferPluginFactory$MortgageOfferPluginLaunchInstructions) obj2;
        return Intrinsics.f(this.f66925a, mortgageOfferPluginFactory$MortgageOfferPluginLaunchInstructions.f66925a) && this.f66926b == mortgageOfferPluginFactory$MortgageOfferPluginLaunchInstructions.f66926b;
    }

    public final int hashCode() {
        c cVar = this.f66925a;
        return this.f66926b.hashCode() + ((cVar == null ? 0 : cVar.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f66925a);
        dest.writeString(this.f66926b.name());
    }
}
