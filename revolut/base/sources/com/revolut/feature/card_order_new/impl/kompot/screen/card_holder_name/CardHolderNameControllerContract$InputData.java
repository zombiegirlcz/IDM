package com.revolut.feature.card_order_new.impl.kompot.screen.card_holder_name;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/card_order_new/impl/kompot/screen/card_holder_name/CardHolderNameControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardHolderNameControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CardHolderNameControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f65157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f65158b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardHolderNameControllerContract$InputData(parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardHolderNameControllerContract$InputData[i];
        }
    }

    public CardHolderNameControllerContract$InputData(List suggestedNames, String currentName) {
        Intrinsics.checkNotNullParameter(suggestedNames, "suggestedNames");
        Intrinsics.checkNotNullParameter(currentName, "currentName");
        this.f65157a = suggestedNames;
        this.f65158b = currentName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardHolderNameControllerContract$InputData)) {
            return false;
        }
        CardHolderNameControllerContract$InputData cardHolderNameControllerContract$InputData = (CardHolderNameControllerContract$InputData) obj2;
        return Intrinsics.f(this.f65157a, cardHolderNameControllerContract$InputData.f65157a) && Intrinsics.f(this.f65158b, cardHolderNameControllerContract$InputData.f65158b);
    }

    public final int hashCode() {
        return this.f65158b.hashCode() + (this.f65157a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeStringList(this.f65157a);
        dest.writeString(this.f65158b);
    }
}
