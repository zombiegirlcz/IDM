package yjl;

import gkl.r1;
import jkl.n4;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f314557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f314558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f314559c;

    static {
        int[] iArr = new int[n4.d.values().length];
        try {
            iArr[n4.d.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n4.d.BUSINESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[n4.d.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f314557a = iArr;
        int[] iArr2 = new int[r1.values().length];
        try {
            iArr2[r1.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[r1.BUSINESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[r1.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f314558b = iArr2;
        int[] iArr3 = new int[vjl.p.values().length];
        try {
            iArr3[vjl.p.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[vjl.p.BUSINESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[vjl.p.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        f314559c = iArr3;
    }
}
