package ojh;

import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import xzg.q0;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f225776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f225777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f225778c;

    static {
        int[] iArr = new int[q0.values().length];
        try {
            iArr[q0.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q0.PERSONAL_JOINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f225776a = iArr;
        int[] iArr2 = new int[WealthAccountType.values().length];
        try {
            iArr2[WealthAccountType.SECURITIES.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        f225777b = iArr2;
        int[] iArr3 = new int[hel.b.values().length];
        try {
            iArr3[hel.b.GB.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr3[hel.b.EEA.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[hel.b.US.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[hel.b.SG.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[hel.b.MX.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[hel.b.BR.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[hel.b.AU.ordinal()] = 7;
        } catch (NoSuchFieldError unused10) {
        }
        f225778c = iArr3;
    }
}
