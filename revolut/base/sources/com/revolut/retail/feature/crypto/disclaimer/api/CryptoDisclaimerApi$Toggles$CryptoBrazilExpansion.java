package com.revolut.retail.feature.crypto.disclaimer.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.abexperiments.models.Experiment;
import com.revolut.feature.abexperiments.models.ReleaseFlagExperiment;
import com.revolut.feature.toggles.models.RemoteFeatureDefinition;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/revolut/retail/feature/crypto/disclaimer/api/CryptoDisclaimerApi$Toggles$CryptoBrazilExpansion", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_crypto_disclaimer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoDisclaimerApi$Toggles$CryptoBrazilExpansion extends RemoteFeatureDefinition {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final CryptoDisclaimerApi$Toggles$CryptoBrazilExpansion f100018c = new CryptoDisclaimerApi$Toggles$CryptoBrazilExpansion();

    @NotNull
    public static final Parcelable.Creator<CryptoDisclaimerApi$Toggles$CryptoBrazilExpansion> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return CryptoDisclaimerApi$Toggles$CryptoBrazilExpansion.f100018c;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoDisclaimerApi$Toggles$CryptoBrazilExpansion[i];
        }
    }

    private CryptoDisclaimerApi$Toggles$CryptoBrazilExpansion() {
    }

    @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
    public final Experiment a() {
        return new ReleaseFlagExperiment("cryptoBrazilExpansion");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }
}
