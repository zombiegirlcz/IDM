package com.revolut.feature.wealth_discovery.api.declaration;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSelectedSorting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zel.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth_discovery/api/declaration/ScreenerResultDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_wealth_discovery_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ScreenerResultDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<ScreenerResultDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f96107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f96108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f96109c;
    public final ScreenerSelectedSorting d;
    public final boolean e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            f fVarValueOf = f.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(ScreenerResultDestination.class, parcel, arrayList, iE, 1);
            }
            return new ScreenerResultDestination(fVarValueOf, arrayList, parcel.readString(), (ScreenerSelectedSorting) parcel.readParcelable(ScreenerResultDestination.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ScreenerResultDestination[i];
        }
    }

    public ScreenerResultDestination(f instrumentGroup, List filters, String str, ScreenerSelectedSorting screenerSelectedSorting, boolean z) {
        Intrinsics.checkNotNullParameter(instrumentGroup, "instrumentGroup");
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f96107a = instrumentGroup;
        this.f96108b = filters;
        this.f96109c = str;
        this.d = screenerSelectedSorting;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ScreenerResultDestination)) {
            return false;
        }
        ScreenerResultDestination screenerResultDestination = (ScreenerResultDestination) obj2;
        return this.f96107a == screenerResultDestination.f96107a && Intrinsics.f(this.f96108b, screenerResultDestination.f96108b) && Intrinsics.f(this.f96109c, screenerResultDestination.f96109c) && Intrinsics.f(this.d, screenerResultDestination.d) && this.e == screenerResultDestination.e;
    }

    public final int hashCode() {
        int iD = p.a.d(this.f96107a.hashCode() * 31, 31, this.f96108b);
        String str = this.f96109c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        ScreenerSelectedSorting screenerSelectedSorting = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode + (screenerSelectedSorting != null ? screenerSelectedSorting.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f96107a.name());
        Iterator itV = p.a.v(this.f96108b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeString(this.f96109c);
        dest.writeParcelable(this.d, i);
        dest.writeInt(this.e ? 1 : 0);
    }

    public /* synthetic */ ScreenerResultDestination(f fVar, List list) {
        this(fVar, list, null, null, false);
    }
}
