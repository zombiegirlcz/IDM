package elj;

import dej.w0;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f127508a;

    static {
        int[] iArr = new int[w0.values().length];
        try {
            iArr[w0.LINKIFY_PHONE_NUMBER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[w0.REQUEST_PAC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[w0.TRACK_PORTABILITY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f127508a = iArr;
    }
}
