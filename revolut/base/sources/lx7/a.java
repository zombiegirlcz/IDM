package lx7;

import nx7.e;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f200534a;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.PET_SELECTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.BASE_DETAILS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e.BREED_SELECTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[e.PET_AGE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f200534a = iArr;
    }
}
