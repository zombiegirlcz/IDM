package wyd;

import com.revolut.feature.statements.api.models.StatementsFormat;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f301243a;

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
        f301243a = iArr;
    }
}
