package sl;

import com.onfido.api.client.data.DocType;
import jl.j0;
import jl.q0;

/* JADX INFO: loaded from: classes17.dex */
public abstract /* synthetic */ class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f264074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f264075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f264076c;

    static {
        int[] iArr = new int[q0.values().length];
        try {
            iArr[q0.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q0.ABANDONED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[q0.FINISHED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[q0.RUNNING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f264074a = iArr;
        int[] iArr2 = new int[j0.values().length];
        try {
            iArr2[j0.OFF.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[j0.OPTIONAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[j0.ONLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        f264075b = iArr2;
        int[] iArr3 = new int[DocType.values().length];
        try {
            iArr3[DocType.PASSPORT.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[DocType.DRIVING_LICENSE.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[DocType.NATIONAL_ID_CARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[DocType.VISA.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[DocType.WORK_PERMIT.ordinal()] = 5;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[DocType.RESIDENCE_PERMIT.ordinal()] = 6;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[DocType.PASSPORT_CARD.ordinal()] = 7;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[DocType.UNKNOWN.ordinal()] = 8;
        } catch (NoSuchFieldError unused15) {
        }
        f264076c = iArr3;
    }
}
