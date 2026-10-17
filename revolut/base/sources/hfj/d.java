package hfj;

import dej.o3;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f151921a;

    static {
        int[] iArr = new int[o3.values().length];
        try {
            iArr[o3.PRIORITY_RANK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[o3.USAGE_RELEVANCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f151921a = iArr;
    }
}
