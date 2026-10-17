package com.revolut.feature.defi.common.models.domain;

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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/defi/common/models/domain/DeFiAssetRiskLevel;", "Landroid/os/Parcelable;", "", "NONE", "INFO", "WARNING", "MALICIOUS", "UNKNOWN", "feature_defi_common_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DeFiAssetRiskLevel implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DeFiAssetRiskLevel[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<DeFiAssetRiskLevel> CREATOR;
    public static final DeFiAssetRiskLevel INFO;
    public static final DeFiAssetRiskLevel MALICIOUS;
    public static final DeFiAssetRiskLevel NONE;
    public static final DeFiAssetRiskLevel UNKNOWN;
    public static final DeFiAssetRiskLevel WARNING;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return DeFiAssetRiskLevel.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeFiAssetRiskLevel[i];
        }
    }

    static {
        DeFiAssetRiskLevel deFiAssetRiskLevel = new DeFiAssetRiskLevel("NONE", 0);
        NONE = deFiAssetRiskLevel;
        DeFiAssetRiskLevel deFiAssetRiskLevel2 = new DeFiAssetRiskLevel("INFO", 1);
        INFO = deFiAssetRiskLevel2;
        DeFiAssetRiskLevel deFiAssetRiskLevel3 = new DeFiAssetRiskLevel("WARNING", 2);
        WARNING = deFiAssetRiskLevel3;
        DeFiAssetRiskLevel deFiAssetRiskLevel4 = new DeFiAssetRiskLevel("MALICIOUS", 3);
        MALICIOUS = deFiAssetRiskLevel4;
        DeFiAssetRiskLevel deFiAssetRiskLevel5 = new DeFiAssetRiskLevel("UNKNOWN", 4);
        UNKNOWN = deFiAssetRiskLevel5;
        DeFiAssetRiskLevel[] deFiAssetRiskLevelArr = {deFiAssetRiskLevel, deFiAssetRiskLevel2, deFiAssetRiskLevel3, deFiAssetRiskLevel4, deFiAssetRiskLevel5};
        $VALUES = deFiAssetRiskLevelArr;
        $ENTRIES = s.n(deFiAssetRiskLevelArr);
        CREATOR = new a();
    }

    public static DeFiAssetRiskLevel valueOf(String str) {
        return (DeFiAssetRiskLevel) Enum.valueOf(DeFiAssetRiskLevel.class, str);
    }

    public static DeFiAssetRiskLevel[] values() {
        return (DeFiAssetRiskLevel[]) $VALUES.clone();
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
