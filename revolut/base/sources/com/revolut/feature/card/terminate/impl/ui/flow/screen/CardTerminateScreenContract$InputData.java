package com.revolut.feature.card.terminate.impl.ui.flow.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import su2.b;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/card/terminate/impl/ui/flow/screen/CardTerminateScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_card_terminate_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardTerminateScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CardTerminateScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f64389b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardTerminateScreenContract$InputData(parcel.readString(), b.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardTerminateScreenContract$InputData[i];
        }
    }

    public CardTerminateScreenContract$InputData(String cardId, b reason) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f64388a = cardId;
        this.f64389b = reason;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardTerminateScreenContract$InputData)) {
            return false;
        }
        CardTerminateScreenContract$InputData cardTerminateScreenContract$InputData = (CardTerminateScreenContract$InputData) obj2;
        return Intrinsics.f(this.f64388a, cardTerminateScreenContract$InputData.f64388a) && this.f64389b == cardTerminateScreenContract$InputData.f64389b;
    }

    public final int hashCode() {
        return this.f64389b.hashCode() + (this.f64388a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f64388a);
        dest.writeString(this.f64389b.name());
    }
}
