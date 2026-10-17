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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/defi/common/models/domain/DeFiAssetRiskType;", "Landroid/os/Parcelable;", "", "MALICIOUS", "SMART_CONTRACT_FLAWS", "MARKET", "ECONOMIC", "BEHAVIOUR", "UNKNOWN", "feature_defi_common_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DeFiAssetRiskType implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DeFiAssetRiskType[] $VALUES;
    public static final DeFiAssetRiskType BEHAVIOUR;

    @NotNull
    public static final Parcelable.Creator<DeFiAssetRiskType> CREATOR;
    public static final DeFiAssetRiskType ECONOMIC;
    public static final DeFiAssetRiskType MALICIOUS;
    public static final DeFiAssetRiskType MARKET;
    public static final DeFiAssetRiskType SMART_CONTRACT_FLAWS;
    public static final DeFiAssetRiskType UNKNOWN;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return DeFiAssetRiskType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeFiAssetRiskType[i];
        }
    }

    static {
        DeFiAssetRiskType deFiAssetRiskType = new DeFiAssetRiskType("MALICIOUS", 0);
        MALICIOUS = deFiAssetRiskType;
        DeFiAssetRiskType deFiAssetRiskType2 = new DeFiAssetRiskType("SMART_CONTRACT_FLAWS", 1);
        SMART_CONTRACT_FLAWS = deFiAssetRiskType2;
        DeFiAssetRiskType deFiAssetRiskType3 = new DeFiAssetRiskType("MARKET", 2);
        MARKET = deFiAssetRiskType3;
        DeFiAssetRiskType deFiAssetRiskType4 = new DeFiAssetRiskType("ECONOMIC", 3);
        ECONOMIC = deFiAssetRiskType4;
        DeFiAssetRiskType deFiAssetRiskType5 = new DeFiAssetRiskType("BEHAVIOUR", 4);
        BEHAVIOUR = deFiAssetRiskType5;
        DeFiAssetRiskType deFiAssetRiskType6 = new DeFiAssetRiskType("UNKNOWN", 5);
        UNKNOWN = deFiAssetRiskType6;
        DeFiAssetRiskType[] deFiAssetRiskTypeArr = {deFiAssetRiskType, deFiAssetRiskType2, deFiAssetRiskType3, deFiAssetRiskType4, deFiAssetRiskType5, deFiAssetRiskType6};
        $VALUES = deFiAssetRiskTypeArr;
        $ENTRIES = s.n(deFiAssetRiskTypeArr);
        CREATOR = new a();
    }

    public static DeFiAssetRiskType valueOf(String str) {
        return (DeFiAssetRiskType) Enum.valueOf(DeFiAssetRiskType.class, str);
    }

    public static DeFiAssetRiskType[] values() {
        return (DeFiAssetRiskType[]) $VALUES.clone();
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
