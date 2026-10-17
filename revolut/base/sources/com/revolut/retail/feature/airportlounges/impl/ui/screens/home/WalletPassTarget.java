package com.revolut.retail.feature.airportlounges.impl.ui.screens.home;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0081\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/home/WalletPassTarget;", "Landroid/os/Parcelable;", "", "Recurring", "Unlimited", "Extra", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WalletPassTarget implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ WalletPassTarget[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<WalletPassTarget> CREATOR;
    public static final WalletPassTarget Extra;
    public static final WalletPassTarget Recurring;
    public static final WalletPassTarget Unlimited;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return WalletPassTarget.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WalletPassTarget[i];
        }
    }

    static {
        WalletPassTarget walletPassTarget = new WalletPassTarget("Recurring", 0);
        Recurring = walletPassTarget;
        WalletPassTarget walletPassTarget2 = new WalletPassTarget("Unlimited", 1);
        Unlimited = walletPassTarget2;
        WalletPassTarget walletPassTarget3 = new WalletPassTarget("Extra", 2);
        Extra = walletPassTarget3;
        WalletPassTarget[] walletPassTargetArr = {walletPassTarget, walletPassTarget2, walletPassTarget3};
        $VALUES = walletPassTargetArr;
        $ENTRIES = s.n(walletPassTargetArr);
        CREATOR = new a();
    }

    public static WalletPassTarget valueOf(String str) {
        return (WalletPassTarget) Enum.valueOf(WalletPassTarget.class, str);
    }

    public static WalletPassTarget[] values() {
        return (WalletPassTarget[]) $VALUES.clone();
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
