package d0e;

import com.revolut.feature.statements.api.models.StatementPeriodType;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f110353a;

    static {
        int[] iArr = new int[StatementPeriodType.values().length];
        try {
            iArr[StatementPeriodType.ALL_TIME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StatementPeriodType.MONTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f110353a = iArr;
    }
}
