package bp0;

import aw0.db;
import aw0.ha;
import aw0.k7;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f17528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f17529c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;

    static {
        int[] iArr = new int[k7.values().length];
        try {
            iArr[k7.NEVER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k7.ALWAYS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k7.ONLY_NEGATIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f17527a = iArr;
        int[] iArr2 = new int[ty0.b.values().length];
        try {
            iArr2[ty0.b.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ty0.b.FORCE_EVERYTHING.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ty0.b.FORCE_LINKS.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f17528b = iArr2;
        int[] iArr3 = new int[ha.values().length];
        try {
            iArr3[ha.ALLOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[ha.IGNORE.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        f17529c = iArr3;
        int[] iArr4 = new int[db.values().length];
        try {
            iArr4[db.DISPLAY1.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr4[db.DISPLAY2.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr4[db.HEADING1.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[db.HEADING2.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr4[db.HEADING3.ordinal()] = 5;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr4[db.EMPHASIS1.ordinal()] = 6;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr4[db.EMPHASIS2.ordinal()] = 7;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr4[db.EMPHASIS3.ordinal()] = 8;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr4[db.EMPHASIS4.ordinal()] = 9;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr4[db.BODY1.ordinal()] = 10;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr4[db.BODY2.ordinal()] = 11;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr4[db.BODY3.ordinal()] = 12;
        } catch (NoSuchFieldError unused20) {
        }
        d = iArr4;
        int[] iArr5 = new int[com.revolut.core.ui_kit.models.i.values().length];
        try {
            iArr5[com.revolut.core.ui_kit.models.i.SMALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr5[com.revolut.core.ui_kit.models.i.MEDIUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused22) {
        }
        e = iArr5;
    }
}
