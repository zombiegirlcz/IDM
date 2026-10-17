package com.revolut.trading.orders.ui.invest.placement.account.selector.screen;

import android.os.Parcel;
import android.os.Parcelable;
import bfl.g;
import com.revolut.feature.trading_orders.api.invest.placement.account.selector.InvestAccountSelectorContract$Disclaimer;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/trading/orders/ui/invest/placement/account/selector/screen/InvestAccountSelectorScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvestAccountSelectorScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<InvestAccountSelectorScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f106830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f106831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f106832c;
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
                iE = j6.a.e(InvestAccountSelectorScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new InvestAccountSelectorScreenContract$InputData(gVarValueOf, string, arrayList, (InvestAccountSelectorContract$Disclaimer) parcel.readParcelable(InvestAccountSelectorScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvestAccountSelectorScreenContract$InputData[i];
        }
    }

    public InvestAccountSelectorScreenContract$InputData(g tradeSide, String defaultSelectedPocketId, List sectionsParams, InvestAccountSelectorContract$Disclaimer disclaimer) {
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(defaultSelectedPocketId, "defaultSelectedPocketId");
        Intrinsics.checkNotNullParameter(sectionsParams, "sectionsParams");
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        this.f106830a = tradeSide;
        this.f106831b = defaultSelectedPocketId;
        this.f106832c = sectionsParams;
        this.d = disclaimer;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InvestAccountSelectorScreenContract$InputData)) {
            return false;
        }
        InvestAccountSelectorScreenContract$InputData investAccountSelectorScreenContract$InputData = (InvestAccountSelectorScreenContract$InputData) obj2;
        return this.f106830a == investAccountSelectorScreenContract$InputData.f106830a && Intrinsics.f(this.f106831b, investAccountSelectorScreenContract$InputData.f106831b) && Intrinsics.f(this.f106832c, investAccountSelectorScreenContract$InputData.f106832c) && Intrinsics.f(this.d, investAccountSelectorScreenContract$InputData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(p.a.c(this.f106830a.hashCode() * 31, 31, this.f106831b), 31, this.f106832c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f106830a.name());
        dest.writeString(this.f106831b);
        Iterator itV = p.a.v(this.f106832c, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeParcelable(this.d, i);
    }
}
