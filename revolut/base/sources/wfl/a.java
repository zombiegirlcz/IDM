package wfl;

import bfl.g;
import dfl.q0;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f297156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f297157b;

    static {
        int[] iArr = new int[g.values().length];
        try {
            iArr[g.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f297156a = iArr;
        int[] iArr2 = new int[q0.values().length];
        try {
            iArr2[q0.CREATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[q0.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[q0.COMPLETED.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[q0.DECLINED.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[q0.CANCELLED.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        f297157b = iArr2;
    }
}
