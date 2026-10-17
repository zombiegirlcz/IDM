package com.revolut.feature.crypto.onboarding.api.disclaimer;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/crypto/onboarding/api/disclaimer/CryptoFcaDisclaimerWidget$Parcel$DisclaimerLink", "", "", "toString", "()Ljava/lang/String;", "feature_crypto_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoFcaDisclaimerWidget$Parcel$DisclaimerLink implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CryptoFcaDisclaimerWidget$Parcel$DisclaimerLink> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f70886a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoFcaDisclaimerWidget$Parcel$DisclaimerLink((b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoFcaDisclaimerWidget$Parcel$DisclaimerLink[i];
        }
    }

    public CryptoFcaDisclaimerWidget$Parcel$DisclaimerLink(b bVar) {
        this.f70886a = bVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof CryptoFcaDisclaimerWidget$Parcel$DisclaimerLink) && Intrinsics.f(this.f70886a, ((CryptoFcaDisclaimerWidget$Parcel$DisclaimerLink) obj2).f70886a);
    }

    public final int hashCode() {
        b bVar = this.f70886a;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f70886a);
    }
}
