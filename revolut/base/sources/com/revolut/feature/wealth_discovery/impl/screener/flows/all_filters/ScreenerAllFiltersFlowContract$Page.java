package com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/revolut/feature/wealth_discovery/impl/screener/flows/all_filters/ScreenerAllFiltersFlowContract$Page", "Lcom/revolut/kompot/navigable/vc/pager/PagerItem;", "", "Lcom/revolut/feature/wealth_discovery/impl/screener/flows/all_filters/ScreenerAllFiltersFlowContract$Page;", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "STOCKS", "ETP", "BOND", "CFD", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ScreenerAllFiltersFlowContract$Page implements PagerItem {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ScreenerAllFiltersFlowContract$Page[] $VALUES;
    public static final ScreenerAllFiltersFlowContract$Page BOND;
    public static final ScreenerAllFiltersFlowContract$Page CFD;

    @NotNull
    public static final Parcelable.Creator<ScreenerAllFiltersFlowContract$Page> CREATOR;
    public static final ScreenerAllFiltersFlowContract$Page ETP;
    public static final ScreenerAllFiltersFlowContract$Page STOCKS;

    @NotNull
    private final String id;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return ScreenerAllFiltersFlowContract$Page.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ScreenerAllFiltersFlowContract$Page[i];
        }
    }

    static {
        ScreenerAllFiltersFlowContract$Page screenerAllFiltersFlowContract$Page = new ScreenerAllFiltersFlowContract$Page("STOCKS", 0, "stocks");
        STOCKS = screenerAllFiltersFlowContract$Page;
        ScreenerAllFiltersFlowContract$Page screenerAllFiltersFlowContract$Page2 = new ScreenerAllFiltersFlowContract$Page("ETP", 1, "etp");
        ETP = screenerAllFiltersFlowContract$Page2;
        ScreenerAllFiltersFlowContract$Page screenerAllFiltersFlowContract$Page3 = new ScreenerAllFiltersFlowContract$Page("BOND", 2, "bond");
        BOND = screenerAllFiltersFlowContract$Page3;
        ScreenerAllFiltersFlowContract$Page screenerAllFiltersFlowContract$Page4 = new ScreenerAllFiltersFlowContract$Page("CFD", 3, "cfd");
        CFD = screenerAllFiltersFlowContract$Page4;
        ScreenerAllFiltersFlowContract$Page[] screenerAllFiltersFlowContract$PageArr = {screenerAllFiltersFlowContract$Page, screenerAllFiltersFlowContract$Page2, screenerAllFiltersFlowContract$Page3, screenerAllFiltersFlowContract$Page4};
        $VALUES = screenerAllFiltersFlowContract$PageArr;
        $ENTRIES = s.n(screenerAllFiltersFlowContract$PageArr);
        CREATOR = new a();
    }

    public ScreenerAllFiltersFlowContract$Page(String str, int i, String str2) {
        this.id = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static ScreenerAllFiltersFlowContract$Page valueOf(String str) {
        return (ScreenerAllFiltersFlowContract$Page) Enum.valueOf(ScreenerAllFiltersFlowContract$Page.class, str);
    }

    public static ScreenerAllFiltersFlowContract$Page[] values() {
        return (ScreenerAllFiltersFlowContract$Page[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.revolut.kompot.navigable.vc.pager.PagerItem
    public final String getId() {
        return this.id;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }
}
