package kye;

import com.revolut.domain.models.topup.methods.TopupMethodType;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f190863a;

    static {
        int[] iArr = new int[TopupMethodType.values().length];
        try {
            iArr[TopupMethodType.UPI_APP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TopupMethodType.NET_BANKING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f190863a = iArr;
    }
}
