package com.revolut.feature.spending_analytics.impl.ui.rev10.rev_iq.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0081\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/rev_iq/models/ScoreCardType;", "Lcom/revolut/kompot/navigable/vc/pager/PagerItem;", "", "SPEND", "SAVE", "GROW", "CREDIT", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ScoreCardType implements PagerItem {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ScoreCardType[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<ScoreCardType> CREATOR;
    public static final ScoreCardType CREDIT;
    public static final ScoreCardType GROW;
    public static final ScoreCardType SAVE;
    public static final ScoreCardType SPEND;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return ScoreCardType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ScoreCardType[i];
        }
    }

    static {
        ScoreCardType scoreCardType = new ScoreCardType("SPEND", 0);
        SPEND = scoreCardType;
        ScoreCardType scoreCardType2 = new ScoreCardType("SAVE", 1);
        SAVE = scoreCardType2;
        ScoreCardType scoreCardType3 = new ScoreCardType("GROW", 2);
        GROW = scoreCardType3;
        ScoreCardType scoreCardType4 = new ScoreCardType("CREDIT", 3);
        CREDIT = scoreCardType4;
        ScoreCardType[] scoreCardTypeArr = {scoreCardType, scoreCardType2, scoreCardType3, scoreCardType4};
        $VALUES = scoreCardTypeArr;
        $ENTRIES = s.n(scoreCardTypeArr);
        CREATOR = new a();
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static ScoreCardType valueOf(String str) {
        return (ScoreCardType) Enum.valueOf(ScoreCardType.class, str);
    }

    public static ScoreCardType[] values() {
        return (ScoreCardType[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.revolut.kompot.navigable.vc.pager.PagerItem
    public final String getId() {
        return name();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }
}
