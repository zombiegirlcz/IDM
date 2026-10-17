package kz3;

import hs3.t1;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f191058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f191059b;

    static {
        int[] iArr = new int[ks3.b.values().length];
        try {
            iArr[ks3.b.EXIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ks3.b.SPOUSAL_CONSENT_PARTNER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ks3.b.SPOUSAL_CONSENT_INITIATOR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f191058a = iArr;
        int[] iArr2 = new int[t1.values().length];
        try {
            iArr2[t1.EXIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[t1.SPINNER_AND_POPUP.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f191059b = iArr2;
    }
}
