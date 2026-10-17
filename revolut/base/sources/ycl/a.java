package ycl;

import qdl.d;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f312633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f312634b;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.INACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d.PENDING_DEACTIVATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f312633a = iArr;
        int[] iArr2 = new int[ocl.b.values().length];
        try {
            iArr2[ocl.b.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ocl.b.INACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ocl.b.PENDING_DEACTIVATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f312634b = iArr2;
    }
}
