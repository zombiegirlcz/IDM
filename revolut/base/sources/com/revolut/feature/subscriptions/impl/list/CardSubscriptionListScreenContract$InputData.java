package com.revolut.feature.subscriptions.impl.list;

import android.os.Parcel;
import android.os.Parcelable;
import b9e.d;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/subscriptions/impl/list/CardSubscriptionListScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardSubscriptionListScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CardSubscriptionListScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f89208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f89209b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardSubscriptionListScreenContract$InputData(parcel.readString(), d.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardSubscriptionListScreenContract$InputData[i];
        }
    }

    public CardSubscriptionListScreenContract$InputData(String cardId, d action) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f89208a = cardId;
        this.f89209b = action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardSubscriptionListScreenContract$InputData)) {
            return false;
        }
        CardSubscriptionListScreenContract$InputData cardSubscriptionListScreenContract$InputData = (CardSubscriptionListScreenContract$InputData) obj2;
        return Intrinsics.f(this.f89208a, cardSubscriptionListScreenContract$InputData.f89208a) && this.f89209b == cardSubscriptionListScreenContract$InputData.f89209b;
    }

    public final int hashCode() {
        return this.f89209b.hashCode() + (this.f89208a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f89208a);
        dest.writeString(this.f89209b.name());
    }
}
