package com.revolut.feature.subscriptions.impl.label;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qua.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/subscriptions/impl/label/SubscriptionLabelScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SubscriptionLabelScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SubscriptionLabelScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f89206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f89207b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SubscriptionLabelScreenContract$InputData((p) parcel.readSerializable(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SubscriptionLabelScreenContract$InputData[i];
        }
    }

    public SubscriptionLabelScreenContract$InputData(p subscription, int i) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        this.f89206a = subscription;
        this.f89207b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SubscriptionLabelScreenContract$InputData)) {
            return false;
        }
        SubscriptionLabelScreenContract$InputData subscriptionLabelScreenContract$InputData = (SubscriptionLabelScreenContract$InputData) obj2;
        return Intrinsics.f(this.f89206a, subscriptionLabelScreenContract$InputData.f89206a) && this.f89207b == subscriptionLabelScreenContract$InputData.f89207b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f89207b) + (this.f89206a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f89206a);
        dest.writeInt(this.f89207b);
    }
}
