package com.revolut.shared.feature.wealth.models.portfolio;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/portfolio/TradingOnboardingStatus;", "Ljava/io/Serializable;", "Landroid/os/Parcelable;", "", "PENDING", "COMPLETED", "FAILED", "NONE", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TradingOnboardingStatus implements Serializable, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TradingOnboardingStatus[] $VALUES;
    public static final TradingOnboardingStatus COMPLETED;

    @NotNull
    public static final Parcelable.Creator<TradingOnboardingStatus> CREATOR;
    public static final TradingOnboardingStatus FAILED;
    public static final TradingOnboardingStatus NONE;
    public static final TradingOnboardingStatus PENDING;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return TradingOnboardingStatus.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TradingOnboardingStatus[i];
        }
    }

    static {
        TradingOnboardingStatus tradingOnboardingStatus = new TradingOnboardingStatus("PENDING", 0);
        PENDING = tradingOnboardingStatus;
        TradingOnboardingStatus tradingOnboardingStatus2 = new TradingOnboardingStatus("COMPLETED", 1);
        COMPLETED = tradingOnboardingStatus2;
        TradingOnboardingStatus tradingOnboardingStatus3 = new TradingOnboardingStatus("FAILED", 2);
        FAILED = tradingOnboardingStatus3;
        TradingOnboardingStatus tradingOnboardingStatus4 = new TradingOnboardingStatus("NONE", 3);
        NONE = tradingOnboardingStatus4;
        TradingOnboardingStatus[] tradingOnboardingStatusArr = {tradingOnboardingStatus, tradingOnboardingStatus2, tradingOnboardingStatus3, tradingOnboardingStatus4};
        $VALUES = tradingOnboardingStatusArr;
        $ENTRIES = s.n(tradingOnboardingStatusArr);
        CREATOR = new a();
    }

    public static TradingOnboardingStatus valueOf(String str) {
        return (TradingOnboardingStatus) Enum.valueOf(TradingOnboardingStatus.class, str);
    }

    public static TradingOnboardingStatus[] values() {
        return (TradingOnboardingStatus[]) $VALUES.clone();
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
