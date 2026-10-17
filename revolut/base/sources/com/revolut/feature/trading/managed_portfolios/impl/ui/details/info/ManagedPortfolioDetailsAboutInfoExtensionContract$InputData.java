package com.revolut.feature.trading.managed_portfolios.impl.ui.details.info;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t6f.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/feature/trading/managed_portfolios/impl/ui/details/info/ManagedPortfolioDetailsAboutInfoExtensionContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "t6f/i", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ManagedPortfolioDetailsAboutInfoExtensionContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ManagedPortfolioDetailsAboutInfoExtensionContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f91320b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashSet.add(i.valueOf(parcel.readString()));
            }
            return new ManagedPortfolioDetailsAboutInfoExtensionContract$InputData(string, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ManagedPortfolioDetailsAboutInfoExtensionContract$InputData[i];
        }
    }

    public ManagedPortfolioDetailsAboutInfoExtensionContract$InputData(String templateId, Set viewBlocks) {
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        Intrinsics.checkNotNullParameter(viewBlocks, "viewBlocks");
        this.f91319a = templateId;
        this.f91320b = viewBlocks;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ManagedPortfolioDetailsAboutInfoExtensionContract$InputData)) {
            return false;
        }
        ManagedPortfolioDetailsAboutInfoExtensionContract$InputData managedPortfolioDetailsAboutInfoExtensionContract$InputData = (ManagedPortfolioDetailsAboutInfoExtensionContract$InputData) obj2;
        return Intrinsics.f(this.f91319a, managedPortfolioDetailsAboutInfoExtensionContract$InputData.f91319a) && Intrinsics.f(this.f91320b, managedPortfolioDetailsAboutInfoExtensionContract$InputData.f91320b);
    }

    public final int hashCode() {
        return this.f91320b.hashCode() + (this.f91319a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91319a);
        Iterator itV = n.v(this.f91320b, dest);
        while (itV.hasNext()) {
            dest.writeString(((i) itV.next()).name());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ManagedPortfolioDetailsAboutInfoExtensionContract$InputData(String str) {
        i[] elements = {i.INFO, i.HELP};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this(str, d.y0(elements));
    }
}
