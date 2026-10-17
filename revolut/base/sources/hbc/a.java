package hbc;

import xbc.f;
import xbc.h;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f150642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f150643b;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.SCHEDULED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.DEPARTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[h.ARRIVED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[h.CANCELLED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[h.DIVERTED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f150642a = iArr;
        int[] iArr2 = new int[f.values().length];
        try {
            iArr2[f.EARLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[f.ON_TIME.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[f.LATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        f150643b = iArr2;
    }
}
