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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/instruments/trend/collections/api/model/InstrumentsTrendCollectionTimeframeFilterValue;", "Lcom/revolut/feature/instruments/trend/collections/api/model/InstrumentsTrendCollectionFilterValue;", "", "ONE_DAY", "ONE_WEEK", "ONE_MONTH", "ONE_YEAR", "FIVE_YEAR", "feature_instruments_trend_collections_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InstrumentsTrendCollectionTimeframeFilterValue implements InstrumentsTrendCollectionFilterValue {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InstrumentsTrendCollectionTimeframeFilterValue[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<InstrumentsTrendCollectionTimeframeFilterValue> CREATOR;
    public static final InstrumentsTrendCollectionTimeframeFilterValue FIVE_YEAR;
    public static final InstrumentsTrendCollectionTimeframeFilterValue ONE_DAY;
    public static final InstrumentsTrendCollectionTimeframeFilterValue ONE_MONTH;
    public static final InstrumentsTrendCollectionTimeframeFilterValue ONE_WEEK;
    public static final InstrumentsTrendCollectionTimeframeFilterValue ONE_YEAR;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return InstrumentsTrendCollectionTimeframeFilterValue.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InstrumentsTrendCollectionTimeframeFilterValue[i];
        }
    }

    static {
        InstrumentsTrendCollectionTimeframeFilterValue instrumentsTrendCollectionTimeframeFilterValue = new InstrumentsTrendCollectionTimeframeFilterValue("ONE_DAY", 0);
        ONE_DAY = instrumentsTrendCollectionTimeframeFilterValue;
        InstrumentsTrendCollectionTimeframeFilterValue instrumentsTrendCollectionTimeframeFilterValue2 = new InstrumentsTrendCollectionTimeframeFilterValue("ONE_WEEK", 1);
        ONE_WEEK = instrumentsTrendCollectionTimeframeFilterValue2;
        InstrumentsTrendCollectionTimeframeFilterValue instrumentsTrendCollectionTimeframeFilterValue3 = new InstrumentsTrendCollectionTimeframeFilterValue("ONE_MONTH", 2);
        ONE_MONTH = instrumentsTrendCollectionTimeframeFilterValue3;
        InstrumentsTrendCollectionTimeframeFilterValue instrumentsTrendCollectionTimeframeFilterValue4 = new InstrumentsTrendCollectionTimeframeFilterValue("ONE_YEAR", 3);
        ONE_YEAR = instrumentsTrendCollectionTimeframeFilterValue4;
        InstrumentsTrendCollectionTimeframeFilterValue instrumentsTrendCollectionTimeframeFilterValue5 = new InstrumentsTrendCollectionTimeframeFilterValue("FIVE_YEAR", 4);
        FIVE_YEAR = instrumentsTrendCollectionTimeframeFilterValue5;
        InstrumentsTrendCollectionTimeframeFilterValue[] instrumentsTrendCollectionTimeframeFilterValueArr = {instrumentsTrendCollectionTimeframeFilterValue, instrumentsTrendCollectionTimeframeFilterValue2, instrumentsTrendCollectionTimeframeFilterValue3, instrumentsTrendCollectionTimeframeFilterValue4, instrumentsTrendCollectionTimeframeFilterValue5};
        $VALUES = instrumentsTrendCollectionTimeframeFilterValueArr;
        $ENTRIES = s.n(instrumentsTrendCollectionTimeframeFilterValueArr);
        CREATOR = new a();
    }

    public static InstrumentsTrendCollectionTimeframeFilterValue valueOf(String str) {
        return (InstrumentsTrendCollectionTimeframeFilterValue) Enum.valueOf(InstrumentsTrendCollectionTimeframeFilterValue.class, str);
    }

    public static InstrumentsTrendCollectionTimeframeFilterValue[] values() {
        return (InstrumentsTrendCollectionTimeframeFilterValue[]) $VALUES.clone();
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
