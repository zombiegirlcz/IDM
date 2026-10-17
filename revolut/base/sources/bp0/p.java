package bp0;

import aw0.ka;
import aw0.la;
import com.revolut.core.ui_kit.models.n0;
import com.revolut.core.ui_kit.models.q0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f17508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f17509c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[ka.values().length];
        try {
            iArr[ka.FULL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ka.SHORT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ka.CHAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f17507a = iArr;
        int[] iArr2 = new int[n0.values().length];
        try {
            iArr2[n0.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[n0.HIDE_CURRENT_YEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f17508b = iArr2;
        int[] iArr3 = new int[la.values().length];
        try {
            iArr3[la.SHORT.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[la.FULL.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        f17509c = iArr3;
        int[] iArr4 = new int[q0.values().length];
        try {
            iArr4[q0.DATETIME.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr4[q0.ONLY_DATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr4[q0.ONLY_DATE_FULL_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr4[q0.ONLY_TIME.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[q0.DATETIME_WITH_SECONDS.ordinal()] = 5;
        } catch (NoSuchFieldError unused12) {
        }
        d = iArr4;
    }
}
