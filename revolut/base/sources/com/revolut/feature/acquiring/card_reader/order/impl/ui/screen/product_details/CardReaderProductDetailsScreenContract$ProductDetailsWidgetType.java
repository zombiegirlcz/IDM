package com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.product_details;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003R \u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"com/revolut/feature/acquiring/card_reader/order/impl/ui/screen/product_details/CardReaderProductDetailsScreenContract$ProductDetailsWidgetType", "Lyi0/a;", "Landroid/os/Parcelable;", "", "Lcom/revolut/feature/acquiring/card_reader/order/impl/ui/screen/product_details/CardReaderProductDetailsScreenContract$ProductDetailsWidgetType;", "", "type", "I", "getType", "()I", "getType$annotations", "()V", "IN_THE_BOX", "PAYMENT_TYPES", "SYSTEM_REQUIREMENTS", "DIMENSIONS", "SECURITY", "feature_acquiring_card_reader_order_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardReaderProductDetailsScreenContract$ProductDetailsWidgetType implements yi0.a, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CardReaderProductDetailsScreenContract$ProductDetailsWidgetType[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<CardReaderProductDetailsScreenContract$ProductDetailsWidgetType> CREATOR;
    public static final CardReaderProductDetailsScreenContract$ProductDetailsWidgetType DIMENSIONS;
    public static final CardReaderProductDetailsScreenContract$ProductDetailsWidgetType IN_THE_BOX;
    public static final CardReaderProductDetailsScreenContract$ProductDetailsWidgetType PAYMENT_TYPES;
    public static final CardReaderProductDetailsScreenContract$ProductDetailsWidgetType SECURITY;
    public static final CardReaderProductDetailsScreenContract$ProductDetailsWidgetType SYSTEM_REQUIREMENTS;
    private final int type = ordinal();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return CardReaderProductDetailsScreenContract$ProductDetailsWidgetType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardReaderProductDetailsScreenContract$ProductDetailsWidgetType[i];
        }
    }

    static {
        CardReaderProductDetailsScreenContract$ProductDetailsWidgetType cardReaderProductDetailsScreenContract$ProductDetailsWidgetType = new CardReaderProductDetailsScreenContract$ProductDetailsWidgetType("IN_THE_BOX", 0);
        IN_THE_BOX = cardReaderProductDetailsScreenContract$ProductDetailsWidgetType;
        CardReaderProductDetailsScreenContract$ProductDetailsWidgetType cardReaderProductDetailsScreenContract$ProductDetailsWidgetType2 = new CardReaderProductDetailsScreenContract$ProductDetailsWidgetType("PAYMENT_TYPES", 1);
        PAYMENT_TYPES = cardReaderProductDetailsScreenContract$ProductDetailsWidgetType2;
        CardReaderProductDetailsScreenContract$ProductDetailsWidgetType cardReaderProductDetailsScreenContract$ProductDetailsWidgetType3 = new CardReaderProductDetailsScreenContract$ProductDetailsWidgetType("SYSTEM_REQUIREMENTS", 2);
        SYSTEM_REQUIREMENTS = cardReaderProductDetailsScreenContract$ProductDetailsWidgetType3;
        CardReaderProductDetailsScreenContract$ProductDetailsWidgetType cardReaderProductDetailsScreenContract$ProductDetailsWidgetType4 = new CardReaderProductDetailsScreenContract$ProductDetailsWidgetType("DIMENSIONS", 3);
        DIMENSIONS = cardReaderProductDetailsScreenContract$ProductDetailsWidgetType4;
        CardReaderProductDetailsScreenContract$ProductDetailsWidgetType cardReaderProductDetailsScreenContract$ProductDetailsWidgetType5 = new CardReaderProductDetailsScreenContract$ProductDetailsWidgetType("SECURITY", 4);
        SECURITY = cardReaderProductDetailsScreenContract$ProductDetailsWidgetType5;
        CardReaderProductDetailsScreenContract$ProductDetailsWidgetType[] cardReaderProductDetailsScreenContract$ProductDetailsWidgetTypeArr = {cardReaderProductDetailsScreenContract$ProductDetailsWidgetType, cardReaderProductDetailsScreenContract$ProductDetailsWidgetType2, cardReaderProductDetailsScreenContract$ProductDetailsWidgetType3, cardReaderProductDetailsScreenContract$ProductDetailsWidgetType4, cardReaderProductDetailsScreenContract$ProductDetailsWidgetType5};
        $VALUES = cardReaderProductDetailsScreenContract$ProductDetailsWidgetTypeArr;
        $ENTRIES = s.n(cardReaderProductDetailsScreenContract$ProductDetailsWidgetTypeArr);
        CREATOR = new a();
    }

    public CardReaderProductDetailsScreenContract$ProductDetailsWidgetType(String str, int i) {
    }

    public static CardReaderProductDetailsScreenContract$ProductDetailsWidgetType valueOf(String str) {
        return (CardReaderProductDetailsScreenContract$ProductDetailsWidgetType) Enum.valueOf(CardReaderProductDetailsScreenContract$ProductDetailsWidgetType.class, str);
    }

    public static CardReaderProductDetailsScreenContract$ProductDetailsWidgetType[] values() {
        return (CardReaderProductDetailsScreenContract$ProductDetailsWidgetType[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int getType() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }
}
