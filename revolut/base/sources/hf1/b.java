package hf1;

import com.revolut.feature.acquiring.lite_pos.api.model.LitePosReceiptState;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f151738a;

    static {
        int[] iArr = new int[LitePosReceiptState.values().length];
        try {
            iArr[LitePosReceiptState.APPROVED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LitePosReceiptState.FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LitePosReceiptState.DECLINED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f151738a = iArr;
    }
}
