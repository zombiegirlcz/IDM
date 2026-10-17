package androidx.camera.camera2.impl;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"CHECK_FLASH_REQUIRED_TIMEOUT_IN_NS", "", "CHECK_3A_TIMEOUT_IN_NS", "CHECK_3A_WITH_FLASH_TIMEOUT_IN_NS", "CHECK_3A_WITH_SCREEN_FLASH_TIMEOUT_IN_NS", "camera-camera2"}, k = 2, mv = {2, 1, 0}, xi = 48)
public abstract class CapturePipelineKt {
    private static final long CHECK_3A_TIMEOUT_IN_NS;
    private static final long CHECK_3A_WITH_FLASH_TIMEOUT_IN_NS;
    private static final long CHECK_3A_WITH_SCREEN_FLASH_TIMEOUT_IN_NS;
    private static final long CHECK_FLASH_REQUIRED_TIMEOUT_IN_NS;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        CHECK_FLASH_REQUIRED_TIMEOUT_IN_NS = timeUnit.toNanos(1L);
        CHECK_3A_TIMEOUT_IN_NS = timeUnit.toNanos(1L);
        CHECK_3A_WITH_FLASH_TIMEOUT_IN_NS = timeUnit.toNanos(5L);
        CHECK_3A_WITH_SCREEN_FLASH_TIMEOUT_IN_NS = timeUnit.toNanos(2L);
    }
}
