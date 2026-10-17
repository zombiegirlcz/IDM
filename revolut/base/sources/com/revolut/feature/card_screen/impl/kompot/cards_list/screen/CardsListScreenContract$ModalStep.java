package com.revolut.feature.card_screen.impl.kompot.cards_list.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.card_screen.impl.kompot.cards_list.screen.expiring_cards_bottom_sheet.ExpiringCardsBottomSheetContract$ExpiringCardItem;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/card_screen/impl/kompot/cards_list/screen/CardsListScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ShowExpiringCardsBottomSheet", "Lcom/revolut/feature/card_screen/impl/kompot/cards_list/screen/CardsListScreenContract$ModalStep$ShowExpiringCardsBottomSheet;", "feature_card_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CardsListScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_screen/impl/kompot/cards_list/screen/CardsListScreenContract$ModalStep$ShowExpiringCardsBottomSheet;", "Lcom/revolut/feature/card_screen/impl/kompot/cards_list/screen/CardsListScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_card_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowExpiringCardsBottomSheet implements CardsListScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ShowExpiringCardsBottomSheet> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f65471a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(ExpiringCardsBottomSheetContract$ExpiringCardItem.CREATOR, parcel, arrayList, iA, 1);
                }
                return new ShowExpiringCardsBottomSheet(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowExpiringCardsBottomSheet[i];
            }
        }

        public ShowExpiringCardsBottomSheet(ArrayList cardItems) {
            Intrinsics.checkNotNullParameter(cardItems, "cardItems");
            this.f65471a = cardItems;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ShowExpiringCardsBottomSheet) && this.f65471a.equals(((ShowExpiringCardsBottomSheet) obj2).f65471a);
        }

        public final int hashCode() {
            return this.f65471a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f65471a, dest);
            while (itY.hasNext()) {
                ((ExpiringCardsBottomSheetContract$ExpiringCardItem) itY.next()).writeToParcel(dest, i);
            }
        }
    }
}
