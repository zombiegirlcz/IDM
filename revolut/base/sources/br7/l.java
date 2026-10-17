package br7;

import kl7.z1;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17944a;

    static {
        int[] iArr = new int[z1.values().length];
        try {
            iArr[z1.DRIVING_LICENCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[z1.NO_CLAIMS_STATEMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[z1.PROOF_OF_DRIVING_EXPERIENCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[z1.OTHER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f17944a = iArr;
    }
}
