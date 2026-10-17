package com.revolut.feature.crypto.features.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/features/api/navigation/CryptoFeaturesDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_crypto_features_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoFeaturesDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<CryptoFeaturesDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gg5.a f70849a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoFeaturesDestination(parcel.readInt() == 0 ? null : gg5.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoFeaturesDestination[i];
        }
    }

    public CryptoFeaturesDestination(gg5.a aVar) {
        this.f70849a = aVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof CryptoFeaturesDestination) && this.f70849a == ((CryptoFeaturesDestination) obj2).f70849a;
    }

    public final int hashCode() {
        gg5.a aVar = this.f70849a;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        gg5.a aVar = this.f70849a;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
    }

    public CryptoFeaturesDestination() {
        this(null);
    }
}
