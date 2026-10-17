package com.revolut.feature.wealth_discovery.api.declaration;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zel.f;
import zel.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth_discovery/api/declaration/ScreenerTopMoversDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_wealth_discovery_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ScreenerTopMoversDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<ScreenerTopMoversDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f96110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f96111b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ScreenerTopMoversDestination(f.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : k.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ScreenerTopMoversDestination[i];
        }
    }

    public ScreenerTopMoversDestination(f assetType, k kVar) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        this.f96110a = assetType;
        this.f96111b = kVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ScreenerTopMoversDestination)) {
            return false;
        }
        ScreenerTopMoversDestination screenerTopMoversDestination = (ScreenerTopMoversDestination) obj2;
        return this.f96110a == screenerTopMoversDestination.f96110a && this.f96111b == screenerTopMoversDestination.f96111b;
    }

    public final int hashCode() {
        int iHashCode = this.f96110a.hashCode() * 31;
        k kVar = this.f96111b;
        return iHashCode + (kVar == null ? 0 : kVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f96110a.name());
        k kVar = this.f96111b;
        if (kVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(kVar.name());
        }
    }
}
