package lid;

import mid.c0;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f195479a;

    static {
        int[] iArr = new int[c0.values().length];
        try {
            iArr[c0.CAMPAIGN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c0.DEEPLINK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f195479a = iArr;
    }
}
