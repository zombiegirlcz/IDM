package rpc;

import jlc.t;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f256359a;

    static {
        int[] iArr = new int[t.values().length];
        try {
            iArr[t.PORTFOLIO_ALLOCATIONS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[t.PREFUNDED_PORTFOLIO_DETAILS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[t.PORTFOLIO_DETAILS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[t.PROJECTIONS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[t.TEMPLATES.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f256359a = iArr;
    }
}
