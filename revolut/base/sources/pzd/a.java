package pzd;

import com.revolut.feature.statements.api.models.ConsolidatedStatementProductType;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f240952a;

    static {
        int[] iArr = new int[ConsolidatedStatementProductType.values().length];
        try {
            iArr[ConsolidatedStatementProductType.SAVINGS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ConsolidatedStatementProductType.CRYPTO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ConsolidatedStatementProductType.COMMODITIES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ConsolidatedStatementProductType.STOCK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f240952a = iArr;
    }
}
