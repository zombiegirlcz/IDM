package sy8;

import my8.b0;
import my8.v;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f266638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f266639b;

    static {
        int[] iArr = new int[b0.values().length];
        try {
            iArr[b0.DOCUMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b0.PHOTO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b0.VIDEO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[b0.MOTION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f266638a = iArr;
        int[] iArr2 = new int[v.values().length];
        try {
            iArr2[v.REQUIRED.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[v.IF_POSSIBLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[v.DISABLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        f266639b = iArr2;
    }
}
