package mx4;

import dx4.y1;
import dx4.z1;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f210169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f210170b;

    static {
        int[] iArr = new int[y1.values().length];
        try {
            iArr[y1.PT16.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f210169a = iArr;
        int[] iArr2 = new int[z1.values().length];
        try {
            iArr2[z1.PLAIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[z1.FOOTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        f210170b = iArr2;
    }
}
