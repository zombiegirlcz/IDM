package com.revolut.feature.subscriptions.impl.subscriptiondetails;

import android.os.Parcel;
import android.os.Parcelable;
import f9e.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/subscriptions/impl/subscriptiondetails/SubscriptionDetailsScreenContract$Configuration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SubscriptionDetailsScreenContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SubscriptionDetailsScreenContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f89239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f89240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f89241c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SubscriptionDetailsScreenContract$Configuration(b.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SubscriptionDetailsScreenContract$Configuration[i];
        }
    }

    public SubscriptionDetailsScreenContract$Configuration(b mode, String subscriptionId, boolean z) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f89239a = subscriptionId;
        this.f89240b = mode;
        this.f89241c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SubscriptionDetailsScreenContract$Configuration)) {
            return false;
        }
        SubscriptionDetailsScreenContract$Configuration subscriptionDetailsScreenContract$Configuration = (SubscriptionDetailsScreenContract$Configuration) obj2;
        return Intrinsics.f(this.f89239a, subscriptionDetailsScreenContract$Configuration.f89239a) && this.f89240b == subscriptionDetailsScreenContract$Configuration.f89240b && this.f89241c == subscriptionDetailsScreenContract$Configuration.f89241c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f89241c) + ((this.f89240b.hashCode() + (this.f89239a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f89239a);
        dest.writeString(this.f89240b.name());
        dest.writeInt(this.f89241c ? 1 : 0);
    }
}
