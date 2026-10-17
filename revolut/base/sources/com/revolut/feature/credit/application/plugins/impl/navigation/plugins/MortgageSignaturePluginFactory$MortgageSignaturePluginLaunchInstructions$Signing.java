package com.revolut.feature.credit.application.plugins.impl.navigation.plugins;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.models.initialization_contract.PluginLaunchInstructions;
import hs3.r1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/navigation/plugins/MortgageSignaturePluginFactory$MortgageSignaturePluginLaunchInstructions$Signing", "", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MortgageSignaturePluginFactory$MortgageSignaturePluginLaunchInstructions$Signing implements PluginLaunchInstructions {

    @NotNull
    public static final Parcelable.Creator<MortgageSignaturePluginFactory$MortgageSignaturePluginLaunchInstructions$Signing> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1 f66927a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MortgageSignaturePluginFactory$MortgageSignaturePluginLaunchInstructions$Signing(r1.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MortgageSignaturePluginFactory$MortgageSignaturePluginLaunchInstructions$Signing[i];
        }
    }

    public MortgageSignaturePluginFactory$MortgageSignaturePluginLaunchInstructions$Signing(r1 signatureType) {
        Intrinsics.checkNotNullParameter(signatureType, "signatureType");
        this.f66927a = signatureType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof MortgageSignaturePluginFactory$MortgageSignaturePluginLaunchInstructions$Signing) && this.f66927a == ((MortgageSignaturePluginFactory$MortgageSignaturePluginLaunchInstructions$Signing) obj2).f66927a;
    }

    public final int hashCode() {
        return this.f66927a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f66927a.name());
    }
}
