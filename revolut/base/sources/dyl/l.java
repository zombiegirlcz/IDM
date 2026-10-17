package dyl;

import gw0.t;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f121162a;

    static {
        int[] iArr = new int[t.values().length];
        try {
            iArr[t.SINGLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[t.SINGLE_TAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[t.FIRST.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[t.MIDDLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[t.LAST.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f121162a = iArr;
    }
}
