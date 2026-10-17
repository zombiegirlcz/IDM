package mo;

import grl.k9;
import grl.od;
import grl.q6;
import grl.w2;
import grl.x0;

/* JADX INFO: loaded from: classes17.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f207527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f207528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f207529c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;

    static {
        int[] iArr = new int[k9.values().length];
        try {
            iArr[k9.Chat.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k9.MobilePlatform.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k9.Onboarding.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[k9.Transaction.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[k9.Credit.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f207527a = iArr;
        int[] iArr2 = new int[x0.values().length];
        try {
            iArr2[x0.Chat.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[x0.MobilePlatform.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[x0.Onboarding.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[x0.POS.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[x0.Credit.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        f207528b = iArr2;
        int[] iArr3 = new int[q6.values().length];
        try {
            iArr3[q6.Chat.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[q6.MobilePlatform.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        f207529c = iArr3;
        int[] iArr4 = new int[w2.values().length];
        try {
            iArr4[w2.Chat.ordinal()] = 1;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr4[w2.MobilePlatform.ordinal()] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        d = iArr4;
        int[] iArr5 = new int[od.values().length];
        try {
            iArr5[od.MobilePlatform.ordinal()] = 1;
        } catch (NoSuchFieldError unused15) {
        }
        e = iArr5;
    }
}
