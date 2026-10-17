package wcl;

import hdl.f;
import jcl.d;
import kel.h;
import kel.l;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f296422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f296423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f296424c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;

    static {
        int[] iArr = new int[f.values().length];
        try {
            iArr[f.CREATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f.ACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[f.TRADED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[f.TERMINATED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[f.DECLINED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f296422a = iArr;
        int[] iArr2 = new int[l.values().length];
        try {
            iArr2[l.CREATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[l.ACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[l.TRADED.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[l.TERMINATED.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[l.DECLINED.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        f296423b = iArr2;
        int[] iArr3 = new int[hdl.c.values().length];
        try {
            iArr3[hdl.c.STOCK.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[hdl.c.CASH.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        f296424c = iArr3;
        int[] iArr4 = new int[h.values().length];
        try {
            iArr4[h.STOCK.ordinal()] = 1;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr4[h.CASH.ordinal()] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        d = iArr4;
        int[] iArr5 = new int[d.values().length];
        try {
            iArr5[d.STOCK.ordinal()] = 1;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr5[d.CASH.ordinal()] = 2;
        } catch (NoSuchFieldError unused16) {
        }
        e = iArr5;
    }
}
