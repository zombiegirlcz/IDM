package rbd;

import lcd.j;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f253023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f253024b;

    static {
        int[] iArr = new int[j.values().length];
        try {
            iArr[j.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f253023a = iArr;
        int[] iArr2 = new int[lcd.a.values().length];
        try {
            iArr2[lcd.a.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[lcd.a.PERSONAL_JOINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[lcd.a.YOUTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[lcd.a.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[lcd.a.TEEN.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        f253024b = iArr2;
    }
}
