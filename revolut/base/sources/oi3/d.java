package oi3;

import pi3.s;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f225422a;

    static {
        int[] iArr = new int[s.values().length];
        try {
            iArr[s.CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[s.PLAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f225422a = iArr;
    }
}
