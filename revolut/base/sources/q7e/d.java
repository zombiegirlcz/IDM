package q7e;

import pcd.a0;
import pcd.z;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f242856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f242857b;

    static {
        int[] iArr = new int[z.values().length];
        try {
            iArr[z.ADMIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f242856a = iArr;
        int[] iArr2 = new int[a0.values().length];
        try {
            iArr2[a0.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[a0.INVITED.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[a0.LEFT.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[a0.REFUSED.ordinal()] = 4;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[a0.INACTIVE.ordinal()] = 5;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[a0.REMOVED.ordinal()] = 6;
        } catch (NoSuchFieldError unused7) {
        }
        f242857b = iArr2;
    }
}
