package iql;

import cjl.q;
import jkl.a3;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f167897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f167898b;

    static {
        int[] iArr = new int[q.values().length];
        try {
            iArr[q.PHONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q.EMAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[q.GOOGLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f167897a = iArr;
        int[] iArr2 = new int[a3.values().length];
        try {
            iArr2[a3.CHAT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        f167898b = iArr2;
    }
}
