package com.revolut.retail.feature.stockdetails.impl.ui.flows.stock_details;

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
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/revolut/retail/feature/stockdetails/impl/ui/flows/stock_details/StockDetailsFlowControllerContract$Page", "Lcom/revolut/kompot/navigable/vc/pager/PagerItem;", "", "Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/stock_details/StockDetailsFlowControllerContract$Page;", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "OVERVIEW", "OPTIONS", "FINANCIALS", "NEWS", "ORDER_BOOK", "FEED", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StockDetailsFlowControllerContract$Page implements PagerItem {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ StockDetailsFlowControllerContract$Page[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<StockDetailsFlowControllerContract$Page> CREATOR;
    public static final StockDetailsFlowControllerContract$Page FEED;
    public static final StockDetailsFlowControllerContract$Page FINANCIALS;
    public static final StockDetailsFlowControllerContract$Page NEWS;
    public static final StockDetailsFlowControllerContract$Page OPTIONS;
    public static final StockDetailsFlowControllerContract$Page ORDER_BOOK;
    public static final StockDetailsFlowControllerContract$Page OVERVIEW;

    @NotNull
    private final String id;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return StockDetailsFlowControllerContract$Page.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StockDetailsFlowControllerContract$Page[i];
        }
    }

    static {
        StockDetailsFlowControllerContract$Page stockDetailsFlowControllerContract$Page = new StockDetailsFlowControllerContract$Page("OVERVIEW", 0, "overview");
        OVERVIEW = stockDetailsFlowControllerContract$Page;
        StockDetailsFlowControllerContract$Page stockDetailsFlowControllerContract$Page2 = new StockDetailsFlowControllerContract$Page("OPTIONS", 1, "options");
        OPTIONS = stockDetailsFlowControllerContract$Page2;
        StockDetailsFlowControllerContract$Page stockDetailsFlowControllerContract$Page3 = new StockDetailsFlowControllerContract$Page("FINANCIALS", 2, "financials");
        FINANCIALS = stockDetailsFlowControllerContract$Page3;
        StockDetailsFlowControllerContract$Page stockDetailsFlowControllerContract$Page4 = new StockDetailsFlowControllerContract$Page("NEWS", 3, "news");
        NEWS = stockDetailsFlowControllerContract$Page4;
        StockDetailsFlowControllerContract$Page stockDetailsFlowControllerContract$Page5 = new StockDetailsFlowControllerContract$Page("ORDER_BOOK", 4, "order_book");
        ORDER_BOOK = stockDetailsFlowControllerContract$Page5;
        StockDetailsFlowControllerContract$Page stockDetailsFlowControllerContract$Page6 = new StockDetailsFlowControllerContract$Page("FEED", 5, "feed");
        FEED = stockDetailsFlowControllerContract$Page6;
        StockDetailsFlowControllerContract$Page[] stockDetailsFlowControllerContract$PageArr = {stockDetailsFlowControllerContract$Page, stockDetailsFlowControllerContract$Page2, stockDetailsFlowControllerContract$Page3, stockDetailsFlowControllerContract$Page4, stockDetailsFlowControllerContract$Page5, stockDetailsFlowControllerContract$Page6};
        $VALUES = stockDetailsFlowControllerContract$PageArr;
        $ENTRIES = s.n(stockDetailsFlowControllerContract$PageArr);
        CREATOR = new a();
    }

    public StockDetailsFlowControllerContract$Page(String str, int i, String str2) {
        this.id = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static StockDetailsFlowControllerContract$Page valueOf(String str) {
        return (StockDetailsFlowControllerContract$Page) Enum.valueOf(StockDetailsFlowControllerContract$Page.class, str);
    }

    public static StockDetailsFlowControllerContract$Page[] values() {
        return (StockDetailsFlowControllerContract$Page[]) $VALUES.clone();
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
