package hve;

import com.revolut.domain.models.topup.methods.TopupMethodType;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f155823a;

    static {
        int[] iArr = new int[TopupMethodType.values().length];
        try {
            iArr[TopupMethodType.CASH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TopupMethodType.EASY_BANK_TRANSFER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f155823a = iArr;
    }
}
