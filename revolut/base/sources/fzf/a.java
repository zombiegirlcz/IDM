package fzf;

import u0g.g;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f139193a;

    static {
        int[] iArr = new int[g.values().length];
        try {
            iArr[g.DESTINATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.ATTRACTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g.EXPERIENCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f139193a = iArr;
    }
}
