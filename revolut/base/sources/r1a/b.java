package r1a;

import com.revolut.feature.payments.splitbill.impl.ui_new.link_context.SplitBillLinkAction;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f250937a;

    static {
        int[] iArr = new int[SplitBillLinkAction.values().length];
        try {
            iArr[SplitBillLinkAction.COPY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SplitBillLinkAction.SHARE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SplitBillLinkAction.SHOW_QR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f250937a = iArr;
    }
}
