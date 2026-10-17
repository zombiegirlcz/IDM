package hom;

import j19.z0;

/* JADX INFO: loaded from: classes14.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f154354a;

    static {
        int[] iArr = new int[z0.values().length];
        try {
            iArr[z0.DARK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[z0.LIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[z0.TRANSPARENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f154354a = iArr;
    }
}
