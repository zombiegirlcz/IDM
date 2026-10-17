package com.revolut.feature.support.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/support/api/navigation/CardDeliveryTroubleshootingFeatureFlow;", "Landroid/os/Parcelable;", "", "CARD_TROUBLESHOOTING", "JUNIOR_CARD_TROUBLESHOOTING", "feature_support_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardDeliveryTroubleshootingFeatureFlow implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CardDeliveryTroubleshootingFeatureFlow[] $VALUES;
    public static final CardDeliveryTroubleshootingFeatureFlow CARD_TROUBLESHOOTING;

    @NotNull
    public static final Parcelable.Creator<CardDeliveryTroubleshootingFeatureFlow> CREATOR;
    public static final CardDeliveryTroubleshootingFeatureFlow JUNIOR_CARD_TROUBLESHOOTING;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return CardDeliveryTroubleshootingFeatureFlow.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardDeliveryTroubleshootingFeatureFlow[i];
        }
    }

    static {
        CardDeliveryTroubleshootingFeatureFlow cardDeliveryTroubleshootingFeatureFlow = new CardDeliveryTroubleshootingFeatureFlow("CARD_TROUBLESHOOTING", 0);
        CARD_TROUBLESHOOTING = cardDeliveryTroubleshootingFeatureFlow;
        CardDeliveryTroubleshootingFeatureFlow cardDeliveryTroubleshootingFeatureFlow2 = new CardDeliveryTroubleshootingFeatureFlow("JUNIOR_CARD_TROUBLESHOOTING", 1);
        JUNIOR_CARD_TROUBLESHOOTING = cardDeliveryTroubleshootingFeatureFlow2;
        CardDeliveryTroubleshootingFeatureFlow[] cardDeliveryTroubleshootingFeatureFlowArr = {cardDeliveryTroubleshootingFeatureFlow, cardDeliveryTroubleshootingFeatureFlow2};
        $VALUES = cardDeliveryTroubleshootingFeatureFlowArr;
        $ENTRIES = s.n(cardDeliveryTroubleshootingFeatureFlowArr);
        CREATOR = new a();
    }

    public static CardDeliveryTroubleshootingFeatureFlow valueOf(String str) {
        return (CardDeliveryTroubleshootingFeatureFlow) Enum.valueOf(CardDeliveryTroubleshootingFeatureFlow.class, str);
    }

    public static CardDeliveryTroubleshootingFeatureFlow[] values() {
        return (CardDeliveryTroubleshootingFeatureFlow[]) $VALUES.clone();
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
