package com.revolut.shared.feature.wealth.models.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/transaction/FeeType;", "Landroid/os/Parcelable;", "", "", "rawValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "TRADING_PRO_FEE", "PRIVATE_MARKETS_CUSTODY_FEE", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FeeType implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FeeType[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<FeeType> CREATOR;

    @b("PRIVATE_MARKETS_CUSTODY_FEE")
    public static final FeeType PRIVATE_MARKETS_CUSTODY_FEE;

    @b("TRADING_PRO_FEE")
    public static final FeeType TRADING_PRO_FEE;

    @NotNull
    private final String rawValue;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return FeeType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FeeType[i];
        }
    }

    static {
        FeeType feeType = new FeeType("TRADING_PRO_FEE", 0, "TRADING_PRO_FEE");
        TRADING_PRO_FEE = feeType;
        FeeType feeType2 = new FeeType("PRIVATE_MARKETS_CUSTODY_FEE", 1, "PRIVATE_MARKETS_CUSTODY_FEE");
        PRIVATE_MARKETS_CUSTODY_FEE = feeType2;
        FeeType[] feeTypeArr = {feeType, feeType2};
        $VALUES = feeTypeArr;
        $ENTRIES = s.n(feeTypeArr);
        CREATOR = new a();
    }

    public FeeType(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static FeeType valueOf(String str) {
        return (FeeType) Enum.valueOf(FeeType.class, str);
    }

    public static FeeType[] values() {
        return (FeeType[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
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
