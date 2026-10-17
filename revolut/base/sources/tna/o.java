package tna;

import ip0.ik0;
import ip0.sk0;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f272350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f272351b;

    static {
        int[] iArr = new int[ik0.values().length];
        try {
            iArr[ik0.DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ik0.NIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ik0.SYSTEM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f272350a = iArr;
        int[] iArr2 = new int[sk0.values().length];
        try {
            iArr2[sk0.DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[sk0.NIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[sk0.SYSTEM.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f272351b = iArr2;
    }
}
