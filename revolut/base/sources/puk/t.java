package puk;

import com.revolut.retail.feature.stockdetails.impl.ui.flows.stock_details.StockDetailsFlowControllerContract$Page;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f239962a;

    static {
        int[] iArr = new int[StockDetailsFlowControllerContract$Page.values().length];
        try {
            iArr[StockDetailsFlowControllerContract$Page.OVERVIEW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StockDetailsFlowControllerContract$Page.OPTIONS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[StockDetailsFlowControllerContract$Page.FINANCIALS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[StockDetailsFlowControllerContract$Page.NEWS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[StockDetailsFlowControllerContract$Page.ORDER_BOOK.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[StockDetailsFlowControllerContract$Page.FEED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f239962a = iArr;
    }
}
