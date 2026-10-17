package i0e;

import com.revolut.feature.statements.api.models.StatementPeriodType;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f157388a;

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
        try {
            iArr[StatementPeriodType.TAX_YEAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[StatementPeriodType.CALENDAR_YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[StatementPeriodType.LAST_FULL_YEAR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[StatementPeriodType.CUSTOM.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f157388a = iArr;
    }
}
