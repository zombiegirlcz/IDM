package com.revolut.feature.crypto.exchange.fees.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/exchange/fees/api/model/CryptoExchangeFeesDialogMode;", "Landroid/os/Parcelable;", "", "DEFAULT", "INFORMATIONAL", "feature_crypto_exchange_fees_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoExchangeFeesDialogMode implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CryptoExchangeFeesDialogMode[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<CryptoExchangeFeesDialogMode> CREATOR;
    public static final CryptoExchangeFeesDialogMode DEFAULT;
    public static final CryptoExchangeFeesDialogMode INFORMATIONAL;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return CryptoExchangeFeesDialogMode.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoExchangeFeesDialogMode[i];
        }
    }

    static {
        CryptoExchangeFeesDialogMode cryptoExchangeFeesDialogMode = new CryptoExchangeFeesDialogMode("DEFAULT", 0);
        DEFAULT = cryptoExchangeFeesDialogMode;
        CryptoExchangeFeesDialogMode cryptoExchangeFeesDialogMode2 = new CryptoExchangeFeesDialogMode("INFORMATIONAL", 1);
        INFORMATIONAL = cryptoExchangeFeesDialogMode2;
        CryptoExchangeFeesDialogMode[] cryptoExchangeFeesDialogModeArr = {cryptoExchangeFeesDialogMode, cryptoExchangeFeesDialogMode2};
        $VALUES = cryptoExchangeFeesDialogModeArr;
        $ENTRIES = s.n(cryptoExchangeFeesDialogModeArr);
        CREATOR = new a();
    }

    public static CryptoExchangeFeesDialogMode valueOf(String str) {
        return (CryptoExchangeFeesDialogMode) Enum.valueOf(CryptoExchangeFeesDialogMode.class, str);
    }

    public static CryptoExchangeFeesDialogMode[] values() {
        return (CryptoExchangeFeesDialogMode[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }
}
