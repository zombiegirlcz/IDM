package pjj;

import dej.e;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f236788a;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.UPGRADE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.DOWNGRADE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f236788a = iArr;
    }
}
