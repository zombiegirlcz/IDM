package y69;

import s69.l;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f311232a;

    static {
        int[] iArr = new int[l.values().length];
        try {
            iArr[l.REVOLUT_FEED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l.LEGACY_INBOX.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f311232a = iArr;
    }
}
