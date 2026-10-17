package br7;

import kl7.z1;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f17951b;

    static {
        int[] iArr = new int[f.values().length];
        try {
            iArr[f.LICENCE_FRONT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f.LICENCE_BACK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[f.GENERIC.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f17950a = iArr;
        int[] iArr2 = new int[z1.values().length];
        try {
            iArr2[z1.DRIVING_LICENCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[z1.NO_CLAIMS_STATEMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[z1.PROOF_OF_DRIVING_EXPERIENCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[z1.OTHER.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        f17951b = iArr2;
    }
}
