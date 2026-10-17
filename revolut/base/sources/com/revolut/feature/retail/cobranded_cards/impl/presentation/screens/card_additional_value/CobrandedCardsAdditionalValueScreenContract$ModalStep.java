package com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_additional_value;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanAdditionalValueBottomSheet;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanCardFeesBreakdown;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/retail/cobranded_cards/impl/presentation/screens/card_additional_value/CobrandedCardsAdditionalValueScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "SectionInfo", "CardFees", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/card_additional_value/CobrandedCardsAdditionalValueScreenContract$ModalStep$CardFees;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/card_additional_value/CobrandedCardsAdditionalValueScreenContract$ModalStep$SectionInfo;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CobrandedCardsAdditionalValueScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/card_additional_value/CobrandedCardsAdditionalValueScreenContract$ModalStep$CardFees;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/card_additional_value/CobrandedCardsAdditionalValueScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardFees implements CobrandedCardsAdditionalValueScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CardFees> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CobrandedCardsPlanCardFeesBreakdown f82553a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardFees((CobrandedCardsPlanCardFeesBreakdown) parcel.readParcelable(CardFees.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardFees[i];
            }
        }

        public CardFees(CobrandedCardsPlanCardFeesBreakdown breakdown) {
            Intrinsics.checkNotNullParameter(breakdown, "breakdown");
            this.f82553a = breakdown;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CardFees) && Intrinsics.f(this.f82553a, ((CardFees) obj2).f82553a);
        }

        public final int hashCode() {
            return this.f82553a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f82553a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/card_additional_value/CobrandedCardsAdditionalValueScreenContract$ModalStep$SectionInfo;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/card_additional_value/CobrandedCardsAdditionalValueScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SectionInfo implements CobrandedCardsAdditionalValueScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<SectionInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CobrandedCardsPlanAdditionalValueBottomSheet f82554a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SectionInfo((CobrandedCardsPlanAdditionalValueBottomSheet) parcel.readParcelable(SectionInfo.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SectionInfo[i];
            }
        }

        public SectionInfo(CobrandedCardsPlanAdditionalValueBottomSheet bottomSheet) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            this.f82554a = bottomSheet;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SectionInfo) && Intrinsics.f(this.f82554a, ((SectionInfo) obj2).f82554a);
        }

        public final int hashCode() {
            return this.f82554a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f82554a, i);
        }
    }
}
