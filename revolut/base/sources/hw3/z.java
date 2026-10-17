package hw3;

import com.revolut.feature.credit.application.plugins.api.models.illion_bankstatements.IllionFlowCallback;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f156095a;

    static {
        int[] iArr = new int[IllionFlowCallback.values().length];
        try {
            iArr[IllionFlowCallback.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[IllionFlowCallback.FAILURE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f156095a = iArr;
    }
}
