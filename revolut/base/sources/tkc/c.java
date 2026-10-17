package tkc;

import com.revolut.feature.rfi_tool.impl.domain.model.EndDialogType;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f271934a;

    static {
        int[] iArr = new int[EndDialogType.values().length];
        try {
            iArr[EndDialogType.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EndDialogType.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EndDialogType.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f271934a = iArr;
    }
}
