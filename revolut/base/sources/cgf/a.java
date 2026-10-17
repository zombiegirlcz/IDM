package cgf;

import bgf.i;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f23963a;

    static {
        int[] iArr = new int[i.values().length];
        try {
            iArr[i.REMEDIATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[i.WORKFLOW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f23963a = iArr;
    }
}
