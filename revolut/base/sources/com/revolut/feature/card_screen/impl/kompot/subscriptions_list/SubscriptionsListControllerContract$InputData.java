package com.revolut.feature.card_screen.impl.kompot.subscriptions_list;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.card_screen.common.cards.models.CardsStateSnapshot$SubscriptionsContent;
import com.revolut.kompot.common.IOData$Input;
import h93.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/card_screen/impl/kompot/subscriptions_list/SubscriptionsListControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_card_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SubscriptionsListControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SubscriptionsListControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f65498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CardsStateSnapshot$SubscriptionsContent f65499b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SubscriptionsListControllerContract$InputData((f0) parcel.readSerializable(), (CardsStateSnapshot$SubscriptionsContent) parcel.readParcelable(SubscriptionsListControllerContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SubscriptionsListControllerContract$InputData[i];
        }
    }

    public SubscriptionsListControllerContract$InputData(f0 card, CardsStateSnapshot$SubscriptionsContent subscriptions) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
        this.f65498a = card;
        this.f65499b = subscriptions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SubscriptionsListControllerContract$InputData)) {
            return false;
        }
        SubscriptionsListControllerContract$InputData subscriptionsListControllerContract$InputData = (SubscriptionsListControllerContract$InputData) obj2;
        return Intrinsics.f(this.f65498a, subscriptionsListControllerContract$InputData.f65498a) && Intrinsics.f(this.f65499b, subscriptionsListControllerContract$InputData.f65499b);
    }

    public final int hashCode() {
        return this.f65499b.hashCode() + (this.f65498a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f65498a);
        dest.writeParcelable(this.f65499b, i);
    }
}
