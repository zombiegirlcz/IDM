package rif;

import gal.g;
import nif.j0;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f254580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f254581b;

    static {
        int[] iArr = new int[g.values().length];
        try {
            iArr[g.ACCEPTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.DECLINED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f254580a = iArr;
        int[] iArr2 = new int[j0.values().length];
        try {
            iArr2[j0.FULLY_EXCLUDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[j0.PARTIALLY_EXCLUDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f254581b = iArr2;
    }
}
