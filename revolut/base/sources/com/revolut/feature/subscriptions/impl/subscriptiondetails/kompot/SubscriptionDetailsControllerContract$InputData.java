package com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/subscriptions/impl/subscriptiondetails/kompot/SubscriptionDetailsControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SubscriptionDetailsControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SubscriptionDetailsControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f89247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f9e.b f89248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f89249c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SubscriptionDetailsControllerContract$InputData(f9e.b.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SubscriptionDetailsControllerContract$InputData[i];
        }
    }

    public SubscriptionDetailsControllerContract$InputData(f9e.b mode, String subscriptionId, boolean z) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f89247a = subscriptionId;
        this.f89248b = mode;
        this.f89249c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SubscriptionDetailsControllerContract$InputData)) {
            return false;
        }
        SubscriptionDetailsControllerContract$InputData subscriptionDetailsControllerContract$InputData = (SubscriptionDetailsControllerContract$InputData) obj2;
        return Intrinsics.f(this.f89247a, subscriptionDetailsControllerContract$InputData.f89247a) && this.f89248b == subscriptionDetailsControllerContract$InputData.f89248b && this.f89249c == subscriptionDetailsControllerContract$InputData.f89249c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f89249c) + ((this.f89248b.hashCode() + (this.f89247a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f89247a);
        dest.writeString(this.f89248b.name());
        dest.writeInt(this.f89249c ? 1 : 0);
    }
}
