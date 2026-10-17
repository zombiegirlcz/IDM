package yx7;

import zw7.c0;
import zw7.z;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f317585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f317586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f317587c;

    static {
        int[] iArr = new int[c0.values().length];
        try {
            iArr[c0.DOG.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c0.CAT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c0.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f317585a = iArr;
        int[] iArr2 = new int[z.values().length];
        try {
            iArr2[z.MALE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[z.FEMALE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[z.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f317586b = iArr2;
        int[] iArr3 = new int[zw7.h.values().length];
        try {
            iArr3[zw7.h.PEDIGREE.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[zw7.h.CROSS.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[zw7.h.MIXED.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[zw7.h.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        f317587c = iArr3;
    }
}
