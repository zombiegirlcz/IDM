package jt0;

import bw0.l;
import bw0.n;
import ip0.l0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f178267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f178268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f178269c;

    static {
        int[] iArr = new int[l0.values().length];
        try {
            iArr[l0.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l0.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f178267a = iArr;
        int[] iArr2 = new int[n.values().length];
        try {
            iArr2[n.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[n.END.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f178268b = iArr2;
        int[] iArr3 = new int[l.values().length];
        try {
            iArr3[l.LOADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[l.INFO.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[l.WARNING.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[l.ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[l.ACTION_INFO.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[l.ACTION_ERROR.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[l.ACTION_ACCENT.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
        f178269c = iArr3;
    }
}
