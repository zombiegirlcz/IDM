package com.revolut.feature.card_screen.impl.kompot.cards_list.screen;

import android.os.Parcel;
import android.os.Parcelable;
import b93.d;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/card_screen/impl/kompot/cards_list/screen/CardsListScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_card_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardsListScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CardsListScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f65470b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardsListScreenContract$InputData(parcel.readString(), d.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardsListScreenContract$InputData[i];
        }
    }

    public CardsListScreenContract$InputData(String str, d cardScope) {
        Intrinsics.checkNotNullParameter(cardScope, "cardScope");
        this.f65469a = str;
        this.f65470b = cardScope;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardsListScreenContract$InputData)) {
            return false;
        }
        CardsListScreenContract$InputData cardsListScreenContract$InputData = (CardsListScreenContract$InputData) obj2;
        return Intrinsics.f(this.f65469a, cardsListScreenContract$InputData.f65469a) && this.f65470b == cardsListScreenContract$InputData.f65470b;
    }

    public final int hashCode() {
        String str = this.f65469a;
        return this.f65470b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f65469a);
        dest.writeString(this.f65470b.name());
    }

    public CardsListScreenContract$InputData() {
        this(null, d.ALL);
    }
}
