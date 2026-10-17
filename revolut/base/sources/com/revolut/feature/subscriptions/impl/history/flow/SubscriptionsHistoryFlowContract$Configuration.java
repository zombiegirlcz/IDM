package com.revolut.feature.subscriptions.impl.history.flow;

import android.os.Parcel;
import android.os.Parcelable;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/subscriptions/impl/history/flow/SubscriptionsHistoryFlowContract$Configuration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SubscriptionsHistoryFlowContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SubscriptionsHistoryFlowContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f89199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f89200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f89201c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SubscriptionsHistoryFlowContract$Configuration(parcel.readString(), parcel.readString(), (b) parcel.readSerializable(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SubscriptionsHistoryFlowContract$Configuration[i];
        }
    }

    public SubscriptionsHistoryFlowContract$Configuration(String subscriptionId, String subscriptionTitle, b subscriptionCurrency, boolean z) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(subscriptionTitle, "subscriptionTitle");
        Intrinsics.checkNotNullParameter(subscriptionCurrency, "subscriptionCurrency");
        this.f89199a = subscriptionId;
        this.f89200b = subscriptionTitle;
        this.f89201c = subscriptionCurrency;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SubscriptionsHistoryFlowContract$Configuration)) {
            return false;
        }
        SubscriptionsHistoryFlowContract$Configuration subscriptionsHistoryFlowContract$Configuration = (SubscriptionsHistoryFlowContract$Configuration) obj2;
        return Intrinsics.f(this.f89199a, subscriptionsHistoryFlowContract$Configuration.f89199a) && Intrinsics.f(this.f89200b, subscriptionsHistoryFlowContract$Configuration.f89200b) && Intrinsics.f(this.f89201c, subscriptionsHistoryFlowContract$Configuration.f89201c) && this.d == subscriptionsHistoryFlowContract$Configuration.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + l.j(this.f89201c, p.a.c(this.f89199a.hashCode() * 31, 31, this.f89200b), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f89199a);
        dest.writeString(this.f89200b);
        dest.writeSerializable(this.f89201c);
        dest.writeInt(this.d ? 1 : 0);
    }
}
