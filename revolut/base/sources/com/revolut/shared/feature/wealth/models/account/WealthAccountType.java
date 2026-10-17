package com.revolut.shared.feature.wealth.models.account;

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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/account/WealthAccountType;", "Landroid/os/Parcelable;", "", "", "rawValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "SECURITIES", "TAA", "ROBO", "MARGIN", "COMMODITIES", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WealthAccountType implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ WealthAccountType[] $VALUES;

    @b("COMMODITIES")
    public static final WealthAccountType COMMODITIES;

    @NotNull
    public static final Parcelable.Creator<WealthAccountType> CREATOR;

    @b("MARGIN")
    public static final WealthAccountType MARGIN;

    @b("ROBO")
    public static final WealthAccountType ROBO;

    @b("GIA")
    public static final WealthAccountType SECURITIES;

    @b("TAX_ADVANTAGED")
    public static final WealthAccountType TAA;

    @NotNull
    private final String rawValue;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return WealthAccountType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WealthAccountType[i];
        }
    }

    static {
        WealthAccountType wealthAccountType = new WealthAccountType("SECURITIES", 0, "GIA");
        SECURITIES = wealthAccountType;
        WealthAccountType wealthAccountType2 = new WealthAccountType("TAA", 1, "TAX_ADVANTAGED");
        TAA = wealthAccountType2;
        WealthAccountType wealthAccountType3 = new WealthAccountType("ROBO", 2, "ROBO");
        ROBO = wealthAccountType3;
        WealthAccountType wealthAccountType4 = new WealthAccountType("MARGIN", 3, "MARGIN");
        MARGIN = wealthAccountType4;
        WealthAccountType wealthAccountType5 = new WealthAccountType("COMMODITIES", 4, "COMMODITIES");
        COMMODITIES = wealthAccountType5;
        WealthAccountType[] wealthAccountTypeArr = {wealthAccountType, wealthAccountType2, wealthAccountType3, wealthAccountType4, wealthAccountType5};
        $VALUES = wealthAccountTypeArr;
        $ENTRIES = s.n(wealthAccountTypeArr);
        CREATOR = new a();
    }

    public WealthAccountType(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static WealthAccountType valueOf(String str) {
        return (WealthAccountType) Enum.valueOf(WealthAccountType.class, str);
    }

    public static WealthAccountType[] values() {
        return (WealthAccountType[]) $VALUES.clone();
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
