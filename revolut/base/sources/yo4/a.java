package yo4;

import ux4.f;
import ux4.g;
import ux4.h;
import xo4.r;
import xo4.s;
import xo4.t;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f315552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f315553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f315554c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;
    public static final /* synthetic */ int[] f;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.ORIGINAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.FORBEARANCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f315552a = iArr;
        int[] iArr2 = new int[g.values().length];
        try {
            iArr2[g.EXPIRED.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[g.CREATED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f315553b = iArr2;
        int[] iArr3 = new int[f.values().length];
        try {
            iArr3[f.PDF.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[f.HTML.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f315554c = iArr3;
        int[] iArr4 = new int[t.values().length];
        try {
            iArr4[t.ORIGINAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr4[t.FORBEARANCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        d = iArr4;
        int[] iArr5 = new int[s.values().length];
        try {
            iArr5[s.EXPIRED.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr5[s.CREATED.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        e = iArr5;
        int[] iArr6 = new int[r.values().length];
        try {
            iArr6[r.PDF.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr6[r.HTML.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        f = iArr6;
    }
}
