package l40;

import v30.c0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f191990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f191991b;

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
        f191990a = iArr;
        int[] iArr2 = new int[v30.a.values().length];
        try {
            iArr2[v30.a.OFFLINE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[v30.a.OUT_OF_OFFICE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[v30.a.ONLINE.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[v30.a.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        f191991b = iArr2;
    }
}
