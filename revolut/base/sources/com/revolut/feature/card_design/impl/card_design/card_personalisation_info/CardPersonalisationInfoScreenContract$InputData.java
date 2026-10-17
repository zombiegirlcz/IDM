package com.revolut.feature.card_design.impl.card_design.card_personalisation_info;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import e93.f;
import hha.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/card_design/impl/card_design/card_personalisation_info/CardPersonalisationInfoScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "retail_feature_card_design_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardPersonalisationInfoScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CardPersonalisationInfoScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f64677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f64678b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardPersonalisationInfoScreenContract$InputData((f) parcel.readSerializable(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardPersonalisationInfoScreenContract$InputData[i];
        }
    }

    public CardPersonalisationInfoScreenContract$InputData(f cardDesign, d dVar) {
        Intrinsics.checkNotNullParameter(cardDesign, "cardDesign");
        this.f64677a = cardDesign;
        this.f64678b = dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardPersonalisationInfoScreenContract$InputData)) {
            return false;
        }
        CardPersonalisationInfoScreenContract$InputData cardPersonalisationInfoScreenContract$InputData = (CardPersonalisationInfoScreenContract$InputData) obj2;
        return Intrinsics.f(this.f64677a, cardPersonalisationInfoScreenContract$InputData.f64677a) && Intrinsics.f(this.f64678b, cardPersonalisationInfoScreenContract$InputData.f64678b);
    }

    public final int hashCode() {
        int iHashCode = this.f64677a.hashCode() * 31;
        d dVar = this.f64678b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f64677a);
        dest.writeSerializable(this.f64678b);
    }
}
