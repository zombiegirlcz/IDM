package com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_selection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/retail/cobranded_cards/impl/presentation/screens/card_selection/CobrandedCardsSelectionScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CobrandedCardsSelectionScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CobrandedCardsSelectionScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f82565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82566b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CobrandedCardsSelectionScreenContract$InputData(parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CobrandedCardsSelectionScreenContract$InputData[i];
        }
    }

    public CobrandedCardsSelectionScreenContract$InputData(boolean z, String str) {
        this.f82565a = z;
        this.f82566b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CobrandedCardsSelectionScreenContract$InputData)) {
            return false;
        }
        CobrandedCardsSelectionScreenContract$InputData cobrandedCardsSelectionScreenContract$InputData = (CobrandedCardsSelectionScreenContract$InputData) obj2;
        return this.f82565a == cobrandedCardsSelectionScreenContract$InputData.f82565a && Intrinsics.f(this.f82566b, cobrandedCardsSelectionScreenContract$InputData.f82566b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f82565a) * 31;
        String str = this.f82566b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f82565a ? 1 : 0);
        dest.writeString(this.f82566b);
    }
}
