package com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_type;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlan;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.CobrandedCardsCardOrderContext;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/retail/cobranded_cards/impl/presentation/screens/card_type/CobrandedCardsTypeSelectionScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CobrandedCardsTypeSelectionScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CobrandedCardsTypeSelectionScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CobrandedCardsCardOrderContext f82567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CobrandedCardsPlan f82568b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CobrandedCardsTypeSelectionScreenContract$InputData(CobrandedCardsCardOrderContext.CREATOR.createFromParcel(parcel), (CobrandedCardsPlan) parcel.readParcelable(CobrandedCardsTypeSelectionScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CobrandedCardsTypeSelectionScreenContract$InputData[i];
        }
    }

    public CobrandedCardsTypeSelectionScreenContract$InputData(CobrandedCardsCardOrderContext context, CobrandedCardsPlan cobrandedCardsPlan) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f82567a = context;
        this.f82568b = cobrandedCardsPlan;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CobrandedCardsTypeSelectionScreenContract$InputData)) {
            return false;
        }
        CobrandedCardsTypeSelectionScreenContract$InputData cobrandedCardsTypeSelectionScreenContract$InputData = (CobrandedCardsTypeSelectionScreenContract$InputData) obj2;
        return Intrinsics.f(this.f82567a, cobrandedCardsTypeSelectionScreenContract$InputData.f82567a) && Intrinsics.f(this.f82568b, cobrandedCardsTypeSelectionScreenContract$InputData.f82568b);
    }

    public final int hashCode() {
        int iHashCode = this.f82567a.hashCode() * 31;
        CobrandedCardsPlan cobrandedCardsPlan = this.f82568b;
        return iHashCode + (cobrandedCardsPlan == null ? 0 : cobrandedCardsPlan.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f82567a.writeToParcel(dest, i);
        dest.writeParcelable(this.f82568b, i);
    }
}
