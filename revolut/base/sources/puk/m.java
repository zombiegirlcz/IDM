package puk;

import com.revolut.retail.feature.stockdetails.impl.ui.flows.stock_details.StockDetailsFlowControllerContract$Page;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f239944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f239945b;

    static {
        int[] iArr = new int[vqk.c.values().length];
        try {
            iArr[vqk.c.NEWS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[vqk.c.FINANCIALS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f239944a = iArr;
        int[] iArr2 = new int[StockDetailsFlowControllerContract$Page.values().length];
        try {
            iArr2[StockDetailsFlowControllerContract$Page.OVERVIEW.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[StockDetailsFlowControllerContract$Page.OPTIONS.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[StockDetailsFlowControllerContract$Page.FINANCIALS.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[StockDetailsFlowControllerContract$Page.NEWS.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[StockDetailsFlowControllerContract$Page.ORDER_BOOK.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[StockDetailsFlowControllerContract$Page.FEED.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        f239945b = iArr2;
    }
}
