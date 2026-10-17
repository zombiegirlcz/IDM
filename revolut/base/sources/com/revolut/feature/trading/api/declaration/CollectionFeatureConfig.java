package com.revolut.feature.trading.api.declaration;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/api/declaration/CollectionFeatureConfig;", "Lcom/revolut/feature/trading/api/declaration/BaseDiscoveryFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_trading_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CollectionFeatureConfig extends BaseDiscoveryFeatureConfig {

    @NotNull
    public static final Parcelable.Creator<CollectionFeatureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91207a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CollectionFeatureConfig(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CollectionFeatureConfig[i];
        }
    }

    public CollectionFeatureConfig(String collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        this.f91207a = collection;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof CollectionFeatureConfig) && Intrinsics.f(this.f91207a, ((CollectionFeatureConfig) obj2).f91207a);
    }

    public final int hashCode() {
        return this.f91207a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91207a);
    }
}
