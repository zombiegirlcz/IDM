package com.revolut.feature.global_markets.domain;

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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/global_markets/domain/Market;", "Landroid/os/Parcelable;", "", "US", "Europe", "APAC", "feature_global_markets_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Market implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Market[] $VALUES;
    public static final Market APAC;

    @NotNull
    public static final Parcelable.Creator<Market> CREATOR;
    public static final Market Europe;
    public static final Market US;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return Market.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Market[i];
        }
    }

    static {
        Market market = new Market("US", 0);
        US = market;
        Market market2 = new Market("Europe", 1);
        Europe = market2;
        Market market3 = new Market("APAC", 2);
        APAC = market3;
        Market[] marketArr = {market, market2, market3};
        $VALUES = marketArr;
        $ENTRIES = s.n(marketArr);
        CREATOR = new a();
    }

    public static Market valueOf(String str) {
        return (Market) Enum.valueOf(Market.class, str);
    }

    public static Market[] values() {
        return (Market[]) $VALUES.clone();
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
