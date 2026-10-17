package com.revolut.feature.subscriptions.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/api/navigation/SubscriptionHistoryDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SubscriptionHistoryDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<SubscriptionHistoryDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f89143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f89144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f89145c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SubscriptionHistoryDestination(parcel.readString(), parcel.readString(), (b) parcel.readSerializable(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SubscriptionHistoryDestination[i];
        }
    }

    public SubscriptionHistoryDestination(String subscriptionId, String subscriptionTitle, b subscriptionCurrency, boolean z) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(subscriptionTitle, "subscriptionTitle");
        Intrinsics.checkNotNullParameter(subscriptionCurrency, "subscriptionCurrency");
        this.f89143a = subscriptionId;
        this.f89144b = subscriptionTitle;
        this.f89145c = subscriptionCurrency;
        this.d = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getF89145c() {
        return this.f89145c;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF89144b() {
        return this.f89144b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SubscriptionHistoryDestination)) {
            return false;
        }
        SubscriptionHistoryDestination subscriptionHistoryDestination = (SubscriptionHistoryDestination) obj2;
        return Intrinsics.f(this.f89143a, subscriptionHistoryDestination.f89143a) && Intrinsics.f(this.f89144b, subscriptionHistoryDestination.f89144b) && Intrinsics.f(this.f89145c, subscriptionHistoryDestination.f89145c) && this.d == subscriptionHistoryDestination.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + l.j(this.f89145c, p.a.c(this.f89143a.hashCode() * 31, 31, this.f89144b), 31);
    }

    /* JADX INFO: renamed from: t1, reason: from getter */
    public final String getF89143a() {
        return this.f89143a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f89143a);
        dest.writeString(this.f89144b);
        dest.writeSerializable(this.f89145c);
        dest.writeInt(this.d ? 1 : 0);
    }
}
