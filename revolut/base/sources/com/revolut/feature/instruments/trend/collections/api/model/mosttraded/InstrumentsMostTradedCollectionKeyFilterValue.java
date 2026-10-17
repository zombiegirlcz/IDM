package com.revolut.feature.instruments.trend.collections.api.model.mosttraded;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsTrendCollectionKeyFilterValue;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ph7.c;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/revolut/feature/instruments/trend/collections/api/model/mosttraded/InstrumentsMostTradedCollectionKeyFilterValue;", "Lcom/revolut/feature/instruments/trend/collections/api/model/InstrumentsTrendCollectionKeyFilterValue;", "", "Lph7/c;", "collectionKey", "Lph7/c;", "M0", "()Lph7/c;", "MOST_TRADED", "MOST_BOUGHT", "MOST_SOLD", "feature_instruments_trend_collections_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InstrumentsMostTradedCollectionKeyFilterValue implements InstrumentsTrendCollectionKeyFilterValue {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InstrumentsMostTradedCollectionKeyFilterValue[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<InstrumentsMostTradedCollectionKeyFilterValue> CREATOR;
    public static final InstrumentsMostTradedCollectionKeyFilterValue MOST_BOUGHT;
    public static final InstrumentsMostTradedCollectionKeyFilterValue MOST_SOLD;
    public static final InstrumentsMostTradedCollectionKeyFilterValue MOST_TRADED;

    @NotNull
    private final c collectionKey;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return InstrumentsMostTradedCollectionKeyFilterValue.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InstrumentsMostTradedCollectionKeyFilterValue[i];
        }
    }

    static {
        InstrumentsMostTradedCollectionKeyFilterValue instrumentsMostTradedCollectionKeyFilterValue = new InstrumentsMostTradedCollectionKeyFilterValue("MOST_TRADED", 0, c.MOST_TRADED);
        MOST_TRADED = instrumentsMostTradedCollectionKeyFilterValue;
        InstrumentsMostTradedCollectionKeyFilterValue instrumentsMostTradedCollectionKeyFilterValue2 = new InstrumentsMostTradedCollectionKeyFilterValue("MOST_BOUGHT", 1, c.MOST_BOUGHT);
        MOST_BOUGHT = instrumentsMostTradedCollectionKeyFilterValue2;
        InstrumentsMostTradedCollectionKeyFilterValue instrumentsMostTradedCollectionKeyFilterValue3 = new InstrumentsMostTradedCollectionKeyFilterValue("MOST_SOLD", 2, c.MOST_SOLD);
        MOST_SOLD = instrumentsMostTradedCollectionKeyFilterValue3;
        InstrumentsMostTradedCollectionKeyFilterValue[] instrumentsMostTradedCollectionKeyFilterValueArr = {instrumentsMostTradedCollectionKeyFilterValue, instrumentsMostTradedCollectionKeyFilterValue2, instrumentsMostTradedCollectionKeyFilterValue3};
        $VALUES = instrumentsMostTradedCollectionKeyFilterValueArr;
        $ENTRIES = s.n(instrumentsMostTradedCollectionKeyFilterValueArr);
        CREATOR = new a();
    }

    public InstrumentsMostTradedCollectionKeyFilterValue(String str, int i, c cVar) {
        this.collectionKey = cVar;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static InstrumentsMostTradedCollectionKeyFilterValue valueOf(String str) {
        return (InstrumentsMostTradedCollectionKeyFilterValue) Enum.valueOf(InstrumentsMostTradedCollectionKeyFilterValue.class, str);
    }

    public static InstrumentsMostTradedCollectionKeyFilterValue[] values() {
        return (InstrumentsMostTradedCollectionKeyFilterValue[]) $VALUES.clone();
    }

    @Override // com.revolut.feature.instruments.trend.collections.api.model.InstrumentsTrendCollectionKeyFilterValue
    /* JADX INFO: renamed from: M0, reason: from getter */
    public final c getCollectionKey() {
        return this.collectionKey;
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
