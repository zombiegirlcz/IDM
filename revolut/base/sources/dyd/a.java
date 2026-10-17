package dyd;

import com.revolut.feature.statements.api.models.StatementProductType;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f121091a;

    static {
        int[] iArr = new int[StatementProductType.values().length];
        try {
            iArr[StatementProductType.PERSONAL_CURRENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StatementProductType.JOINT_CURRENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[StatementProductType.PRO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f121091a = iArr;
    }
}
