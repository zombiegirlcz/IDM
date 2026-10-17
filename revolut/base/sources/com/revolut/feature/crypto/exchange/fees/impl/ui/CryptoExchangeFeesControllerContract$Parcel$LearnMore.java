package com.revolut.feature.crypto.exchange.fees.impl.ui;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/revolut/feature/crypto/exchange/fees/impl/ui/CryptoExchangeFeesControllerContract$Parcel$LearnMore", "", "<init>", "()V", "feature_crypto_exchange_fees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoExchangeFeesControllerContract$Parcel$LearnMore implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CryptoExchangeFeesControllerContract$Parcel$LearnMore f70840a = new CryptoExchangeFeesControllerContract$Parcel$LearnMore();

    @NotNull
    public static final Parcelable.Creator<CryptoExchangeFeesControllerContract$Parcel$LearnMore> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return CryptoExchangeFeesControllerContract$Parcel$LearnMore.f70840a;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoExchangeFeesControllerContract$Parcel$LearnMore[i];
        }
    }

    private CryptoExchangeFeesControllerContract$Parcel$LearnMore() {
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
