package ms0;

import androidx.lifecycle.Lifecycle;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class p4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f208368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f208369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f208370c;

    static {
        int[] iArr = new int[o4.values().length];
        try {
            iArr[o4.CONTENT_VISIBLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[o4.INDICATOR_VISIBLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f208368a = iArr;
        int[] iArr2 = new int[m4.values().length];
        try {
            iArr2[m4.CONTEXTUAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[m4.WHITE_OR_BLACK_INVERTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[m4.REFLECTIVE_SURFACE.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f208369b = iArr2;
        int[] iArr3 = new int[Lifecycle.Event.values().length];
        try {
            iArr3[Lifecycle.Event.ON_RESUME.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[Lifecycle.Event.ON_CREATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[Lifecycle.Event.ON_START.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[Lifecycle.Event.ON_STOP.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[Lifecycle.Event.ON_DESTROY.ordinal()] = 6;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[Lifecycle.Event.ON_ANY.ordinal()] = 7;
        } catch (NoSuchFieldError unused12) {
        }
        f208370c = iArr3;
    }
}
