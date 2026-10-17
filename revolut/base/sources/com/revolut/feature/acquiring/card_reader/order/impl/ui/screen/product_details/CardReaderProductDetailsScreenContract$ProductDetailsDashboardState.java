package com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.product_details;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/revolut/feature/acquiring/card_reader/order/impl/ui/screen/product_details/CardReaderProductDetailsScreenContract$ProductDetailsDashboardState", "Landroid/os/Parcelable;", "<init>", "()V", "feature_acquiring_card_reader_order_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardReaderProductDetailsScreenContract$ProductDetailsDashboardState implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CardReaderProductDetailsScreenContract$ProductDetailsDashboardState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f60608a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(CardReaderProductDetailsScreenContract$ProductDetailsWidgetType.CREATOR.createFromParcel(parcel), Boolean.valueOf(parcel.readInt() != 0));
            }
            return new CardReaderProductDetailsScreenContract$ProductDetailsDashboardState(linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardReaderProductDetailsScreenContract$ProductDetailsDashboardState[i];
        }
    }

    public CardReaderProductDetailsScreenContract$ProductDetailsDashboardState(Map states) {
        Intrinsics.checkNotNullParameter(states, "states");
        this.f60608a = states;
    }

    public final boolean a(CardReaderProductDetailsScreenContract$ProductDetailsWidgetType widgetType) {
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        return ((Boolean) r0.h(widgetType, this.f60608a)).booleanValue();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itZ = j6.a.z(this.f60608a, dest);
        while (itZ.hasNext()) {
            Map.Entry entry = (Map.Entry) itZ.next();
            ((CardReaderProductDetailsScreenContract$ProductDetailsWidgetType) entry.getKey()).writeToParcel(dest, i);
            dest.writeInt(((Boolean) entry.getValue()).booleanValue() ? 1 : 0);
        }
    }

    public CardReaderProductDetailsScreenContract$ProductDetailsDashboardState() {
        CardReaderProductDetailsScreenContract$ProductDetailsWidgetType[] cardReaderProductDetailsScreenContract$ProductDetailsWidgetTypeArrValues = CardReaderProductDetailsScreenContract$ProductDetailsWidgetType.values();
        int iB = q0.b(cardReaderProductDetailsScreenContract$ProductDetailsWidgetTypeArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (CardReaderProductDetailsScreenContract$ProductDetailsWidgetType cardReaderProductDetailsScreenContract$ProductDetailsWidgetType : cardReaderProductDetailsScreenContract$ProductDetailsWidgetTypeArrValues) {
            linkedHashMap.put(cardReaderProductDetailsScreenContract$ProductDetailsWidgetType, Boolean.FALSE);
        }
        this(r0.z(linkedHashMap));
    }
}
