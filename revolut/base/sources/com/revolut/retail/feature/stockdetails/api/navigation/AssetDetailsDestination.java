package com.revolut.retail.feature.stockdetails.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vqk.c;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/api/navigation/AssetDetailsDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_stock_details_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AssetDetailsDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<AssetDetailsDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f103736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f103737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f103738c;
    public final String d;
    public final StartNavigation e;
    public final eel.c f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AssetDetailsDestination(parcel.readString(), parcel.readInt() == 0 ? null : c.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readString(), (StartNavigation) parcel.readParcelable(AssetDetailsDestination.class.getClassLoader()), parcel.readInt() != 0 ? eel.c.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AssetDetailsDestination[i];
        }
    }

    public AssetDetailsDestination(String ref2, c cVar, boolean z, String str, StartNavigation startNavigation, eel.c cVar2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f103736a = ref2;
        this.f103737b = cVar;
        this.f103738c = z;
        this.d = str;
        this.e = startNavigation;
        this.f = cVar2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AssetDetailsDestination)) {
            return false;
        }
        AssetDetailsDestination assetDetailsDestination = (AssetDetailsDestination) obj2;
        return Intrinsics.f(this.f103736a, assetDetailsDestination.f103736a) && this.f103737b == assetDetailsDestination.f103737b && this.f103738c == assetDetailsDestination.f103738c && Intrinsics.f(this.d, assetDetailsDestination.d) && Intrinsics.f(this.e, assetDetailsDestination.e) && this.f == assetDetailsDestination.f;
    }

    public final int hashCode() {
        int iHashCode = this.f103736a.hashCode() * 31;
        c cVar = this.f103737b;
        int iC = j6.a.c((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31, 31, this.f103738c);
        String str = this.d;
        int iHashCode2 = (iC + (str == null ? 0 : str.hashCode())) * 31;
        StartNavigation startNavigation = this.e;
        int iHashCode3 = (iHashCode2 + (startNavigation == null ? 0 : startNavigation.hashCode())) * 31;
        eel.c cVar2 = this.f;
        return iHashCode3 + (cVar2 != null ? cVar2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f103736a);
        c cVar = this.f103737b;
        if (cVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(cVar.name());
        }
        dest.writeInt(this.f103738c ? 1 : 0);
        dest.writeString(this.d);
        dest.writeParcelable(this.e, i);
        eel.c cVar2 = this.f;
        if (cVar2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(cVar2.name());
        }
    }

    public /* synthetic */ AssetDetailsDestination(String str, c cVar, boolean z, String str2, StartNavigation startNavigation, eel.c cVar2, int i) {
        this(str, (i & 2) != 0 ? null : cVar, (i & 4) != 0 ? true : z, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : startNavigation, (i & 32) != 0 ? null : cVar2);
    }
}
