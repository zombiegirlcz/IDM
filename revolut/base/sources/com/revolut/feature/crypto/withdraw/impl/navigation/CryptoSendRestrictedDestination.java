package com.revolut.feature.crypto.withdraw.impl.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/navigation/CryptoSendRestrictedDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoSendRestrictedDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<CryptoSendRestrictedDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PromptMarketingScreenContract$InputData f71155a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoSendRestrictedDestination((PromptMarketingScreenContract$InputData) parcel.readParcelable(CryptoSendRestrictedDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoSendRestrictedDestination[i];
        }
    }

    public CryptoSendRestrictedDestination(PromptMarketingScreenContract$InputData input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.f71155a = input;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final PromptMarketingScreenContract$InputData getF71155a() {
        return this.f71155a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof CryptoSendRestrictedDestination) && Intrinsics.f(this.f71155a, ((CryptoSendRestrictedDestination) obj2).f71155a);
    }

    public final int hashCode() {
        return this.f71155a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f71155a, i);
    }
}
