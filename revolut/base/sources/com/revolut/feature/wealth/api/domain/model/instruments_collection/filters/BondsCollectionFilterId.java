package com.revolut.feature.wealth.api.domain.model.instruments_collection.filters;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/BondsCollectionFilterId;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/InstrumentsCollectionFilterId;", "", "ISSUER", "CREDIT_QUALITY", "YIELD_TO_MATURITY", "MATURITY_TYPE", "MATURITY", "COUPON_TYPE", "ISSUER_COUNTRY", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BondsCollectionFilterId implements InstrumentsCollectionFilterId {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BondsCollectionFilterId[] $VALUES;
    public static final BondsCollectionFilterId COUPON_TYPE;

    @NotNull
    public static final Parcelable.Creator<BondsCollectionFilterId> CREATOR;
    public static final BondsCollectionFilterId CREDIT_QUALITY;
    public static final BondsCollectionFilterId ISSUER;
    public static final BondsCollectionFilterId ISSUER_COUNTRY;
    public static final BondsCollectionFilterId MATURITY;
    public static final BondsCollectionFilterId MATURITY_TYPE;
    public static final BondsCollectionFilterId YIELD_TO_MATURITY;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return BondsCollectionFilterId.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BondsCollectionFilterId[i];
        }
    }

    static {
        BondsCollectionFilterId bondsCollectionFilterId = new BondsCollectionFilterId("ISSUER", 0);
        ISSUER = bondsCollectionFilterId;
        BondsCollectionFilterId bondsCollectionFilterId2 = new BondsCollectionFilterId("CREDIT_QUALITY", 1);
        CREDIT_QUALITY = bondsCollectionFilterId2;
        BondsCollectionFilterId bondsCollectionFilterId3 = new BondsCollectionFilterId("YIELD_TO_MATURITY", 2);
        YIELD_TO_MATURITY = bondsCollectionFilterId3;
        BondsCollectionFilterId bondsCollectionFilterId4 = new BondsCollectionFilterId("MATURITY_TYPE", 3);
        MATURITY_TYPE = bondsCollectionFilterId4;
        BondsCollectionFilterId bondsCollectionFilterId5 = new BondsCollectionFilterId("MATURITY", 4);
        MATURITY = bondsCollectionFilterId5;
        BondsCollectionFilterId bondsCollectionFilterId6 = new BondsCollectionFilterId("COUPON_TYPE", 5);
        COUPON_TYPE = bondsCollectionFilterId6;
        BondsCollectionFilterId bondsCollectionFilterId7 = new BondsCollectionFilterId("ISSUER_COUNTRY", 6);
        ISSUER_COUNTRY = bondsCollectionFilterId7;
        BondsCollectionFilterId[] bondsCollectionFilterIdArr = {bondsCollectionFilterId, bondsCollectionFilterId2, bondsCollectionFilterId3, bondsCollectionFilterId4, bondsCollectionFilterId5, bondsCollectionFilterId6, bondsCollectionFilterId7};
        $VALUES = bondsCollectionFilterIdArr;
        $ENTRIES = s.n(bondsCollectionFilterIdArr);
        CREATOR = new a();
    }

    public static BondsCollectionFilterId valueOf(String str) {
        return (BondsCollectionFilterId) Enum.valueOf(BondsCollectionFilterId.class, str);
    }

    public static BondsCollectionFilterId[] values() {
        return (BondsCollectionFilterId[]) $VALUES.clone();
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
