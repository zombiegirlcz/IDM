package q5a;

import g3a.h;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f242334a;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.GO_TO_SEND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[h.GO_TO_REQUEST.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[h.GO_TO_SCHEDULE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f242334a = iArr;
    }
}
