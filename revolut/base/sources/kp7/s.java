package kp7;

import kl7.o2;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f188195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f188196b;

    static {
        int[] iArr = new int[o2.values().length];
        try {
            iArr[o2.VIDEO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[o2.IMAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f188195a = iArr;
        int[] iArr2 = new int[kl7.e.values().length];
        try {
            iArr2[kl7.e.PHONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[kl7.e.EMAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f188196b = iArr2;
    }
}
