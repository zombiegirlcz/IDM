package cob;

import ncd.h;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f25518a;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.PERSONAL_JOINT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.PERSONAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[h.PERSONAL_UNDER_18.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[h.BUSINESS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[h.YOUTH.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f25518a = iArr;
    }
}
