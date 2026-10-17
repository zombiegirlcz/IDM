package com.revolut.feature.instruments.trend.collections.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/instruments/trend/collections/api/model/InstrumentsCollectionAssetsTypeFilterValue;", "Lcom/revolut/feature/instruments/trend/collections/api/model/InstrumentsTrendCollectionFilterValue;", "", "ALL", "CFDS", "STOCKS", "BONDS", "ETFS", "feature_instruments_trend_collections_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InstrumentsCollectionAssetsTypeFilterValue implements InstrumentsTrendCollectionFilterValue {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InstrumentsCollectionAssetsTypeFilterValue[] $VALUES;
    public static final InstrumentsCollectionAssetsTypeFilterValue ALL;
    public static final InstrumentsCollectionAssetsTypeFilterValue BONDS;
    public static final InstrumentsCollectionAssetsTypeFilterValue CFDS;

    @NotNull
    public static final Parcelable.Creator<InstrumentsCollectionAssetsTypeFilterValue> CREATOR;
    public static final InstrumentsCollectionAssetsTypeFilterValue ETFS;
    public static final InstrumentsCollectionAssetsTypeFilterValue STOCKS;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return InstrumentsCollectionAssetsTypeFilterValue.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InstrumentsCollectionAssetsTypeFilterValue[i];
        }
    }

    static {
        InstrumentsCollectionAssetsTypeFilterValue instrumentsCollectionAssetsTypeFilterValue = new InstrumentsCollectionAssetsTypeFilterValue("ALL", 0);
        ALL = instrumentsCollectionAssetsTypeFilterValue;
        InstrumentsCollectionAssetsTypeFilterValue instrumentsCollectionAssetsTypeFilterValue2 = new InstrumentsCollectionAssetsTypeFilterValue("CFDS", 1);
        CFDS = instrumentsCollectionAssetsTypeFilterValue2;
        InstrumentsCollectionAssetsTypeFilterValue instrumentsCollectionAssetsTypeFilterValue3 = new InstrumentsCollectionAssetsTypeFilterValue("STOCKS", 2);
        STOCKS = instrumentsCollectionAssetsTypeFilterValue3;
        InstrumentsCollectionAssetsTypeFilterValue instrumentsCollectionAssetsTypeFilterValue4 = new InstrumentsCollectionAssetsTypeFilterValue("BONDS", 3);
        BONDS = instrumentsCollectionAssetsTypeFilterValue4;
        InstrumentsCollectionAssetsTypeFilterValue instrumentsCollectionAssetsTypeFilterValue5 = new InstrumentsCollectionAssetsTypeFilterValue("ETFS", 4);
        ETFS = instrumentsCollectionAssetsTypeFilterValue5;
        InstrumentsCollectionAssetsTypeFilterValue[] instrumentsCollectionAssetsTypeFilterValueArr = {instrumentsCollectionAssetsTypeFilterValue, instrumentsCollectionAssetsTypeFilterValue2, instrumentsCollectionAssetsTypeFilterValue3, instrumentsCollectionAssetsTypeFilterValue4, instrumentsCollectionAssetsTypeFilterValue5};
        $VALUES = instrumentsCollectionAssetsTypeFilterValueArr;
        $ENTRIES = s.n(instrumentsCollectionAssetsTypeFilterValueArr);
        CREATOR = new a();
    }

    public static InstrumentsCollectionAssetsTypeFilterValue valueOf(String str) {
        return (InstrumentsCollectionAssetsTypeFilterValue) Enum.valueOf(InstrumentsCollectionAssetsTypeFilterValue.class, str);
    }

    public static InstrumentsCollectionAssetsTypeFilterValue[] values() {
        return (InstrumentsCollectionAssetsTypeFilterValue[]) $VALUES.clone();
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
