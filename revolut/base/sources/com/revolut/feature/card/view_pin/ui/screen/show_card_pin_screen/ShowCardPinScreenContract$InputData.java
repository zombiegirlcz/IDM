package com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/card/view_pin/ui/screen/show_card_pin_screen/ShowCardPinScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_card_view_pin_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ShowCardPinScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ShowCardPinScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f64415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f64416c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ShowCardPinScreenContract$InputData(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ShowCardPinScreenContract$InputData[i];
        }
    }

    public ShowCardPinScreenContract$InputData(String cardId, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f64414a = cardId;
        this.f64415b = z;
        this.f64416c = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ShowCardPinScreenContract$InputData)) {
            return false;
        }
        ShowCardPinScreenContract$InputData showCardPinScreenContract$InputData = (ShowCardPinScreenContract$InputData) obj2;
        return Intrinsics.f(this.f64414a, showCardPinScreenContract$InputData.f64414a) && this.f64415b == showCardPinScreenContract$InputData.f64415b && this.f64416c == showCardPinScreenContract$InputData.f64416c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f64416c) + j6.a.c(this.f64414a.hashCode() * 31, 31, this.f64415b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f64414a);
        dest.writeInt(this.f64415b ? 1 : 0);
        dest.writeInt(this.f64416c ? 1 : 0);
    }
}
