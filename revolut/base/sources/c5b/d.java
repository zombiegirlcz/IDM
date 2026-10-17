package c5b;

import bfl.g;
import dfl.q0;
import k1h.n;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f21546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f21547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f21548c;

    static {
        int[] iArr = new int[g.values().length];
        try {
            iArr[g.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f21546a = iArr;
        int[] iArr2 = new int[q0.values().length];
        try {
            iArr2[q0.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[q0.DECLINED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[q0.CANCELLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f21547b = iArr2;
        int[] iArr3 = new int[n.values().length];
        try {
            iArr3[n.DATETIME.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[n.ONLY_TIME.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[n.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        f21548c = iArr3;
    }
}
