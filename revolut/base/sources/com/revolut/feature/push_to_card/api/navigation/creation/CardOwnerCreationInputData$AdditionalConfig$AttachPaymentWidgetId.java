package com.revolut.feature.push_to_card.api.navigation.creation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/push_to_card/api/navigation/creation/CardOwnerCreationInputData$AdditionalConfig$AttachPaymentWidgetId", "", "", "toString", "()Ljava/lang/String;", "feature_push_to_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardOwnerCreationInputData$AdditionalConfig$AttachPaymentWidgetId implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CardOwnerCreationInputData$AdditionalConfig$AttachPaymentWidgetId> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f81548a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardOwnerCreationInputData$AdditionalConfig$AttachPaymentWidgetId(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardOwnerCreationInputData$AdditionalConfig$AttachPaymentWidgetId[i];
        }
    }

    public CardOwnerCreationInputData$AdditionalConfig$AttachPaymentWidgetId(String paymentWidgetId) {
        Intrinsics.checkNotNullParameter(paymentWidgetId, "paymentWidgetId");
        this.f81548a = paymentWidgetId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof CardOwnerCreationInputData$AdditionalConfig$AttachPaymentWidgetId) && Intrinsics.f(this.f81548a, ((CardOwnerCreationInputData$AdditionalConfig$AttachPaymentWidgetId) obj2).f81548a);
    }

    public final int hashCode() {
        return this.f81548a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f81548a);
    }
}
