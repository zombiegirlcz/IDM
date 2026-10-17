package com.revolut.feature.cryptocommodity_invest.impl.ui.activities.discoverall.ui;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/cryptocommodity_invest/impl/ui/activities/discoverall/ui/CryptoCommodityDiscoverAllContract$Configuration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_cryptocommodity_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoCommodityDiscoverAllContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CryptoCommodityDiscoverAllContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zx5.a f71586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f71587c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoCommodityDiscoverAllContract$Configuration(parcel.readString(), zx5.a.valueOf(parcel.readString()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoCommodityDiscoverAllContract$Configuration[i];
        }
    }

    public CryptoCommodityDiscoverAllContract$Configuration(String flowName, zx5.a currencyMode, int i) {
        Intrinsics.checkNotNullParameter(flowName, "flowName");
        Intrinsics.checkNotNullParameter(currencyMode, "currencyMode");
        this.f71585a = flowName;
        this.f71586b = currencyMode;
        this.f71587c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoCommodityDiscoverAllContract$Configuration)) {
            return false;
        }
        CryptoCommodityDiscoverAllContract$Configuration cryptoCommodityDiscoverAllContract$Configuration = (CryptoCommodityDiscoverAllContract$Configuration) obj2;
        return Intrinsics.f(this.f71585a, cryptoCommodityDiscoverAllContract$Configuration.f71585a) && this.f71586b == cryptoCommodityDiscoverAllContract$Configuration.f71586b && this.f71587c == cryptoCommodityDiscoverAllContract$Configuration.f71587c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f71587c) + ((this.f71586b.hashCode() + (this.f71585a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71585a);
        dest.writeString(this.f71586b.name());
        dest.writeInt(this.f71587c);
    }
}
