package t5e;

import com.revolut.feature.structured_note.details.impl.ui.screens.performance_tracker.PerformanceTrackerFlowContract$Page;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f268073a;

    static {
        int[] iArr = new int[PerformanceTrackerFlowContract$Page.values().length];
        try {
            iArr[PerformanceTrackerFlowContract$Page.UNDERLYING_ASSETS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PerformanceTrackerFlowContract$Page.TERMS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f268073a = iArr;
    }
}
