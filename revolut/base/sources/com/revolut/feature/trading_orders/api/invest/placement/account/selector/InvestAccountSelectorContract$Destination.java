package com.revolut.feature.trading_orders.api.invest.placement.account.selector;

import android.os.Parcel;
import android.os.Parcelable;
import bfl.g;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/trading_orders/api/invest/placement/account/selector/InvestAccountSelectorContract$Destination", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvestAccountSelectorContract$Destination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<InvestAccountSelectorContract$Destination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f91705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f91707c;
    public final InvestAccountSelectorContract$Disclaimer d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            g gVarValueOf = g.valueOf(parcel.readString());
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(InvestAccountSelectorContract$Destination.class, parcel, arrayList, iE, 1);
            }
            return new InvestAccountSelectorContract$Destination(gVarValueOf, string, arrayList, (InvestAccountSelectorContract$Disclaimer) parcel.readParcelable(InvestAccountSelectorContract$Destination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvestAccountSelectorContract$Destination[i];
        }
    }

    public InvestAccountSelectorContract$Destination(g tradeSide, String defaultSelectedPocketId, List sectionsParams, InvestAccountSelectorContract$Disclaimer disclaimer) {
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(defaultSelectedPocketId, "defaultSelectedPocketId");
        Intrinsics.checkNotNullParameter(sectionsParams, "sectionsParams");
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        this.f91705a = tradeSide;
        this.f91706b = defaultSelectedPocketId;
        this.f91707c = sectionsParams;
        this.d = disclaimer;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF91706b() {
        return this.f91706b;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InvestAccountSelectorContract$Disclaimer getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getF91707c() {
        return this.f91707c;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final g getF91705a() {
        return this.f91705a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InvestAccountSelectorContract$Destination)) {
            return false;
        }
        InvestAccountSelectorContract$Destination investAccountSelectorContract$Destination = (InvestAccountSelectorContract$Destination) obj2;
        return this.f91705a == investAccountSelectorContract$Destination.f91705a && Intrinsics.f(this.f91706b, investAccountSelectorContract$Destination.f91706b) && Intrinsics.f(this.f91707c, investAccountSelectorContract$Destination.f91707c) && Intrinsics.f(this.d, investAccountSelectorContract$Destination.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(p.a.c(this.f91705a.hashCode() * 31, 31, this.f91706b), 31, this.f91707c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91705a.name());
        dest.writeString(this.f91706b);
        Iterator itV = p.a.v(this.f91707c, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeParcelable(this.d, i);
    }
}
