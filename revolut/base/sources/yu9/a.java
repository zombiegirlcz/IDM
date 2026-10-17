package yu9;

import oq9.b0;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f316920a;

    static {
        int[] iArr = new int[b0.values().length];
        try {
            iArr[b0.MARK_AS_PAID.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b0.TRANSFER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f316920a = iArr;
    }
}
