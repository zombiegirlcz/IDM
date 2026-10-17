package br9;

import ar9.p;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f17958b;

    static {
        int[] iArr = new int[p.values().length];
        try {
            iArr[p.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[p.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f17957a = iArr;
        int[] iArr2 = new int[st9.d.values().length];
        try {
            iArr2[st9.d.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[st9.d.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f17958b = iArr2;
    }
}
