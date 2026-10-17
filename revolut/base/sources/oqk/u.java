package oqk;

import com.revolut.feature.tab.accounts.models.ProductId;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f227991a;

    static {
        int[] iArr = new int[ProductId.values().length];
        try {
            iArr[ProductId.CURRENCY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ProductId.JOINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ProductId.CREDIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ProductId.PRO.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ProductId.YOUTH.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f227991a = iArr;
    }
}
