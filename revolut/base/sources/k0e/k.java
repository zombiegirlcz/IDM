package k0e;

import com.revolut.feature.statements.api.models.StatementsFormat;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f180034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f180035b;

    static {
        int[] iArr = new int[StatementsFormat.values().length];
        try {
            iArr[StatementsFormat.PDF.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StatementsFormat.EXCEL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f180034a = iArr;
        int[] iArr2 = new int[pcd.b.values().length];
        try {
            iArr2[pcd.b.YOUTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[pcd.b.PERSONAL_UNDER_18.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[pcd.b.PERSONAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[pcd.b.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[pcd.b.PERSONAL_JOINT.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        f180035b = iArr2;
    }
}
