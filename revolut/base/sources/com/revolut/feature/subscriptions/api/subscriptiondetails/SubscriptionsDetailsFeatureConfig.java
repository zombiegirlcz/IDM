package com.revolut.feature.subscriptions.api.subscriptiondetails;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import f9e.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/api/subscriptiondetails/SubscriptionsDetailsFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SubscriptionsDetailsFeatureConfig implements FeatureConfig {

    @NotNull
    public static final Parcelable.Creator<SubscriptionsDetailsFeatureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f89155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f89156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f89157c;

    /* JADX INFO: loaded from: classes8.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SubscriptionsDetailsFeatureConfig(b.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SubscriptionsDetailsFeatureConfig[i];
        }
    }

    public SubscriptionsDetailsFeatureConfig(b mode, String subscriptionId, boolean z) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f89155a = subscriptionId;
        this.f89156b = z;
        this.f89157c = mode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SubscriptionsDetailsFeatureConfig)) {
            return false;
        }
        SubscriptionsDetailsFeatureConfig subscriptionsDetailsFeatureConfig = (SubscriptionsDetailsFeatureConfig) obj2;
        return Intrinsics.f(this.f89155a, subscriptionsDetailsFeatureConfig.f89155a) && this.f89156b == subscriptionsDetailsFeatureConfig.f89156b && this.f89157c == subscriptionsDetailsFeatureConfig.f89157c;
    }

    public final int hashCode() {
        return this.f89157c.hashCode() + j6.a.c(this.f89155a.hashCode() * 31, 31, this.f89156b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f89155a);
        dest.writeInt(this.f89156b ? 1 : 0);
        dest.writeString(this.f89157c.name());
    }

    public /* synthetic */ SubscriptionsDetailsFeatureConfig(String str, boolean z, b bVar, int i) {
        this((i & 4) != 0 ? b.REGULAR : bVar, str, (i & 2) != 0 ? false : z);
    }
}
