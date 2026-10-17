package q30;

import v30.c0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f241748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f241749b;

    static {
        int[] iArr = new int[c0.values().length];
        try {
            iArr[c0.ASSISTANT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c0.SUPPORT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c0.PRIVATE_BANKING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f241748a = iArr;
        int[] iArr2 = new int[j30.a.values().length];
        try {
            iArr2[j30.a.MANDATORY_STORIES.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[j30.a.CMS_STORIES.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[j30.a.VIDEO.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f241749b = iArr2;
    }
}
