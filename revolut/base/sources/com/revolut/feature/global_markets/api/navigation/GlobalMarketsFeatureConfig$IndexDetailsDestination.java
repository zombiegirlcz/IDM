package com.revolut.feature.global_markets.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/global_markets/api/navigation/GlobalMarketsFeatureConfig$IndexDetailsDestination", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_global_markets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GlobalMarketsFeatureConfig$IndexDetailsDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<GlobalMarketsFeatureConfig$IndexDetailsDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f74565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f74566b;

    /* JADX INFO: loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GlobalMarketsFeatureConfig$IndexDetailsDestination(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GlobalMarketsFeatureConfig$IndexDetailsDestination[i];
        }
    }

    public GlobalMarketsFeatureConfig$IndexDetailsDestination(String ref2, String symbol) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.f74565a = ref2;
        this.f74566b = symbol;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof GlobalMarketsFeatureConfig$IndexDetailsDestination)) {
            return false;
        }
        GlobalMarketsFeatureConfig$IndexDetailsDestination globalMarketsFeatureConfig$IndexDetailsDestination = (GlobalMarketsFeatureConfig$IndexDetailsDestination) obj2;
        return Intrinsics.f(this.f74565a, globalMarketsFeatureConfig$IndexDetailsDestination.f74565a) && Intrinsics.f(this.f74566b, globalMarketsFeatureConfig$IndexDetailsDestination.f74566b);
    }

    public final int hashCode() {
        return this.f74566b.hashCode() + (this.f74565a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f74565a);
        dest.writeString(this.f74566b);
    }
}
