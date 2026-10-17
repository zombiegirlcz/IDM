package pnf;

import com.revolut.core.ui_kit.dialogs.AlertDialogDisplayer$Button;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f237752a;

    static {
        int[] iArr = new int[AlertDialogDisplayer$Button.values().length];
        try {
            iArr[AlertDialogDisplayer$Button.POSITIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AlertDialogDisplayer$Button.NEGATIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f237752a = iArr;
    }
}
