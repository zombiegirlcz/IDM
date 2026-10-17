package com.revolut.retail.feature.trading_onboarding.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/api/navigation/EndPromptType;", "Landroid/os/Parcelable;", "", "STOCK_LENDING", "TRADING", "JOINT_TRADING", "ROBO", "ROBO_REMEDIATION", "feature_trading_onboarding_revamp_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EndPromptType implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EndPromptType[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<EndPromptType> CREATOR;
    public static final EndPromptType JOINT_TRADING;
    public static final EndPromptType ROBO;
    public static final EndPromptType ROBO_REMEDIATION;
    public static final EndPromptType STOCK_LENDING;
    public static final EndPromptType TRADING;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return EndPromptType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EndPromptType[i];
        }
    }

    static {
        EndPromptType endPromptType = new EndPromptType("STOCK_LENDING", 0);
        STOCK_LENDING = endPromptType;
        EndPromptType endPromptType2 = new EndPromptType("TRADING", 1);
        TRADING = endPromptType2;
        EndPromptType endPromptType3 = new EndPromptType("JOINT_TRADING", 2);
        JOINT_TRADING = endPromptType3;
        EndPromptType endPromptType4 = new EndPromptType("ROBO", 3);
        ROBO = endPromptType4;
        EndPromptType endPromptType5 = new EndPromptType("ROBO_REMEDIATION", 4);
        ROBO_REMEDIATION = endPromptType5;
        EndPromptType[] endPromptTypeArr = {endPromptType, endPromptType2, endPromptType3, endPromptType4, endPromptType5};
        $VALUES = endPromptTypeArr;
        $ENTRIES = s.n(endPromptTypeArr);
        CREATOR = new a();
    }

    public static EndPromptType valueOf(String str) {
        return (EndPromptType) Enum.valueOf(EndPromptType.class, str);
    }

    public static EndPromptType[] values() {
        return (EndPromptType[]) $VALUES.clone();
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
