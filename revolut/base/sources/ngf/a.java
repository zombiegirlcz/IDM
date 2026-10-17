package ngf;

import com.revolut.feature.transactions.api.navigation.d;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f215144a;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.MULTI.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.SINGLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f215144a = iArr;
    }
}
