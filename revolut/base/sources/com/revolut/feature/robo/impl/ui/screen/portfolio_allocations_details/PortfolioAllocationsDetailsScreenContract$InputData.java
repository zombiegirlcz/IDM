package com.revolut.feature.robo.impl.ui.screen.portfolio_allocations_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.robo.impl.ui.screen.portfolio_allocations_details.PortfolioAllocationsDetailsScreenContract$InputData;
import com.revolut.feature.wealth.models.portfolio_metrics.AssetSubclassAllocation;
import com.revolut.feature.wealth.models.robo.Template;
import com.revolut.kompot.common.IOData$Input;
import dnc.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xdh.b;
import yhm.j;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/feature/robo/impl/ui/screen/portfolio_allocations_details/PortfolioAllocationsDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "dnc/f", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PortfolioAllocationsDetailsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PortfolioAllocationsDetailsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Template f85151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f85152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f85153c;
    public final f d;
    public final Lazy e;
    public final Lazy f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Lazy f85154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Lazy f85155h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Template template = (Template) j6.a.f(parcel, "parcel", PortfolioAllocationsDetailsScreenContract$InputData.class);
            b bVarValueOf = b.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(PortfolioAllocationsDetailsScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new PortfolioAllocationsDetailsScreenContract$InputData(template, bVarValueOf, arrayList, f.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PortfolioAllocationsDetailsScreenContract$InputData[i];
        }
    }

    public PortfolioAllocationsDetailsScreenContract$InputData(Template template, b rebalanceStatus, List assetAllocations, f allocationType) {
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(rebalanceStatus, "rebalanceStatus");
        Intrinsics.checkNotNullParameter(assetAllocations, "assetAllocations");
        Intrinsics.checkNotNullParameter(allocationType, "allocationType");
        this.f85151a = template;
        this.f85152b = rebalanceStatus;
        this.f85153c = assetAllocations;
        this.d = allocationType;
        final int i = 0;
        this.e = j.b(new Function0(this) { // from class: dnc.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PortfolioAllocationsDetailsScreenContract$InputData f116261b;

            {
                this.f116261b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        List<AssetSubclassAllocation> list = this.f116261b.f85153c;
                        ArrayList arrayList = new ArrayList();
                        for (AssetSubclassAllocation assetSubclassAllocation : list) {
                            AssetSubclassAllocation.Stocks stocks = assetSubclassAllocation instanceof AssetSubclassAllocation.Stocks ? (AssetSubclassAllocation.Stocks) assetSubclassAllocation : null;
                            if (stocks != null) {
                                arrayList.add(stocks);
                            }
                        }
                        return arrayList;
                    case 1:
                        List<AssetSubclassAllocation> list2 = this.f116261b.f85153c;
                        ArrayList arrayList2 = new ArrayList();
                        for (AssetSubclassAllocation assetSubclassAllocation2 : list2) {
                            AssetSubclassAllocation.Bonds bonds = assetSubclassAllocation2 instanceof AssetSubclassAllocation.Bonds ? (AssetSubclassAllocation.Bonds) assetSubclassAllocation2 : null;
                            if (bonds != null) {
                                arrayList2.add(bonds);
                            }
                        }
                        return arrayList2;
                    case 2:
                        List<AssetSubclassAllocation> list3 = this.f116261b.f85153c;
                        ArrayList arrayList3 = new ArrayList();
                        for (AssetSubclassAllocation assetSubclassAllocation3 : list3) {
                            AssetSubclassAllocation.Commodities commodities = assetSubclassAllocation3 instanceof AssetSubclassAllocation.Commodities ? (AssetSubclassAllocation.Commodities) assetSubclassAllocation3 : null;
                            if (commodities != null) {
                                arrayList3.add(commodities);
                            }
                        }
                        return arrayList3;
                    default:
                        List<AssetSubclassAllocation> list4 = this.f116261b.f85153c;
                        ArrayList arrayList4 = new ArrayList();
                        for (AssetSubclassAllocation assetSubclassAllocation4 : list4) {
                            AssetSubclassAllocation.Cash cash = assetSubclassAllocation4 instanceof AssetSubclassAllocation.Cash ? (AssetSubclassAllocation.Cash) assetSubclassAllocation4 : null;
                            if (cash != null) {
                                arrayList4.add(cash);
                            }
                        }
                        return arrayList4;
                }
            }
        });
        final int i2 = 1;
        this.f = j.b(new Function0(this) { // from class: dnc.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PortfolioAllocationsDetailsScreenContract$InputData f116261b;

            {
                this.f116261b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        List<AssetSubclassAllocation> list = this.f116261b.f85153c;
                        ArrayList arrayList = new ArrayList();
                        for (AssetSubclassAllocation assetSubclassAllocation : list) {
                            AssetSubclassAllocation.Stocks stocks = assetSubclassAllocation instanceof AssetSubclassAllocation.Stocks ? (AssetSubclassAllocation.Stocks) assetSubclassAllocation : null;
                            if (stocks != null) {
                                arrayList.add(stocks);
                            }
                        }
                        return arrayList;
                    case 1:
                        List<AssetSubclassAllocation> list2 = this.f116261b.f85153c;
                        ArrayList arrayList2 = new ArrayList();
                        for (AssetSubclassAllocation assetSubclassAllocation2 : list2) {
                            AssetSubclassAllocation.Bonds bonds = assetSubclassAllocation2 instanceof AssetSubclassAllocation.Bonds ? (AssetSubclassAllocation.Bonds) assetSubclassAllocation2 : null;
                            if (bonds != null) {
                                arrayList2.add(bonds);
                            }
                        }
                        return arrayList2;
                    case 2:
                        List<AssetSubclassAllocation> list3 = this.f116261b.f85153c;
                        ArrayList arrayList3 = new ArrayList();
                        for (AssetSubclassAllocation assetSubclassAllocation3 : list3) {
                            AssetSubclassAllocation.Commodities commodities = assetSubclassAllocation3 instanceof AssetSubclassAllocation.Commodities ? (AssetSubclassAllocation.Commodities) assetSubclassAllocation3 : null;
                            if (commodities != null) {
                                arrayList3.add(commodities);
                            }
                        }
                        return arrayList3;
                    default:
                        List<AssetSubclassAllocation> list4 = this.f116261b.f85153c;
                        ArrayList arrayList4 = new ArrayList();
                        for (AssetSubclassAllocation assetSubclassAllocation4 : list4) {
                            AssetSubclassAllocation.Cash cash = assetSubclassAllocation4 instanceof AssetSubclassAllocation.Cash ? (AssetSubclassAllocation.Cash) assetSubclassAllocation4 : null;
                            if (cash != null) {
                                arrayList4.add(cash);
                            }
                        }
                        return arrayList4;
                }
            }
        });
        final int i3 = 2;
        this.f85154g = j.b(new Function0(this) { // from class: dnc.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PortfolioAllocationsDetailsScreenContract$InputData f116261b;

            {
                this.f116261b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        List<AssetSubclassAllocation> list = this.f116261b.f85153c;
                        ArrayList arrayList = new ArrayList();
                        for (AssetSubclassAllocation assetSubclassAllocation : list) {
                            AssetSubclassAllocation.Stocks stocks = assetSubclassAllocation instanceof AssetSubclassAllocation.Stocks ? (AssetSubclassAllocation.Stocks) assetSubclassAllocation : null;
                            if (stocks != null) {
                                arrayList.add(stocks);
                            }
                        }
                        return arrayList;
                    case 1:
                        List<AssetSubclassAllocation> list2 = this.f116261b.f85153c;
                        ArrayList arrayList2 = new ArrayList();
                        for (AssetSubclassAllocation assetSubclassAllocation2 : list2) {
                            AssetSubclassAllocation.Bonds bonds = assetSubclassAllocation2 instanceof AssetSubclassAllocation.Bonds ? (AssetSubclassAllocation.Bonds) assetSubclassAllocation2 : null;
                            if (bonds != null) {
                                arrayList2.add(bonds);
                            }
                        }
                        return arrayList2;
                    case 2:
                        List<AssetSubclassAllocation> list3 = this.f116261b.f85153c;
                        ArrayList arrayList3 = new ArrayList();
                        for (AssetSubclassAllocation assetSubclassAllocation3 : list3) {
                            AssetSubclassAllocation.Commodities commodities = assetSubclassAllocation3 instanceof AssetSubclassAllocation.Commodities ? (AssetSubclassAllocation.Commodities) assetSubclassAllocation3 : null;
                            if (commodities != null) {
                                arrayList3.add(commodities);
                            }
                        }
                        return arrayList3;
                    default:
                        List<AssetSubclassAllocation> list4 = this.f116261b.f85153c;
                        ArrayList arrayList4 = new ArrayList();
                        for (AssetSubclassAllocation assetSubclassAllocation4 : list4) {
                            AssetSubclassAllocation.Cash cash = assetSubclassAllocation4 instanceof AssetSubclassAllocation.Cash ? (AssetSubclassAllocation.Cash) assetSubclassAllocation4 : null;
                            if (cash != null) {
                                arrayList4.add(cash);
                            }
                        }
                        return arrayList4;
                }
            }
        });
        final int i5 = 3;
        this.f85155h = j.b(new Function0(this) { // from class: dnc.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PortfolioAllocationsDetailsScreenContract$InputData f116261b;

            {
                this.f116261b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        List<AssetSubclassAllocation> list = this.f116261b.f85153c;
                        ArrayList arrayList = new ArrayList();
                        for (AssetSubclassAllocation assetSubclassAllocation : list) {
                            AssetSubclassAllocation.Stocks stocks = assetSubclassAllocation instanceof AssetSubclassAllocation.Stocks ? (AssetSubclassAllocation.Stocks) assetSubclassAllocation : null;
                            if (stocks != null) {
                                arrayList.add(stocks);
                            }
                        }
                        return arrayList;
                    case 1:
                        List<AssetSubclassAllocation> list2 = this.f116261b.f85153c;
                        ArrayList arrayList2 = new ArrayList();
                        for (AssetSubclassAllocation assetSubclassAllocation2 : list2) {
                            AssetSubclassAllocation.Bonds bonds = assetSubclassAllocation2 instanceof AssetSubclassAllocation.Bonds ? (AssetSubclassAllocation.Bonds) assetSubclassAllocation2 : null;
                            if (bonds != null) {
                                arrayList2.add(bonds);
                            }
                        }
                        return arrayList2;
                    case 2:
                        List<AssetSubclassAllocation> list3 = this.f116261b.f85153c;
                        ArrayList arrayList3 = new ArrayList();
                        for (AssetSubclassAllocation assetSubclassAllocation3 : list3) {
                            AssetSubclassAllocation.Commodities commodities = assetSubclassAllocation3 instanceof AssetSubclassAllocation.Commodities ? (AssetSubclassAllocation.Commodities) assetSubclassAllocation3 : null;
                            if (commodities != null) {
                                arrayList3.add(commodities);
                            }
                        }
                        return arrayList3;
                    default:
                        List<AssetSubclassAllocation> list4 = this.f116261b.f85153c;
                        ArrayList arrayList4 = new ArrayList();
                        for (AssetSubclassAllocation assetSubclassAllocation4 : list4) {
                            AssetSubclassAllocation.Cash cash = assetSubclassAllocation4 instanceof AssetSubclassAllocation.Cash ? (AssetSubclassAllocation.Cash) assetSubclassAllocation4 : null;
                            if (cash != null) {
                                arrayList4.add(cash);
                            }
                        }
                        return arrayList4;
                }
            }
        });
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PortfolioAllocationsDetailsScreenContract$InputData)) {
            return false;
        }
        PortfolioAllocationsDetailsScreenContract$InputData portfolioAllocationsDetailsScreenContract$InputData = (PortfolioAllocationsDetailsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f85151a, portfolioAllocationsDetailsScreenContract$InputData.f85151a) && this.f85152b == portfolioAllocationsDetailsScreenContract$InputData.f85152b && Intrinsics.f(this.f85153c, portfolioAllocationsDetailsScreenContract$InputData.f85153c) && this.d == portfolioAllocationsDetailsScreenContract$InputData.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d((this.f85152b.hashCode() + (this.f85151a.hashCode() * 31)) * 31, 31, this.f85153c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f85151a, i);
        dest.writeString(this.f85152b.name());
        Iterator itV = p.a.v(this.f85153c, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeString(this.d.name());
    }
}
